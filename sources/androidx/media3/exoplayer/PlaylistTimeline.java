package androidx.media3.exoplayer;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }

    private static Timeline[] getTimelines(Collection<? extends MediaSourceInfoHolder> collection) {
        Timeline[] timelineArr = new Timeline[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            timelineArr[i11] = it.next().getTimeline();
            i11++;
        }
        return timelineArr;
    }

    private static Object[] getUids(Collection<? extends MediaSourceInfoHolder> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            objArr[i11] = it.next().getUid();
            i11++;
        }
        return objArr;
    }

    public PlaylistTimeline copyWithPlaceholderTimeline(ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[this.timelines.length];
        int i11 = 0;
        while (true) {
            Timeline[] timelineArr2 = this.timelines;
            if (i11 >= timelineArr2.length) {
                return new PlaylistTimeline(timelineArr, this.uids, shuffleOrder);
            }
            timelineArr[i11] = new ForwardingTimeline(timelineArr2[i11]) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1
                private final Timeline.Window window = new Timeline.Window();

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Period getPeriod(int i12, Timeline.Period period, boolean z11) {
                    Timeline.Period period2 = super.getPeriod(i12, period, z11);
                    if (super.getWindow(period2.windowIndex, this.window).isLive()) {
                        period2.set(period.f4450id, period.uid, period.windowIndex, period.durationUs, period.positionInWindowUs, AdPlaybackState.NONE, true);
                        return period2;
                    }
                    period2.isPlaceholder = true;
                    return period2;
                }
            };
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int i11) {
        return Util.binarySearchFloor(this.firstPeriodInChildIndices, i11 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int i11) {
        return Util.binarySearchFloor(this.firstWindowInChildIndices, i11 + 1, false, false);
    }

    public List<Timeline> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public Object getChildUidByChildIndex(int i11) {
        return this.uids[i11];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int i11) {
        return this.firstPeriodInChildIndices[i11];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int i11) {
        return this.firstWindowInChildIndices[i11];
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public Timeline getTimelineByChildIndex(int i11) {
        return this.timelines[i11];
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i11 = 0;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new HashMap<>();
        int length2 = timelineArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length2) {
            Timeline timeline = timelineArr[i11];
            this.timelines[i14] = timeline;
            this.firstWindowInChildIndices[i14] = i12;
            this.firstPeriodInChildIndices[i14] = i13;
            i12 += timeline.getWindowCount();
            i13 += this.timelines[i14].getPeriodCount();
            this.childIndexByUid.put(objArr[i14], Integer.valueOf(i14));
            i11++;
            i14++;
        }
        this.windowCount = i12;
        this.periodCount = i13;
    }
}
