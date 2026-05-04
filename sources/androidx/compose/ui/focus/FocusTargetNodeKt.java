package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusTargetNodeKt {
    @l
    public static final FocusTransactionManager getFocusTransactionManager(@k FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        FocusOwner focusOwner;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release == null || (layoutNode = coordinator$ui_release.getLayoutNode()) == null || (owner$ui_release = layoutNode.getOwner$ui_release()) == null || (focusOwner = owner$ui_release.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void invalidateFocusTarget(@k FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }

    @k
    public static final FocusTransactionManager requireTransactionManager(@k FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
