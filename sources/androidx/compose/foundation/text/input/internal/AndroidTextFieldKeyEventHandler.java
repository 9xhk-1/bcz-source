package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-CJ9ybgU, reason: not valid java name */
    public boolean mo1215onKeyEventCJ9ybgU(@m80.k KeyEvent keyEvent, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k x00.l<? super KeyCommand, ? extends g2> lVar, boolean z11, boolean z12, @m80.k x00.a<g2> aVar) {
        if (KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.m1289isFromSoftKeyboardZmokQxo(keyEvent)) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo1215onKeyEventCJ9ybgU(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, lVar, z11, z12, aVar);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo1216onPreKeyEventMyFupTE(@m80.k KeyEvent keyEvent, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k FocusManager focusManager, @m80.k SoftwareKeyboardController softwareKeyboardController) {
        boolean m1290isKeyCodeYhN2O0w;
        boolean m1290isKeyCodeYhN2O0w2;
        boolean m1290isKeyCodeYhN2O0w3;
        boolean m1290isKeyCodeYhN2O0w4;
        boolean m1290isKeyCodeYhN2O0w5;
        if (super.mo1216onPreKeyEventMyFupTE(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual() || !KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY()) || keyEvent.getSource() == 257) {
            return false;
        }
        m1290isKeyCodeYhN2O0w = TextFieldKeyEventHandler_androidKt.m1290isKeyCodeYhN2O0w(keyEvent, 19);
        if (m1290isKeyCodeYhN2O0w) {
            return focusManager.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2163getUpdhqQ8s());
        }
        m1290isKeyCodeYhN2O0w2 = TextFieldKeyEventHandler_androidKt.m1290isKeyCodeYhN2O0w(keyEvent, 20);
        if (m1290isKeyCodeYhN2O0w2) {
            return focusManager.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2156getDowndhqQ8s());
        }
        m1290isKeyCodeYhN2O0w3 = TextFieldKeyEventHandler_androidKt.m1290isKeyCodeYhN2O0w(keyEvent, 21);
        if (m1290isKeyCodeYhN2O0w3) {
            return focusManager.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2159getLeftdhqQ8s());
        }
        m1290isKeyCodeYhN2O0w4 = TextFieldKeyEventHandler_androidKt.m1290isKeyCodeYhN2O0w(keyEvent, 22);
        if (m1290isKeyCodeYhN2O0w4) {
            return focusManager.mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2162getRightdhqQ8s());
        }
        m1290isKeyCodeYhN2O0w5 = TextFieldKeyEventHandler_androidKt.m1290isKeyCodeYhN2O0w(keyEvent, 23);
        if (!m1290isKeyCodeYhN2O0w5) {
            return false;
        }
        softwareKeyboardController.show();
        return true;
    }
}
