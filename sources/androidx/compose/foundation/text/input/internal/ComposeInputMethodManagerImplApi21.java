package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi21 extends ComposeInputMethodManagerImpl {

    @m80.l
    private BaseInputConnection baseInputConnection;

    public ComposeInputMethodManagerImplApi21(@m80.k View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(@m80.k KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.baseInputConnection;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(getView(), false);
            this.baseInputConnection = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
