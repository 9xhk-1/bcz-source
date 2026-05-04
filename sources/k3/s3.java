package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65604a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65605b;

    public s3(@m80.k String nickname, @m80.k String avatar) {
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        this.f65604a = nickname;
        this.f65605b = avatar;
    }

    public static /* synthetic */ s3 d(s3 s3Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = s3Var.f65604a;
        }
        if ((i11 & 2) != 0) {
            str2 = s3Var.f65605b;
        }
        return s3Var.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f65604a;
    }

    @m80.k
    public final String b() {
        return this.f65605b;
    }

    @m80.k
    public final s3 c(@m80.k String nickname, @m80.k String avatar) {
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        return new s3(nickname, avatar);
    }

    @m80.k
    public final String e() {
        return this.f65605b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return kotlin.jvm.internal.g0.g(this.f65604a, s3Var.f65604a) && kotlin.jvm.internal.g0.g(this.f65605b, s3Var.f65605b);
    }

    @m80.k
    public final String f() {
        return this.f65604a;
    }

    public int hashCode() {
        return (this.f65604a.hashCode() * 31) + this.f65605b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserBriefModel(nickname=" + this.f65604a + ", avatar=" + this.f65605b + ')';
    }
}
