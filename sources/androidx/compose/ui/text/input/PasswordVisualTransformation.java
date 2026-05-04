package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.f0;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    @k
    public TransformedText filter(@k AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(f0.v2(String.valueOf(this.mask), annotatedString.getText().length()), null, 2, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public PasswordVisualTransformation(char c11) {
        this.mask = c11;
    }

    public /* synthetic */ PasswordVisualTransformation(char c11, int i11, v vVar) {
        this((i11 & 1) != 0 ? u0.E : c11);
    }
}
