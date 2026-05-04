package androidx.compose.foundation.lazy.grid;

import a00.a0;
import a00.h0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g10.j;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n467#1,3:658\n470#1,16:665\n487#1:682\n467#1,3:683\n470#1:690\n471#1,15:701\n487#1:717\n96#2,5:636\n96#2,5:641\n96#2,5:653\n50#2,5:745\n96#2,5:760\n107#2,7:765\n107#2,7:772\n54#3:646\n59#3:648\n54#3:718\n59#3:720\n85#4:647\n90#4:649\n85#4:719\n90#4:721\n26#5:650\n26#5:651\n26#5:652\n34#6,4:661\n39#6:681\n34#6,4:686\n102#6,2:691\n34#6,4:693\n39#6:699\n104#6:700\n39#6:716\n34#6,6:722\n34#6,6:728\n102#6,2:735\n34#6,4:737\n39#6:743\n104#6:744\n133#6,3:750\n34#6,6:753\n136#6:759\n52#6,6:779\n34#6,6:785\n34#6,6:791\n12474#7,2:697\n12474#7,2:741\n1#8:734\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n290#1:658,3\n290#1:665,16\n290#1:682\n308#1:683,3\n308#1:690\n308#1:701,15\n308#1:717\n82#1:636,5\n83#1:641,5\n283#1:653,5\n562#1:745,5\n568#1:760,5\n575#1:765,7\n580#1:772,7\n107#1:646\n108#1:648\n393#1:718\n395#1:720\n107#1:647\n108#1:649\n393#1:719\n395#1:721\n137#1:650\n265#1:651\n266#1:652\n290#1:661,4\n290#1:681\n308#1:686,4\n315#1:691,2\n315#1:693,4\n315#1:699\n315#1:700\n308#1:716\n398#1:722,6\n469#1:728,6\n530#1:735,2\n530#1:737,4\n530#1:743\n530#1:744\n565#1:750,3\n565#1:753,6\n565#1:759\n608#1:779,6\n615#1:785,6\n620#1:791,6\n316#1:697,2\n530#1:741,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t11 : tArr) {
            list.add(t11);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, l<? super Integer, Boolean> lVar) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i11 = 0;
        while (i11 < size) {
            int intValue = list.get(i11).intValue();
            if (lVar.invoke(Integer.valueOf(intValue)).booleanValue()) {
                int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem mo842getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo842getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m874childConstraintsJhjzzOo$foundation_release(0, spanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mo842getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i11++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? h0.J() : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i11, int i12, int i13, int i14, int i15, boolean z11, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z12, Density density) {
        int i16 = z11 ? i12 : i11;
        boolean z13 = i13 < Math.min(i16, i14);
        if (z13) {
            if (!(i15 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
            }
        }
        List<LazyGridMeasuredLine> list4 = list;
        int size = list4.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17 += list.get(i18).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i17);
        if (z13) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i19 = 0; i19 < size2; i19++) {
                iArr[i19] = list.get(calculateItemsOffsets$reverseAware(i19, z12, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z11) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    throw new KotlinNothingValueException();
                }
                vertical.arrange(density, i16, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
                    throw new KotlinNothingValueException();
                }
                horizontal.arrange(density, i16, iArr, LayoutDirection.Ltr, iArr2);
            }
            j De = a0.De(iArr2);
            if (z12) {
                De = u.q1(De);
            }
            int d11 = De.d();
            int f11 = De.f();
            int g11 = De.g();
            if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
                while (true) {
                    int i21 = iArr2[d11];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(d11, z12, size2));
                    if (z12) {
                        i21 = (i16 - i21) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(i21, i11, i12));
                    if (d11 == f11) {
                        break;
                    }
                    d11 += g11;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i22 = i15;
                while (true) {
                    int i23 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    i22 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(i22, 0, i11, i12);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i23 < 0) {
                        break;
                    }
                    size3 = i23;
                }
            }
            int size4 = list4.size();
            int i24 = i15;
            for (int i25 = 0; i25 < size4; i25++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i25);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(i24, i11, i12));
                i24 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i26 = 0; i26 < size5; i26++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i26);
                lazyGridMeasuredItem2.position(i24, 0, i11, i12);
                arrayList.add(lazyGridMeasuredItem2);
                i24 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i11, boolean z11, int i12) {
        return !z11 ? i11 : (i12 - i11) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r6 = r9.get(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> linesRetainedForLookahead(int r6, int r7, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r8, boolean r9, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> r10, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Lb0
            if (r11 == 0) goto Lb0
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lb0
            java.util.List r9 = r11.getVisibleItemsInfo()
            int r1 = r9.size()
            int r1 = r1 + (-1)
        L1b:
            r2 = -1
            if (r2 >= r1) goto L44
            java.lang.Object r2 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r6) goto L41
            if (r1 == 0) goto L3a
            int r2 = r1 + (-1)
            java.lang.Object r2 = r9.get(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r6) goto L41
        L3a:
            java.lang.Object r6 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r6
            goto L45
        L41:
            int r1 = r1 + (-1)
            goto L1b
        L44:
            r6 = r0
        L45:
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.lang.Object r9 = a00.r0.u3(r9)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9
            java.lang.Object r10 = a00.r0.A3(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            r11 = 0
            if (r10 == 0) goto L5f
            int r10 = r10.getIndex()
            int r10 = r10 + 1
            goto L60
        L5f:
            r10 = r11
        L60:
            if (r6 == 0) goto Lb0
            int r6 = r6.getIndex()
            int r9 = r9.getIndex()
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto Lb0
        L72:
            if (r0 == 0) goto L9b
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r1 = r11
        L7c:
            if (r1 >= r9) goto L9b
            java.lang.Object r2 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r2
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r2 = r2.getItems()
            int r3 = r2.length
            r4 = r11
        L8a:
            if (r4 >= r3) goto L98
            r5 = r2[r4]
            int r5 = r5.getIndex()
            if (r5 != r6) goto L95
            goto Lab
        L95:
            int r4 = r4 + 1
            goto L8a
        L98:
            int r1 = r1 + 1
            goto L7c
        L9b:
            if (r0 != 0) goto La2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La2:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r9 = r8.getAndMeasure(r10)
            int r10 = r10 + 1
            r0.add(r9)
        Lab:
            if (r6 == r7) goto Lb0
            int r6 = r6 + 1
            goto L72
        Lb0:
            if (r0 != 0) goto Lb7
            java.util.List r6 = a00.h0.J()
            return r6
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.linesRetainedForLookahead(int, int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, boolean, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x048c  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    @m80.k
    /* renamed from: measureLazyGrid-GyuLg2I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m870measureLazyGridGyuLg2I(int r55, @m80.k androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r56, @m80.k final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r57, int r58, int r59, int r60, int r61, int r62, int r63, float r64, long r65, boolean r67, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r68, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r69, boolean r70, @m80.k androidx.compose.ui.unit.Density r71, @m80.k androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r72, int r73, @m80.k java.util.List<java.lang.Integer> r74, boolean r75, final boolean r76, @m80.l androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r77, @m80.k c40.r0 r78, @m80.k final androidx.compose.runtime.MutableState<yz.g2> r79, @m80.k androidx.compose.ui.graphics.GraphicsContext r80, @m80.k x00.l<? super java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> r81, @m80.l androidx.compose.foundation.lazy.layout.StickyItemsPlacement r82, @m80.k x00.q<? super java.lang.Integer, ? super java.lang.Integer, ? super x00.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, yz.g2>, ? extends androidx.compose.ui.layout.MeasureResult> r83) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m870measureLazyGridGyuLg2I(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, c40.r0, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, x00.l, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, x00.q):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
