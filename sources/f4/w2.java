package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50856a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50858c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50859d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50860e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50861f;

    /* renamed from: g, reason: collision with root package name */
    public final long f50862g;

    /* renamed from: h, reason: collision with root package name */
    public final long f50863h;

    public w2(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f50856a = j11;
        this.f50857b = j12;
        this.f50858c = j13;
        this.f50859d = j14;
        this.f50860e = j15;
        this.f50861f = j16;
        this.f50862g = j17;
        this.f50863h = j18;
    }

    public static /* synthetic */ w2 j(w2 w2Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i11, Object obj) {
        long j19;
        long j21;
        long j22 = (i11 & 1) != 0 ? w2Var.f50856a : j11;
        long j23 = (i11 & 2) != 0 ? w2Var.f50857b : j12;
        long j24 = (i11 & 4) != 0 ? w2Var.f50858c : j13;
        long j25 = (i11 & 8) != 0 ? w2Var.f50859d : j14;
        long j26 = (i11 & 16) != 0 ? w2Var.f50860e : j15;
        long j27 = (i11 & 32) != 0 ? w2Var.f50861f : j16;
        long j28 = (i11 & 64) != 0 ? w2Var.f50862g : j17;
        if ((i11 & 128) != 0) {
            j19 = w2Var.f50863h;
            j21 = j22;
        } else {
            j19 = j18;
            j21 = j22;
        }
        return w2Var.i(j21, j23, j24, j25, j26, j27, j28, j19);
    }

    public final long a() {
        return this.f50856a;
    }

    public final long b() {
        return this.f50857b;
    }

    public final long c() {
        return this.f50858c;
    }

    public final long d() {
        return this.f50859d;
    }

    public final long e() {
        return this.f50860e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return this.f50856a == w2Var.f50856a && this.f50857b == w2Var.f50857b && this.f50858c == w2Var.f50858c && this.f50859d == w2Var.f50859d && this.f50860e == w2Var.f50860e && this.f50861f == w2Var.f50861f && this.f50862g == w2Var.f50862g && this.f50863h == w2Var.f50863h;
    }

    public final long f() {
        return this.f50861f;
    }

    public final long g() {
        return this.f50862g;
    }

    public final long h() {
        return this.f50863h;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f50856a) * 31) + Long.hashCode(this.f50857b)) * 31) + Long.hashCode(this.f50858c)) * 31) + Long.hashCode(this.f50859d)) * 31) + Long.hashCode(this.f50860e)) * 31) + Long.hashCode(this.f50861f)) * 31) + Long.hashCode(this.f50862g)) * 31) + Long.hashCode(this.f50863h);
    }

    @m80.k
    public final w2 i(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        return new w2(j11, j12, j13, j14, j15, j16, j17, j18);
    }

    public final long k() {
        return this.f50856a;
    }

    public final long l() {
        return this.f50860e;
    }

    public final long m() {
        return this.f50863h;
    }

    public final long n() {
        return this.f50862g;
    }

    public final long o() {
        return this.f50861f;
    }

    public final long p() {
        return this.f50858c;
    }

    public final long q() {
        return this.f50857b;
    }

    public final long r() {
        return this.f50859d;
    }

    @m80.k
    public String toString() {
        return "StudyRecord(bookId=" + this.f50856a + ", topicId=" + this.f50857b + ", stage=" + this.f50858c + ", isKilled=" + this.f50859d + ", halfTime=" + this.f50860e + ", nextReviewTime=" + this.f50861f + ", learnTime=" + this.f50862g + ", lastModifyTime=" + this.f50863h + ')';
    }
}
