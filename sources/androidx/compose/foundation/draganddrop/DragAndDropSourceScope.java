package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.input.pointer.PointerInputScope;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
@n(message = "Replaced by a callback for obtain a transfer data,start detection is performed by Compose itself")
/* loaded from: classes.dex */
public interface DragAndDropSourceScope extends PointerInputScope {
    void startTransfer(@k DragAndDropTransferData dragAndDropTransferData);
}
