package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50649a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50650b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50651c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50652d;

    public i3(long j11, long j12, long j13, long j14) {
        this.f50649a = j11;
        this.f50650b = j12;
        this.f50651c = j13;
        this.f50652d = j14;
    }

    public static /* synthetic */ i3 f(i3 i3Var, long j11, long j12, long j13, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = i3Var.f50649a;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = i3Var.f50650b;
        }
        long j16 = j12;
        if ((i11 & 4) != 0) {
            j13 = i3Var.f50651c;
        }
        return i3Var.e(j15, j16, j13, (i11 & 8) != 0 ? i3Var.f50652d : j14);
    }

    public final long a() {
        return this.f50649a;
    }

    public final long b() {
        return this.f50650b;
    }

    public final long c() {
        return this.f50651c;
    }

    public final long d() {
        return this.f50652d;
    }

    @m80.k
    public final i3 e(long j11, long j12, long j13, long j14) {
        return new i3(j11, j12, j13, j14);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f50649a == i3Var.f50649a && this.f50650b == i3Var.f50650b && this.f50651c == i3Var.f50651c && this.f50652d == i3Var.f50652d;
    }

    public final long g() {
        return this.f50650b;
    }

    public final long h() {
        return this.f50649a;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f50649a) * 31) + Long.hashCode(this.f50650b)) * 31) + Long.hashCode(this.f50651c)) * 31) + Long.hashCode(this.f50652d);
    }

    public final long i() {
        return this.f50652d;
    }

    public final long j() {
        return this.f50651c;
    }

    @m80.k
    public String toString() {
        return "StudyRecordSyn(id=" + this.f50649a + ", bookId=" + this.f50650b + ", topicId=" + this.f50651c + ", lastModifyTime=" + this.f50652d + ')';
    }
}
