package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50783a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50784b;

    public p2(long j11, long j12) {
        this.f50783a = j11;
        this.f50784b = j12;
    }

    public static /* synthetic */ p2 d(p2 p2Var, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = p2Var.f50783a;
        }
        if ((i11 & 2) != 0) {
            j12 = p2Var.f50784b;
        }
        return p2Var.c(j11, j12);
    }

    public final long a() {
        return this.f50783a;
    }

    public final long b() {
        return this.f50784b;
    }

    @m80.k
    public final p2 c(long j11, long j12) {
        return new p2(j11, j12);
    }

    public final long e() {
        return this.f50783a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f50783a == p2Var.f50783a && this.f50784b == p2Var.f50784b;
    }

    public final long f() {
        return this.f50784b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f50783a) * 31) + Long.hashCode(this.f50784b);
    }

    @m80.k
    public String toString() {
        return "QueryLocalVersionsByBookIdAndTopicIds(topicId=" + this.f50783a + ", topicVersion=" + this.f50784b + ')';
    }
}
