package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollableContainerNode extends Modifier.Node implements TraversableNode {
    private boolean enabled;

    @k
    private final Object traverseKey = TraverseKey;

    @k
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(v vVar) {
            this();
        }

        private TraverseKey() {
        }
    }

    public ScrollableContainerNode(boolean z11) {
        this.enabled = z11;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @k
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void update(boolean z11) {
        this.enabled = z11;
    }
}
