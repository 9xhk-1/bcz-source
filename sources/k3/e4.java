package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65288b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f65289c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65290d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final h0 f65291e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65292f;

    public e4(@m80.k String id2, boolean z11, @m80.l String str, @m80.k String imageGradientColor, @m80.k h0 type, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(imageGradientColor, "imageGradientColor");
        kotlin.jvm.internal.g0.p(type, "type");
        this.f65287a = id2;
        this.f65288b = z11;
        this.f65289c = str;
        this.f65290d = imageGradientColor;
        this.f65291e = type;
        this.f65292f = str2;
    }

    public static /* synthetic */ e4 h(e4 e4Var, String str, boolean z11, String str2, String str3, h0 h0Var, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = e4Var.f65287a;
        }
        if ((i11 & 2) != 0) {
            z11 = e4Var.f65288b;
        }
        if ((i11 & 4) != 0) {
            str2 = e4Var.f65289c;
        }
        if ((i11 & 8) != 0) {
            str3 = e4Var.f65290d;
        }
        if ((i11 & 16) != 0) {
            h0Var = e4Var.f65291e;
        }
        if ((i11 & 32) != 0) {
            str4 = e4Var.f65292f;
        }
        h0 h0Var2 = h0Var;
        String str5 = str4;
        return e4Var.g(str, z11, str2, str3, h0Var2, str5);
    }

    @m80.k
    public final String a() {
        return this.f65287a;
    }

    public final boolean b() {
        return this.f65288b;
    }

    @m80.l
    public final String c() {
        return this.f65289c;
    }

    @m80.k
    public final String d() {
        return this.f65290d;
    }

    @m80.k
    public final h0 e() {
        return this.f65291e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return kotlin.jvm.internal.g0.g(this.f65287a, e4Var.f65287a) && this.f65288b == e4Var.f65288b && kotlin.jvm.internal.g0.g(this.f65289c, e4Var.f65289c) && kotlin.jvm.internal.g0.g(this.f65290d, e4Var.f65290d) && kotlin.jvm.internal.g0.g(this.f65291e, e4Var.f65291e) && kotlin.jvm.internal.g0.g(this.f65292f, e4Var.f65292f);
    }

    @m80.l
    public final String f() {
        return this.f65292f;
    }

    @m80.k
    public final e4 g(@m80.k String id2, boolean z11, @m80.l String str, @m80.k String imageGradientColor, @m80.k h0 type, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(imageGradientColor, "imageGradientColor");
        kotlin.jvm.internal.g0.p(type, "type");
        return new e4(id2, z11, str, imageGradientColor, type, str2);
    }

    public int hashCode() {
        int hashCode = ((this.f65287a.hashCode() * 31) + Boolean.hashCode(this.f65288b)) * 31;
        String str = this.f65289c;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f65290d.hashCode()) * 31) + this.f65291e.hashCode()) * 31;
        String str2 = this.f65292f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public final String i() {
        return this.f65287a;
    }

    @m80.k
    public final String j() {
        return this.f65290d;
    }

    @m80.l
    public final String k() {
        return this.f65289c;
    }

    @m80.l
    public final String l() {
        return this.f65292f;
    }

    @m80.k
    public final h0 m() {
        return this.f65291e;
    }

    public final boolean n() {
        return this.f65288b;
    }

    @m80.k
    public String toString() {
        return "WordBanner(id=" + this.f65287a + ", isDark=" + this.f65288b + ", imagePath=" + this.f65289c + ", imageGradientColor=" + this.f65290d + ", type=" + this.f65291e + ", link=" + this.f65292f + ')';
    }

    public /* synthetic */ e4(String str, boolean z11, String str2, String str3, h0 h0Var, String str4, int i11, kotlin.jvm.internal.v vVar) {
        this(str, z11, (i11 & 4) != 0 ? null : str2, str3, h0Var, str4);
    }
}
