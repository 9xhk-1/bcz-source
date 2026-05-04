package m3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71900a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f71901b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f71902c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f71903d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final a f71904e;

    public f0(@m80.k String id2, @m80.k String imgUrl, @m80.k String link, @m80.l String str, @m80.l a aVar) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
        kotlin.jvm.internal.g0.p(link, "link");
        this.f71900a = id2;
        this.f71901b = imgUrl;
        this.f71902c = link;
        this.f71903d = str;
        this.f71904e = aVar;
    }

    public static /* synthetic */ f0 g(f0 f0Var, String str, String str2, String str3, String str4, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f0Var.f71900a;
        }
        if ((i11 & 2) != 0) {
            str2 = f0Var.f71901b;
        }
        if ((i11 & 4) != 0) {
            str3 = f0Var.f71902c;
        }
        if ((i11 & 8) != 0) {
            str4 = f0Var.f71903d;
        }
        if ((i11 & 16) != 0) {
            aVar = f0Var.f71904e;
        }
        a aVar2 = aVar;
        String str5 = str3;
        return f0Var.f(str, str2, str5, str4, aVar2);
    }

    @m80.k
    public final String a() {
        return this.f71900a;
    }

    @m80.k
    public final String b() {
        return this.f71901b;
    }

    @m80.k
    public final String c() {
        return this.f71902c;
    }

    @m80.l
    public final String d() {
        return this.f71903d;
    }

    @m80.l
    public final a e() {
        return this.f71904e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.g0.g(this.f71900a, f0Var.f71900a) && kotlin.jvm.internal.g0.g(this.f71901b, f0Var.f71901b) && kotlin.jvm.internal.g0.g(this.f71902c, f0Var.f71902c) && kotlin.jvm.internal.g0.g(this.f71903d, f0Var.f71903d) && kotlin.jvm.internal.g0.g(this.f71904e, f0Var.f71904e);
    }

    @m80.k
    public final f0 f(@m80.k String id2, @m80.k String imgUrl, @m80.k String link, @m80.l String str, @m80.l a aVar) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
        kotlin.jvm.internal.g0.p(link, "link");
        return new f0(id2, imgUrl, link, str, aVar);
    }

    @m80.l
    public final a h() {
        return this.f71904e;
    }

    public int hashCode() {
        int hashCode = ((((this.f71900a.hashCode() * 31) + this.f71901b.hashCode()) * 31) + this.f71902c.hashCode()) * 31;
        String str = this.f71903d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f71904e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f71903d;
    }

    @m80.k
    public final String j() {
        return this.f71900a;
    }

    @m80.k
    public final String k() {
        return this.f71901b;
    }

    @m80.k
    public final String l() {
        return this.f71902c;
    }

    @m80.k
    public String toString() {
        return "MainViewBottomAdvVo(id=" + this.f71900a + ", imgUrl=" + this.f71901b + ", link=" + this.f71902c + ", aid=" + this.f71903d + ", adResp=" + this.f71904e + ')';
    }
}
