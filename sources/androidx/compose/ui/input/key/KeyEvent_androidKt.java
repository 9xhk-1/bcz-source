package androidx.compose.ui.input.key;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m3588getKeyZmokQxo(@k android.view.KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m3589getTypeZmokQxo(@k android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? KeyEventType.Companion.m3587getUnknownCS__XNY() : KeyEventType.Companion.m3586getKeyUpCS__XNY() : KeyEventType.Companion.m3585getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m3590getUtf16CodePointZmokQxo(@k android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3591isAltPressedZmokQxo(@k android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3592isCtrlPressedZmokQxo(@k android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3593isMetaPressedZmokQxo(@k android.view.KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3594isShiftPressedZmokQxo(@k android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
