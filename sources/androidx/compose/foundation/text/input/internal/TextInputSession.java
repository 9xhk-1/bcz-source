package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface TextInputSession extends ImeEditCommandScope {
    @m80.k
    TextFieldCharSequence getText();

    boolean onCommitContent(@m80.k TransferableContent transferableContent);

    /* renamed from: onImeAction-KlQnJC8 */
    void mo1219onImeActionKlQnJC8(int i11);

    int performHandwritingGesture(@m80.k HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(@m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i11);

    void sendKeyEvent(@m80.k KeyEvent keyEvent);
}
