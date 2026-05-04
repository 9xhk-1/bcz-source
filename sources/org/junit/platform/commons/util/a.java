package org.junit.platform.commons.util;

import ba0.c2;
import ba0.n1;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<Class<? extends Annotation>, Boolean> f78242a = new ConcurrentHashMap<>(16);

    public static boolean A(Optional<? extends AnnotatedElement> element, Class<? extends Annotation> annotationType) {
        return p(element, annotationType).isPresent();
    }

    public static boolean B(Class<? extends Annotation> annotationType) {
        return annotationType != null && annotationType.getName().startsWith("java.lang.annotation");
    }

    public static boolean C(Class<? extends Annotation> candidateContainerType) {
        return f78242a.computeIfAbsent(candidateContainerType, new Function() { // from class: ba0.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.commons.util.a.f((Class) obj);
            }
        }).booleanValue();
    }

    public static /* synthetic */ boolean a(Class cls, Class cls2, Field field) {
        return cls.isAssignableFrom(field.getType()) && y(field, cls2);
    }

    public static /* synthetic */ JUnitException c(Class cls, Class cls2, Exception exc) {
        return new JUnitException(String.format("Container annotation type '%s' must declare a 'value' attribute of type %s[].", cls, cls2), exc);
    }

    public static /* synthetic */ boolean d(Method method) {
        return method.getName().equals("value") && method.getReturnType().isArray();
    }

    public static /* synthetic */ Repeatable e(Method method) {
        return (Repeatable) method.getReturnType().getComponentType().getAnnotation(Repeatable.class);
    }

    public static /* synthetic */ Boolean f(Class cls) {
        Repeatable repeatable = (Repeatable) Arrays.stream(cls.getMethods()).filter(new Predicate() { // from class: ba0.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return org.junit.platform.commons.util.a.d((Method) obj);
            }
        }).findFirst().map(new Function() { // from class: ba0.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.commons.util.a.e((Method) obj);
            }
        }).orElse(null);
        return Boolean.valueOf(repeatable != null && cls.equals(repeatable.value()));
    }

    public static /* synthetic */ String h(Class cls) {
        return cls.getName() + " must be @Repeatable";
    }

    public static List<Field> i(Class<?> clazz, Class<? extends Annotation> annotationType, Predicate<Field> predicate) {
        return j(clazz, annotationType, predicate, ReflectionUtils.HierarchyTraversalMode.TOP_DOWN);
    }

    public static List<Field> j(Class<?> clazz, final Class<? extends Annotation> annotationType, Predicate<Field> predicate, ReflectionUtils.HierarchyTraversalMode traversalMode) {
        c2.r(clazz, "Class must not be null");
        c2.r(annotationType, "annotationType must not be null");
        c2.r(predicate, "Predicate must not be null");
        return ReflectionUtils.f0(clazz, new Predicate() { // from class: ba0.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean y11;
                y11 = org.junit.platform.commons.util.a.y((Field) obj, annotationType);
                return y11;
            }
        }.and(predicate), traversalMode);
    }

    public static List<Method> k(Class<?> clazz, final Class<? extends Annotation> annotationType, ReflectionUtils.HierarchyTraversalMode traversalMode) {
        c2.r(clazz, "Class must not be null");
        c2.r(annotationType, "annotationType must not be null");
        return ReflectionUtils.l0(clazz, new Predicate() { // from class: ba0.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean y11;
                y11 = org.junit.platform.commons.util.a.y((Method) obj, annotationType);
                return y11;
            }
        }, traversalMode);
    }

    public static <A extends Annotation> Optional<A> l(Class<?> clazz, Class<A> annotationType, boolean searchEnclosingClasses) {
        c2.r(annotationType, "annotationType must not be null");
        if (!searchEnclosingClasses) {
            return m(clazz, annotationType);
        }
        while (clazz != null) {
            Optional<A> m11 = m(clazz, annotationType);
            if (m11.isPresent()) {
                return m11;
            }
            clazz = ReflectionUtils.W0(clazz) ? clazz.getEnclosingClass() : null;
        }
        return Optional.empty();
    }

    public static <A extends Annotation> Optional<A> m(AnnotatedElement element, Class<A> annotationType) {
        c2.r(annotationType, "annotationType must not be null");
        return n(element, annotationType, annotationType.isAnnotationPresent(Inherited.class), new HashSet());
    }

    public static <A extends Annotation> Optional<A> n(AnnotatedElement element, Class<A> annotationType, boolean inherited, Set<Annotation> visited) {
        Class superclass;
        c2.r(annotationType, "annotationType must not be null");
        if (element == null) {
            return Optional.empty();
        }
        Annotation declaredAnnotation = element.getDeclaredAnnotation(annotationType);
        if (declaredAnnotation != null) {
            return Optional.of(declaredAnnotation);
        }
        Optional<A> q11 = q(annotationType, element.getDeclaredAnnotations(), inherited, visited);
        if (q11.isPresent()) {
            return q11;
        }
        if (element instanceof Class) {
            Class cls = (Class) element;
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (cls2 != Annotation.class) {
                    Optional<A> n11 = n(cls2, annotationType, inherited, visited);
                    if (n11.isPresent()) {
                        return n11;
                    }
                }
            }
            if (inherited && (superclass = cls.getSuperclass()) != null && superclass != Object.class) {
                Optional<A> n12 = n(superclass, annotationType, inherited, visited);
                if (n12.isPresent()) {
                    return n12;
                }
            }
        }
        return q(annotationType, element.getAnnotations(), inherited, visited);
    }

    public static <A extends Annotation> Optional<A> o(Parameter parameter, int index, Class<A> annotationType) {
        return m(x(parameter, index), annotationType);
    }

    public static <A extends Annotation> Optional<A> p(Optional<? extends AnnotatedElement> element, Class<A> annotationType) {
        return (element == null || !element.isPresent()) ? Optional.empty() : m(element.get(), annotationType);
    }

    public static <A extends Annotation> Optional<A> q(Class<A> annotationType, Annotation[] candidates, boolean inherited, Set<Annotation> visited) {
        for (Annotation annotation : candidates) {
            Class<? extends Annotation> annotationType2 = annotation.annotationType();
            if (!B(annotationType2) && visited.add(annotation)) {
                Optional<A> n11 = n(annotationType2, annotationType, inherited, visited);
                if (n11.isPresent()) {
                    return n11;
                }
            }
        }
        return Optional.empty();
    }

    public static List<Field> r(Class<?> clazz, final Class<?> fieldType, final Class<? extends Annotation> annotationType) {
        c2.r(clazz, "Class must not be null");
        c2.r(fieldType, "fieldType must not be null");
        c2.r(annotationType, "annotationType must not be null");
        return (List) Arrays.stream(clazz.getFields()).filter(new Predicate() { // from class: ba0.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return org.junit.platform.commons.util.a.a(fieldType, annotationType, (Field) obj);
            }
        }).collect(n1.j());
    }

    public static <A extends Annotation> List<A> s(AnnotatedElement element, final Class<A> annotationType) {
        c2.r(annotationType, "annotationType must not be null");
        Repeatable repeatable = (Repeatable) annotationType.getAnnotation(Repeatable.class);
        c2.s(repeatable, new Supplier() { // from class: ba0.d
            @Override // java.util.function.Supplier
            public final Object get() {
                return org.junit.platform.commons.util.a.h(annotationType);
            }
        });
        Class<? extends Annotation> value = repeatable.value();
        boolean isAnnotationPresent = value.isAnnotationPresent(Inherited.class);
        if (element == null) {
            return Collections.EMPTY_LIST;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(16);
        v(element, annotationType, value, isAnnotationPresent, linkedHashSet, new HashSet(16));
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static <A extends Annotation> List<A> t(Parameter parameter, int index, Class<A> annotationType) {
        return s(x(parameter, index), annotationType);
    }

    public static <A extends Annotation> List<A> u(Optional<? extends AnnotatedElement> element, Class<A> annotationType) {
        return (element == null || !element.isPresent()) ? Collections.EMPTY_LIST : s(element.get(), annotationType);
    }

    public static <A extends Annotation> void v(AnnotatedElement element, Class<A> annotationType, Class<? extends Annotation> containerType, boolean inherited, Set<A> found, Set<Annotation> visited) {
        Class<A> cls;
        Class<? extends Annotation> cls2;
        boolean z11;
        Set<A> set;
        Set<Annotation> set2;
        Class superclass;
        if (element instanceof Class) {
            Class cls3 = (Class) element;
            if (!inherited || (superclass = cls3.getSuperclass()) == null || superclass == Object.class) {
                cls = annotationType;
                cls2 = containerType;
                z11 = inherited;
                set = found;
                set2 = visited;
            } else {
                v(superclass, annotationType, containerType, inherited, found, visited);
                set = found;
                set2 = visited;
                cls2 = containerType;
                z11 = inherited;
                cls = annotationType;
            }
            for (Class<?> cls4 : cls3.getInterfaces()) {
                if (cls4 != Annotation.class) {
                    v(cls4, cls, cls2, z11, set, set2);
                }
            }
        } else {
            cls = annotationType;
            cls2 = containerType;
            z11 = inherited;
            set = found;
            set2 = visited;
        }
        w(element.getDeclaredAnnotations(), cls, cls2, z11, set, set2);
        w(element.getAnnotations(), cls, cls2, z11, set, set2);
    }

    public static <A extends Annotation> void w(Annotation[] candidates, final Class<A> annotationType, final Class<? extends Annotation> containerType, boolean inherited, Set<A> found, Set<Annotation> visited) {
        Set<A> set = found;
        int length = candidates.length;
        int i11 = 0;
        while (i11 < length) {
            Annotation annotation = candidates[i11];
            Class<? extends Annotation> annotationType2 = annotation.annotationType();
            if (!B(annotationType2)) {
                Set<Annotation> set2 = visited;
                if (set2.add(annotation)) {
                    if (annotationType2.equals(annotationType)) {
                        set.add(annotationType.cast(annotation));
                    } else if (annotationType2.equals(containerType)) {
                        set.addAll(Arrays.asList((Annotation[]) ReflectionUtils.L0(ReflectionUtils.W1(containerType, "value", new Class[0]).j(new Function() { // from class: ba0.f
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return org.junit.platform.commons.util.a.c(containerType, annotationType, (Exception) obj);
                            }
                        }), annotation, new Object[0])));
                    } else if (C(annotationType2)) {
                        Annotation[] annotationArr = (Annotation[]) ReflectionUtils.L0(ReflectionUtils.W1(annotationType2, "value", new Class[0]).q().get(), annotation, new Object[0]);
                        int length2 = annotationArr.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            v(annotationArr[i12].getClass(), annotationType, containerType, inherited, set, set2);
                            i12++;
                            set = found;
                            set2 = visited;
                        }
                    } else {
                        v(annotationType2, annotationType, containerType, inherited, set, set2);
                    }
                }
            }
            i11++;
            set = found;
        }
    }

    public static AnnotatedElement x(Parameter parameter, int index) {
        Executable declaringExecutable;
        Class declaringClass;
        Annotation[][] parameterAnnotations;
        int parameterCount;
        Parameter[] parameters;
        c2.r(parameter, "Parameter must not be null");
        declaringExecutable = parameter.getDeclaringExecutable();
        if (!(declaringExecutable instanceof Constructor)) {
            return parameter;
        }
        declaringClass = declaringExecutable.getDeclaringClass();
        if (!ReflectionUtils.W0(declaringClass)) {
            return parameter;
        }
        parameterAnnotations = declaringExecutable.getParameterAnnotations();
        int length = parameterAnnotations.length;
        parameterCount = declaringExecutable.getParameterCount();
        if (length != parameterCount - 1) {
            return parameter;
        }
        if (index == 0) {
            return null;
        }
        parameters = declaringExecutable.getParameters();
        return parameters[index - 1];
    }

    public static boolean y(AnnotatedElement element, Class<? extends Annotation> annotationType) {
        return m(element, annotationType).isPresent();
    }

    public static boolean z(Parameter parameter, int index, Class<? extends Annotation> annotationType) {
        return o(parameter, index, annotationType).isPresent();
    }
}
