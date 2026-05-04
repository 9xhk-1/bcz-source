package y20;

import e30.r0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@m80.k r0 r0Var) {
        this(r0Var, null);
        if (r0Var == null) {
            c(0);
        }
    }

    private static /* synthetic */ void c(int i11) {
        Object[] objArr = new Object[3];
        if (i11 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i11 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k r0 r0Var, @l h hVar) {
        super(r0Var, hVar);
        if (r0Var == null) {
            c(1);
        }
    }
}
