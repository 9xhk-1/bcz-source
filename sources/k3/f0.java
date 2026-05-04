package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final u3 f65296a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d0 f65297b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final s3 f65298c;

    public f0(@m80.k u3 userDakaShareModel, @m80.k d0 dakaBackgroundModel, @m80.k s3 userBriefModel) {
        kotlin.jvm.internal.g0.p(userDakaShareModel, "userDakaShareModel");
        kotlin.jvm.internal.g0.p(dakaBackgroundModel, "dakaBackgroundModel");
        kotlin.jvm.internal.g0.p(userBriefModel, "userBriefModel");
        this.f65296a = userDakaShareModel;
        this.f65297b = dakaBackgroundModel;
        this.f65298c = userBriefModel;
    }

    public static /* synthetic */ f0 e(f0 f0Var, u3 u3Var, d0 d0Var, s3 s3Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            u3Var = f0Var.f65296a;
        }
        if ((i11 & 2) != 0) {
            d0Var = f0Var.f65297b;
        }
        if ((i11 & 4) != 0) {
            s3Var = f0Var.f65298c;
        }
        return f0Var.d(u3Var, d0Var, s3Var);
    }

    @m80.k
    public final u3 a() {
        return this.f65296a;
    }

    @m80.k
    public final d0 b() {
        return this.f65297b;
    }

    @m80.k
    public final s3 c() {
        return this.f65298c;
    }

    @m80.k
    public final f0 d(@m80.k u3 userDakaShareModel, @m80.k d0 dakaBackgroundModel, @m80.k s3 userBriefModel) {
        kotlin.jvm.internal.g0.p(userDakaShareModel, "userDakaShareModel");
        kotlin.jvm.internal.g0.p(dakaBackgroundModel, "dakaBackgroundModel");
        kotlin.jvm.internal.g0.p(userBriefModel, "userBriefModel");
        return new f0(userDakaShareModel, dakaBackgroundModel, userBriefModel);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.g0.g(this.f65296a, f0Var.f65296a) && kotlin.jvm.internal.g0.g(this.f65297b, f0Var.f65297b) && kotlin.jvm.internal.g0.g(this.f65298c, f0Var.f65298c);
    }

    @m80.k
    public final d0 f() {
        return this.f65297b;
    }

    @m80.k
    public final s3 g() {
        return this.f65298c;
    }

    @m80.k
    public final u3 h() {
        return this.f65296a;
    }

    public int hashCode() {
        return (((this.f65296a.hashCode() * 31) + this.f65297b.hashCode()) * 31) + this.f65298c.hashCode();
    }

    @m80.k
    public String toString() {
        return "DakaModel(userDakaShareModel=" + this.f65296a + ", dakaBackgroundModel=" + this.f65297b + ", userBriefModel=" + this.f65298c + ')';
    }
}
