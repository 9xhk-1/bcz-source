package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.IcyDataSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final String TAG = "ProgressiveMediaPeriod";
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;

    @Nullable
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;

    @Nullable
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private boolean pendingInitialDiscontinuity;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;

    @Nullable
    private final Format singleTrackFormat;
    private final int singleTrackId;
    private TrackState trackState;
    private final Uri uri;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final Format ICY_FORMAT = new Format.Builder().setId("icy").setSampleMimeType(MimeTypes.APPLICATION_ICY).build();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private final ExtractorOutput extractorOutput;

        @Nullable
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = LoadEventInfo.getNewId();
        private DataSpec dataSpec = buildDataSpec(0);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        private DataSpec buildDataSpec(long j11) {
            return new DataSpec.Builder().setUri(this.uri).setPosition(j11).setKey(ProgressiveMediaPeriod.this.customCacheKey).setFlags(6).setHttpRequestHeaders(ProgressiveMediaPeriod.ICY_METADATA_HEADERS).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j11, long j12) {
            this.positionHolder.position = j11;
            this.seekTimeUs = j12;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            int i11 = 0;
            while (i11 == 0 && !this.loadCanceled) {
                try {
                    long j11 = this.positionHolder.position;
                    DataSpec buildDataSpec = buildDataSpec(j11);
                    this.dataSpec = buildDataSpec;
                    long open = this.dataSource.open(buildDataSpec);
                    if (this.loadCanceled) {
                        if (i11 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                            this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                        }
                        DataSourceUtil.closeQuietly(this.dataSource);
                        return;
                    }
                    if (open != -1) {
                        open += j11;
                        ProgressiveMediaPeriod.this.onLengthKnown();
                    }
                    long j12 = open;
                    ProgressiveMediaPeriod.this.icyHeaders = IcyHeaders.parse(this.dataSource.getResponseHeaders());
                    DataReader dataReader = this.dataSource;
                    if (ProgressiveMediaPeriod.this.icyHeaders != null && ProgressiveMediaPeriod.this.icyHeaders.metadataInterval != -1) {
                        dataReader = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.this.icyHeaders.metadataInterval, this);
                        TrackOutput icyTrack = ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = icyTrack;
                        icyTrack.format(ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    this.progressiveMediaExtractor.init(dataReader, this.uri, this.dataSource.getResponseHeaders(), j11, j12, this.extractorOutput);
                    if (ProgressiveMediaPeriod.this.icyHeaders != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(j11, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (i11 == 0 && !this.loadCanceled) {
                        try {
                            this.loadCondition.block();
                            i11 = this.progressiveMediaExtractor.read(this.positionHolder);
                            long currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                            if (currentInputPosition > ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j11) {
                                this.loadCondition.close();
                                ProgressiveMediaPeriod.this.handler.post(ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                                j11 = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                } catch (Throwable th2) {
                    if (i11 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long max = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            int bytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, bytesLeft);
            trackOutput.sampleMetadata(max, 1, bytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onSourceInfoRefreshed(long j11, SeekMap seekMap, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i11) {
            this.track = i11;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            return ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i11);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            return ProgressiveMediaPeriod.this.skipData(this.track, j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TrackId {

        /* renamed from: id, reason: collision with root package name */
        public final int f5028id;
        public final boolean isIcyTrack;

        public TrackId(int i11, boolean z11) {
            this.f5028id = i11;
            this.isIcyTrack = z11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TrackId.class == obj.getClass()) {
                TrackId trackId = (TrackId) obj;
                if (this.f5028id == trackId.f5028id && this.isIcyTrack == trackId.isIcyTrack) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f5028id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i11 = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i11];
            this.trackNotifiedDownstreamFormats = new boolean[i11];
        }
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, @Nullable String str, int i11, int i12, @Nullable Format format, long j11, @Nullable ReleasableExecutor releasableExecutor) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i11;
        this.singleTrackId = i12;
        this.singleTrackFormat = format;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j11;
        this.loadCondition = new ConditionVariable();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.c0
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.this.maybeFinishPrepare();
            }
        };
        this.onContinueLoadingRequestedRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.d0
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.c(ProgressiveMediaPeriod.this);
            }
        };
        this.handler = Util.createHandlerForCurrentLooper();
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.pendingResetPositionUs = C.TIME_UNSET;
        this.dataType = 1;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
        Assertions.checkState(this.prepared);
        Assertions.checkNotNull(this.trackState);
        Assertions.checkNotNull(this.seekMap);
    }

    public static /* synthetic */ void c(ProgressiveMediaPeriod progressiveMediaPeriod) {
        if (progressiveMediaPeriod.released) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(progressiveMediaPeriod.callback)).onContinueLoadingRequested(progressiveMediaPeriod);
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i11) {
        SeekMap seekMap;
        if (this.isLengthKnown || !((seekMap = this.seekMap) == null || seekMap.getDurationUs() == C.TIME_UNSET)) {
            this.extractedSamplesCountAtStartOfLoad = i11;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int getExtractedSamplesCount() {
        int i11 = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            i11 += sampleQueue.getWriteIndex();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z11) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = 0; i11 < this.sampleQueues.length; i11++) {
            if (z11 || ((TrackState) Assertions.checkNotNull(this.trackState)).trackEnabledStates[i11]) {
                j11 = Math.max(j11, this.sampleQueues[i11].getLargestQueuedTimestampUs());
            }
        }
        return j11;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            Format format = (Format) Assertions.checkNotNull(this.sampleQueues[i11].getUpstreamFormat());
            String str = format.sampleMimeType;
            boolean isAudio = MimeTypes.isAudio(str);
            boolean z11 = isAudio || MimeTypes.isVideo(str);
            zArr[i11] = z11;
            this.haveAudioVideoTracks = z11 | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != C.TIME_UNSET && length == 1 && MimeTypes.isImage(str);
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (isAudio || this.sampleQueueTrackIds[i11].isIcyTrack) {
                    Metadata metadata = format.metadata;
                    format = format.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (isAudio && format.averageBitrate == -1 && format.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    format = format.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            Format copyWithCryptoType = format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format));
            trackGroupArr[i11] = new TrackGroup(Integer.toString(i11), copyWithCryptoType);
            this.pendingInitialDiscontinuity = copyWithCryptoType.hasPrerollSamples | this.pendingInitialDiscontinuity;
        }
        this.trackState = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        if (this.isSingleSample && this.durationUs == C.TIME_UNSET) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new ForwardingSeekMap(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public long getDurationUs() {
                    return ProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap, this.isLive);
        this.prepared = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i11) {
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (zArr[i11]) {
            return;
        }
        Format format = trackState.tracks.get(i11).getFormat(0);
        this.mediaSourceEventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
        zArr[i11] = true;
    }

    private void maybeStartDeferredRetry(int i11) {
        assertPrepared();
        if (this.pendingDeferredRetry) {
            if (!this.haveAudioVideoTracks || this.trackState.trackIsAudioVideoFlags[i11]) {
                if (this.sampleQueues[i11].isReady(false)) {
                    return;
                }
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (SampleQueue sampleQueue : this.sampleQueues) {
                    sampleQueue.reset();
                }
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.b0
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.this.isLengthKnown = true;
            }
        });
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (trackId.equals(this.sampleQueueTrackIds[i11])) {
                return this.sampleQueues[i11];
            }
        }
        if (this.sampleQueuesBuilt) {
            Log.w(TAG, "Extractor added new track (id=" + trackId.f5028id + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        SampleQueue createWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        createWithDrm.setUpstreamFormatChangeListener(this);
        int i12 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i12);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (TrackId[]) Util.castNonNullTypeArray(trackIdArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i12);
        sampleQueueArr[length] = createWithDrm;
        this.sampleQueues = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        return createWithDrm;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j11, boolean z11) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            SampleQueue sampleQueue = this.sampleQueues[i11];
            if (sampleQueue.getReadIndex() != 0 || !z11) {
                if (!(this.isSingleSample ? sampleQueue.seekTo(sampleQueue.getFirstIndex()) : sampleQueue.seekTo(j11, false)) && (zArr[i11] || !this.haveAudioVideoTracks)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeekMap(SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new SeekMap.Unseekable(C.TIME_UNSET);
        this.durationUs = seekMap.getDurationUs();
        boolean z11 = !this.isLengthKnown && seekMap.getDurationUs() == C.TIME_UNSET;
        this.isLive = z11;
        this.dataType = z11 ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap, z11);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            Assertions.checkState(isPendingReset());
            long j11 = this.durationUs;
            if (j11 != C.TIME_UNSET && this.pendingResetPositionUs > j11) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = C.TIME_UNSET;
                return;
            }
            extractingLoadable.setLoadPosition(((SeekMap) Assertions.checkNotNull(this.seekMap)).getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = C.TIME_UNSET;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if ((this.prepared || this.singleTrackFormat != null) && this.enabledTrackCount == 0) {
            return false;
        }
        boolean open = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.sampleQueues[i11].discardTo(j11, z11, zArr[i11]);
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j11);
        return seekParameters.resolveSeekPositionUs(j11, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j11;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            j11 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                TrackState trackState = this.trackState;
                if (trackState.trackIsAudioVideoFlags[i11] && trackState.trackEnabledStates[i11] && !this.sampleQueues[i11].isLastSampleQueued()) {
                    j11 = Math.min(j11, this.sampleQueues[i11].getLargestQueuedTimestampUs());
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = getLargestQueuedTimestampUs(false);
        }
        return j11 == Long.MIN_VALUE ? this.lastSeekPositionUs : j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    public TrackOutput icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading() && this.loadCondition.isOpen();
    }

    public boolean isReady(int i11) {
        return !suppressRead() && this.sampleQueues[i11].isReady(this.loadingFinished);
    }

    public void maybeThrowError(int i11) throws IOException {
        this.sampleQueues[i11].maybeThrowError();
        maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        if (this.singleTrackFormat == null) {
            this.loadCondition.open();
            startLoading();
        } else {
            track(this.singleTrackId, 3).format(this.singleTrackFormat);
            setSeekMap(new IndexSeekMap(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.pendingResetPositionUs = j11;
        }
    }

    public int readData(int i11, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i11);
        int read = this.sampleQueues[i11].read(formatHolder, decoderInputBuffer, i12, this.loadingFinished);
        if (read == -3) {
            maybeStartDeferredRetry(i11);
        }
        return read;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
            return this.lastSeekPositionUs;
        }
        if (!this.notifyDiscontinuity) {
            return C.TIME_UNSET;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return C.TIME_UNSET;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.e0
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.this.setSeekMap(seekMap);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j11 = 0;
        }
        int i11 = 0;
        this.notifyDiscontinuity = false;
        boolean z11 = this.lastSeekPositionUs == j11;
        this.lastSeekPositionUs = j11;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j11;
            return j11;
        }
        if (this.dataType == 7 || ((!this.loadingFinished && !this.loader.isLoading()) || !seekInsideBufferUs(zArr, j11, z11))) {
            this.pendingDeferredRetry = false;
            this.pendingResetPositionUs = j11;
            this.loadingFinished = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i11 < length) {
                    sampleQueueArr[i11].discardToEnd();
                    i11++;
                }
                this.loader.cancelLoading();
                return j11;
            }
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i11 < length2) {
                sampleQueueArr2[i11].reset();
                i11++;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        ExoTrackSelection exoTrackSelection;
        assertPrepared();
        TrackState trackState = this.trackState;
        TrackGroupArray trackGroupArray = trackState.tracks;
        boolean[] zArr3 = trackState.trackEnabledStates;
        int i11 = this.enabledTrackCount;
        int i12 = 0;
        for (int i13 = 0; i13 < exoTrackSelectionArr.length; i13++) {
            SampleStream sampleStream = sampleStreamArr[i13];
            if (sampleStream != null && (exoTrackSelectionArr[i13] == null || !zArr[i13])) {
                int i14 = ((SampleStreamImpl) sampleStream).track;
                Assertions.checkState(zArr3[i14]);
                this.enabledTrackCount--;
                zArr3[i14] = false;
                sampleStreamArr[i13] = null;
            }
        }
        boolean z11 = !this.seenFirstTrackSelection ? j11 == 0 || this.isSingleSample : i11 != 0;
        for (int i15 = 0; i15 < exoTrackSelectionArr.length; i15++) {
            if (sampleStreamArr[i15] == null && (exoTrackSelection = exoTrackSelectionArr[i15]) != null) {
                Assertions.checkState(exoTrackSelection.length() == 1);
                Assertions.checkState(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int indexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                Assertions.checkState(!zArr3[indexOf]);
                this.enabledTrackCount++;
                zArr3[indexOf] = true;
                this.pendingInitialDiscontinuity = exoTrackSelection.getSelectedFormat().hasPrerollSamples | this.pendingInitialDiscontinuity;
                sampleStreamArr[i15] = new SampleStreamImpl(indexOf);
                zArr2[i15] = true;
                if (!z11) {
                    SampleQueue sampleQueue = this.sampleQueues[indexOf];
                    z11 = (sampleQueue.getReadIndex() == 0 || sampleQueue.seekTo(j11, true)) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i12 < length) {
                    sampleQueueArr[i12].discardToEnd();
                    i12++;
                }
                this.loader.cancelLoading();
            } else {
                this.loadingFinished = false;
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i12 < length2) {
                    sampleQueueArr2[i12].reset();
                    i12++;
                }
            }
        } else if (z11) {
            j11 = seekToUs(j11);
            while (i12 < sampleStreamArr.length) {
                if (sampleStreamArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j11;
    }

    public int skipData(int i11, long j11) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i11);
        SampleQueue sampleQueue = this.sampleQueues[i11];
        int skipCount = sampleQueue.getSkipCount(j11, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i11);
        }
        return skipCount;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        return prepareTrackOutput(new TrackId(i11, false));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j11, long j12, boolean z11) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z11) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j11, long j12) {
        if (this.durationUs == C.TIME_UNSET && this.seekMap != null) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j13 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j13;
            this.listener.onSourceInfoRefreshed(j13, this.seekMap, this.isLive);
        }
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j11, long j12, IOException iOException, int i11) {
        ExtractingLoadable extractingLoadable2;
        Loader.LoadErrorAction createRetryAction;
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs)), iOException, i11));
        if (retryDelayMsFor == C.TIME_UNSET) {
            createRetryAction = Loader.DONT_RETRY_FATAL;
            extractingLoadable2 = extractingLoadable;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            extractingLoadable2 = extractingLoadable;
            createRetryAction = configureRetry(extractingLoadable2, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean isRetry = createRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable2.seekTimeUs, this.durationUs, iOException, !isRetry);
        if (!isRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable2.loadTaskId);
        }
        return createRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(ExtractingLoadable extractingLoadable, long j11, long j12, int i11) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        this.mediaSourceEventDispatcher.loadStarted(i11 == 0 ? new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, j11) : new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead()), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, i11);
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
    }
}
