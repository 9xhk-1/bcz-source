package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Stable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CodepointTransformationKt {
    @Stable
    @m80.k
    public static final CodepointTransformation mask(@m80.k CodepointTransformation.Companion companion, char c11) {
        return new MaskCodepointTransformation(c11);
    }

    @m80.k
    public static final CharSequence toVisualText(@m80.k TextFieldCharSequence textFieldCharSequence, @m80.k CodepointTransformation codepointTransformation, @m80.k OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        while (i11 < textFieldCharSequence.length()) {
            int codePointAt = CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i11);
            int transform = codepointTransformation.transform(i12, codePointAt);
            int charCount = CodepointHelpers_jvmKt.charCount(codePointAt);
            if (transform != codePointAt) {
                offsetMappingCalculator.recordEditOperation(sb2.length(), sb2.length() + charCount, CodepointHelpers_jvmKt.charCount(transform));
                z11 = true;
            }
            StringHelpers_jvmKt.appendCodePointX(sb2, transform);
            i11 += charCount;
            i12++;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return z11 ? sb3 : textFieldCharSequence;
    }
}
