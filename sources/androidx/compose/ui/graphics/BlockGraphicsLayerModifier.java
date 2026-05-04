package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,668:1\n83#2:669\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n*L\n567#1:669\n*E\n"})
/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    @m80.k
    private x00.l<? super GraphicsLayerScope, yz.g2> layerBlock;

    public BlockGraphicsLayerModifier(@m80.k x00.l<? super GraphicsLayerScope, yz.g2> lVar) {
        this.layerBlock = lVar;
    }

    @m80.k
    public final x00.l<GraphicsLayerScope, yz.g2> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m3979requireCoordinator64DMado(this, NodeKind.m4118constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, Placeable.this, 0, 0, 0.0f, this.getLayerBlock(), 4, (Object) null);
            }
        }, 4, null);
    }

    public final void setLayerBlock(@m80.k x00.l<? super GraphicsLayerScope, yz.g2> lVar) {
        this.layerBlock = lVar;
    }

    @m80.k
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
