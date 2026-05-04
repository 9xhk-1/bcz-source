package z90;

import ba0.c2;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.commons.support.HierarchyTraversalMode;
import org.junit.platform.commons.support.SearchOption;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public final class f {
    public static /* synthetic */ boolean a(Class cls, Field field) {
        return h.p(field) && cls.isAssignableFrom(field.getType());
    }

    public static /* synthetic */ boolean b(Class cls, Field field) {
        return h.j(field) && cls.isAssignableFrom(field.getType());
    }

    public static /* synthetic */ boolean c(Field field) {
        return true;
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static List<Object> d(Class<?> clazz, Class<? extends Annotation> annotationType) {
        return ReflectionUtils.E1(j(clazz, annotationType, new Predicate() { // from class: z90.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.p((Field) obj);
            }
        }, HierarchyTraversalMode.TOP_DOWN), null);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static <T> List<T> e(Class<?> cls, Class<? extends Annotation> cls2, final Class<T> cls3) {
        c2.r(cls3, "fieldType must not be null");
        return (List<T>) ReflectionUtils.E1(j(cls, cls2, new Predicate() { // from class: z90.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f.a(cls3, (Field) obj);
            }
        }, HierarchyTraversalMode.TOP_DOWN), null);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static List<Object> f(Object instance, Class<? extends Annotation> annotationType) {
        c2.r(instance, "instance must not be null");
        return ReflectionUtils.E1(j(instance.getClass(), annotationType, new Predicate() { // from class: z90.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.j((Field) obj);
            }
        }, HierarchyTraversalMode.TOP_DOWN), instance);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static <T> List<T> g(Object obj, Class<? extends Annotation> cls, final Class<T> cls2) {
        c2.r(obj, "instance must not be null");
        c2.r(cls2, "fieldType must not be null");
        return (List<T>) ReflectionUtils.E1(j(obj.getClass(), cls, new Predicate() { // from class: z90.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return f.b(cls2, (Field) obj2);
            }
        }, HierarchyTraversalMode.TOP_DOWN), obj);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static List<Field> h(Class<?> clazz, Class<? extends Annotation> annotationType) {
        return i(clazz, annotationType, new Predicate() { // from class: z90.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f.c((Field) obj);
            }
        });
    }

    @API(since = "1.10", status = API.Status.MAINTAINED)
    public static List<Field> i(Class<?> clazz, Class<? extends Annotation> annotationType, Predicate<Field> predicate) {
        return org.junit.platform.commons.util.a.i(clazz, annotationType, predicate);
    }

    @API(since = "1.4", status = API.Status.MAINTAINED)
    public static List<Field> j(Class<?> clazz, Class<? extends Annotation> annotationType, Predicate<Field> predicate, HierarchyTraversalMode traversalMode) {
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return org.junit.platform.commons.util.a.j(clazz, annotationType, predicate, ReflectionUtils.HierarchyTraversalMode.valueOf(traversalMode.name()));
    }

    public static List<Method> k(Class<?> clazz, Class<? extends Annotation> annotationType, HierarchyTraversalMode traversalMode) {
        c2.r(traversalMode, "HierarchyTraversalMode must not be null");
        return org.junit.platform.commons.util.a.k(clazz, annotationType, ReflectionUtils.HierarchyTraversalMode.valueOf(traversalMode.name()));
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public static <A extends Annotation> Optional<A> l(Class<?> clazz, Class<A> annotationType, SearchOption searchOption) {
        c2.r(searchOption, "SearchOption must not be null");
        return org.junit.platform.commons.util.a.l(clazz, annotationType, searchOption == SearchOption.INCLUDE_ENCLOSING_CLASSES);
    }

    public static <A extends Annotation> Optional<A> m(AnnotatedElement element, Class<A> annotationType) {
        return org.junit.platform.commons.util.a.m(element, annotationType);
    }

    @API(since = "1.1", status = API.Status.MAINTAINED)
    public static <A extends Annotation> Optional<A> n(Optional<? extends AnnotatedElement> element, Class<A> annotationType) {
        return org.junit.platform.commons.util.a.p(element, annotationType);
    }

    public static List<Field> o(Class<?> clazz, Class<?> fieldType, Class<? extends Annotation> annotationType) {
        return org.junit.platform.commons.util.a.r(clazz, fieldType, annotationType);
    }

    public static <A extends Annotation> List<A> p(AnnotatedElement element, Class<A> annotationType) {
        return org.junit.platform.commons.util.a.s(element, annotationType);
    }

    @API(since = "1.5", status = API.Status.MAINTAINED)
    public static <A extends Annotation> List<A> q(Optional<? extends AnnotatedElement> element, Class<A> annotationType) {
        return org.junit.platform.commons.util.a.u(element, annotationType);
    }

    public static boolean r(AnnotatedElement element, Class<? extends Annotation> annotationType) {
        return org.junit.platform.commons.util.a.y(element, annotationType);
    }

    @API(since = "1.3", status = API.Status.MAINTAINED)
    public static boolean s(Optional<? extends AnnotatedElement> element, Class<? extends Annotation> annotationType) {
        return org.junit.platform.commons.util.a.A(element, annotationType);
    }
}
