package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // androidx.media3.common.Timeline
    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.media3.common.Timeline
    public int getFirstWindowIndex(boolean z11) {
        return this.timeline.getFirstWindowIndex(z11);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // androidx.media3.common.Timeline
    public int getLastWindowIndex(boolean z11) {
        return this.timeline.getLastWindowIndex(z11);
    }

    @Override // androidx.media3.common.Timeline
    public int getNextWindowIndex(int i11, int i12, boolean z11) {
        return this.timeline.getNextWindowIndex(i11, i12, z11);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
        return this.timeline.getPeriod(i11, period, z11);
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        return super.getPeriodByUid(obj, period);
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // androidx.media3.common.Timeline
    public int getPreviousWindowIndex(int i11, int i12, boolean z11) {
        return this.timeline.getPreviousWindowIndex(i11, i12, z11);
    }

    @Override // androidx.media3.common.Timeline
    public Object getUidOfPeriod(int i11) {
        return this.timeline.getUidOfPeriod(i11);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
        return this.timeline.getWindow(i11, window, j11);
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }

    @Override // androidx.media3.common.Timeline
    public final int hashCode() {
        return super.hashCode();
    }
}
