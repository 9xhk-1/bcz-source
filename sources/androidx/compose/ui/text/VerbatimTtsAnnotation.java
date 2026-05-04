package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public static final int $stable = 0;

    @k
    private final String verbatim;

    public VerbatimTtsAnnotation(@k String str) {
        super(null);
        this.verbatim = str;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerbatimTtsAnnotation) && g0.g(this.verbatim, ((VerbatimTtsAnnotation) obj).verbatim);
    }

    @k
    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    @k
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
