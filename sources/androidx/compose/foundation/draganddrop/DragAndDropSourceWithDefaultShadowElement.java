package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
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
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {

    @k
    private p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> detectDragStart;

    @k
    private l<? super Offset, DragAndDropTransferData> transferData;

    public DragAndDropSourceWithDefaultShadowElement(@k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar, @k l<? super Offset, DragAndDropTransferData> lVar) {
        this.detectDragStart = pVar;
        this.transferData = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DragAndDropSourceWithDefaultShadowElement copy$default(DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement, p pVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pVar = dragAndDropSourceWithDefaultShadowElement.detectDragStart;
        }
        if ((i11 & 2) != 0) {
            lVar = dragAndDropSourceWithDefaultShadowElement.transferData;
        }
        return dragAndDropSourceWithDefaultShadowElement.copy(pVar, lVar);
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> component1() {
        return this.detectDragStart;
    }

    @k
    public final l<Offset, DragAndDropTransferData> component2() {
        return this.transferData;
    }

    @k
    public final DragAndDropSourceWithDefaultShadowElement copy(@k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar, @k l<? super Offset, DragAndDropTransferData> lVar) {
        return new DragAndDropSourceWithDefaultShadowElement(pVar, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return g0.g(this.detectDragStart, dragAndDropSourceWithDefaultShadowElement.detectDragStart) && g0.g(this.transferData, dragAndDropSourceWithDefaultShadowElement.transferData);
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    @k
    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.detectDragStart.hashCode() * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(@k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.detectDragStart = pVar;
    }

    public final void setTransferData(@k l<? super Offset, DragAndDropTransferData> lVar) {
        this.transferData = lVar;
    }

    @k
    public String toString() {
        return "DragAndDropSourceWithDefaultShadowElement(detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.setDetectDragStart(this.detectDragStart);
        dragSourceNodeWithDefaultPainter.setTransferData(this.transferData);
    }
}
