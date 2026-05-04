package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f69700a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69701b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69703d;

    public u(long j11, long j12, long j13, int i11) {
        this.f69700a = j11;
        this.f69701b = j12;
        this.f69702c = j13;
        this.f69703d = i11;
    }

    public static /* synthetic */ u f(u uVar, long j11, long j12, long j13, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = uVar.f69700a;
        }
        long j14 = j11;
        if ((i12 & 2) != 0) {
            j12 = uVar.f69701b;
        }
        long j15 = j12;
        if ((i12 & 4) != 0) {
            j13 = uVar.f69702c;
        }
        long j16 = j13;
        if ((i12 & 8) != 0) {
            i11 = uVar.f69703d;
        }
        return uVar.e(j14, j15, j16, i11);
    }

    public final long a() {
        return this.f69700a;
    }

    public final long b() {
        return this.f69701b;
    }

    public final long c() {
        return this.f69702c;
    }

    public final int d() {
        return this.f69703d;
    }

    @m80.k
    public final u e(long j11, long j12, long j13, int i11) {
        return new u(j11, j12, j13, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f69700a == uVar.f69700a && this.f69701b == uVar.f69701b && this.f69702c == uVar.f69702c && this.f69703d == uVar.f69703d;
    }

    public final long g() {
        return this.f69700a;
    }

    public final int h() {
        return this.f69703d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f69700a) * 31) + Long.hashCode(this.f69701b)) * 31) + Long.hashCode(this.f69702c)) * 31) + Integer.hashCode(this.f69703d);
    }

    public final long i() {
        return this.f69701b;
    }

    public final long j() {
        return this.f69702c;
    }

    @m80.k
    public String toString() {
        return "RewardData(coin=" + this.f69700a + ", energy=" + this.f69701b + ", studyScore=" + this.f69702c + ", consumableItem=" + this.f69703d + ')';
    }
}
