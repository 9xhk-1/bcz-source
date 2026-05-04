package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n26#2:1135\n26#2:1146\n101#3,10:1136\n101#3,10:1147\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n*L\n700#1:1135\n713#1:1146\n701#1:1136,10\n714#1:1147,10\n*E\n"})
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {

    @m80.k
    private Direction direction;
    private float fraction;

    public FillNode(@m80.k Direction direction, float f11) {
        this.direction = direction;
        this.fraction = f11;
    }

    @m80.k
    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int m5070getMinWidthimpl;
        int m5068getMaxWidthimpl;
        int m5067getMaxHeightimpl;
        int i11;
        if (!Constraints.m5064getHasBoundedWidthimpl(j11) || this.direction == Direction.Vertical) {
            m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
            m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        } else {
            int round = Math.round(Constraints.m5068getMaxWidthimpl(j11) * this.fraction);
            int m5070getMinWidthimpl2 = Constraints.m5070getMinWidthimpl(j11);
            m5070getMinWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
            if (round < m5070getMinWidthimpl2) {
                round = m5070getMinWidthimpl2;
            }
            if (round <= m5070getMinWidthimpl) {
                m5070getMinWidthimpl = round;
            }
            m5068getMaxWidthimpl = m5070getMinWidthimpl;
        }
        if (!Constraints.m5063getHasBoundedHeightimpl(j11) || this.direction == Direction.Horizontal) {
            int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
            m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
            i11 = m5069getMinHeightimpl;
        } else {
            int round2 = Math.round(Constraints.m5067getMaxHeightimpl(j11) * this.fraction);
            int m5069getMinHeightimpl2 = Constraints.m5069getMinHeightimpl(j11);
            i11 = Constraints.m5067getMaxHeightimpl(j11);
            if (round2 < m5069getMinHeightimpl2) {
                round2 = m5069getMinHeightimpl2;
            }
            if (round2 <= i11) {
                i11 = round2;
            }
            m5067getMaxHeightimpl = i11;
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.Constraints(m5070getMinWidthimpl, m5068getMaxWidthimpl, i11, m5067getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setDirection(@m80.k Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f11) {
        this.fraction = f11;
    }
}
