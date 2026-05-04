package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65606a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65607b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65608c;

    public t(@m80.k String aId, @m80.k String link, @m80.k String imageUrl) {
        kotlin.jvm.internal.g0.p(aId, "aId");
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(imageUrl, "imageUrl");
        this.f65606a = aId;
        this.f65607b = link;
        this.f65608c = imageUrl;
    }

    public static /* synthetic */ t e(t tVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tVar.f65606a;
        }
        if ((i11 & 2) != 0) {
            str2 = tVar.f65607b;
        }
        if ((i11 & 4) != 0) {
            str3 = tVar.f65608c;
        }
        return tVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f65606a;
    }

    @m80.k
    public final String b() {
        return this.f65607b;
    }

    @m80.k
    public final String c() {
        return this.f65608c;
    }

    @m80.k
    public final t d(@m80.k String aId, @m80.k String link, @m80.k String imageUrl) {
        kotlin.jvm.internal.g0.p(aId, "aId");
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(imageUrl, "imageUrl");
        return new t(aId, link, imageUrl);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.g0.g(this.f65606a, tVar.f65606a) && kotlin.jvm.internal.g0.g(this.f65607b, tVar.f65607b) && kotlin.jvm.internal.g0.g(this.f65608c, tVar.f65608c);
    }

    @m80.k
    public final String f() {
        return this.f65606a;
    }

    @m80.k
    public final String g() {
        return this.f65608c;
    }

    @m80.k
    public final String h() {
        return this.f65607b;
    }

    public int hashCode() {
        return (((this.f65606a.hashCode() * 31) + this.f65607b.hashCode()) * 31) + this.f65608c.hashCode();
    }

    @m80.k
    public String toString() {
        return "BottomAdItem(aId=" + this.f65606a + ", link=" + this.f65607b + ", imageUrl=" + this.f65608c + ')';
    }
}
