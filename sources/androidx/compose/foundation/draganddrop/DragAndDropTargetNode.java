package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDragAndDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropTarget.kt\nandroidx/compose/foundation/draganddrop/DragAndDropTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
/* loaded from: classes.dex */
final class DragAndDropTargetNode extends DelegatingNode {

    @l
    private DragAndDropTargetModifierNode dragAndDropNode;

    @k
    private x00.l<? super DragAndDropEvent, Boolean> shouldStartDragAndDrop;

    @k
    private DragAndDropTarget target;

    public DragAndDropTargetNode(@k x00.l<? super DragAndDropEvent, Boolean> lVar, @k DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = lVar;
        this.target = dragAndDropTarget;
    }

    private final void createAndAttachDragAndDropModifierNode() {
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(DragAndDropNodeKt.DragAndDropTargetModifierNode(new x00.l<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.draganddrop.DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                x00.l lVar;
                lVar = DragAndDropTargetNode.this.shouldStartDragAndDrop;
                return (Boolean) lVar.invoke(dragAndDropEvent);
            }
        }, this.target));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        createAndAttachDragAndDropModifierNode();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        g0.m(dragAndDropTargetModifierNode);
        undelegate(dragAndDropTargetModifierNode);
    }

    public final void update(@k x00.l<? super DragAndDropEvent, Boolean> lVar, @k DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = lVar;
        if (g0.g(dragAndDropTarget, this.target)) {
            return;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        if (dragAndDropTargetModifierNode != null) {
            undelegate(dragAndDropTargetModifierNode);
        }
        this.target = dragAndDropTarget;
        createAndAttachDragAndDropModifierNode();
    }
}
