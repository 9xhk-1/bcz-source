package androidx.compose.foundation.lazy.grid;

import a00.r0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n117#2,2:76\n34#2,6:78\n119#2:84\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1\n*L\n65#1:76,2\n65#1:78,6\n65#1:84\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ LazyGridState $state;

    public LazyGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyGridState lazyGridState) {
        this.$state = lazyGridState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i11, int i12) {
        Integer num;
        LazyGridItemInfo lazyGridItemInfo;
        LazyGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int firstVisibleItemIndex = getFirstVisibleItemIndex();
        if (i11 > getLastVisibleItemIndex() || firstVisibleItemIndex > i11) {
            int slotsPerLine$foundation_release = this.$state.getSlotsPerLine$foundation_release();
            r2 = (LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo) * (((i11 - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation_release - 1) * ((i11 < getFirstVisibleItemIndex() ? 1 : 0) != 0 ? -1 : 1))) / slotsPerLine$foundation_release)) - getFirstVisibleItemScrollOffset();
        } else {
            List<LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i13 = 0;
            while (true) {
                num = null;
                if (i13 >= size) {
                    lazyGridItemInfo = null;
                    break;
                }
                lazyGridItemInfo = visibleItemsInfo.get(i13);
                if (lazyGridItemInfo.getIndex() == i11) {
                    break;
                }
                i13++;
            }
            LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
            if (layoutInfo.getOrientation() == Orientation.Vertical) {
                if (lazyGridItemInfo2 != null) {
                    num = Integer.valueOf(IntOffset.m5244getYimpl(lazyGridItemInfo2.mo865getOffsetnOccac()));
                }
            } else if (lazyGridItemInfo2 != null) {
                num = Integer.valueOf(IntOffset.m5243getXimpl(lazyGridItemInfo2.mo865getOffsetnOccac()));
            }
            if (num != null) {
                r2 = num.intValue();
            }
        }
        return r2 + i12;
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
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) r0.A3(this.$state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f11) {
        return this.$$delegate_0.scrollBy(f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void snapToItem(int i11, int i12) {
        this.$state.snapToItemIndexInternal$foundation_release(i11, i12, true);
    }
}
