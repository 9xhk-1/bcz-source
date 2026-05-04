package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.c
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f34309a = 4503599627370495L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f34310b = 9218868437227405312L;

    /* renamed from: c, reason: collision with root package name */
    public static final long f34311c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public static final int f34312d = 52;

    /* renamed from: e, reason: collision with root package name */
    public static final int f34313e = 1023;

    /* renamed from: f, reason: collision with root package name */
    public static final long f34314f = 4503599627370496L;

    /* renamed from: g, reason: collision with root package name */
    @go.e
    public static final long f34315g = 4607182418800017408L;

    public static double a(BigInteger x11) {
        BigInteger abs = x11.abs();
        int bitLength = abs.bitLength();
        int i11 = bitLength - 1;
        if (i11 < 63) {
            return x11.longValue();
        }
        if (i11 > 1023) {
            return x11.signum() * Double.POSITIVE_INFINITY;
        }
        int i12 = bitLength - 54;
        long longValue = abs.shiftRight(i12).longValue();
        long j11 = longValue >> 1;
        long j12 = f34309a & j11;
        if ((longValue & 1) != 0 && ((j11 & 1) != 0 || abs.getLowestSetBit() < i12)) {
            j12++;
        }
        return Double.longBitsToDouble((((bitLength + 1022) << 52) + j12) | (x11.signum() & Long.MIN_VALUE));
    }

    public static double b(double value) {
        Preconditions.checkArgument(!Double.isNaN(value));
        return Math.max(value, 0.0d);
    }

    public static long c(double d11) {
        Preconditions.checkArgument(d(d11), "not a normal value");
        int exponent = Math.getExponent(d11);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11) & f34309a;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | f34314f;
    }

    public static boolean d(double d11) {
        return Math.getExponent(d11) <= 1023;
    }

    public static boolean e(double d11) {
        return Math.getExponent(d11) >= -1022;
    }

    public static double f(double d11) {
        return -Math.nextUp(-d11);
    }

    public static double g(double x11) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(x11) & f34309a) | f34315g);
    }
}
