package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65372a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65373b;

    public i4(@m80.k String type, @m80.k String word) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(word, "word");
        this.f65372a = type;
        this.f65373b = word;
    }

    public static /* synthetic */ i4 d(i4 i4Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = i4Var.f65372a;
        }
        if ((i11 & 2) != 0) {
            str2 = i4Var.f65373b;
        }
        return i4Var.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f65372a;
    }

    @m80.k
    public final String b() {
        return this.f65373b;
    }

    @m80.k
    public final i4 c(@m80.k String type, @m80.k String word) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(word, "word");
        return new i4(type, word);
    }

    @m80.k
    public final String e() {
        return this.f65372a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return kotlin.jvm.internal.g0.g(this.f65372a, i4Var.f65372a) && kotlin.jvm.internal.g0.g(this.f65373b, i4Var.f65373b);
    }

    @m80.k
    public final String f() {
        return this.f65373b;
    }

    public int hashCode() {
        return (this.f65372a.hashCode() * 31) + this.f65373b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordDeform(type=" + this.f65372a + ", word=" + this.f65373b + ')';
    }
}
