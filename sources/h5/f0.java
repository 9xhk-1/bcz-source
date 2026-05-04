package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f58338a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58339b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58340c;

    /* renamed from: d, reason: collision with root package name */
    public final long f58341d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58342e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58343f;

    public f0() {
        this(0L, 0L, 0L, 0L, 0, 0, 63, null);
    }

    public static /* synthetic */ f0 h(f0 f0Var, long j11, long j12, long j13, long j14, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = f0Var.f58338a;
        }
        long j15 = j11;
        if ((i13 & 2) != 0) {
            j12 = f0Var.f58339b;
        }
        return f0Var.g(j15, j12, (i13 & 4) != 0 ? f0Var.f58340c : j13, (i13 & 8) != 0 ? f0Var.f58341d : j14, (i13 & 16) != 0 ? f0Var.f58342e : i11, (i13 & 32) != 0 ? f0Var.f58343f : i12);
    }

    public final long a() {
        return this.f58338a;
    }

    public final long b() {
        return this.f58339b;
    }

    public final long c() {
        return this.f58340c;
    }

    public final long d() {
        return this.f58341d;
    }

    public final int e() {
        return this.f58342e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f58338a == f0Var.f58338a && this.f58339b == f0Var.f58339b && this.f58340c == f0Var.f58340c && this.f58341d == f0Var.f58341d && this.f58342e == f0Var.f58342e && this.f58343f == f0Var.f58343f;
    }

    public final int f() {
        return this.f58343f;
    }

    @m80.k
    public final f0 g(long j11, long j12, long j13, long j14, int i11, int i12) {
        return new f0(j11, j12, j13, j14, i11, i12);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f58338a) * 31) + Long.hashCode(this.f58339b)) * 31) + Long.hashCode(this.f58340c)) * 31) + Long.hashCode(this.f58341d)) * 31) + Integer.hashCode(this.f58342e)) * 31) + Integer.hashCode(this.f58343f);
    }

    public final int i() {
        return this.f58343f;
    }

    public final long j() {
        return this.f58338a;
    }

    public final long k() {
        return this.f58339b;
    }

    public final long l() {
        return this.f58340c;
    }

    public final int m() {
        return this.f58342e;
    }

    public final long n() {
        return this.f58341d;
    }

    @m80.k
    public String toString() {
        return "RewardSummary(coin=" + this.f58338a + ", energyEn=" + this.f58339b + ", energyJp=" + this.f58340c + ", studyScore=" + this.f58341d + ", hammer=" + this.f58342e + ", buddySnacksCount=" + this.f58343f + ')';
    }

    public f0(long j11, long j12, long j13, long j14, int i11, int i12) {
        this.f58338a = j11;
        this.f58339b = j12;
        this.f58340c = j13;
        this.f58341d = j14;
        this.f58342e = i11;
        this.f58343f = i12;
    }

    public /* synthetic */ f0(long j11, long j12, long j13, long j14, int i11, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? 0L : j11, (i13 & 2) != 0 ? 0L : j12, (i13 & 4) != 0 ? 0L : j13, (i13 & 8) != 0 ? 0L : j14, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
