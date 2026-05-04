package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
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
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {

    @k
    private final p<DragAndDropSourceScope, c<? super g2>, Object> dragAndDropSourceHandler;

    @k
    private final l<DrawScope, g2> drawDragDecoration;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyDragAndDropSourceElement(@k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegacyDragAndDropSourceElement copy$default(LegacyDragAndDropSourceElement legacyDragAndDropSourceElement, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = legacyDragAndDropSourceElement.drawDragDecoration;
        }
        if ((i11 & 2) != 0) {
            pVar = legacyDragAndDropSourceElement.dragAndDropSourceHandler;
        }
        return legacyDragAndDropSourceElement.copy(lVar, pVar);
    }

    @k
    public final l<DrawScope, g2> component1() {
        return this.drawDragDecoration;
    }

    @k
    public final p<DragAndDropSourceScope, c<? super g2>, Object> component2() {
        return this.dragAndDropSourceHandler;
    }

    @k
    public final LegacyDragAndDropSourceElement copy(@k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        return new LegacyDragAndDropSourceElement(lVar, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) obj;
        return g0.g(this.drawDragDecoration, legacyDragAndDropSourceElement.drawDragDecoration) && g0.g(this.dragAndDropSourceHandler, legacyDragAndDropSourceElement.dragAndDropSourceHandler);
    }

    @k
    public final p<DragAndDropSourceScope, c<? super g2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @k
    public final l<DrawScope, g2> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.drawDragDecoration.hashCode() * 31) + this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @k
    public String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LegacyDragAndDropSourceNode create() {
        return new LegacyDragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
        legacyDragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        legacyDragAndDropSourceNode.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
