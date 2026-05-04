package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public double f52203a;

    /* renamed from: b, reason: collision with root package name */
    public double f52204b;

    /* renamed from: c, reason: collision with root package name */
    public double f52205c;

    /* renamed from: d, reason: collision with root package name */
    public int f52206d;

    public l(int i11) {
        i(i11);
    }

    public static l a(double d11, double d12, double d13) {
        return new l(m.r(d11, d12, d13));
    }

    public static l b(int i11) {
        return new l(i11);
    }

    public double c() {
        return this.f52204b;
    }

    public double d() {
        return this.f52203a;
    }

    public double e() {
        return this.f52205c;
    }

    public l f(u6 u6Var) {
        double[] t11 = b.b(k()).t(u6Var, null);
        b h11 = b.h(t11[0], t11[1], t11[2], u6.f52261k);
        return a(h11.l(), h11.k(), c.p(t11[1]));
    }

    public void g(double d11) {
        i(m.r(this.f52203a, d11, this.f52205c));
    }

    public void h(double d11) {
        i(m.r(d11, this.f52204b, this.f52205c));
    }

    public final void i(int i11) {
        this.f52206d = i11;
        b b11 = b.b(i11);
        this.f52203a = b11.l();
        this.f52204b = b11.k();
        this.f52205c = c.o(i11);
    }

    public void j(double d11) {
        i(m.r(this.f52203a, this.f52204b, d11));
    }

    public int k() {
        return this.f52206d;
    }
}
