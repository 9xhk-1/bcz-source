package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RecordingInputConnection_androidKt {
    public static final boolean DEBUG = false;

    @m80.k
    private static final String DEBUG_CLASS = "RecordingInputConnection";

    @m80.k
    public static final String TAG = "RecordingIC";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE());
        extractedText.flags = !u30.k0.m3(textFieldValue.getText(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
