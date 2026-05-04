package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f69697a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69698b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69699c;

    public t(@m80.k String avatarUrl, @m80.k String name, long j11) {
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(name, "name");
        this.f69697a = avatarUrl;
        this.f69698b = name;
        this.f69699c = j11;
    }

    public static /* synthetic */ t e(t tVar, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tVar.f69697a;
        }
        if ((i11 & 2) != 0) {
            str2 = tVar.f69698b;
        }
        if ((i11 & 4) != 0) {
            j11 = tVar.f69699c;
        }
        return tVar.d(str, str2, j11);
    }

    @m80.k
    public final String a() {
        return this.f69697a;
    }

    @m80.k
    public final String b() {
        return this.f69698b;
    }

    public final long c() {
        return this.f69699c;
    }

    @m80.k
    public final t d(@m80.k String avatarUrl, @m80.k String name, long j11) {
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(name, "name");
        return new t(avatarUrl, name, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.g0.g(this.f69697a, tVar.f69697a) && kotlin.jvm.internal.g0.g(this.f69698b, tVar.f69698b) && this.f69699c == tVar.f69699c;
    }

    @m80.k
    public final String f() {
        return this.f69697a;
    }

    @m80.k
    public final String g() {
        return this.f69698b;
    }

    public final long h() {
        return this.f69699c;
    }

    public int hashCode() {
        return (((this.f69697a.hashCode() * 31) + this.f69698b.hashCode()) * 31) + Long.hashCode(this.f69699c);
    }

    @m80.k
    public String toString() {
        return "RankMember(avatarUrl=" + this.f69697a + ", name=" + this.f69698b + ", studyScore=" + this.f69699c + ')';
    }
}
