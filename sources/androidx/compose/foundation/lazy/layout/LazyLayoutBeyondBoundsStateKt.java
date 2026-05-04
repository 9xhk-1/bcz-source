package androidx.compose.foundation.lazy.layout;

import a00.h0;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import g10.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n34#2,6:64\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n51#1:64,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    @k
    public static final List<Integer> calculateLazyLayoutPinnedIndices(@k LazyLayoutItemProvider lazyLayoutItemProvider, @k LazyLayoutPinnedItemList lazyLayoutPinnedItemList, @k LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        l lVar = lazyLayoutBeyondBoundsInfo.hasIntervals() ? new l(lazyLayoutBeyondBoundsInfo.getStart(), Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1)) : l.f52526e.a();
        int size = lazyLayoutPinnedItemList.size();
        for (int i11 = 0; i11 < size; i11++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i11);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int d11 = lVar.d();
            if ((findIndexByKey > lVar.f() || d11 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int d12 = lVar.d();
        int f11 = lVar.f();
        if (d12 <= f11) {
            while (true) {
                arrayList.add(Integer.valueOf(d12));
                if (d12 == f11) {
                    break;
                }
                d12++;
            }
        }
        return arrayList;
    }
}
