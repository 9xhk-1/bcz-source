package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65391a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65392b;

    public j4(int i11, @m80.k String word) {
        kotlin.jvm.internal.g0.p(word, "word");
        this.f65391a = i11;
        this.f65392b = word;
    }

    public static /* synthetic */ j4 d(j4 j4Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = j4Var.f65391a;
        }
        if ((i12 & 2) != 0) {
            str = j4Var.f65392b;
        }
        return j4Var.c(i11, str);
    }

    public final int a() {
        return this.f65391a;
    }

    @m80.k
    public final String b() {
        return this.f65392b;
    }

    @m80.k
    public final j4 c(int i11, @m80.k String word) {
        kotlin.jvm.internal.g0.p(word, "word");
        return new j4(i11, word);
    }

    public final int e() {
        return this.f65391a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.f65391a == j4Var.f65391a && kotlin.jvm.internal.g0.g(this.f65392b, j4Var.f65392b);
    }

    @m80.k
    public final String f() {
        return this.f65392b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f65391a) * 31) + this.f65392b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordItem(topicId=" + this.f65391a + ", word=" + this.f65392b + ')';
    }
}
