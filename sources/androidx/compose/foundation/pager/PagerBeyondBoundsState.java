package androidx.compose.foundation.pager;

import a00.r0;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final int beyondViewportPageCount;

    @k
    private final PagerState state;

    public PagerBeyondBoundsState(@k PagerState pagerState, int i11) {
        this.state = pagerState;
        this.beyondViewportPageCount = i11;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.state.getFirstVisiblePage$foundation_release() - this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((PageInfo) r0.u3(this.state.getLayoutInfo().getVisiblePagesInfo())).getIndex() + this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisiblePagesInfo().size() == 0) {
            return 0;
        }
        return u.u(PagerLayoutInfoKt.getMainAxisViewportSize(this.state.getLayoutInfo()) / (this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing()), 1);
    }
}
