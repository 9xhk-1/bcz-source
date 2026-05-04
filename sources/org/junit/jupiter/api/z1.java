package org.junit.jupiter.api;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.z1;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface z1 {

    /* renamed from: a, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f78007a = "junit.jupiter.displayname.generator.default";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.10", status = API.Status.STABLE)
    public static class a implements z1 {

        /* renamed from: b, reason: collision with root package name */
        public static final z1 f78008b = new a();

        public static Optional<o1> h(Class<?> testClass) {
            return org.junit.platform.commons.util.a.l(testClass, o1.class, true);
        }

        public static Optional<j2> i(Class<?> testClass) {
            return org.junit.platform.commons.util.a.l(testClass, j2.class, true);
        }

        public static String j(Class<?> testClass) {
            return (String) i(testClass).map(new Function() { // from class: org.junit.jupiter.api.r1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((j2) obj).separator();
                }
            }).orElse(j2.O);
        }

        public static z1 k(Class<?> testClass) {
            return (z1) i(testClass).map(new Function() { // from class: org.junit.jupiter.api.w1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((j2) obj).generator();
                }
            }).filter(m(a.class)).map(new Function() { // from class: org.junit.jupiter.api.x1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return z1.c((Class) obj);
                }
            }).orElseGet(new Supplier() { // from class: org.junit.jupiter.api.y1
                @Override // java.util.function.Supplier
                public final Object get() {
                    z1 c11;
                    c11 = z1.c(j2.P);
                    return c11;
                }
            });
        }

        public static Predicate<Class<?>> m(Class<?> clazz) {
            Objects.requireNonNull(clazz);
            return new q1(clazz).negate();
        }

        @Override // org.junit.jupiter.api.z1
        public String a(Class<?> testClass) {
            return k(testClass).a(testClass);
        }

        @Override // org.junit.jupiter.api.z1
        public String d(Class<?> nestedClass) {
            return l(nestedClass);
        }

        @Override // org.junit.jupiter.api.z1
        public String e(Class<?> testClass, Method testMethod) {
            return l(testClass) + j(testClass) + k(testClass).e(testClass, testMethod);
        }

        public final String l(final Class<?> testClass) {
            String str;
            Class<?> enclosingClass = testClass.getEnclosingClass();
            boolean z11 = enclosingClass == null || z90.h.o(testClass);
            Optional map = org.junit.platform.commons.util.a.m(testClass, n1.class).map(new Function() { // from class: org.junit.jupiter.api.s1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((n1) obj).value();
                }
            }).map(new t1());
            if (z11) {
                if (map.isPresent()) {
                    return (String) map.get();
                }
                Class cls = (Class) h(testClass).map(new u1()).filter(m(a.class)).orElse(null);
                return cls != null ? z1.c(cls).a(testClass) : a(testClass);
            }
            if (h(enclosingClass).map(new u1()).filter(new q1(a.class)).isPresent()) {
                str = l(enclosingClass) + j(testClass);
            } else {
                str = "";
            }
            return str + ((String) map.orElseGet(new Supplier() { // from class: org.junit.jupiter.api.v1
                @Override // java.util.function.Supplier
                public final Object get() {
                    String d11;
                    d11 = z1.a.k(r0).d(testClass);
                    return d11;
                }
            }));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final z1 f78009d = new b();

        public static String g(String name) {
            return name.replace('_', ' ');
        }

        @Override // org.junit.jupiter.api.z1.d, org.junit.jupiter.api.z1
        public String a(Class<?> testClass) {
            return g(super.a(testClass));
        }

        @Override // org.junit.jupiter.api.z1.d, org.junit.jupiter.api.z1
        public String d(Class<?> nestedClass) {
            return g(super.d(nestedClass));
        }

        @Override // org.junit.jupiter.api.z1.c, org.junit.jupiter.api.z1.d, org.junit.jupiter.api.z1
        public String e(Class<?> testClass, Method testMethod) {
            return g(super.e(testClass, testMethod));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final z1 f78010c = new c();

        public static boolean f(Method method) {
            return a2.a(method) > 0;
        }

        @Override // org.junit.jupiter.api.z1.d, org.junit.jupiter.api.z1
        public String e(Class<?> testClass, Method testMethod) {
            String name = testMethod.getName();
            if (!f(testMethod)) {
                return name;
            }
            return name + ' ' + z1.b(testMethod);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements z1 {

        /* renamed from: b, reason: collision with root package name */
        public static final z1 f78011b = new d();

        @Override // org.junit.jupiter.api.z1
        public String a(Class<?> testClass) {
            String name = testClass.getName();
            return name.substring(name.lastIndexOf(46) + 1);
        }

        @Override // org.junit.jupiter.api.z1
        public String d(Class<?> nestedClass) {
            return nestedClass.getSimpleName();
        }

        @Override // org.junit.jupiter.api.z1
        public String e(Class<?> testClass, Method testMethod) {
            return testMethod.getName() + z1.b(testMethod);
        }
    }

    static String b(Method method) {
        ba0.c2.r(method, "Method must not be null");
        return '(' + ba0.y.c(new p1(), method.getParameterTypes()) + ')';
    }

    static z1 c(Class<?> generatorClass) {
        ba0.c2.r(generatorClass, "Class must not be null");
        ba0.c2.e(z1.class.isAssignableFrom(generatorClass), "Class must be a DisplayNameGenerator implementation");
        return generatorClass == d.class ? d.f78011b : generatorClass == c.class ? c.f78010c : generatorClass == b.class ? b.f78009d : generatorClass == a.class ? a.f78008b : (z1) ReflectionUtils.x1(generatorClass, new Object[0]);
    }

    String a(Class<?> testClass);

    String d(Class<?> nestedClass);

    String e(Class<?> testClass, Method testMethod);
}
