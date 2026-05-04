package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65231a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65232b;

    /* renamed from: c, reason: collision with root package name */
    public final double f65233c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65234d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final s2[] f65235e;

    public b2(@m80.k String type, @m80.k String meaning, double d11, int i11, @m80.k s2[] example) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        kotlin.jvm.internal.g0.p(example, "example");
        this.f65231a = type;
        this.f65232b = meaning;
        this.f65233c = d11;
        this.f65234d = i11;
        this.f65235e = example;
    }

    public static /* synthetic */ b2 g(b2 b2Var, String str, String str2, double d11, int i11, s2[] s2VarArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = b2Var.f65231a;
        }
        if ((i12 & 2) != 0) {
            str2 = b2Var.f65232b;
        }
        if ((i12 & 4) != 0) {
            d11 = b2Var.f65233c;
        }
        if ((i12 & 8) != 0) {
            i11 = b2Var.f65234d;
        }
        if ((i12 & 16) != 0) {
            s2VarArr = b2Var.f65235e;
        }
        double d12 = d11;
        return b2Var.f(str, str2, d12, i11, s2VarArr);
    }

    @m80.k
    public final String a() {
        return this.f65231a;
    }

    @m80.k
    public final String b() {
        return this.f65232b;
    }

    public final double c() {
        return this.f65233c;
    }

    public final int d() {
        return this.f65234d;
    }

    @m80.k
    public final s2[] e() {
        return this.f65235e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return kotlin.jvm.internal.g0.g(this.f65231a, b2Var.f65231a) && kotlin.jvm.internal.g0.g(this.f65232b, b2Var.f65232b) && this.f65233c == b2Var.f65233c && this.f65234d == b2Var.f65234d && Arrays.equals(this.f65235e, b2Var.f65235e);
    }

    @m80.k
    public final b2 f(@m80.k String type, @m80.k String meaning, double d11, int i11, @m80.k s2[] example) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        kotlin.jvm.internal.g0.p(example, "example");
        return new b2(type, meaning, d11, i11, example);
    }

    @m80.k
    public final s2[] h() {
        return this.f65235e;
    }

    public int hashCode() {
        return (((((((this.f65231a.hashCode() * 31) + this.f65232b.hashCode()) * 31) + Double.hashCode(this.f65233c)) * 31) + this.f65234d) * 31) + Arrays.hashCode(this.f65235e);
    }

    public final double i() {
        return this.f65233c;
    }

    @m80.k
    public final String j() {
        return this.f65232b;
    }

    public final int k() {
        return this.f65234d;
    }

    @m80.k
    public final String l() {
        return this.f65231a;
    }

    @m80.k
    public String toString() {
        return "ParaphraseItem(type=" + this.f65231a + ", meaning=" + this.f65232b + ", id=" + this.f65233c + ", sortingId=" + this.f65234d + ", example=" + Arrays.toString(this.f65235e) + ')';
    }

    public /* synthetic */ b2(String str, String str2, double d11, int i11, s2[] s2VarArr, int i12, kotlin.jvm.internal.v vVar) {
        this(str, str2, d11, (i12 & 8) != 0 ? 0 : i11, s2VarArr);
    }
}
