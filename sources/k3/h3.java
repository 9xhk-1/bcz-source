package k3;

import com.baicizhan.app.api.service.Gender;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65339a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65340b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Gender f65341c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65342d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f65343e;

    public h3(@m80.k String name, @m80.k String avatarUrl, @m80.k Gender gender, @m80.k String openId, @m80.k String unionId) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(gender, "gender");
        kotlin.jvm.internal.g0.p(openId, "openId");
        kotlin.jvm.internal.g0.p(unionId, "unionId");
        this.f65339a = name;
        this.f65340b = avatarUrl;
        this.f65341c = gender;
        this.f65342d = openId;
        this.f65343e = unionId;
    }

    public static /* synthetic */ h3 g(h3 h3Var, String str, String str2, Gender gender, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = h3Var.f65339a;
        }
        if ((i11 & 2) != 0) {
            str2 = h3Var.f65340b;
        }
        if ((i11 & 4) != 0) {
            gender = h3Var.f65341c;
        }
        if ((i11 & 8) != 0) {
            str3 = h3Var.f65342d;
        }
        if ((i11 & 16) != 0) {
            str4 = h3Var.f65343e;
        }
        String str5 = str4;
        Gender gender2 = gender;
        return h3Var.f(str, str2, gender2, str3, str5);
    }

    @m80.k
    public final String a() {
        return this.f65339a;
    }

    @m80.k
    public final String b() {
        return this.f65340b;
    }

    @m80.k
    public final Gender c() {
        return this.f65341c;
    }

    @m80.k
    public final String d() {
        return this.f65342d;
    }

    @m80.k
    public final String e() {
        return this.f65343e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return kotlin.jvm.internal.g0.g(this.f65339a, h3Var.f65339a) && kotlin.jvm.internal.g0.g(this.f65340b, h3Var.f65340b) && this.f65341c == h3Var.f65341c && kotlin.jvm.internal.g0.g(this.f65342d, h3Var.f65342d) && kotlin.jvm.internal.g0.g(this.f65343e, h3Var.f65343e);
    }

    @m80.k
    public final h3 f(@m80.k String name, @m80.k String avatarUrl, @m80.k Gender gender, @m80.k String openId, @m80.k String unionId) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(gender, "gender");
        kotlin.jvm.internal.g0.p(openId, "openId");
        kotlin.jvm.internal.g0.p(unionId, "unionId");
        return new h3(name, avatarUrl, gender, openId, unionId);
    }

    @m80.k
    public final String h() {
        return this.f65340b;
    }

    public int hashCode() {
        return (((((((this.f65339a.hashCode() * 31) + this.f65340b.hashCode()) * 31) + this.f65341c.hashCode()) * 31) + this.f65342d.hashCode()) * 31) + this.f65343e.hashCode();
    }

    @m80.k
    public final Gender i() {
        return this.f65341c;
    }

    @m80.k
    public final String j() {
        return this.f65339a;
    }

    @m80.k
    public final String k() {
        return this.f65342d;
    }

    @m80.k
    public final String l() {
        return this.f65343e;
    }

    @m80.k
    public String toString() {
        return "TencentLoginReq(name=" + this.f65339a + ", avatarUrl=" + this.f65340b + ", gender=" + this.f65341c + ", openId=" + this.f65342d + ", unionId=" + this.f65343e + ')';
    }
}
