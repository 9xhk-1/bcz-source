package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final ImmutableList<MediaSourceHolder> mediaSourceHolders;

    @Nullable
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private int index;

        @Nullable
        private MediaItem mediaItem;

        @Nullable
        private MediaSource.Factory mediaSourceFactory;
        private final ImmutableList.a<MediaSourceHolder> mediaSourceHoldersBuilder = ImmutableList.builder();

        @uo.a
        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, C.TIME_UNSET);
        }

        public ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.e());
        }

        @uo.a
        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        @uo.a
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        @uo.a
        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        @uo.a
        public Builder add(MediaItem mediaItem, long j11) {
            Assertions.checkNotNull(mediaItem);
            if (j11 == C.TIME_UNSET) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j11 = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j11);
        }

        @uo.a
        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, C.TIME_UNSET);
        }

        @uo.a
        public Builder add(MediaSource mediaSource, long j11) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j11 == C.TIME_UNSET) ? false : true, "Progressive media source must define an initial placeholder duration.");
            ImmutableList.a<MediaSourceHolder> aVar = this.mediaSourceHoldersBuilder;
            int i11 = this.index;
            this.index = i11 + 1;
            aVar.g(new MediaSourceHolder(mediaSource, i11, Util.msToUs(j11)));
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final ImmutableList<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @Nullable
        private final Object manifest;
        private final MediaItem mediaItem;
        private final ImmutableList<Long> periodOffsetsInWindowUs;
        private final ImmutableList<Timeline> timelines;

        public ConcatenatedTimeline(MediaItem mediaItem, ImmutableList<Timeline> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Long> immutableList3, boolean z11, boolean z12, long j11, long j12, @Nullable Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = immutableList;
            this.firstPeriodIndices = immutableList2;
            this.periodOffsetsInWindowUs = immutableList3;
            this.isSeekable = z11;
            this.isDynamic = z12;
            this.durationUs = j11;
            this.defaultPositionUs = j12;
            this.manifest = obj;
        }

        private int getChildIndexByPeriodIndex(int i11) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i11 + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i11) {
            if (period.durationUs == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            return (i11 == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : this.periodOffsetsInWindowUs.get(i11 + 1).longValue()) - this.periodOffsetsInWindowUs.get(i11).longValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i11);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i11 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z11);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i11).longValue();
            period.durationUs = getPeriodDurationUs(period, i11);
            if (z11) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = this.timelines.get(childIndex);
            int intValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(intValue).longValue();
            period.durationUs = getPeriodDurationUs(period, intValue);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i11) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i11);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i11 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i11, long j11) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i11;
            this.initialPlaceholderDurationUs = j11;
        }
    }

    private void disableUnusedMediaSources() {
        for (int i11 = 0; i11 < this.mediaSourceHolders.size(); i11++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i11);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j11, int i11) {
        return (int) (j11 % i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j11, int i11, int i12) {
        return (j11 * i11) + i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i11, Object obj) {
        return Pair.create(Integer.valueOf(i11), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j11, int i11) {
        return j11 / i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    @Nullable
    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        ImmutableList.a aVar;
        ImmutableList.a aVar2;
        int i11;
        long j11;
        long j12;
        Timeline.Window window;
        boolean z11;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window2 = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        ImmutableList.a builder = ImmutableList.builder();
        ImmutableList.a builder2 = ImmutableList.builder();
        ImmutableList.a builder3 = ImmutableList.builder();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        int i12 = 0;
        Object obj = null;
        int i13 = 0;
        boolean z15 = false;
        boolean z16 = false;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        while (i12 < size) {
            MediaSourceHolder mediaSourceHolder = concatenatingMediaSource2.mediaSourceHolders.get(i12);
            Timeline timeline = mediaSourceHolder.mediaSource.getTimeline();
            Assertions.checkArgument(timeline.isEmpty() ^ z12, "Can't concatenate empty child Timeline.");
            builder.g(timeline);
            builder2.g(Integer.valueOf(i13));
            i13 += timeline.getPeriodCount();
            int i14 = 0;
            while (i14 < timeline.getWindowCount()) {
                timeline.getWindow(i14, window2);
                if (!z15) {
                    z15 = z12;
                    obj = window2.manifest;
                }
                z13 = (z13 && Objects.equals(obj, window2.manifest)) ? z12 : false;
                Timeline timeline2 = timeline;
                long j16 = window2.durationUs;
                if (j16 == C.TIME_UNSET) {
                    j16 = mediaSourceHolder.initialPlaceholderDurationUs;
                    if (j16 == C.TIME_UNSET) {
                        return null;
                    }
                }
                j13 += j16;
                if (mediaSourceHolder.index == 0 && i14 == 0) {
                    aVar = builder;
                    aVar2 = builder2;
                    j14 = window2.defaultPositionUs;
                    j15 = -window2.positionInFirstPeriodUs;
                } else {
                    aVar = builder;
                    aVar2 = builder2;
                }
                z14 &= window2.isSeekable || window2.isPlaceholder;
                z16 |= window2.isDynamic;
                int i15 = window2.firstPeriodIndex;
                while (i15 <= window2.lastPeriodIndex) {
                    builder3.g(Long.valueOf(j15));
                    Timeline timeline3 = timeline2;
                    timeline3.getPeriod(i15, period, true);
                    ImmutableList.a aVar3 = builder3;
                    long j17 = period.durationUs;
                    if (j17 == C.TIME_UNSET) {
                        Assertions.checkArgument(window2.firstPeriodIndex == window2.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j17 = window2.positionInFirstPeriodUs + j16;
                    }
                    if (i15 != window2.firstPeriodIndex || ((mediaSourceHolder.index == 0 && i14 == 0) || j17 == C.TIME_UNSET)) {
                        i11 = i15;
                        j11 = j17;
                        j12 = 0;
                    } else {
                        i11 = i15;
                        j12 = -window2.positionInFirstPeriodUs;
                        j11 = j17 + j12;
                    }
                    Object checkNotNull = Assertions.checkNotNull(period.uid);
                    int i16 = i11;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(checkNotNull)) {
                        window = window2;
                    } else {
                        window = window2;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(checkNotNull).equals(Long.valueOf(j12))) {
                            z11 = false;
                            Assertions.checkArgument(z11, "Can't handle windows with changing offset in first period.");
                            mediaSourceHolder.periodTimeOffsetsByUid.put(checkNotNull, Long.valueOf(j12));
                            j15 += j11;
                            i15 = i16 + 1;
                            builder3 = aVar3;
                            timeline2 = timeline3;
                            window2 = window;
                        }
                    }
                    z11 = true;
                    Assertions.checkArgument(z11, "Can't handle windows with changing offset in first period.");
                    mediaSourceHolder.periodTimeOffsetsByUid.put(checkNotNull, Long.valueOf(j12));
                    j15 += j11;
                    i15 = i16 + 1;
                    builder3 = aVar3;
                    timeline2 = timeline3;
                    window2 = window;
                }
                i14++;
                builder = aVar;
                builder2 = aVar2;
                timeline = timeline2;
                z12 = true;
            }
            i12++;
            concatenatingMediaSource2 = this;
            z12 = true;
        }
        return new ConcatenatedTimeline(getMediaItem(), builder.e(), builder2.e(), builder3.e(), z14, z16, j13, j14, z13 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline maybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (maybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(maybeCreateConcatenatedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId copyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        long longValue = mediaPeriodId.isAd() ? 0L : ((Long) Assertions.checkNotNull(mediaSourceHolder.periodTimeOffsetsByUid.get(copyWithWindowSequenceNumber.periodUid))).longValue();
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(copyWithWindowSequenceNumber, allocator, j11 - longValue), longValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i11) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMessage;
                handleMessage = ConcatenatingMediaSource2.this.handleMessage(message);
                return handleMessage;
            }
        });
        for (int i11 = 0; i11 < this.mediaSourceHolders.size(); i11++) {
            prepareChildSource(Integer.valueOf(i11), this.mediaSourceHolders.get(i11).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList<MediaSourceHolder> immutableList) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = immutableList;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Long l11;
        return (j11 == C.TIME_UNSET || mediaPeriodId == null || mediaPeriodId.isAd() || (l11 = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j11 : j11 + Util.usToMs(l11.longValue());
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }
}
