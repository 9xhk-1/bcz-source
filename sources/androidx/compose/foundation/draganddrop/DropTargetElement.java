package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {

    @k
    private final l<DragAndDropEvent, Boolean> shouldStartDragAndDrop;

    @k
    private final DragAndDropTarget target;

    /* JADX WARN: Multi-variable type inference failed */
    public DropTargetElement(@k l<? super DragAndDropEvent, Boolean> lVar, @k DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = lVar;
        this.target = dragAndDropTarget;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        return g0.g(this.target, dropTargetElement.target) && this.shouldStartDragAndDrop == dropTargetElement.shouldStartDragAndDrop;
    }

    @k
    public final l<DragAndDropEvent, Boolean> getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    @k
    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.target.hashCode() * 31) + this.shouldStartDragAndDrop.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropTarget");
        inspectorInfo.getProperties().set(TypedValues.AttributesType.S_TARGET, this.target);
        inspectorInfo.getProperties().set("shouldStartDragAndDrop", this.shouldStartDragAndDrop);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DragAndDropTargetNode create() {
        return new DragAndDropTargetNode(this.shouldStartDragAndDrop, this.target);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.update(this.shouldStartDragAndDrop, this.target);
    }
}
