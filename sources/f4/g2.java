package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50611a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50612b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50613c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f50614d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50615e;

    public g2(long j11, long j12, long j13, @m80.k String payload, long j14) {
        kotlin.jvm.internal.g0.p(payload, "payload");
        this.f50611a = j11;
        this.f50612b = j12;
        this.f50613c = j13;
        this.f50614d = payload;
        this.f50615e = j14;
    }

    public static /* synthetic */ g2 g(g2 g2Var, long j11, long j12, long j13, String str, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = g2Var.f50611a;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = g2Var.f50612b;
        }
        return g2Var.f(j15, j12, (i11 & 4) != 0 ? g2Var.f50613c : j13, (i11 & 8) != 0 ? g2Var.f50614d : str, (i11 & 16) != 0 ? g2Var.f50615e : j14);
    }

    public final long a() {
        return this.f50611a;
    }

    public final long b() {
        return this.f50612b;
    }

    public final long c() {
        return this.f50613c;
    }

    @m80.k
    public final String d() {
        return this.f50614d;
    }

    public final long e() {
        return this.f50615e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f50611a == g2Var.f50611a && this.f50612b == g2Var.f50612b && this.f50613c == g2Var.f50613c && kotlin.jvm.internal.g0.g(this.f50614d, g2Var.f50614d) && this.f50615e == g2Var.f50615e;
    }

    @m80.k
    public final g2 f(long j11, long j12, long j13, @m80.k String payload, long j14) {
        kotlin.jvm.internal.g0.p(payload, "payload");
        return new g2(j11, j12, j13, payload, j14);
    }

    public final long h() {
        return this.f50611a;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f50611a) * 31) + Long.hashCode(this.f50612b)) * 31) + Long.hashCode(this.f50613c)) * 31) + this.f50614d.hashCode()) * 31) + Long.hashCode(this.f50615e);
    }

    @m80.k
    public final String i() {
        return this.f50614d;
    }

    public final long j() {
        return this.f50612b;
    }

    public final long k() {
        return this.f50615e;
    }

    public final long l() {
        return this.f50613c;
    }

    @m80.k
    public String toString() {
        return "GameTopicResourceRecord(bookId=" + this.f50611a + ", topicId=" + this.f50612b + ", updateTime=" + this.f50613c + ", payload=" + this.f50614d + ", topicVersion=" + this.f50615e + ')';
    }
}
