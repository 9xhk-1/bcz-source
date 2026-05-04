package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50842a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50843b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50844c;

    public v1(long j11, long j12, long j13) {
        this.f50842a = j11;
        this.f50843b = j12;
        this.f50844c = j13;
    }

    public static /* synthetic */ v1 e(v1 v1Var, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = v1Var.f50842a;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            j12 = v1Var.f50843b;
        }
        long j15 = j12;
        if ((i11 & 4) != 0) {
            j13 = v1Var.f50844c;
        }
        return v1Var.d(j14, j15, j13);
    }

    public final long a() {
        return this.f50842a;
    }

    public final long b() {
        return this.f50843b;
    }

    public final long c() {
        return this.f50844c;
    }

    @m80.k
    public final v1 d(long j11, long j12, long j13) {
        return new v1(j11, j12, j13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f50842a == v1Var.f50842a && this.f50843b == v1Var.f50843b && this.f50844c == v1Var.f50844c;
    }

    public final long f() {
        return this.f50842a;
    }

    public final long g() {
        return this.f50844c;
    }

    public final long h() {
        return this.f50843b;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f50842a) * 31) + Long.hashCode(this.f50843b)) * 31) + Long.hashCode(this.f50844c);
    }

    @m80.k
    public String toString() {
        return "GameTopicRemoteVersionRecord(bookId=" + this.f50842a + ", topicId=" + this.f50843b + ", remoteVersion=" + this.f50844c + ')';
    }
}
