package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m1051cancelsTextSelectionZmokQxo(@k KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3586getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
