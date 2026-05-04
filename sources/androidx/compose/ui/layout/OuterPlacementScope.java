package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OuterPlacementScope extends Placeable.PlacementScope {

    @k
    private final Owner owner;

    public OuterPlacementScope(@k Owner owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    @k
    public LayoutCoordinates getCoordinates() {
        return this.owner.getRoot().getOuterCoordinator$ui_release();
    }

    @k
    public final Owner getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    @k
    public LayoutDirection getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.owner.getRoot().getWidth();
    }
}
