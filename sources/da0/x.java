package da0;

import ba0.c2;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.discovery.FilePosition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public final class x {
    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static j1 A(ClassLoader classLoader, String className, String methodName, String parameterTypeNames) {
        c2.k(className, "Class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypeNames, "Parameter type names must not be null");
        return new j1(classLoader, className, methodName, parameterTypeNames.trim());
    }

    public static j1 B(String fullyQualifiedMethodName) throws PreconditionViolationException {
        return y(null, fullyQualifiedMethodName);
    }

    public static j1 C(String className, String methodName) {
        return z(null, className, methodName);
    }

    public static j1 D(String className, String methodName, String parameterTypeNames) {
        return A(null, className, methodName, parameterTypeNames);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static j1 E(String className, String methodName, Class<?>... parameterTypes) {
        c2.k(className, "Class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypes, "Parameter types array must not be null");
        c2.i(parameterTypes, "Parameter types array must not contain null elements");
        return new j1((ClassLoader) null, className, methodName, parameterTypes);
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public static k1 F(String moduleName) {
        c2.k(moduleName, "Module name must not be null or blank");
        return new k1(moduleName.trim());
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public static List<k1> G(Set<String> moduleNames) {
        c2.r(moduleNames, "Module names must not be null");
        c2.g(moduleNames, "Individual module name must not be null");
        return (List) moduleNames.stream().map(new Function() { // from class: da0.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.F((String) obj);
            }
        }).collect(ba0.n1.j());
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static p1 H(ClassLoader classLoader, List<String> enclosingClassNames, String nestedClassName) {
        c2.m(enclosingClassNames, "Enclosing class names must not be null or empty");
        c2.k(nestedClassName, "Nested class name must not be null or blank");
        return new p1(classLoader, enclosingClassNames, nestedClassName);
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static p1 I(List<Class<?>> enclosingClasses, Class<?> nestedClass) {
        c2.m(enclosingClasses, "Enclosing classes must not be null or empty");
        c2.r(nestedClass, "Nested class must not be null");
        return new p1(enclosingClasses, nestedClass);
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static p1 J(List<String> enclosingClassNames, String nestedClassName) {
        return H(null, enclosingClassNames, nestedClassName);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static r1 K(ClassLoader classLoader, List<String> enclosingClassNames, String nestedClassName, String methodName) throws PreconditionViolationException {
        c2.m(enclosingClassNames, "Enclosing class names must not be null or empty");
        c2.k(nestedClassName, "Nested class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        return new r1(classLoader, enclosingClassNames, nestedClassName, methodName, "");
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static r1 L(ClassLoader classLoader, List<String> enclosingClassNames, String nestedClassName, String methodName, String parameterTypeNames) {
        c2.m(enclosingClassNames, "Enclosing class names must not be null or empty");
        c2.k(nestedClassName, "Nested class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypeNames, "Parameter types must not be null");
        return new r1(classLoader, enclosingClassNames, nestedClassName, methodName, parameterTypeNames.trim());
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static r1 M(List<Class<?>> enclosingClasses, Class<?> nestedClass, String methodName) {
        return N(enclosingClasses, nestedClass, methodName, "");
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static r1 N(List<Class<?>> enclosingClasses, Class<?> nestedClass, String methodName, String parameterTypeNames) {
        c2.m(enclosingClasses, "Enclosing classes must not be null or empty");
        c2.r(nestedClass, "Nested class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypeNames, "Parameter types must not be null");
        return new r1(enclosingClasses, nestedClass, methodName, parameterTypeNames.trim());
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static r1 O(List<Class<?>> enclosingClasses, Class<?> nestedClass, String methodName, Class<?>... parameterTypes) {
        c2.m(enclosingClasses, "Enclosing classes must not be null or empty");
        c2.r(nestedClass, "Nested class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypes, "Parameter types array must not be null");
        c2.i(parameterTypes, "Parameter types array must not contain null elements");
        return new r1(enclosingClasses, nestedClass, methodName, parameterTypes);
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static r1 P(List<Class<?>> enclosingClasses, Class<?> nestedClass, Method method) {
        c2.m(enclosingClasses, "Enclosing classes must not be null or empty");
        c2.r(nestedClass, "Nested class must not be null");
        c2.r(method, "Method must not be null");
        return new r1(enclosingClasses, nestedClass, method);
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static r1 Q(List<String> enclosingClassNames, String nestedClassName, String methodName) {
        return K(null, enclosingClassNames, nestedClassName, methodName);
    }

    @API(since = "1.6", status = API.Status.STABLE)
    public static r1 R(List<String> enclosingClassNames, String nestedClassName, String methodName, String parameterTypeNames) {
        return L(null, enclosingClassNames, nestedClassName, methodName, parameterTypeNames);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static r1 S(List<String> enclosingClassNames, String nestedClassName, String methodName, Class<?>... parameterTypes) {
        c2.m(enclosingClassNames, "Enclosing class names must not be null or empty");
        c2.k(nestedClassName, "Nested class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypes, "Parameter types array must not be null");
        c2.i(parameterTypes, "Parameter types array must not contain null elements");
        return new r1((ClassLoader) null, enclosingClassNames, nestedClassName, methodName, parameterTypes);
    }

    public static t1 T(String packageName) {
        c2.r(packageName, "Package name must not be null");
        c2.e(packageName.isEmpty() || !packageName.trim().isEmpty(), "Package name must not contain only whitespace");
        return new t1(packageName.trim());
    }

    public static u1 U(String uniqueId) {
        c2.k(uniqueId, "Unique ID must not be null or blank");
        return new u1(UniqueId.parse(uniqueId));
    }

    public static u1 V(UniqueId uniqueId) {
        c2.r(uniqueId, "UniqueId must not be null");
        return new u1(uniqueId);
    }

    public static v1 W(String uri) {
        c2.k(uri, "URI must not be null or blank");
        try {
            return new v1(new URI(uri));
        } catch (URISyntaxException e11) {
            throw new PreconditionViolationException("Failed to create a java.net.URI from: " + uri, e11);
        }
    }

    public static v1 X(URI uri) {
        c2.r(uri, "URI must not be null");
        return new v1(uri);
    }

    public static /* synthetic */ boolean a(Path path) {
        boolean exists;
        exists = Files.exists(path, new LinkOption[0]);
        return exists;
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Optional<? extends ca0.l> d(ca0.o identifier) {
        return q.a(identifier);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Optional<? extends ca0.l> e(String identifier) {
        return q.b(identifier);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Stream<? extends ca0.l> f(Collection<ca0.o> identifiers) {
        return q.c(identifiers);
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public static Stream<? extends ca0.l> g(String... identifiers) {
        return q.d(identifiers);
    }

    public static e h(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return new e(clazz);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static e i(ClassLoader classLoader, String className) {
        c2.k(className, "Class name must not be null or blank");
        return new e(classLoader, className);
    }

    public static e j(String className) {
        return i(null, className);
    }

    public static h k(String classpathResourceName) {
        return l(classpathResourceName, null);
    }

    public static h l(String classpathResourceName, FilePosition position) {
        c2.k(classpathResourceName, "Classpath resource name must not be null or blank");
        return new h(classpathResourceName, position);
    }

    public static List<i> m(Set<Path> classpathRoots) {
        c2.r(classpathRoots, "classpathRoots must not be null");
        return (List) classpathRoots.stream().filter(new Predicate() { // from class: da0.u
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return x.a((Path) obj);
            }
        }).map(new Function() { // from class: da0.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                URI uri;
                uri = ((Path) obj).toUri();
                return uri;
            }
        }).map(new Function() { // from class: da0.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new i((URI) obj);
            }
        }).collect(ba0.n1.j());
    }

    public static j n(final File directory) {
        c2.r(directory, "Directory must not be null");
        c2.f(directory.isDirectory(), new Supplier() { // from class: da0.s
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The supplied java.io.File [%s] must represent an existing directory", directory);
                return format;
            }
        });
        try {
            return new j(directory.getCanonicalPath());
        } catch (IOException e11) {
            throw new PreconditionViolationException("Failed to retrieve canonical path for directory: " + directory, e11);
        }
    }

    public static j o(String path) {
        c2.k(path, "Directory path must not be null or blank");
        return new j(path);
    }

    public static k0 p(File file) {
        return q(file, null);
    }

    public static k0 q(final File file, FilePosition position) {
        c2.r(file, "File must not be null");
        c2.f(file.isFile(), new Supplier() { // from class: da0.r
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The supplied java.io.File [%s] must represent an existing file", file);
                return format;
            }
        });
        try {
            return new k0(file.getCanonicalPath(), position);
        } catch (IOException e11) {
            throw new PreconditionViolationException("Failed to retrieve canonical path for file: " + file, e11);
        }
    }

    public static k0 r(String path) {
        return s(path, null);
    }

    public static k0 s(String path, FilePosition position) {
        c2.k(path, "File path must not be null or blank");
        return new k0(path, position);
    }

    @API(since = "1.9", status = API.Status.EXPERIMENTAL)
    public static y0 t(ca0.l parentSelector, int... iterationIndices) {
        c2.r(parentSelector, "Parent selector must not be null");
        c2.o(iterationIndices, "iteration indices must not be empty");
        return new y0(parentSelector, iterationIndices);
    }

    public static j1 u(Class<?> javaClass, String methodName) {
        return v(javaClass, methodName, "");
    }

    public static j1 v(Class<?> javaClass, String methodName, String parameterTypeNames) {
        c2.r(javaClass, "Class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypeNames, "Parameter type names must not be null");
        return new j1(javaClass, methodName, parameterTypeNames.trim());
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static j1 w(Class<?> javaClass, String methodName, Class<?>... parameterTypes) {
        c2.r(javaClass, "Class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypes, "Parameter types array must not be null");
        c2.i(parameterTypes, "Parameter types array must not contain null elements");
        return new j1(javaClass, methodName, parameterTypes);
    }

    public static j1 x(Class<?> javaClass, Method method) {
        c2.r(javaClass, "Class must not be null");
        c2.r(method, "Method must not be null");
        return new j1(javaClass, method);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static j1 y(ClassLoader classLoader, String fullyQualifiedMethodName) throws PreconditionViolationException {
        String[] A1 = ReflectionUtils.A1(fullyQualifiedMethodName);
        return A(classLoader, A1[0], A1[1], A1[2]);
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static j1 z(ClassLoader classLoader, String className, String methodName) {
        return A(classLoader, className, methodName, "");
    }
}
