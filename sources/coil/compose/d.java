package coil.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 utils.kt\ncoil/compose/UtilsKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,249:1\n152#2:250\n152#2:251\n152#2:252\n152#2:253\n159#2:254\n159#2:257\n181#3:255\n181#3:256\n66#4:258\n70#4:259\n66#4,5:260\n121#5,4:265\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterNode\n*L\n104#1:250\n118#1:251\n132#1:252\n147#1:253\n164#1:254\n191#1:257\n169#1:255\n170#1:256\n209#1:258\n211#1:259\n223#1:260,5\n239#1:265,4\n*E\n"})
/* loaded from: classes3.dex */
public final class d extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9661f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public Painter f9662a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public Alignment f9663b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public ContentScale f9664c;

    /* renamed from: d, reason: collision with root package name */
    public float f9665d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public ColorFilter f9666e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<Placeable.PlacementScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f9667a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f9667a = placeable;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.f9667a, 0, 0, 0.0f, 4, null);
        }
    }

    public d(@m80.k Painter painter, @m80.k Alignment alignment, @m80.k ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter) {
        this.f9662a = painter;
        this.f9663b = alignment;
        this.f9664c = contentScale;
        this.f9665d = f11;
        this.f9666e = colorFilter;
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    public final long m5629calculateScaledSizeE7KxVPU(long j11) {
        if (Size.m2339isEmptyimpl(j11)) {
            return Size.Companion.m2346getZeroNHjbRc();
        }
        long mo3180getIntrinsicSizeNHjbRc = this.f9662a.mo3180getIntrinsicSizeNHjbRc();
        if (mo3180getIntrinsicSizeNHjbRc == Size.Companion.m2345getUnspecifiedNHjbRc()) {
            return j11;
        }
        float m2337getWidthimpl = Size.m2337getWidthimpl(mo3180getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(m2337getWidthimpl) || Float.isNaN(m2337getWidthimpl)) {
            m2337getWidthimpl = Size.m2337getWidthimpl(j11);
        }
        float m2334getHeightimpl = Size.m2334getHeightimpl(mo3180getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(m2334getHeightimpl) || Float.isNaN(m2334getHeightimpl)) {
            m2334getHeightimpl = Size.m2334getHeightimpl(j11);
        }
        long Size = SizeKt.Size(m2337getWidthimpl, m2334getHeightimpl);
        long mo3850computeScaleFactorH7hwNQA = this.f9664c.mo3850computeScaleFactorH7hwNQA(Size, j11);
        float m3946getScaleXimpl = ScaleFactor.m3946getScaleXimpl(mo3850computeScaleFactorH7hwNQA);
        if (Float.isInfinite(m3946getScaleXimpl) || Float.isNaN(m3946getScaleXimpl)) {
            return j11;
        }
        float m3947getScaleYimpl = ScaleFactor.m3947getScaleYimpl(mo3850computeScaleFactorH7hwNQA);
        return (Float.isInfinite(m3947getScaleYimpl) || Float.isNaN(m3947getScaleYimpl)) ? j11 : ScaleFactorKt.m3962timesmw2e94(mo3850computeScaleFactorH7hwNQA, Size);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        long m5629calculateScaledSizeE7KxVPU = m5629calculateScaledSizeE7KxVPU(contentDrawScope.mo3060getSizeNHjbRc());
        long mo2085alignKFBX0sM = this.f9663b.mo2085alignKFBX0sM(q.k(m5629calculateScaledSizeE7KxVPU), q.k(contentDrawScope.mo3060getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float m5235component1impl = IntOffset.m5235component1impl(mo2085alignKFBX0sM);
        float m5236component2impl = IntOffset.m5236component2impl(mo2085alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m5235component1impl, m5236component2impl);
        this.f9662a.m3186drawx_KDEd0(contentDrawScope, m5629calculateScaledSizeE7KxVPU, this.f9665d, this.f9666e);
        contentDrawScope.getDrawContext().getTransform().translate(-m5235component1impl, -m5236component2impl);
        contentDrawScope.drawContent();
    }

    @m80.k
    public final Alignment getAlignment() {
        return this.f9663b;
    }

    public final float getAlpha() {
        return this.f9665d;
    }

    @m80.l
    public final ColorFilter getColorFilter() {
        return this.f9666e;
    }

    @m80.k
    public final ContentScale getContentScale() {
        return this.f9664c;
    }

    @m80.k
    public final Painter getPainter() {
        return this.f9662a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (this.f9662a.mo3180getIntrinsicSizeNHjbRc() == Size.Companion.m2345getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i11);
        }
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m5068getMaxWidthimpl(m5630modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null))));
        return Math.max(c10.d.L0(Size.m2334getHeightimpl(m5629calculateScaledSizeE7KxVPU(SizeKt.Size(i11, maxIntrinsicHeight)))), maxIntrinsicHeight);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (this.f9662a.mo3180getIntrinsicSizeNHjbRc() == Size.Companion.m2345getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i11);
        }
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m5067getMaxHeightimpl(m5630modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null))));
        return Math.max(c10.d.L0(Size.m2337getWidthimpl(m5629calculateScaledSizeE7KxVPU(SizeKt.Size(maxIntrinsicWidth, i11)))), maxIntrinsicWidth);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(m5630modifyConstraintsZezNO4M(j11));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new a(mo3857measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (this.f9662a.mo3180getIntrinsicSizeNHjbRc() == Size.Companion.m2345getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.minIntrinsicHeight(i11);
        }
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m5068getMaxWidthimpl(m5630modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null))));
        return Math.max(c10.d.L0(Size.m2334getHeightimpl(m5629calculateScaledSizeE7KxVPU(SizeKt.Size(i11, minIntrinsicHeight)))), minIntrinsicHeight);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (this.f9662a.mo3180getIntrinsicSizeNHjbRc() == Size.Companion.m2345getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.minIntrinsicWidth(i11);
        }
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m5067getMaxHeightimpl(m5630modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null))));
        return Math.max(c10.d.L0(Size.m2337getWidthimpl(m5629calculateScaledSizeE7KxVPU(SizeKt.Size(minIntrinsicWidth, i11)))), minIntrinsicWidth);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m5630modifyConstraintsZezNO4M(long j11) {
        float m5070getMinWidthimpl;
        int m5069getMinHeightimpl;
        float a11;
        boolean m5066getHasFixedWidthimpl = Constraints.m5066getHasFixedWidthimpl(j11);
        boolean m5065getHasFixedHeightimpl = Constraints.m5065getHasFixedHeightimpl(j11);
        if (!m5066getHasFixedWidthimpl || !m5065getHasFixedHeightimpl) {
            boolean z11 = Constraints.m5064getHasBoundedWidthimpl(j11) && Constraints.m5063getHasBoundedHeightimpl(j11);
            long mo3180getIntrinsicSizeNHjbRc = this.f9662a.mo3180getIntrinsicSizeNHjbRc();
            if (mo3180getIntrinsicSizeNHjbRc != Size.Companion.m2345getUnspecifiedNHjbRc()) {
                if (z11 && (m5066getHasFixedWidthimpl || m5065getHasFixedHeightimpl)) {
                    m5070getMinWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
                    m5069getMinHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
                } else {
                    float m2337getWidthimpl = Size.m2337getWidthimpl(mo3180getIntrinsicSizeNHjbRc);
                    float m2334getHeightimpl = Size.m2334getHeightimpl(mo3180getIntrinsicSizeNHjbRc);
                    m5070getMinWidthimpl = (Float.isInfinite(m2337getWidthimpl) || Float.isNaN(m2337getWidthimpl)) ? Constraints.m5070getMinWidthimpl(j11) : q.b(j11, m2337getWidthimpl);
                    if (!Float.isInfinite(m2334getHeightimpl) && !Float.isNaN(m2334getHeightimpl)) {
                        a11 = q.a(j11, m2334getHeightimpl);
                        long m5629calculateScaledSizeE7KxVPU = m5629calculateScaledSizeE7KxVPU(SizeKt.Size(m5070getMinWidthimpl, a11));
                        return Constraints.m5058copyZbe2FdA$default(j11, ConstraintsKt.m5085constrainWidthK40F9xA(j11, c10.d.L0(Size.m2337getWidthimpl(m5629calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m5084constrainHeightK40F9xA(j11, c10.d.L0(Size.m2334getHeightimpl(m5629calculateScaledSizeE7KxVPU))), 0, 10, null);
                    }
                    m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
                }
                a11 = m5069getMinHeightimpl;
                long m5629calculateScaledSizeE7KxVPU2 = m5629calculateScaledSizeE7KxVPU(SizeKt.Size(m5070getMinWidthimpl, a11));
                return Constraints.m5058copyZbe2FdA$default(j11, ConstraintsKt.m5085constrainWidthK40F9xA(j11, c10.d.L0(Size.m2337getWidthimpl(m5629calculateScaledSizeE7KxVPU2))), 0, ConstraintsKt.m5084constrainHeightK40F9xA(j11, c10.d.L0(Size.m2334getHeightimpl(m5629calculateScaledSizeE7KxVPU2))), 0, 10, null);
            }
            if (z11) {
                return Constraints.m5058copyZbe2FdA$default(j11, Constraints.m5068getMaxWidthimpl(j11), 0, Constraints.m5067getMaxHeightimpl(j11), 0, 10, null);
            }
        }
        return j11;
    }

    public final void setAlignment(@m80.k Alignment alignment) {
        this.f9663b = alignment;
    }

    public final void setAlpha(float f11) {
        this.f9665d = f11;
    }

    public final void setColorFilter(@m80.l ColorFilter colorFilter) {
        this.f9666e = colorFilter;
    }

    public final void setContentScale(@m80.k ContentScale contentScale) {
        this.f9664c = contentScale;
    }

    public final void setPainter(@m80.k Painter painter) {
        this.f9662a = painter;
    }
}
