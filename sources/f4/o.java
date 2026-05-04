package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f50757a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f50758b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50759c;

    public o(long j11, @m80.k String gameRoundId, long j12) {
        kotlin.jvm.internal.g0.p(gameRoundId, "gameRoundId");
        this.f50757a = j11;
        this.f50758b = gameRoundId;
        this.f50759c = j12;
    }

    public static /* synthetic */ o e(o oVar, long j11, String str, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = oVar.f50757a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = oVar.f50758b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j12 = oVar.f50759c;
        }
        return oVar.d(j13, str2, j12);
    }

    public final long a() {
        return this.f50757a;
    }

    @m80.k
    public final String b() {
        return this.f50758b;
    }

    public final long c() {
        return this.f50759c;
    }

    @m80.k
    public final o d(long j11, @m80.k String gameRoundId, long j12) {
        kotlin.jvm.internal.g0.p(gameRoundId, "gameRoundId");
        return new o(j11, gameRoundId, j12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f50757a == oVar.f50757a && kotlin.jvm.internal.g0.g(this.f50758b, oVar.f50758b) && this.f50759c == oVar.f50759c;
    }

    public final long f() {
        return this.f50757a;
    }

    @m80.k
    public final String g() {
        return this.f50758b;
    }

    public final long h() {
        return this.f50759c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f50757a) * 31) + this.f50758b.hashCode()) * 31) + Long.hashCode(this.f50759c);
    }

    @m80.k
    public String toString() {
        return "AbilityScoreSyn(abilityScoreId=" + this.f50757a + ", gameRoundId=" + this.f50758b + ", lastModifyTime=" + this.f50759c + ')';
    }
}
