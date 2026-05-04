package com.badlogic.gdx.math;

import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final float f12676a = 1.0E-9f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f12677b = 1.0E-6f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f12678c = 3.1415927f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f12679d = 6.2831855f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f12680e = 1.5707964f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f12681f = 2.7182817f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12682g = 14;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12683h = 16383;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12684i = 16384;

    /* renamed from: j, reason: collision with root package name */
    public static final float f12685j = 6.2831855f;

    /* renamed from: k, reason: collision with root package name */
    public static final float f12686k = 360.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f12687l = 2607.5945f;

    /* renamed from: m, reason: collision with root package name */
    public static final float f12688m = 45.511112f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f12689n = 57.295776f;

    /* renamed from: o, reason: collision with root package name */
    public static final float f12690o = 57.295776f;

    /* renamed from: p, reason: collision with root package name */
    public static final float f12691p = 0.017453292f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f12692q = 0.017453292f;

    /* renamed from: r, reason: collision with root package name */
    public static Random f12693r = new RandomXS128();

    /* renamed from: s, reason: collision with root package name */
    public static final int f12694s = 16384;

    /* renamed from: t, reason: collision with root package name */
    public static final double f12695t = 16384.0d;

    /* renamed from: u, reason: collision with root package name */
    public static final double f12696u = 0.9999999d;

    /* renamed from: v, reason: collision with root package name */
    public static final double f12697v = 16384.999999999996d;

    /* renamed from: w, reason: collision with root package name */
    public static final double f12698w = 16384.5d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final float[] f12699a = new float[16384];

        static {
            for (int i11 = 0; i11 < 16384; i11++) {
                f12699a[i11] = (float) Math.sin(((i11 + 0.5f) / 16384.0f) * 6.2831855f);
            }
            float[] fArr = f12699a;
            fArr[0] = 0.0f;
            fArr[4096] = 1.0f;
            fArr[8192] = 0.0f;
            fArr[12288] = -1.0f;
        }
    }

    public static boolean A(float f11, float f12) {
        return Math.abs(f11) <= f12;
    }

    public static float B(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    public static float C(float f11, float f12, float f13) {
        return (((f11 + (((((((f12 - f11) % 6.2831855f) + 6.2831855f) + 3.1415927f) % 6.2831855f) - 3.1415927f) * f13)) % 6.2831855f) + 6.2831855f) % 6.2831855f;
    }

    public static float D(float f11, float f12, float f13) {
        return (((f11 + (((((((f12 - f11) % 360.0f) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f13)) % 360.0f) + 360.0f) % 360.0f;
    }

    public static float E(float f11, float f12) {
        return (float) (Math.log(f12) / Math.log(f11));
    }

    public static float F(float f11) {
        return E(2.0f, f11);
    }

    public static float G(float f11, float f12, float f13, float f14, float f15) {
        return f13 + (((f15 - f11) * (f14 - f13)) / (f12 - f11));
    }

    public static int H(int i11) {
        if (i11 == 0) {
            return 1;
        }
        int i12 = i11 - 1;
        int i13 = i12 | (i12 >> 1);
        int i14 = i13 | (i13 >> 2);
        int i15 = i14 | (i14 >> 4);
        int i16 = i15 | (i15 >> 8);
        return (i16 | (i16 >> 16)) + 1;
    }

    public static float I(float f11, float f12, float f13) {
        return (f13 - f11) / (f12 - f11);
    }

    public static float J() {
        return f12693r.nextFloat();
    }

    public static float K(float f11) {
        return f12693r.nextFloat() * f11;
    }

    public static float L(float f11, float f12) {
        return f11 + (f12693r.nextFloat() * (f12 - f11));
    }

    public static int M(int i11) {
        return f12693r.nextInt(i11 + 1);
    }

    public static int N(int i11, int i12) {
        return i11 + f12693r.nextInt((i12 - i11) + 1);
    }

    public static long O(long j11) {
        return P(0L, j11);
    }

    public static long P(long j11, long j12) {
        long nextLong = f12693r.nextLong();
        if (j12 >= j11) {
            j12 = j11;
            j11 = j12;
        }
        long j13 = (j11 - j12) + 1;
        long j14 = nextLong & 4294967295L;
        long j15 = 4294967295L & j13;
        long j16 = nextLong >>> 32;
        long j17 = j13 >>> 32;
        return j12 + ((j15 * j16) >>> 32) + ((j14 * j17) >>> 32) + (j16 * j17);
    }

    public static boolean Q() {
        return f12693r.nextBoolean();
    }

    public static boolean R(float f11) {
        return J() < f11;
    }

    public static int S() {
        return (f12693r.nextInt() >> 31) | 1;
    }

    public static float T() {
        return f12693r.nextFloat() - f12693r.nextFloat();
    }

    public static float U(float f11) {
        return (f12693r.nextFloat() - f12693r.nextFloat()) * f11;
    }

    public static float V(float f11, float f12) {
        return W(f11, f12, (f11 + f12) * 0.5f);
    }

    public static float W(float f11, float f12, float f13) {
        return f12693r.nextFloat() <= (f13 - f11) / (f12 - f11) ? f11 + ((float) Math.sqrt(r0 * r1 * r2)) : f12 - ((float) Math.sqrt(((1.0f - r0) * r1) * (f12 - f13)));
    }

    public static int X(float f11) {
        return ((int) (f11 + 16384.5d)) - 16384;
    }

    public static int Y(float f11) {
        return (int) (f11 + 0.5f);
    }

    public static float Z(float f11) {
        return a.f12699a[((int) (f11 * 2607.5945f)) & f12683h];
    }

    public static float a(float f11) {
        float f12 = f11 * f11;
        float f13 = f11 * f12;
        return f11 >= 0.0f ? ((float) Math.sqrt(1.0f - f11)) * (((1.5707288f - (f11 * 0.2121144f)) + (f12 * 0.074261f)) - (f13 * 0.0187293f)) : 3.1415927f - (((float) Math.sqrt(1.0f + f11)) * ((((f11 * 0.2121144f) + 1.5707288f) + (f12 * 0.074261f)) + (f13 * 0.0187293f)));
    }

    public static float a0(float f11) {
        return a.f12699a[((int) (f11 * 45.511112f)) & f12683h];
    }

    public static float b(float f11) {
        float f12 = f11 * f11;
        float f13 = f11 * f12;
        return f11 >= 0.0f ? ((float) Math.sqrt(1.0f - f11)) * (((89.99613f - (f11 * 12.153259f)) + (f12 * 4.254842f)) - (f13 * 1.0731097f)) : 180.0f - (((float) Math.sqrt(1.0f + f11)) * ((((f11 * 12.153259f) + 89.99613f) + (f12 * 4.254842f)) + (f13 * 1.0731097f)));
    }

    public static float b0(float f11) {
        double d11 = (f11 / 3.1415927f) + 0.5f;
        float floor = (((float) (d11 - Math.floor(d11))) - 0.5f) * 3.1415927f;
        float f12 = floor * floor;
        float f13 = f12 * f12;
        return (floor * (((0.0010582011f * f13) - (0.11111111f * f12)) + 1.0f)) / (((f13 * 0.015873017f) - (f12 * 0.44444445f)) + 1.0f);
    }

    public static float c(float f11) {
        float f12 = f11 * f11;
        return f11 >= 0.0f ? 1.5707964f - (((float) Math.sqrt(1.0f - f11)) * (((1.5707288f - (f11 * 0.2121144f)) + (f12 * 0.074261f)) - ((f11 * f12) * 0.0187293f))) : (((float) Math.sqrt(1.0f + f11)) * ((((f11 * 0.2121144f) + 1.5707288f) + (f12 * 0.074261f)) + (r1 * 0.0187293f))) - 1.5707964f;
    }

    public static float c0(float f11) {
        double d11 = (f11 * 0.0055555557f) + 0.5f;
        float floor = (((float) (d11 - Math.floor(d11))) - 0.5f) * 3.1415927f;
        float f12 = floor * floor;
        float f13 = f12 * f12;
        return (floor * (((0.0010582011f * f13) - (0.11111111f * f12)) + 1.0f)) / (((f13 * 0.015873017f) - (f12 * 0.44444445f)) + 1.0f);
    }

    public static float d(float f11) {
        float f12 = f11 * f11;
        float f13 = f11 * f12;
        return f11 >= 0.0f ? 90.0f - (((float) Math.sqrt(1.0f - f11)) * (((89.99613f - (f11 * 12.15326f)) + (f12 * 4.254842f)) - (f13 * 1.0731099f))) : (((float) Math.sqrt(1.0f + f11)) * ((((f11 * 12.15326f) + 89.99613f) + (f12 * 4.254842f)) + (f13 * 1.0731099f))) - 90.0f;
    }

    public static float e(float f11) {
        double min = Math.min(Math.abs(f11), Double.MAX_VALUE);
        double d11 = (min - 1.0d) / (min + 1.0d);
        double d12 = d11 * d11;
        double d13 = d11 * d12;
        double d14 = d13 * d12;
        double d15 = d14 * d12;
        double d16 = d15 * d12;
        return Math.signum(f11) * ((float) (((((((d11 * 0.99997726d) - (d13 * 0.33262347d)) + (d14 * 0.19354346d)) - (d15 * 0.11643287d)) + (d16 * 0.05265332d)) - ((d12 * d16) * 0.0117212d)) + 0.7853981633974483d));
    }

    public static float f(float f11, float f12) {
        float f13 = f11 / f12;
        if (f13 != f13) {
            f13 = f11 == f12 ? 1.0f : -1.0f;
        } else {
            float f14 = f13 - f13;
            if (f14 != f14) {
                f12 = 0.0f;
            }
        }
        return f12 > 0.0f ? j(f13) : f12 < 0.0f ? f11 >= 0.0f ? j(f13) + 3.1415927f : j(f13) - 3.1415927f : f11 > 0.0f ? f12 + 1.5707964f : f11 < 0.0f ? f12 - 1.5707964f : f12 + f11;
    }

    public static float g(float f11, float f12) {
        double k11;
        float f13 = f11 / f12;
        if (f13 != f13) {
            f13 = f11 == f12 ? 1.0f : -1.0f;
        } else {
            float f14 = f13 - f13;
            if (f14 != f14) {
                f12 = 0.0f;
            }
        }
        if (f12 > 0.0f) {
            k11 = k(f13);
        } else {
            if (f12 >= 0.0f) {
                return f11 > 0.0f ? f12 + 90.0f : f11 < 0.0f ? f12 - 90.0f : f12 + f11;
            }
            k11 = f11 >= 0.0f ? k(f13) + 180.0d : k(f13) - 180.0d;
        }
        return (float) k11;
    }

    public static float h(float f11, float f12) {
        float f13;
        double k11;
        double d11;
        double d12;
        float f14 = f11 / f12;
        if (f14 != f14) {
            f14 = f11 == f12 ? 1.0f : -1.0f;
        } else {
            float f15 = f14 - f14;
            if (f15 != f15) {
                f12 = 0.0f;
            }
        }
        if (f12 > 0.0f) {
            if (f11 >= 0.0f) {
                d12 = k(f14);
                return (float) d12;
            }
            k11 = k(f14);
            d11 = 360.0d;
        } else {
            if (f12 >= 0.0f) {
                if (f11 > 0.0f) {
                    f13 = 90.0f;
                } else {
                    if (f11 >= 0.0f) {
                        return f12 + f11;
                    }
                    f13 = 270.0f;
                }
                return f12 + f13;
            }
            k11 = k(f14);
            d11 = 180.0d;
        }
        d12 = k11 + d11;
        return (float) d12;
    }

    public static float i(float f11) {
        double min = Math.min(Math.abs(f11), Double.MAX_VALUE);
        double d11 = (min - 1.0d) / (min + 1.0d);
        double d12 = d11 * d11;
        double d13 = d11 * d12;
        double d14 = d13 * d12;
        double d15 = d14 * d12;
        double d16 = d15 * d12;
        return (float) (Math.signum(f11) * (((((((d11 * 57.2944766070562d) - (d13 * 19.05792099799635d)) + (d14 * 11.089223410359068d)) - (d15 * 6.6711120475953765d)) + (d16 * 3.016813013351768d)) - ((d12 * d16) * 0.6715752908287405d)) + 45.0d));
    }

    public static float j(double d11) {
        double abs = Math.abs(d11);
        double d12 = (abs - 1.0d) / (abs + 1.0d);
        double d13 = d12 * d12;
        double d14 = d12 * d13;
        double d15 = d14 * d13;
        double d16 = d15 * d13;
        double d17 = d16 * d13;
        return (float) (Math.signum(d11) * (((((((d12 * 0.99997726d) - (d14 * 0.33262347d)) + (d15 * 0.19354346d)) - (d16 * 0.11643287d)) + (d17 * 0.05265332d)) - ((d13 * d17) * 0.0117212d)) + 0.7853981633974483d));
    }

    public static double k(double d11) {
        double abs = Math.abs(d11);
        double d12 = (abs - 1.0d) / (abs + 1.0d);
        double d13 = d12 * d12;
        double d14 = d12 * d13;
        double d15 = d14 * d13;
        double d16 = d15 * d13;
        double d17 = d16 * d13;
        return Math.signum(d11) * (((((((d12 * 57.2944766070562d) - (d14 * 19.05792099799635d)) + (d15 * 11.089223410359068d)) - (d16 * 6.6711120475953765d)) + (d17 * 3.016813013351768d)) - ((d13 * d17) * 0.6715752908287405d)) + 45.0d);
    }

    public static int l(float f11) {
        return 16384 - ((int) (16384.0d - f11));
    }

    public static int m(float f11) {
        return (int) (f11 + 0.9999999d);
    }

    public static double n(double d11, double d12, double d13) {
        return d11 < d12 ? d12 : d11 > d13 ? d13 : d11;
    }

    public static float o(float f11, float f12, float f13) {
        return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
    }

    public static int p(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    public static long q(long j11, long j12, long j13) {
        return j11 < j12 ? j12 : j11 > j13 ? j13 : j11;
    }

    public static short r(short s11, short s12, short s13) {
        return s11 < s12 ? s12 : s11 > s13 ? s13 : s11;
    }

    public static float s(float f11) {
        return a.f12699a[((int) ((f11 + 1.5707964f) * 2607.5945f)) & f12683h];
    }

    public static float t(float f11) {
        return a.f12699a[((int) ((f11 + 90.0f) * 45.511112f)) & f12683h];
    }

    public static int u(float f11) {
        return ((int) (f11 + 16384.0d)) - 16384;
    }

    public static int v(float f11) {
        return (int) f11;
    }

    public static boolean w(float f11, float f12) {
        return Math.abs(f11 - f12) <= 1.0E-6f;
    }

    public static boolean x(float f11, float f12, float f13) {
        return Math.abs(f11 - f12) <= f13;
    }

    public static boolean y(int i11) {
        return i11 != 0 && (i11 & (i11 + (-1))) == 0;
    }

    public static boolean z(float f11) {
        return Math.abs(f11) <= 1.0E-6f;
    }
}
