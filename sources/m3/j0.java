package m3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f71953a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f71954b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f71955c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f71956d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f71957e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f71958f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f71959g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final a f71960h;

    public j0(int i11, @m80.k String title, @m80.k String content, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l a aVar) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(content, "content");
        this.f71953a = i11;
        this.f71954b = title;
        this.f71955c = content;
        this.f71956d = str;
        this.f71957e = str2;
        this.f71958f = str3;
        this.f71959g = str4;
        this.f71960h = aVar;
    }

    public static /* synthetic */ j0 j(j0 j0Var, int i11, String str, String str2, String str3, String str4, String str5, String str6, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = j0Var.f71953a;
        }
        if ((i12 & 2) != 0) {
            str = j0Var.f71954b;
        }
        if ((i12 & 4) != 0) {
            str2 = j0Var.f71955c;
        }
        if ((i12 & 8) != 0) {
            str3 = j0Var.f71956d;
        }
        if ((i12 & 16) != 0) {
            str4 = j0Var.f71957e;
        }
        if ((i12 & 32) != 0) {
            str5 = j0Var.f71958f;
        }
        if ((i12 & 64) != 0) {
            str6 = j0Var.f71959g;
        }
        if ((i12 & 128) != 0) {
            aVar = j0Var.f71960h;
        }
        String str7 = str6;
        a aVar2 = aVar;
        String str8 = str4;
        String str9 = str5;
        return j0Var.i(i11, str, str2, str3, str8, str9, str7, aVar2);
    }

    public final int a() {
        return this.f71953a;
    }

    @m80.k
    public final String b() {
        return this.f71954b;
    }

    @m80.k
    public final String c() {
        return this.f71955c;
    }

    @m80.l
    public final String d() {
        return this.f71956d;
    }

    @m80.l
    public final String e() {
        return this.f71957e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f71953a == j0Var.f71953a && kotlin.jvm.internal.g0.g(this.f71954b, j0Var.f71954b) && kotlin.jvm.internal.g0.g(this.f71955c, j0Var.f71955c) && kotlin.jvm.internal.g0.g(this.f71956d, j0Var.f71956d) && kotlin.jvm.internal.g0.g(this.f71957e, j0Var.f71957e) && kotlin.jvm.internal.g0.g(this.f71958f, j0Var.f71958f) && kotlin.jvm.internal.g0.g(this.f71959g, j0Var.f71959g) && kotlin.jvm.internal.g0.g(this.f71960h, j0Var.f71960h);
    }

    @m80.l
    public final String f() {
        return this.f71958f;
    }

    @m80.l
    public final String g() {
        return this.f71959g;
    }

    @m80.l
    public final a h() {
        return this.f71960h;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f71953a) * 31) + this.f71954b.hashCode()) * 31) + this.f71955c.hashCode()) * 31;
        String str = this.f71956d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71957e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71958f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71959g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a aVar = this.f71960h;
        return hashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    @m80.k
    public final j0 i(int i11, @m80.k String title, @m80.k String content, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l a aVar) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(content, "content");
        return new j0(i11, title, content, str, str2, str3, str4, aVar);
    }

    @m80.l
    public final a k() {
        return this.f71960h;
    }

    @m80.l
    public final String l() {
        return this.f71959g;
    }

    @m80.l
    public final String m() {
        return this.f71958f;
    }

    @m80.k
    public final String n() {
        return this.f71955c;
    }

    @m80.l
    public final String o() {
        return this.f71957e;
    }

    public final int p() {
        return this.f71953a;
    }

    @m80.k
    public final String q() {
        return this.f71954b;
    }

    @m80.l
    public final String r() {
        return this.f71956d;
    }

    @m80.k
    public String toString() {
        return "NotifyVo(time=" + this.f71953a + ", title=" + this.f71954b + ", content=" + this.f71955c + ", url=" + this.f71956d + ", imgUrl=" + this.f71957e + ", bannerImgUrl=" + this.f71958f + ", aid=" + this.f71959g + ", adResp=" + this.f71960h + ')';
    }
}
