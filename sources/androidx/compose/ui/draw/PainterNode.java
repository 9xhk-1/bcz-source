package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,364:1\n148#2:365\n33#2:378\n33#2:401\n33#2:431\n57#3:366\n57#3:369\n61#3:372\n61#3:375\n57#3:382\n61#3:385\n57#3:387\n61#3:394\n57#3:405\n61#3:412\n57#3:419\n57#3:422\n61#3:425\n61#3:428\n57#3:435\n61#3:438\n57#3:440\n61#3:447\n57#3:451\n61#3:458\n57#3:469\n61#3:473\n60#4:367\n60#4:370\n70#4:373\n70#4:376\n53#4,3:379\n60#4:383\n70#4:386\n60#4:388\n70#4:395\n53#4,3:402\n60#4:406\n70#4:413\n60#4:420\n60#4:423\n70#4:426\n70#4:429\n53#4,3:432\n60#4:436\n70#4:439\n60#4:441\n70#4:448\n80#4:450\n60#4:452\n70#4:459\n80#4:461\n60#4:470\n70#4:474\n22#5:368\n22#5:371\n22#5:374\n22#5:377\n22#5:384\n22#5,5:389\n22#5,5:396\n22#5,5:407\n22#5,5:414\n22#5:421\n22#5:424\n22#5:427\n22#5:430\n22#5:437\n22#5,5:442\n22#5,5:453\n22#5:471\n22#5:475\n30#6:449\n30#6:460\n120#7,3:462\n124#7,3:466\n1#8:465\n139#9:472\n139#9:476\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:365\n245#1:378\n289#1:401\n318#1:431\n233#1:366\n235#1:369\n240#1:372\n242#1:375\n246#1:382\n246#1:385\n272#1:387\n279#1:394\n297#1:405\n298#1:412\n306#1:419\n308#1:422\n313#1:425\n315#1:428\n323#1:435\n323#1:438\n331#1:440\n331#1:447\n332#1:451\n332#1:458\n351#1:469\n354#1:473\n233#1:367\n235#1:370\n240#1:373\n242#1:376\n245#1:379,3\n246#1:383\n246#1:386\n272#1:388\n279#1:395\n289#1:402,3\n297#1:406\n298#1:413\n306#1:420\n308#1:423\n313#1:426\n315#1:429\n318#1:432,3\n323#1:436\n323#1:439\n331#1:441\n331#1:448\n331#1:450\n332#1:452\n332#1:459\n332#1:461\n351#1:470\n354#1:474\n233#1:368\n235#1:371\n240#1:374\n242#1:377\n246#1:384\n272#1:389,5\n279#1:396,5\n297#1:407,5\n298#1:414,5\n306#1:421\n308#1:424\n313#1:427\n315#1:430\n323#1:437\n331#1:442,5\n332#1:453,5\n351#1:471\n354#1:475\n331#1:449\n332#1:460\n343#1:462,3\n343#1:466,3\n351#1:472\n354#1:476\n*E\n"})
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @k
    private Alignment alignment;
    private float alpha;

    @l
    private ColorFilter colorFilter;

    @k
    private ContentScale contentScale;

    @k
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z11, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, v vVar) {
        this(painter, z11, (i11 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i11 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i11 & 16) != 0 ? 1.0f : f11, (i11 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m2131calculateScaledSizeE7KxVPU(long j11) {
        if (!getUseIntrinsicSize()) {
            return j11;
        }
        long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(!m2133hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo3180getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j11 >> 32)) : Float.intBitsToFloat((int) (this.painter.mo3180getIntrinsicSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(!m2132hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo3180getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j11 & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.mo3180getIntrinsicSizeNHjbRc() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j11 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j11 & 4294967295L)) == 0.0f) ? Size.Companion.m2346getZeroNHjbRc() : ScaleFactorKt.m3961timesUQTWf7w(m2328constructorimpl, this.contentScale.mo3850computeScaleFactorH7hwNQA(m2328constructorimpl, j11));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo3180getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m2132hasSpecifiedAndFiniteHeightuvyYCjk(long j11) {
        return !Size.m2333equalsimpl0(j11, Size.Companion.m2345getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m2133hasSpecifiedAndFiniteWidthuvyYCjk(long j11) {
        return !Size.m2333equalsimpl0(j11, Size.Companion.m2345getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m2134modifyConstraintsZezNO4M(long j11) {
        boolean z11 = false;
        boolean z12 = Constraints.m5064getHasBoundedWidthimpl(j11) && Constraints.m5063getHasBoundedHeightimpl(j11);
        if (Constraints.m5066getHasFixedWidthimpl(j11) && Constraints.m5065getHasFixedHeightimpl(j11)) {
            z11 = true;
        }
        if ((!getUseIntrinsicSize() && z12) || z11) {
            return Constraints.m5058copyZbe2FdA$default(j11, Constraints.m5068getMaxWidthimpl(j11), 0, Constraints.m5067getMaxHeightimpl(j11), 0, 10, null);
        }
        long mo3180getIntrinsicSizeNHjbRc = this.painter.mo3180getIntrinsicSizeNHjbRc();
        int round = m2133hasSpecifiedAndFiniteWidthuvyYCjk(mo3180getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo3180getIntrinsicSizeNHjbRc >> 32))) : Constraints.m5070getMinWidthimpl(j11);
        int round2 = m2132hasSpecifiedAndFiniteHeightuvyYCjk(mo3180getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo3180getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m5069getMinHeightimpl(j11);
        int m5085constrainWidthK40F9xA = ConstraintsKt.m5085constrainWidthK40F9xA(j11, round);
        long m2131calculateScaledSizeE7KxVPU = m2131calculateScaledSizeE7KxVPU(Size.m2328constructorimpl((Float.floatToRawIntBits(ConstraintsKt.m5084constrainHeightK40F9xA(j11, round2)) & 4294967295L) | (Float.floatToRawIntBits(m5085constrainWidthK40F9xA) << 32)));
        return Constraints.m5058copyZbe2FdA$default(j11, ConstraintsKt.m5085constrainWidthK40F9xA(j11, Math.round(Float.intBitsToFloat((int) (m2131calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m5084constrainHeightK40F9xA(j11, Math.round(Float.intBitsToFloat((int) (m2131calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        long mo3180getIntrinsicSizeNHjbRc = this.painter.mo3180getIntrinsicSizeNHjbRc();
        float intBitsToFloat = m2133hasSpecifiedAndFiniteWidthuvyYCjk(mo3180getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo3180getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = m2132hasSpecifiedAndFiniteHeightuvyYCjk(mo3180getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo3180getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() & 4294967295L));
        long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        long m2346getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.Companion.m2346getZeroNHjbRc() : ScaleFactorKt.m3961timesUQTWf7w(m2328constructorimpl, this.contentScale.mo3850computeScaleFactorH7hwNQA(m2328constructorimpl, contentDrawScope.mo3060getSizeNHjbRc()));
        long mo2085alignKFBX0sM = this.alignment.mo2085alignKFBX0sM(IntSize.m5281constructorimpl((Math.round(Float.intBitsToFloat((int) (m2346getZeroNHjbRc & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (m2346getZeroNHjbRc >> 32))) << 32)), IntSize.m5281constructorimpl((Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() & 4294967295L))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float m5243getXimpl = IntOffset.m5243getXimpl(mo2085alignKFBX0sM);
        float m5244getYimpl = IntOffset.m5244getYimpl(mo2085alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m5243getXimpl, m5244getYimpl);
        try {
            this.painter.m3186drawx_KDEd0(contentDrawScope, m2346getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-m5243getXimpl, -m5244getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th2) {
            contentDrawScope.getDrawContext().getTransform().translate(-m5243getXimpl, -m5244getYimpl);
            throw th2;
        }
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @k
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @k
    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i11);
        }
        long m2134modifyConstraintsZezNO4M = m2134modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null));
        return Math.max(Constraints.m5069getMinHeightimpl(m2134modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i11));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i11);
        }
        long m2134modifyConstraintsZezNO4M = m2134modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null));
        return Math.max(Constraints.m5070getMinWidthimpl(m2134modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i11));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(m2134modifyConstraintsZezNO4M(j11));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
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
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i11);
        }
        long m2134modifyConstraintsZezNO4M = m2134modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null));
        return Math.max(Constraints.m5069getMinHeightimpl(m2134modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i11));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i11);
        }
        long m2134modifyConstraintsZezNO4M = m2134modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null));
        return Math.max(Constraints.m5070getMinWidthimpl(m2134modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i11));
    }

    public final void setAlignment(@k Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f11) {
        this.alpha = f11;
    }

    public final void setColorFilter(@l ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(@k ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(@k Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z11) {
        this.sizeToIntrinsics = z11;
    }

    @k
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(@k Painter painter, boolean z11, @k Alignment alignment, @k ContentScale contentScale, float f11, @l ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z11;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f11;
        this.colorFilter = colorFilter;
    }
}
