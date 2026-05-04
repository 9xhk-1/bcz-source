package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FocusEnterExitScope {
    @ExperimentalComposeUiApi
    @n(message = "Use cancelFocusChange instead", replaceWith = @w0(expression = "cancelFocusChange", imports = {}))
    default void cancelFocus() {
        cancelFocusChange();
    }

    void cancelFocusChange();

    /* renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo2148getRequestedFocusDirectiondhqQ8s();
}
