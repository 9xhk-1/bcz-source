package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65299a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65300b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65301c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65302d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65303e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65304f;

    public f4(int i11, @m80.k String word, @m80.k String mean, @m80.k String phoneticUs, @m80.l String str, boolean z11) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(phoneticUs, "phoneticUs");
        this.f65299a = i11;
        this.f65300b = word;
        this.f65301c = mean;
        this.f65302d = phoneticUs;
        this.f65303e = str;
        this.f65304f = z11;
    }

    public static /* synthetic */ f4 h(f4 f4Var, int i11, String str, String str2, String str3, String str4, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = f4Var.f65299a;
        }
        if ((i12 & 2) != 0) {
            str = f4Var.f65300b;
        }
        if ((i12 & 4) != 0) {
            str2 = f4Var.f65301c;
        }
        if ((i12 & 8) != 0) {
            str3 = f4Var.f65302d;
        }
        if ((i12 & 16) != 0) {
            str4 = f4Var.f65303e;
        }
        if ((i12 & 32) != 0) {
            z11 = f4Var.f65304f;
        }
        String str5 = str4;
        boolean z12 = z11;
        return f4Var.g(i11, str, str2, str3, str5, z12);
    }

    public final int a() {
        return this.f65299a;
    }

    @m80.k
    public final String b() {
        return this.f65300b;
    }

    @m80.k
    public final String c() {
        return this.f65301c;
    }

    @m80.k
    public final String d() {
        return this.f65302d;
    }

    @m80.l
    public final String e() {
        return this.f65303e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return this.f65299a == f4Var.f65299a && kotlin.jvm.internal.g0.g(this.f65300b, f4Var.f65300b) && kotlin.jvm.internal.g0.g(this.f65301c, f4Var.f65301c) && kotlin.jvm.internal.g0.g(this.f65302d, f4Var.f65302d) && kotlin.jvm.internal.g0.g(this.f65303e, f4Var.f65303e) && this.f65304f == f4Var.f65304f;
    }

    public final boolean f() {
        return this.f65304f;
    }

    @m80.k
    public final f4 g(int i11, @m80.k String word, @m80.k String mean, @m80.k String phoneticUs, @m80.l String str, boolean z11) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(phoneticUs, "phoneticUs");
        return new f4(i11, word, mean, phoneticUs, str, z11);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f65299a) * 31) + this.f65300b.hashCode()) * 31) + this.f65301c.hashCode()) * 31) + this.f65302d.hashCode()) * 31;
        String str = this.f65303e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f65304f);
    }

    @m80.l
    public final String i() {
        return this.f65303e;
    }

    @m80.k
    public final String j() {
        return this.f65301c;
    }

    @m80.k
    public final String k() {
        return this.f65302d;
    }

    public final int l() {
        return this.f65299a;
    }

    @m80.k
    public final String m() {
        return this.f65300b;
    }

    public final boolean n() {
        return this.f65304f;
    }

    @m80.k
    public String toString() {
        return "WordBrief(topicId=" + this.f65299a + ", word=" + this.f65300b + ", mean=" + this.f65301c + ", phoneticUs=" + this.f65302d + ", audioUsUrl=" + this.f65303e + ", isCollected=" + this.f65304f + ')';
    }
}
