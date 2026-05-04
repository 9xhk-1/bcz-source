package w80;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Consumer;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y2 {
    public static void d(Class<? extends Annotation> annotationType, Method method) {
        if (ReflectionUtils.o1(method)) {
            throw new JUnitException(String.format("@%s method '%s' must not be static.", annotationType.getSimpleName(), method.toGenericString()));
        }
    }

    public static void e(Class<? extends Annotation> annotationType, Method method) {
        if (ReflectionUtils.g1(method)) {
            throw new JUnitException(String.format("@%s method '%s' must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).", annotationType.getSimpleName(), method.toGenericString()));
        }
    }

    public static void f(Class<? extends Annotation> annotationType, Method method) {
        if (!ReflectionUtils.H1(method)) {
            throw new JUnitException(String.format("@%s method '%s' must not return a value.", annotationType.getSimpleName(), method.toGenericString()));
        }
    }

    public static List<Method> g(Class<?> testClass, boolean requireStatic) {
        return l(testClass, requireStatic, org.junit.jupiter.api.a.class, ReflectionUtils.HierarchyTraversalMode.BOTTOM_UP);
    }

    public static List<Method> h(Class<?> testClass) {
        return k(testClass, org.junit.jupiter.api.b.class, ReflectionUtils.HierarchyTraversalMode.BOTTOM_UP);
    }

    public static List<Method> i(Class<?> testClass, boolean requireStatic) {
        return l(testClass, requireStatic, org.junit.jupiter.api.b1.class, ReflectionUtils.HierarchyTraversalMode.TOP_DOWN);
    }

    public static List<Method> j(Class<?> testClass) {
        return k(testClass, org.junit.jupiter.api.c1.class, ReflectionUtils.HierarchyTraversalMode.TOP_DOWN);
    }

    public static List<Method> k(Class<?> testClass, final Class<? extends Annotation> annotationType, ReflectionUtils.HierarchyTraversalMode traversalMode) {
        List<Method> m11 = m(testClass, annotationType, traversalMode);
        m11.forEach(new Consumer() { // from class: w80.x2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                y2.d(annotationType, (Method) obj);
            }
        });
        return m11;
    }

    public static List<Method> l(Class<?> testClass, boolean requireStatic, final Class<? extends Annotation> annotationType, ReflectionUtils.HierarchyTraversalMode traversalMode) {
        List<Method> m11 = m(testClass, annotationType, traversalMode);
        if (requireStatic) {
            m11.forEach(new Consumer() { // from class: w80.v2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    y2.e(annotationType, (Method) obj);
                }
            });
        }
        return m11;
    }

    public static List<Method> m(Class<?> testClass, final Class<? extends Annotation> annotationType, ReflectionUtils.HierarchyTraversalMode traversalMode) {
        List<Method> k11 = org.junit.platform.commons.util.a.k(testClass, annotationType, traversalMode);
        k11.forEach(new Consumer() { // from class: w80.w2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                y2.f(annotationType, (Method) obj);
            }
        });
        return k11;
    }
}
