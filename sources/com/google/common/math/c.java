package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final double f34301a = -2.147483648E9d;

    /* renamed from: b, reason: collision with root package name */
    public static final double f34302b = 2.147483647E9d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f34303c = -9.223372036854776E18d;

    /* renamed from: d, reason: collision with root package name */
    public static final double f34304d = 9.223372036854776E18d;

    /* renamed from: f, reason: collision with root package name */
    @go.e
    public static final int f34306f = 170;

    /* renamed from: e, reason: collision with root package name */
    public static final double f34305e = Math.log(2.0d);

    /* renamed from: g, reason: collision with root package name */
    @go.e
    public static final double[] f34307g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34308a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f34308a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34308a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34308a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34308a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34308a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34308a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34308a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34308a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @go.c
    @uo.a
    public static double a(double argument) {
        Preconditions.checkArgument(d.d(argument));
        return argument;
    }

    public static double b(int n11) {
        i.e("n", n11);
        if (n11 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d11 = 1.0d;
        for (int i11 = (n11 & (-16)) + 1; i11 <= n11; i11++) {
            d11 *= i11;
        }
        return d11 * f34307g[n11 >> 4];
    }

    public static int c(double a11, double b11, double tolerance) {
        if (d(a11, b11, tolerance)) {
            return 0;
        }
        if (a11 < b11) {
            return -1;
        }
        if (a11 > b11) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(a11), Double.isNaN(b11));
    }

    public static boolean d(double a11, double b11, double tolerance) {
        i.d("tolerance", tolerance);
        if (Math.copySign(a11 - b11, 1.0d) <= tolerance || a11 == b11) {
            return true;
        }
        return Double.isNaN(a11) && Double.isNaN(b11);
    }

    @go.c
    public static boolean e(double x11) {
        if (d.d(x11)) {
            return x11 == 0.0d || 52 - Long.numberOfTrailingZeros(d.c(x11)) <= Math.getExponent(x11);
        }
        return false;
    }

    @go.c
    public static boolean f(double x11) {
        if (x11 > 0.0d && d.d(x11)) {
            long c11 = d.c(x11);
            if ((c11 & (c11 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static double g(double x11) {
        return Math.log(x11) / f34305e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @go.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = com.google.common.math.d.d(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = com.google.common.math.d.e(r5)
            if (r3 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = h(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2a:
            int[] r3 = com.google.common.math.c.a.f34308a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L61;
                case 2: goto L68;
                case 3: goto L5a;
                case 4: goto L52;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L3b;
                case 8: goto L3b;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3b:
            double r5 = com.google.common.math.d.g(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r1 = r2
            goto L68
        L48:
            if (r0 < 0) goto L4b
            r1 = r2
        L4b:
            boolean r5 = f(r5)
        L4f:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L68
        L52:
            if (r0 >= 0) goto L55
            r1 = r2
        L55:
            boolean r5 = f(r5)
            goto L4f
        L5a:
            boolean r5 = f(r5)
            r1 = r5 ^ 1
            goto L68
        L61:
            boolean r5 = f(r5)
            com.google.common.math.i.k(r5)
        L68:
            if (r1 == 0) goto L6b
            int r0 = r0 + r2
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.c.h(double, java.math.RoundingMode):int");
    }

    @go.c
    @Deprecated
    public static double i(Iterable<? extends Number> values) {
        return j(values.iterator());
    }

    @go.c
    @Deprecated
    public static double j(Iterator<? extends Number> values) {
        Preconditions.checkArgument(values.hasNext(), "Cannot take mean of 0 values");
        double a11 = a(values.next().doubleValue());
        long j11 = 1;
        while (values.hasNext()) {
            j11++;
            a11 += (a(values.next().doubleValue()) - a11) / j11;
        }
        return a11;
    }

    @go.c
    @Deprecated
    public static double k(double... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double a11 = a(values[0]);
        long j11 = 1;
        for (int i11 = 1; i11 < values.length; i11++) {
            a(values[i11]);
            j11++;
            a11 += (values[i11] - a11) / j11;
        }
        return a11;
    }

    @Deprecated
    public static double l(int... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        long j11 = 0;
        for (int i11 : values) {
            j11 += i11;
        }
        return j11 / values.length;
    }

    @Deprecated
    public static double m(long... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double d11 = values[0];
        long j11 = 1;
        for (int i11 = 1; i11 < values.length; i11++) {
            j11++;
            d11 += (values[i11] - d11) / j11;
        }
        return d11;
    }

    @go.c
    public static double n(double x11, RoundingMode mode) {
        if (!d.d(x11)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f34308a[mode.ordinal()]) {
            case 1:
                i.k(e(x11));
                return x11;
            case 2:
                return (x11 >= 0.0d || e(x11)) ? x11 : ((long) x11) - 1;
            case 3:
                return (x11 <= 0.0d || e(x11)) ? x11 : ((long) x11) + 1;
            case 4:
                return x11;
            case 5:
                if (e(x11)) {
                    return x11;
                }
                return ((long) x11) + (x11 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(x11);
            case 7:
                double rint = Math.rint(x11);
                return Math.abs(x11 - rint) == 0.5d ? x11 + Math.copySign(0.5d, x11) : rint;
            case 8:
                double rint2 = Math.rint(x11);
                return Math.abs(x11 - rint2) == 0.5d ? x11 : rint2;
            default:
                throw new AssertionError();
        }
    }

    @go.c
    public static BigInteger o(double x11, RoundingMode mode) {
        double n11 = n(x11, mode);
        if (((-9.223372036854776E18d) - n11 < 1.0d) && (n11 < 9.223372036854776E18d)) {
            return BigInteger.valueOf((long) n11);
        }
        BigInteger shiftLeft = BigInteger.valueOf(d.c(n11)).shiftLeft(Math.getExponent(n11) - 52);
        return n11 < 0.0d ? shiftLeft.negate() : shiftLeft;
    }

    @go.c
    public static int p(double x11, RoundingMode mode) {
        double n11 = n(x11, mode);
        i.a((n11 > -2.147483649E9d) & (n11 < 2.147483648E9d), x11, mode);
        return (int) n11;
    }

    @go.c
    public static long q(double x11, RoundingMode mode) {
        double n11 = n(x11, mode);
        i.a(((-9.223372036854776E18d) - n11 < 1.0d) & (n11 < 9.223372036854776E18d), x11, mode);
        return (long) n11;
    }
}
