package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {

    @k
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo1052mapZmokQxo(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m3594isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m3591isAltPressedZmokQxo(keyEvent)) {
                long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1091getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1092getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1093getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1090getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m3591isAltPressedZmokQxo(keyEvent)) {
                long m3588getKeyZmokQxo2 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1091getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1092getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1093getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1090getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo1052mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    @k
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
