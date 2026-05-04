package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65596a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65597b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65598c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f65599d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65600e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65601f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f65602g;

    /* renamed from: h, reason: collision with root package name */
    public int f65603h;

    public s2(int i11, @m80.k String word, @m80.k String sentence, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(sentence, "sentence");
        this.f65596a = i11;
        this.f65597b = word;
        this.f65598c = sentence;
        this.f65599d = str;
        this.f65600e = str2;
        this.f65601f = str3;
        this.f65602g = str4;
        this.f65603h = i12;
    }

    public static /* synthetic */ s2 j(s2 s2Var, int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = s2Var.f65596a;
        }
        if ((i13 & 2) != 0) {
            str = s2Var.f65597b;
        }
        if ((i13 & 4) != 0) {
            str2 = s2Var.f65598c;
        }
        if ((i13 & 8) != 0) {
            str3 = s2Var.f65599d;
        }
        if ((i13 & 16) != 0) {
            str4 = s2Var.f65600e;
        }
        if ((i13 & 32) != 0) {
            str5 = s2Var.f65601f;
        }
        if ((i13 & 64) != 0) {
            str6 = s2Var.f65602g;
        }
        if ((i13 & 128) != 0) {
            i12 = s2Var.f65603h;
        }
        String str7 = str6;
        int i14 = i12;
        String str8 = str4;
        String str9 = str5;
        return s2Var.i(i11, str, str2, str3, str8, str9, str7, i14);
    }

    public final int a() {
        return this.f65596a;
    }

    @m80.k
    public final String b() {
        return this.f65597b;
    }

    @m80.k
    public final String c() {
        return this.f65598c;
    }

    @m80.l
    public final String d() {
        return this.f65599d;
    }

    @m80.l
    public final String e() {
        return this.f65600e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return this.f65596a == s2Var.f65596a && kotlin.jvm.internal.g0.g(this.f65597b, s2Var.f65597b) && kotlin.jvm.internal.g0.g(this.f65598c, s2Var.f65598c) && kotlin.jvm.internal.g0.g(this.f65599d, s2Var.f65599d) && kotlin.jvm.internal.g0.g(this.f65600e, s2Var.f65600e) && kotlin.jvm.internal.g0.g(this.f65601f, s2Var.f65601f) && kotlin.jvm.internal.g0.g(this.f65602g, s2Var.f65602g) && this.f65603h == s2Var.f65603h;
    }

    @m80.l
    public final String f() {
        return this.f65601f;
    }

    @m80.l
    public final String g() {
        return this.f65602g;
    }

    public final int h() {
        return this.f65603h;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f65596a) * 31) + this.f65597b.hashCode()) * 31) + this.f65598c.hashCode()) * 31;
        String str = this.f65599d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65600e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65601f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65602g;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.f65603h);
    }

    @m80.k
    public final s2 i(int i11, @m80.k String word, @m80.k String sentence, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(sentence, "sentence");
        return new s2(i11, word, sentence, str, str2, str3, str4, i12);
    }

    @m80.l
    public final String k() {
        return this.f65602g;
    }

    public final int l() {
        return this.f65603h;
    }

    @m80.l
    public final String m() {
        return this.f65600e;
    }

    @m80.k
    public final String n() {
        return this.f65598c;
    }

    @m80.l
    public final String o() {
        return this.f65599d;
    }

    @m80.l
    public final String p() {
        return this.f65601f;
    }

    @m80.k
    public final String q() {
        return this.f65597b;
    }

    public final int r() {
        return this.f65596a;
    }

    public final void s(int i11) {
        this.f65603h = i11;
    }

    @m80.k
    public String toString() {
        return "Sentence(wordTopicId=" + this.f65596a + ", word=" + this.f65597b + ", sentence=" + this.f65598c + ", translation=" + this.f65599d + ", phrase=" + this.f65600e + ", voice=" + this.f65601f + ", imageUrl=" + this.f65602g + ", number=" + this.f65603h + ')';
    }

    public /* synthetic */ s2(int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, str, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? 0 : i12);
    }
}
