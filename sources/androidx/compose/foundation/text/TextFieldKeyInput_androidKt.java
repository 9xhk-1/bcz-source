package androidx.compose.foundation.text;

import android.view.KeyEvent;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m1153isTypedEventZmokQxo(@k KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
