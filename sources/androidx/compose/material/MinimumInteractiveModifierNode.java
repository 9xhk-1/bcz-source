package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.DpSize;
import c10.d;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        long j12;
        boolean z11 = isAttached() && ((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement())).booleanValue();
        j12 = InteractiveComponentSizeKt.minimumInteractiveComponentSize;
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        final int max = z11 ? Math.max(mo3857measureBRTryo0.getWidth(), measureScope.mo371roundToPx0680j_4(DpSize.m5213getWidthD9Ej5fM(j12))) : mo3857measureBRTryo0.getWidth();
        final int max2 = z11 ? Math.max(mo3857measureBRTryo0.getHeight(), measureScope.mo371roundToPx0680j_4(DpSize.m5211getHeightD9Ej5fM(j12))) : mo3857measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, max, max2, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.MinimumInteractiveModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, d.L0((max - mo3857measureBRTryo0.getWidth()) / 2.0f), d.L0((max2 - mo3857measureBRTryo0.getHeight()) / 2.0f), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
