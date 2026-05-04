package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65462a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65463b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65464c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a0 f65465d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final a0 f65466e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final a0 f65467f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f65468g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65469h;

    public n3(int i11, @m80.k String name, @m80.k String mobile, @m80.k a0 province, @m80.k a0 city, @m80.l a0 a0Var, @m80.k String detail, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(mobile, "mobile");
        kotlin.jvm.internal.g0.p(province, "province");
        kotlin.jvm.internal.g0.p(city, "city");
        kotlin.jvm.internal.g0.p(detail, "detail");
        this.f65462a = i11;
        this.f65463b = name;
        this.f65464c = mobile;
        this.f65465d = province;
        this.f65466e = city;
        this.f65467f = a0Var;
        this.f65468g = detail;
        this.f65469h = i12;
    }

    public static /* synthetic */ n3 j(n3 n3Var, int i11, String str, String str2, a0 a0Var, a0 a0Var2, a0 a0Var3, String str3, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = n3Var.f65462a;
        }
        if ((i13 & 2) != 0) {
            str = n3Var.f65463b;
        }
        if ((i13 & 4) != 0) {
            str2 = n3Var.f65464c;
        }
        if ((i13 & 8) != 0) {
            a0Var = n3Var.f65465d;
        }
        if ((i13 & 16) != 0) {
            a0Var2 = n3Var.f65466e;
        }
        if ((i13 & 32) != 0) {
            a0Var3 = n3Var.f65467f;
        }
        if ((i13 & 64) != 0) {
            str3 = n3Var.f65468g;
        }
        if ((i13 & 128) != 0) {
            i12 = n3Var.f65469h;
        }
        String str4 = str3;
        int i14 = i12;
        a0 a0Var4 = a0Var2;
        a0 a0Var5 = a0Var3;
        return n3Var.i(i11, str, str2, a0Var, a0Var4, a0Var5, str4, i14);
    }

    public final int a() {
        return this.f65462a;
    }

    @m80.k
    public final String b() {
        return this.f65463b;
    }

    @m80.k
    public final String c() {
        return this.f65464c;
    }

    @m80.k
    public final a0 d() {
        return this.f65465d;
    }

    @m80.k
    public final a0 e() {
        return this.f65466e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.f65462a == n3Var.f65462a && kotlin.jvm.internal.g0.g(this.f65463b, n3Var.f65463b) && kotlin.jvm.internal.g0.g(this.f65464c, n3Var.f65464c) && kotlin.jvm.internal.g0.g(this.f65465d, n3Var.f65465d) && kotlin.jvm.internal.g0.g(this.f65466e, n3Var.f65466e) && kotlin.jvm.internal.g0.g(this.f65467f, n3Var.f65467f) && kotlin.jvm.internal.g0.g(this.f65468g, n3Var.f65468g) && this.f65469h == n3Var.f65469h;
    }

    @m80.l
    public final a0 f() {
        return this.f65467f;
    }

    @m80.k
    public final String g() {
        return this.f65468g;
    }

    public final int h() {
        return this.f65469h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f65462a) * 31) + this.f65463b.hashCode()) * 31) + this.f65464c.hashCode()) * 31) + this.f65465d.hashCode()) * 31) + this.f65466e.hashCode()) * 31;
        a0 a0Var = this.f65467f;
        return ((((hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31) + this.f65468g.hashCode()) * 31) + Integer.hashCode(this.f65469h);
    }

    @m80.k
    public final n3 i(int i11, @m80.k String name, @m80.k String mobile, @m80.k a0 province, @m80.k a0 city, @m80.l a0 a0Var, @m80.k String detail, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(mobile, "mobile");
        kotlin.jvm.internal.g0.p(province, "province");
        kotlin.jvm.internal.g0.p(city, "city");
        kotlin.jvm.internal.g0.p(detail, "detail");
        return new n3(i11, name, mobile, province, city, a0Var, detail, i12);
    }

    @m80.k
    public final a0 k() {
        return this.f65466e;
    }

    @m80.k
    public final String l() {
        return this.f65468g;
    }

    @m80.l
    public final a0 m() {
        return this.f65467f;
    }

    public final int n() {
        return this.f65462a;
    }

    @m80.k
    public final String o() {
        return this.f65464c;
    }

    @m80.k
    public final String p() {
        return this.f65463b;
    }

    @m80.k
    public final a0 q() {
        return this.f65465d;
    }

    public final int r() {
        return this.f65469h;
    }

    @m80.k
    public String toString() {
        return "UserAddressModel(id=" + this.f65462a + ", name=" + this.f65463b + ", mobile=" + this.f65464c + ", province=" + this.f65465d + ", city=" + this.f65466e + ", district=" + this.f65467f + ", detail=" + this.f65468g + ", status=" + this.f65469h + ')';
    }
}
