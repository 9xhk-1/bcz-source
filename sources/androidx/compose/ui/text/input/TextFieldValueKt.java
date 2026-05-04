package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    @k
    public static final AnnotatedString getSelectedText(@k TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m4388subSequence5zctL8(textFieldValue.m4807getSelectiond9O1mEE());
    }

    @k
    public static final AnnotatedString getTextAfterSelection(@k TextFieldValue textFieldValue, int i11) {
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()), Math.min(TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()) + i11, textFieldValue.getText().length()));
    }

    @k
    public static final AnnotatedString getTextBeforeSelection(@k TextFieldValue textFieldValue, int i11) {
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE()) - i11), TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE()));
    }
}
