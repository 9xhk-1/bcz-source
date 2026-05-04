package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65413b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n0[] f65414c;

    public l0(@m80.k String userBookId, int i11, @m80.k n0[] words) {
        kotlin.jvm.internal.g0.p(userBookId, "userBookId");
        kotlin.jvm.internal.g0.p(words, "words");
        this.f65412a = userBookId;
        this.f65413b = i11;
        this.f65414c = words;
    }

    public static /* synthetic */ l0 e(l0 l0Var, String str, int i11, n0[] n0VarArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = l0Var.f65412a;
        }
        if ((i12 & 2) != 0) {
            i11 = l0Var.f65413b;
        }
        if ((i12 & 4) != 0) {
            n0VarArr = l0Var.f65414c;
        }
        return l0Var.d(str, i11, n0VarArr);
    }

    @m80.k
    public final String a() {
        return this.f65412a;
    }

    public final int b() {
        return this.f65413b;
    }

    @m80.k
    public final n0[] c() {
        return this.f65414c;
    }

    @m80.k
    public final l0 d(@m80.k String userBookId, int i11, @m80.k n0[] words) {
        kotlin.jvm.internal.g0.p(userBookId, "userBookId");
        kotlin.jvm.internal.g0.p(words, "words");
        return new l0(userBookId, i11, words);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.g0.g(this.f65412a, l0Var.f65412a) && this.f65413b == l0Var.f65413b && Arrays.equals(this.f65414c, l0Var.f65414c);
    }

    public final int f() {
        return this.f65413b;
    }

    @m80.k
    public final String g() {
        return this.f65412a;
    }

    @m80.k
    public final n0[] h() {
        return this.f65414c;
    }

    public int hashCode() {
        return (((this.f65412a.hashCode() * 31) + this.f65413b) * 31) + Arrays.hashCode(this.f65414c);
    }

    @m80.k
    public String toString() {
        return "ExportReq(userBookId=" + this.f65412a + ", templateId=" + this.f65413b + ", words=" + Arrays.toString(this.f65414c) + ')';
    }
}
