package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldKeyEventHandler_androidKt {
    @m80.k
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m1289isFromSoftKeyboardZmokQxo(@m80.k KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m1290isKeyCodeYhN2O0w(KeyEvent keyEvent, int i11) {
        return Key_androidKt.m3595getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent)) == i11;
    }
}
