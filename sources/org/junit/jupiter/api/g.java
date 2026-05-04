package org.junit.jupiter.api;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.function.Supplier;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g {
    public static void A(int[] expected, int[] actual, String message) {
        B(expected, actual, null, message);
    }

    public static void B(int[] expected, int[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            int i12 = expected[i11];
            if (i12 != actual[i11]) {
                W(Integer.valueOf(i12), Integer.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void C(int[] expected, int[] actual, Supplier<String> messageSupplier) {
        B(expected, actual, null, messageSupplier);
    }

    public static void D(long[] expected, long[] actual) {
        E(expected, actual, null);
    }

    public static void E(long[] expected, long[] actual, String message) {
        F(expected, actual, null, message);
    }

    public static void F(long[] expected, long[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            long j11 = expected[i11];
            if (j11 != actual[i11]) {
                W(Long.valueOf(j11), Long.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void G(long[] expected, long[] actual, Supplier<String> messageSupplier) {
        F(expected, actual, null, messageSupplier);
    }

    public static void H(Object[] expected, Object[] actual) {
        I(expected, actual, null);
    }

    public static void I(Object[] expected, Object[] actual, String message) {
        J(expected, actual, new ArrayDeque(), message);
    }

    public static void J(Object[] expected, Object[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            Object obj = expected[i11];
            Object obj2 = actual[i11];
            if (obj != obj2) {
                indexes.addLast(Integer.valueOf(i11));
                a(obj, obj2, indexes, messageOrSupplier);
                indexes.removeLast();
            }
        }
    }

    public static void K(Object[] expected, Object[] actual, Supplier<String> messageSupplier) {
        J(expected, actual, new ArrayDeque(), messageSupplier);
    }

    public static void L(short[] expected, short[] actual) {
        M(expected, actual, null);
    }

    public static void M(short[] expected, short[] actual, String message) {
        N(expected, actual, null, message);
    }

    public static void N(short[] expected, short[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            short s11 = expected[i11];
            if (s11 != actual[i11]) {
                W(Short.valueOf(s11), Short.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void O(short[] expected, short[] actual, Supplier<String> messageSupplier) {
        N(expected, actual, null, messageSupplier);
    }

    public static void P(boolean[] expected, boolean[] actual) {
        Q(expected, actual, null);
    }

    public static void Q(boolean[] expected, boolean[] actual, String message) {
        R(expected, actual, null, message);
    }

    public static void R(boolean[] expected, boolean[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            boolean z11 = expected[i11];
            if (z11 != actual[i11]) {
                W(Boolean.valueOf(z11), Boolean.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void S(boolean[] expected, boolean[] actual, Supplier<String> messageSupplier) {
        R(expected, actual, null, messageSupplier);
    }

    public static void T(int expected, int actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected != actual) {
            j0.b().l(messageOrSupplier).n("array lengths differ" + l0.m(indexes)).g(Integer.valueOf(expected)).a(Integer.valueOf(actual)).d();
        }
    }

    public static void U(Object expected, Object actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == null) {
            X(indexes, messageOrSupplier);
        }
        if (actual == null) {
            V(indexes, messageOrSupplier);
        }
    }

    public static void V(Deque<Integer> indexes, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("actual array was <null>" + l0.m(indexes)).d();
    }

    public static void W(Object expected, Object actual, Deque<Integer> indexes, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("array contents differ" + l0.m(indexes)).g(expected).a(actual).d();
    }

    public static void X(Deque<Integer> indexes, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("expected array was <null>" + l0.m(indexes)).d();
    }

    public static Deque<Integer> Y(Deque<Integer> indexes, int newIndex) {
        if (indexes == null) {
            indexes = new ArrayDeque<>();
        }
        indexes.addLast(Integer.valueOf(newIndex));
        return indexes;
    }

    public static void a(Object expected, Object actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if ((expected instanceof Object[]) && (actual instanceof Object[])) {
            J((Object[]) expected, (Object[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof byte[]) && (actual instanceof byte[])) {
            d((byte[]) expected, (byte[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof short[]) && (actual instanceof short[])) {
            N((short[]) expected, (short[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof int[]) && (actual instanceof int[])) {
            B((int[]) expected, (int[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof long[]) && (actual instanceof long[])) {
            F((long[]) expected, (long[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof char[]) && (actual instanceof char[])) {
            h((char[]) expected, (char[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof float[]) && (actual instanceof float[])) {
            x((float[]) expected, (float[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof double[]) && (actual instanceof double[])) {
            p((double[]) expected, (double[]) actual, indexes, messageOrSupplier);
            return;
        }
        if ((expected instanceof boolean[]) && (actual instanceof boolean[])) {
            R((boolean[]) expected, (boolean[]) actual, indexes, messageOrSupplier);
            return;
        }
        if (Objects.equals(expected, actual)) {
            return;
        }
        if (expected == null && ReflectionUtils.O0(actual)) {
            X(indexes, messageOrSupplier);
        } else if (ReflectionUtils.O0(expected) && actual == null) {
            V(indexes, messageOrSupplier);
        } else {
            W(expected, actual, indexes, messageOrSupplier);
        }
    }

    public static void b(byte[] expected, byte[] actual) {
        c(expected, actual, null);
    }

    public static void c(byte[] expected, byte[] actual, String message) {
        d(expected, actual, null, message);
    }

    public static void d(byte[] expected, byte[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            byte b11 = expected[i11];
            if (b11 != actual[i11]) {
                W(Byte.valueOf(b11), Byte.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void e(byte[] expected, byte[] actual, Supplier<String> messageSupplier) {
        d(expected, actual, null, messageSupplier);
    }

    public static void f(char[] expected, char[] actual) {
        g(expected, actual, null);
    }

    public static void g(char[] expected, char[] actual, String message) {
        h(expected, actual, null, message);
    }

    public static void h(char[] expected, char[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            char c11 = expected[i11];
            if (c11 != actual[i11]) {
                W(Character.valueOf(c11), Character.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void i(char[] expected, char[] actual, Supplier<String> messageSupplier) {
        h(expected, actual, null, messageSupplier);
    }

    public static void j(double[] expected, double[] actual) {
        o(expected, actual, null);
    }

    public static void k(double[] expected, double[] actual, double delta) {
        l(expected, actual, delta, null);
    }

    public static void l(double[] expected, double[] actual, double delta, String message) {
        m(expected, actual, delta, null, message);
    }

    public static void m(double[] expected, double[] actual, double delta, Deque<Integer> indexes, Object messageOrSupplier) {
        l0.a(delta);
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        int i11 = 0;
        while (i11 < expected.length) {
            double d11 = delta;
            if (!l0.d(expected[i11], actual[i11], d11)) {
                W(Double.valueOf(expected[i11]), Double.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
            i11++;
            delta = d11;
        }
    }

    public static void n(double[] expected, double[] actual, double delta, Supplier<String> messageSupplier) {
        m(expected, actual, delta, null, messageSupplier);
    }

    public static void o(double[] expected, double[] actual, String message) {
        p(expected, actual, null, message);
    }

    public static void p(double[] expected, double[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            if (!l0.c(expected[i11], actual[i11])) {
                W(Double.valueOf(expected[i11]), Double.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void q(double[] expected, double[] actual, Supplier<String> messageSupplier) {
        p(expected, actual, null, messageSupplier);
    }

    public static void r(float[] expected, float[] actual) {
        w(expected, actual, null);
    }

    public static void s(float[] expected, float[] actual, float delta) {
        t(expected, actual, delta, null);
    }

    public static void t(float[] expected, float[] actual, float delta, String message) {
        u(expected, actual, delta, null, message);
    }

    public static void u(float[] expected, float[] actual, float delta, Deque<Integer> indexes, Object messageOrSupplier) {
        l0.b(delta);
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            if (!l0.l(expected[i11], actual[i11], delta)) {
                W(Float.valueOf(expected[i11]), Float.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void v(float[] expected, float[] actual, float delta, Supplier<String> messageSupplier) {
        u(expected, actual, delta, null, messageSupplier);
    }

    public static void w(float[] expected, float[] actual, String message) {
        x(expected, actual, null, message);
    }

    public static void x(float[] expected, float[] actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == actual) {
            return;
        }
        U(expected, actual, indexes, messageOrSupplier);
        T(expected.length, actual.length, indexes, messageOrSupplier);
        for (int i11 = 0; i11 < expected.length; i11++) {
            if (!l0.k(expected[i11], actual[i11])) {
                W(Float.valueOf(expected[i11]), Float.valueOf(actual[i11]), Y(indexes, i11), messageOrSupplier);
            }
        }
    }

    public static void y(float[] expected, float[] actual, Supplier<String> messageSupplier) {
        x(expected, actual, null, messageSupplier);
    }

    public static void z(int[] expected, int[] actual) {
        A(expected, actual, null);
    }
}
