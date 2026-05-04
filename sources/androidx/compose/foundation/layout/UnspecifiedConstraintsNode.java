package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1146\n97#2:1157\n97#2:1159\n97#2:1161\n97#2:1163\n101#3,10:1136\n101#3,10:1147\n105#3:1158\n105#3:1160\n105#3:1162\n105#3:1164\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n*L\n1079#1:1135\n1085#1:1146\n1102#1:1157\n1110#1:1159\n1118#1:1161\n1126#1:1163\n1080#1:1136,10\n1086#1:1147,10\n1102#1:1158\n1110#1:1160\n1118#1:1162\n1126#1:1164\n*E\n"})
/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f11, float f12, v vVar) {
        this(f11, f12);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m792getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m793getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i11);
        int mo371roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo371roundToPx0680j_4(this.minHeight) : 0;
        return maxIntrinsicHeight < mo371roundToPx0680j_4 ? mo371roundToPx0680j_4 : maxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i11);
        int mo371roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo371roundToPx0680j_4(this.minWidth) : 0;
        return maxIntrinsicWidth < mo371roundToPx0680j_4 ? mo371roundToPx0680j_4 : maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int m5070getMinWidthimpl;
        int m5069getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m5070getMinWidthimpl(j11) != 0) {
            m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        } else {
            int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4(this.minWidth);
            m5070getMinWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
            if (mo371roundToPx0680j_4 < 0) {
                mo371roundToPx0680j_4 = 0;
            }
            if (mo371roundToPx0680j_4 <= m5070getMinWidthimpl) {
                m5070getMinWidthimpl = mo371roundToPx0680j_4;
            }
        }
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        if (Float.isNaN(this.minHeight) || Constraints.m5069getMinHeightimpl(j11) != 0) {
            m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
        } else {
            int mo371roundToPx0680j_42 = measureScope.mo371roundToPx0680j_4(this.minHeight);
            m5069getMinHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
            int i11 = mo371roundToPx0680j_42 >= 0 ? mo371roundToPx0680j_42 : 0;
            if (i11 <= m5069getMinHeightimpl) {
                m5069getMinHeightimpl = i11;
            }
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.Constraints(m5070getMinWidthimpl, m5068getMaxWidthimpl, m5069getMinHeightimpl, Constraints.m5067getMaxHeightimpl(j11)));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i11);
        int mo371roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo371roundToPx0680j_4(this.minHeight) : 0;
        return minIntrinsicHeight < mo371roundToPx0680j_4 ? mo371roundToPx0680j_4 : minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i11);
        int mo371roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo371roundToPx0680j_4(this.minWidth) : 0;
        return minIntrinsicWidth < mo371roundToPx0680j_4 ? mo371roundToPx0680j_4 : minIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m794setMinHeight0680j_4(float f11) {
        this.minHeight = f11;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m795setMinWidth0680j_4(float f11) {
        this.minWidth = f11;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f11, float f12, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f11, (i11 & 2) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f12, null);
    }

    private UnspecifiedConstraintsNode(float f11, float f12) {
        this.minWidth = f11;
        this.minHeight = f12;
    }
}
