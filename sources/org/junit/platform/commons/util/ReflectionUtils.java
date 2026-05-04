package org.junit.platform.commons.util;

import ba0.c2;
import ba0.e4;
import ba0.l;
import ba0.n1;
import ba0.o1;
import ba0.u1;
import ba0.v1;
import ba0.y;
import ba0.y0;
import ba0.z0;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import n6.m;
import org.apiguardian.api.API;
import org.junit.jupiter.api.a2;
import org.junit.jupiter.api.t1;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;
import pn.j;
import x90.b;
import y90.e;
import y90.g;
import z80.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class ReflectionUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f78230a = "junit.platform.reflection.search.useLegacySemantics";

    /* renamed from: b, reason: collision with root package name */
    public static final e f78231b = g.c(ReflectionUtils.class);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f78232c = Pattern.compile("^(\\[+)L(.+);$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f78233d = Pattern.compile("^(\\[+)(\\[[ZBCDFIJS])$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f78234e = Pattern.compile("^([^\\[\\]]+)((?>\\[\\])++)$");

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f78235f = new Class[0];

    /* renamed from: g, reason: collision with root package name */
    public static final z0 f78236g = new z0(new Supplier() { // from class: ba0.s2
        @Override // java.util.function.Supplier
        public final Object get() {
            return m.b();
        }
    }, new BiFunction() { // from class: ba0.t2
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ReflectionUtils.Y1((String) obj, (ClassLoader) obj2);
        }
    });

    /* renamed from: h, reason: collision with root package name */
    public static final Map<Method, Method> f78237h = Collections.synchronizedMap(new LruCache(255));

    /* renamed from: i, reason: collision with root package name */
    public static final Set<String> f78238i = ConcurrentHashMap.newKeySet();

    /* renamed from: j, reason: collision with root package name */
    public static final Map<String, Class<?>> f78239j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f78240k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f78241l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum HierarchyTraversalMode {
        TOP_DOWN,
        BOTTOM_UP
    }

    static {
        Class cls = Boolean.TYPE;
        Class cls2 = Byte.TYPE;
        Class cls3 = Character.TYPE;
        Class cls4 = Short.TYPE;
        Class cls5 = Integer.TYPE;
        Class cls6 = Long.TYPE;
        Class cls7 = Float.TYPE;
        Class cls8 = Double.TYPE;
        List asList = Arrays.asList(cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, boolean[].class, byte[].class, char[].class, short[].class, int[].class, long[].class, float[].class, double[].class, boolean[][].class, byte[][].class, char[][].class, short[][].class, int[][].class, long[][].class, float[][].class, double[][].class, Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class, Boolean[].class, Byte[].class, Character[].class, Short[].class, Integer[].class, Long[].class, Float[].class, Double[].class, String[].class, Boolean[][].class, Byte[][].class, Character[][].class, Short[][].class, Integer[][].class, Long[][].class, Float[][].class, Double[][].class, String[][].class);
        final HashMap hashMap = new HashMap(64);
        asList.forEach(new Consumer() { // from class: ba0.u2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ReflectionUtils.F(hashMap, (Class) obj);
            }
        });
        f78239j = Collections.unmodifiableMap(hashMap);
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        identityHashMap.put(cls, Boolean.class);
        identityHashMap.put(cls2, Byte.class);
        identityHashMap.put(cls3, Character.class);
        identityHashMap.put(cls4, Short.class);
        identityHashMap.put(cls5, Integer.class);
        identityHashMap.put(cls6, Long.class);
        identityHashMap.put(cls7, Float.class);
        identityHashMap.put(cls8, Double.class);
        f78240k = Collections.unmodifiableMap(identityHashMap);
        f78241l = C0();
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static Method A0(Method method, Class<?> targetClass) {
        if (!l1(method) || method.getDeclaringClass().isInterface()) {
            return method;
        }
        Method computeIfAbsent = f78237h.computeIfAbsent(method, new Function() { // from class: ba0.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Method g02;
                g02 = ReflectionUtils.g0(r1, r1.getParameterTypes(), ((Method) obj).getDeclaringClass(), Object.class);
                return g02;
            }
        });
        return (computeIfAbsent != method || targetClass == null) ? computeIfAbsent : g0(method, method.getParameterTypes(), targetClass, method.getDeclaringClass());
    }

    public static String[] A1(final String fullyQualifiedMethodName) {
        int lastIndexOf;
        c2.k(fullyQualifiedMethodName, "fullyQualifiedMethodName must not be null or blank");
        int indexOf = fullyQualifiedMethodName.indexOf(35);
        c2.f(indexOf > 0 && indexOf < fullyQualifiedMethodName.length() - 1, new Supplier() { // from class: ba0.u3
            @Override // java.util.function.Supplier
            public final Object get() {
                return ReflectionUtils.l(fullyQualifiedMethodName);
            }
        });
        String substring = fullyQualifiedMethodName.substring(0, indexOf);
        String substring2 = fullyQualifiedMethodName.substring(indexOf + 1);
        String str = "";
        if (substring2.endsWith("()")) {
            substring2 = substring2.substring(0, substring2.length() - 2);
        } else if (substring2.endsWith(j.f81007d) && (lastIndexOf = substring2.lastIndexOf(40)) > 0 && lastIndexOf < substring2.length() - 1) {
            String substring3 = substring2.substring(0, lastIndexOf);
            str = substring2.substring(lastIndexOf + 1, substring2.length() - 1);
            substring2 = substring3;
        }
        return new String[]{substring, substring2, str};
    }

    public static List<Method> B0(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clazz.getInterfaces()) {
            final List list = (List) E0(cls).stream().filter(new Predicate() { // from class: ba0.x3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ReflectionUtils.c((Method) obj);
                }
            }).collect(Collectors.toList());
            List list2 = (List) B0(cls, traversalMode).stream().filter(new Predicate() { // from class: ba0.y3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ReflectionUtils.v(list, (Method) obj);
                }
            }).collect(Collectors.toList());
            if (traversalMode == HierarchyTraversalMode.TOP_DOWN) {
                arrayList.addAll(list2);
            }
            arrayList.addAll(list);
            if (traversalMode == HierarchyTraversalMode.BOTTOM_UP) {
                arrayList.addAll(list2);
            }
        }
        return arrayList;
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static <T> Optional<Object> B1(Class<T> clazz, String fieldName, T instance) {
        return Z1(clazz, fieldName, instance).q();
    }

    public static /* synthetic */ boolean C(Path path) {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        return isDirectory;
    }

    public static boolean C0() {
        final String property = System.getProperty(f78230a);
        if (e4.g(property)) {
            return false;
        }
        String lowerCase = property.trim().toLowerCase();
        boolean equals = m.f74525c.equals(lowerCase);
        c2.f(equals || "false".equals(lowerCase), new Supplier() { // from class: ba0.n2
            @Override // java.util.function.Supplier
            public final Object get() {
                return ReflectionUtils.e(property);
            }
        });
        return equals;
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static Optional<Object> C1(Field field) {
        return a2(field).q();
    }

    public static /* synthetic */ boolean D(List list, Field field) {
        return !R0(field, list);
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static Optional<Method> D0(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        return W1(clazz, methodName, parameterTypes).q();
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static Optional<Object> D1(Field field, Object instance) {
        return b2(field, instance).q();
    }

    public static /* synthetic */ String E(String str) {
        return "[" + str + "] is not a valid fully qualified field name: it must start with a fully qualified class name followed by a '#' and then the field name.";
    }

    public static List<Method> E0(Class<?> clazz) {
        return V1(clazz.getMethods());
    }

    public static List<Object> E1(List<Field> fields, Object instance) {
        return F1(fields, instance, new Predicate() { // from class: ba0.j3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.s((Field) obj);
            }
        });
    }

    public static /* synthetic */ void F(Map map, Class cls) {
        map.put(cls.getName(), cls);
        map.put(cls.getCanonicalName(), cls);
    }

    @API(since = "1.7", status = API.Status.STABLE)
    public static Method F0(final Class<?> clazz, final String methodName, Class<?>... parameterTypes) {
        return i0(clazz, methodName, parameterTypes).orElseThrow(new Supplier() { // from class: ba0.t3
            @Override // java.util.function.Supplier
            public final Object get() {
                return ReflectionUtils.K(methodName, clazz);
            }
        });
    }

    public static List<Object> F1(List<Field> fields, final Object instance, Predicate<Field> predicate) {
        c2.r(fields, "fields list must not be null");
        c2.r(predicate, "Predicate must not be null");
        return (List) fields.stream().filter(predicate).map(new Function() { // from class: ba0.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object j11;
                j11 = ReflectionUtils.b2((Field) obj, instance).j(new Function() { // from class: ba0.e3
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return o1.e((Exception) obj2);
                    }
                });
                return j11;
            }
        }).collect(n1.j());
    }

    public static /* synthetic */ JUnitException G(String str, String str2, Class cls, Exception exc) {
        return new JUnitException(String.format("Failed to load parameter type [%s] for method [%s] in class [%s].", str, str2, cls.getName()), exc);
    }

    public static List<Field> G0(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        Class<? super Object> superclass = clazz.getSuperclass();
        return !m1(superclass) ? Collections.EMPTY_LIST : Z(superclass, traversalMode);
    }

    @API(since = "1.10", status = API.Status.INTERNAL)
    public static Class<?>[] G1(final Class<?> clazz, final String methodName, String parameterTypeNames) {
        return e4.g(parameterTypeNames) ? f78235f : (Class[]) Arrays.stream(parameterTypeNames.split(",")).map(new t1()).map(new Function() { // from class: ba0.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Class u12;
                u12 = ReflectionUtils.u1(clazz, methodName, (String) obj);
                return u12;
            }
        }).toArray(new IntFunction() { // from class: ba0.b3
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return ReflectionUtils.b(i11);
            }
        });
    }

    public static List<Method> H0(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        Class<? super Object> superclass = clazz.getSuperclass();
        return !m1(superclass) ? Collections.EMPTY_LIST : a0(superclass, traversalMode);
    }

    public static boolean H1(Method method) {
        return method.getReturnType() == Void.TYPE;
    }

    public static /* synthetic */ boolean I(List list, Method method) {
        return !Y0(method, list);
    }

    public static Throwable I0(Throwable t11) {
        return t11 instanceof InvocationTargetException ? I0(((InvocationTargetException) t11).getTargetException()) : t11;
    }

    public static Stream<Class<?>> I1(URI root, l classFilter) {
        return T(root, classFilter).stream();
    }

    public static /* synthetic */ boolean J(Constructor constructor) {
        return !constructor.isSynthetic();
    }

    public static Class<?> J0(Class<?> type) {
        return f78240k.get(type);
    }

    public static Stream<Class<?>> J1(URI root, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return I1(root, l.e(classNameFilter, classFilter));
    }

    public static /* synthetic */ JUnitException K(String str, Class cls) {
        return new JUnitException(String.format("Could not find method [%s] in class [%s]", str, cls.getName()));
    }

    public static boolean K0(Method candidate, String methodName, Class<?>[] parameterTypes) {
        if (!methodName.equals(candidate.getName()) || parameterTypes.length != a2.a(candidate)) {
            return false;
        }
        Class<?>[] parameterTypes2 = candidate.getParameterTypes();
        if (Arrays.equals(parameterTypes, parameterTypes2)) {
            return true;
        }
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            if (!parameterTypes2[i11].isAssignableFrom(parameterTypes[i11])) {
                return false;
            }
        }
        return U0(candidate);
    }

    public static Stream<Class<?>> K1(String moduleName, l classFilter) {
        return V(moduleName, classFilter).stream();
    }

    public static /* synthetic */ boolean L(Method method) {
        return !method.isSynthetic();
    }

    public static Object L0(final Method method, Object target, Object... args) {
        c2.r(method, "Method must not be null");
        c2.f(target != null || o1(method), new Supplier() { // from class: ba0.w3
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Cannot invoke non-static method [%s] on a null target.", method.toGenericString());
                return format;
            }
        });
        try {
            return ((Method) v1(method)).invoke(target, args);
        } catch (Throwable th2) {
            throw o1.e(I0(th2));
        }
    }

    public static Stream<Class<?>> L1(String moduleName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return K1(moduleName, l.e(classNameFilter, classFilter));
    }

    public static boolean M0(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return Modifier.isAbstract(clazz.getModifiers());
    }

    public static Stream<Class<?>> M1(String basePackageName, l classFilter) {
        return X(basePackageName, classFilter).stream();
    }

    public static boolean N0(Member member) {
        c2.r(member, "Member must not be null");
        return Modifier.isAbstract(member.getModifiers());
    }

    public static Stream<Class<?>> N1(String basePackageName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return M1(basePackageName, l.e(classNameFilter, classFilter));
    }

    public static /* synthetic */ boolean O(List list, Field field) {
        return !R0(field, list);
    }

    public static boolean O0(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static Stream<z90.j> O1(URI root, Predicate<z90.j> resourceFilter) {
        return b0(root, resourceFilter).stream();
    }

    public static boolean P(Method m12, Method m22) {
        return v1.a(m12.getDeclaringClass()).equals(v1.a(m22.getDeclaringClass()));
    }

    public static boolean P0(Class<?> sourceType, Class<?> targetType) {
        c2.r(sourceType, "source type must not be null");
        c2.e(!sourceType.isPrimitive(), "source type must not be a primitive type");
        c2.r(targetType, "target type must not be null");
        if (targetType.isAssignableFrom(sourceType)) {
            return true;
        }
        if (targetType.isPrimitive()) {
            return sourceType == f78240k.get(targetType) || p1(sourceType, targetType);
        }
        return false;
    }

    public static Stream<z90.j> P1(String moduleName, Predicate<z90.j> resourceFilter) {
        return c0(moduleName, resourceFilter).stream();
    }

    public static int Q(Field field1, Field field2) {
        return Integer.compare(field1.getName().hashCode(), field2.getName().hashCode());
    }

    public static boolean Q0(Object obj, Class<?> targetType) {
        c2.r(targetType, "target type must not be null");
        if (obj == null) {
            return !targetType.isPrimitive();
        }
        if (targetType.isInstance(obj)) {
            return true;
        }
        if (!targetType.isPrimitive()) {
            return false;
        }
        Class<?> cls = obj.getClass();
        return cls == f78240k.get(targetType) || p1(cls, targetType);
    }

    public static Stream<z90.j> Q1(String basePackageName, Predicate<z90.j> resourceFilter) {
        return d0(basePackageName, resourceFilter).stream();
    }

    public static int R(Method method1, Method method2) {
        String name = method1.getName();
        String name2 = method2.getName();
        int compare = Integer.compare(name.hashCode(), name2.hashCode());
        if (compare != 0) {
            return compare;
        }
        int compareTo = name.compareTo(name2);
        return compareTo == 0 ? method1.toString().compareTo(method2.toString()) : compareTo;
    }

    public static boolean R0(final Field field, List<Field> localFields) {
        if (f78241l) {
            return localFields.stream().anyMatch(new Predicate() { // from class: ba0.c3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean equals;
                    equals = ((Field) obj).getName().equals(field.getName());
                    return equals;
                }
            });
        }
        return false;
    }

    public static Stream<Field> R1(Class<?> clazz, Predicate<Field> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(clazz, "Class must not be null");
        c2.r(predicate, "Predicate must not be null");
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return Z(clazz, traversalMode).stream().filter(predicate).distinct();
    }

    public static void S(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        String name = clazz.getName();
        if (f78238i.contains(name)) {
            return;
        }
        Class<? super Object> superclass = clazz.getSuperclass();
        if (W0(clazz) && m1(superclass)) {
            do {
                clazz = clazz.getEnclosingClass();
                if (clazz != null) {
                }
            } while (!superclass.equals(clazz));
            throw new JUnitException(String.format("Detected cycle in inner class hierarchy between %s and %s", name, clazz.getName()));
        }
        f78238i.add(name);
    }

    @API(since = "1.5", status = API.Status.INTERNAL)
    public static boolean S0(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return Modifier.isFinal(clazz.getModifiers());
    }

    public static Stream<Method> S1(Class<?> clazz, Predicate<Method> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(clazz, "Class must not be null");
        c2.r(predicate, "Predicate must not be null");
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return a0(clazz, traversalMode).stream().filter(predicate).distinct();
    }

    public static List<Class<?>> T(URI root, l classFilter) {
        return Collections.unmodifiableList(f78236g.H(root, classFilter));
    }

    @API(since = "1.5", status = API.Status.INTERNAL)
    public static boolean T0(Member member) {
        c2.r(member, "Member must not be null");
        return Modifier.isFinal(member.getModifiers());
    }

    public static Stream<Class<?>> T1(Class<?> clazz, Predicate<Class<?>> predicate) {
        return m0(clazz, predicate).stream();
    }

    public static List<Class<?>> U(URI root, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return T(root, l.e(classNameFilter, classFilter));
    }

    public static boolean U0(Method method) {
        return V0(method.getGenericReturnType()) || Arrays.stream(method.getGenericParameterTypes()).anyMatch(new Predicate() { // from class: ba0.l3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean V0;
                V0 = ReflectionUtils.V0((Type) obj);
                return V0;
            }
        });
    }

    public static List<Field> U1(Field[] fields) {
        return (List) Arrays.stream(fields).sorted(new Comparator() { // from class: ba0.y2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int Q;
                Q = ReflectionUtils.Q((Field) obj, (Field) obj2);
                return Q;
            }
        }).collect(Collectors.toCollection(new x80.e()));
    }

    public static List<Class<?>> V(String moduleName, l classFilter) {
        return Collections.unmodifiableList(u1.d(moduleName, classFilter));
    }

    public static boolean V0(Type type) {
        return (type instanceof TypeVariable) || (type instanceof GenericArrayType);
    }

    public static List<Method> V1(Method[] methods) {
        return (List) Arrays.stream(methods).sorted(new Comparator() { // from class: ba0.v3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int R;
                R = ReflectionUtils.R((Method) obj, (Method) obj2);
                return R;
            }
        }).collect(Collectors.toCollection(new x80.e()));
    }

    public static List<Class<?>> W(String moduleName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return V(moduleName, l.e(classNameFilter, classFilter));
    }

    public static boolean W0(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return !n1(clazz) && clazz.isMemberClass();
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static b<Method> W1(final Class<?> clazz, final String methodName, final Class<?>... parameterTypes) {
        c2.r(clazz, "Class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        return b.f(new Callable() { // from class: ba0.i2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Method method;
                method = clazz.getMethod(methodName, parameterTypes);
                return method;
            }
        });
    }

    public static List<Class<?>> X(String basePackageName, l classFilter) {
        return Collections.unmodifiableList(f78236g.I(basePackageName, classFilter));
    }

    public static boolean X0(Method upper, Method lower) {
        if (!f78241l) {
            if (Modifier.isStatic(lower.getModifiers())) {
                return false;
            }
            int modifiers = upper.getModifiers();
            if (Modifier.isPrivate(modifiers) || Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers) || (h1(upper) && !P(upper, lower))) {
                return false;
            }
        }
        return K0(upper, lower.getName(), lower.getParameterTypes());
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static b<Class<?>> X1(String name) {
        return Y1(name, ba0.m.b());
    }

    public static List<Class<?>> Y(String basePackageName, Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        return X(basePackageName, l.e(classNameFilter, classFilter));
    }

    public static boolean Y0(final Method method, List<Method> localMethods) {
        return localMethods.stream().anyMatch(new Predicate() { // from class: ba0.h3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean X0;
                X0 = ReflectionUtils.X0(method, (Method) obj);
                return X0;
            }
        });
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static b<Class<?>> Y1(String name, final ClassLoader classLoader) {
        c2.k(name, "Class name must not be null or blank");
        c2.r(classLoader, "ClassLoader must not be null");
        final String trim = name.trim();
        Map<String, Class<?>> map = f78239j;
        return map.containsKey(trim) ? b.p(map.get(trim)) : b.f(new Callable() { // from class: ba0.i3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReflectionUtils.n(trim, classLoader);
            }
        });
    }

    public static List<Field> Z(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        c2.r(clazz, "Class must not be null");
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        final List list = (List) s0(clazz).stream().filter(new Predicate() { // from class: ba0.v2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.w((Field) obj);
            }
        }).collect(Collectors.toList());
        List list2 = (List) G0(clazz, traversalMode).stream().filter(new Predicate() { // from class: ba0.w2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.O(list, (Field) obj);
            }
        }).collect(Collectors.toList());
        List list3 = (List) z0(clazz, traversalMode).stream().filter(new Predicate() { // from class: ba0.x2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.D(list, (Field) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        if (traversalMode == HierarchyTraversalMode.TOP_DOWN) {
            arrayList.addAll(list2);
            arrayList.addAll(list3);
        }
        arrayList.addAll(list);
        if (traversalMode == HierarchyTraversalMode.BOTTOM_UP) {
            arrayList.addAll(list3);
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public static boolean Z0(Class<?> clazz, Predicate<Method> predicate) {
        c2.r(clazz, "Class must not be null");
        c2.r(predicate, "Predicate must not be null");
        return j0(clazz, predicate).isPresent();
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static <T> b<Object> Z1(final Class<T> clazz, final String fieldName, final T instance) {
        c2.r(clazz, "Class must not be null");
        c2.k(fieldName, "Field name must not be null or blank");
        return b.f(new Callable() { // from class: ba0.m3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Field declaredField;
                declaredField = clazz.getDeclaredField(fieldName);
                return declaredField;
            }
        }).d(new Function() { // from class: ba0.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                x90.b b22;
                b22 = ReflectionUtils.b2((Field) obj, instance);
                return b22;
            }
        });
    }

    public static /* synthetic */ boolean a(List list, Field field) {
        return !R0(field, list);
    }

    public static List<Method> a0(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        c2.r(clazz, "Class must not be null");
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        final List list = (List) t0(clazz, traversalMode).stream().filter(new Predicate() { // from class: ba0.o2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.L((Method) obj);
            }
        }).collect(Collectors.toList());
        List list2 = (List) H0(clazz, traversalMode).stream().filter(new Predicate() { // from class: ba0.p2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.I(list, (Method) obj);
            }
        }).collect(Collectors.toList());
        List list3 = (List) B0(clazz, traversalMode).stream().filter(new Predicate() { // from class: ba0.q2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.h(list, (Method) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        if (traversalMode == HierarchyTraversalMode.TOP_DOWN) {
            arrayList.addAll(list2);
            arrayList.addAll(list3);
        }
        arrayList.addAll(list);
        if (traversalMode == HierarchyTraversalMode.BOTTOM_UP) {
            arrayList.addAll(list3);
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    @API(since = "1.3.2", status = API.Status.INTERNAL)
    public static boolean a1(Object obj) {
        return obj != null && obj.getClass().isArray() && obj.getClass().getComponentType().isArray();
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static b<Object> a2(Field field) {
        return b2(field, null);
    }

    public static /* synthetic */ Class[] b(int i11) {
        return new Class[i11];
    }

    public static List<z90.j> b0(URI root, Predicate<z90.j> resourceFilter) {
        return Collections.unmodifiableList(f78236g.J(root, resourceFilter));
    }

    @API(since = "1.5", status = API.Status.INTERNAL)
    public static boolean b1(Class<?> clazz) {
        return !S0(clazz);
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static b<Object> b2(final Field field, final Object instance) {
        c2.r(field, "Field must not be null");
        c2.f(instance != null || o1(field), new Supplier() { // from class: ba0.p3
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Cannot read non-static field [%s] on a null instance.", field);
                return format;
            }
        });
        return b.f(new Callable() { // from class: ba0.q3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj;
                obj = ReflectionUtils.w1(field).get(instance);
                return obj;
            }
        });
    }

    public static /* synthetic */ boolean c(Method method) {
        return !N0(method);
    }

    public static List<z90.j> c0(String moduleName, Predicate<z90.j> resourceFilter) {
        return Collections.unmodifiableList(u1.f(moduleName, resourceFilter));
    }

    @API(since = "1.5", status = API.Status.INTERNAL)
    public static boolean c1(Member member) {
        return !T0(member);
    }

    public static List<z90.j> d0(String basePackageName, Predicate<z90.j> resourceFilter) {
        return Collections.unmodifiableList(f78236g.K(basePackageName, resourceFilter));
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static boolean d1(Class<?> clazz) {
        return !i1(clazz);
    }

    public static /* synthetic */ String e(String str) {
        return "junit.platform.reflection.search.useLegacySemantics property must be 'true' or 'false' (ignoring case): " + str;
    }

    public static List<Constructor<?>> e0(Class<?> clazz, Predicate<Constructor<?>> predicate) {
        c2.r(clazz, "Class must not be null");
        c2.r(predicate, "Predicate must not be null");
        try {
            return (List) Arrays.stream(clazz.getDeclaredConstructors()).filter(predicate).collect(n1.j());
        } catch (Throwable th2) {
            throw o1.e(I0(th2));
        }
    }

    @API(since = "1.1", status = API.Status.INTERNAL)
    public static boolean e1(Member member) {
        return !j1(member);
    }

    public static List<Field> f0(Class<?> clazz, Predicate<Field> predicate, HierarchyTraversalMode traversalMode) {
        return (List) R1(clazz, predicate, traversalMode).collect(n1.j());
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static boolean f1(Class<?> clazz) {
        return !n1(clazz);
    }

    public static Method g0(Method method, Class<?>[] parameterTypes, Class<?> startClass, Class<?> endClass) {
        while (startClass != null && startClass != endClass) {
            for (Class<?> cls : startClass.getInterfaces()) {
                try {
                    return cls.getMethod(method.getName(), parameterTypes);
                } catch (NoSuchMethodException unused) {
                }
            }
            startClass = startClass.getSuperclass();
        }
        return method;
    }

    @API(since = "1.1", status = API.Status.INTERNAL)
    public static boolean g1(Member member) {
        return !o1(member);
    }

    public static /* synthetic */ boolean h(List list, Method method) {
        return !Y0(method, list);
    }

    public static Optional<Method> h0(Class<?> clazz, String methodName, String parameterTypeNames) {
        c2.r(clazz, "Class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        return i0(clazz, methodName, G1(clazz, methodName, parameterTypeNames));
    }

    public static boolean h1(Member member) {
        int modifiers = member.getModifiers();
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }

    public static Optional<Method> i0(Class<?> clazz, final String methodName, final Class<?>... parameterTypes) {
        c2.r(clazz, "Class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypes, "Parameter types array must not be null");
        c2.i(parameterTypes, "Individual parameter types must not be null");
        return j0(clazz, new Predicate() { // from class: ba0.r2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K0;
                K0 = ReflectionUtils.K0((Method) obj, methodName, parameterTypes);
                return K0;
            }
        });
    }

    public static boolean i1(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return Modifier.isPrivate(clazz.getModifiers());
    }

    public static Optional<Method> j0(Class<?> clazz, Predicate<Method> predicate) {
        c2.r(clazz, "Class must not be null");
        c2.r(predicate, "Predicate must not be null");
        while (m1(clazz)) {
            for (Method method : clazz.isInterface() ? E0(clazz) : t0(clazz, HierarchyTraversalMode.BOTTOM_UP)) {
                if (predicate.test(method)) {
                    return Optional.of(method);
                }
            }
            for (Class<?> cls : clazz.getInterfaces()) {
                Optional<Method> j02 = j0(cls, predicate);
                if (j02.isPresent()) {
                    return j02;
                }
            }
            clazz = clazz.getSuperclass();
        }
        return Optional.empty();
    }

    public static boolean j1(Member member) {
        c2.r(member, "Member must not be null");
        return Modifier.isPrivate(member.getModifiers());
    }

    public static List<Method> k0(Class<?> clazz, Predicate<Method> predicate) {
        return l0(clazz, predicate, HierarchyTraversalMode.TOP_DOWN);
    }

    public static boolean k1(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return Modifier.isPublic(clazz.getModifiers());
    }

    public static /* synthetic */ String l(String str) {
        return "[" + str + "] is not a valid fully qualified method name: it must start with a fully qualified class name followed by a '#' and then the method name, optionally followed by a parameter list enclosed in parentheses.";
    }

    public static List<Method> l0(Class<?> clazz, Predicate<Method> predicate, HierarchyTraversalMode traversalMode) {
        return (List) S1(clazz, predicate, traversalMode).collect(n1.j());
    }

    public static boolean l1(Member member) {
        c2.r(member, "Member must not be null");
        return Modifier.isPublic(member.getModifiers());
    }

    public static List<Class<?>> m0(Class<?> clazz, Predicate<Class<?>> predicate) {
        c2.r(clazz, "Class must not be null");
        c2.r(predicate, "Predicate must not be null");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n0(clazz, predicate, linkedHashSet);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static boolean m1(Class<?> clazz) {
        return (clazz == null || clazz == Object.class) ? false : true;
    }

    public static /* synthetic */ Class n(String str, ClassLoader classLoader) {
        Matcher matcher = f78233d.matcher(str);
        if (matcher.matches()) {
            return q1(classLoader, matcher.group(2), matcher.group(1).length());
        }
        Matcher matcher2 = f78232c.matcher(str);
        if (matcher2.matches()) {
            return q1(classLoader, matcher2.group(2), matcher2.group(1).length());
        }
        Matcher matcher3 = f78234e.matcher(str);
        return matcher3.matches() ? q1(classLoader, matcher3.group(1), matcher3.group(2).length() / 2) : Class.forName(str, false, classLoader);
    }

    public static void n0(final Class<?> clazz, Predicate<Class<?>> predicate, Set<Class<?>> candidates) {
        if (m1(clazz)) {
            if (W0(clazz) && predicate.test(clazz)) {
                S(clazz);
            }
            try {
                for (Class<?> cls : clazz.getDeclaredClasses()) {
                    if (predicate.test(cls)) {
                        S(cls);
                        candidates.add(cls);
                    }
                }
            } catch (NoClassDefFoundError e11) {
                f78231b.a(e11, new Supplier() { // from class: ba0.f3
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return ReflectionUtils.p(clazz);
                    }
                });
            }
            n0(clazz.getSuperclass(), predicate, candidates);
            for (Class<?> cls2 : clazz.getInterfaces()) {
                n0(cls2, predicate, candidates);
            }
        }
    }

    public static boolean n1(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        return Modifier.isStatic(clazz.getModifiers());
    }

    public static Set<Class<?>> o0(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p0(clazz, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean o1(Member member) {
        c2.r(member, "Member must not be null");
        return Modifier.isStatic(member.getModifiers());
    }

    public static /* synthetic */ String p(Class cls) {
        return "Failed to retrieve declared classes for " + cls.getName();
    }

    public static void p0(Class<?> clazz, Set<Class<?>> result) {
        while (clazz != null) {
            result.add(clazz);
            for (Class<?> cls : clazz.getInterfaces()) {
                if (!result.contains(cls)) {
                    p0(cls, result);
                }
            }
            clazz = clazz.getSuperclass();
        }
    }

    public static boolean p1(Class<?> sourceType, Class<?> targetType) {
        c2.e(targetType.isPrimitive(), "targetType must be primitive");
        boolean isPrimitive = sourceType.isPrimitive();
        Map<Class<?>, Class<?>> map = f78240k;
        boolean containsValue = map.containsValue(sourceType);
        if (!isPrimitive && !containsValue) {
            return false;
        }
        if (isPrimitive) {
            sourceType = map.get(sourceType);
        }
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Class<?> cls3 = Float.TYPE;
        Class<?> cls4 = Double.TYPE;
        return sourceType == Byte.class ? targetType == Short.TYPE || targetType == cls || targetType == cls2 || targetType == cls3 || targetType == cls4 : (sourceType == Short.class || sourceType == Character.class) ? targetType == cls || targetType == cls2 || targetType == cls3 || targetType == cls4 : sourceType == Integer.class ? targetType == cls2 || targetType == cls3 || targetType == cls4 : sourceType == Long.class ? targetType == cls3 || targetType == cls4 : sourceType == Float.class && targetType == cls4;
    }

    public static /* synthetic */ JUnitException q(String str, Exception exc) {
        return new JUnitException(String.format("Could not load class [%s]", str), exc);
    }

    public static Set<Path> q0() {
        return (Set) Arrays.stream(System.getProperty("java.class.path").split(File.pathSeparator)).map(new Function() { // from class: ba0.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ReflectionUtils.x((String) obj);
            }
        }).filter(new Predicate() { // from class: ba0.k3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ReflectionUtils.C((Path) obj);
            }
        }).collect(Collectors.toSet());
    }

    public static Class<?> q1(ClassLoader classLoader, String componentTypeName, int dimensions) throws ClassNotFoundException {
        Map<String, Class<?>> map = f78239j;
        return Array.newInstance(map.containsKey(componentTypeName) ? map.get(componentTypeName) : Class.forName(componentTypeName, false, classLoader), new int[dimensions]).getClass();
    }

    public static <T> Constructor<T> r0(final Class<T> clazz) {
        c2.r(clazz, "Class must not be null");
        try {
            List list = (List) Arrays.stream(clazz.getDeclaredConstructors()).filter(new Predicate() { // from class: ba0.f2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ReflectionUtils.J((Constructor) obj);
                }
            }).collect(Collectors.toList());
            boolean z11 = true;
            if (list.size() != 1) {
                z11 = false;
            }
            c2.f(z11, new Supplier() { // from class: ba0.g2
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Class [%s] must declare a single constructor", clazz.getName());
                    return format;
                }
            });
            return (Constructor) list.get(0);
        } catch (Throwable th2) {
            throw o1.e(I0(th2));
        }
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static Optional<Class<?>> r1(String name) {
        return X1(name).q();
    }

    public static /* synthetic */ boolean s(Field field) {
        return true;
    }

    public static List<Field> s0(Class<?> clazz) {
        return U1(clazz.getDeclaredFields());
    }

    @API(since = "1.4", status = API.Status.DEPRECATED)
    @Deprecated
    public static Optional<Class<?>> s1(String name, ClassLoader classLoader) {
        return Y1(name, classLoader).q();
    }

    public static List<Method> t0(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        List<Method> u02 = u0(clazz);
        List<Method> V1 = V1(clazz.getDeclaredMethods());
        if (traversalMode == HierarchyTraversalMode.BOTTOM_UP) {
            V1.addAll(u02);
            return V1;
        }
        u02.addAll(V1);
        return u02;
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static Class<?> t1(final String name, ClassLoader classLoader) throws JUnitException {
        return Y1(name, classLoader).j(new Function() { // from class: ba0.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ReflectionUtils.q(name, (Exception) obj);
            }
        });
    }

    public static List<Method> u0(Class<?> clazz) {
        final List<Method> list = (List) Arrays.stream(clazz.getMethods()).filter(new Predicate() { // from class: ba0.k2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Method) obj).isDefault();
            }
        }).collect(Collectors.toCollection(new x80.e()));
        return list.isEmpty() ? list : (List) Arrays.stream(clazz.getInterfaces()).map(new Function() { // from class: ba0.l2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List E0;
                E0 = ReflectionUtils.E0((Class) obj);
                return E0;
            }
        }).flatMap(new y0()).filter(new Predicate() { // from class: ba0.m2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return list.contains((Method) obj);
            }
        }).collect(Collectors.toCollection(new x80.e()));
    }

    public static Class<?> u1(final Class<?> clazz, final String methodName, final String typeName) {
        return Y1(typeName, ba0.m.a(clazz)).j(new Function() { // from class: ba0.g3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ReflectionUtils.G(typeName, methodName, clazz, (Exception) obj);
            }
        });
    }

    public static /* synthetic */ boolean v(List list, Method method) {
        return !Y0(method, list);
    }

    public static List<Field> v0(Class<?> clazz) {
        return U1(clazz.getFields());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (k1(r0) == false) goto L6;
     */
    @org.apiguardian.api.API(since = "1.11", status = org.apiguardian.api.API.Status.INTERNAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends java.lang.reflect.Executable> T v1(T r1) {
        /*
            boolean r0 = l1(r1)
            if (r0 == 0) goto L10
            java.lang.Class r0 = e90.d.a(r1)
            boolean r0 = k1(r0)
            if (r0 != 0) goto L1a
        L10:
            boolean r0 = ba0.d2.a(r1)
            if (r0 != 0) goto L1a
            r0 = 1
            ba0.e2.a(r1, r0)
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.platform.commons.util.ReflectionUtils.v1(java.lang.reflect.Executable):java.lang.reflect.Executable");
    }

    public static /* synthetic */ boolean w(Field field) {
        return !field.isSynthetic();
    }

    public static String w0(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        c2.r(clazz, "Class must not be null");
        c2.k(methodName, "Method name must not be null or blank");
        return y0(clazz.getName(), methodName, y.d(parameterTypes));
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static Field w1(Field field) {
        if ((!l1(field) || !k1(field.getDeclaringClass()) || T0(field)) && !field.isAccessible()) {
            field.setAccessible(true);
        }
        return field;
    }

    public static /* synthetic */ Path x(String str) {
        Path path;
        path = Paths.get(str, new String[0]);
        return path;
    }

    public static String x0(Class<?> clazz, Method method) {
        c2.r(method, "Method must not be null");
        return w0(clazz, method.getName(), method.getParameterTypes());
    }

    public static <T> T x1(Class<T> cls, Object... objArr) {
        c2.r(cls, "Class must not be null");
        c2.r(objArr, "Argument array must not be null");
        c2.i(objArr, "Individual arguments must not be null");
        try {
            return (T) y1(cls.getDeclaredConstructor((Class[]) Arrays.stream(objArr).map(new u()).toArray(new IntFunction() { // from class: ba0.o3
                @Override // java.util.function.IntFunction
                public final Object apply(int i11) {
                    return ReflectionUtils.y(i11);
                }
            })), objArr);
        } catch (Throwable th2) {
            throw o1.e(I0(th2));
        }
    }

    public static /* synthetic */ Class[] y(int i11) {
        return new Class[i11];
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static String y0(String className, String methodName, String parameterTypeNames) {
        c2.k(className, "Class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        c2.r(parameterTypeNames, "Parameter type names must not be null");
        return String.format("%s#%s(%s)", className, methodName, parameterTypeNames);
    }

    public static <T> T y1(Constructor<T> constructor, Object... objArr) {
        c2.r(constructor, "Constructor must not be null");
        try {
            return (T) ((Constructor) v1(constructor)).newInstance(objArr);
        } catch (Throwable th2) {
            throw o1.e(I0(th2));
        }
    }

    public static List<Field> z0(Class<?> clazz, HierarchyTraversalMode traversalMode) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clazz.getInterfaces()) {
            final List<Field> v02 = v0(cls);
            List list = (List) z0(cls, traversalMode).stream().filter(new Predicate() { // from class: ba0.s3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ReflectionUtils.a(v02, (Field) obj);
                }
            }).collect(Collectors.toList());
            if (traversalMode == HierarchyTraversalMode.TOP_DOWN) {
                arrayList.addAll(list);
            }
            arrayList.addAll(v02);
            if (traversalMode == HierarchyTraversalMode.BOTTOM_UP) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0 < (r3.length() - 1)) goto L8;
     */
    @org.apiguardian.api.API(since = "1.11", status = org.apiguardian.api.API.Status.INTERNAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] z1(final java.lang.String r3) {
        /*
            java.lang.String r0 = "fullyQualifiedFieldName must not be null or blank"
            ba0.c2.k(r3, r0)
            r0 = 35
            int r0 = r3.indexOf(r0)
            if (r0 <= 0) goto L16
            int r1 = r3.length()
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            ba0.j2 r0 = new ba0.j2
            r0.<init>()
            ba0.c2.f(r2, r0)
            java.lang.String r0 = "#"
            java.lang.String[] r3 = r3.split(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.platform.commons.util.ReflectionUtils.z1(java.lang.String):java.lang.String[]");
    }
}
