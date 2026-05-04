package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 8;

    @k
    private final IntervalList<LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(@k IntervalList<LazyStaggeredGridInterval> intervalList) {
        this.intervals = intervalList;
    }

    @k
    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int i11) {
        if (i11 >= 0 && i11 < this.intervals.getSize()) {
            IntervalList.Interval<LazyStaggeredGridInterval> interval = this.intervals.get(i11);
            l<Integer, StaggeredGridItemSpan> span = interval.getValue().getSpan();
            int startIndex = i11 - interval.getStartIndex();
            if (span != null && span.invoke(Integer.valueOf(startIndex)) == StaggeredGridItemSpan.Companion.getFullLine()) {
                return true;
            }
        }
        return false;
    }
}
