package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65590b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65591c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65592d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65593e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65594f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65595g;

    public r3(int i11, int i12, @m80.k String word, @m80.k String meaning, @m80.l String str, @m80.l String str2, int i13) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        this.f65589a = i11;
        this.f65590b = i12;
        this.f65591c = word;
        this.f65592d = meaning;
        this.f65593e = str;
        this.f65594f = str2;
        this.f65595g = i13;
    }

    public static /* synthetic */ r3 i(r3 r3Var, int i11, int i12, String str, String str2, String str3, String str4, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = r3Var.f65589a;
        }
        if ((i14 & 2) != 0) {
            i12 = r3Var.f65590b;
        }
        if ((i14 & 4) != 0) {
            str = r3Var.f65591c;
        }
        if ((i14 & 8) != 0) {
            str2 = r3Var.f65592d;
        }
        if ((i14 & 16) != 0) {
            str3 = r3Var.f65593e;
        }
        if ((i14 & 32) != 0) {
            str4 = r3Var.f65594f;
        }
        if ((i14 & 64) != 0) {
            i13 = r3Var.f65595g;
        }
        String str5 = str4;
        int i15 = i13;
        String str6 = str3;
        String str7 = str;
        return r3Var.h(i11, i12, str7, str2, str6, str5, i15);
    }

    public final int a() {
        return this.f65589a;
    }

    public final int b() {
        return this.f65590b;
    }

    @m80.k
    public final String c() {
        return this.f65591c;
    }

    @m80.k
    public final String d() {
        return this.f65592d;
    }

    @m80.l
    public final String e() {
        return this.f65593e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return this.f65589a == r3Var.f65589a && this.f65590b == r3Var.f65590b && kotlin.jvm.internal.g0.g(this.f65591c, r3Var.f65591c) && kotlin.jvm.internal.g0.g(this.f65592d, r3Var.f65592d) && kotlin.jvm.internal.g0.g(this.f65593e, r3Var.f65593e) && kotlin.jvm.internal.g0.g(this.f65594f, r3Var.f65594f) && this.f65595g == r3Var.f65595g;
    }

    @m80.l
    public final String f() {
        return this.f65594f;
    }

    public final int g() {
        return this.f65595g;
    }

    @m80.k
    public final r3 h(int i11, int i12, @m80.k String word, @m80.k String meaning, @m80.l String str, @m80.l String str2, int i13) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        return new r3(i11, i12, word, meaning, str, str2, i13);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f65589a) * 31) + Integer.hashCode(this.f65590b)) * 31) + this.f65591c.hashCode()) * 31) + this.f65592d.hashCode()) * 31;
        String str = this.f65593e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65594f;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f65595g);
    }

    @m80.l
    public final String j() {
        return this.f65594f;
    }

    @m80.l
    public final String k() {
        return this.f65593e;
    }

    public final int l() {
        return this.f65590b;
    }

    public final int m() {
        return this.f65595g;
    }

    @m80.k
    public final String n() {
        return this.f65592d;
    }

    public final int o() {
        return this.f65589a;
    }

    @m80.k
    public final String p() {
        return this.f65591c;
    }

    @m80.k
    public String toString() {
        return "UserBookWordModel(topicId=" + this.f65589a + ", bookId=" + this.f65590b + ", word=" + this.f65591c + ", meaning=" + this.f65592d + ", audioUS=" + this.f65593e + ", audioUK=" + this.f65594f + ", createAt=" + this.f65595g + ')';
    }
}
