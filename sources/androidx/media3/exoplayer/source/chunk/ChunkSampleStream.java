package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {
    private static final String TAG = "ChunkSampleStream";
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> callback;
    private boolean canReportInitialDiscontinuity;

    @Nullable
    private BaseMediaChunk canceledMediaChunk;
    private final BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final SampleQueue[] embeddedSampleQueues;
    private final Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private boolean hasInitialDiscontinuity;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;

    @Nullable
    private Chunk loadingChunk;
    boolean loadingFinished;
    private final ArrayList<BaseMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private Format primaryDownstreamTrackFormat;
    private final SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final List<BaseMediaChunk> readOnlyMediaChunks;

    @Nullable
    private ReleaseCallback<T> releaseCallback;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i11, @Nullable int[] iArr, @Nullable Format[] formatArr, T t11, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j11, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, boolean z11, @Nullable ReleasableExecutor releasableExecutor) {
        this.primaryTrackType = i11;
        int i12 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr == null ? new Format[0] : formatArr;
        this.chunkSource = t11;
        this.callback = callback;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.canReportInitialDiscontinuity = z11;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.nextChunkHolder = new ChunkHolder();
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i13 = length + 1;
        int[] iArr2 = new int[i13];
        SampleQueue[] sampleQueueArr = new SampleQueue[i13];
        SampleQueue createWithDrm = SampleQueue.createWithDrm(allocator, drmSessionManager, eventDispatcher);
        this.primarySampleQueue = createWithDrm;
        iArr2[0] = i11;
        sampleQueueArr[0] = createWithDrm;
        while (i12 < length) {
            SampleQueue createWithoutDrm = SampleQueue.createWithoutDrm(allocator);
            this.embeddedSampleQueues[i12] = createWithoutDrm;
            int i14 = i12 + 1;
            sampleQueueArr[i14] = createWithoutDrm;
            iArr2[i14] = this.embeddedTrackTypes[i12];
            i12 = i14;
        }
        this.chunkOutput = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j11;
        this.lastSeekPositionUs = j11;
    }

    private void discardDownstreamMediaChunks(int i11) {
        int min = Math.min(primarySampleIndexToMediaChunkIndex(i11, 0), this.nextNotifyPrimaryFormatMediaChunkIndex);
        if (min > 0) {
            Util.removeRange(this.mediaChunks, 0, min);
            this.nextNotifyPrimaryFormatMediaChunkIndex -= min;
        }
    }

    private void discardUpstream(int i11) {
        Assertions.checkState(!this.loader.isLoading());
        int size = this.mediaChunks.size();
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (!haveReadFromMediaChunk(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = getLastMediaChunk().endTimeUs;
        BaseMediaChunk discardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i11);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, discardUpstreamMediaChunksFromIndex.startTimeUs, j11);
    }

    private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i11) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i11);
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i11, arrayList.size());
        this.nextNotifyPrimaryFormatMediaChunkIndex = Math.max(this.nextNotifyPrimaryFormatMediaChunkIndex, this.mediaChunks.size());
        int i12 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i12 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i12];
            i12++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i12));
        }
    }

    private BaseMediaChunk getLastMediaChunk() {
        return this.mediaChunks.get(r0.size() - 1);
    }

    private boolean haveReadFromMediaChunk(int i11) {
        int readIndex;
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i11);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i12 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i12 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i12].getReadIndex();
            i12++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i12));
        return true;
    }

    private boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof BaseMediaChunk;
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int primarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), this.nextNotifyPrimaryFormatMediaChunkIndex - 1);
        while (true) {
            int i11 = this.nextNotifyPrimaryFormatMediaChunkIndex;
            if (i11 > primarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.nextNotifyPrimaryFormatMediaChunkIndex = i11 + 1;
            maybeNotifyPrimaryTrackFormatChanged(i11);
        }
    }

    private int primarySampleIndexToMediaChunkIndex(int i11, int i12) {
        do {
            i12++;
            if (i12 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i12).getFirstSampleIndex(0) <= i11);
        return i12 - 1;
    }

    private void resetSampleQueues() {
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
    }

    public boolean consumeInitialDiscontinuity() {
        try {
            return this.hasInitialDiscontinuity;
        } finally {
            this.hasInitialDiscontinuity = false;
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        List<BaseMediaChunk> list;
        long j11;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        boolean isPendingReset = isPendingReset();
        if (isPendingReset) {
            list = Collections.EMPTY_LIST;
            j11 = this.pendingResetPositionUs;
        } else {
            list = this.readOnlyMediaChunks;
            j11 = getLastMediaChunk().endTimeUs;
        }
        this.chunkSource.getNextChunk(loadingInfo, j11, list, this.nextChunkHolder);
        ChunkHolder chunkHolder = this.nextChunkHolder;
        boolean z11 = chunkHolder.endOfStream;
        Chunk chunk = chunkHolder.chunk;
        chunkHolder.clear();
        if (z11) {
            this.pendingResetPositionUs = C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.loadingChunk = chunk;
        if (isMediaChunk(chunk)) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (isPendingReset) {
                long j12 = baseMediaChunk.startTimeUs;
                long j13 = this.pendingResetPositionUs;
                if (j12 < j13) {
                    this.primarySampleQueue.setStartTimeUs(j13);
                    for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
                        sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
                    }
                    if (this.canReportInitialDiscontinuity) {
                        Format format = baseMediaChunk.trackFormat;
                        this.hasInitialDiscontinuity = !MimeTypes.allSamplesAreSyncSamples(format.sampleMimeType, format.codecs);
                    }
                }
                this.canReportInitialDiscontinuity = false;
                this.pendingResetPositionUs = C.TIME_UNSET;
            }
            baseMediaChunk.init(this.chunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        } else if (chunk instanceof InitializationChunk) {
            ((InitializationChunk) chunk).init(this.chunkOutput);
        }
        this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type));
        return true;
    }

    public void discardBuffer(long j11, boolean z11) {
        if (isPendingReset()) {
            return;
        }
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j11, z11, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i11 = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i11 >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i11].discardTo(firstTimestampUs, z11, this.embeddedTracksSelected[i11]);
                i11++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    public void discardUpstreamSamplesForClippedDuration(long j11) {
        Assertions.checkState(!this.loader.isLoading());
        if (isPendingReset() || j11 == C.TIME_UNSET || this.mediaChunks.isEmpty()) {
            return;
        }
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        long j12 = lastMediaChunk.clippedEndTimeUs;
        if (j12 == C.TIME_UNSET) {
            j12 = lastMediaChunk.endTimeUs;
        }
        if (j12 <= j11) {
            return;
        }
        long largestQueuedTimestampUs = this.primarySampleQueue.getLargestQueuedTimestampUs();
        if (largestQueuedTimestampUs <= j11) {
            return;
        }
        this.primarySampleQueue.discardUpstreamFrom(j11);
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.discardUpstreamFrom(j11);
        }
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, j11, largestQueuedTimestampUs);
    }

    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j11, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long j11 = this.lastSeekPositionUs;
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                lastMediaChunk = this.mediaChunks.get(r2.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            j11 = Math.max(j11, lastMediaChunk.endTimeUs);
        }
        return Math.max(j11, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.chunkSource;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return !isPendingReset() && this.primarySampleQueue.isReady(this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.primarySampleQueue.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.release();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.release();
        }
        this.chunkSource.release();
        ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (isPendingReset()) {
            return -3;
        }
        BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.primarySampleQueue.read(formatHolder, decoderInputBuffer, i11, this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (!this.loader.isLoading()) {
            int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j11, this.readOnlyMediaChunks);
            if (preferredQueueSize < this.mediaChunks.size()) {
                discardUpstream(preferredQueueSize);
                return;
            }
            return;
        }
        Chunk chunk = (Chunk) Assertions.checkNotNull(this.loadingChunk);
        if (!(isMediaChunk(chunk) && haveReadFromMediaChunk(this.mediaChunks.size() - 1)) && this.chunkSource.shouldCancelLoad(j11, chunk, this.readOnlyMediaChunks)) {
            this.loader.cancelLoading();
            if (isMediaChunk(chunk)) {
                this.canceledMediaChunk = (BaseMediaChunk) chunk;
            }
        }
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j11) {
        BaseMediaChunk baseMediaChunk;
        this.lastSeekPositionUs = j11;
        int i11 = 0;
        this.canReportInitialDiscontinuity = false;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j11;
            return;
        }
        for (int i12 = 0; i12 < this.mediaChunks.size(); i12++) {
            baseMediaChunk = this.mediaChunks.get(i12);
            long j12 = baseMediaChunk.startTimeUs;
            if (j12 == j11 && baseMediaChunk.clippedStartTimeUs == C.TIME_UNSET) {
                break;
            } else {
                if (j12 > j11) {
                    break;
                }
            }
        }
        baseMediaChunk = null;
        if (baseMediaChunk != null ? this.primarySampleQueue.seekTo(baseMediaChunk.getFirstSampleIndex(0)) : this.primarySampleQueue.seekTo(j11, j11 < getNextLoadPositionUs())) {
            this.nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), 0);
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            int length = sampleQueueArr.length;
            while (i11 < length) {
                sampleQueueArr[i11].seekTo(j11, true);
                i11++;
            }
            return;
        }
        this.pendingResetPositionUs = j11;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        this.nextNotifyPrimaryFormatMediaChunkIndex = 0;
        if (!this.loader.isLoading()) {
            this.loader.clearFatalError();
            resetSampleQueues();
            return;
        }
        this.primarySampleQueue.discardToEnd();
        SampleQueue[] sampleQueueArr2 = this.embeddedSampleQueues;
        int length2 = sampleQueueArr2.length;
        while (i11 < length2) {
            sampleQueueArr2[i11].discardToEnd();
            i11++;
        }
        this.loader.cancelLoading();
    }

    public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j11, int i11) {
        for (int i12 = 0; i12 < this.embeddedSampleQueues.length; i12++) {
            if (this.embeddedTrackTypes[i12] == i11) {
                Assertions.checkState(!this.embeddedTracksSelected[i12]);
                this.embeddedTracksSelected[i12] = true;
                this.embeddedSampleQueues[i12].seekTo(j11, true);
                return new EmbeddedSampleStream(this, this.embeddedSampleQueues[i12], i12);
            }
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j11) {
        if (isPendingReset()) {
            return 0;
        }
        int skipCount = this.primarySampleQueue.getSkipCount(j11, this.loadingFinished);
        BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null) {
            skipCount = Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.primarySampleQueue.getReadIndex());
        }
        this.primarySampleQueue.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j11, long j12, boolean z11) {
        this.loadingChunk = null;
        this.canceledMediaChunk = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z11) {
            return;
        }
        if (isPendingReset()) {
            resetSampleQueues();
        } else if (isMediaChunk(chunk)) {
            discardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1);
            if (this.mediaChunks.isEmpty()) {
                this.pendingResetPositionUs = this.lastSeekPositionUs;
            }
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j11, long j12) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        this.callback.onContinueLoadingRequested(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.chunk.Chunk r30, long r31, long r33, java.io.IOException r35, int r36) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.chunk.ChunkSampleStream.onLoadError(androidx.media3.exoplayer.source.chunk.Chunk, long, long, java.io.IOException, int):androidx.media3.exoplayer.upstream.Loader$LoadErrorAction");
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(Chunk chunk, long j11, long j12, int i11) {
        this.mediaSourceEventDispatcher.loadStarted(i11 == 0 ? new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, j11) : new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded()), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, i11);
    }

    public void release(@Nullable ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.preRelease();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.preRelease();
        }
        this.loader.release(this);
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i11) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i11);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.mediaSourceEventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class EmbeddedSampleStream implements SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final ChunkSampleStream<T> parent;
        private final SampleQueue sampleQueue;

        public EmbeddedSampleStream(ChunkSampleStream<T> chunkSampleStream, SampleQueue sampleQueue, int i11) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i11;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            ChunkSampleStream.this.mediaSourceEventDispatcher.downstreamFormatChanged(ChunkSampleStream.this.embeddedTrackTypes[this.index], ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, ChunkSampleStream.this.lastSeekPositionUs);
            this.notifiedDownstreamFormat = true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ChunkSampleStream.this.isPendingReset() && this.sampleQueue.isReady(ChunkSampleStream.this.loadingFinished);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            if (ChunkSampleStream.this.canceledMediaChunk != null && ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) <= this.sampleQueue.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i11, ChunkSampleStream.this.loadingFinished);
        }

        public void release() {
            Assertions.checkState(ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            if (ChunkSampleStream.this.isPendingReset()) {
                return 0;
            }
            int skipCount = this.sampleQueue.getSkipCount(j11, ChunkSampleStream.this.loadingFinished);
            if (ChunkSampleStream.this.canceledMediaChunk != null) {
                skipCount = Math.min(skipCount, ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) - this.sampleQueue.getReadIndex());
            }
            this.sampleQueue.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }
    }
}
