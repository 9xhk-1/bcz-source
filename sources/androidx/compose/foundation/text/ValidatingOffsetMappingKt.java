package androidx.compose.foundation.text;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nValidatingOffsetMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,135:1\n50#2,5:136\n50#2,5:141\n*S KotlinDebug\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n*L\n117#1:136,5\n129#1:141,5\n*E\n"})
/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {

    @k
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);

    @k
    public static final TransformedText filterWithValidation(@k VisualTransformation visualTransformation, @k AnnotatedString annotatedString) {
        TransformedText filter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(filter, annotatedString.length(), 0, 2, null);
        return new TransformedText(filter.getText(), new ValidatingOffsetMapping(filter.getOffsetMapping(), annotatedString.length(), filter.getText().length()));
    }

    @k
    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    @VisibleForTesting
    public static final void throwIfNotValidTransform(@k TransformedText transformedText, int i11, int i12) {
        int length = transformedText.getText().length();
        int min = Math.min(i11, i12);
        for (int i13 = 0; i13 < min; i13++) {
            validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i13), length, i13);
        }
        validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i11), length, i11);
        int min2 = Math.min(length, i12);
        for (int i14 = 0; i14 < min2; i14++) {
            validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(i14), i11, i14);
        }
        validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(length), i11, length);
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText transformedText, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 100;
        }
        throwIfNotValidTransform(transformedText, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.originalToTransformed returned invalid mapping: " + i13 + " -> " + i11 + " is not in range of transformed text [0, " + i12 + l50.b.f69930l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.transformedToOriginal returned invalid mapping: " + i13 + " -> " + i11 + " is not in range of original text [0, " + i12 + l50.b.f69930l);
    }
}
