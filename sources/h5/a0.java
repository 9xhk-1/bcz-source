package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58307b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58308c;

    /* renamed from: d, reason: collision with root package name */
    public final long f58309d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final z8.s f58310e;

    public a0(int i11, int i12, long j11, long j12, @m80.k z8.s rankDetail) {
        kotlin.jvm.internal.g0.p(rankDetail, "rankDetail");
        this.f58306a = i11;
        this.f58307b = i12;
        this.f58308c = j11;
        this.f58309d = j12;
        this.f58310e = rankDetail;
    }

    public static /* synthetic */ a0 g(a0 a0Var, int i11, int i12, long j11, long j12, z8.s sVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = a0Var.f58306a;
        }
        if ((i13 & 2) != 0) {
            i12 = a0Var.f58307b;
        }
        if ((i13 & 4) != 0) {
            j11 = a0Var.f58308c;
        }
        if ((i13 & 8) != 0) {
            j12 = a0Var.f58309d;
        }
        if ((i13 & 16) != 0) {
            sVar = a0Var.f58310e;
        }
        z8.s sVar2 = sVar;
        long j13 = j12;
        return a0Var.f(i11, i12, j11, j13, sVar2);
    }

    public final int a() {
        return this.f58306a;
    }

    public final int b() {
        return this.f58307b;
    }

    public final long c() {
        return this.f58308c;
    }

    public final long d() {
        return this.f58309d;
    }

    @m80.k
    public final z8.s e() {
        return this.f58310e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f58306a == a0Var.f58306a && this.f58307b == a0Var.f58307b && this.f58308c == a0Var.f58308c && this.f58309d == a0Var.f58309d && kotlin.jvm.internal.g0.g(this.f58310e, a0Var.f58310e);
    }

    @m80.k
    public final a0 f(int i11, int i12, long j11, long j12, @m80.k z8.s rankDetail) {
        kotlin.jvm.internal.g0.p(rankDetail, "rankDetail");
        return new a0(i11, i12, j11, j12, rankDetail);
    }

    public final int h() {
        return this.f58306a;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f58306a) * 31) + Integer.hashCode(this.f58307b)) * 31) + Long.hashCode(this.f58308c)) * 31) + Long.hashCode(this.f58309d)) * 31) + this.f58310e.hashCode();
    }

    public final long i() {
        return this.f58309d;
    }

    public final int j() {
        return this.f58307b;
    }

    public final long k() {
        return this.f58308c;
    }

    @m80.k
    public final z8.s l() {
        return this.f58310e;
    }

    @m80.k
    public String toString() {
        return "RankPopupModel(currentRankNo=" + this.f58306a + ", previousRankNo=" + this.f58307b + ", previousStudyScore=" + this.f58308c + ", currentStudyScore=" + this.f58309d + ", rankDetail=" + this.f58310e + ')';
    }
}
