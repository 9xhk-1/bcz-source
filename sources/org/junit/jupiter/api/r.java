package org.junit.jupiter.api;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r {
    public static void A(Object unexpected, Object actual, Supplier<String> messageSupplier) {
        if (l0.p(unexpected, actual)) {
            E(actual, messageSupplier);
        }
    }

    public static void B(short unexpected, short actual) {
        C(unexpected, actual, null);
    }

    public static void C(short unexpected, short actual, String message) {
        if (unexpected == actual) {
            E(Short.valueOf(actual), message);
        }
    }

    public static void D(short unexpected, short actual, Supplier<String> messageSupplier) {
        if (unexpected == actual) {
            E(Short.valueOf(actual), messageSupplier);
        }
    }

    public static void E(Object actual, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("expected: not equal but was: <" + actual + ">").d();
    }

    public static void a(byte unexpected, byte actual) {
        b(unexpected, actual, null);
    }

    public static void b(byte unexpected, byte actual, String message) {
        if (unexpected == actual) {
            E(Byte.valueOf(actual), message);
        }
    }

    public static void c(byte unexpected, byte actual, Supplier<String> messageSupplier) {
        if (unexpected == actual) {
            E(Byte.valueOf(actual), messageSupplier);
        }
    }

    public static void d(char unexpected, char actual) {
        e(unexpected, actual, null);
    }

    public static void e(char unexpected, char actual, String message) {
        if (unexpected == actual) {
            E(Character.valueOf(actual), message);
        }
    }

    public static void f(char unexpected, char actual, Supplier<String> messageSupplier) {
        if (unexpected == actual) {
            E(Character.valueOf(actual), messageSupplier);
        }
    }

    public static void g(double unexpected, double actual) {
        k(unexpected, actual, null);
    }

    public static void h(double unexpected, double actual, double delta) {
        i(unexpected, actual, delta, null);
    }

    public static void i(double unexpected, double actual, double delta, String message) {
        if (l0.d(unexpected, actual, delta)) {
            E(Double.valueOf(actual), message);
        }
    }

    public static void j(double unexpected, double actual, double delta, Supplier<String> messageSupplier) {
        if (l0.d(unexpected, actual, delta)) {
            E(Double.valueOf(actual), messageSupplier);
        }
    }

    public static void k(double unexpected, double actual, String message) {
        if (l0.c(unexpected, actual)) {
            E(Double.valueOf(actual), message);
        }
    }

    public static void l(double unexpected, double actual, Supplier<String> messageSupplier) {
        if (l0.c(unexpected, actual)) {
            E(Double.valueOf(actual), messageSupplier);
        }
    }

    public static void m(float unexpected, float actual) {
        q(unexpected, actual, null);
    }

    public static void n(float unexpected, float actual, float delta) {
        o(unexpected, actual, delta, null);
    }

    public static void o(float unexpected, float actual, float delta, String message) {
        if (l0.l(unexpected, actual, delta)) {
            E(Float.valueOf(actual), message);
        }
    }

    public static void p(float unexpected, float actual, float delta, Supplier<String> messageSupplier) {
        if (l0.l(unexpected, actual, delta)) {
            E(Float.valueOf(actual), messageSupplier);
        }
    }

    public static void q(float unexpected, float actual, String message) {
        if (l0.k(unexpected, actual)) {
            E(Float.valueOf(actual), message);
        }
    }

    public static void r(float unexpected, float actual, Supplier<String> messageSupplier) {
        if (l0.k(unexpected, actual)) {
            E(Float.valueOf(actual), messageSupplier);
        }
    }

    public static void s(int unexpected, int actual) {
        t(unexpected, actual, null);
    }

    public static void t(int unexpected, int actual, String message) {
        if (unexpected == actual) {
            E(Integer.valueOf(actual), message);
        }
    }

    public static void u(int unexpected, int actual, Supplier<String> messageSupplier) {
        if (unexpected == actual) {
            E(Integer.valueOf(actual), messageSupplier);
        }
    }

    public static void v(long unexpected, long actual) {
        w(unexpected, actual, null);
    }

    public static void w(long unexpected, long actual, String message) {
        if (unexpected == actual) {
            E(Long.valueOf(actual), message);
        }
    }

    public static void x(long unexpected, long actual, Supplier<String> messageSupplier) {
        if (unexpected == actual) {
            E(Long.valueOf(actual), messageSupplier);
        }
    }

    public static void y(Object unexpected, Object actual) {
        z(unexpected, actual, null);
    }

    public static void z(Object unexpected, Object actual, String message) {
        if (l0.p(unexpected, actual)) {
            E(actual, message);
        }
    }
}
