package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    public TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.this$0 = textFieldDecoratorModifierNode;
    }

    private final FocusManager getFocusManager() {
        return (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalFocusManager());
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8 */
    public void mo1053defaultKeyboardActionKlQnJC8(int i11) {
        SoftwareKeyboardController requireKeyboardController;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4725equalsimpl0(i11, companion.m4741getNexteUduSuo())) {
            getFocusManager().mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2160getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4725equalsimpl0(i11, companion.m4743getPreviouseUduSuo())) {
            getFocusManager().mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2161getPreviousdhqQ8s());
        } else if (ImeAction.m4725equalsimpl0(i11, companion.m4739getDoneeUduSuo())) {
            requireKeyboardController = this.this$0.requireKeyboardController();
            requireKeyboardController.hide();
        }
    }
}
