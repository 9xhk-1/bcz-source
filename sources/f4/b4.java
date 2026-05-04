package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50498a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50499b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f50500c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50501d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50502e;

    public b4(long j11, long j12, @m80.k String resourceId, long j13, long j14) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        this.f50498a = j11;
        this.f50499b = j12;
        this.f50500c = resourceId;
        this.f50501d = j13;
        this.f50502e = j14;
    }

    public static /* synthetic */ b4 g(b4 b4Var, long j11, long j12, String str, long j13, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = b4Var.f50498a;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = b4Var.f50499b;
        }
        long j16 = j12;
        if ((i11 & 4) != 0) {
            str = b4Var.f50500c;
        }
        return b4Var.f(j15, j16, str, (i11 & 8) != 0 ? b4Var.f50501d : j13, (i11 & 16) != 0 ? b4Var.f50502e : j14);
    }

    public final long a() {
        return this.f50498a;
    }

    public final long b() {
        return this.f50499b;
    }

    @m80.k
    public final String c() {
        return this.f50500c;
    }

    public final long d() {
        return this.f50501d;
    }

    public final long e() {
        return this.f50502e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.f50498a == b4Var.f50498a && this.f50499b == b4Var.f50499b && kotlin.jvm.internal.g0.g(this.f50500c, b4Var.f50500c) && this.f50501d == b4Var.f50501d && this.f50502e == b4Var.f50502e;
    }

    @m80.k
    public final b4 f(long j11, long j12, @m80.k String resourceId, long j13, long j14) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        return new b4(j11, j12, resourceId, j13, j14);
    }

    public final long h() {
        return this.f50499b;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f50498a) * 31) + Long.hashCode(this.f50499b)) * 31) + this.f50500c.hashCode()) * 31) + Long.hashCode(this.f50501d)) * 31) + Long.hashCode(this.f50502e);
    }

    public final long i() {
        return this.f50498a;
    }

    public final long j() {
        return this.f50501d;
    }

    public final long k() {
        return this.f50502e;
    }

    @m80.k
    public final String l() {
        return this.f50500c;
    }

    @m80.k
    public String toString() {
        return "VersionInfo(id=" + this.f50498a + ", bookId=" + this.f50499b + ", resourceId=" + this.f50500c + ", localVersion=" + this.f50501d + ", remoteVersion=" + this.f50502e + ')';
    }
}
