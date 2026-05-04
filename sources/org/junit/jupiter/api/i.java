package org.junit.jupiter.api;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i {
    public static void A(Object expected, Object actual, Supplier<String> messageSupplier) {
        if (l0.p(expected, actual)) {
            return;
        }
        E(expected, actual, messageSupplier);
    }

    public static void B(short expected, short actual) {
        C(expected, actual, null);
    }

    public static void C(short expected, short actual, String message) {
        if (expected != actual) {
            E(Short.valueOf(expected), Short.valueOf(actual), message);
        }
    }

    public static void D(short expected, short actual, Supplier<String> messageSupplier) {
        if (expected != actual) {
            E(Short.valueOf(expected), Short.valueOf(actual), messageSupplier);
        }
    }

    public static void E(Object expected, Object actual, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).g(expected).a(actual).d();
    }

    public static void a(byte expected, byte actual) {
        b(expected, actual, null);
    }

    public static void b(byte expected, byte actual, String message) {
        if (expected != actual) {
            E(Byte.valueOf(expected), Byte.valueOf(actual), message);
        }
    }

    public static void c(byte expected, byte actual, Supplier<String> messageSupplier) {
        if (expected != actual) {
            E(Byte.valueOf(expected), Byte.valueOf(actual), messageSupplier);
        }
    }

    public static void d(char expected, char actual) {
        e(expected, actual, null);
    }

    public static void e(char expected, char actual, String message) {
        if (expected != actual) {
            E(Character.valueOf(expected), Character.valueOf(actual), message);
        }
    }

    public static void f(char expected, char actual, Supplier<String> messageSupplier) {
        if (expected != actual) {
            E(Character.valueOf(expected), Character.valueOf(actual), messageSupplier);
        }
    }

    public static void g(double expected, double actual) {
        k(expected, actual, null);
    }

    public static void h(double expected, double actual, double delta) {
        i(expected, actual, delta, null);
    }

    public static void i(double expected, double actual, double delta, String message) {
        if (l0.d(expected, actual, delta)) {
            return;
        }
        E(Double.valueOf(expected), Double.valueOf(actual), message);
    }

    public static void j(double expected, double actual, double delta, Supplier<String> messageSupplier) {
        if (l0.d(expected, actual, delta)) {
            return;
        }
        E(Double.valueOf(expected), Double.valueOf(actual), messageSupplier);
    }

    public static void k(double expected, double actual, String message) {
        if (l0.c(expected, actual)) {
            return;
        }
        E(Double.valueOf(expected), Double.valueOf(actual), message);
    }

    public static void l(double expected, double actual, Supplier<String> messageSupplier) {
        if (l0.c(expected, actual)) {
            return;
        }
        E(Double.valueOf(expected), Double.valueOf(actual), messageSupplier);
    }

    public static void m(float expected, float actual) {
        q(expected, actual, null);
    }

    public static void n(float expected, float actual, float delta) {
        o(expected, actual, delta, null);
    }

    public static void o(float expected, float actual, float delta, String message) {
        if (l0.l(expected, actual, delta)) {
            return;
        }
        E(Float.valueOf(expected), Float.valueOf(actual), message);
    }

    public static void p(float expected, float actual, float delta, Supplier<String> messageSupplier) {
        if (l0.l(expected, actual, delta)) {
            return;
        }
        E(Float.valueOf(expected), Float.valueOf(actual), messageSupplier);
    }

    public static void q(float expected, float actual, String message) {
        if (l0.k(expected, actual)) {
            return;
        }
        E(Float.valueOf(expected), Float.valueOf(actual), message);
    }

    public static void r(float expected, float actual, Supplier<String> messageSupplier) {
        if (l0.k(expected, actual)) {
            return;
        }
        E(Float.valueOf(expected), Float.valueOf(actual), messageSupplier);
    }

    public static void s(int expected, int actual) {
        t(expected, actual, null);
    }

    public static void t(int expected, int actual, String message) {
        if (expected != actual) {
            E(Integer.valueOf(expected), Integer.valueOf(actual), message);
        }
    }

    public static void u(int expected, int actual, Supplier<String> messageSupplier) {
        if (expected != actual) {
            E(Integer.valueOf(expected), Integer.valueOf(actual), messageSupplier);
        }
    }

    public static void v(long expected, long actual) {
        w(expected, actual, null);
    }

    public static void w(long expected, long actual, String message) {
        if (expected != actual) {
            E(Long.valueOf(expected), Long.valueOf(actual), message);
        }
    }

    public static void x(long expected, long actual, Supplier<String> messageSupplier) {
        if (expected != actual) {
            E(Long.valueOf(expected), Long.valueOf(actual), messageSupplier);
        }
    }

    public static void y(Object expected, Object actual) {
        z(expected, actual, null);
    }

    public static void z(Object expected, Object actual, String message) {
        if (l0.p(expected, actual)) {
            return;
        }
        E(expected, actual, message);
    }
}
