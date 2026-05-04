package androidx.compose.ui.draganddrop;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DragAndDropTarget {
    boolean onDrop(@k DragAndDropEvent dragAndDropEvent);

    default void onChanged(@k DragAndDropEvent dragAndDropEvent) {
    }

    default void onEnded(@k DragAndDropEvent dragAndDropEvent) {
    }

    default void onEntered(@k DragAndDropEvent dragAndDropEvent) {
    }

    default void onExited(@k DragAndDropEvent dragAndDropEvent) {
    }

    default void onMoved(@k DragAndDropEvent dragAndDropEvent) {
    }

    default void onStarted(@k DragAndDropEvent dragAndDropEvent) {
    }
}
