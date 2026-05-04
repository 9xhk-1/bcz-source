package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65402b;

    public k2(int i11, int i12) {
        this.f65401a = i11;
        this.f65402b = i12;
    }

    public static /* synthetic */ k2 d(k2 k2Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = k2Var.f65401a;
        }
        if ((i13 & 2) != 0) {
            i12 = k2Var.f65402b;
        }
        return k2Var.c(i11, i12);
    }

    public final int a() {
        return this.f65401a;
    }

    public final int b() {
        return this.f65402b;
    }

    @m80.k
    public final k2 c(int i11, int i12) {
        return new k2(i11, i12);
    }

    public final int e() {
        return this.f65402b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f65401a == k2Var.f65401a && this.f65402b == k2Var.f65402b;
    }

    public final int f() {
        return this.f65401a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f65401a) * 31) + Integer.hashCode(this.f65402b);
    }

    @m80.k
    public String toString() {
        return "RoleInfo(roleUp=" + this.f65401a + ", grade=" + this.f65402b + ')';
    }
}
