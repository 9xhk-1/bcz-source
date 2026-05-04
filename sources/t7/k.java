package t7;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f89845a;

    /* renamed from: b, reason: collision with root package name */
    public final long f89846b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f89847c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f89848d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f89849e;

    public k(long j11, long j12, @m80.k String word, @m80.k String meanCn, @m80.k String accentUsaAudioUri) {
        g0.p(word, "word");
        g0.p(meanCn, "meanCn");
        g0.p(accentUsaAudioUri, "accentUsaAudioUri");
        this.f89845a = j11;
        this.f89846b = j12;
        this.f89847c = word;
        this.f89848d = meanCn;
        this.f89849e = accentUsaAudioUri;
    }

    public static /* synthetic */ k g(k kVar, long j11, long j12, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kVar.f89845a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = kVar.f89846b;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = kVar.f89847c;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = kVar.f89848d;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = kVar.f89849e;
        }
        return kVar.f(j13, j14, str4, str5, str3);
    }

    public final long a() {
        return this.f89845a;
    }

    public final long b() {
        return this.f89846b;
    }

    @m80.k
    public final String c() {
        return this.f89847c;
    }

    @m80.k
    public final String d() {
        return this.f89848d;
    }

    @m80.k
    public final String e() {
        return this.f89849e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f89845a == kVar.f89845a && this.f89846b == kVar.f89846b && g0.g(this.f89847c, kVar.f89847c) && g0.g(this.f89848d, kVar.f89848d) && g0.g(this.f89849e, kVar.f89849e);
    }

    @m80.k
    public final k f(long j11, long j12, @m80.k String word, @m80.k String meanCn, @m80.k String accentUsaAudioUri) {
        g0.p(word, "word");
        g0.p(meanCn, "meanCn");
        g0.p(accentUsaAudioUri, "accentUsaAudioUri");
        return new k(j11, j12, word, meanCn, accentUsaAudioUri);
    }

    @m80.k
    public final String h() {
        return this.f89849e;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f89845a) * 31) + Long.hashCode(this.f89846b)) * 31) + this.f89847c.hashCode()) * 31) + this.f89848d.hashCode()) * 31) + this.f89849e.hashCode();
    }

    public final long i() {
        return this.f89845a;
    }

    @m80.k
    public final String j() {
        return this.f89848d;
    }

    public final long k() {
        return this.f89846b;
    }

    @m80.k
    public final String l() {
        return this.f89847c;
    }

    @m80.k
    public String toString() {
        return "WordListResourceRecord(bookId=" + this.f89845a + ", topicId=" + this.f89846b + ", word=" + this.f89847c + ", meanCn=" + this.f89848d + ", accentUsaAudioUri=" + this.f89849e + ')';
    }
}
