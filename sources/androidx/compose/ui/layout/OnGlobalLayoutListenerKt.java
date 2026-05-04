package androidx.compose.ui.layout;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class OnGlobalLayoutListenerKt {
    @k
    public static final DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(@k DelegatableNode delegatableNode, long j11, long j12, @k l<? super RelativeLayoutBounds, g2> lVar) {
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnGlobalLayoutCallback(requireLayoutNode.getSemanticsId(), j11, j12, delegatableNode.getNode(), lVar);
    }
}
