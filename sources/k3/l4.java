package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65422a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65423b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65424c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65425d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65426e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65427f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65428g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65429h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f65430i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65431j;

    public l4(int i11, @m80.k String word, @m80.k String mean, @m80.k String audioUsUrl, int i12, int i13, boolean z11, int i14, boolean z12, int i15) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(audioUsUrl, "audioUsUrl");
        this.f65422a = i11;
        this.f65423b = word;
        this.f65424c = mean;
        this.f65425d = audioUsUrl;
        this.f65426e = i12;
        this.f65427f = i13;
        this.f65428g = z11;
        this.f65429h = i14;
        this.f65430i = z12;
        this.f65431j = i15;
    }

    public static /* synthetic */ l4 l(l4 l4Var, int i11, String str, String str2, String str3, int i12, int i13, boolean z11, int i14, boolean z12, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = l4Var.f65422a;
        }
        if ((i16 & 2) != 0) {
            str = l4Var.f65423b;
        }
        if ((i16 & 4) != 0) {
            str2 = l4Var.f65424c;
        }
        if ((i16 & 8) != 0) {
            str3 = l4Var.f65425d;
        }
        if ((i16 & 16) != 0) {
            i12 = l4Var.f65426e;
        }
        if ((i16 & 32) != 0) {
            i13 = l4Var.f65427f;
        }
        if ((i16 & 64) != 0) {
            z11 = l4Var.f65428g;
        }
        if ((i16 & 128) != 0) {
            i14 = l4Var.f65429h;
        }
        if ((i16 & 256) != 0) {
            z12 = l4Var.f65430i;
        }
        if ((i16 & 512) != 0) {
            i15 = l4Var.f65431j;
        }
        boolean z13 = z12;
        int i17 = i15;
        boolean z14 = z11;
        int i18 = i14;
        int i19 = i12;
        int i21 = i13;
        return l4Var.k(i11, str, str2, str3, i19, i21, z14, i18, z13, i17);
    }

    public final int a() {
        return this.f65422a;
    }

    public final int b() {
        return this.f65431j;
    }

    @m80.k
    public final String c() {
        return this.f65423b;
    }

    @m80.k
    public final String d() {
        return this.f65424c;
    }

    @m80.k
    public final String e() {
        return this.f65425d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f65422a == l4Var.f65422a && kotlin.jvm.internal.g0.g(this.f65423b, l4Var.f65423b) && kotlin.jvm.internal.g0.g(this.f65424c, l4Var.f65424c) && kotlin.jvm.internal.g0.g(this.f65425d, l4Var.f65425d) && this.f65426e == l4Var.f65426e && this.f65427f == l4Var.f65427f && this.f65428g == l4Var.f65428g && this.f65429h == l4Var.f65429h && this.f65430i == l4Var.f65430i && this.f65431j == l4Var.f65431j;
    }

    public final int f() {
        return this.f65426e;
    }

    public final int g() {
        return this.f65427f;
    }

    public final boolean h() {
        return this.f65428g;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f65422a) * 31) + this.f65423b.hashCode()) * 31) + this.f65424c.hashCode()) * 31) + this.f65425d.hashCode()) * 31) + Integer.hashCode(this.f65426e)) * 31) + Integer.hashCode(this.f65427f)) * 31) + Boolean.hashCode(this.f65428g)) * 31) + Integer.hashCode(this.f65429h)) * 31) + Boolean.hashCode(this.f65430i)) * 31) + Integer.hashCode(this.f65431j);
    }

    public final int i() {
        return this.f65429h;
    }

    public final boolean j() {
        return this.f65430i;
    }

    @m80.k
    public final l4 k(int i11, @m80.k String word, @m80.k String mean, @m80.k String audioUsUrl, int i12, int i13, boolean z11, int i14, boolean z12, int i15) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(audioUsUrl, "audioUsUrl");
        return new l4(i11, word, mean, audioUsUrl, i12, i13, z11, i14, z12, i15);
    }

    @m80.k
    public final String m() {
        return this.f65425d;
    }

    public final int n() {
        return this.f65426e;
    }

    @m80.k
    public final String o() {
        return this.f65424c;
    }

    public final int p() {
        return this.f65427f;
    }

    public final int q() {
        return this.f65429h;
    }

    public final int r() {
        return this.f65431j;
    }

    public final int s() {
        return this.f65422a;
    }

    @m80.k
    public final String t() {
        return this.f65423b;
    }

    @m80.k
    public String toString() {
        return "WordListWordModel(topicId=" + this.f65422a + ", word=" + this.f65423b + ", mean=" + this.f65424c + ", audioUsUrl=" + this.f65425d + ", mastered=" + this.f65426e + ", modifyTime=" + this.f65427f + ", isKilled=" + this.f65428g + ", nextReviewDay=" + this.f65429h + ", isCollected=" + this.f65430i + ", status=" + this.f65431j + ')';
    }

    public final boolean u() {
        return this.f65430i;
    }

    public final boolean v() {
        return this.f65428g;
    }
}
