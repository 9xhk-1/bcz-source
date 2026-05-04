package androidx.compose.foundation.lazy.staggeredgrid;

import a00.a0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,170:1\n78#2:171\n107#2,2:172\n78#2:174\n107#2,2:175\n13330#3,2:177\n117#4,2:179\n34#4,6:181\n119#4:187\n602#5,8:188\n602#5,8:196\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:171\n37#1:172,2\n44#1:174\n44#1:175,2\n49#1:177,2\n86#1:179,2\n86#1:181,6\n86#1:187\n93#1:188,8\n145#1:196,8\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;

    @k
    private final p<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;

    @k
    private final MutableIntState index$delegate;

    @k
    private int[] indices;

    @l
    private Object lastKnownFirstItemKey;

    @k
    private final LazyLayoutNearestRangeState nearestRangeState;

    @k
    private final MutableIntState scrollOffset$delegate;

    @k
    private int[] scrollOffsets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(@k int[] iArr, @k int[] iArr2, @k p<? super Integer, ? super Integer, int[]> pVar) {
        this.fillIndices = pVar;
        this.indices = iArr;
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        Integer Fn = a0.Fn(iArr);
        this.nearestRangeState = new LazyLayoutNearestRangeState(Fn != null ? Fn.intValue() : 0, 90, 200);
    }

    private final int calculateFirstVisibleIndex(int[] iArr) {
        int i11 = Integer.MAX_VALUE;
        for (int i12 : iArr) {
            if (i12 <= 0) {
                return 0;
            }
            if (i11 > i12) {
                i11 = i12;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            return 0;
        }
        return i11;
    }

    private final int calculateFirstVisibleScrollOffset(int[] iArr, int[] iArr2) {
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(iArr);
        int length = iArr2.length;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            if (iArr[i12] == calculateFirstVisibleIndex) {
                i11 = Math.min(i11, iArr2[i12]);
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            return 0;
        }
        return i11;
    }

    private final void setIndex(int i11) {
        this.index$delegate.setIntValue(i11);
    }

    private final void setScrollOffset(int i11) {
        this.scrollOffset$delegate.setIntValue(i11);
    }

    private final void update(int[] iArr, int[] iArr2) {
        this.indices = iArr;
        setIndex(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        setScrollOffset(calculateFirstVisibleScrollOffset(iArr, iArr2));
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    @k
    public final int[] getIndices() {
        return this.indices;
    }

    @k
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    @k
    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    public final void requestPositionAndForgetLastKnownKey(int i11, int i12) {
        int[] invoke = this.fillIndices.invoke(Integer.valueOf(i11), Integer.valueOf(this.indices.length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = i12;
        }
        update(invoke, iArr);
        this.nearestRangeState.update(i11);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(@k LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
            lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i11);
            if (lazyStaggeredGridMeasuredItem.getIndex() == calculateFirstVisibleIndex) {
                break;
            } else {
                i11++;
            }
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        this.lastKnownFirstItemKey = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getKey() : null;
        this.nearestRangeState.update(calculateFirstVisibleIndex);
        if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
                g2 g2Var = g2.f100423a;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(@k int[] iArr) {
        this.scrollOffsets = iArr;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.indices, iArr));
    }

    @k
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(@k LazyLayoutItemProvider lazyLayoutItemProvider, @k int[] iArr) {
        Object obj = this.lastKnownFirstItemKey;
        Integer ff2 = a0.ff(iArr, 0);
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, ff2 != null ? ff2.intValue() : 0);
        if (a0.z8(iArr, findIndexByKey)) {
            return iArr;
        }
        this.nearestRangeState.update(findIndexByKey);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int[] invoke = this.fillIndices.invoke(Integer.valueOf(findIndexByKey), Integer.valueOf(iArr.length));
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.indices = invoke;
            setIndex(calculateFirstVisibleIndex(invoke));
            return invoke;
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }
}
