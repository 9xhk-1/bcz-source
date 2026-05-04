package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import j00.c;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {

    @k
    private final p<DragAndDropStartDetectorScope, c<? super g2>, Object> detectDragStart;

    @k
    private final l<DrawScope, g2> drawDragDecoration;

    @k
    private final l<Offset, DragAndDropTransferData> transferData;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(@k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar, @k l<? super Offset, DragAndDropTransferData> lVar2) {
        this.drawDragDecoration = lVar;
        this.detectDragStart = pVar;
        this.transferData = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DragAndDropSourceElement copy$default(DragAndDropSourceElement dragAndDropSourceElement, l lVar, p pVar, l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i11 & 2) != 0) {
            pVar = dragAndDropSourceElement.detectDragStart;
        }
        if ((i11 & 4) != 0) {
            lVar2 = dragAndDropSourceElement.transferData;
        }
        return dragAndDropSourceElement.copy(lVar, pVar, lVar2);
    }

    @k
    public final l<DrawScope, g2> component1() {
        return this.drawDragDecoration;
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> component2() {
        return this.detectDragStart;
    }

    @k
    public final l<Offset, DragAndDropTransferData> component3() {
        return this.transferData;
    }

    @k
    public final DragAndDropSourceElement copy(@k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar, @k l<? super Offset, DragAndDropTransferData> lVar2) {
        return new DragAndDropSourceElement(lVar, pVar, lVar2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return g0.g(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && g0.g(this.detectDragStart, dragAndDropSourceElement.detectDragStart) && g0.g(this.transferData, dragAndDropSourceElement.transferData);
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    @k
    public final l<DrawScope, g2> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @k
    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.drawDragDecoration.hashCode() * 31) + this.detectDragStart.hashCode()) * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    @k
    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDetectDragStart(this.detectDragStart);
        dragAndDropSourceNode.setTransferData(this.transferData);
    }
}
