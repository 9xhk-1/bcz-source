package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x0[] f65731a;

    public z0(@m80.k x0[] items) {
        kotlin.jvm.internal.g0.p(items, "items");
        this.f65731a = items;
    }

    public static /* synthetic */ z0 c(z0 z0Var, x0[] x0VarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            x0VarArr = z0Var.f65731a;
        }
        return z0Var.b(x0VarArr);
    }

    @m80.k
    public final x0[] a() {
        return this.f65731a;
    }

    @m80.k
    public final z0 b(@m80.k x0[] items) {
        kotlin.jvm.internal.g0.p(items, "items");
        return new z0(items);
    }

    @m80.k
    public final x0[] d() {
        return this.f65731a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Arrays.equals(this.f65731a, ((z0) obj).f65731a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f65731a);
    }

    @m80.k
    public String toString() {
        return "GoldenNavigation(items=" + Arrays.toString(this.f65731a) + ')';
    }
}
