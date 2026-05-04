package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends ModifierNodeElement<TraversablePrefetchStateNode> {

    @k
    private final LazyLayoutPrefetchState prefetchState;

    public TraversablePrefetchStateModifierElement(@k LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    private final LazyLayoutPrefetchState component1() {
        return this.prefetchState;
    }

    public static /* synthetic */ TraversablePrefetchStateModifierElement copy$default(TraversablePrefetchStateModifierElement traversablePrefetchStateModifierElement, LazyLayoutPrefetchState lazyLayoutPrefetchState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lazyLayoutPrefetchState = traversablePrefetchStateModifierElement.prefetchState;
        }
        return traversablePrefetchStateModifierElement.copy(lazyLayoutPrefetchState);
    }

    @k
    public final TraversablePrefetchStateModifierElement copy(@k LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        return new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && g0.g(this.prefetchState, ((TraversablePrefetchStateModifierElement) obj).prefetchState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.prefetchState.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("traversablePrefetchState");
        inspectorInfo.setValue(this.prefetchState);
    }

    @k
    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.prefetchState + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public TraversablePrefetchStateNode create() {
        return new TraversablePrefetchStateNode(this.prefetchState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k TraversablePrefetchStateNode traversablePrefetchStateNode) {
        traversablePrefetchStateNode.setPrefetchState(this.prefetchState);
    }
}
