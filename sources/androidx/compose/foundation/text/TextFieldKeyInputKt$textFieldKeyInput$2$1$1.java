package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements l<KeyEvent, Boolean> {
    public TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m1152invokeZmokQxo(keyEvent.m3577unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m1152invokeZmokQxo(android.view.KeyEvent keyEvent) {
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m1149processZmokQxo(keyEvent));
    }
}
