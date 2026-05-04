package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SimplePlacementScope extends Placeable.PlacementScope {

    @k
    private final LayoutDirection parentLayoutDirection;
    private final int parentWidth;

    public SimplePlacementScope(int i11, @k LayoutDirection layoutDirection) {
        this.parentWidth = i11;
        this.parentLayoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    @k
    public LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.parentWidth;
    }
}
