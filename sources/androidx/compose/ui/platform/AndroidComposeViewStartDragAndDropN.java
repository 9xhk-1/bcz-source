package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes2.dex */
final class AndroidComposeViewStartDragAndDropN {

    @m80.k
    public static final AndroidComposeViewStartDragAndDropN INSTANCE = new AndroidComposeViewStartDragAndDropN();

    private AndroidComposeViewStartDragAndDropN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final boolean startDragAndDrop(@m80.k View view, @m80.k DragAndDropTransferData dragAndDropTransferData, @m80.k ComposeDragShadowBuilder composeDragShadowBuilder) {
        return view.startDragAndDrop(dragAndDropTransferData.getClipData(), composeDragShadowBuilder, dragAndDropTransferData.getLocalState(), dragAndDropTransferData.getFlags());
    }
}
