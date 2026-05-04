package y20;

import e30.r0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f99214a;

    /* renamed from: b, reason: collision with root package name */
    public final h f99215b;

    public a(@m80.k r0 r0Var, @l h hVar) {
        if (r0Var == null) {
            c(0);
        }
        this.f99214a = r0Var;
        this.f99215b = hVar == null ? this : hVar;
    }

    private static /* synthetic */ void c(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i11 == 1) {
            objArr[1] = "getType";
        } else if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 1 && i11 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y20.h
    @m80.k
    public r0 getType() {
        r0 r0Var = this.f99214a;
        if (r0Var == null) {
            c(1);
        }
        return r0Var;
    }
}
