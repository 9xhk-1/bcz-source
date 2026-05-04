package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65261a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65262b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65263c;

    public d(@m80.k String text, @m80.k String url, @m80.k String reportId) {
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(reportId, "reportId");
        this.f65261a = text;
        this.f65262b = url;
        this.f65263c = reportId;
    }

    public static /* synthetic */ d e(d dVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f65261a;
        }
        if ((i11 & 2) != 0) {
            str2 = dVar.f65262b;
        }
        if ((i11 & 4) != 0) {
            str3 = dVar.f65263c;
        }
        return dVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f65261a;
    }

    @m80.k
    public final String b() {
        return this.f65262b;
    }

    @m80.k
    public final String c() {
        return this.f65263c;
    }

    @m80.k
    public final d d(@m80.k String text, @m80.k String url, @m80.k String reportId) {
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(reportId, "reportId");
        return new d(text, url, reportId);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.g0.g(this.f65261a, dVar.f65261a) && kotlin.jvm.internal.g0.g(this.f65262b, dVar.f65262b) && kotlin.jvm.internal.g0.g(this.f65263c, dVar.f65263c);
    }

    @m80.k
    public final String f() {
        return this.f65263c;
    }

    @m80.k
    public final String g() {
        return this.f65261a;
    }

    @m80.k
    public final String h() {
        return this.f65262b;
    }

    public int hashCode() {
        return (((this.f65261a.hashCode() * 31) + this.f65262b.hashCode()) * 31) + this.f65263c.hashCode();
    }

    @m80.k
    public String toString() {
        return "AdModel(text=" + this.f65261a + ", url=" + this.f65262b + ", reportId=" + this.f65263c + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, int i11, kotlin.jvm.internal.v vVar) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3);
    }
}
