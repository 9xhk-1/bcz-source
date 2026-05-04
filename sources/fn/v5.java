package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class v5 {
    public static double a(double d11, double d12, double d13) {
        return d13 < d11 ? d11 : d13 > d12 ? d12 : d13;
    }

    public static int b(int i11, int i12, int i13) {
        return i13 < i11 ? i11 : i13 > i12 ? i12 : i13;
    }

    public static double c(double d11, double d12) {
        return 180.0d - Math.abs(Math.abs(d11 - d12) - 180.0d);
    }

    public static double d(double d11, double d12, double d13) {
        return ((1.0d - d13) * d11) + (d13 * d12);
    }

    public static double[] e(double[] dArr, double[][] dArr2) {
        double d11 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d12 = dArr3[0] * d11;
        double d13 = dArr[1];
        double d14 = d12 + (dArr3[1] * d13);
        double d15 = dArr[2];
        double d16 = d14 + (dArr3[2] * d15);
        double[] dArr4 = dArr2[1];
        double d17 = (dArr4[0] * d11) + (dArr4[1] * d13) + (dArr4[2] * d15);
        double[] dArr5 = dArr2[2];
        return new double[]{d16, d17, (d11 * dArr5[0]) + (d13 * dArr5[1]) + (d15 * dArr5[2])};
    }

    public static double f(double d11, double d12) {
        return g(d12 - d11) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double g(double d11) {
        double d12 = d11 % 360.0d;
        return d12 < 0.0d ? d12 + 360.0d : d12;
    }

    public static int h(int i11) {
        int i12 = i11 % 360;
        return i12 < 0 ? i12 + 360 : i12;
    }

    public static int i(double d11) {
        if (d11 < 0.0d) {
            return -1;
        }
        return d11 == 0.0d ? 0 : 1;
    }
}
