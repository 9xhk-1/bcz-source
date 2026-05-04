package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public String f65398a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public String f65399b;

    /* renamed from: c, reason: collision with root package name */
    public int f65400c;

    public k1(@m80.k String displaceName, @m80.k String cityName, int i11) {
        kotlin.jvm.internal.g0.p(displaceName, "displaceName");
        kotlin.jvm.internal.g0.p(cityName, "cityName");
        this.f65398a = displaceName;
        this.f65399b = cityName;
        this.f65400c = i11;
    }

    public static /* synthetic */ k1 e(k1 k1Var, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = k1Var.f65398a;
        }
        if ((i12 & 2) != 0) {
            str2 = k1Var.f65399b;
        }
        if ((i12 & 4) != 0) {
            i11 = k1Var.f65400c;
        }
        return k1Var.d(str, str2, i11);
    }

    @m80.k
    public final String a() {
        return this.f65398a;
    }

    @m80.k
    public final String b() {
        return this.f65399b;
    }

    public final int c() {
        return this.f65400c;
    }

    @m80.k
    public final k1 d(@m80.k String displaceName, @m80.k String cityName, int i11) {
        kotlin.jvm.internal.g0.p(displaceName, "displaceName");
        kotlin.jvm.internal.g0.p(cityName, "cityName");
        return new k1(displaceName, cityName, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return kotlin.jvm.internal.g0.g(this.f65398a, k1Var.f65398a) && kotlin.jvm.internal.g0.g(this.f65399b, k1Var.f65399b) && this.f65400c == k1Var.f65400c;
    }

    public final int f() {
        return this.f65400c;
    }

    @m80.k
    public final String g() {
        return this.f65399b;
    }

    @m80.k
    public final String h() {
        return this.f65398a;
    }

    public int hashCode() {
        return (((this.f65398a.hashCode() * 31) + this.f65399b.hashCode()) * 31) + Integer.hashCode(this.f65400c);
    }

    public final void i(int i11) {
        this.f65400c = i11;
    }

    public final void j(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f65399b = str;
    }

    public final void k(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f65398a = str;
    }

    @m80.k
    public String toString() {
        return "LocationInfo(displaceName=" + this.f65398a + ", cityName=" + this.f65399b + ", cityCode=" + this.f65400c + ')';
    }
}
