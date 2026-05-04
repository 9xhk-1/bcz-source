package k3;

import com.baicizhan.app.api.service.Gender;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65682a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65683b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65684c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Gender f65685d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final k2 f65686e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65687f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f65688g;

    public w3(@m80.k String name, @m80.k String uid, @m80.k String avatar, @m80.k Gender gender, @m80.l k2 k2Var, boolean z11, @m80.k String token) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(uid, "uid");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        kotlin.jvm.internal.g0.p(gender, "gender");
        kotlin.jvm.internal.g0.p(token, "token");
        this.f65682a = name;
        this.f65683b = uid;
        this.f65684c = avatar;
        this.f65685d = gender;
        this.f65686e = k2Var;
        this.f65687f = z11;
        this.f65688g = token;
    }

    public static /* synthetic */ w3 i(w3 w3Var, String str, String str2, String str3, Gender gender, k2 k2Var, boolean z11, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = w3Var.f65682a;
        }
        if ((i11 & 2) != 0) {
            str2 = w3Var.f65683b;
        }
        if ((i11 & 4) != 0) {
            str3 = w3Var.f65684c;
        }
        if ((i11 & 8) != 0) {
            gender = w3Var.f65685d;
        }
        if ((i11 & 16) != 0) {
            k2Var = w3Var.f65686e;
        }
        if ((i11 & 32) != 0) {
            z11 = w3Var.f65687f;
        }
        if ((i11 & 64) != 0) {
            str4 = w3Var.f65688g;
        }
        boolean z12 = z11;
        String str5 = str4;
        k2 k2Var2 = k2Var;
        String str6 = str3;
        return w3Var.h(str, str2, str6, gender, k2Var2, z12, str5);
    }

    @m80.k
    public final String a() {
        return this.f65682a;
    }

    @m80.k
    public final String b() {
        return this.f65683b;
    }

    @m80.k
    public final String c() {
        return this.f65684c;
    }

    @m80.k
    public final Gender d() {
        return this.f65685d;
    }

    @m80.l
    public final k2 e() {
        return this.f65686e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return kotlin.jvm.internal.g0.g(this.f65682a, w3Var.f65682a) && kotlin.jvm.internal.g0.g(this.f65683b, w3Var.f65683b) && kotlin.jvm.internal.g0.g(this.f65684c, w3Var.f65684c) && this.f65685d == w3Var.f65685d && kotlin.jvm.internal.g0.g(this.f65686e, w3Var.f65686e) && this.f65687f == w3Var.f65687f && kotlin.jvm.internal.g0.g(this.f65688g, w3Var.f65688g);
    }

    public final boolean f() {
        return this.f65687f;
    }

    @m80.k
    public final String g() {
        return this.f65688g;
    }

    @m80.k
    public final w3 h(@m80.k String name, @m80.k String uid, @m80.k String avatar, @m80.k Gender gender, @m80.l k2 k2Var, boolean z11, @m80.k String token) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(uid, "uid");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        kotlin.jvm.internal.g0.p(gender, "gender");
        kotlin.jvm.internal.g0.p(token, "token");
        return new w3(name, uid, avatar, gender, k2Var, z11, token);
    }

    public int hashCode() {
        int hashCode = ((((((this.f65682a.hashCode() * 31) + this.f65683b.hashCode()) * 31) + this.f65684c.hashCode()) * 31) + this.f65685d.hashCode()) * 31;
        k2 k2Var = this.f65686e;
        return ((((hashCode + (k2Var == null ? 0 : k2Var.hashCode())) * 31) + Boolean.hashCode(this.f65687f)) * 31) + this.f65688g.hashCode();
    }

    @m80.k
    public final String j() {
        return this.f65684c;
    }

    @m80.k
    public final Gender k() {
        return this.f65685d;
    }

    @m80.k
    public final String l() {
        return this.f65682a;
    }

    @m80.l
    public final k2 m() {
        return this.f65686e;
    }

    @m80.k
    public final String n() {
        return this.f65688g;
    }

    @m80.k
    public final String o() {
        return this.f65683b;
    }

    public final boolean p() {
        return this.f65687f;
    }

    @m80.k
    public String toString() {
        return "UserModel(name=" + this.f65682a + ", uid=" + this.f65683b + ", avatar=" + this.f65684c + ", gender=" + this.f65685d + ", roleInfo=" + this.f65686e + ", isNewUser=" + this.f65687f + ", token=" + this.f65688g + ')';
    }
}
