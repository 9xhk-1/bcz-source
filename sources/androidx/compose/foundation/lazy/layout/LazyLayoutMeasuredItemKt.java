package androidx.compose.foundation.lazy.layout;

import a00.h0;
import a00.l0;
import a00.r0;
import androidx.compose.ui.unit.IntOffset;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n34#2,6:71\n1#3:77\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt\n*L\n56#1:71,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {

    @k
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new Comparator() { // from class: androidx.compose.foundation.lazy.layout.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int LazyLayoutMeasuredItemIndexComparator$lambda$2;
            LazyLayoutMeasuredItemIndexComparator$lambda$2 = LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$2((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
            return LazyLayoutMeasuredItemIndexComparator$lambda$2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LazyLayoutMeasuredItemIndexComparator$lambda$2(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return g0.t(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo840getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo840getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m5244getYimpl(mo840getOffsetBjo55l4) : IntOffset.m5243getXimpl(mo840getOffsetBjo55l4);
    }

    @k
    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i11, int i12, @k List<? extends T> list, @k List<? extends T> list2) {
        if (list.isEmpty()) {
            return h0.J();
        }
        List<T> d62 = r0.d6(list2);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            T t11 = list.get(i13);
            int index = t11.getIndex();
            if (i11 <= index && index <= i12) {
                d62.add(t11);
            }
        }
        l0.r0(d62, LazyLayoutMeasuredItemIndexComparator);
        return d62;
    }
}
