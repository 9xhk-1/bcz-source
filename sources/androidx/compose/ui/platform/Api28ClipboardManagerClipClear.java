package androidx.compose.ui.platform;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
final class Api28ClipboardManagerClipClear {

    @m80.k
    public static final Api28ClipboardManagerClipClear INSTANCE = new Api28ClipboardManagerClipClear();

    private Api28ClipboardManagerClipClear() {
    }

    @w00.o
    public static final void clearPrimaryClip(@m80.k android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
