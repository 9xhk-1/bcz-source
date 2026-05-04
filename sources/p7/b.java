package p7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f79348a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79349b;

    public b(long j11, long j12) {
        this.f79348a = j11;
        this.f79349b = j12;
    }

    public static /* synthetic */ b d(b bVar, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = bVar.f79348a;
        }
        if ((i11 & 2) != 0) {
            j12 = bVar.f79349b;
        }
        return bVar.c(j11, j12);
    }

    public final long a() {
        return this.f79348a;
    }

    public final long b() {
        return this.f79349b;
    }

    @m80.k
    public final b c(long j11, long j12) {
        return new b(j11, j12);
    }

    public final long e() {
        return this.f79349b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f79348a == bVar.f79348a && this.f79349b == bVar.f79349b;
    }

    public final long f() {
        return this.f79348a;
    }

    public int hashCode() {
        return (Long.hashCode(this.f79348a) * 31) + Long.hashCode(this.f79349b);
    }

    @m80.k
    public String toString() {
        return "QueryWordCountInUserBookIdsGroupByUserBookId(userBookId=" + this.f79348a + ", COUNT=" + this.f79349b + ')';
    }
}
