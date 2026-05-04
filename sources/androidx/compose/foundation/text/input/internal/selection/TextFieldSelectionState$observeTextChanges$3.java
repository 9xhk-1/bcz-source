package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements p<TextFieldCharSequence, CharSequence, Boolean> {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // x00.p
    public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
        return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
    }
}
