package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;
    double mS;
    double mT;

    public Schlick(String str) {
        this.mStr = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.mS = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i11 = indexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i11, str.indexOf(44, i11)).trim());
    }

    private double dfunc(double d11) {
        double d12 = this.mT;
        if (d11 < d12) {
            double d13 = this.mS;
            return ((d13 * d12) * d12) / ((((d12 - d11) * d13) + d11) * ((d13 * (d12 - d11)) + d11));
        }
        double d14 = this.mS;
        return (((d12 - 1.0d) * d14) * (d12 - 1.0d)) / (((((-d14) * (d12 - d11)) - d11) + 1.0d) * ((((-d14) * (d12 - d11)) - d11) + 1.0d));
    }

    private double func(double d11) {
        double d12 = this.mT;
        return d11 < d12 ? (d12 * d11) / (d11 + (this.mS * (d12 - d11))) : ((1.0d - d12) * (d11 - 1.0d)) / ((1.0d - d11) - (this.mS * (d12 - d11)));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d11) {
        return func(d11);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d11) {
        return dfunc(d11);
    }
}
