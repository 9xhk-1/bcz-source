package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {

    @m80.k
    private l<? super LayoutCoordinates, g2> onPositioned;

    @m80.k
    private final Object traverseKey = TraverseKey;

    @m80.k
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

    public FocusedBoundsObserverNode(@m80.k l<? super LayoutCoordinates, g2> lVar) {
        this.onPositioned = lVar;
    }

    @m80.k
    public final l<LayoutCoordinates, g2> getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @m80.k
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void onFocusBoundsChanged(@m80.l LayoutCoordinates layoutCoordinates) {
        this.onPositioned.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.findNearestAncestor(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.onFocusBoundsChanged(layoutCoordinates);
        }
    }

    public final void setOnPositioned(@m80.k l<? super LayoutCoordinates, g2> lVar) {
        this.onPositioned = lVar;
    }
}
