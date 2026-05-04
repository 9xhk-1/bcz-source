package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.ConstraintsKt;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PlaceableKt {

    @k
    private static final l<GraphicsLayerScope, g2> DefaultLayerBlock = new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return g2.f100423a;
        }
    };
    private static final long DefaultConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @k
    public static final Placeable.PlacementScope PlacementScope(@k LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    @k
    public static final Placeable.PlacementScope PlacementScope(@k Owner owner) {
        return new OuterPlacementScope(owner);
    }
}
