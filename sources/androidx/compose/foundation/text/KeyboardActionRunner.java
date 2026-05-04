package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @l
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(@l SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo1053defaultKeyboardActionKlQnJC8(int i11) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4725equalsimpl0(i11, companion.m4741getNexteUduSuo())) {
            getFocusManager().mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2160getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4725equalsimpl0(i11, companion.m4743getPreviouseUduSuo())) {
            getFocusManager().mo2165moveFocus3ESFkO8(FocusDirection.Companion.m2161getPreviousdhqQ8s());
            return;
        }
        if (!ImeAction.m4725equalsimpl0(i11, companion.m4739getDoneeUduSuo())) {
            if (ImeAction.m4725equalsimpl0(i11, companion.m4740getGoeUduSuo()) ? true : ImeAction.m4725equalsimpl0(i11, companion.m4744getSearcheUduSuo()) ? true : ImeAction.m4725equalsimpl0(i11, companion.m4745getSendeUduSuo()) ? true : ImeAction.m4725equalsimpl0(i11, companion.m4738getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m4725equalsimpl0(i11, companion.m4742getNoneeUduSuo());
        } else {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        }
    }

    @k
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        g0.S("focusManager");
        return null;
    }

    @k
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        g0.S("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m1054runActionKlQnJC8(int i11) {
        x00.l<KeyboardActionScope, g2> lVar;
        ImeAction.Companion companion = ImeAction.Companion;
        g2 g2Var = null;
        if (ImeAction.m4725equalsimpl0(i11, companion.m4739getDoneeUduSuo())) {
            lVar = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4725equalsimpl0(i11, companion.m4740getGoeUduSuo())) {
            lVar = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4725equalsimpl0(i11, companion.m4741getNexteUduSuo())) {
            lVar = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4725equalsimpl0(i11, companion.m4743getPreviouseUduSuo())) {
            lVar = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4725equalsimpl0(i11, companion.m4744getSearcheUduSuo())) {
            lVar = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4725equalsimpl0(i11, companion.m4745getSendeUduSuo())) {
            lVar = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m4725equalsimpl0(i11, companion.m4738getDefaulteUduSuo()) ? true : ImeAction.m4725equalsimpl0(i11, companion.m4742getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(this);
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            mo1053defaultKeyboardActionKlQnJC8(i11);
        }
    }

    public final void setFocusManager(@k FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(@k KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
