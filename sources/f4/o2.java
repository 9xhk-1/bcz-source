package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50776a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50777b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50778c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50779d;

    public o2(long j11, long j12, long j13, long j14) {
        this.f50776a = j11;
        this.f50777b = j12;
        this.f50778c = j13;
        this.f50779d = j14;
    }

    public static /* synthetic */ o2 f(o2 o2Var, long j11, long j12, long j13, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = o2Var.f50776a;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = o2Var.f50777b;
        }
        long j16 = j12;
        if ((i11 & 4) != 0) {
            j13 = o2Var.f50778c;
        }
        return o2Var.e(j15, j16, j13, (i11 & 8) != 0 ? o2Var.f50779d : j14);
    }

    public final long a() {
        return this.f50776a;
    }

    public final long b() {
        return this.f50777b;
    }

    public final long c() {
        return this.f50778c;
    }

    public final long d() {
        return this.f50779d;
    }

    @m80.k
    public final o2 e(long j11, long j12, long j13, long j14) {
        return new o2(j11, j12, j13, j14);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f50776a == o2Var.f50776a && this.f50777b == o2Var.f50777b && this.f50778c == o2Var.f50778c && this.f50779d == o2Var.f50779d;
    }

    public final long g() {
        return this.f50777b;
    }

    public final long h() {
        return this.f50776a;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f50776a) * 31) + Long.hashCode(this.f50777b)) * 31) + Long.hashCode(this.f50778c)) * 31) + Long.hashCode(this.f50779d);
    }

    public final long i() {
        return this.f50779d;
    }

    public final long j() {
        return this.f50778c;
    }

    @m80.k
    public String toString() {
        return "IslandMapInfo(id=" + this.f50776a + ", bookId=" + this.f50777b + ", wordIndex=" + this.f50778c + ", resourceId=" + this.f50779d + ')';
    }
}
