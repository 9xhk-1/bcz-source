package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65403a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65407e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65408f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65409g;

    public k3(@m80.k String bookName, @m80.k String bookImg, int i11, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        this.f65403a = bookName;
        this.f65404b = bookImg;
        this.f65405c = i11;
        this.f65406d = i12;
        this.f65407e = i13;
        this.f65408f = i14;
        this.f65409g = z11;
    }

    public static /* synthetic */ k3 i(k3 k3Var, String str, String str2, int i11, int i12, int i13, int i14, boolean z11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = k3Var.f65403a;
        }
        if ((i15 & 2) != 0) {
            str2 = k3Var.f65404b;
        }
        if ((i15 & 4) != 0) {
            i11 = k3Var.f65405c;
        }
        if ((i15 & 8) != 0) {
            i12 = k3Var.f65406d;
        }
        if ((i15 & 16) != 0) {
            i13 = k3Var.f65407e;
        }
        if ((i15 & 32) != 0) {
            i14 = k3Var.f65408f;
        }
        if ((i15 & 64) != 0) {
            z11 = k3Var.f65409g;
        }
        int i16 = i14;
        boolean z12 = z11;
        int i17 = i13;
        int i18 = i11;
        return k3Var.h(str, str2, i18, i12, i17, i16, z12);
    }

    @m80.k
    public final String a() {
        return this.f65403a;
    }

    @m80.k
    public final String b() {
        return this.f65404b;
    }

    public final int c() {
        return this.f65405c;
    }

    public final int d() {
        return this.f65406d;
    }

    public final int e() {
        return this.f65407e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return kotlin.jvm.internal.g0.g(this.f65403a, k3Var.f65403a) && kotlin.jvm.internal.g0.g(this.f65404b, k3Var.f65404b) && this.f65405c == k3Var.f65405c && this.f65406d == k3Var.f65406d && this.f65407e == k3Var.f65407e && this.f65408f == k3Var.f65408f && this.f65409g == k3Var.f65409g;
    }

    public final int f() {
        return this.f65408f;
    }

    public final boolean g() {
        return this.f65409g;
    }

    @m80.k
    public final k3 h(@m80.k String bookName, @m80.k String bookImg, int i11, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        return new k3(bookName, bookImg, i11, i12, i13, i14, z11);
    }

    public int hashCode() {
        return (((((((((((this.f65403a.hashCode() * 31) + this.f65404b.hashCode()) * 31) + Integer.hashCode(this.f65405c)) * 31) + Integer.hashCode(this.f65406d)) * 31) + Integer.hashCode(this.f65407e)) * 31) + Integer.hashCode(this.f65408f)) * 31) + Boolean.hashCode(this.f65409g);
    }

    public final int j() {
        return this.f65405c;
    }

    @m80.k
    public final String k() {
        return this.f65404b;
    }

    @m80.k
    public final String l() {
        return this.f65403a;
    }

    public final int m() {
        return this.f65406d;
    }

    public final int n() {
        return this.f65407e;
    }

    public final boolean o() {
        return this.f65409g;
    }

    public final int p() {
        return this.f65408f;
    }

    @m80.k
    public String toString() {
        return "UIBookModel(bookName=" + this.f65403a + ", bookImg=" + this.f65404b + ", bookId=" + this.f65405c + ", learningCount=" + this.f65406d + ", masteredWordCount=" + this.f65407e + ", totalCount=" + this.f65408f + ", needUpgrade=" + this.f65409g + ')';
    }
}
