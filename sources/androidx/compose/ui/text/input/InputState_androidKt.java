package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import m80.k;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InputState_androidKt {
    @k
    public static final ExtractedText toExtractedText(@k TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE());
        extractedText.flags = !k0.m3(textFieldValue.getText(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
