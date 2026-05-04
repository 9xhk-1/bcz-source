package c10;

import o00.f;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d extends c {
    @y0(version = "1.2")
    @f
    public static final double A(double d11) {
        return Math.cos(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double A0(double d11, double d12) {
        return Math.nextAfter(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final float B(float f11) {
        return (float) Math.cos(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float B0(float f11, float f12) {
        return Math.nextAfter(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final double C(double d11) {
        return Math.cosh(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double C0(double d11) {
        return Math.nextUp(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float D(float f11) {
        return (float) Math.cosh(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float D0(float f11) {
        return Math.nextUp(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double E(double d11) {
        return Math.exp(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double E0(double d11, double d12) {
        return Math.pow(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final float F(float f11) {
        return (float) Math.exp(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double F0(double d11, int i11) {
        return Math.pow(d11, i11);
    }

    @y0(version = "1.2")
    @f
    public static final double G(double d11) {
        return Math.expm1(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float G0(float f11, float f12) {
        return (float) Math.pow(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final float H(float f11) {
        return (float) Math.expm1(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float H0(float f11, int i11) {
        return (float) Math.pow(f11, i11);
    }

    @y0(version = "1.2")
    @f
    public static final double I(double d11) {
        return Math.floor(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double I0(double d11) {
        return Math.rint(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float J(float f11) {
        return (float) Math.floor(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float J0(float f11) {
        return (float) Math.rint(f11);
    }

    public static final double K(double d11) {
        return Math.abs(d11);
    }

    @y0(version = "1.2")
    public static int K0(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d11 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d11 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d11);
    }

    public static final float L(float f11) {
        return Math.abs(f11);
    }

    @y0(version = "1.2")
    public static int L0(float f11) {
        if (Float.isNaN(f11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f11);
    }

    public static final int M(int i11) {
        return Math.abs(i11);
    }

    @y0(version = "1.2")
    public static long M0(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d11);
    }

    public static final long N(long j11) {
        return Math.abs(j11);
    }

    @y0(version = "1.2")
    public static long N0(float f11) {
        return M0(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double O0(double d11) {
        return Math.signum(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float P0(float f11) {
        return Math.signum(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double Q0(double d11) {
        return Math.sin(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float R0(float f11) {
        return (float) Math.sin(f11);
    }

    public static final double S(double d11) {
        return Math.signum(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double S0(double d11) {
        return Math.sinh(d11);
    }

    public static final float T(float f11) {
        return Math.signum(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float T0(float f11) {
        return (float) Math.sinh(f11);
    }

    public static int U(int i11) {
        return Integer.signum(i11);
    }

    @y0(version = "1.2")
    @f
    public static final double U0(double d11) {
        return Math.sqrt(d11);
    }

    public static int V(long j11) {
        return Long.signum(j11);
    }

    @y0(version = "1.2")
    @f
    public static final float V0(float f11) {
        return (float) Math.sqrt(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double W0(double d11) {
        return Math.tan(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float X0(float f11) {
        return (float) Math.tan(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double Y0(double d11) {
        return Math.tanh(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float Z0(float f11) {
        return (float) Math.tanh(f11);
    }

    public static final double a0(double d11) {
        return Math.ulp(d11);
    }

    @y0(version = "1.2")
    public static final double a1(double d11) {
        return (Double.isNaN(d11) || Double.isInfinite(d11)) ? d11 : d11 > 0.0d ? Math.floor(d11) : Math.ceil(d11);
    }

    public static final float b0(float f11) {
        return Math.ulp(f11);
    }

    @y0(version = "1.2")
    public static final float b1(float f11) {
        if (Float.isNaN(f11) || Float.isInfinite(f11)) {
            return f11;
        }
        return (float) (f11 > 0.0f ? Math.floor(f11) : Math.ceil(f11));
    }

    @y0(version = "1.2")
    @f
    public static final double c(double d11, double d12) {
        return Math.IEEEremainder(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final double c1(double d11, double d12) {
        return Math.copySign(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final float d(float f11, float f12) {
        return (float) Math.IEEEremainder(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final double d1(double d11, int i11) {
        return Math.copySign(d11, i11);
    }

    @y0(version = "1.2")
    @f
    public static final double e(double d11) {
        return Math.abs(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double e0(double d11, double d12) {
        return Math.hypot(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final float e1(float f11, float f12) {
        return Math.copySign(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final float f(float f11) {
        return Math.abs(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float f0(float f11, float f12) {
        return (float) Math.hypot(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final float f1(float f11, int i11) {
        return Math.copySign(f11, i11);
    }

    @y0(version = "1.2")
    @f
    public static final int g(int i11) {
        return Math.abs(i11);
    }

    @y0(version = "1.2")
    @f
    public static final double g0(double d11) {
        return Math.log(d11);
    }

    @y0(version = "1.2")
    @f
    public static final long h(long j11) {
        return Math.abs(j11);
    }

    @y0(version = "1.2")
    @f
    public static final float h0(float f11) {
        return (float) Math.log(f11);
    }

    @y0(version = "1.2")
    @f
    public static final double i(double d11) {
        return Math.acos(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double i0(double d11) {
        return Math.log1p(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float j(float f11) {
        return (float) Math.acos(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float j0(float f11) {
        return (float) Math.log1p(f11);
    }

    @y0(version = "1.2")
    public static final double k(double d11) {
        if (d11 < 1.0d) {
            return Double.NaN;
        }
        if (d11 > a.f7478f) {
            return Math.log(d11) + a.f7474b;
        }
        double d12 = 1;
        double d13 = d11 - d12;
        if (d13 >= a.f7477e) {
            return Math.log(d11 + Math.sqrt((d11 * d11) - d12));
        }
        double sqrt = Math.sqrt(d13);
        if (sqrt >= a.f7476d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return Math.sqrt(2.0d) * sqrt;
    }

    @y0(version = "1.2")
    public static final double k0(double d11, double d12) {
        if (d12 <= 0.0d || d12 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d11) / Math.log(d12);
    }

    @y0(version = "1.2")
    @f
    public static final float l(float f11) {
        return (float) k(f11);
    }

    @y0(version = "1.2")
    public static final float l0(float f11, float f12) {
        if (f12 <= 0.0f || f12 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f11) / Math.log(f12));
    }

    @y0(version = "1.2")
    @f
    public static final double m(double d11) {
        return Math.asin(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double m0(double d11) {
        return Math.log10(d11);
    }

    @y0(version = "1.2")
    @f
    public static final float n(float f11) {
        return (float) Math.asin(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float n0(float f11) {
        return (float) Math.log10(f11);
    }

    @y0(version = "1.2")
    public static final double o(double d11) {
        double d12 = a.f7477e;
        if (d11 < d12) {
            return d11 <= (-d12) ? -o(-d11) : Math.abs(d11) >= a.f7476d ? d11 - (((d11 * d11) * d11) / 6) : d11;
        }
        if (d11 <= a.f7479g) {
            return Math.log(d11 + Math.sqrt((d11 * d11) + 1));
        }
        if (d11 > a.f7478f) {
            return Math.log(d11) + a.f7474b;
        }
        double d13 = d11 * 2;
        return Math.log(d13 + (1 / d13));
    }

    @y0(version = "1.2")
    public static final double o0(double d11) {
        return Math.log(d11) / a.f7474b;
    }

    @y0(version = "1.2")
    @f
    public static final float p(float f11) {
        return (float) o(f11);
    }

    @y0(version = "1.2")
    public static final float p0(float f11) {
        return (float) (Math.log(f11) / a.f7474b);
    }

    @y0(version = "1.2")
    @f
    public static final double q(double d11) {
        return Math.atan(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double q0(double d11, double d12) {
        return Math.max(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final float r(float f11) {
        return (float) Math.atan(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float r0(float f11, float f12) {
        return Math.max(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final double s(double d11, double d12) {
        return Math.atan2(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final int s0(int i11, int i12) {
        return Math.max(i11, i12);
    }

    @y0(version = "1.2")
    @f
    public static final float t(float f11, float f12) {
        return (float) Math.atan2(f11, f12);
    }

    @y0(version = "1.2")
    @f
    public static final long t0(long j11, long j12) {
        return Math.max(j11, j12);
    }

    @y0(version = "1.2")
    public static final double u(double d11) {
        if (Math.abs(d11) < a.f7477e) {
            return Math.abs(d11) > a.f7476d ? d11 + (((d11 * d11) * d11) / 3) : d11;
        }
        double d12 = 1;
        return Math.log((d12 + d11) / (d12 - d11)) / 2;
    }

    @y0(version = "1.2")
    @f
    public static final double u0(double d11, double d12) {
        return Math.min(d11, d12);
    }

    @y0(version = "1.2")
    @f
    public static final float v(float f11) {
        return (float) u(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float v0(float f11, float f12) {
        return Math.min(f11, f12);
    }

    @y0(version = "1.8")
    @f
    @j2(markerClass = {kotlin.c.class})
    public static final double w(double d11) {
        return Math.cbrt(d11);
    }

    @y0(version = "1.2")
    @f
    public static final int w0(int i11, int i12) {
        return Math.min(i11, i12);
    }

    @y0(version = "1.8")
    @f
    @j2(markerClass = {kotlin.c.class})
    public static final float x(float f11) {
        return (float) Math.cbrt(f11);
    }

    @y0(version = "1.2")
    @f
    public static final long x0(long j11, long j12) {
        return Math.min(j11, j12);
    }

    @y0(version = "1.2")
    @f
    public static final double y(double d11) {
        return Math.ceil(d11);
    }

    @y0(version = "1.2")
    @f
    public static final double y0(double d11) {
        return Math.nextAfter(d11, Double.NEGATIVE_INFINITY);
    }

    @y0(version = "1.2")
    @f
    public static final float z(float f11) {
        return (float) Math.ceil(f11);
    }

    @y0(version = "1.2")
    @f
    public static final float z0(float f11) {
        return Math.nextAfter(f11, Double.NEGATIVE_INFINITY);
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void O(double d11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void P(float f11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void R(long j11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void W(double d11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void X(float f11) {
    }

    @y0(version = "1.2")
    public static /* synthetic */ void Y(int i11) {
    }

    @y0(version = "1.2")
    public static /* synthetic */ void Z(long j11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d11) {
    }

    @y0(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f11) {
    }
}
