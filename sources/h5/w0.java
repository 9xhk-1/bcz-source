package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x0 f58468a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y f58469b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final g f58470c;

    /* renamed from: d, reason: collision with root package name */
    public final long f58471d;

    public w0(@m80.k x0 userProfileModel, @m80.k y membershipModel, @m80.k g energyModel, long j11) {
        kotlin.jvm.internal.g0.p(userProfileModel, "userProfileModel");
        kotlin.jvm.internal.g0.p(membershipModel, "membershipModel");
        kotlin.jvm.internal.g0.p(energyModel, "energyModel");
        this.f58468a = userProfileModel;
        this.f58469b = membershipModel;
        this.f58470c = energyModel;
        this.f58471d = j11;
    }

    public static /* synthetic */ w0 f(w0 w0Var, x0 x0Var, y yVar, g gVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            x0Var = w0Var.f58468a;
        }
        if ((i11 & 2) != 0) {
            yVar = w0Var.f58469b;
        }
        if ((i11 & 4) != 0) {
            gVar = w0Var.f58470c;
        }
        if ((i11 & 8) != 0) {
            j11 = w0Var.f58471d;
        }
        g gVar2 = gVar;
        return w0Var.e(x0Var, yVar, gVar2, j11);
    }

    @m80.k
    public final x0 a() {
        return this.f58468a;
    }

    @m80.k
    public final y b() {
        return this.f58469b;
    }

    @m80.k
    public final g c() {
        return this.f58470c;
    }

    public final long d() {
        return this.f58471d;
    }

    @m80.k
    public final w0 e(@m80.k x0 userProfileModel, @m80.k y membershipModel, @m80.k g energyModel, long j11) {
        kotlin.jvm.internal.g0.p(userProfileModel, "userProfileModel");
        kotlin.jvm.internal.g0.p(membershipModel, "membershipModel");
        kotlin.jvm.internal.g0.p(energyModel, "energyModel");
        return new w0(userProfileModel, membershipModel, energyModel, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.g0.g(this.f58468a, w0Var.f58468a) && kotlin.jvm.internal.g0.g(this.f58469b, w0Var.f58469b) && kotlin.jvm.internal.g0.g(this.f58470c, w0Var.f58470c) && this.f58471d == w0Var.f58471d;
    }

    public final long g() {
        return this.f58471d;
    }

    @m80.k
    public final g h() {
        return this.f58470c;
    }

    public int hashCode() {
        return (((((this.f58468a.hashCode() * 31) + this.f58469b.hashCode()) * 31) + this.f58470c.hashCode()) * 31) + Long.hashCode(this.f58471d);
    }

    @m80.k
    public final y i() {
        return this.f58469b;
    }

    @m80.k
    public final x0 j() {
        return this.f58468a;
    }

    @m80.k
    public String toString() {
        return "UserGameInfoSnapshot(userProfileModel=" + this.f58468a + ", membershipModel=" + this.f58469b + ", energyModel=" + this.f58470c + ", coin=" + this.f58471d + ')';
    }
}
