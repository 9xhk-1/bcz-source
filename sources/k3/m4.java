package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65450b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65451c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65453e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65454f;

    public m4(int i11, int i12, @m80.k String word, @m80.k String meaning, int i13, @m80.l String str) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        this.f65449a = i11;
        this.f65450b = i12;
        this.f65451c = word;
        this.f65452d = meaning;
        this.f65453e = i13;
        this.f65454f = str;
    }

    public static /* synthetic */ m4 h(m4 m4Var, int i11, int i12, String str, String str2, int i13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = m4Var.f65449a;
        }
        if ((i14 & 2) != 0) {
            i12 = m4Var.f65450b;
        }
        if ((i14 & 4) != 0) {
            str = m4Var.f65451c;
        }
        if ((i14 & 8) != 0) {
            str2 = m4Var.f65452d;
        }
        if ((i14 & 16) != 0) {
            i13 = m4Var.f65453e;
        }
        if ((i14 & 32) != 0) {
            str3 = m4Var.f65454f;
        }
        int i15 = i13;
        String str4 = str3;
        return m4Var.g(i11, i12, str, str2, i15, str4);
    }

    public final int a() {
        return this.f65449a;
    }

    public final int b() {
        return this.f65450b;
    }

    @m80.k
    public final String c() {
        return this.f65451c;
    }

    @m80.k
    public final String d() {
        return this.f65452d;
    }

    public final int e() {
        return this.f65453e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return this.f65449a == m4Var.f65449a && this.f65450b == m4Var.f65450b && kotlin.jvm.internal.g0.g(this.f65451c, m4Var.f65451c) && kotlin.jvm.internal.g0.g(this.f65452d, m4Var.f65452d) && this.f65453e == m4Var.f65453e && kotlin.jvm.internal.g0.g(this.f65454f, m4Var.f65454f);
    }

    @m80.l
    public final String f() {
        return this.f65454f;
    }

    @m80.k
    public final m4 g(int i11, int i12, @m80.k String word, @m80.k String meaning, int i13, @m80.l String str) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        return new m4(i11, i12, word, meaning, i13, str);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f65449a) * 31) + Integer.hashCode(this.f65450b)) * 31) + this.f65451c.hashCode()) * 31) + this.f65452d.hashCode()) * 31) + Integer.hashCode(this.f65453e)) * 31;
        String str = this.f65454f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.l
    public final String i() {
        return this.f65454f;
    }

    public final int j() {
        return this.f65450b;
    }

    public final int k() {
        return this.f65453e;
    }

    @m80.k
    public final String l() {
        return this.f65452d;
    }

    public final int m() {
        return this.f65449a;
    }

    @m80.k
    public final String n() {
        return this.f65451c;
    }

    @m80.k
    public String toString() {
        return "WordSummaryModel(topicId=" + this.f65449a + ", bookId=" + this.f65450b + ", word=" + this.f65451c + ", meaning=" + this.f65452d + ", createAt=" + this.f65453e + ", audioUrl=" + this.f65454f + ')';
    }
}
