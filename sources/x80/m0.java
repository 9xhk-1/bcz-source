package x80;

import ha0.u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;
import w80.l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m0 implements ha0.u {

    /* renamed from: c, reason: collision with root package name */
    public static final y80.d f97860c = new y80.d();

    /* renamed from: d, reason: collision with root package name */
    public static final y80.b f97861d = new y80.b();

    /* renamed from: a, reason: collision with root package name */
    public final Predicate<String> f97862a;

    /* renamed from: b, reason: collision with root package name */
    public final v80.e0 f97863b;

    public m0(Predicate<String> classNameFilter, v80.e0 configuration) {
        this.f97862a = classNameFilter;
        this.f97863b = configuration;
    }

    public static /* synthetic */ Optional p(m0 m0Var, da0.p1 p1Var, TestDescriptor testDescriptor) {
        m0Var.getClass();
        return Optional.of(m0Var.D(testDescriptor, p1Var.f()));
    }

    public static /* synthetic */ u.c t(final m0 m0Var, u.a aVar, final Class cls) {
        m0Var.getClass();
        return m0Var.G(aVar.c(new Function() { // from class: x80.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional of2;
                of2 = Optional.of(m0.this.C((TestDescriptor) obj, cls));
                return of2;
            }
        }));
    }

    public static /* synthetic */ Optional u(final m0 m0Var, String str, final TestDescriptor testDescriptor) {
        m0Var.getClass();
        return testDescriptor instanceof w80.o0 ? ReflectionUtils.m0(((w80.o0) testDescriptor).E0(), f97861d.and(ba0.q1.b(new org.junit.jupiter.api.p1(), Predicate.isEqual(str)))).stream().findFirst().flatMap(new Function() { // from class: x80.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional of2;
                of2 = Optional.of(m0.this.D(testDescriptor, (Class) obj));
                return of2;
            }
        }) : Optional.empty();
    }

    public static /* synthetic */ u.c w(final m0 m0Var, w80.o0 o0Var) {
        m0Var.getClass();
        final Class<?> E0 = o0Var.E0();
        final ArrayList arrayList = new ArrayList(o0Var.D0());
        arrayList.add(E0);
        return u.c.d(u.b.b(o0Var, new Supplier() { // from class: x80.h0
            @Override // java.util.function.Supplier
            public final Object get() {
                return m0.y(m0.this, E0, arrayList);
            }
        }));
    }

    public static /* synthetic */ Set y(final m0 m0Var, Class cls, final List list) {
        m0Var.getClass();
        return (Set) Stream.concat(ReflectionUtils.k0(cls, y80.d.f99677d).stream().map(new Function() { // from class: x80.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ca0.l F;
                F = m0.this.F(list, (Method) obj);
                return F;
            }
        }), z90.i.w(cls, f97861d).map(new Function() { // from class: x80.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                da0.p1 I;
                I = da0.x.I(list, (Class) obj);
                return I;
            }
        })).collect(Collectors.toCollection(new w80.b()));
    }

    public static /* synthetic */ ca0.l z(m0 m0Var, da0.p1 p1Var) {
        m0Var.getClass();
        return m0Var.E(p1Var.e());
    }

    public final w80.r0 C(TestDescriptor parent, Class<?> testClass) {
        return new w80.r0(parent.getUniqueId().append("class", testClass.getName()), testClass, this.f97863b);
    }

    public final l3 D(TestDescriptor parent, Class<?> testClass) {
        return new l3(parent.getUniqueId().append("nested-class", testClass.getSimpleName()), testClass, this.f97863b);
    }

    public final ca0.l E(List<Class<?>> classes) {
        if (classes.size() == 1) {
            return da0.x.h(classes.get(0));
        }
        int size = classes.size() - 1;
        return da0.x.I(classes.subList(0, size), classes.get(size));
    }

    public final ca0.l F(List<Class<?>> classes, Method method) {
        if (classes.size() == 1) {
            return da0.x.x(classes.get(0), method);
        }
        int size = classes.size() - 1;
        return da0.x.P(classes.subList(0, size), classes.get(size), method);
    }

    public final u.c G(Optional<? extends w80.o0> testDescriptor) {
        return (u.c) testDescriptor.map(new Function() { // from class: x80.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0.w(m0.this, (w80.o0) obj);
            }
        }).orElse(u.c.g());
    }

    @Override // ha0.u
    public u.c a(final da0.p1 selector, u.a context) {
        return f97861d.test(selector.f()) ? G(context.a(new Supplier() { // from class: x80.j0
            @Override // java.util.function.Supplier
            public final Object get() {
                return m0.z(m0.this, selector);
            }
        }, new Function() { // from class: x80.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0.p(m0.this, selector, (TestDescriptor) obj);
            }
        })) : u.c.g();
    }

    @Override // ha0.u
    public u.c e(da0.e selector, u.a context) {
        final Class<?> e11 = selector.e();
        if (f97860c.test(e11)) {
            if (this.f97862a.test(e11.getName())) {
                return G(context.c(new Function() { // from class: x80.a0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Optional of2;
                        of2 = Optional.of(m0.this.C((TestDescriptor) obj, e11));
                        return of2;
                    }
                }));
            }
        } else if (f97861d.test(e11)) {
            return G(context.a(new Supplier() { // from class: x80.b0
                @Override // java.util.function.Supplier
                public final Object get() {
                    ca0.l h11;
                    h11 = da0.x.h(e11.getEnclosingClass());
                    return h11;
                }
            }, new Function() { // from class: x80.c0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Optional of2;
                    of2 = Optional.of(m0.this.D((TestDescriptor) obj, e11));
                    return of2;
                }
            }));
        }
        return u.c.g();
    }

    @Override // ha0.u
    public u.c l(da0.u1 selector, final u.a context) {
        final UniqueId b11 = selector.b();
        UniqueId.Segment lastSegment = b11.getLastSegment();
        if ("class".equals(lastSegment.getType())) {
            return (u.c) ReflectionUtils.X1(lastSegment.getValue()).q().filter(f97860c).map(new Function() { // from class: x80.e0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return m0.t(m0.this, context, (Class) obj);
                }
            }).orElse(u.c.g());
        }
        if (!"nested-class".equals(lastSegment.getType())) {
            return u.c.g();
        }
        final String value = lastSegment.getValue();
        return G(context.a(new Supplier() { // from class: x80.f0
            @Override // java.util.function.Supplier
            public final Object get() {
                ca0.l V;
                V = da0.x.V(UniqueId.this.removeLastSegment());
                return V;
            }
        }, new Function() { // from class: x80.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0.u(m0.this, value, (TestDescriptor) obj);
            }
        }));
    }
}
