package androidx.compose.foundation.lazy.staggeredgrid;

import a00.r0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n1#2:77\n117#3,2:78\n34#3,6:80\n119#3:86\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1\n*L\n60#1:78,2\n60#1:80,6\n60#1:86\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ LazyStaggeredGridState $state;

    public LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyStaggeredGridState lazyStaggeredGridState) {
        this.$state = lazyStaggeredGridState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i11, int i12) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int m5244getYimpl;
        LazyStaggeredGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
        int i13 = 0;
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        while (true) {
            if (i13 >= size) {
                lazyStaggeredGridItemInfo = null;
                break;
            }
            lazyStaggeredGridItemInfo = visibleItemsInfo.get(i13);
            if (lazyStaggeredGridItemInfo.getIndex() == i11) {
                break;
            }
            i13++;
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
        if (lazyStaggeredGridItemInfo2 == null) {
            int visibleItemsAverageSize = LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(layoutInfo);
            int laneCount$foundation_release = this.$state.getLaneCount$foundation_release();
            m5244getYimpl = (visibleItemsAverageSize * ((i11 / laneCount$foundation_release) - (getFirstVisibleItemIndex() / laneCount$foundation_release))) - getFirstVisibleItemScrollOffset();
        } else {
            m5244getYimpl = layoutInfo.getOrientation() == Orientation.Vertical ? IntOffset.m5244getYimpl(lazyStaggeredGridItemInfo2.mo932getOffsetnOccac()) : IntOffset.m5243getXimpl(lazyStaggeredGridItemInfo2.mo932getOffsetnOccac());
        }
        return m5244getYimpl + i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemIndex() {
        return this.$state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.$state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getItemCount() {
        return this.$state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getLastVisibleItemIndex() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) r0.A3(this.$state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f11) {
        return this.$$delegate_0.scrollBy(f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void snapToItem(int i11, int i12) {
        this.$state.snapToItemInternal$foundation_release(i11, i12, true);
    }
}
