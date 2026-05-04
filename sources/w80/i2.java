package w80;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<Field> f95839a = Comparator.comparingInt(new ToIntFunction() { // from class: w80.s1
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            int l11;
            l11 = i2.l((Field) obj);
            return l11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final Predicate<Field> f95840b = new Predicate() { // from class: w80.t1
        @Override // java.util.function.Predicate
        public final boolean test(Object obj) {
            return i2.b((Field) obj);
        }
    };

    public static /* synthetic */ boolean b(Field field) {
        return org.junit.platform.commons.util.a.y(field, p80.w.class) || !org.junit.platform.commons.util.a.s(field, p80.l.class).isEmpty();
    }

    public static /* synthetic */ void c(a90.n nVar, Class cls, final Field field) {
        final List list = (List) s(field).collect(Collectors.toList());
        if (!list.isEmpty()) {
            Objects.requireNonNull(nVar);
            list.forEach(new h2(nVar));
        }
        if (org.junit.platform.commons.util.a.y(field, p80.w.class)) {
            nVar.g(cls, field, new Function() { // from class: w80.v1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    p80.m n11;
                    n11 = i2.n(field, obj, list);
                    return n11;
                }
            });
        }
    }

    public static /* synthetic */ PreconditionViolationException g(Field field, Exception exc) {
        return new PreconditionViolationException(String.format("Failed to read @RegisterExtension field [%s]", field), exc);
    }

    public static /* synthetic */ void j(Object obj, final Field field, Class cls) {
        final Class<?> cls2 = obj.getClass();
        ba0.c2.f(!cls.equals(cls2), new Supplier() { // from class: w80.u1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Failed to register extension via field [%s]. The field registers an extension of type [%s] via @RegisterExtension and @ExtendWith, but only one registration of a given extension type is permitted.", field, cls2.getName());
                return format;
            }
        });
    }

    public static /* synthetic */ void k(a90.n nVar, Field field) {
        List list = (List) s(field).collect(Collectors.toList());
        if (!list.isEmpty()) {
            Objects.requireNonNull(nVar);
            list.forEach(new h2(nVar));
        }
        if (org.junit.platform.commons.util.a.y(field, p80.w.class)) {
            nVar.e(n(field, null, list), field);
        }
    }

    public static int l(Field field) {
        return ((Integer) org.junit.platform.commons.util.a.m(field, org.junit.jupiter.api.w2.class).map(new org.junit.jupiter.api.i1()).orElse(1073741823)).intValue();
    }

    public static a90.b0 m(a90.b0 parentRegistry, AnnotatedElement annotatedElement) {
        ba0.c2.r(parentRegistry, "Parent ExtensionRegistry must not be null");
        ba0.c2.r(annotatedElement, "AnnotatedElement must not be null");
        return a90.b0.q(parentRegistry, s(annotatedElement));
    }

    public static p80.m n(final Field field, Object instance, List<Class<? extends p80.m>> declarativeExtensionTypes) {
        final Object j11 = ReflectionUtils.b2(field, instance).j(new Function() { // from class: w80.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i2.g(field, (Exception) obj);
            }
        });
        ba0.c2.f(j11 instanceof p80.m, new Supplier() { // from class: w80.x1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Failed to register extension via @RegisterExtension field [%s]: field value's type [%s] must implement an [%s] API.", field, r2 != null ? j11.getClass().getName() : null, p80.m.class.getName());
                return format;
            }
        });
        declarativeExtensionTypes.forEach(new Consumer() { // from class: w80.y1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i2.j(j11, field, (Class) obj);
            }
        });
        return (p80.m) j11;
    }

    public static void o(a90.n registrar, Class<?> clazz) {
        p(registrar, ReflectionUtils.r0(clazz));
    }

    public static void p(a90.n registrar, Executable executable) {
        Parameter[] parameters;
        ba0.c2.r(registrar, "ExtensionRegistrar must not be null");
        ba0.c2.r(executable, "Executable must not be null");
        final AtomicInteger atomicInteger = new AtomicInteger();
        parameters = executable.getParameters();
        Stream flatMap = Arrays.stream(parameters).map(new Function() { // from class: w80.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List t11;
                t11 = org.junit.platform.commons.util.a.t((Parameter) obj, atomicInteger.getAndIncrement(), p80.l.class);
                return t11;
            }
        }).flatMap(new Function() { // from class: w80.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream t11;
                t11 = i2.t((List) obj);
                return t11;
            }
        });
        Objects.requireNonNull(registrar);
        flatMap.forEach(new h2(registrar));
    }

    public static void q(final a90.n registrar, final Class<?> clazz) {
        u(clazz, new z1()).forEach(new Consumer() { // from class: w80.a2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i2.c(a90.n.this, clazz, (Field) obj);
            }
        });
    }

    public static void r(final a90.n registrar, Class<?> clazz) {
        u(clazz, new d2()).forEach(new Consumer() { // from class: w80.e2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i2.k(a90.n.this, (Field) obj);
            }
        });
    }

    public static Stream<Class<? extends p80.m>> s(AnnotatedElement annotatedElement) {
        return t(org.junit.platform.commons.util.a.s(annotatedElement, p80.l.class));
    }

    public static Stream<Class<? extends p80.m>> t(List<p80.l> extendWithAnnotations) {
        return extendWithAnnotations.stream().map(new Function() { // from class: w80.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((p80.l) obj).value();
            }
        }).flatMap(new Function() { // from class: w80.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Arrays.stream((Class[]) obj);
            }
        });
    }

    public static Stream<Field> u(Class<?> clazz, Predicate<Field> predicate) {
        return ReflectionUtils.R1(clazz, predicate.and(f95840b), ReflectionUtils.HierarchyTraversalMode.TOP_DOWN).sorted(f95839a);
    }
}
