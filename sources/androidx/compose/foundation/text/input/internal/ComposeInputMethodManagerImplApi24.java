package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    public ComposeInputMethodManagerImplApi24(@m80.k View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(@m80.k KeyEvent keyEvent) {
        requireImm().dispatchKeyEventFromInputMethod(getView(), keyEvent);
    }
}
