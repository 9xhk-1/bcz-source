package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;
    private final boolean allowUnseekableMedia;

    @Nullable
    private IllegalClippingException clippingError;

    @Nullable
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private boolean allowDynamicClippingUpdates;
        private boolean allowUnseekableMedia;
        private boolean buildCalled;
        private boolean enableInitialDiscontinuity = true;
        private long endPositionUs = Long.MIN_VALUE;
        private final MediaSource mediaSource;
        private boolean relativeToDefaultPosition;
        private long startPositionUs;

        public Builder(MediaSource mediaSource) {
            this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        }

        public ClippingMediaSource build() {
            this.buildCalled = true;
            return new ClippingMediaSource(this);
        }

        @uo.a
        public Builder setAllowDynamicClippingUpdates(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.allowDynamicClippingUpdates = z11;
            return this;
        }

        @uo.a
        public Builder setAllowUnseekableMedia(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.allowUnseekableMedia = z11;
            return this;
        }

        @uo.a
        public Builder setEnableInitialDiscontinuity(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.enableInitialDiscontinuity = z11;
            return this;
        }

        @uo.a
        public Builder setEndPositionMs(long j11) {
            return setEndPositionUs(Util.msToUs(j11));
        }

        @uo.a
        public Builder setEndPositionUs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.endPositionUs = j11;
            return this;
        }

        @uo.a
        public Builder setRelativeToDefaultPosition(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.relativeToDefaultPosition = z11;
            return this;
        }

        @uo.a
        public Builder setStartPositionMs(long j11) {
            return setStartPositionUs(Util.msToUs(j11));
        }

        @uo.a
        public Builder setStartPositionUs(long j11) {
            Assertions.checkArgument(j11 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.startPositionUs = j11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j11, long j12, boolean z11) throws IllegalClippingException {
            super(timeline);
            if (j12 != Long.MIN_VALUE && j12 < j11) {
                throw new IllegalClippingException(2, j11, j12);
            }
            boolean z12 = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long max = Math.max(0L, j11);
            if (!z11 && !window.isPlaceholder && max != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long max2 = j12 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j12);
            long j13 = window.durationUs;
            if (j13 != C.TIME_UNSET) {
                max2 = max2 > j13 ? j13 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.startUs = max;
            this.endUs = max2;
            this.durationUs = max2 == C.TIME_UNSET ? -9223372036854775807L : max2 - max;
            if (window.isDynamic && (max2 == C.TIME_UNSET || (j13 != C.TIME_UNSET && max2 == j13))) {
                z12 = true;
            }
            this.isDynamic = z12;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
            this.timeline.getPeriod(0, period, z11);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j11 = this.durationUs;
            long j12 = C.TIME_UNSET;
            if (j11 != C.TIME_UNSET) {
                j12 = j11 - positionInWindowUs;
            }
            return period.set(period.f4450id, period.uid, 0, j12, positionInWindowUs);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
            this.timeline.getWindow(0, window, 0L);
            long j12 = window.positionInFirstPeriodUs;
            long j13 = this.startUs;
            window.positionInFirstPeriodUs = j12 + j13;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j14 = window.defaultPositionUs;
            if (j14 != C.TIME_UNSET) {
                long max = Math.max(j14, j13);
                window.defaultPositionUs = max;
                long j15 = this.endUs;
                if (j15 != C.TIME_UNSET) {
                    max = Math.min(max, j15);
                }
                window.defaultPositionUs = max - this.startUs;
            }
            long usToMs = Util.usToMs(this.startUs);
            long j16 = window.presentationStartTimeMs;
            if (j16 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j16 + usToMs;
            }
            long j17 = window.windowStartTimeMs;
            if (j17 != C.TIME_UNSET) {
                window.windowStartTimeMs = j17 + usToMs;
            }
            return window;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i11) {
            this(i11, C.TIME_UNSET, C.TIME_UNSET);
        }

        private static String getReasonDescription(int i11, long j11, long j12) {
            if (i11 == 0) {
                return "invalid period count";
            }
            if (i11 == 1) {
                return "not seekable to start";
            }
            if (i11 != 2) {
                return "unknown";
            }
            Assertions.checkState((j11 == C.TIME_UNSET || j12 == C.TIME_UNSET) ? false : true);
            return "start exceeds end. Start time: " + j11 + ", End time: " + j12;
        }

        public IllegalClippingException(int i11, long j11, long j12) {
            super("Illegal clipping: " + getReasonDescription(i11, j11, j12));
            this.reason = i11;
        }
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j11;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            j11 = this.startUs;
            long j12 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j11 += defaultPositionUs;
                j12 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j11;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j12 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mediaPeriods.get(i11).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            r6 = j12;
        } else {
            j11 = this.periodStartUs - positionInFirstPeriodUs;
            if (this.endUs != Long.MIN_VALUE) {
                r6 = this.periodEndUs - positionInFirstPeriodUs;
            }
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j11, r6, this.allowUnseekableMedia);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e11) {
            this.clippingError = e11;
            for (int i12 = 0; i12 < this.mediaPeriods.size(); i12++) {
                this.mediaPeriods.get(i12).setClippingError(this.clippingError);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return getMediaItem().clippingConfiguration.equals(mediaItem.clippingConfiguration) && this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j11), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((ClippingTimeline) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j11, long j12) {
        this(new Builder(mediaSource).setStartPositionUs(j11).setEndPositionUs(j12));
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j11) {
        this(new Builder(mediaSource).setEndPositionUs(j11).setRelativeToDefaultPosition(true));
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j11, long j12, boolean z11, boolean z12, boolean z13) {
        this(new Builder(mediaSource).setStartPositionUs(j11).setEndPositionUs(j12).setEnableInitialDiscontinuity(z11).setAllowDynamicClippingUpdates(z12).setRelativeToDefaultPosition(z13));
    }

    private ClippingMediaSource(Builder builder) {
        super(builder.mediaSource);
        this.startUs = builder.startPositionUs;
        this.endUs = builder.endPositionUs;
        this.enableInitialDiscontinuity = builder.enableInitialDiscontinuity;
        this.allowDynamicClippingUpdates = builder.allowDynamicClippingUpdates;
        this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
        this.allowUnseekableMedia = builder.allowUnseekableMedia;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}
