package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50740a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50741b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50742c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50743d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f50744e;

    public n0(long j11, long j12, long j13, long j14, @m80.k String bookInfo) {
        kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
        this.f50740a = j11;
        this.f50741b = j12;
        this.f50742c = j13;
        this.f50743d = j14;
        this.f50744e = bookInfo;
    }

    public static /* synthetic */ n0 g(n0 n0Var, long j11, long j12, long j13, long j14, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = n0Var.f50740a;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = n0Var.f50741b;
        }
        return n0Var.f(j15, j12, (i11 & 4) != 0 ? n0Var.f50742c : j13, (i11 & 8) != 0 ? n0Var.f50743d : j14, (i11 & 16) != 0 ? n0Var.f50744e : str);
    }

    public final long a() {
        return this.f50740a;
    }

    public final long b() {
        return this.f50741b;
    }

    public final long c() {
        return this.f50742c;
    }

    public final long d() {
        return this.f50743d;
    }

    @m80.k
    public final String e() {
        return this.f50744e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f50740a == n0Var.f50740a && this.f50741b == n0Var.f50741b && this.f50742c == n0Var.f50742c && this.f50743d == n0Var.f50743d && kotlin.jvm.internal.g0.g(this.f50744e, n0Var.f50744e);
    }

    @m80.k
    public final n0 f(long j11, long j12, long j13, long j14, @m80.k String bookInfo) {
        kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
        return new n0(j11, j12, j13, j14, bookInfo);
    }

    public final long h() {
        return this.f50740a;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f50740a) * 31) + Long.hashCode(this.f50741b)) * 31) + Long.hashCode(this.f50742c)) * 31) + Long.hashCode(this.f50743d)) * 31) + this.f50744e.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f50744e;
    }

    public final long j() {
        return this.f50741b;
    }

    public final long k() {
        return this.f50742c;
    }

    public final long l() {
        return this.f50743d;
    }

    @m80.k
    public String toString() {
        return "GameBookRecord(bookId=" + this.f50740a + ", currentProgress=" + this.f50741b + ", targetProgress=" + this.f50742c + ", updateDay=" + this.f50743d + ", bookInfo=" + this.f50744e + ')';
    }
}
