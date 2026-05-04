package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,137:1\n78#2:138\n107#2,2:139\n79#3:141\n112#3,2:142\n127#4,4:144\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n37#1:138\n37#1:139,2\n40#1:141\n40#1:142,2\n106#1:144,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerScrollPosition {
    public static final int $stable = 8;

    @k
    private final MutableIntState currentPage$delegate;

    @k
    private final MutableFloatState currentPageOffsetFraction$delegate;
    private boolean hadFirstNotEmptyLayout;

    @l
    private Object lastKnownCurrentPageKey;

    @k
    private final LazyLayoutNearestRangeState nearestRangeState;

    @k
    private final PagerState state;

    public PagerScrollPosition(int i11, float f11, @k PagerState pagerState) {
        this.state = pagerState;
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.currentPageOffsetFraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i11, 30, 100);
    }

    private final void setCurrentPage(int i11) {
        this.currentPage$delegate.setIntValue(i11);
    }

    private final void setCurrentPageOffsetFraction(float f11) {
        this.currentPageOffsetFraction$delegate.setFloatValue(f11);
    }

    private final void update(int i11, float f11) {
        setCurrentPage(i11);
        this.nearestRangeState.update(i11);
        setCurrentPageOffsetFraction(f11);
    }

    public final void applyScrollDelta(int i11) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.state.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : i11 / this.state.getPageSizeWithSpacing$foundation_release()));
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction$delegate.getFloatValue();
    }

    @k
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    @k
    public final PagerState getState() {
        return this.state;
    }

    public final int matchPageWithKey(@k PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i11) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(pagerLazyLayoutItemProvider, this.lastKnownCurrentPageKey, i11);
        if (i11 != findIndexByKey) {
            setCurrentPage(findIndexByKey);
            this.nearestRangeState.update(i11);
        }
        return findIndexByKey;
    }

    public final void requestPositionAndForgetLastKnownKey(int i11, float f11) {
        update(i11, f11);
        this.lastKnownCurrentPageKey = null;
    }

    public final void updateCurrentPageOffsetFraction(float f11) {
        setCurrentPageOffsetFraction(f11);
    }

    public final void updateFromMeasureResult(@k PagerMeasureResult pagerMeasureResult) {
        MeasuredPage currentPage = pagerMeasureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !pagerMeasureResult.getVisiblePagesInfo().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            MeasuredPage currentPage2 = pagerMeasureResult.getCurrentPage();
            update(currentPage2 != null ? currentPage2.getIndex() : 0, pagerMeasureResult.getCurrentPageOffsetFraction());
        }
    }

    public /* synthetic */ PagerScrollPosition(int i11, float f11, PagerState pagerState, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0.0f : f11, pagerState);
    }
}
