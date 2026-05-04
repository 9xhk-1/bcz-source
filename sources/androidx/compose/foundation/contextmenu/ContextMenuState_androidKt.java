package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContextMenuState_androidKt {

    @k
    private static final String UNSPECIFIED_OFFSET_ERROR_MESSAGE = "ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.";

    public static final void close(@k ContextMenuState contextMenuState) {
        contextMenuState.setStatus(ContextMenuState.Status.Closed.INSTANCE);
    }
}
