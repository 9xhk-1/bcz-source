package p7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f79630a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79631b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79632c;

    /* renamed from: d, reason: collision with root package name */
    public final long f79633d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f79634e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f79635f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f79636g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f79637h;

    public w(long j11, long j12, long j13, long j14, @m80.k String word, @m80.k String mean, @m80.k String audioUs, @m80.k String audioUk) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(audioUs, "audioUs");
        kotlin.jvm.internal.g0.p(audioUk, "audioUk");
        this.f79630a = j11;
        this.f79631b = j12;
        this.f79632c = j13;
        this.f79633d = j14;
        this.f79634e = word;
        this.f79635f = mean;
        this.f79636g = audioUs;
        this.f79637h = audioUk;
    }

    public static /* synthetic */ w j(w wVar, long j11, long j12, long j13, long j14, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = wVar.f79630a;
        }
        return wVar.i(j11, (i11 & 2) != 0 ? wVar.f79631b : j12, (i11 & 4) != 0 ? wVar.f79632c : j13, (i11 & 8) != 0 ? wVar.f79633d : j14, (i11 & 16) != 0 ? wVar.f79634e : str, (i11 & 32) != 0 ? wVar.f79635f : str2, (i11 & 64) != 0 ? wVar.f79636g : str3, (i11 & 128) != 0 ? wVar.f79637h : str4);
    }

    public final long a() {
        return this.f79630a;
    }

    public final long b() {
        return this.f79631b;
    }

    public final long c() {
        return this.f79632c;
    }

    public final long d() {
        return this.f79633d;
    }

    @m80.k
    public final String e() {
        return this.f79634e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f79630a == wVar.f79630a && this.f79631b == wVar.f79631b && this.f79632c == wVar.f79632c && this.f79633d == wVar.f79633d && kotlin.jvm.internal.g0.g(this.f79634e, wVar.f79634e) && kotlin.jvm.internal.g0.g(this.f79635f, wVar.f79635f) && kotlin.jvm.internal.g0.g(this.f79636g, wVar.f79636g) && kotlin.jvm.internal.g0.g(this.f79637h, wVar.f79637h);
    }

    @m80.k
    public final String f() {
        return this.f79635f;
    }

    @m80.k
    public final String g() {
        return this.f79636g;
    }

    @m80.k
    public final String h() {
        return this.f79637h;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f79630a) * 31) + Long.hashCode(this.f79631b)) * 31) + Long.hashCode(this.f79632c)) * 31) + Long.hashCode(this.f79633d)) * 31) + this.f79634e.hashCode()) * 31) + this.f79635f.hashCode()) * 31) + this.f79636g.hashCode()) * 31) + this.f79637h.hashCode();
    }

    @m80.k
    public final w i(long j11, long j12, long j13, long j14, @m80.k String word, @m80.k String mean, @m80.k String audioUs, @m80.k String audioUk) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(audioUs, "audioUs");
        kotlin.jvm.internal.g0.p(audioUk, "audioUk");
        return new w(j11, j12, j13, j14, word, mean, audioUs, audioUk);
    }

    @m80.k
    public final String k() {
        return this.f79637h;
    }

    @m80.k
    public final String l() {
        return this.f79636g;
    }

    public final long m() {
        return this.f79632c;
    }

    public final long n() {
        return this.f79633d;
    }

    @m80.k
    public final String o() {
        return this.f79635f;
    }

    public final long p() {
        return this.f79630a;
    }

    public final long q() {
        return this.f79631b;
    }

    @m80.k
    public final String r() {
        return this.f79634e;
    }

    @m80.k
    public String toString() {
        return "UserBookWordRecord(topicId=" + this.f79630a + ", userBookId=" + this.f79631b + ", bookId=" + this.f79632c + ", createdAt=" + this.f79633d + ", word=" + this.f79634e + ", mean=" + this.f79635f + ", audioUs=" + this.f79636g + ", audioUk=" + this.f79637h + ')';
    }
}
