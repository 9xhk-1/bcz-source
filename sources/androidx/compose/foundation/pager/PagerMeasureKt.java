package androidx.compose.foundation.pager;

import a00.a0;
import a00.h0;
import a00.m;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c40.r0;
import g10.j;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i11, List<MeasuredPage> list, int i12, int i13, int i14, SnapPosition snapPosition, int i15) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f11 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i11, i12, i13, i14, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i15));
            int L = h0.L(list);
            if (1 <= L) {
                int i16 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i16);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f12 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i11, i12, i13, i14, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i15));
                    if (Float.compare(f11, f12) < 0) {
                        f11 = f12;
                        measuredPage2 = measuredPage4;
                    }
                    if (i16 == L) {
                        break;
                    }
                    i16++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i11, int i12, int i13, int i14, int i15, Orientation orientation, boolean z11, Density density, int i16, int i17) {
        ArrayList arrayList;
        int i18 = i15;
        int i19 = i17 + i16;
        int i21 = orientation == Orientation.Vertical ? i12 : i11;
        int i22 = 0;
        boolean z12 = i13 < Math.min(i21, i14);
        if (z12) {
            if (!(i18 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i18);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i22 < size) {
                iArr[i22] = i17;
                i22++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical m610spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m610spacedBy0680j_4(lazyLayoutMeasureScope.mo374toDpu2uoSUM(i16));
            if (orientation == Orientation.Vertical) {
                m610spacedBy0680j_4.arrange(density, i21, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                m610spacedBy0680j_4.arrange(density, i21, iArr, LayoutDirection.Ltr, iArr2);
            }
            j De = a0.De(iArr2);
            if (z11) {
                De = u.q1(De);
            }
            int d11 = De.d();
            int f11 = De.f();
            int g11 = De.g();
            if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
                while (true) {
                    int i23 = iArr2[d11];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(d11, z11, size));
                    if (z11) {
                        i23 = (i21 - i23) - measuredPage.getSize();
                    }
                    measuredPage.position(i23, i11, i12);
                    arrayList.add(measuredPage);
                    if (d11 == f11) {
                        break;
                    }
                    d11 += g11;
                }
            }
        } else {
            arrayList = arrayList2;
            int size2 = list2.size();
            int i24 = i18;
            for (int i25 = 0; i25 < size2; i25++) {
                MeasuredPage measuredPage2 = list2.get(i25);
                i24 -= i19;
                measuredPage2.position(i24, i11, i12);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            for (int i26 = 0; i26 < size3; i26++) {
                MeasuredPage measuredPage3 = list.get(i26);
                measuredPage3.position(i18, i11, i12);
                arrayList.add(measuredPage3);
                i18 += i19;
            }
            int size4 = list3.size();
            while (i22 < size4) {
                MeasuredPage measuredPage4 = list3.get(i22);
                measuredPage4.position(i18, i11, i12);
                arrayList.add(measuredPage4);
                i18 += i19;
                i22++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i11, boolean z11, int i12) {
        return !z11 ? i11 : (i12 - i11) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i11, int i12, int i13, List<Integer> list, l<? super Integer, MeasuredPage> lVar) {
        int min = Math.min(i13 + i11, i12 - 1);
        int i14 = i11 + 1;
        ArrayList arrayList = null;
        if (i14 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i14)));
                if (i14 == min) {
                    break;
                }
                i14++;
            }
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            int intValue = list.get(i15).intValue();
            if (min + 1 <= intValue && intValue < i12) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? h0.J() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i11, int i12, List<Integer> list, l<? super Integer, MeasuredPage> lVar) {
        int max = Math.max(0, i11 - i12);
        int i13 = i11 - 1;
        ArrayList arrayList = null;
        if (max <= i13) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i13)));
                if (i13 == max) {
                    break;
                }
                i13--;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int intValue = list.get(i14).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? h0.J() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m976getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i11, long j11, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j12, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, int i12) {
        return new MeasuredPage(i11, i12, lazyLayoutMeasureScope.mo900measure0kLqBqw(i11, j11), j12, pagerLazyLayoutItemProvider.getKey(i11), orientation, horizontal, vertical, layoutDirection, z11, null);
    }

    @k
    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m977measurePagerbmk8ZPk(@k final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i11, @k final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i12, int i13, int i14, int i15, int i16, int i17, long j11, @k final Orientation orientation, @m80.l final Alignment.Vertical vertical, @m80.l final Alignment.Horizontal horizontal, final boolean z11, final long j12, final int i18, int i19, @k List<Integer> list, @k SnapPosition snapPosition, @k final MutableState<g2> mutableState, @k r0 r0Var, @k q<? super Integer, ? super Integer, ? super l<? super Placeable.PlacementScope, g2>, ? extends MeasureResult> qVar) {
        int i21;
        boolean z12;
        int i22;
        int i23;
        int i24;
        int i25;
        List<MeasuredPage> arrayList;
        List arrayList2;
        List arrayList3;
        int i26;
        if (!(i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (!(i14 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int u11 = u.u(i18 + i15, 0);
        if (i11 <= 0) {
            return new PagerMeasureResult(h0.J(), i18, i15, i14, orientation, -i13, i12 + i14, false, i19, null, null, 0.0f, 0, false, snapPosition, qVar.invoke(Integer.valueOf(Constraints.m5070getMinWidthimpl(j11)), Integer.valueOf(Constraints.m5069getMinHeightimpl(j11)), new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }
            }), false, null, null, r0Var, 393216, null);
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = Orientation.Vertical;
        final long Constraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m5068getMaxWidthimpl(j11) : i18, 0, orientation2 != orientation3 ? Constraints.m5067getMaxHeightimpl(j11) : i18, 5, null);
        int i27 = i16;
        int i28 = i17;
        while (i27 > 0 && i28 > 0) {
            i27--;
            i28 -= u11;
        }
        int i29 = i28 * (-1);
        if (i27 >= i11) {
            i27 = i11 - 1;
            i29 = 0;
        }
        m mVar = new m();
        int i31 = -i13;
        int i32 = (i15 < 0 ? i15 : 0) + i31;
        int i33 = i29 + i32;
        int i34 = 0;
        while (i33 < 0 && i27 > 0) {
            int i35 = i27 - 1;
            MeasuredPage m976getAndMeasureSGf7dI0 = m976getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i35, Constraints$default, pagerLazyLayoutItemProvider, j12, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z11, i18);
            mVar.add(0, m976getAndMeasureSGf7dI0);
            i34 = Math.max(i34, m976getAndMeasureSGf7dI0.getCrossAxisSize());
            i33 += u11;
            i32 = i32;
            i27 = i35;
            orientation2 = orientation;
        }
        int i36 = i32;
        int i37 = i34;
        if (i33 < i36) {
            i33 = i36;
        }
        int i38 = i33 - i36;
        int i39 = i12 + i14;
        int i41 = i27;
        int u12 = u.u(i39, 0);
        int i42 = -i38;
        int i43 = i41;
        int i44 = 0;
        boolean z13 = false;
        while (i44 < mVar.size()) {
            if (i42 >= u12) {
                mVar.remove(i44);
                z13 = true;
            } else {
                i43++;
                i42 += u11;
                i44++;
            }
        }
        int i45 = i37;
        int i46 = i43;
        boolean z14 = z13;
        int i47 = i38;
        while (i46 < i11 && (i42 < u12 || i42 <= 0 || mVar.isEmpty())) {
            int i48 = u12;
            int i49 = i46;
            MeasuredPage m976getAndMeasureSGf7dI02 = m976getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i49, Constraints$default, pagerLazyLayoutItemProvider, j12, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z11, i18);
            int i51 = i47;
            int i52 = i11 - 1;
            i42 += i49 == i52 ? i18 : u11;
            if (i42 > i36 || i49 == i52) {
                i45 = Math.max(i45, m976getAndMeasureSGf7dI02.getCrossAxisSize());
                mVar.add(m976getAndMeasureSGf7dI02);
                i26 = i41;
                i47 = i51;
            } else {
                i26 = i49 + 1;
                i47 = i51 - u11;
                z14 = true;
            }
            i46 = i49 + 1;
            i41 = i26;
            u12 = i48;
        }
        int i53 = i47;
        if (i42 < i12) {
            int i54 = i12 - i42;
            i23 = i53 - i54;
            i42 += i54;
            i22 = i45;
            i24 = i41;
            while (i23 < i13 && i24 > 0) {
                int i55 = i24 - 1;
                MeasuredPage m976getAndMeasureSGf7dI03 = m976getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i55, Constraints$default, pagerLazyLayoutItemProvider, j12, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z11, i18);
                mVar.add(0, m976getAndMeasureSGf7dI03);
                i22 = Math.max(i22, m976getAndMeasureSGf7dI03.getCrossAxisSize());
                i23 += u11;
                i46 = i46;
                i24 = i55;
            }
            i21 = i46;
            z12 = false;
            if (i23 < 0) {
                i42 += i23;
                i23 = 0;
            }
        } else {
            i21 = i46;
            z12 = false;
            i22 = i45;
            i23 = i53;
            i24 = i41;
        }
        if (!(i23 >= 0 ? true : z12)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i56 = i22;
        int i57 = -i23;
        MeasuredPage measuredPage = (MeasuredPage) mVar.first();
        if (i13 > 0 || i15 < 0) {
            int size = mVar.size();
            i25 = i57;
            int i58 = 0;
            while (i58 < size && i23 != 0 && u11 <= i23 && i58 != h0.L(mVar)) {
                i23 -= u11;
                i58++;
                measuredPage = (MeasuredPage) mVar.get(i58);
            }
        } else {
            i25 = i57;
        }
        int i59 = i23;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> createPagesBeforeList = createPagesBeforeList(i24, i19, list, new l<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i61) {
                MeasuredPage m976getAndMeasureSGf7dI04;
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = LazyLayoutMeasureScope.this;
                m976getAndMeasureSGf7dI04 = PagerMeasureKt.m976getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i61, Constraints$default, pagerLazyLayoutItemProvider, j12, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z11, i18);
                return m976getAndMeasureSGf7dI04;
            }
        });
        int size2 = createPagesBeforeList.size();
        int i61 = i56;
        int i62 = 0;
        while (i62 < size2) {
            i61 = Math.max(i61, createPagesBeforeList.get(i62).getCrossAxisSize());
            i62++;
            createPagesBeforeList = createPagesBeforeList;
        }
        List<MeasuredPage> list2 = createPagesBeforeList;
        List<MeasuredPage> createPagesAfterList = createPagesAfterList(((MeasuredPage) mVar.last()).getIndex(), i11, i19, list, new l<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i63) {
                MeasuredPage m976getAndMeasureSGf7dI04;
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = LazyLayoutMeasureScope.this;
                m976getAndMeasureSGf7dI04 = PagerMeasureKt.m976getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i63, Constraints$default, pagerLazyLayoutItemProvider, j12, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z11, i18);
                return m976getAndMeasureSGf7dI04;
            }
        });
        int size3 = createPagesAfterList.size();
        for (int i63 = 0; i63 < size3; i63++) {
            i61 = Math.max(i61, createPagesAfterList.get(i63).getCrossAxisSize());
        }
        boolean z15 = g0.g(measuredPage2, mVar.first()) && list2.isEmpty() && createPagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int m5085constrainWidthK40F9xA = ConstraintsKt.m5085constrainWidthK40F9xA(j11, orientation == orientation4 ? i61 : i42);
        if (orientation == orientation4) {
            i61 = i42;
        }
        int m5084constrainHeightK40F9xA = ConstraintsKt.m5084constrainHeightK40F9xA(j11, i61);
        int i64 = i21;
        int i65 = i42;
        final List<MeasuredPage> calculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, mVar, list2, createPagesAfterList, m5085constrainWidthK40F9xA, m5084constrainHeightK40F9xA, i65, i12, i25, orientation, z11, lazyLayoutMeasureScope, i15, i18);
        if (z15) {
            arrayList = calculatePagesOffsets;
        } else {
            arrayList = new ArrayList<>(calculatePagesOffsets.size());
            int size4 = calculatePagesOffsets.size();
            int i66 = 0;
            while (i66 < size4) {
                MeasuredPage measuredPage3 = calculatePagesOffsets.get(i66);
                MeasuredPage measuredPage4 = measuredPage3;
                MeasuredPage measuredPage5 = measuredPage2;
                int i67 = i64;
                if (measuredPage4.getIndex() >= ((MeasuredPage) mVar.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) mVar.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
                i66++;
                i64 = i67;
                measuredPage2 = measuredPage5;
            }
        }
        MeasuredPage measuredPage6 = measuredPage2;
        int i68 = i64;
        if (list2.isEmpty()) {
            arrayList2 = h0.J();
        } else {
            arrayList2 = new ArrayList(calculatePagesOffsets.size());
            int size5 = calculatePagesOffsets.size();
            for (int i69 = 0; i69 < size5; i69++) {
                MeasuredPage measuredPage7 = calculatePagesOffsets.get(i69);
                if (measuredPage7.getIndex() < ((MeasuredPage) mVar.first()).getIndex()) {
                    arrayList2.add(measuredPage7);
                }
            }
        }
        List list3 = arrayList2;
        if (createPagesAfterList.isEmpty()) {
            arrayList3 = h0.J();
        } else {
            arrayList3 = new ArrayList(calculatePagesOffsets.size());
            int size6 = calculatePagesOffsets.size();
            for (int i71 = 0; i71 < size6; i71++) {
                MeasuredPage measuredPage8 = calculatePagesOffsets.get(i71);
                if (measuredPage8.getIndex() > ((MeasuredPage) mVar.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage calculateNewCurrentPage = calculateNewCurrentPage(i12 + i13 + i14, arrayList, i13, i14, u11, snapPosition, i11);
        return new PagerMeasureResult(arrayList, i18, i15, i14, orientation, i31, i39, z11, i19, measuredPage6, calculateNewCurrentPage, u11 == 0 ? 0.0f : u.H((snapPosition.position(r0, i18, i13, i14, calculateNewCurrentPage != null ? calculateNewCurrentPage.getIndex() : 0, i11) - (calculateNewCurrentPage != null ? calculateNewCurrentPage.getOffset() : 0)) / u11, -0.5f, 0.5f), i59, i68 < i11 || i65 > i12, snapPosition, qVar.invoke(Integer.valueOf(m5085constrainWidthK40F9xA), Integer.valueOf(m5084constrainHeightK40F9xA), new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
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
                final List<MeasuredPage> list5 = calculatePagesOffsets;
                placementScope.withMotionFrameOfReferencePlacement(new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope2) {
                        invoke2(placementScope2);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope2) {
                        List<MeasuredPage> list6 = list5;
                        int size7 = list6.size();
                        for (int i72 = 0; i72 < size7; i72++) {
                            list6.get(i72).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m905attachToScopeimpl(mutableState);
            }
        }), z14, list3, list4, r0Var);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
