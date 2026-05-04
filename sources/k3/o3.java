package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65507a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65509c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65510d;

    public o3(@m80.k String userBookId, @m80.k String name, int i11, @m80.k String cover) {
        kotlin.jvm.internal.g0.p(userBookId, "userBookId");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        this.f65507a = userBookId;
        this.f65508b = name;
        this.f65509c = i11;
        this.f65510d = cover;
    }

    public static /* synthetic */ o3 f(o3 o3Var, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = o3Var.f65507a;
        }
        if ((i12 & 2) != 0) {
            str2 = o3Var.f65508b;
        }
        if ((i12 & 4) != 0) {
            i11 = o3Var.f65509c;
        }
        if ((i12 & 8) != 0) {
            str3 = o3Var.f65510d;
        }
        return o3Var.e(str, str2, i11, str3);
    }

    @m80.k
    public final String a() {
        return this.f65507a;
    }

    @m80.k
    public final String b() {
        return this.f65508b;
    }

    public final int c() {
        return this.f65509c;
    }

    @m80.k
    public final String d() {
        return this.f65510d;
    }

    @m80.k
    public final o3 e(@m80.k String userBookId, @m80.k String name, int i11, @m80.k String cover) {
        kotlin.jvm.internal.g0.p(userBookId, "userBookId");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        return new o3(userBookId, name, i11, cover);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return kotlin.jvm.internal.g0.g(this.f65507a, o3Var.f65507a) && kotlin.jvm.internal.g0.g(this.f65508b, o3Var.f65508b) && this.f65509c == o3Var.f65509c && kotlin.jvm.internal.g0.g(this.f65510d, o3Var.f65510d);
    }

    @m80.k
    public final String g() {
        return this.f65510d;
    }

    @m80.k
    public final String h() {
        return this.f65508b;
    }

    public int hashCode() {
        return (((((this.f65507a.hashCode() * 31) + this.f65508b.hashCode()) * 31) + Integer.hashCode(this.f65509c)) * 31) + this.f65510d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f65507a;
    }

    public final int j() {
        return this.f65509c;
    }

    @m80.k
    public String toString() {
        return "UserBookModel(userBookId=" + this.f65507a + ", name=" + this.f65508b + ", wordCount=" + this.f65509c + ", cover=" + this.f65510d + ')';
    }
}
