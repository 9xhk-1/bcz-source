package z90;

import ba0.c2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.support.HierarchyTraversalMode;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public final class i {
    public static List<Class<?>> a(URI root, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return ReflectionUtils.U(root, classFilter, classNameFilter);
    }

    public static List<Class<?>> b(String moduleName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return ReflectionUtils.W(moduleName, classFilter, classNameFilter);
    }

    public static List<Class<?>> c(String basePackageName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return ReflectionUtils.Y(basePackageName, classFilter, classNameFilter);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static List<j> d(URI root, Predicate<j> resourceFilter) {
        return ReflectionUtils.b0(root, resourceFilter);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static List<j> e(String moduleName, Predicate<j> resourceFilter) {
        return ReflectionUtils.c0(moduleName, resourceFilter);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static List<j> f(String basePackageName, Predicate<j> resourceFilter) {
        return ReflectionUtils.d0(basePackageName, resourceFilter);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static List<Field> g(Class<?> clazz, Predicate<Field> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return ReflectionUtils.f0(clazz, predicate, ReflectionUtils.HierarchyTraversalMode.valueOf(traversalMode.name()));
    }

    public static Optional<Method> h(Class<?> clazz, String methodName, String parameterTypeNames) {
        return ReflectionUtils.h0(clazz, methodName, parameterTypeNames);
    }

    public static Optional<Method> i(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        return ReflectionUtils.i0(clazz, methodName, parameterTypes);
    }

    public static List<Method> j(Class<?> clazz, Predicate<Method> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return ReflectionUtils.l0(clazz, predicate, ReflectionUtils.HierarchyTraversalMode.valueOf(traversalMode.name()));
    }

    public static List<Class<?>> k(Class<?> clazz, Predicate<Class<?>> predicate) throws JUnitException {
        return ReflectionUtils.m0(clazz, predicate);
    }

    public static Object l(Method method, Object target, Object... args) {
        return ReflectionUtils.L0(method, target, args);
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static Optional<Class<?>> m(String name) {
        return ReflectionUtils.r1(name);
    }

    public static <T> T n(Class<T> cls, Object... objArr) {
        return (T) ReflectionUtils.x1(cls, objArr);
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static Stream<Class<?>> o(URI root, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return ReflectionUtils.J1(root, classFilter, classNameFilter);
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static Stream<Class<?>> p(String moduleName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return ReflectionUtils.L1(moduleName, classFilter, classNameFilter);
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static Stream<Class<?>> q(String basePackageName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return ReflectionUtils.N1(basePackageName, classFilter, classNameFilter);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Stream<j> r(URI root, Predicate<j> resourceFilter) {
        return ReflectionUtils.O1(root, resourceFilter);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Stream<j> s(String moduleName, Predicate<j> resourceFilter) {
        return ReflectionUtils.P1(moduleName, resourceFilter);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Stream<j> t(String basePackageName, Predicate<j> resourceFilter) {
        return ReflectionUtils.Q1(basePackageName, resourceFilter);
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static Stream<Field> u(Class<?> clazz, Predicate<Field> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return ReflectionUtils.R1(clazz, predicate, ReflectionUtils.HierarchyTraversalMode.valueOf(traversalMode.name()));
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static Stream<Method> v(Class<?> clazz, Predicate<Method> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return ReflectionUtils.S1(clazz, predicate, ReflectionUtils.HierarchyTraversalMode.valueOf(traversalMode.name()));
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static Stream<Class<?>> w(Class<?> clazz, Predicate<Class<?>> predicate) throws JUnitException {
        return ReflectionUtils.T1(clazz, predicate);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static x90.b<Class<?>> x(String name) {
        return ReflectionUtils.X1(name);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static x90.b<Class<?>> y(String name, ClassLoader classLoader) {
        return ReflectionUtils.Y1(name, classLoader);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static x90.b<Object> z(Field field, Object instance) {
        return ReflectionUtils.b2(field, instance);
    }
}
