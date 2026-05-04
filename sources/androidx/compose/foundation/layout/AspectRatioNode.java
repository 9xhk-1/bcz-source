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
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,242:1\n54#2:243\n59#2:245\n85#3:244\n90#3:246\n80#3:254\n80#3:257\n80#3:260\n80#3:263\n26#4:247\n26#4:248\n26#4:249\n26#4:250\n26#4:252\n26#4:255\n26#4:258\n26#4:261\n1#5:251\n30#6:253\n30#6:256\n30#6:259\n30#6:262\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n117#1:243\n117#1:245\n117#1:244\n117#1:246\n194#1:254\n207#1:257\n219#1:260\n230#1:263\n130#1:247\n140#1:248\n150#1:249\n160#1:250\n191#1:252\n204#1:255\n216#1:258\n227#1:261\n194#1:253\n207#1:256\n219#1:259\n230#1:262\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f11, boolean z11) {
        this.aspectRatio = f11;
        this.matchHeightConstraintsFirst = z11;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m625findSizeToXhtMw(long j11) {
        if (this.matchHeightConstraintsFirst) {
            long m626tryMaxHeightJN0ABg = m626tryMaxHeightJN0ABg(j11, true);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m5284equalsimpl0(m626tryMaxHeightJN0ABg, companion.m5291getZeroYbymL2g())) {
                return m626tryMaxHeightJN0ABg;
            }
            long m627tryMaxWidthJN0ABg = m627tryMaxWidthJN0ABg(j11, true);
            if (!IntSize.m5284equalsimpl0(m627tryMaxWidthJN0ABg, companion.m5291getZeroYbymL2g())) {
                return m627tryMaxWidthJN0ABg;
            }
            long m628tryMinHeightJN0ABg = m628tryMinHeightJN0ABg(j11, true);
            if (!IntSize.m5284equalsimpl0(m628tryMinHeightJN0ABg, companion.m5291getZeroYbymL2g())) {
                return m628tryMinHeightJN0ABg;
            }
            long m629tryMinWidthJN0ABg = m629tryMinWidthJN0ABg(j11, true);
            if (!IntSize.m5284equalsimpl0(m629tryMinWidthJN0ABg, companion.m5291getZeroYbymL2g())) {
                return m629tryMinWidthJN0ABg;
            }
            long m626tryMaxHeightJN0ABg2 = m626tryMaxHeightJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m626tryMaxHeightJN0ABg2, companion.m5291getZeroYbymL2g())) {
                return m626tryMaxHeightJN0ABg2;
            }
            long m627tryMaxWidthJN0ABg2 = m627tryMaxWidthJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m627tryMaxWidthJN0ABg2, companion.m5291getZeroYbymL2g())) {
                return m627tryMaxWidthJN0ABg2;
            }
            long m628tryMinHeightJN0ABg2 = m628tryMinHeightJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m628tryMinHeightJN0ABg2, companion.m5291getZeroYbymL2g())) {
                return m628tryMinHeightJN0ABg2;
            }
            long m629tryMinWidthJN0ABg2 = m629tryMinWidthJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m629tryMinWidthJN0ABg2, companion.m5291getZeroYbymL2g())) {
                return m629tryMinWidthJN0ABg2;
            }
        } else {
            long m627tryMaxWidthJN0ABg3 = m627tryMaxWidthJN0ABg(j11, true);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m5284equalsimpl0(m627tryMaxWidthJN0ABg3, companion2.m5291getZeroYbymL2g())) {
                return m627tryMaxWidthJN0ABg3;
            }
            long m626tryMaxHeightJN0ABg3 = m626tryMaxHeightJN0ABg(j11, true);
            if (!IntSize.m5284equalsimpl0(m626tryMaxHeightJN0ABg3, companion2.m5291getZeroYbymL2g())) {
                return m626tryMaxHeightJN0ABg3;
            }
            long m629tryMinWidthJN0ABg3 = m629tryMinWidthJN0ABg(j11, true);
            if (!IntSize.m5284equalsimpl0(m629tryMinWidthJN0ABg3, companion2.m5291getZeroYbymL2g())) {
                return m629tryMinWidthJN0ABg3;
            }
            long m628tryMinHeightJN0ABg3 = m628tryMinHeightJN0ABg(j11, true);
            if (!IntSize.m5284equalsimpl0(m628tryMinHeightJN0ABg3, companion2.m5291getZeroYbymL2g())) {
                return m628tryMinHeightJN0ABg3;
            }
            long m627tryMaxWidthJN0ABg4 = m627tryMaxWidthJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m627tryMaxWidthJN0ABg4, companion2.m5291getZeroYbymL2g())) {
                return m627tryMaxWidthJN0ABg4;
            }
            long m626tryMaxHeightJN0ABg4 = m626tryMaxHeightJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m626tryMaxHeightJN0ABg4, companion2.m5291getZeroYbymL2g())) {
                return m626tryMaxHeightJN0ABg4;
            }
            long m629tryMinWidthJN0ABg4 = m629tryMinWidthJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m629tryMinWidthJN0ABg4, companion2.m5291getZeroYbymL2g())) {
                return m629tryMinWidthJN0ABg4;
            }
            long m628tryMinHeightJN0ABg4 = m628tryMinHeightJN0ABg(j11, false);
            if (!IntSize.m5284equalsimpl0(m628tryMinHeightJN0ABg4, companion2.m5291getZeroYbymL2g())) {
                return m628tryMinHeightJN0ABg4;
            }
        }
        return IntSize.Companion.m5291getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m626tryMaxHeightJN0ABg(long j11, boolean z11) {
        int round;
        int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
        return (m5067getMaxHeightimpl == Integer.MAX_VALUE || (round = Math.round(((float) m5067getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z11 && !AspectRatioKt.m624isSatisfiedByNN6EwU(j11, round, m5067getMaxHeightimpl))) ? IntSize.Companion.m5291getZeroYbymL2g() : IntSize.m5281constructorimpl((round << 32) | (m5067getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m627tryMaxWidthJN0ABg(long j11, boolean z11) {
        int round;
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        return (m5068getMaxWidthimpl == Integer.MAX_VALUE || (round = Math.round(((float) m5068getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z11 && !AspectRatioKt.m624isSatisfiedByNN6EwU(j11, m5068getMaxWidthimpl, round))) ? IntSize.Companion.m5291getZeroYbymL2g() : IntSize.m5281constructorimpl((m5068getMaxWidthimpl << 32) | (round & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m628tryMinHeightJN0ABg(long j11, boolean z11) {
        int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
        int round = Math.round(m5069getMinHeightimpl * this.aspectRatio);
        return (round <= 0 || (z11 && !AspectRatioKt.m624isSatisfiedByNN6EwU(j11, round, m5069getMinHeightimpl))) ? IntSize.Companion.m5291getZeroYbymL2g() : IntSize.m5281constructorimpl((round << 32) | (m5069getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m629tryMinWidthJN0ABg(long j11, boolean z11) {
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int round = Math.round(m5070getMinWidthimpl / this.aspectRatio);
        return (round <= 0 || (z11 && !AspectRatioKt.m624isSatisfiedByNN6EwU(j11, m5070getMinWidthimpl, round))) ? IntSize.Companion.m5291getZeroYbymL2g() : IntSize.m5281constructorimpl((m5070getMinWidthimpl << 32) | (round & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        long m625findSizeToXhtMw = m625findSizeToXhtMw(j11);
        if (!IntSize.m5284equalsimpl0(m625findSizeToXhtMw, IntSize.Companion.m5291getZeroYbymL2g())) {
            j11 = Constraints.Companion.m5078fixedJhjzzOo((int) (m625findSizeToXhtMw >> 32), (int) (m625findSizeToXhtMw & 4294967295L));
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i11);
    }

    public final void setAspectRatio(float f11) {
        this.aspectRatio = f11;
    }

    public final void setMatchHeightConstraintsFirst(boolean z11) {
        this.matchHeightConstraintsFirst = z11;
    }
}
