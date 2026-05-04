package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class SampleQueue implements TrackOutput {

    @VisibleForTesting
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;

    @Nullable
    private DrmSession currentDrmSession;

    @Nullable
    private Format downstreamFormat;

    @Nullable
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @Nullable
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;

    @Nullable
    private Format unadjustedUpstreamFormat;

    @Nullable
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;

    @Nullable
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private long upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata = new SpannedData<>(new Consumer() { // from class: androidx.media3.exoplayer.source.h0
        @Override // androidx.media3.common.util.Consumer
        public final void accept(Object obj) {
            ((SampleQueue.SharedSampleMetadata) obj).drmSessionReference.release();
        }
    });
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;
    private boolean allSamplesAreSyncSamples = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SampleExtrasHolder {

        @Nullable
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator, @Nullable DrmSessionManager drmSessionManager, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j11) {
        if (this.length == 0) {
            return j11 > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j11) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j11));
        return true;
    }

    private synchronized void commitSample(long j11, int i11, long j12, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
        try {
            int i13 = this.length;
            if (i13 > 0) {
                int relativeIndex = getRelativeIndex(i13 - 1);
                Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j12);
            }
            this.isLastSampleQueued = (536870912 & i11) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j11);
            int relativeIndex2 = getRelativeIndex(this.length);
            this.timesUs[relativeIndex2] = j11;
            this.offsets[relativeIndex2] = j12;
            this.sizes[relativeIndex2] = i12;
            this.flags[relativeIndex2] = i11;
            this.cryptoDatas[relativeIndex2] = cryptoData;
            this.sourceIds[relativeIndex2] = this.upstreamSourceId;
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
                Format format = (Format) Assertions.checkNotNull(this.upstreamFormat);
                DrmSessionManager drmSessionManager = this.drmSessionManager;
                this.sharedSampleMetadata.appendSpan(getWriteIndex(), new SharedSampleMetadata(format, drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, format) : DrmSessionManager.DrmSessionReference.EMPTY));
            }
            int i14 = this.length + 1;
            this.length = i14;
            int i15 = this.capacity;
            if (i14 == i15) {
                int i16 = i15 + 1000;
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                long[] jArr3 = new long[i16];
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i16];
                int i17 = this.relativeFirstIndex;
                int i18 = i15 - i17;
                System.arraycopy(this.offsets, i17, jArr2, 0, i18);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i18);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i18);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i18);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i18);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i18);
                int i19 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr2, i18, i19);
                System.arraycopy(this.timesUs, 0, jArr3, i18, i19);
                System.arraycopy(this.flags, 0, iArr, i18, i19);
                System.arraycopy(this.sizes, 0, iArr2, i18, i19);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i18, i19);
                System.arraycopy(this.sourceIds, 0, jArr, i18, i19);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr;
                this.sizes = iArr2;
                this.cryptoDatas = cryptoDataArr;
                this.sourceIds = jArr;
                this.relativeFirstIndex = 0;
                this.capacity = i16;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int countUnreadSamplesBefore(long j11) {
        int i11 = this.length;
        int relativeIndex = getRelativeIndex(i11 - 1);
        while (i11 > this.readPosition && this.timesUs[relativeIndex] >= j11) {
            i11--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i11;
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j11, boolean z11, boolean z12) {
        Throwable th2;
        try {
            try {
                int i11 = this.length;
                if (i11 != 0) {
                    long[] jArr = this.timesUs;
                    int i12 = this.relativeFirstIndex;
                    if (j11 >= jArr[i12]) {
                        if (z12) {
                            try {
                                int i13 = this.readPosition;
                                if (i13 != i11) {
                                    i11 = i13 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int findSampleBefore = findSampleBefore(i12, i11, j11, z11);
                        if (findSampleBefore == -1) {
                            return -1L;
                        }
                        return discardSamples(findSampleBefore);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i11 = this.length;
        if (i11 == 0) {
            return -1L;
        }
        return discardSamples(i11);
    }

    @GuardedBy("this")
    private long discardSamples(int i11) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i11));
        this.length -= i11;
        int i12 = this.absoluteFirstIndex + i11;
        this.absoluteFirstIndex = i12;
        int i13 = this.relativeFirstIndex + i11;
        this.relativeFirstIndex = i13;
        int i14 = this.capacity;
        if (i13 >= i14) {
            this.relativeFirstIndex = i13 - i14;
        }
        int i15 = this.readPosition - i11;
        this.readPosition = i15;
        if (i15 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i12);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i16 = this.relativeFirstIndex;
        if (i16 == 0) {
            i16 = this.capacity;
        }
        return this.offsets[i16 - 1] + this.sizes[r6];
    }

    private long discardUpstreamSampleMetadata(int i11) {
        int writeIndex = getWriteIndex() - i11;
        boolean z11 = false;
        Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i12 = this.length - writeIndex;
        this.length = i12;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i12));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z11 = true;
        }
        this.isLastSampleQueued = z11;
        this.sharedSampleMetadata.discardFrom(i11);
        int i13 = this.length;
        if (i13 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i13 - 1)] + this.sizes[r9];
    }

    private int findSampleAfter(int i11, int i12, long j11, boolean z11) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.timesUs[i11] >= j11) {
                return i13;
            }
            i11++;
            if (i11 == this.capacity) {
                i11 = 0;
            }
        }
        if (z11) {
            return i12;
        }
        return -1;
    }

    private int findSampleBefore(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = this.timesUs[i11];
            if (j12 > j11) {
                break;
            }
            if (!z11 || (this.flags[i11] & 1) != 0) {
                if (j12 == j11) {
                    return i14;
                }
                i13 = i14;
            }
            i11++;
            if (i11 == this.capacity) {
                i11 = 0;
            }
        }
        return i13;
    }

    private long getLargestTimestamp(int i11) {
        long j11 = Long.MIN_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = Math.max(j11, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                return j11;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j11;
    }

    private int getRelativeIndex(int i11) {
        int i12 = this.relativeFirstIndex + i11;
        int i13 = this.capacity;
        return i12 < i13 ? i12 : i12 - i13;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private boolean mayReadSample(int i11) {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i11] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        boolean z11 = format2 == null;
        DrmInitData drmInitData = format2 == null ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z11 || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession acquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = acquireSession;
            formatHolder.drmSession = acquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z11, boolean z12, SampleExtrasHolder sampleExtrasHolder) {
        try {
            decoderInputBuffer.waitingForKeys = false;
            if (!hasNextSample()) {
                if (!z12 && !this.isLastSampleQueued) {
                    Format format = this.upstreamFormat;
                    if (format == null || (!z11 && format == this.downstreamFormat)) {
                        return -3;
                    }
                    onFormatResult((Format) Assertions.checkNotNull(format), formatHolder);
                    return -5;
                }
                decoderInputBuffer.setFlags(4);
                decoderInputBuffer.timeUs = Long.MIN_VALUE;
                return -4;
            }
            Format format2 = this.sharedSampleMetadata.get(getReadIndex()).format;
            if (!z11 && format2 == this.downstreamFormat) {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!mayReadSample(relativeIndex)) {
                    decoderInputBuffer.waitingForKeys = true;
                    return -3;
                }
                decoderInputBuffer.setFlags(this.flags[relativeIndex]);
                if (this.readPosition == this.length - 1 && (z12 || this.isLastSampleQueued)) {
                    decoderInputBuffer.addFlag(536870912);
                }
                decoderInputBuffer.timeUs = this.timesUs[relativeIndex];
                sampleExtrasHolder.size = this.sizes[relativeIndex];
                sampleExtrasHolder.offset = this.offsets[relativeIndex];
                sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
                return -4;
            }
            onFormatResult(format2, formatHolder);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        try {
            this.upstreamFormatRequired = false;
            if (Objects.equals(format, this.upstreamFormat)) {
                return false;
            }
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(format)) {
                this.upstreamFormat = format;
            } else {
                this.upstreamFormat = this.sharedSampleMetadata.getEndValue().format;
            }
            boolean z11 = this.allSamplesAreSyncSamples;
            Format format2 = this.upstreamFormat;
            this.allSamplesAreSyncSamples = z11 & MimeTypes.allSamplesAreSyncSamples(format2.sampleMimeType, format2.codecs);
            this.loggedUnexpectedNonSyncSample = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i11 = this.readPosition;
        if (i11 == 0) {
            return -1L;
        }
        return discardSamples(i11);
    }

    public final void discardTo(long j11, boolean z11, boolean z12) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j11, z11, z12));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j11) {
        if (this.length == 0) {
            return;
        }
        Assertions.checkArgument(j11 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j11));
    }

    public final void discardUpstreamSamples(int i11) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i11));
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @CallSuper
    public Format getAdjustedUpstreamFormat(Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j11, boolean z11) {
        Throwable th2;
        try {
            try {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j11 < this.timesUs[relativeIndex]) {
                    return 0;
                }
                if (j11 <= this.largestQueuedTimestampUs || !z11) {
                    int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j11, true);
                    if (findSampleBefore == -1) {
                        return 0;
                    }
                    return findSampleBefore;
                }
                try {
                    return this.length - this.readPosition;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Nullable
    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    @CallSuper
    public synchronized boolean isReady(boolean z11) {
        Format format;
        boolean z12 = true;
        if (hasNextSample()) {
            if (this.sharedSampleMetadata.get(getReadIndex()).format != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z11 && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
            z12 = false;
        }
        return z12;
    }

    @CallSuper
    public void maybeThrowError() throws IOException {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    @CallSuper
    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    @CallSuper
    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11, boolean z11) {
        int peekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i11 & 2) != 0, z11, this.extrasHolder);
        if (peekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z12 = (i11 & 1) != 0;
            if ((i11 & 4) == 0) {
                if (z12) {
                    this.sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                } else {
                    this.sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z12) {
                this.readPosition++;
            }
        }
        return peekSampleMetadata;
    }

    @CallSuper
    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
        return this.sampleDataQueue.sampleData(dataReader, i11, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, @androidx.annotation.Nullable androidx.media3.extractor.TrackOutput.CryptoData r17) {
        /*
            r11 = this;
            boolean r1 = r11.upstreamFormatAdjustmentRequired
            if (r1 == 0) goto Lf
            androidx.media3.common.Format r1 = r11.unadjustedUpstreamFormat
            java.lang.Object r1 = androidx.media3.common.util.Assertions.checkStateNotNull(r1)
            androidx.media3.common.Format r1 = (androidx.media3.common.Format) r1
            r11.format(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.upstreamKeyframeRequired
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.upstreamKeyframeRequired = r2
        L21:
            long r5 = r11.sampleOffsetUs
            long r5 = r5 + r12
            boolean r7 = r11.allSamplesAreSyncSamples
            if (r7 == 0) goto L53
            long r7 = r11.startTimeUs
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.loggedUnexpectedNonSyncSample
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            androidx.media3.common.Format r7 = r11.upstreamFormat
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            androidx.media3.common.util.Log.w(r7, r1)
            r11.loggedUnexpectedNonSyncSample = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.pendingSplice
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.attemptSplice(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.pendingSplice = r2
            goto L65
        L64:
            return
        L65:
            androidx.media3.exoplayer.source.SampleDataQueue r1 = r11.sampleDataQueue
            long r1 = r1.getTotalBytesWritten()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.commitSample(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.sampleMetadata(long, int, int, int, androidx.media3.extractor.TrackOutput$CryptoData):void");
    }

    public final synchronized boolean seekTo(int i11) {
        rewind();
        int i12 = this.absoluteFirstIndex;
        if (i11 >= i12 && i11 <= this.length + i12) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i11 - i12;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j11) {
        if (this.sampleOffsetUs != j11) {
            this.sampleOffsetUs = j11;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j11) {
        this.startTimeUs = j11;
    }

    public final void setUpstreamFormatChangeListener(@Nullable UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final synchronized void skip(int i11) {
        boolean z11;
        if (i11 >= 0) {
            try {
                if (this.readPosition + i11 <= this.length) {
                    z11 = true;
                    Assertions.checkArgument(z11);
                    this.readPosition += i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z11 = false;
        Assertions.checkArgument(z11);
        this.readPosition += i11;
    }

    public final void sourceId(long j11) {
        this.upstreamSourceId = j11;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    @CallSuper
    public void reset(boolean z11) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z11) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
            this.allSamplesAreSyncSamples = true;
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
        this.sampleDataQueue.sampleData(parsableByteArray, i11);
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public final synchronized boolean seekTo(long j11, boolean z11) {
        SampleQueue sampleQueue;
        long j12;
        int findSampleBefore;
        try {
            try {
                rewind();
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j11 < this.timesUs[relativeIndex] || (j11 > this.largestQueuedTimestampUs && !z11)) {
                    return false;
                }
                if (this.allSamplesAreSyncSamples) {
                    sampleQueue = this;
                    j12 = j11;
                    findSampleBefore = sampleQueue.findSampleAfter(relativeIndex, this.length - this.readPosition, j12, z11);
                } else {
                    sampleQueue = this;
                    j12 = j11;
                    findSampleBefore = sampleQueue.findSampleBefore(relativeIndex, sampleQueue.length - sampleQueue.readPosition, j12, true);
                }
                if (findSampleBefore == -1) {
                    return false;
                }
                sampleQueue.startTimeUs = j12;
                sampleQueue.readPosition += findSampleBefore;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
