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
@u0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1137\n97#2:1139\n97#2:1150\n97#2:1161\n97#2:1163\n97#2:1165\n97#2:1167\n105#3:1136\n105#3:1138\n101#3,10:1140\n101#3,10:1151\n110#3:1162\n105#3:1164\n110#3:1166\n105#3:1168\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n*L\n789#1:1135\n795#1:1137\n801#1:1139\n809#1:1150\n834#1:1161\n840#1:1163\n846#1:1165\n852#1:1167\n790#1:1136\n796#1:1138\n802#1:1140,10\n810#1:1151,10\n837#1:1162\n843#1:1164\n849#1:1166\n855#1:1168\n*E\n"})
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f11, float f12, float f13, float f14, boolean z11, v vVar) {
        this(f11, f12, f13, f14, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m781getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.mo371roundToPx0680j_4(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.maxHeight
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.maxHeight
            int r3 = r7.mo371roundToPx0680j_4(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.minWidth
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.minWidth
            int r4 = r7.mo371roundToPx0680j_4(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.minHeight
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.minHeight
            int r7 = r7.mo371roundToPx0680j_4(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m781getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m782getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m783getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m784getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m785getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        long m781getTargetConstraintsOenEA2s = m781getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5065getHasFixedHeightimpl(m781getTargetConstraintsOenEA2s)) {
            return Constraints.m5067getMaxHeightimpl(m781getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i11 = ConstraintsKt.m5085constrainWidthK40F9xA(m781getTargetConstraintsOenEA2s, i11);
        }
        return ConstraintsKt.m5084constrainHeightK40F9xA(m781getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i11));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        long m781getTargetConstraintsOenEA2s = m781getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5066getHasFixedWidthimpl(m781getTargetConstraintsOenEA2s)) {
            return Constraints.m5068getMaxWidthimpl(m781getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i11 = ConstraintsKt.m5084constrainHeightK40F9xA(m781getTargetConstraintsOenEA2s, i11);
        }
        return ConstraintsKt.m5085constrainWidthK40F9xA(m781getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i11));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int m5070getMinWidthimpl;
        int m5068getMaxWidthimpl;
        int m5069getMinHeightimpl;
        int m5067getMaxHeightimpl;
        long Constraints;
        long m781getTargetConstraintsOenEA2s = m781getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m5083constrainN9IONVI(j11, m781getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
                int m5068getMaxWidthimpl2 = Constraints.m5068getMaxWidthimpl(m781getTargetConstraintsOenEA2s);
                if (m5070getMinWidthimpl > m5068getMaxWidthimpl2) {
                    m5070getMinWidthimpl = m5068getMaxWidthimpl2;
                }
            } else {
                m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(m781getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
                int m5070getMinWidthimpl2 = Constraints.m5070getMinWidthimpl(m781getTargetConstraintsOenEA2s);
                if (m5068getMaxWidthimpl < m5070getMinWidthimpl2) {
                    m5068getMaxWidthimpl = m5070getMinWidthimpl2;
                }
            } else {
                m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(m781getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
                int m5067getMaxHeightimpl2 = Constraints.m5067getMaxHeightimpl(m781getTargetConstraintsOenEA2s);
                if (m5069getMinHeightimpl > m5067getMaxHeightimpl2) {
                    m5069getMinHeightimpl = m5067getMaxHeightimpl2;
                }
            } else {
                m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(m781getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
                int m5069getMinHeightimpl2 = Constraints.m5069getMinHeightimpl(m781getTargetConstraintsOenEA2s);
                if (m5067getMaxHeightimpl < m5069getMinHeightimpl2) {
                    m5067getMaxHeightimpl = m5069getMinHeightimpl2;
                }
            } else {
                m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(m781getTargetConstraintsOenEA2s);
            }
            Constraints = ConstraintsKt.Constraints(m5070getMinWidthimpl, m5068getMaxWidthimpl, m5069getMinHeightimpl, m5067getMaxHeightimpl);
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long m781getTargetConstraintsOenEA2s = m781getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5065getHasFixedHeightimpl(m781getTargetConstraintsOenEA2s)) {
            return Constraints.m5067getMaxHeightimpl(m781getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i11 = ConstraintsKt.m5085constrainWidthK40F9xA(m781getTargetConstraintsOenEA2s, i11);
        }
        return ConstraintsKt.m5084constrainHeightK40F9xA(m781getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i11));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        long m781getTargetConstraintsOenEA2s = m781getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5066getHasFixedWidthimpl(m781getTargetConstraintsOenEA2s)) {
            return Constraints.m5068getMaxWidthimpl(m781getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i11 = ConstraintsKt.m5084constrainHeightK40F9xA(m781getTargetConstraintsOenEA2s, i11);
        }
        return ConstraintsKt.m5085constrainWidthK40F9xA(m781getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i11));
    }

    public final void setEnforceIncoming(boolean z11) {
        this.enforceIncoming = z11;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m786setMaxHeight0680j_4(float f11) {
        this.maxHeight = f11;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m787setMaxWidth0680j_4(float f11) {
        this.maxWidth = f11;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m788setMinHeight0680j_4(float f11) {
        this.minHeight = f11;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m789setMinWidth0680j_4(float f11) {
        this.minWidth = f11;
    }

    public /* synthetic */ SizeNode(float f11, float f12, float f13, float f14, boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f11, (i11 & 2) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f12, (i11 & 4) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f13, (i11 & 8) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f14, z11, null);
    }

    private SizeNode(float f11, float f12, float f13, float f14, boolean z11) {
        this.minWidth = f11;
        this.minHeight = f12;
        this.maxWidth = f13;
        this.maxHeight = f14;
        this.enforceIncoming = z11;
    }
}
