package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import j00.c;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<LegacyDragSourceNodeWithDefaultPainter> {

    @k
    private final p<DragAndDropSourceScope, c<? super g2>, Object> dragAndDropSourceHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyDragAndDropSourceWithDefaultShadowElement(@k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement) {
            return g0.g(this.dragAndDropSourceHandler, ((LegacyDragAndDropSourceWithDefaultShadowElement) obj).dragAndDropSourceHandler);
        }
        return false;
    }

    @k
    public final p<DragAndDropSourceScope, c<? super g2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LegacyDragSourceNodeWithDefaultPainter create() {
        return new LegacyDragSourceNodeWithDefaultPainter(this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LegacyDragSourceNodeWithDefaultPainter legacyDragSourceNodeWithDefaultPainter) {
        legacyDragSourceNodeWithDefaultPainter.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
