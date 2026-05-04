package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropEvent {
    public static final int $stable = 8;

    @k
    private final DragEvent dragEvent;

    public DragAndDropEvent(@k DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    @k
    public final DragEvent getDragEvent$ui_release() {
        return this.dragEvent;
    }
}
