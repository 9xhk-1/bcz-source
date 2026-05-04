package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.d7;
import com.google.common.collect.e7;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setMediaId("MergingMediaSource").build();
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final Map<Object, Long> clippedDurationsUs;
    private final d7<Object, ClippingMediaPeriod> clippedMediaPeriods;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final List<List<MediaPeriodAndId>> mediaPeriods;
    private final MediaSource[] mediaSources;

    @Nullable
    private IllegalMergeException mergeError;
    private final ArrayList<MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final Timeline[] timelines;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ClippedTimeline extends ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int windowCount = timeline.getWindowCount();
            this.windowDurationsUs = new long[timeline.getWindowCount()];
            Timeline.Window window = new Timeline.Window();
            for (int i11 = 0; i11 < windowCount; i11++) {
                this.windowDurationsUs[i11] = timeline.getWindow(i11, window).durationUs;
            }
            int periodCount = timeline.getPeriodCount();
            this.periodDurationsUs = new long[periodCount];
            Timeline.Period period = new Timeline.Period();
            for (int i12 = 0; i12 < periodCount; i12++) {
                timeline.getPeriod(i12, period, true);
                long longValue = ((Long) Assertions.checkNotNull(map.get(period.uid))).longValue();
                long[] jArr = this.periodDurationsUs;
                longValue = longValue == Long.MIN_VALUE ? period.durationUs : longValue;
                jArr[i12] = longValue;
                long j11 = period.durationUs;
                if (j11 != C.TIME_UNSET) {
                    long[] jArr2 = this.windowDurationsUs;
                    int i13 = period.windowIndex;
                    jArr2[i13] = jArr2[i13] - (j11 - longValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
            super.getPeriod(i11, period, z11);
            period.durationUs = this.periodDurationsUs[i11];
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
            long j12;
            super.getWindow(i11, window, j11);
            long j13 = this.windowDurationsUs[i11];
            window.durationUs = j13;
            if (j13 != C.TIME_UNSET) {
                long j14 = window.defaultPositionUs;
                if (j14 != C.TIME_UNSET) {
                    j12 = Math.min(j14, j13);
                    window.defaultPositionUs = j12;
                    return window;
                }
            }
            j12 = window.defaultPositionUs;
            window.defaultPositionUs = j12;
            return window;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i11) {
            this.reason = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaPeriodAndId {
        private final MediaPeriod mediaPeriod;
        private final MediaSource.MediaPeriodId mediaPeriodId;

        private MediaPeriodAndId(MediaSource.MediaPeriodId mediaPeriodId, MediaPeriod mediaPeriod) {
            this.mediaPeriodId = mediaPeriodId;
            this.mediaPeriod = mediaPeriod;
        }
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    private void computePeriodTimeOffsets() {
        Timeline.Period period = new Timeline.Period();
        for (int i11 = 0; i11 < this.periodCount; i11++) {
            long j11 = -this.timelines[0].getPeriod(i11, period).getPositionInWindowUs();
            int i12 = 1;
            while (true) {
                Timeline[] timelineArr = this.timelines;
                if (i12 < timelineArr.length) {
                    this.periodTimeOffsetsUs[i11][i12] = j11 - (-timelineArr[i12].getPeriod(i11, period).getPositionInWindowUs());
                    i12++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        Timeline[] timelineArr;
        Timeline.Period period = new Timeline.Period();
        for (int i11 = 0; i11 < this.periodCount; i11++) {
            int i12 = 0;
            long j11 = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.timelines;
                if (i12 >= timelineArr.length) {
                    break;
                }
                long durationUs = timelineArr[i12].getPeriod(i11, period).getDurationUs();
                if (durationUs != C.TIME_UNSET) {
                    long j12 = durationUs + this.periodTimeOffsetsUs[i11][i12];
                    if (j11 == Long.MIN_VALUE || j12 < j11) {
                        j11 = j12;
                    }
                }
                i12++;
            }
            Object uidOfPeriod = timelineArr[0].getUidOfPeriod(i11);
            this.clippedDurationsUs.put(uidOfPeriod, Long.valueOf(j11));
            Iterator<ClippingMediaPeriod> it = this.clippedMediaPeriods.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                it.next().updateClipping(0L, j11);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 && mediaSourceArr[0].canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        int length = this.mediaSources.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int indexOfPeriod = this.timelines[0].getIndexOfPeriod(mediaPeriodId.periodUid);
        for (int i11 = 0; i11 < length; i11++) {
            MediaSource.MediaPeriodId copyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(this.timelines[i11].getUidOfPeriod(indexOfPeriod));
            mediaPeriodArr[i11] = this.mediaSources[i11].createPeriod(copyWithPeriodUid, allocator, j11 - this.periodTimeOffsetsUs[indexOfPeriod][i11]);
            this.mediaPeriods.get(i11).add(new MediaPeriodAndId(copyWithPeriodUid, mediaPeriodArr[i11]));
        }
        MergingMediaPeriod mergingMediaPeriod = new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
        if (!this.clipDurations) {
            return mergingMediaPeriod;
        }
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(mergingMediaPeriod, false, 0L, ((Long) Assertions.checkNotNull(this.clippedDurationsUs.get(mediaPeriodId.periodUid))).longValue());
        this.clippedMediaPeriods.put(mediaPeriodId.periodUid, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        for (int i11 = 0; i11 < this.mediaSources.length; i11++) {
            prepareChildSource(Integer.valueOf(i11), this.mediaSources[i11]);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        if (this.clipDurations) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            Iterator<Map.Entry<Object, ClippingMediaPeriod>> it = this.clippedMediaPeriods.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, ClippingMediaPeriod> next = it.next();
                if (next.getValue().equals(clippingMediaPeriod)) {
                    this.clippedMediaPeriods.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        for (int i11 = 0; i11 < this.mediaSources.length; i11++) {
            List<MediaPeriodAndId> list = this.mediaPeriods.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list.size()) {
                    break;
                }
                if (list.get(i12).mediaPeriod.equals(mediaPeriod)) {
                    list.remove(i12);
                    break;
                }
                i12++;
            }
            this.mediaSources[i11].releasePeriod(mergingMediaPeriod.getChildPeriod(i11));
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.timelines, (Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSources[0].updateMediaItem(mediaItem);
    }

    public MergingMediaSource(boolean z11, MediaSource... mediaSourceArr) {
        this(z11, false, mediaSourceArr);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        List<MediaPeriodAndId> list = this.mediaPeriods.get(num.intValue());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).mediaPeriodId.equals(mediaPeriodId)) {
                return this.mediaPeriods.get(0).get(i11).mediaPeriodId;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline) {
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            this.periodCount = timeline.getPeriodCount();
        } else if (timeline.getPeriodCount() != this.periodCount) {
            this.mergeError = new IllegalMergeException(0);
            return;
        }
        if (this.periodTimeOffsetsUs.length == 0) {
            this.periodTimeOffsetsUs = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.periodCount, this.timelines.length);
        }
        this.pendingTimelineSources.remove(mediaSource);
        this.timelines[num.intValue()] = timeline;
        if (this.pendingTimelineSources.isEmpty()) {
            if (this.adjustPeriodTimeOffsets) {
                computePeriodTimeOffsets();
            }
            Timeline timeline2 = this.timelines[0];
            if (this.clipDurations) {
                updateClippedDuration();
                timeline2 = new ClippedTimeline(timeline2, this.clippedDurationsUs);
            }
            refreshSourceInfo(timeline2);
        }
    }

    public MergingMediaSource(boolean z11, boolean z12, MediaSource... mediaSourceArr) {
        this(z11, z12, new DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSourceArr) {
        this.adjustPeriodTimeOffsets = z11;
        this.clipDurations = z12;
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
        this.mediaPeriods = new ArrayList(mediaSourceArr.length);
        for (int i11 = 0; i11 < mediaSourceArr.length; i11++) {
            this.mediaPeriods.add(new ArrayList());
        }
        this.timelines = new Timeline[mediaSourceArr.length];
        this.periodTimeOffsetsUs = new long[0][];
        this.clippedDurationsUs = new HashMap();
        this.clippedMediaPeriods = e7.d().a().a();
    }
}
