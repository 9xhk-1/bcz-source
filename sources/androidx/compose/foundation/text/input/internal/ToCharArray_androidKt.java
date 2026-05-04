package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ToCharArray_androidKt {
    public static final void toCharArray(@m80.k CharSequence charSequence, @m80.k char[] cArr, int i11, int i12, int i13) {
        if (charSequence instanceof TextFieldCharSequence) {
            ((TextFieldCharSequence) charSequence).toCharArray(cArr, i11, i12, i13);
            return;
        }
        while (i12 < i13) {
            cArr[i11] = charSequence.charAt(i12);
            i12++;
            i11++;
        }
    }
}
