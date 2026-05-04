package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyListPrefetchStrategy {
    @l
    default PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    void onNestedPrefetch(@k NestedPrefetchScope nestedPrefetchScope, int i11);

    void onScroll(@k LazyListPrefetchScope lazyListPrefetchScope, float f11, @k LazyListLayoutInfo lazyListLayoutInfo);

    void onVisibleItemsUpdated(@k LazyListPrefetchScope lazyListPrefetchScope, @k LazyListLayoutInfo lazyListLayoutInfo);
}
