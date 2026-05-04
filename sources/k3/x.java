package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f65689a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65690b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65691c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65692d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f65693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65694f;

    public x(int i11, @m80.k String word, @m80.k String mean, @m80.k String accent, @m80.k String audioUri, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(accent, "accent");
        kotlin.jvm.internal.g0.p(audioUri, "audioUri");
        this.f65689a = i11;
        this.f65690b = word;
        this.f65691c = mean;
        this.f65692d = accent;
        this.f65693e = audioUri;
        this.f65694f = i12;
    }

    public static /* synthetic */ x h(x xVar, int i11, String str, String str2, String str3, String str4, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = xVar.f65689a;
        }
        if ((i13 & 2) != 0) {
            str = xVar.f65690b;
        }
        if ((i13 & 4) != 0) {
            str2 = xVar.f65691c;
        }
        if ((i13 & 8) != 0) {
            str3 = xVar.f65692d;
        }
        if ((i13 & 16) != 0) {
            str4 = xVar.f65693e;
        }
        if ((i13 & 32) != 0) {
            i12 = xVar.f65694f;
        }
        String str5 = str4;
        int i14 = i12;
        return xVar.g(i11, str, str2, str3, str5, i14);
    }

    public final int a() {
        return this.f65689a;
    }

    @m80.k
    public final String b() {
        return this.f65690b;
    }

    @m80.k
    public final String c() {
        return this.f65691c;
    }

    @m80.k
    public final String d() {
        return this.f65692d;
    }

    @m80.k
    public final String e() {
        return this.f65693e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f65689a == xVar.f65689a && kotlin.jvm.internal.g0.g(this.f65690b, xVar.f65690b) && kotlin.jvm.internal.g0.g(this.f65691c, xVar.f65691c) && kotlin.jvm.internal.g0.g(this.f65692d, xVar.f65692d) && kotlin.jvm.internal.g0.g(this.f65693e, xVar.f65693e) && this.f65694f == xVar.f65694f;
    }

    public final int f() {
        return this.f65694f;
    }

    @m80.k
    public final x g(int i11, @m80.k String word, @m80.k String mean, @m80.k String accent, @m80.k String audioUri, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(accent, "accent");
        kotlin.jvm.internal.g0.p(audioUri, "audioUri");
        return new x(i11, word, mean, accent, audioUri, i12);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f65689a) * 31) + this.f65690b.hashCode()) * 31) + this.f65691c.hashCode()) * 31) + this.f65692d.hashCode()) * 31) + this.f65693e.hashCode()) * 31) + Integer.hashCode(this.f65694f);
    }

    @m80.k
    public final String i() {
        return this.f65692d;
    }

    @m80.k
    public final String j() {
        return this.f65693e;
    }

    @m80.k
    public final String k() {
        return this.f65691c;
    }

    public final int l() {
        return this.f65689a;
    }

    @m80.k
    public final String m() {
        return this.f65690b;
    }

    public final int n() {
        return this.f65694f;
    }

    @m80.k
    public String toString() {
        return "CalendarDailyWord(topicId=" + this.f65689a + ", word=" + this.f65690b + ", mean=" + this.f65691c + ", accent=" + this.f65692d + ", audioUri=" + this.f65693e + ", wordLevelId=" + this.f65694f + ')';
    }
}
