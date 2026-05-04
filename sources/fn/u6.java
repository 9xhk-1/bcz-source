package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class u6 {

    /* renamed from: k, reason: collision with root package name */
    public static final u6 f52261k = a(50.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f52262a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52263b;

    /* renamed from: c, reason: collision with root package name */
    public final double f52264c;

    /* renamed from: d, reason: collision with root package name */
    public final double f52265d;

    /* renamed from: e, reason: collision with root package name */
    public final double f52266e;

    /* renamed from: f, reason: collision with root package name */
    public final double f52267f;

    /* renamed from: g, reason: collision with root package name */
    public final double[] f52268g;

    /* renamed from: h, reason: collision with root package name */
    public final double f52269h;

    /* renamed from: i, reason: collision with root package name */
    public final double f52270i;

    /* renamed from: j, reason: collision with root package name */
    public final double f52271j;

    public u6(double d11, double d12, double d13, double d14, double d15, double d16, double[] dArr, double d17, double d18, double d19) {
        this.f52267f = d11;
        this.f52262a = d12;
        this.f52263b = d13;
        this.f52264c = d14;
        this.f52265d = d15;
        this.f52266e = d16;
        this.f52268g = dArr;
        this.f52269h = d17;
        this.f52270i = d18;
        this.f52271j = d19;
    }

    public static u6 a(double d11) {
        return l(c.r(), (c.t(50.0d) * 63.66197723675813d) / 100.0d, d11, 2.0d, false);
    }

    public static u6 l(double[] dArr, double d11, double d12, double d13, boolean z11) {
        double d14;
        double exp;
        double max = Math.max(0.1d, d12);
        double[][] dArr2 = b.f52080k;
        double d15 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d16 = dArr3[0] * d15;
        double d17 = dArr[1];
        double d18 = d16 + (dArr3[1] * d17);
        double d19 = dArr[2];
        double d21 = d18 + (dArr3[2] * d19);
        double[] dArr4 = dArr2[1];
        double d22 = (dArr4[0] * d15) + (dArr4[1] * d17) + (dArr4[2] * d19);
        double[] dArr5 = dArr2[2];
        double d23 = (d15 * dArr5[0]) + (d17 * dArr5[1]) + (d19 * dArr5[2]);
        double d24 = (d13 / 10.0d) + 0.8d;
        double d25 = d24 >= 0.9d ? v5.d(0.59d, 0.69d, (d24 - 0.9d) * 10.0d) : v5.d(0.525d, 0.59d, (d24 - 0.8d) * 10.0d);
        if (z11) {
            d14 = 0.1d;
            exp = 1.0d;
        } else {
            d14 = 0.1d;
            exp = (1.0d - (Math.exp(((-d11) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d24;
        }
        double a11 = v5.a(0.0d, 1.0d, exp);
        double[] dArr6 = {(((100.0d / d21) * a11) + 1.0d) - a11, (((100.0d / d22) * a11) + 1.0d) - a11, (((100.0d / d23) * a11) + 1.0d) - a11};
        double d26 = 5.0d * d11;
        double d27 = 1.0d / (d26 + 1.0d);
        double d28 = d27 * d27 * d27 * d27;
        double d29 = 1.0d - d28;
        double cbrt = (d28 * d11) + (d29 * d14 * d29 * Math.cbrt(d26));
        double t11 = c.t(max) / dArr[1];
        double sqrt = Math.sqrt(t11) + 1.48d;
        double pow = 0.725d / Math.pow(t11, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d21) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d22) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d23) / 100.0d, 0.42d)};
        double d31 = dArr7[0];
        double d32 = (d31 * 400.0d) / (d31 + 27.13d);
        double d33 = dArr7[1];
        double d34 = (d33 * 400.0d) / (d33 + 27.13d);
        double d35 = dArr7[2];
        double[] dArr8 = {d32, d34, (400.0d * d35) / (d35 + 27.13d)};
        return new u6(t11, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * pow, pow, pow, d25, d24, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double b() {
        return this.f52262a;
    }

    public double c() {
        return this.f52265d;
    }

    public double d() {
        return this.f52269h;
    }

    public double e() {
        return this.f52270i;
    }

    public double f() {
        return this.f52267f;
    }

    public double g() {
        return this.f52263b;
    }

    public double h() {
        return this.f52266e;
    }

    public double i() {
        return this.f52264c;
    }

    public double[] j() {
        return this.f52268g;
    }

    public double k() {
        return this.f52271j;
    }
}
