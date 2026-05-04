package androidx.compose.ui.draganddrop;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "This interface is deprecated in favor to DragAndDropSourceModifierNode and DragAndDropTargetModifierNode", replaceWith = @w0(expression = "DragAndDropSourceModifierNode", imports = {}))
/* loaded from: classes.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(@k DragAndDropEvent dragAndDropEvent);

    @n(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo2106drag12SF9DM(@k DragAndDropTransferData dragAndDropTransferData, long j11, @k l<? super DrawScope, g2> lVar);
}
