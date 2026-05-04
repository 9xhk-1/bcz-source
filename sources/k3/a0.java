package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65199a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65202d;

    public a0(int i11, @m80.k String name, int i12, int i13) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f65199a = i11;
        this.f65200b = name;
        this.f65201c = i12;
        this.f65202d = i13;
    }

    public static /* synthetic */ a0 f(a0 a0Var, int i11, String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = a0Var.f65199a;
        }
        if ((i14 & 2) != 0) {
            str = a0Var.f65200b;
        }
        if ((i14 & 4) != 0) {
            i12 = a0Var.f65201c;
        }
        if ((i14 & 8) != 0) {
            i13 = a0Var.f65202d;
        }
        return a0Var.e(i11, str, i12, i13);
    }

    public final int a() {
        return this.f65199a;
    }

    @m80.k
    public final String b() {
        return this.f65200b;
    }

    public final int c() {
        return this.f65201c;
    }

    public final int d() {
        return this.f65202d;
    }

    @m80.k
    public final a0 e(int i11, @m80.k String name, int i12, int i13) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new a0(i11, name, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f65199a == a0Var.f65199a && kotlin.jvm.internal.g0.g(this.f65200b, a0Var.f65200b) && this.f65201c == a0Var.f65201c && this.f65202d == a0Var.f65202d;
    }

    public final int g() {
        return this.f65199a;
    }

    @m80.k
    public final String h() {
        return this.f65200b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f65199a) * 31) + this.f65200b.hashCode()) * 31) + Integer.hashCode(this.f65201c)) * 31) + Integer.hashCode(this.f65202d);
    }

    public final int i() {
        return this.f65201c;
    }

    public final int j() {
        return this.f65202d;
    }

    @m80.k
    public String toString() {
        return "ChildAddressModel(id=" + this.f65199a + ", name=" + this.f65200b + ", parentId=" + this.f65201c + ", type=" + this.f65202d + ')';
    }
}
