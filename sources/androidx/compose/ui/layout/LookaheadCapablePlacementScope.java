package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {

    @k
    private final LookaheadCapablePlaceable within;

    public LookaheadCapablePlacementScope(@k LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.within = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public float current(@k Ruler ruler, float f11) {
        return this.within.findRulerValue(ruler, f11);
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    @l
    public LayoutCoordinates getCoordinates() {
        LayoutCoordinates coordinates = this.within.isPlacingForAlignment$ui_release() ? null : this.within.getCoordinates();
        if (coordinates == null) {
            this.within.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
        }
        return coordinates;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    @k
    public LayoutDirection getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.within.getMeasuredWidth();
    }
}
