package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.y0(version = "1.4")
    public static class a {
    }

    public static <T extends Throwable> T A(T t11) {
        return (T) B(t11, g0.class.getName());
    }

    public static <T extends Throwable> T B(T t11, String str) {
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(stackTrace[i12].getClassName())) {
                i11 = i12;
            }
        }
        t11.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11 + 1, length));
        return t11;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @yz.y0(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @yz.y0(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((KotlinNullPointerException) A(new KotlinNullPointerException()));
    }

    public static void M(String str) {
        throw ((KotlinNullPointerException) A(new KotlinNullPointerException(str)));
    }

    public static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    public static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((UninitializedPropertyAccessException) A(new UninitializedPropertyAccessException(str)));
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
    }

    @yz.y0(version = "1.1")
    public static boolean a(double d11, Double d12) {
        return d12 != null && d11 == d12.doubleValue();
    }

    @yz.y0(version = "1.1")
    public static boolean b(float f11, Float f12) {
        return f12 != null && f11 == f12.floatValue();
    }

    @yz.y0(version = "1.1")
    public static boolean c(Double d11, double d12) {
        return d11 != null && d11.doubleValue() == d12;
    }

    @yz.y0(version = "1.1")
    public static boolean d(Double d11, Double d12) {
        return d11 == null ? d12 == null : d12 != null && d11.doubleValue() == d12.doubleValue();
    }

    @yz.y0(version = "1.1")
    public static boolean e(Float f11, float f12) {
        return f11 != null && f11.floatValue() == f12;
    }

    @yz.y0(version = "1.1")
    public static boolean f(Float f11, Float f12) {
        return f11 == null ? f12 == null : f12 != null && f11.floatValue() == f12.floatValue();
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e11) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e11)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e11) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e11)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) A(new NullPointerException(str + " must not be null")));
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void s(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    public static int t(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    public static int u(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = g0.class.getName();
        int i11 = 0;
        while (!stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        while (stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        StackTraceElement stackTraceElement = stackTrace[i11];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i11, String str) {
        P();
    }

    public static void z(int i11, String str, String str2) {
        Q(str2);
    }
}
