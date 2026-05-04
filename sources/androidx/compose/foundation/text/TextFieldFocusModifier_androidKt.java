package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    @k
    public static final Modifier interceptDPadAndMoveFocus(@k Modifier modifier, @k final LegacyTextFieldState legacyTextFieldState, @k final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1147invokeZmokQxo(keyEvent.m3577unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1147invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean m1146isKeyCodeYhN2O0w;
                boolean m1146isKeyCodeYhN2O0w2;
                boolean m1146isKeyCodeYhN2O0w3;
                boolean m1146isKeyCodeYhN2O0w4;
                boolean m1146isKeyCodeYhN2O0w5;
                InputDevice device = keyEvent.getDevice();
                boolean z11 = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                    m1146isKeyCodeYhN2O0w = TextFieldFocusModifier_androidKt.m1146isKeyCodeYhN2O0w(keyEvent, 19);
                    if (m1146isKeyCodeYhN2O0w) {
                        z11 = FocusManager.this.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2163getUpdhqQ8s());
                    } else {
                        m1146isKeyCodeYhN2O0w2 = TextFieldFocusModifier_androidKt.m1146isKeyCodeYhN2O0w(keyEvent, 20);
                        if (m1146isKeyCodeYhN2O0w2) {
                            z11 = FocusManager.this.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2156getDowndhqQ8s());
                        } else {
                            m1146isKeyCodeYhN2O0w3 = TextFieldFocusModifier_androidKt.m1146isKeyCodeYhN2O0w(keyEvent, 21);
                            if (m1146isKeyCodeYhN2O0w3) {
                                z11 = FocusManager.this.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2159getLeftdhqQ8s());
                            } else {
                                m1146isKeyCodeYhN2O0w4 = TextFieldFocusModifier_androidKt.m1146isKeyCodeYhN2O0w(keyEvent, 22);
                                if (m1146isKeyCodeYhN2O0w4) {
                                    z11 = FocusManager.this.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2162getRightdhqQ8s());
                                } else {
                                    m1146isKeyCodeYhN2O0w5 = TextFieldFocusModifier_androidKt.m1146isKeyCodeYhN2O0w(keyEvent, 23);
                                    if (m1146isKeyCodeYhN2O0w5) {
                                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                                        if (keyboardController != null) {
                                            keyboardController.show();
                                        }
                                        z11 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m1146isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i11) {
        return Key_androidKt.m3595getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent)) == i11;
    }
}
