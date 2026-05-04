package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String[] f65732a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String[] f65733b;

    public z3(@m80.k String[] domains, @m80.k String[] cookies) {
        kotlin.jvm.internal.g0.p(domains, "domains");
        kotlin.jvm.internal.g0.p(cookies, "cookies");
        this.f65732a = domains;
        this.f65733b = cookies;
    }

    public static /* synthetic */ z3 d(z3 z3Var, String[] strArr, String[] strArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = z3Var.f65732a;
        }
        if ((i11 & 2) != 0) {
            strArr2 = z3Var.f65733b;
        }
        return z3Var.c(strArr, strArr2);
    }

    @m80.k
    public final String[] a() {
        return this.f65732a;
    }

    @m80.k
    public final String[] b() {
        return this.f65733b;
    }

    @m80.k
    public final z3 c(@m80.k String[] domains, @m80.k String[] cookies) {
        kotlin.jvm.internal.g0.p(domains, "domains");
        kotlin.jvm.internal.g0.p(cookies, "cookies");
        return new z3(domains, cookies);
    }

    @m80.k
    public final String[] e() {
        return this.f65733b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return Arrays.equals(this.f65732a, z3Var.f65732a) && Arrays.equals(this.f65733b, z3Var.f65733b);
    }

    @m80.k
    public final String[] f() {
        return this.f65732a;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f65732a) * 31) + Arrays.hashCode(this.f65733b);
    }

    @m80.k
    public String toString() {
        return "WebCookie(domains=" + Arrays.toString(this.f65732a) + ", cookies=" + Arrays.toString(this.f65733b) + ')';
    }
}
