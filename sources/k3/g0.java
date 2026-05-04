package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65314a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65315b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65316c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f65317d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65318e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65319f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f65320g;

    public g0(int i11, int i12, @m80.k String message, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        kotlin.jvm.internal.g0.p(message, "message");
        this.f65314a = i11;
        this.f65315b = i12;
        this.f65316c = message;
        this.f65317d = str;
        this.f65318e = str2;
        this.f65319f = str3;
        this.f65320g = str4;
    }

    public static /* synthetic */ g0 i(g0 g0Var, int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = g0Var.f65314a;
        }
        if ((i13 & 2) != 0) {
            i12 = g0Var.f65315b;
        }
        if ((i13 & 4) != 0) {
            str = g0Var.f65316c;
        }
        if ((i13 & 8) != 0) {
            str2 = g0Var.f65317d;
        }
        if ((i13 & 16) != 0) {
            str3 = g0Var.f65318e;
        }
        if ((i13 & 32) != 0) {
            str4 = g0Var.f65319f;
        }
        if ((i13 & 64) != 0) {
            str5 = g0Var.f65320g;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return g0Var.h(i11, i12, str9, str2, str8, str6, str7);
    }

    public final int a() {
        return this.f65314a;
    }

    public final int b() {
        return this.f65315b;
    }

    @m80.k
    public final String c() {
        return this.f65316c;
    }

    @m80.l
    public final String d() {
        return this.f65317d;
    }

    @m80.l
    public final String e() {
        return this.f65318e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f65314a == g0Var.f65314a && this.f65315b == g0Var.f65315b && kotlin.jvm.internal.g0.g(this.f65316c, g0Var.f65316c) && kotlin.jvm.internal.g0.g(this.f65317d, g0Var.f65317d) && kotlin.jvm.internal.g0.g(this.f65318e, g0Var.f65318e) && kotlin.jvm.internal.g0.g(this.f65319f, g0Var.f65319f) && kotlin.jvm.internal.g0.g(this.f65320g, g0Var.f65320g);
    }

    @m80.l
    public final String f() {
        return this.f65319f;
    }

    @m80.l
    public final String g() {
        return this.f65320g;
    }

    @m80.k
    public final g0 h(int i11, int i12, @m80.k String message, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        kotlin.jvm.internal.g0.p(message, "message");
        return new g0(i11, i12, message, str, str2, str3, str4);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f65314a) * 31) + Integer.hashCode(this.f65315b)) * 31) + this.f65316c.hashCode()) * 31;
        String str = this.f65317d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65318e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65319f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65320g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @m80.l
    public final String j() {
        return this.f65319f;
    }

    @m80.l
    public final String k() {
        return this.f65320g;
    }

    public final int l() {
        return this.f65314a;
    }

    @m80.l
    public final String m() {
        return this.f65318e;
    }

    @m80.k
    public final String n() {
        return this.f65316c;
    }

    @m80.l
    public final String o() {
        return this.f65317d;
    }

    public final int p() {
        return this.f65315b;
    }

    @m80.k
    public String toString() {
        return "DakaShareBonusResult(coin_count=" + this.f65314a + ", status=" + this.f65315b + ", message=" + this.f65316c + ", shareSuccess=" + this.f65317d + ", extraTip=" + this.f65318e + ", action=" + this.f65319f + ", actionUrl=" + this.f65320g + ')';
    }
}
