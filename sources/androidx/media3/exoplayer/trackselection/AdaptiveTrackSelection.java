package androidx.media3.exoplayer.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.d7;
import com.google.common.collect.e7;
import com.google.common.collect.k6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final ImmutableList<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;

    @Nullable
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private long latestBitrateEstimate;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j11, long j12) {
            this.totalBandwidth = j11;
            this.allocatedBandwidth = j12;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i11, BandwidthMeter bandwidthMeter, ImmutableList<AdaptationCheckpoint> immutableList) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i11, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            BandwidthMeter bandwidthMeter2;
            ExoTrackSelection createAdaptiveTrackSelection;
            ImmutableList adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            int i11 = 0;
            while (i11 < definitionArr.length) {
                ExoTrackSelection.Definition definition = definitionArr[i11];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            createAdaptiveTrackSelection = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                            bandwidthMeter2 = bandwidthMeter;
                        } else {
                            bandwidthMeter2 = bandwidthMeter;
                            createAdaptiveTrackSelection = createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter2, (ImmutableList) adaptationCheckpoints.get(i11));
                        }
                        exoTrackSelectionArr[i11] = createAdaptiveTrackSelection;
                        i11++;
                        bandwidthMeter = bandwidthMeter2;
                    }
                }
                bandwidthMeter2 = bandwidthMeter;
                i11++;
                bandwidthMeter = bandwidthMeter2;
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i11, int i12, int i13, float f11) {
            this(i11, i12, i13, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f11, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i11, int i12, int i13, int i14, int i15, float f11) {
            this(i11, i12, i13, i14, i15, f11, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i11, int i12, int i13, float f11, float f12, Clock clock) {
            this(i11, i12, i13, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f11, f12, clock);
        }

        public Factory(int i11, int i12, int i13, int i14, int i15, float f11, float f12, Clock clock) {
            this.minDurationForQualityIncreaseMs = i11;
            this.maxDurationForQualityDecreaseMs = i12;
            this.minDurationToRetainAfterDiscardMs = i13;
            this.maxWidthToDiscard = i14;
            this.maxHeightToDiscard = i15;
            this.bandwidthFraction = f11;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f12;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, 25000L, 25000L, DEFAULT_MAX_WIDTH_TO_DISCARD, DEFAULT_MAX_HEIGHT_TO_DISCARD, 0.7f, 0.75f, ImmutableList.of(), Clock.DEFAULT);
    }

    private static void addCheckpoint(List<ImmutableList.a<AdaptationCheckpoint>> list, long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ImmutableList.a<AdaptationCheckpoint> aVar = list.get(i11);
            if (aVar != null) {
                aVar.g(new AdaptationCheckpoint(j11, jArr[i11]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j11, long j12) {
        long allocatedBandwidth = getAllocatedBandwidth(j12);
        int i11 = 0;
        for (int i12 = 0; i12 < this.length; i12++) {
            if (j11 == Long.MIN_VALUE || !isTrackExcluded(i12, j11)) {
                Format format = getFormat(i12);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.a builder = ImmutableList.builder();
                builder.g(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(builder);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i11 = 0; i11 < sortedTrackBitrates.length; i11++) {
            long[] jArr2 = sortedTrackBitrates[i11];
            jArr[i11] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i12 = 0; i12 < switchOrder.size(); i12++) {
            int intValue = switchOrder.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = sortedTrackBitrates[intValue][i13];
            addCheckpoint(arrayList, jArr);
        }
        for (int i14 = 0; i14 < definitionArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList.a builder2 = ImmutableList.builder();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ImmutableList.a aVar = (ImmutableList.a) arrayList.get(i15);
            builder2.g(aVar == null ? ImmutableList.of() : aVar.e());
        }
        return builder2.e();
    }

    private long getAllocatedBandwidth(long j11) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j11);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i11 = 1;
        while (i11 < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i11).totalBandwidth < totalAllocatableBandwidth) {
            i11++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i11 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i11);
        long j12 = adaptationCheckpoint.totalBandwidth;
        float f11 = (totalAllocatableBandwidth - j12) / (adaptationCheckpoint2.totalBandwidth - j12);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (f11 * (adaptationCheckpoint2.allocatedBandwidth - r2)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        MediaChunk mediaChunk = (MediaChunk) k6.w(list);
        long j11 = mediaChunk.startTimeUs;
        if (j11 != C.TIME_UNSET) {
            long j12 = mediaChunk.endTimeUs;
            if (j12 != C.TIME_UNSET) {
                return j12 - j11;
            }
        }
        return C.TIME_UNSET;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i11 = this.selectedIndex;
        if (i11 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i11].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i11 = 0; i11 < definitionArr.length; i11++) {
            ExoTrackSelection.Definition definition = definitionArr[i11];
            if (definition == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[definition.tracks.length];
                int i12 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    long j11 = definition.group.getFormat(iArr[i12]).bitrate;
                    long[] jArr2 = jArr[i11];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i12] = j11;
                    i12++;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> getSwitchOrder(long[][] jArr) {
        d7 a11 = e7.h().a().a();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long[] jArr2 = jArr[i11];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i12 = 0;
                while (true) {
                    long[] jArr3 = jArr[i11];
                    double d11 = 0.0d;
                    if (i12 >= jArr3.length) {
                        break;
                    }
                    long j11 = jArr3[i12];
                    if (j11 != -1) {
                        d11 = Math.log(j11);
                    }
                    dArr[i12] = d11;
                    i12++;
                }
                int i13 = length - 1;
                double d12 = dArr[i13] - dArr[0];
                int i14 = 0;
                while (i14 < i13) {
                    double d13 = dArr[i14];
                    i14++;
                    a11.put(Double.valueOf(d12 == 0.0d ? 1.0d : (((d13 + dArr[i14]) * 0.5d) - dArr[0]) / d12), Integer.valueOf(i11));
                }
            }
        }
        return ImmutableList.copyOf(a11.values());
    }

    private long getTotalAllocatableBandwidth(long j11) {
        long bitrateEstimate = this.bandwidthMeter.getBitrateEstimate();
        this.latestBitrateEstimate = bitrateEstimate;
        long j12 = (long) (bitrateEstimate * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j11 == C.TIME_UNSET) {
            return (long) (j12 / this.playbackSpeed);
        }
        float f11 = j11;
        return (long) ((j12 * Math.max((f11 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f11);
    }

    private long minDurationForQualityIncreaseUs(long j11, long j12) {
        if (j11 == C.TIME_UNSET) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j12 != C.TIME_UNSET) {
            j11 -= j12;
        }
        return Math.min((long) (j11 * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    public boolean canSelectFormat(Format format, int i11, long j11) {
        return ((long) i11) <= j11;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @CallSuper
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @CallSuper
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j11, List<? extends MediaChunk> list) {
        int i11;
        int i12;
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(elapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) k6.w(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j11, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration >= minDurationToRetainAfterDiscardUs) {
            Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime, getLastChunkDurationUs(list)));
            for (int i13 = 0; i13 < size; i13++) {
                MediaChunk mediaChunk = list.get(i13);
                Format format2 = mediaChunk.trackFormat;
                if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j11, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i11 = format2.height) != -1 && i11 <= this.maxHeightToDiscard && (i12 = format2.width) != -1 && i12 <= this.maxWidthToDiscard && i11 < format.height) {
                    return i13;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.latestBitrateEstimate;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f11) {
        this.playbackSpeed = f11;
    }

    public boolean shouldEvaluateQueueSize(long j11, List<? extends MediaChunk> list) {
        long j12 = this.lastBufferEvaluationMs;
        if (j12 == C.TIME_UNSET || j11 - j12 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) k6.w(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i11 = this.reason;
        if (i11 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i12 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) k6.w(list)).trackFormat);
        if (indexOf != -1) {
            i11 = ((MediaChunk) k6.w(list)).trackSelectionReason;
            i12 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
        if (determineIdealSelectedIndex != i12 && !isTrackExcluded(i12, elapsedRealtime)) {
            Format format = getFormat(i12);
            Format format2 = getFormat(determineIdealSelectedIndex);
            long minDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j13, nextChunkDurationUs);
            int i13 = format2.bitrate;
            int i14 = format.bitrate;
            if ((i13 > i14 && j12 < minDurationForQualityIncreaseUs) || (i13 < i14 && j12 >= this.maxDurationForQualityDecreaseUs)) {
                determineIdealSelectedIndex = i12;
            }
        }
        if (determineIdealSelectedIndex != i12) {
            i11 = 3;
        }
        this.reason = i11;
        this.selectedIndex = determineIdealSelectedIndex;
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i11, BandwidthMeter bandwidthMeter, long j11, long j12, long j13, int i12, int i13, float f11, float f12, List<AdaptationCheckpoint> list, Clock clock) {
        super(trackGroup, iArr, i11);
        long j14;
        if (j13 < j11) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j14 = j11;
        } else {
            j14 = j13;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j11 * 1000;
        this.maxDurationForQualityDecreaseUs = j12 * 1000;
        this.minDurationToRetainAfterDiscardUs = j14 * 1000;
        this.maxWidthToDiscard = i12;
        this.maxHeightToDiscard = i13;
        this.bandwidthFraction = f11;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f12;
        this.adaptationCheckpoints = ImmutableList.copyOf((Collection) list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.latestBitrateEstimate = -2147483647L;
    }
}
