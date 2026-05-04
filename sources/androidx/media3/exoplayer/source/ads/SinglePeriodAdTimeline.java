package androidx.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ForwardingTimeline;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@VisibleForTesting(otherwise = 3)
@UnstableApi
/* loaded from: classes2.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.checkState(timeline.getPeriodCount() == 1);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
        this.timeline.getPeriod(i11, period, z11);
        long j11 = period.durationUs;
        if (j11 == C.TIME_UNSET) {
            j11 = this.adPlaybackState.contentDurationUs;
        }
        period.set(period.f4450id, period.uid, period.windowIndex, j11, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }
}
