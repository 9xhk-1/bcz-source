package v90;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.jupiter.api.a2;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;
import v90.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final List<a> f93686a = Arrays.asList(new a("accept", 1, 0), new a("provideArguments", 2, 1), new a("convert", 3, 2));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f93687a;

        /* renamed from: b, reason: collision with root package name */
        public final int f93688b;

        /* renamed from: c, reason: collision with root package name */
        public final int f93689c;

        public a(String methodName, int parameterCount, int annotationParameterIndex) {
            this.f93687a = methodName;
            this.f93688b = parameterCount;
            this.f93689c = annotationParameterIndex;
        }

        public int a() {
            return this.f93689c;
        }

        public boolean b(Method method) {
            return method.getName().equals(this.f93687a) && a2.a(method) == this.f93688b && method.getParameterTypes()[this.f93689c].isAnnotation();
        }
    }

    public static /* synthetic */ Predicate b(final a aVar) {
        Objects.requireNonNull(aVar);
        return new Predicate() { // from class: v90.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.a.this.b((Method) obj);
            }
        };
    }

    public static /* synthetic */ boolean c(Method method) {
        return false;
    }

    public static <T extends Annotation> List<T> e(AnnotatedElement annotatedElement, Class<T> annotationType) {
        return annotationType.isAnnotationPresent(Repeatable.class) ? org.junit.platform.commons.util.a.s(annotatedElement, annotationType) : (List) org.junit.platform.commons.util.a.m(annotatedElement, annotationType).map(new Function() { // from class: v90.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collections.singletonList((Annotation) obj);
            }
        }).orElse(Collections.EMPTY_LIST);
    }

    public static <T> Class<? extends Annotation> f(T annotationConsumerInstance) {
        return g(ReflectionUtils.l0(annotationConsumerInstance.getClass(), (Predicate) f93686a.stream().map(new Function() { // from class: v90.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j.b((j.a) obj);
            }
        }).reduce(new Predicate() { // from class: v90.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.c((Method) obj);
            }
        }, new BinaryOperator() { // from class: v90.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((Predicate) obj).or((Predicate) obj2);
            }
        }), ReflectionUtils.HierarchyTraversalMode.BOTTOM_UP).get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Annotation> g(final Method method) {
        return method.getParameterTypes()[((Integer) f93686a.stream().filter(new Predicate() { // from class: v90.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean b11;
                b11 = ((j.a) obj).b(method);
                return b11;
            }
        }).findFirst().map(new Function() { // from class: v90.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((j.a) obj).a());
            }
        }).orElse(0)).intValue()];
    }

    public static <T> T h(AnnotatedElement annotatedElement, final T annotationConsumerInstance) {
        if (!(annotationConsumerInstance instanceof v90.a)) {
            return annotationConsumerInstance;
        }
        Class<? extends Annotation> f11 = f(annotationConsumerInstance);
        List e11 = e(annotatedElement, f11);
        if (!e11.isEmpty()) {
            e11.forEach(new Consumer() { // from class: v90.h
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    j.i((a) annotationConsumerInstance, (Annotation) obj);
                }
            });
            return annotationConsumerInstance;
        }
        throw new JUnitException(annotationConsumerInstance.getClass().getName() + " must be used with an annotation of type " + f11.getName());
    }

    public static <A extends Annotation> void i(v90.a<A> instance, A annotation) {
        try {
            instance.accept(annotation);
        } catch (Exception e11) {
            throw new JUnitException("Failed to initialize AnnotationConsumer: " + instance, e11);
        }
    }
}
