package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final double[][] f52080k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* renamed from: l, reason: collision with root package name */
    public static final double[][] f52081l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* renamed from: a, reason: collision with root package name */
    public final double f52082a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52083b;

    /* renamed from: c, reason: collision with root package name */
    public final double f52084c;

    /* renamed from: d, reason: collision with root package name */
    public final double f52085d;

    /* renamed from: e, reason: collision with root package name */
    public final double f52086e;

    /* renamed from: f, reason: collision with root package name */
    public final double f52087f;

    /* renamed from: g, reason: collision with root package name */
    public final double f52088g;

    /* renamed from: h, reason: collision with root package name */
    public final double f52089h;

    /* renamed from: i, reason: collision with root package name */
    public final double f52090i;

    /* renamed from: j, reason: collision with root package name */
    public final double[] f52091j = {0.0d, 0.0d, 0.0d};

    public b(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f52082a = d11;
        this.f52083b = d12;
        this.f52084c = d13;
        this.f52085d = d14;
        this.f52086e = d15;
        this.f52087f = d16;
        this.f52088g = d17;
        this.f52089h = d18;
        this.f52090i = d19;
    }

    public static b b(int i11) {
        return c(i11, u6.f52261k);
    }

    public static b c(int i11, u6 u6Var) {
        double n11 = c.n((16711680 & i11) >> 16);
        double n12 = c.n((65280 & i11) >> 8);
        double n13 = c.n(i11 & 255);
        return h((0.41233895d * n11) + (0.35762064d * n12) + (0.18051042d * n13), (0.2126d * n11) + (0.7152d * n12) + (0.0722d * n13), (n11 * 0.01932141d) + (n12 * 0.11916382d) + (n13 * 0.95034478d), u6Var);
    }

    public static b d(double d11, double d12, double d13) {
        return e(d11, d12, d13, u6.f52261k);
    }

    public static b e(double d11, double d12, double d13, u6 u6Var) {
        double d14 = d11 / 100.0d;
        double c11 = (4.0d / u6Var.c()) * Math.sqrt(d14) * (u6Var.b() + 4.0d) * u6Var.e();
        double e11 = d12 * u6Var.e();
        double sqrt = Math.sqrt(((d12 / Math.sqrt(d14)) * u6Var.c()) / (u6Var.b() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d13);
        double d15 = (1.7000000000000002d * d11) / ((0.007d * d11) + 1.0d);
        double log1p = Math.log1p(0.0228d * e11) * 43.859649122807014d;
        return new b(d13, d12, d11, c11, e11, sqrt, d15, log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    public static b f(double d11, double d12, double d13) {
        return g(d11, d12, d13, u6.f52261k);
    }

    public static b g(double d11, double d12, double d13, u6 u6Var) {
        double expm1 = (Math.expm1(Math.hypot(d12, d13) * 0.0228d) / 0.0228d) / u6Var.e();
        double atan2 = Math.atan2(d13, d12) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return e(d11 / (1.0d - ((d11 - 100.0d) * 0.007d)), expm1, atan2, u6Var);
    }

    public static b h(double d11, double d12, double d13, u6 u6Var) {
        double[][] dArr = f52080k;
        double[] dArr2 = dArr[0];
        double d14 = (dArr2[0] * d11) + (dArr2[1] * d12) + (dArr2[2] * d13);
        double[] dArr3 = dArr[1];
        double d15 = (dArr3[0] * d11) + (dArr3[1] * d12) + (dArr3[2] * d13);
        double[] dArr4 = dArr[2];
        double d16 = (dArr4[0] * d11) + (dArr4[1] * d12) + (dArr4[2] * d13);
        double d17 = u6Var.j()[0] * d14;
        double d18 = u6Var.j()[1] * d15;
        double d19 = u6Var.j()[2] * d16;
        double pow = Math.pow((u6Var.d() * Math.abs(d17)) / 100.0d, 0.42d);
        double pow2 = Math.pow((u6Var.d() * Math.abs(d18)) / 100.0d, 0.42d);
        double pow3 = Math.pow((u6Var.d() * Math.abs(d19)) / 100.0d, 0.42d);
        double signum = ((Math.signum(d17) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d18) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d19) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d21 = (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d;
        double d22 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d23 = signum2 * 20.0d;
        double d24 = (((signum * 20.0d) + d23) + (21.0d * signum3)) / 20.0d;
        double d25 = (((signum * 40.0d) + d23) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d22, d21));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d26 = degrees;
        double radians = Math.toRadians(d26);
        double pow4 = Math.pow((d25 * u6Var.g()) / u6Var.b(), u6Var.c() * u6Var.k()) * 100.0d;
        double d27 = pow4 / 100.0d;
        double e11 = u6Var.e() * (4.0d / u6Var.c()) * Math.sqrt(d27) * (u6Var.b() + 4.0d);
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, u6Var.f()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d26 < 20.14d ? d26 + 360.0d : d26) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * u6Var.h()) * u6Var.i()) * Math.hypot(d21, d22)) / (d24 + 0.305d), 0.9d);
        double sqrt = pow5 * Math.sqrt(d27);
        double e12 = sqrt * u6Var.e();
        double sqrt2 = Math.sqrt((pow5 * u6Var.c()) / (u6Var.b() + 4.0d)) * 50.0d;
        double d28 = (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d);
        double log1p = Math.log1p(0.0228d * e12) * 43.859649122807014d;
        return new b(d26, sqrt, pow4, e11, e12, sqrt2, d28, log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    public double a(b bVar) {
        double n11 = n() - bVar.n();
        double i11 = i() - bVar.i();
        double j11 = j() - bVar.j();
        return Math.pow(Math.sqrt((n11 * n11) + (i11 * i11) + (j11 * j11)), 0.63d) * 1.41d;
    }

    public double i() {
        return this.f52089h;
    }

    public double j() {
        return this.f52090i;
    }

    public double k() {
        return this.f52083b;
    }

    public double l() {
        return this.f52082a;
    }

    public double m() {
        return this.f52084c;
    }

    public double n() {
        return this.f52088g;
    }

    public double o() {
        return this.f52086e;
    }

    public double p() {
        return this.f52085d;
    }

    public double q() {
        return this.f52087f;
    }

    public int r() {
        return s(u6.f52261k);
    }

    public int s(u6 u6Var) {
        double[] t11 = t(u6Var, this.f52091j);
        return c.f(t11[0], t11[1], t11[2]);
    }

    public double[] t(u6 u6Var, double[] dArr) {
        double pow = Math.pow(((k() == 0.0d || m() == 0.0d) ? 0.0d : k() / Math.sqrt(m() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, u6Var.f()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(l());
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double b11 = u6Var.b() * Math.pow(m() / 100.0d, (1.0d / u6Var.c()) / u6Var.k());
        double h11 = cos * 3846.153846153846d * u6Var.h() * u6Var.i();
        double g11 = b11 / u6Var.g();
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d11 = (((0.305d + g11) * 23.0d) * pow) / (((h11 * 23.0d) + ((11.0d * pow) * cos2)) + ((pow * 108.0d) * sin));
        double d12 = cos2 * d11;
        double d13 = d11 * sin;
        double d14 = g11 * 460.0d;
        double d15 = (((451.0d * d12) + d14) + (288.0d * d13)) / 1403.0d;
        double d16 = ((d14 - (891.0d * d12)) - (261.0d * d13)) / 1403.0d;
        double d17 = ((d14 - (d12 * 220.0d)) - (d13 * 6300.0d)) / 1403.0d;
        double signum = Math.signum(d15) * (100.0d / u6Var.d()) * Math.pow(Math.max(0.0d, (Math.abs(d15) * 27.13d) / (400.0d - Math.abs(d15))), 2.380952380952381d);
        double signum2 = Math.signum(d16) * (100.0d / u6Var.d()) * Math.pow(Math.max(0.0d, (Math.abs(d16) * 27.13d) / (400.0d - Math.abs(d16))), 2.380952380952381d);
        double signum3 = Math.signum(d17) * (100.0d / u6Var.d()) * Math.pow(Math.max(0.0d, (Math.abs(d17) * 27.13d) / (400.0d - Math.abs(d17))), 2.380952380952381d);
        double d18 = signum / u6Var.j()[0];
        double d19 = signum2 / u6Var.j()[1];
        double d21 = signum3 / u6Var.j()[2];
        double[][] dArr2 = f52081l;
        double[] dArr3 = dArr2[0];
        double d22 = (dArr3[0] * d18) + (dArr3[1] * d19) + (dArr3[2] * d21);
        double[] dArr4 = dArr2[1];
        double d23 = (dArr4[0] * d18) + (dArr4[1] * d19) + (dArr4[2] * d21);
        double[] dArr5 = dArr2[2];
        double d24 = (d18 * dArr5[0]) + (d19 * dArr5[1]) + (d21 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d22, d23, d24};
        }
        dArr[0] = d22;
        dArr[1] = d23;
        dArr[2] = d24;
        return dArr;
    }
}
