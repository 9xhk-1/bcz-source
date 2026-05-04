package androidx.compose.foundation.lazy;

import a00.r0;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nLazyListPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: classes.dex */
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {

    @l
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(@k NestedPrefetchScope nestedPrefetchScope, int i11) {
        int i12 = this.nestedPrefetchItemCount;
        for (int i13 = 0; i13 < i12; i13++) {
            nestedPrefetchScope.schedulePrefetch(i11 + i13);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(@k LazyListPrefetchScope lazyListPrefetchScope, float f11, @k LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z11 = f11 < 0.0f;
        int index = z11 ? ((LazyListItemInfo) r0.u3(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) r0.G2(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        if (index < 0 || index >= lazyListLayoutInfo.getTotalItemsCount()) {
            return;
        }
        if (index != this.indexToPrefetch) {
            if (this.wasScrollingForward != z11 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                prefetchHandle3.cancel();
            }
            this.wasScrollingForward = z11;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = lazyListPrefetchScope.schedulePrefetch(index);
        }
        if (!z11) {
            if (lazyListLayoutInfo.getViewportStartOffset() - ((LazyListItemInfo) r0.G2(lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() >= f11 || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
            return;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) r0.u3(lazyListLayoutInfo.getVisibleItemsInfo());
        if (((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() >= (-f11) || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
            return;
        }
        prefetchHandle2.markAsUrgent();
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(@k LazyListPrefetchScope lazyListPrefetchScope, @k LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.indexToPrefetch == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((LazyListItemInfo) r0.u3(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) r0.G2(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public DefaultLazyListPrefetchStrategy(int i11) {
        this.nestedPrefetchItemCount = i11;
        this.indexToPrefetch = -1;
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 2 : i11);
    }
}
