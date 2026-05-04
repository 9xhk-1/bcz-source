package androidx.compose.foundation.lazy;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,678:1\n96#2,5:679\n96#2,5:684\n96#2,5:696\n50#2,5:762\n96#2,5:767\n107#2,7:772\n107#2,7:779\n54#3:689\n59#3:691\n54#3:713\n59#3:715\n85#4:690\n90#4:692\n85#4:714\n90#4:716\n26#5:693\n26#5:694\n26#5:695\n34#6,6:701\n34#6,6:707\n34#6,6:717\n117#6,2:723\n34#6,6:725\n119#6:731\n117#6,2:732\n34#6,6:734\n119#6:740\n117#6,2:741\n34#6,6:743\n119#6:749\n34#6,6:750\n52#6,6:756\n34#6,6:786\n34#6,6:792\n34#6,6:798\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n79#1:679,5\n80#1:684,5\n287#1:696,5\n604#1:762,5\n611#1:767,5\n622#1:772,7\n630#1:779,7\n105#1:689\n106#1:691\n388#1:713\n390#1:715\n105#1:690\n106#1:692\n388#1:714\n390#1:716\n140#1:693\n269#1:694\n270#1:695\n321#1:701,6\n337#1:707,6\n393#1:717,6\n506#1:723,2\n506#1:725,6\n506#1:731\n526#1:732,2\n526#1:734,6\n526#1:740\n527#1:741,2\n527#1:743,6\n527#1:749\n548#1:750,6\n575#1:756,6\n657#1:786,6\n664#1:792,6\n670#1:798,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i11, int i12, int i13, int i14, int i15, boolean z11, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z12, Density density) {
        int i16 = z11 ? i12 : i11;
        int i17 = 0;
        boolean z13 = i13 < Math.min(i16, i14);
        if (z13) {
            if (!(i15 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z13) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i17 < size) {
                iArr[i17] = list.get(calculateItemsOffsets$reverseAware(i17, z12, size)).getSize();
                i17++;
            }
            int[] iArr2 = new int[size];
            if (z11) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                vertical.arrange(density, i16, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
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
                    int i18 = iArr2[d11];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(d11, z12, size));
                    if (z12) {
                        i18 = (i16 - i18) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(i18, i11, i12);
                    arrayList.add(lazyListMeasuredItem);
                    if (d11 == f11) {
                        break;
                    }
                    d11 += g11;
                }
            }
        } else {
            int size2 = list2.size();
            int i19 = i15;
            for (int i21 = 0; i21 < size2; i21++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i21);
                i19 -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(i19, i11, i12);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i22 = i15;
            for (int i23 = 0; i23 < size3; i23++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i23);
                lazyListMeasuredItem3.position(i22, i11, i12);
                arrayList.add(lazyListMeasuredItem3);
                i22 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            while (i17 < size4) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i17);
                lazyListMeasuredItem4.position(i22, i11, i12);
                arrayList.add(lazyListMeasuredItem4);
                i22 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i17++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i11, boolean z11, int i12) {
        return !z11 ? i11 : (i12 - i11) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r8 = r8.get(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> createItemsAfterList(java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> r16, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r17, int r18, int r19, java.util.List<java.lang.Integer> r20, float r21, boolean r22, androidx.compose.foundation.lazy.LazyListLayoutInfo r23) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.createItemsAfterList(java.util.List, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, java.util.List, float, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo):java.util.List");
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i11, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i12, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int max = Math.max(0, i11 - i12);
        int i13 = i11 - 1;
        ArrayList arrayList = null;
        if (max <= i13) {
            int i14 = i13;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m841getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i14, 0L, 2, null));
                if (i14 == max) {
                    break;
                }
                i14--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i15 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m841getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, intValue, 0L, 2, null));
                }
                if (i15 < 0) {
                    break;
                }
                size = i15;
            }
        }
        return arrayList == null ? h0.J() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c2  */
    @m80.k
    /* renamed from: measureLazyList-LCrQqZ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m835measureLazyListLCrQqZ4(int r42, @m80.k final androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r43, int r44, int r45, int r46, int r47, int r48, int r49, float r50, long r51, boolean r53, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r54, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r55, boolean r56, @m80.k androidx.compose.ui.unit.Density r57, @m80.k androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> r58, int r59, @m80.k java.util.List<java.lang.Integer> r60, boolean r61, final boolean r62, @m80.l androidx.compose.foundation.lazy.LazyListLayoutInfo r63, @m80.k c40.r0 r64, @m80.k final androidx.compose.runtime.MutableState<yz.g2> r65, @m80.k androidx.compose.ui.graphics.GraphicsContext r66, @m80.l androidx.compose.foundation.lazy.layout.StickyItemsPlacement r67, @m80.k x00.q<? super java.lang.Integer, ? super java.lang.Integer, ? super x00.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, yz.g2>, ? extends androidx.compose.ui.layout.MeasureResult> r68) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m835measureLazyListLCrQqZ4(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo, c40.r0, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, x00.q):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
