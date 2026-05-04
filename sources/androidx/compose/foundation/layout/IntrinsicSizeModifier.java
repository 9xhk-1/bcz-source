package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public abstract long mo679calculateContentConstraintsl58MMJ0(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11);

    public abstract boolean getEnforceIncoming();

    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        long mo679calculateContentConstraintsl58MMJ0 = mo679calculateContentConstraintsl58MMJ0(measureScope, measurable, j11);
        if (getEnforceIncoming()) {
            mo679calculateContentConstraintsl58MMJ0 = ConstraintsKt.m5083constrainN9IONVI(j11, mo679calculateContentConstraintsl58MMJ0);
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(mo679calculateContentConstraintsl58MMJ0);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
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
                Placeable.PlacementScope.m3922placeRelative70tqf50$default(placementScope, Placeable.this, IntOffset.Companion.m5254getZeronOccac(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.minIntrinsicWidth(i11);
    }
}
