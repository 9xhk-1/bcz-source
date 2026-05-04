package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    @k
    public static final CharSequence getSelectedText(@k TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m4557getMinimpl(textFieldCharSequence.m1189getSelectiond9O1mEE()), TextRange.m4556getMaximpl(textFieldCharSequence.m1189getSelectiond9O1mEE()));
    }

    @k
    public static final CharSequence getTextAfterSelection(@k TextFieldCharSequence textFieldCharSequence, int i11) {
        return textFieldCharSequence.subSequence(TextRange.m4556getMaximpl(textFieldCharSequence.m1189getSelectiond9O1mEE()), Math.min(TextRange.m4556getMaximpl(textFieldCharSequence.m1189getSelectiond9O1mEE()) + i11, textFieldCharSequence.length()));
    }

    @k
    public static final CharSequence getTextBeforeSelection(@k TextFieldCharSequence textFieldCharSequence, int i11) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m4557getMinimpl(textFieldCharSequence.m1189getSelectiond9O1mEE()) - i11), TextRange.m4557getMinimpl(textFieldCharSequence.m1189getSelectiond9O1mEE()));
    }
}
