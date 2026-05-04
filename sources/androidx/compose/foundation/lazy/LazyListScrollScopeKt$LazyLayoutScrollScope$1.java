package androidx.compose.foundation.lazy;

import a00.r0;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n117#2,2:68\n34#2,6:70\n119#2:76\n*S KotlinDebug\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n*L\n61#1:68,2\n61#1:70,6\n61#1:76\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ LazyListState $state;

    public LazyListScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyListState lazyListState) {
        this.$state = lazyListState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i11, int i12) {
        LazyListItemInfo lazyListItemInfo;
        LazyListLayoutInfo layoutInfo = this.$state.getLayoutInfo();
        int i13 = 0;
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int firstVisibleItemIndex = getFirstVisibleItemIndex();
        if (i11 > getLastVisibleItemIndex() || firstVisibleItemIndex > i11) {
            i13 = (LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo) * (i11 - getFirstVisibleItemIndex())) - getFirstVisibleItemScrollOffset();
        } else {
            List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                lazyListItemInfo = visibleItemsInfo.get(i14);
                if (lazyListItemInfo.getIndex() == i11) {
                    break;
                }
                i14++;
            }
            LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
            if (lazyListItemInfo2 != null) {
                i13 = lazyListItemInfo2.getOffset();
            }
        }
        return i13 + i12;
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
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) r0.A3(this.$state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
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
