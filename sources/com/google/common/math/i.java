package com.google.common.math;

import java.math.BigInteger;
import java.math.RoundingMode;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b
/* loaded from: classes7.dex */
public final class i {
    public static void a(boolean condition, double input, RoundingMode mode) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
    }

    public static void b(boolean condition, String methodName, int a11, int b11) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + pn.j.f81006c + a11 + j2.O + b11 + pn.j.f81007d);
    }

    public static void c(boolean condition, String methodName, long a11, long b11) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + pn.j.f81006c + a11 + j2.O + b11 + pn.j.f81007d);
    }

    @uo.a
    public static double d(String role, double x11) {
        if (x11 >= 0.0d) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be >= 0");
    }

    @uo.a
    public static int e(String role, int x11) {
        if (x11 >= 0) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be >= 0");
    }

    @uo.a
    public static long f(String role, long x11) {
        if (x11 >= 0) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be >= 0");
    }

    @uo.a
    public static BigInteger g(String role, BigInteger x11) {
        if (x11.signum() >= 0) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be >= 0");
    }

    @uo.a
    public static int h(String role, int x11) {
        if (x11 > 0) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be > 0");
    }

    @uo.a
    public static long i(String role, long x11) {
        if (x11 > 0) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be > 0");
    }

    @uo.a
    public static BigInteger j(String role, BigInteger x11) {
        if (x11.signum() > 0) {
            return x11;
        }
        throw new IllegalArgumentException(role + " (" + x11 + ") must be > 0");
    }

    public static void k(boolean condition) {
        if (!condition) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
