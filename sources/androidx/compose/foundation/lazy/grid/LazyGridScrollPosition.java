package androidx.compose.foundation.lazy.grid;

import a00.a0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,126:1\n78#2:127\n107#2,2:128\n78#2:130\n107#2,2:131\n50#3,5:133\n50#3,5:138\n96#3,5:143\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n33#1:127\n33#1:128,2\n36#1:130\n36#1:131,2\n60#1:133,5\n70#1:138,5\n111#1:143,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;

    @k
    private final MutableIntState index$delegate;

    @l
    private Object lastKnownFirstItemKey;

    @k
    private final LazyLayoutNearestRangeState nearestRangeState;

    @k
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LazyGridScrollPosition() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollPosition.<init>():void");
    }

    private final void setIndex(int i11) {
        this.index$delegate.setIntValue(i11);
    }

    private final void setScrollOffset(int i11) {
        this.scrollOffset$delegate.setIntValue(i11);
    }

    private final void update(int i11, int i12) {
        if (!(((float) i11) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
        }
        setIndex(i11);
        this.nearestRangeState.update(i11);
        setScrollOffset(i12);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    @k
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int i11, int i12) {
        update(i11, i12);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(@k LazyGridMeasureResult lazyGridMeasureResult) {
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) a0.Fc(items2)) == null) ? null : lazyGridMeasuredItem2.getKey();
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            int i11 = 0;
            if (!(((float) firstVisibleLineScrollOffset) >= 0.0f)) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')');
            }
            LazyGridMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
            if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) a0.Fc(items)) != null) {
                i11 = lazyGridMeasuredItem.getIndex();
            }
            update(i11, firstVisibleLineScrollOffset);
        }
    }

    public final void updateScrollOffset(int i11) {
        if (!(((float) i11) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(i11);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(@k LazyGridItemProvider lazyGridItemProvider, int i11) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, i11);
        if (i11 != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(i11);
        }
        return findIndexByKey;
    }

    public LazyGridScrollPosition(int i11, int i12) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i12);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i11, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i11, int i12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
