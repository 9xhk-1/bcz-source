package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final double[][] f52093a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* renamed from: b, reason: collision with root package name */
    public static final double[][] f52094b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* renamed from: c, reason: collision with root package name */
    public static final double[] f52095c = {95.047d, 100.0d, 108.883d};

    public static int a(int i11) {
        return (i11 >> 24) & 255;
    }

    public static int b(double d11, double d12, double d13) {
        double[] dArr = f52095c;
        double d14 = (d11 + 16.0d) / 116.0d;
        double d15 = d14 - (d13 / 200.0d);
        return f(m((d12 / 500.0d) + d14) * dArr[0], m(d14) * dArr[1], m(d15) * dArr[2]);
    }

    public static int c(double[] dArr) {
        return e(h(dArr[0]), h(dArr[1]), h(dArr[2]));
    }

    public static int d(double d11) {
        int h11 = h(t(d11));
        return e(h11, h11, h11);
    }

    public static int e(int i11, int i12, int i13) {
        return ((i11 & 255) << 16) | (-16777216) | ((i12 & 255) << 8) | (i13 & 255);
    }

    public static int f(double d11, double d12, double d13) {
        double[][] dArr = f52094b;
        double[] dArr2 = dArr[0];
        double d14 = (dArr2[0] * d11) + (dArr2[1] * d12) + (dArr2[2] * d13);
        double[] dArr3 = dArr[1];
        double d15 = (dArr3[0] * d11) + (dArr3[1] * d12) + (dArr3[2] * d13);
        double[] dArr4 = dArr[2];
        return e(h(d14), h(d15), h((dArr4[0] * d11) + (dArr4[1] * d12) + (dArr4[2] * d13)));
    }

    public static int g(int i11) {
        return i11 & 255;
    }

    public static int h(double d11) {
        double d12 = d11 / 100.0d;
        return v5.b(0, 255, (int) Math.round((d12 <= 0.0031308d ? d12 * 12.92d : (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int i(int i11) {
        return (i11 >> 8) & 255;
    }

    public static boolean j(int i11) {
        return a(i11) >= 255;
    }

    public static double k(double d11) {
        return d11 > 0.008856451679035631d ? Math.pow(d11, 0.3333333333333333d) : ((d11 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] l(int i11) {
        double n11 = n(q(i11));
        double n12 = n(i(i11));
        double n13 = n(g(i11));
        double[][] dArr = f52093a;
        double[] dArr2 = dArr[0];
        double d11 = (dArr2[0] * n11) + (dArr2[1] * n12) + (dArr2[2] * n13);
        double[] dArr3 = dArr[1];
        double d12 = (dArr3[0] * n11) + (dArr3[1] * n12) + (dArr3[2] * n13);
        double[] dArr4 = dArr[2];
        double d13 = (dArr4[0] * n11) + (dArr4[1] * n12) + (dArr4[2] * n13);
        double[] dArr5 = f52095c;
        double d14 = d11 / dArr5[0];
        double d15 = d12 / dArr5[1];
        double d16 = d13 / dArr5[2];
        double k11 = k(d14);
        double k12 = k(d15);
        return new double[]{(116.0d * k12) - 16.0d, (k11 - k12) * 500.0d, (k12 - k(d16)) * 200.0d};
    }

    public static double m(double d11) {
        double d12 = d11 * d11 * d11;
        return d12 > 0.008856451679035631d ? d12 : ((d11 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double n(int i11) {
        double d11 = i11 / 255.0d;
        return (d11 <= 0.040449936d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double o(int i11) {
        return (k(s(i11)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double p(double d11) {
        return (k(d11 / 100.0d) * 116.0d) - 16.0d;
    }

    public static int q(int i11) {
        return (i11 >> 16) & 255;
    }

    public static double[] r() {
        return f52095c;
    }

    public static double[] s(int i11) {
        return v5.e(new double[]{n(q(i11)), n(i(i11)), n(g(i11))}, f52093a);
    }

    public static double t(double d11) {
        return m((d11 + 16.0d) / 116.0d) * 100.0d;
    }
}
