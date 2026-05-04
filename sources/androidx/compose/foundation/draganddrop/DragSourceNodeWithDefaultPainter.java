package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import j00.c;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {

    @k
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;

    @k
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public DragSourceNodeWithDefaultPainter(@k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar, @k l<? super Offset, DragAndDropTransferData> lVar) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) delegate(new DragAndDropSourceNode(new l<DrawScope, g2>() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback2;
                cacheDrawScopeDragShadowCallback2 = DragSourceNodeWithDefaultPainter.this.cacheDrawScopeDragShadowCallback;
                cacheDrawScopeDragShadowCallback2.drawDragShadow(drawScope);
            }
        }, pVar, lVar));
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    @k
    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setDetectDragStart(@k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.dragAndDropModifierNode.setDetectDragStart(pVar);
    }

    public final void setTransferData(@k l<? super Offset, DragAndDropTransferData> lVar) {
        this.dragAndDropModifierNode.setTransferData(lVar);
    }
}
