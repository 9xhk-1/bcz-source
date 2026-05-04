package f90;

import ba0.e4;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.f3;
import org.junit.jupiter.api.h3;
import org.junit.jupiter.api.l3;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f2 extends b<g2> {

    /* renamed from: b, reason: collision with root package name */
    public static final Predicate<Method> f51370b = new Predicate() { // from class: f90.c2
        @Override // java.util.function.Predicate
        public final boolean test(Object obj) {
            return f2.f((Method) obj);
        }
    };

    public static /* synthetic */ boolean f(Method method) {
        return ba0.n1.g(method.getReturnType()) && !r(method);
    }

    public static /* synthetic */ String i(List list, String str, Class cls) {
        return list.size() > 0 ? String.format("Could not find valid factory method [%s] in class [%s] but found the following invalid candidates: %s", str, cls.getName(), list) : String.format("Could not find factory method [%s] in class [%s]", str, cls.getName());
    }

    public static /* synthetic */ boolean k(String str, Method method, Method method2) {
        return str.equals(method2.getName()) && !method.equals(method2);
    }

    public static Method o(final Class<?> testClass, Method testMethod, final String factoryMethodName) {
        String str;
        if (e4.g(factoryMethodName)) {
            return q(testClass, testMethod, testMethod.getName());
        }
        if (s(factoryMethodName)) {
            str = factoryMethodName;
        } else {
            str = testClass.getName() + "#" + factoryMethodName;
        }
        final Method p11 = p(testClass, testMethod, str);
        ba0.c2.f(f51370b.test(p11), new Supplier() { // from class: f90.u1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Could not find valid factory method [%s] for test class [%s] but found the following invalid candidate: %s", factoryMethodName, testClass.getName(), p11);
                return format;
            }
        });
        return p11;
    }

    public static Method p(Class<?> testClass, Method testMethod, String fullyQualifiedMethodName) {
        String[] A1 = ReflectionUtils.A1(fullyQualifiedMethodName);
        final String str = A1[0];
        final String str2 = A1[1];
        final String str3 = A1[2];
        Class<?> t12 = ReflectionUtils.t1(str, ba0.m.a(testClass));
        Method orElse = ReflectionUtils.h0(t12, str2, str3).orElse(null);
        if (orElse != null) {
            return orElse;
        }
        ba0.c2.f(!(e4.h(str3) || fullyQualifiedMethodName.endsWith("()")), new Supplier() { // from class: f90.x1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Could not find factory method [%s(%s)] in class [%s]", str2, str3, str);
                return format;
            }
        });
        return q(t12, testMethod, str2);
    }

    public static Method q(final Class<?> clazz, final Method testMethod, final String factoryMethodName) {
        final List<Method> k02 = ReflectionUtils.k0(clazz, new Predicate() { // from class: f90.d2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f2.k(factoryMethodName, testMethod, (Method) obj);
            }
        });
        final List list = (List) k02.stream().filter(f51370b).collect(Collectors.toList());
        ba0.c2.f(list.size() > 0, new Supplier() { // from class: f90.e2
            @Override // java.util.function.Supplier
            public final Object get() {
                return f2.i(k02, factoryMethodName, clazz);
            }
        });
        ba0.c2.f(list.size() == 1, new Supplier() { // from class: f90.v1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("%d factory methods named [%s] were found in class [%s]: %s", Integer.valueOf(r0.size()), factoryMethodName, clazz.getName(), list);
                return format;
            }
        });
        return (Method) list.get(0);
    }

    public static boolean r(Method candidate) {
        return org.junit.platform.commons.util.a.y(candidate, f3.class) || org.junit.platform.commons.util.a.y(candidate, l3.class) || org.junit.platform.commons.util.a.y(candidate, h3.class);
    }

    public static boolean s(String factoryMethodName) {
        if (factoryMethodName.contains("#")) {
            return true;
        }
        int indexOf = factoryMethodName.indexOf(46);
        if (indexOf == -1) {
            return false;
        }
        int lastIndexOf = factoryMethodName.lastIndexOf(40);
        return lastIndexOf <= 0 || indexOf < lastIndexOf;
    }

    public static Method u(final Method factoryMethod, Object testInstance) {
        ba0.c2.f(factoryMethod.getDeclaringClass().isInstance(testInstance) || ReflectionUtils.o1(factoryMethod), new Supplier() { // from class: f90.w1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Method '%s' must be static: local factory methods must be static unless the PER_CLASS @TestInstance lifecycle mode is used; external factory methods must always be static.", factoryMethod.toGenericString());
                return format;
            }
        });
        return factoryMethod;
    }

    @Override // f90.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Stream<? extends d> d(final p80.n context, g2 methodSource) {
        final Class<?> Z = context.Z();
        final Method a02 = context.a0();
        final Object orElse = context.E().orElse(null);
        return Arrays.stream(methodSource.value()).map(new Function() { // from class: f90.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Method o11;
                o11 = f2.o(Z, a02, (String) obj);
                return o11;
            }
        }).map(new Function() { // from class: f90.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Method u11;
                u11 = f2.u((Method) obj, orElse);
                return u11;
            }
        }).map(new Function() { // from class: f90.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object d11;
                Method method = (Method) obj;
                d11 = p80.n.this.H().d(method, orElse);
                return d11;
            }
        }).flatMap(new Function() { // from class: f90.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ba0.n1.i(obj);
            }
        }).map(new o1());
    }
}
