package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class x5 implements w5 {
    @Override // fn.w5
    public int a(double[] dArr) {
        return c.b(dArr[0], dArr[1], dArr[2]);
    }

    @Override // fn.w5
    public double b(double[] dArr, double[] dArr2) {
        double d11 = dArr[0] - dArr2[0];
        double d12 = dArr[1] - dArr2[1];
        double d13 = dArr[2] - dArr2[2];
        return (d11 * d11) + (d12 * d12) + (d13 * d13);
    }

    @Override // fn.w5
    public double[] c(int i11) {
        double[] l11 = c.l(i11);
        return new double[]{l11[0], l11[1], l11[2]};
    }
}
