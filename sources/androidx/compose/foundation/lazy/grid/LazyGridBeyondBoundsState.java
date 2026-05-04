package androidx.compose.foundation.lazy.grid;

import a00.r0;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;

    @k
    private final LazyGridState state;

    public LazyGridBeyondBoundsState(@k LazyGridState lazyGridState) {
        this.state = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return this.state.getFirstVisibleItemIndex();
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
        return ((LazyGridItemInfo) r0.u3(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @k
    public final LazyGridState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        return u.u(LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(this.state.getLayoutInfo()) / LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(this.state.getLayoutInfo()), 1);
    }
}
