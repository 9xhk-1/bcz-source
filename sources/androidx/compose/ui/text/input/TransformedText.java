package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TransformedText {
    public static final int $stable = 8;

    @k
    private final OffsetMapping offsetMapping;

    @k
    private final AnnotatedString text;

    public TransformedText(@k AnnotatedString annotatedString, @k OffsetMapping offsetMapping) {
        this.text = annotatedString;
        this.offsetMapping = offsetMapping;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        return g0.g(this.text, transformedText.text) && g0.g(this.offsetMapping, transformedText.offsetMapping);
    }

    @k
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @k
    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    @k
    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
