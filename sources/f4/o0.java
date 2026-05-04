package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f50760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50761b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f50762c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50763d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50764e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50765f;

    /* renamed from: g, reason: collision with root package name */
    public final long f50766g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f50767h;

    public o0(@m80.k String roundId, long j11, @m80.k String words, long j12, long j13, long j14, long j15, @m80.k String roundState) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        kotlin.jvm.internal.g0.p(words, "words");
        kotlin.jvm.internal.g0.p(roundState, "roundState");
        this.f50760a = roundId;
        this.f50761b = j11;
        this.f50762c = words;
        this.f50763d = j12;
        this.f50764e = j13;
        this.f50765f = j14;
        this.f50766g = j15;
        this.f50767h = roundState;
    }

    public static /* synthetic */ o0 j(o0 o0Var, String str, long j11, String str2, long j12, long j13, long j14, long j15, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = o0Var.f50760a;
        }
        return o0Var.i(str, (i11 & 2) != 0 ? o0Var.f50761b : j11, (i11 & 4) != 0 ? o0Var.f50762c : str2, (i11 & 8) != 0 ? o0Var.f50763d : j12, (i11 & 16) != 0 ? o0Var.f50764e : j13, (i11 & 32) != 0 ? o0Var.f50765f : j14, (i11 & 64) != 0 ? o0Var.f50766g : j15, (i11 & 128) != 0 ? o0Var.f50767h : str3);
    }

    @m80.k
    public final String a() {
        return this.f50760a;
    }

    public final long b() {
        return this.f50761b;
    }

    @m80.k
    public final String c() {
        return this.f50762c;
    }

    public final long d() {
        return this.f50763d;
    }

    public final long e() {
        return this.f50764e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.g0.g(this.f50760a, o0Var.f50760a) && this.f50761b == o0Var.f50761b && kotlin.jvm.internal.g0.g(this.f50762c, o0Var.f50762c) && this.f50763d == o0Var.f50763d && this.f50764e == o0Var.f50764e && this.f50765f == o0Var.f50765f && this.f50766g == o0Var.f50766g && kotlin.jvm.internal.g0.g(this.f50767h, o0Var.f50767h);
    }

    public final long f() {
        return this.f50765f;
    }

    public final long g() {
        return this.f50766g;
    }

    @m80.k
    public final String h() {
        return this.f50767h;
    }

    public int hashCode() {
        return (((((((((((((this.f50760a.hashCode() * 31) + Long.hashCode(this.f50761b)) * 31) + this.f50762c.hashCode()) * 31) + Long.hashCode(this.f50763d)) * 31) + Long.hashCode(this.f50764e)) * 31) + Long.hashCode(this.f50765f)) * 31) + Long.hashCode(this.f50766g)) * 31) + this.f50767h.hashCode();
    }

    @m80.k
    public final o0 i(@m80.k String roundId, long j11, @m80.k String words, long j12, long j13, long j14, long j15, @m80.k String roundState) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        kotlin.jvm.internal.g0.p(words, "words");
        kotlin.jvm.internal.g0.p(roundState, "roundState");
        return new o0(roundId, j11, words, j12, j13, j14, j15, roundState);
    }

    public final long k() {
        return this.f50761b;
    }

    public final long l() {
        return this.f50764e;
    }

    public final long m() {
        return this.f50763d;
    }

    @m80.k
    public final String n() {
        return this.f50760a;
    }

    @m80.k
    public final String o() {
        return this.f50767h;
    }

    public final long p() {
        return this.f50766g;
    }

    public final long q() {
        return this.f50765f;
    }

    @m80.k
    public final String r() {
        return this.f50762c;
    }

    @m80.k
    public String toString() {
        return "GameRound(roundId=" + this.f50760a + ", bookId=" + this.f50761b + ", words=" + this.f50762c + ", roundCate=" + this.f50763d + ", lifeCount=" + this.f50764e + ", roundType=" + this.f50765f + ", roundTime=" + this.f50766g + ", roundState=" + this.f50767h + ')';
    }
}
