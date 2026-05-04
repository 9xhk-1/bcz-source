package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    @k
    public static final DragAndDropTargetModifierNode ReceiveContentDragAndDropNode(@k final ReceiveContentConfiguration receiveContentConfiguration, @k final l<? super DragAndDropEvent, g2> lVar) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new l<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$1
            @Override // x00.l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                return Boolean.TRUE;
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                lVar.invoke(dragAndDropEvent);
                TransferableContent transferableContent = ReceiveContentDragAndDropNode_androidKt.toTransferableContent(dragAndDropEvent);
                return !g0.g(transferableContent, ReceiveContentConfiguration.this.getReceiveContentListener().onReceive(transferableContent));
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragEnd();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragEnter();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragExit();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragStart();
            }
        });
    }

    @k
    public static final TransferableContent toTransferableContent(@k DragAndDropEvent dragAndDropEvent) {
        DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
        return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(androidDragEvent.getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(androidDragEvent.getClipDescription()), TransferableContent.Source.Companion.m337getDragAndDropkB6V9T0(), null, 8, null);
    }
}
