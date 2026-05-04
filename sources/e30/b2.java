package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b2 implements a2 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return a() == a2Var.a() && b() == a2Var.b() && getType().equals(a2Var.getType());
    }

    public int hashCode() {
        int hashCode = b().hashCode();
        if (h2.w(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (a() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (a()) {
            return "*";
        }
        if (b() == Variance.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
