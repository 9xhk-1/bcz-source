package w80;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.z1;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y90.e f95751a = y90.g.c(b1.class);

    /* renamed from: b, reason: collision with root package name */
    public static final org.junit.jupiter.api.z1 f95752b = org.junit.jupiter.api.z1.c(z1.d.class);

    /* renamed from: c, reason: collision with root package name */
    public static final org.junit.jupiter.api.z1 f95753c = org.junit.jupiter.api.z1.c(z1.c.class);

    /* renamed from: d, reason: collision with root package name */
    public static final org.junit.jupiter.api.z1 f95754d = org.junit.jupiter.api.z1.c(z1.b.class);

    /* renamed from: e, reason: collision with root package name */
    public static final org.junit.jupiter.api.z1 f95755e = org.junit.jupiter.api.z1.c(z1.a.class);

    public static /* synthetic */ org.junit.jupiter.api.z1 a(Class cls) {
        return cls == z1.d.class ? f95752b : cls == z1.c.class ? f95753c : cls == z1.b.class ? f95754d : cls == z1.a.class ? f95755e : (org.junit.jupiter.api.z1) ReflectionUtils.x1(cls, new Object[0]);
    }

    public static /* synthetic */ String b(Class cls, final Function function, final v80.e0 e0Var) {
        return (String) n(cls).map(function).orElseGet(new Supplier() { // from class: w80.w0
            @Override // java.util.function.Supplier
            public final Object get() {
                return b1.c(function, e0Var);
            }
        });
    }

    public static /* synthetic */ String c(Function function, v80.e0 e0Var) {
        return (String) function.apply(e0Var.c());
    }

    public static Supplier<String> h(final Class<?> testClass, final v80.e0 configuration, final Function<org.junit.jupiter.api.z1, String> generatorFunction) {
        return new Supplier() { // from class: w80.x0
            @Override // java.util.function.Supplier
            public final Object get() {
                return b1.b(testClass, generatorFunction, configuration);
            }
        };
    }

    public static Supplier<String> i(final Class<?> testClass, v80.e0 configuration) {
        return h(testClass, configuration, new Function() { // from class: w80.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String a11;
                a11 = ((org.junit.jupiter.api.z1) obj).a(testClass);
                return a11;
            }
        });
    }

    public static Supplier<String> j(final Class<?> testClass, final Method testMethod, v80.e0 configuration) {
        return h(testClass, configuration, new Function() { // from class: w80.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String e11;
                e11 = ((org.junit.jupiter.api.z1) obj).e(testClass, testMethod);
                return e11;
            }
        });
    }

    public static Supplier<String> k(final Class<?> testClass, v80.e0 configuration) {
        return h(testClass, configuration, new Function() { // from class: w80.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String d11;
                d11 = ((org.junit.jupiter.api.z1) obj).d(testClass);
                return d11;
            }
        });
    }

    public static String l(final AnnotatedElement element, Supplier<String> displayNameSupplier) {
        ba0.c2.r(element, "Annotated element must not be null");
        Optional m11 = org.junit.platform.commons.util.a.m(element, org.junit.jupiter.api.n1.class);
        if (m11.isPresent()) {
            String trim = ((org.junit.jupiter.api.n1) m11.get()).value().trim();
            if (!ba0.e4.g(trim)) {
                return trim;
            }
            f95751a.f(new Supplier() { // from class: w80.u0
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Configuration error: @DisplayName on [%s] must be declared with a non-empty value.", element);
                    return format;
                }
            });
        }
        return displayNameSupplier.get();
    }

    public static String m(Class<?> testClass, Method testMethod, v80.e0 configuration) {
        return l(testMethod, j(testClass, testMethod, configuration));
    }

    public static Optional<org.junit.jupiter.api.z1> n(Class<?> testClass) {
        ba0.c2.r(testClass, "Test class must not be null");
        return org.junit.platform.commons.util.a.l(testClass, org.junit.jupiter.api.o1.class, true).map(new org.junit.jupiter.api.u1()).map(new Function() { // from class: w80.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b1.a((Class) obj);
            }
        });
    }
}
