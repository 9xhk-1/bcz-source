package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,334:1\n202#2:335\n70#3,6:336\n70#3,6:342\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n136#1:335\n166#1:336,6\n187#1:342,6\n*E\n"})
/* loaded from: classes.dex */
final class BoxMeasurePolicy implements MeasurePolicy {

    @m80.k
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(@m80.k Alignment alignment, boolean z11) {
        this.alignment = alignment;
        this.propagateMinConstraints = z11;
    }

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i11 & 2) != 0) {
            z11 = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z11);
    }

    @m80.k
    public final BoxMeasurePolicy copy(@m80.k Alignment alignment, boolean z11) {
        return new BoxMeasurePolicy(alignment, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return g0.g(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@m80.k final MeasureScope measureScope, @m80.k final List<? extends Measurable> list, long j11) {
        boolean matchesParentSize;
        boolean matchesParentSize2;
        boolean matchesParentSize3;
        int m5070getMinWidthimpl;
        int m5069getMinHeightimpl;
        Placeable mo3857measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }
            }, 4, null);
        }
        long m5056constructorimpl = this.propagateMinConstraints ? j11 : Constraints.m5056constructorimpl(j11 & ConstraintsKt.MaxDimensionsAndFocusMask);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
            if (matchesParentSize3) {
                m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
                m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
                mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.Companion.m5078fixedJhjzzOo(Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11)));
            } else {
                mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(m5056constructorimpl);
                m5070getMinWidthimpl = Math.max(Constraints.m5070getMinWidthimpl(j11), mo3857measureBRTryo0.getWidth());
                m5069getMinHeightimpl = Math.max(Constraints.m5069getMinHeightimpl(j11), mo3857measureBRTryo0.getHeight());
            }
            final int i11 = m5070getMinWidthimpl;
            final int i12 = m5069getMinHeightimpl;
            final Placeable placeable = mo3857measureBRTryo0;
            return MeasureScope.layout$default(measureScope, i11, i12, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
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
                    Alignment alignment;
                    Placeable placeable2 = Placeable.this;
                    Measurable measurable2 = measurable;
                    LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                    int i13 = i11;
                    int i14 = i12;
                    alignment = this.alignment;
                    BoxKt.placeInBox(placementScope, placeable2, measurable2, layoutDirection, i13, i14, alignment);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Constraints.m5070getMinWidthimpl(j11);
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = Constraints.m5069getMinHeightimpl(j11);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            Measurable measurable2 = list.get(i13);
            matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
            if (matchesParentSize2) {
                z11 = true;
            } else {
                Placeable mo3857measureBRTryo02 = measurable2.mo3857measureBRTryo0(m5056constructorimpl);
                placeableArr[i13] = mo3857measureBRTryo02;
                intRef.element = Math.max(intRef.element, mo3857measureBRTryo02.getWidth());
                intRef2.element = Math.max(intRef2.element, mo3857measureBRTryo02.getHeight());
            }
        }
        if (z11) {
            int i14 = intRef.element;
            int i15 = i14 != Integer.MAX_VALUE ? i14 : 0;
            int i16 = intRef2.element;
            long Constraints = ConstraintsKt.Constraints(i15, i14, i16 != Integer.MAX_VALUE ? i16 : 0, i16);
            int size2 = list2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                Measurable measurable3 = list.get(i17);
                matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                if (matchesParentSize) {
                    placeableArr[i17] = measurable3.mo3857measureBRTryo0(Constraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, intRef.element, intRef2.element, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                Alignment alignment;
                Placeable[] placeableArr2 = placeableArr;
                List<Measurable> list3 = list;
                MeasureScope measureScope2 = measureScope;
                Ref.IntRef intRef3 = intRef;
                Ref.IntRef intRef4 = intRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length) {
                    Placeable placeable2 = placeableArr2[i18];
                    g0.n(placeable2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    Measurable measurable4 = list3.get(i19);
                    LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                    int i21 = intRef3.element;
                    int i22 = intRef4.element;
                    alignment = boxMeasurePolicy.alignment;
                    BoxKt.placeInBox(placementScope, placeable2, measurable4, layoutDirection, i21, i22, alignment);
                    i18++;
                    i19++;
                }
            }
        }, 4, null);
    }

    @m80.k
    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }
}
