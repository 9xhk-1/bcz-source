package androidx.compose.foundation.layout;

import a00.a0;
import a00.d1;
import a00.h0;
import a00.r0;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1594:1\n989#2,33:1595\n1022#2,40:1629\n954#2,4:1669\n958#2,11:1677\n969#2:1689\n1107#2,115:1690\n1#3:1628\n70#4,4:1673\n75#4:1688\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n890#1:1595,33\n890#1:1629,40\n907#1:1669,4\n907#1:1677,11\n907#1:1689\n924#1:1690,115\n890#1:1628\n907#1:1673,4\n907#1:1688\n*E\n"})
/* loaded from: classes.dex */
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {

    @m80.k
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;

    @m80.k
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;

    @m80.k
    private final FlowLayoutOverflowState overflow;

    @m80.k
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f11, CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, v vVar) {
        this(z11, horizontal, vertical, f11, crossAxisAlignment, f12, i11, i12, flowLayoutOverflowState);
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m669component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m670component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.maxItemsInMainAxis;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final FlowLayoutOverflowState component9() {
        return this.overflow;
    }

    /* renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m671copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f11, CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = flowMeasurePolicy.isHorizontal;
        }
        if ((i13 & 2) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i13 & 4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((i13 & 8) != 0) {
            f11 = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((i13 & 16) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((i13 & 32) != 0) {
            f12 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((i13 & 64) != 0) {
            i11 = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i13 & 128) != 0) {
            i12 = flowMeasurePolicy.maxLines;
        }
        if ((i13 & 256) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        int i14 = i12;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        float f13 = f12;
        int i15 = i11;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        Arrangement.Vertical vertical2 = vertical;
        return flowMeasurePolicy.m672copyQuyCDyQ(z11, horizontal, vertical2, f11, crossAxisAlignment2, f13, i15, i14, flowLayoutOverflowState2);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    @m80.k
    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    @m80.k
    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    @m80.k
    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    @m80.k
    /* renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m672copyQuyCDyQ(boolean z11, @m80.k Arrangement.Horizontal horizontal, @m80.k Arrangement.Vertical vertical, float f11, @m80.k CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, @m80.k FlowLayoutOverflowState flowLayoutOverflowState) {
        return new FlowMeasurePolicy(z11, horizontal, vertical, f11, crossAxisAlignment, f12, i11, i12, flowLayoutOverflowState, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && g0.g(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && g0.g(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.m5120equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && g0.g(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.m5120equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && g0.g(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @m80.k
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @m80.k
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @m80.k
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m5121hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m5121hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public final int intrinsicCrossAxisSize(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12, int i13, int i14, int i15, @m80.k FlowLayoutOverflowState flowLayoutOverflowState) {
        long m17constructorimpl;
        int i16 = 0;
        if (list.isEmpty()) {
            m17constructorimpl = IntIntPair.m17constructorimpl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i14, flowLayoutOverflowState, OrientationIndependentConstraints.m693constructorimpl(0, i11, 0, Integer.MAX_VALUE), i15, i12, i13, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) r0.b3(list, 0);
            int minCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable, i11) : 0;
            int minMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable, minCrossAxisIntrinsicItemSize) : 0;
            int i17 = 0;
            if (flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m17constructorimpl(i11, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(minMainAxisIntrinsicItemSize, minCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).isLastItemInContainer()) {
                IntIntPair m653ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m653ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
                m17constructorimpl = IntIntPair.m17constructorimpl(m653ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m22getSecondimpl(m653ellipsisSizeF35zmw$foundation_layout_release.m25unboximpl()) : 0, 0);
            } else {
                int size = list.size();
                int i18 = i11;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    if (i19 >= size) {
                        break;
                    }
                    int i25 = i18 - minMainAxisIntrinsicItemSize;
                    int i26 = i19 + 1;
                    int max = Math.max(i24, minCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) r0.b3(list, i26);
                    int minCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, i11) : i16;
                    int minMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable2, minCrossAxisIntrinsicItemSize2) + i12 : i16;
                    boolean z11 = i19 + 2 < list.size();
                    int i27 = i26 - i22;
                    int i28 = i23;
                    int i29 = minMainAxisIntrinsicItemSize2;
                    int i31 = minCrossAxisIntrinsicItemSize2;
                    FlowLayoutBuildingBlocks.WrapInfo m648getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(z11, i27, IntIntPair.m17constructorimpl(i25, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(minMainAxisIntrinsicItemSize2, minCrossAxisIntrinsicItemSize2)), i28, i17, max, false, false);
                    if (m648getWrapInfoOpUlnko.isLastItemInLine()) {
                        int i32 = i17 + max + i13;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m648getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i28, i32, i25, i27);
                        int i33 = i29 - i12;
                        i23 = i28 + 1;
                        if (m648getWrapInfoOpUlnko.isLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long m649getEllipsisSizeOO21N7I = wrapEllipsisInfo.m649getEllipsisSizeOO21N7I();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    i32 += IntIntPair.m22getSecondimpl(m649getEllipsisSizeOO21N7I) + i13;
                                }
                            }
                            i17 = i32;
                            i21 = i26;
                        } else {
                            i17 = i32;
                            minMainAxisIntrinsicItemSize = i33;
                            i22 = i26;
                            i24 = 0;
                            i18 = i11;
                        }
                    } else {
                        i18 = i25;
                        i23 = i28;
                        i24 = max;
                        minMainAxisIntrinsicItemSize = i29;
                    }
                    minCrossAxisIntrinsicItemSize = i31;
                    i19 = i26;
                    i21 = i19;
                    i16 = 0;
                }
                m17constructorimpl = IntIntPair.m17constructorimpl(i17 - i13, i21);
            }
        }
        return IntIntPair.m21getFirstimpl(m17constructorimpl);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) r0.b3(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) r0.L2(list2) : null;
        List list3 = (List) r0.b3(list, 2);
        flowLayoutOverflowState.m655setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) r0.L2(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) r0.L2(list);
            if (list4 == null) {
                list4 = h0.J();
            }
            return intrinsicCrossAxisSize(list4, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo371roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list5 = (List) r0.L2(list);
        if (list5 == null) {
            list5 = h0.J();
        }
        return maxIntrinsicMainAxisSize(list5, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing));
    }

    public final int maxIntrinsicMainAxisSize(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
        int i13 = this.maxItemsInMainAxis;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 < size) {
            int maxMainAxisIntrinsicItemSize = maxMainAxisIntrinsicItemSize(list.get(i14), i11) + i12;
            int i18 = i14 + 1;
            if (i18 - i16 == i13 || i18 == list.size()) {
                i15 = Math.max(i15, (i17 + maxMainAxisIntrinsicItemSize) - i12);
                i17 = 0;
                i16 = i14;
            } else {
                i17 += maxMainAxisIntrinsicItemSize;
            }
            i14 = i18;
        }
        return i15;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) r0.b3(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) r0.L2(list2) : null;
        List list3 = (List) r0.b3(list, 2);
        flowLayoutOverflowState.m655setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) r0.L2(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) r0.L2(list);
            if (list4 == null) {
                list4 = h0.J();
            }
            return maxIntrinsicMainAxisSize(list4, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> list5 = (List) r0.L2(list);
        if (list5 == null) {
            list5 = h0.J();
        }
        return intrinsicCrossAxisSize(list5, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo371roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxMainAxisIntrinsicItemSize(@m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return isHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i11) : intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    @m80.k
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo673measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k List<? extends List<? extends Measurable>> list, long j11) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m5067getMaxHeightimpl(j11) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
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
        List list2 = (List) r0.G2(list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
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
        List list3 = (List) r0.b3(list, 1);
        Measurable measurable = list3 != null ? (Measurable) r0.L2(list3) : null;
        List list4 = (List) r0.b3(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) r0.L2(list4) : null;
        this.overflow.setItemCount$foundation_layout_release(list2.size());
        this.overflow.m654setOverflowMeasurableshBUhpc$foundation_layout_release(this, measurable, measurable2, j11);
        return FlowLayoutKt.m650breakDownItemsdi9J0FM(measureScope, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m695constructorimpl(j11, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minCrossAxisIntrinsicItemSize(@m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i11) : intrinsicMeasurable.minIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) r0.b3(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) r0.L2(list2) : null;
        List list3 = (List) r0.b3(list, 2);
        flowLayoutOverflowState.m655setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) r0.L2(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) r0.L2(list);
            if (list4 == null) {
                list4 = h0.J();
            }
            return intrinsicCrossAxisSize(list4, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo371roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list5 = (List) r0.L2(list);
        if (list5 == null) {
            list5 = h0.J();
        }
        return minIntrinsicMainAxisSize(list5, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo371roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minIntrinsicMainAxisSize(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12, int i13, int i14, int i15, @m80.k FlowLayoutOverflowState flowLayoutOverflowState) {
        List<? extends IntrinsicMeasurable> list2 = list;
        int i16 = i14;
        int i17 = i15;
        if (list2.isEmpty()) {
            return 0;
        }
        int size = list2.size();
        int[] iArr = new int[size];
        int size2 = list2.size();
        int[] iArr2 = new int[size2];
        int size3 = list2.size();
        for (int i18 = 0; i18 < size3; i18++) {
            IntrinsicMeasurable intrinsicMeasurable = list2.get(i18);
            int minMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, i11);
            iArr[i18] = minMainAxisIntrinsicItemSize;
            iArr2[i18] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, minMainAxisIntrinsicItemSize);
        }
        int i19 = Integer.MAX_VALUE;
        if (i17 != Integer.MAX_VALUE && i16 != Integer.MAX_VALUE) {
            i19 = i16 * i17;
        }
        int min = Math.min(i19 - (((i19 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i19 < list2.size() || i17 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int uw2 = a0.uw(iArr) + ((list2.size() - 1) * i12);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr2[0];
        d1 it = new g10.l(1, a0.Me(iArr2)).iterator();
        while (it.hasNext()) {
            int i22 = iArr2[it.nextInt()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i23 = iArr[0];
        d1 it2 = new g10.l(1, a0.Me(iArr)).iterator();
        while (it2.hasNext()) {
            int i24 = iArr[it2.nextInt()];
            if (i23 < i24) {
                i23 = i24;
            }
        }
        int i25 = i23;
        int i26 = uw2;
        while (i25 <= i26 && i21 != i11) {
            int i27 = (i25 + i26) / 2;
            long intrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list2, iArr, iArr2, i27, i12, i13, i16, i17, flowLayoutOverflowState);
            i21 = IntIntPair.m21getFirstimpl(intrinsicCrossAxisSize);
            int m22getSecondimpl = IntIntPair.m22getSecondimpl(intrinsicCrossAxisSize);
            if (i21 > i11 || m22getSecondimpl < min) {
                i25 = i27 + 1;
                if (i25 > i26) {
                    return i25;
                }
            } else {
                if (i21 >= i11) {
                    return i27;
                }
                i26 = i27 - 1;
            }
            list2 = list;
            i16 = i14;
            i17 = i15;
            uw2 = i27;
        }
        return uw2;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) r0.b3(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) r0.L2(list2) : null;
        List list3 = (List) r0.b3(list, 2);
        flowLayoutOverflowState.m655setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) r0.L2(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) r0.L2(list);
            if (list4 == null) {
                list4 = h0.J();
            }
            return minIntrinsicMainAxisSize(list4, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo371roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list5 = (List) r0.L2(list);
        if (list5 == null) {
            list5 = h0.J();
        }
        return intrinsicCrossAxisSize(list5, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo371roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minMainAxisIntrinsicItemSize(@m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i11) : intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    @m80.k
    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) Dp.m5126toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m5126toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f11, CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z11;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f11;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f12;
        this.maxItemsInMainAxis = i11;
        this.maxLines = i12;
        this.overflow = flowLayoutOverflowState;
    }
}
