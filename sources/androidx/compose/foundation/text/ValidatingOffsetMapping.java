package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ValidatingOffsetMapping implements OffsetMapping {

    @k
    private final OffsetMapping delegate;
    private final int originalLength;
    private final int transformedLength;

    public ValidatingOffsetMapping(@k OffsetMapping offsetMapping, int i11, int i12) {
        this.delegate = offsetMapping;
        this.originalLength = i11;
        this.transformedLength = i12;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i11) {
        int originalToTransformed = this.delegate.originalToTransformed(i11);
        if (i11 >= 0 && i11 <= this.originalLength) {
            ValidatingOffsetMappingKt.validateOriginalToTransformed(originalToTransformed, this.transformedLength, i11);
        }
        return originalToTransformed;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i11) {
        int transformedToOriginal = this.delegate.transformedToOriginal(i11);
        if (i11 >= 0 && i11 <= this.transformedLength) {
            ValidatingOffsetMappingKt.validateTransformedToOriginal(transformedToOriginal, this.originalLength, i11);
        }
        return transformedToOriginal;
    }
}
