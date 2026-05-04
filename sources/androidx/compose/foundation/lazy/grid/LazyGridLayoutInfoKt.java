package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n59#2:134\n54#2:136\n90#3:135\n85#3:137\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:134\n119#1:136\n117#1:135\n119#1:137\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(@k LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z11 = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < visibleItemsInfo.size()) {
            int visibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z11, lazyGridLayoutInfo, i11);
            if (visibleLinesAverageMainAxisSize$lineOf == -1) {
                i11++;
            } else {
                int i14 = 0;
                while (i11 < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z11, lazyGridLayoutInfo, i11) == visibleLinesAverageMainAxisSize$lineOf) {
                    i14 = Math.max(i14, (int) (z11 ? visibleItemsInfo.get(i11).mo866getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i11).mo866getSizeYbymL2g() >> 32));
                    i11++;
                }
                i12 += i14;
                i13++;
            }
        }
        return (i12 / i13) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z11, LazyGridLayoutInfo lazyGridLayoutInfo, int i11) {
        return z11 ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i11).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i11).getColumn();
    }
}
