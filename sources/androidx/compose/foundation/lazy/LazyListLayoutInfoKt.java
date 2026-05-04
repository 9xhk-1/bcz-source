package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n133#2,3:96\n34#2,6:99\n136#2:105\n*S KotlinDebug\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n*L\n92#1:96,3\n92#1:99,6\n92#1:105\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListLayoutInfoKt {
    public static final int visibleItemsAverageSize(@k LazyListLayoutInfo lazyListLayoutInfo) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += visibleItemsInfo.get(i12).getSize();
        }
        return (i11 / visibleItemsInfo.size()) + lazyListLayoutInfo.getMainAxisItemSpacing();
    }
}
