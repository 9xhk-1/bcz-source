package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final double f52100a = 1.0d;

    /* renamed from: b, reason: collision with root package name */
    public static final double f52101b = 21.0d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f52102c = 3.0d;

    /* renamed from: d, reason: collision with root package name */
    public static final double f52103d = 4.5d;

    /* renamed from: e, reason: collision with root package name */
    public static final double f52104e = 7.0d;

    /* renamed from: f, reason: collision with root package name */
    public static final double f52105f = 0.04d;

    /* renamed from: g, reason: collision with root package name */
    public static final double f52106g = 0.4d;

    public static double a(double d11, double d12) {
        if (d11 >= 0.0d && d11 <= 100.0d) {
            double t11 = c.t(d11);
            double d13 = ((t11 + 5.0d) / d12) - 5.0d;
            if (d13 >= 0.0d && d13 <= 100.0d) {
                double f11 = f(t11, d13);
                double abs = Math.abs(f11 - d12);
                if (f11 < d12 && abs > 0.04d) {
                    return -1.0d;
                }
                double p11 = c.p(d13) - 0.4d;
                if (p11 >= 0.0d && p11 <= 100.0d) {
                    return p11;
                }
            }
        }
        return -1.0d;
    }

    public static double b(double d11, double d12) {
        return Math.max(0.0d, a(d11, d12));
    }

    public static double c(double d11, double d12) {
        if (d11 >= 0.0d && d11 <= 100.0d) {
            double t11 = c.t(d11);
            double d13 = ((t11 + 5.0d) * d12) - 5.0d;
            if (d13 >= 0.0d && d13 <= 100.0d) {
                double f11 = f(d13, t11);
                double abs = Math.abs(f11 - d12);
                if (f11 < d12 && abs > 0.04d) {
                    return -1.0d;
                }
                double p11 = c.p(d13) + 0.4d;
                if (p11 >= 0.0d && p11 <= 100.0d) {
                    return p11;
                }
            }
        }
        return -1.0d;
    }

    public static double d(double d11, double d12) {
        double c11 = c(d11, d12);
        if (c11 < 0.0d) {
            return 100.0d;
        }
        return c11;
    }

    public static double e(double d11, double d12) {
        return f(c.t(d11), c.t(d12));
    }

    public static double f(double d11, double d12) {
        double max = Math.max(d11, d12);
        if (max != d12) {
            d11 = d12;
        }
        return (max + 5.0d) / (d11 + 5.0d);
    }
}
