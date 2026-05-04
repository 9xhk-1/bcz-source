package p7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f79426a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f79427b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79428c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f79429d;

    /* renamed from: e, reason: collision with root package name */
    public final long f79430e;

    /* renamed from: f, reason: collision with root package name */
    public final long f79431f;

    public p(long j11, @m80.k String bookName, long j12, @m80.l String str, long j13, long j14) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        this.f79426a = j11;
        this.f79427b = bookName;
        this.f79428c = j12;
        this.f79429d = str;
        this.f79430e = j13;
        this.f79431f = j14;
    }

    public static /* synthetic */ p h(p pVar, long j11, String str, long j12, String str2, long j13, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = pVar.f79426a;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            str = pVar.f79427b;
        }
        return pVar.g(j15, str, (i11 & 4) != 0 ? pVar.f79428c : j12, (i11 & 8) != 0 ? pVar.f79429d : str2, (i11 & 16) != 0 ? pVar.f79430e : j13, (i11 & 32) != 0 ? pVar.f79431f : j14);
    }

    public final long a() {
        return this.f79426a;
    }

    @m80.k
    public final String b() {
        return this.f79427b;
    }

    public final long c() {
        return this.f79428c;
    }

    @m80.l
    public final String d() {
        return this.f79429d;
    }

    public final long e() {
        return this.f79430e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f79426a == pVar.f79426a && kotlin.jvm.internal.g0.g(this.f79427b, pVar.f79427b) && this.f79428c == pVar.f79428c && kotlin.jvm.internal.g0.g(this.f79429d, pVar.f79429d) && this.f79430e == pVar.f79430e && this.f79431f == pVar.f79431f;
    }

    public final long f() {
        return this.f79431f;
    }

    @m80.k
    public final p g(long j11, @m80.k String bookName, long j12, @m80.l String str, long j13, long j14) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        return new p(j11, bookName, j12, str, j13, j14);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f79426a) * 31) + this.f79427b.hashCode()) * 31) + Long.hashCode(this.f79428c)) * 31;
        String str = this.f79429d;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f79430e)) * 31) + Long.hashCode(this.f79431f);
    }

    @m80.k
    public final String i() {
        return this.f79427b;
    }

    @m80.l
    public final String j() {
        return this.f79429d;
    }

    public final long k() {
        return this.f79431f;
    }

    public final long l() {
        return this.f79430e;
    }

    public final long m() {
        return this.f79426a;
    }

    public final long n() {
        return this.f79428c;
    }

    @m80.k
    public String toString() {
        return "UserBookRecord(userBookId=" + this.f79426a + ", bookName=" + this.f79427b + ", wordNum=" + this.f79428c + ", cover=" + this.f79429d + ", remoteVersion=" + this.f79430e + ", localVersion=" + this.f79431f + ')';
    }
}
