package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ConstraintSetRef {
    public static final int $stable = 0;

    @k
    private final String name;

    public ConstraintSetRef(@k String str) {
        this.name = str;
    }

    public static /* synthetic */ ConstraintSetRef copy$default(ConstraintSetRef constraintSetRef, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = constraintSetRef.name;
        }
        return constraintSetRef.copy(str);
    }

    @k
    public final String component1$constraintlayout_compose_release() {
        return this.name;
    }

    @k
    public final ConstraintSetRef copy(@k String str) {
        return new ConstraintSetRef(str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConstraintSetRef) && g0.g(this.name, ((ConstraintSetRef) obj).name);
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @k
    public String toString() {
        return "ConstraintSetRef(name=" + this.name + ')';
    }
}
