package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DragAndDropTargetKt {
    @k
    public static final Modifier dragAndDropTarget(@k Modifier modifier, @k l<? super DragAndDropEvent, Boolean> lVar, @k DragAndDropTarget dragAndDropTarget) {
        return modifier.then(new DropTargetElement(lVar, dragAndDropTarget));
    }
}
