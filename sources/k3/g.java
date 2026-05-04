package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f65305a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65306b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65307c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65309e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65310f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f65311g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65312h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final Boolean f65313i;

    public g(int i11, @m80.k String name, @m80.k String mobile, int i12, int i13, int i14, @m80.k String detail, int i15, @m80.l Boolean bool) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(mobile, "mobile");
        kotlin.jvm.internal.g0.p(detail, "detail");
        this.f65305a = i11;
        this.f65306b = name;
        this.f65307c = mobile;
        this.f65308d = i12;
        this.f65309e = i13;
        this.f65310f = i14;
        this.f65311g = detail;
        this.f65312h = i15;
        this.f65313i = bool;
    }

    public static /* synthetic */ g k(g gVar, int i11, String str, String str2, int i12, int i13, int i14, String str3, int i15, Boolean bool, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = gVar.f65305a;
        }
        if ((i16 & 2) != 0) {
            str = gVar.f65306b;
        }
        if ((i16 & 4) != 0) {
            str2 = gVar.f65307c;
        }
        if ((i16 & 8) != 0) {
            i12 = gVar.f65308d;
        }
        if ((i16 & 16) != 0) {
            i13 = gVar.f65309e;
        }
        if ((i16 & 32) != 0) {
            i14 = gVar.f65310f;
        }
        if ((i16 & 64) != 0) {
            str3 = gVar.f65311g;
        }
        if ((i16 & 128) != 0) {
            i15 = gVar.f65312h;
        }
        if ((i16 & 256) != 0) {
            bool = gVar.f65313i;
        }
        int i17 = i15;
        Boolean bool2 = bool;
        int i18 = i14;
        String str4 = str3;
        int i19 = i13;
        String str5 = str2;
        return gVar.j(i11, str, str5, i12, i19, i18, str4, i17, bool2);
    }

    public final int a() {
        return this.f65305a;
    }

    @m80.k
    public final String b() {
        return this.f65306b;
    }

    @m80.k
    public final String c() {
        return this.f65307c;
    }

    public final int d() {
        return this.f65308d;
    }

    public final int e() {
        return this.f65309e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f65305a == gVar.f65305a && kotlin.jvm.internal.g0.g(this.f65306b, gVar.f65306b) && kotlin.jvm.internal.g0.g(this.f65307c, gVar.f65307c) && this.f65308d == gVar.f65308d && this.f65309e == gVar.f65309e && this.f65310f == gVar.f65310f && kotlin.jvm.internal.g0.g(this.f65311g, gVar.f65311g) && this.f65312h == gVar.f65312h && kotlin.jvm.internal.g0.g(this.f65313i, gVar.f65313i);
    }

    public final int f() {
        return this.f65310f;
    }

    @m80.k
    public final String g() {
        return this.f65311g;
    }

    public final int h() {
        return this.f65312h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f65305a) * 31) + this.f65306b.hashCode()) * 31) + this.f65307c.hashCode()) * 31) + Integer.hashCode(this.f65308d)) * 31) + Integer.hashCode(this.f65309e)) * 31) + Integer.hashCode(this.f65310f)) * 31) + this.f65311g.hashCode()) * 31) + Integer.hashCode(this.f65312h)) * 31;
        Boolean bool = this.f65313i;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @m80.l
    public final Boolean i() {
        return this.f65313i;
    }

    @m80.k
    public final g j(int i11, @m80.k String name, @m80.k String mobile, int i12, int i13, int i14, @m80.k String detail, int i15, @m80.l Boolean bool) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(mobile, "mobile");
        kotlin.jvm.internal.g0.p(detail, "detail");
        return new g(i11, name, mobile, i12, i13, i14, detail, i15, bool);
    }

    @m80.l
    public final Boolean l() {
        return this.f65313i;
    }

    public final int m() {
        return this.f65309e;
    }

    @m80.k
    public final String n() {
        return this.f65311g;
    }

    public final int o() {
        return this.f65310f;
    }

    public final int p() {
        return this.f65305a;
    }

    @m80.k
    public final String q() {
        return this.f65307c;
    }

    @m80.k
    public final String r() {
        return this.f65306b;
    }

    public final int s() {
        return this.f65308d;
    }

    public final int t() {
        return this.f65312h;
    }

    @m80.k
    public String toString() {
        return "AddressReq(id=" + this.f65305a + ", name=" + this.f65306b + ", mobile=" + this.f65307c + ", provinceId=" + this.f65308d + ", cityId=" + this.f65309e + ", districtId=" + this.f65310f + ", detail=" + this.f65311g + ", status=" + this.f65312h + ", choice=" + this.f65313i + ')';
    }

    public /* synthetic */ g(int i11, String str, String str2, int i12, int i13, int i14, String str3, int i15, Boolean bool, int i16, kotlin.jvm.internal.v vVar) {
        this(i11, str, str2, i12, i13, i14, str3, i15, (i16 & 256) != 0 ? Boolean.TRUE : bool);
    }
}
