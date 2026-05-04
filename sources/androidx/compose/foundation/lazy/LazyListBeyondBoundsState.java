package androidx.compose.foundation.lazy;

import a00.r0;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final int beyondBoundsItemCount;

    @k
    private final LazyListState state;

    public LazyListBeyondBoundsState(@k LazyListState lazyListState, int i11) {
        this.state = lazyListState;
        this.beyondBoundsItemCount = i11;
    }

    public final int getBeyondBoundsItemCount() {
        return this.beyondBoundsItemCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.state.getFirstVisibleItemIndex() - this.beyondBoundsItemCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((LazyListItemInfo) r0.u3(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex() + this.beyondBoundsItemCount);
    }

    @k
    public final LazyListState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        return u.u(LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(this.state.getLayoutInfo()) / LazyListLayoutInfoKt.visibleItemsAverageSize(this.state.getLayoutInfo()), 1);
    }
}
