package aa0;

import ba0.c2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Function<String, Object> f2484a = new Function() { // from class: aa0.f
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return i.g((String) obj);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<Class<?>, Function<String, Object>> f2485b = new ConcurrentHashMap<>(64);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Predicate<Constructor<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f2486a;

        public a(Class<?> targetType) {
            this.f2486a = targetType;
        }

        @Override // java.util.function.Predicate
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Constructor<?> constructor) {
            if (constructor.getDeclaringClass().equals(this.f2486a)) {
                return i.l(constructor);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Predicate<Method> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f2487a;

        public b(Class<?> targetType) {
            this.f2487a = targetType;
        }

        @Override // java.util.function.Predicate
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Method method) {
            if (method.getReturnType().equals(this.f2487a) && !ReflectionUtils.g1(method)) {
                return i.l(method);
            }
            return false;
        }
    }

    public static /* synthetic */ Function f(Class cls) {
        final Method k11 = k(cls);
        if (k11 != null) {
            return new Function() { // from class: aa0.g
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object L0;
                    L0 = ReflectionUtils.L0(k11, null, (String) obj);
                    return L0;
                }
            };
        }
        final Constructor<?> i11 = i(cls);
        return i11 != null ? new Function() { // from class: aa0.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object y12;
                y12 = ReflectionUtils.y1(i11, (String) obj);
                return y12;
            }
        } : f2484a;
    }

    public static Constructor<?> i(Class<?> targetType) {
        List<Constructor<?>> e02 = ReflectionUtils.e0(targetType, new a(targetType));
        if (e02.size() == 1) {
            return e02.get(0);
        }
        return null;
    }

    public static Function<String, Object> j(Class<?> targetType) {
        return f2485b.computeIfAbsent(targetType, new Function() { // from class: aa0.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i.f((Class) obj);
            }
        });
    }

    public static Method k(Class<?> targetType) {
        List<Method> l02 = ReflectionUtils.l0(targetType, new b(targetType), ReflectionUtils.HierarchyTraversalMode.BOTTOM_UP);
        if (l02.size() == 1) {
            return l02.get(0);
        }
        return null;
    }

    public static boolean l(Executable executable) {
        int parameterCount;
        Class[] parameterTypes;
        if (ReflectionUtils.e1(executable)) {
            parameterCount = executable.getParameterCount();
            if (parameterCount == 1) {
                parameterTypes = executable.getParameterTypes();
                if (parameterTypes[0] == String.class) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return j(targetType) != f2484a;
    }

    @Override // aa0.l1
    public Object c(String source, Class<?> targetType) throws Exception {
        Function<String, Object> j11 = j(targetType);
        c2.e(j11 != f2484a, "Illegal state: convert() must not be called if canConvert() returned false");
        return j11.apply(source);
    }

    public static /* synthetic */ Object g(String str) {
        return str;
    }
}
