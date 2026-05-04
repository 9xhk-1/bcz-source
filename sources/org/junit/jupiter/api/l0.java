package org.junit.jupiter.api;

import ba0.h4;
import java.util.Deque;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.opentest4j.AssertionFailedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l0 {
    public static void a(double delta) {
        if (Double.isNaN(delta) || delta < 0.0d) {
            j(String.valueOf(delta));
        }
    }

    public static void b(float delta) {
        if (Float.isNaN(delta) || delta < 0.0d) {
            j(String.valueOf(delta));
        }
    }

    public static boolean c(double value1, double value2) {
        return Double.doubleToLongBits(value1) == Double.doubleToLongBits(value2);
    }

    public static boolean d(double value1, double value2, double delta) {
        a(delta);
        return c(value1, value2) || Math.abs(value1 - value2) <= delta;
    }

    public static void e() {
        throw new AssertionFailedError();
    }

    public static void f(String message) {
        throw new AssertionFailedError(message);
    }

    public static void g(String message, Throwable cause) {
        throw new AssertionFailedError(message, cause);
    }

    public static void h(Throwable cause) {
        throw new AssertionFailedError(null, cause);
    }

    public static void i(Supplier<String> messageSupplier) {
        throw new AssertionFailedError(o(messageSupplier));
    }

    public static void j(String delta) {
        f("positive delta expected but was: <" + delta + ">");
    }

    public static boolean k(float value1, float value2) {
        return Float.floatToIntBits(value1) == Float.floatToIntBits(value2);
    }

    public static boolean l(float value1, float value2, float delta) {
        b(delta);
        return k(value1, value2) || Math.abs(value1 - value2) <= delta;
    }

    public static String m(Deque<Integer> indexes) {
        if (indexes == null || indexes.isEmpty()) {
            return "";
        }
        return " at index " + ((String) indexes.stream().map(new Function() { // from class: org.junit.jupiter.api.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Integer) obj).toString();
            }
        }).collect(Collectors.joining("][", "[", "]")));
    }

    public static String n(Class<?> clazz) {
        try {
            String canonicalName = clazz.getCanonicalName();
            return canonicalName != null ? canonicalName : clazz.getName();
        } catch (Throwable th2) {
            h4.a(th2);
            return clazz.getName();
        }
    }

    public static String o(Supplier<String> messageSupplier) {
        if (messageSupplier != null) {
            return messageSupplier.get();
        }
        return null;
    }

    public static boolean p(Object obj1, Object obj2) {
        return obj1 == null ? obj2 == null : obj1.equals(obj2);
    }
}
