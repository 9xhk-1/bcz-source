package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final double f65251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65252b;

    /* renamed from: c, reason: collision with root package name */
    public final double f65253c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65254d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f65255e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65256f;

    public c2(double d11, int i11, double d12, @m80.k String shortPhrase, @m80.k String shortPhraseTrans, int i12) {
        kotlin.jvm.internal.g0.p(shortPhrase, "shortPhrase");
        kotlin.jvm.internal.g0.p(shortPhraseTrans, "shortPhraseTrans");
        this.f65251a = d11;
        this.f65252b = i11;
        this.f65253c = d12;
        this.f65254d = shortPhrase;
        this.f65255e = shortPhraseTrans;
        this.f65256f = i12;
    }

    public static /* synthetic */ c2 h(c2 c2Var, double d11, int i11, double d12, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d11 = c2Var.f65251a;
        }
        double d13 = d11;
        if ((i13 & 2) != 0) {
            i11 = c2Var.f65252b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            d12 = c2Var.f65253c;
        }
        double d14 = d12;
        if ((i13 & 8) != 0) {
            str = c2Var.f65254d;
        }
        return c2Var.g(d13, i14, d14, str, (i13 & 16) != 0 ? c2Var.f65255e : str2, (i13 & 32) != 0 ? c2Var.f65256f : i12);
    }

    public final double a() {
        return this.f65251a;
    }

    public final int b() {
        return this.f65252b;
    }

    public final double c() {
        return this.f65253c;
    }

    @m80.k
    public final String d() {
        return this.f65254d;
    }

    @m80.k
    public final String e() {
        return this.f65255e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Double.compare(this.f65251a, c2Var.f65251a) == 0 && this.f65252b == c2Var.f65252b && Double.compare(this.f65253c, c2Var.f65253c) == 0 && kotlin.jvm.internal.g0.g(this.f65254d, c2Var.f65254d) && kotlin.jvm.internal.g0.g(this.f65255e, c2Var.f65255e) && this.f65256f == c2Var.f65256f;
    }

    public final int f() {
        return this.f65256f;
    }

    @m80.k
    public final c2 g(double d11, int i11, double d12, @m80.k String shortPhrase, @m80.k String shortPhraseTrans, int i12) {
        kotlin.jvm.internal.g0.p(shortPhrase, "shortPhrase");
        kotlin.jvm.internal.g0.p(shortPhraseTrans, "shortPhraseTrans");
        return new c2(d11, i11, d12, shortPhrase, shortPhraseTrans, i12);
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f65251a) * 31) + Integer.hashCode(this.f65252b)) * 31) + Double.hashCode(this.f65253c)) * 31) + this.f65254d.hashCode()) * 31) + this.f65255e.hashCode()) * 31) + Integer.hashCode(this.f65256f);
    }

    public final double i() {
        return this.f65253c;
    }

    public final double j() {
        return this.f65251a;
    }

    @m80.k
    public final String k() {
        return this.f65254d;
    }

    public final int l() {
        return this.f65256f;
    }

    @m80.k
    public final String m() {
        return this.f65255e;
    }

    public final int n() {
        return this.f65252b;
    }

    @m80.k
    public String toString() {
        return "PhraseItem(id=" + this.f65251a + ", topicId=" + this.f65252b + ", chnMeanId=" + this.f65253c + ", shortPhrase=" + this.f65254d + ", shortPhraseTrans=" + this.f65255e + ", shortPhraseTopicId=" + this.f65256f + ')';
    }

    public /* synthetic */ c2(double d11, int i11, double d12, String str, String str2, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(d11, i11, d12, str, str2, (i13 & 32) != 0 ? 0 : i12);
    }
}
