package androidx.compose.foundation.lazy.layout;

import a00.h0;
import a00.r0;
import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n366#3:222\n237#3,4:233\n242#3:244\n230#4,3:223\n34#4,6:226\n233#4:232\n350#5,7:237\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n*L\n178#1:222\n191#1:233,4\n191#1:244\n188#1:223,3\n188#1:226,6\n188#1:232\n192#1:237,7\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    @k
    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(@l StickyItemsPlacement stickyItemsPlacement, @k List<T> list, @k IntList intList, int i11, int i12, int i13, int i14, @k x00.l<? super Integer, ? extends T> lVar) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return h0.J();
        }
        IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(((LazyLayoutMeasuredItem) r0.G2(list)).getIndex(), ((LazyLayoutMeasuredItem) r0.u3(list)).getIndex(), intList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            T t11 = list.get(i15);
            if (intList.contains(t11.getIndex())) {
                arrayList2.add(t11);
            }
        }
        int[] iArr = stickingIndices.content;
        int i16 = stickingIndices._size;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr[i17];
            Iterator<T> it = list.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (it.next().getIndex() == i18) {
                    break;
                }
                i19++;
            }
            T invoke = i19 == -1 ? lVar.invoke(Integer.valueOf(i18)) : list.remove(i19);
            ArrayList arrayList3 = arrayList2;
            T t12 = invoke;
            int calculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i18, invoke.getMainAxisSizeWithSpacings(), i19 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(invoke), i11, i12, i13, i14);
            t12.setNonScrollableItem(true);
            t12.position(calculateStickingItemOffset, 0, i13, i14);
            arrayList.add(t12);
            i17++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo840getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo840getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m5244getYimpl(mo840getOffsetBjo55l4) : IntOffset.m5243getXimpl(mo840getOffsetBjo55l4);
    }

    private static final void debugLog(x00.a<String> aVar) {
    }
}
