package k3;

import com.baicizhan.app.api.service.Gender;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65432a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65433b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65434c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65435d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f65436e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Gender f65437f;

    public m(@m80.k String provider, @m80.k String name, @m80.k String avatarUrl, @m80.k String openId, @m80.k String unionId, @m80.k Gender gender) {
        kotlin.jvm.internal.g0.p(provider, "provider");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(openId, "openId");
        kotlin.jvm.internal.g0.p(unionId, "unionId");
        kotlin.jvm.internal.g0.p(gender, "gender");
        this.f65432a = provider;
        this.f65433b = name;
        this.f65434c = avatarUrl;
        this.f65435d = openId;
        this.f65436e = unionId;
        this.f65437f = gender;
    }

    public static /* synthetic */ m h(m mVar, String str, String str2, String str3, String str4, String str5, Gender gender, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mVar.f65432a;
        }
        if ((i11 & 2) != 0) {
            str2 = mVar.f65433b;
        }
        if ((i11 & 4) != 0) {
            str3 = mVar.f65434c;
        }
        if ((i11 & 8) != 0) {
            str4 = mVar.f65435d;
        }
        if ((i11 & 16) != 0) {
            str5 = mVar.f65436e;
        }
        if ((i11 & 32) != 0) {
            gender = mVar.f65437f;
        }
        String str6 = str5;
        Gender gender2 = gender;
        return mVar.g(str, str2, str3, str4, str6, gender2);
    }

    @m80.k
    public final String a() {
        return this.f65432a;
    }

    @m80.k
    public final String b() {
        return this.f65433b;
    }

    @m80.k
    public final String c() {
        return this.f65434c;
    }

    @m80.k
    public final String d() {
        return this.f65435d;
    }

    @m80.k
    public final String e() {
        return this.f65436e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.g0.g(this.f65432a, mVar.f65432a) && kotlin.jvm.internal.g0.g(this.f65433b, mVar.f65433b) && kotlin.jvm.internal.g0.g(this.f65434c, mVar.f65434c) && kotlin.jvm.internal.g0.g(this.f65435d, mVar.f65435d) && kotlin.jvm.internal.g0.g(this.f65436e, mVar.f65436e) && this.f65437f == mVar.f65437f;
    }

    @m80.k
    public final Gender f() {
        return this.f65437f;
    }

    @m80.k
    public final m g(@m80.k String provider, @m80.k String name, @m80.k String avatarUrl, @m80.k String openId, @m80.k String unionId, @m80.k Gender gender) {
        kotlin.jvm.internal.g0.p(provider, "provider");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(openId, "openId");
        kotlin.jvm.internal.g0.p(unionId, "unionId");
        kotlin.jvm.internal.g0.p(gender, "gender");
        return new m(provider, name, avatarUrl, openId, unionId, gender);
    }

    public int hashCode() {
        return (((((((((this.f65432a.hashCode() * 31) + this.f65433b.hashCode()) * 31) + this.f65434c.hashCode()) * 31) + this.f65435d.hashCode()) * 31) + this.f65436e.hashCode()) * 31) + this.f65437f.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f65434c;
    }

    @m80.k
    public final Gender j() {
        return this.f65437f;
    }

    @m80.k
    public final String k() {
        return this.f65433b;
    }

    @m80.k
    public final String l() {
        return this.f65435d;
    }

    @m80.k
    public final String m() {
        return this.f65432a;
    }

    @m80.k
    public final String n() {
        return this.f65436e;
    }

    @m80.k
    public String toString() {
        return "BindReq(provider=" + this.f65432a + ", name=" + this.f65433b + ", avatarUrl=" + this.f65434c + ", openId=" + this.f65435d + ", unionId=" + this.f65436e + ", gender=" + this.f65437f + ')';
    }
}
