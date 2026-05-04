package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class TraversablePrefetchStateNode extends Modifier.Node implements TraversableNode {

    @k
    private LazyLayoutPrefetchState prefetchState;

    @k
    private final String traverseKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public TraversablePrefetchStateNode(@k LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    @k
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final void setPrefetchState(@k LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @k
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
