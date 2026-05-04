package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f60640f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f60641a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60642b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f60643c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f60644d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f60645e;

    public e0(int i11, int i12, @m80.k String word, @m80.k String meaning, @m80.l String str) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        this.f60641a = i11;
        this.f60642b = i12;
        this.f60643c = word;
        this.f60644d = meaning;
        this.f60645e = str;
    }

    public static /* synthetic */ e0 g(e0 e0Var, int i11, int i12, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = e0Var.f60641a;
        }
        if ((i13 & 2) != 0) {
            i12 = e0Var.f60642b;
        }
        if ((i13 & 4) != 0) {
            str = e0Var.f60643c;
        }
        if ((i13 & 8) != 0) {
            str2 = e0Var.f60644d;
        }
        if ((i13 & 16) != 0) {
            str3 = e0Var.f60645e;
        }
        String str4 = str3;
        String str5 = str;
        return e0Var.f(i11, i12, str5, str2, str4);
    }

    public final int a() {
        return this.f60641a;
    }

    public final int b() {
        return this.f60642b;
    }

    @m80.k
    public final String c() {
        return this.f60643c;
    }

    @m80.k
    public final String d() {
        return this.f60644d;
    }

    @m80.l
    public final String e() {
        return this.f60645e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f60641a == e0Var.f60641a && this.f60642b == e0Var.f60642b && g0.g(this.f60643c, e0Var.f60643c) && g0.g(this.f60644d, e0Var.f60644d) && g0.g(this.f60645e, e0Var.f60645e);
    }

    @m80.k
    public final e0 f(int i11, int i12, @m80.k String word, @m80.k String meaning, @m80.l String str) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        return new e0(i11, i12, word, meaning, str);
    }

    @m80.l
    public final String h() {
        return this.f60645e;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f60641a) * 31) + Integer.hashCode(this.f60642b)) * 31) + this.f60643c.hashCode()) * 31) + this.f60644d.hashCode()) * 31;
        String str = this.f60645e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final int i() {
        return this.f60642b;
    }

    @m80.k
    public final String j() {
        return this.f60644d;
    }

    public final int k() {
        return this.f60641a;
    }

    @m80.k
    public final String l() {
        return this.f60643c;
    }

    @m80.k
    public String toString() {
        return "WordFavoriteWrapped(topicId=" + this.f60641a + ", bookId=" + this.f60642b + ", word=" + this.f60643c + ", meaning=" + this.f60644d + ", accent=" + this.f60645e + pn.j.f81007d;
    }
}
