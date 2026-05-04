package x80;

import ha0.u;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;
import w80.d5;
import w80.j2;
import w80.p4;
import w80.s3;
import w80.t4;
import w80.z4;
import x80.a2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a2 implements ha0.u {

    /* renamed from: b, reason: collision with root package name */
    public static final y90.e f97787b = y90.g.c(a2.class);

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f97788c = new a1();

    /* renamed from: d, reason: collision with root package name */
    public static final Predicate<Class<?>> f97789d = new y80.d().or(new y80.b());

    /* renamed from: a, reason: collision with root package name */
    public final v80.e0 f97790a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* renamed from: d, reason: collision with root package name */
        public static final b f97791d = new a("TEST", 0, new y80.f(), "method", new String[0]);

        /* renamed from: e, reason: collision with root package name */
        public static final b f97792e = new C1316b("TEST_FACTORY", 1, new y80.e(), s3.f95922r, s3.f95923s, s3.f95924t);

        /* renamed from: f, reason: collision with root package name */
        public static final b f97793f = new c("TEST_TEMPLATE", 2, new y80.g(), d5.f95775n, t4.f95935s);

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ b[] f97794g = f();

        /* renamed from: a, reason: collision with root package name */
        public final Predicate<Method> f97795a;

        /* renamed from: b, reason: collision with root package name */
        public final String f97796b;

        /* renamed from: c, reason: collision with root package name */
        public final Set<String> f97797c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends b {
            public a(String $enum$name, int $enum$ordinal, Predicate methodPredicate, String segmentType, String... dynamicDescendantSegmentTypes) {
                super($enum$name, $enum$ordinal, methodPredicate, segmentType, dynamicDescendantSegmentTypes);
            }

            @Override // x80.a2.b
            public TestDescriptor k(UniqueId uniqueId, Class<?> testClass, Method method, v80.e0 configuration) {
                return new p4(uniqueId, testClass, method, configuration);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: x80.a2$b$b, reason: collision with other inner class name */
        public enum C1316b extends b {
            public C1316b(String $enum$name, int $enum$ordinal, Predicate methodPredicate, String segmentType, String... dynamicDescendantSegmentTypes) {
                super($enum$name, $enum$ordinal, methodPredicate, segmentType, dynamicDescendantSegmentTypes);
            }

            @Override // x80.a2.b
            public TestDescriptor k(UniqueId uniqueId, Class<?> testClass, Method method, v80.e0 configuration) {
                return new s3(uniqueId, testClass, method, configuration);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends b {
            public c(String $enum$name, int $enum$ordinal, Predicate methodPredicate, String segmentType, String... dynamicDescendantSegmentTypes) {
                super($enum$name, $enum$ordinal, methodPredicate, segmentType, dynamicDescendantSegmentTypes);
            }

            @Override // x80.a2.b
            public TestDescriptor k(UniqueId uniqueId, Class<?> testClass, Method method, v80.e0 configuration) {
                return new d5(uniqueId, testClass, method, configuration);
            }
        }

        public static /* synthetic */ Optional c(final b bVar, UniqueId.Segment segment, final v80.e0 e0Var, final TestDescriptor testDescriptor) {
            bVar.getClass();
            String value = segment.getValue();
            final Class<?> E0 = ((w80.o0) testDescriptor).E0();
            return a2.f97788c.b(value, E0).filter(bVar.f97795a).map(new Function() { // from class: x80.b2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    TestDescriptor k11;
                    k11 = r0.k(a2.b.this.l(r5, testDescriptor), E0, (Method) obj, e0Var);
                    return k11;
                }
            });
        }

        public static /* synthetic */ b[] f() {
            return new b[]{f97791d, f97792e, f97793f};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f97794g.clone();
        }

        public abstract TestDescriptor k(UniqueId uniqueId, Class<?> testClass, Method method, v80.e0 configuration);

        public final UniqueId l(Method method, TestDescriptor parent) {
            return parent.getUniqueId().append(this.f97796b, String.format("%s(%s)", method.getName(), ba0.y.d(method.getParameterTypes())));
        }

        public final Optional<TestDescriptor> m(final List<Class<?>> enclosingClasses, final Class<?> testClass, final Method method, u.a context, final v80.e0 configuration) {
            return !this.f97795a.test(method) ? Optional.empty() : context.a(new Supplier() { // from class: x80.c2
                @Override // java.util.function.Supplier
                public final Object get() {
                    ca0.l p11;
                    p11 = a2.b.this.p(enclosingClasses, testClass);
                    return p11;
                }
            }, new Function() { // from class: x80.d2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Optional of2;
                    of2 = Optional.of(r0.k(a2.b.this.l(r1, (TestDescriptor) obj), testClass, method, configuration));
                    return of2;
                }
            });
        }

        public final Optional<TestDescriptor> o(final UniqueId uniqueId, u.a context, final v80.e0 configuration) {
            final UniqueId.Segment lastSegment = uniqueId.getLastSegment();
            return this.f97796b.equals(lastSegment.getType()) ? context.a(new Supplier() { // from class: x80.e2
                @Override // java.util.function.Supplier
                public final Object get() {
                    ca0.l V;
                    V = da0.x.V(UniqueId.this.removeLastSegment());
                    return V;
                }
            }, new Function() { // from class: x80.f2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return a2.b.c(a2.b.this, lastSegment, configuration, (TestDescriptor) obj);
                }
            }) : this.f97797c.contains(lastSegment.getType()) ? o(uniqueId.removeLastSegment(), context, configuration) : Optional.empty();
        }

        public final ca0.l p(List<Class<?>> enclosingClasses, Class<?> testClass) {
            return enclosingClasses.isEmpty() ? da0.x.h(testClass) : da0.x.I(enclosingClasses, testClass);
        }

        public b(String $enum$name, int $enum$ordinal, Predicate methodPredicate, String segmentType, String... dynamicDescendantSegmentTypes) {
            this.f97795a = methodPredicate;
            this.f97796b = segmentType;
            this.f97797c = new LinkedHashSet(Arrays.asList(dynamicDescendantSegmentTypes));
        }
    }

    public a2(v80.e0 configuration) {
        this.f97790a = configuration;
    }

    public static /* synthetic */ u.b r(a2 a2Var, BiFunction biFunction, TestDescriptor testDescriptor) {
        return (u.b) biFunction.apply(testDescriptor, a2Var.x(testDescriptor));
    }

    public static /* synthetic */ u.b s(da0.y0 y0Var, TestDescriptor testDescriptor, Supplier supplier) {
        if (testDescriptor instanceof j2) {
            ((j2) testDescriptor).p().e(y0Var.e());
        }
        return u.b.g(testDescriptor, supplier);
    }

    public static /* synthetic */ Set t(TestDescriptor testDescriptor) {
        if (testDescriptor instanceof j2) {
            ((j2) testDescriptor).p().d();
        }
        return Collections.EMPTY_SET;
    }

    public static /* synthetic */ u.c v(a2 a2Var, UniqueId uniqueId, TestDescriptor testDescriptor) {
        a2Var.getClass();
        boolean equals = uniqueId.equals(testDescriptor.getUniqueId());
        if (testDescriptor instanceof j2) {
            j2 j2Var = (j2) testDescriptor;
            if (equals) {
                j2Var.p().d();
            } else {
                j2Var.p().f(uniqueId);
            }
        }
        return u.c.d(equals ? u.b.a(testDescriptor) : u.b.g(testDescriptor, a2Var.x(testDescriptor)));
    }

    @Override // ha0.u
    public u.c f(final da0.y0 selector, u.a context) {
        if (!(selector.f() instanceof da0.j1)) {
            return u.c.g();
        }
        da0.j1 j1Var = (da0.j1) selector.f();
        return y(context, Collections.EMPTY_LIST, j1Var.g(), new t1(j1Var), new BiFunction() { // from class: x80.y1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return a2.s(da0.y0.this, (TestDescriptor) obj, (Supplier) obj2);
            }
        });
    }

    @Override // ha0.u
    public u.c i(da0.j1 selector, u.a context) {
        return y(context, Collections.EMPTY_LIST, selector.g(), new t1(selector), new u1());
    }

    @Override // ha0.u
    public u.c k(final da0.r1 selector, u.a context) {
        return y(context, selector.e(), selector.i(), new Supplier() { // from class: x80.q1
            @Override // java.util.function.Supplier
            public final Object get() {
                return da0.r1.this.f();
            }
        }, new u1());
    }

    @Override // ha0.u
    public u.c l(da0.u1 selector, final u.a context) {
        final UniqueId b11 = selector.b();
        return (u.c) Arrays.stream(b.values()).map(new Function() { // from class: x80.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional o11;
                a2.b bVar = (a2.b) obj;
                o11 = bVar.o(b11, context, a2.this.f97790a);
                return o11;
            }
        }).filter(new w80.d1()).map(new z4()).map(new Function() { // from class: x80.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a2.v(a2.this, b11, (TestDescriptor) obj);
            }
        }).findFirst().orElse(u.c.g());
    }

    public final Supplier<Set<? extends ca0.l>> x(final TestDescriptor testDescriptor) {
        return new Supplier() { // from class: x80.x1
            @Override // java.util.function.Supplier
            public final Object get() {
                return a2.t(TestDescriptor.this);
            }
        };
    }

    public final u.c y(final u.a context, final List<Class<?>> enclosingClasses, final Class<?> testClass, Supplier<Method> methodSupplier, final BiFunction<TestDescriptor, Supplier<Set<? extends ca0.l>>, u.b> matchFactory) {
        if (!f97789d.test(testClass)) {
            return u.c.g();
        }
        final Method method = methodSupplier.get();
        final Set set = (Set) Arrays.stream(b.values()).map(new Function() { // from class: x80.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional m11;
                a2.b bVar = (a2.b) obj;
                m11 = bVar.m(enclosingClasses, testClass, method, context, a2.this.f97790a);
                return m11;
            }
        }).filter(new w80.d1()).map(new z4()).map(new Function() { // from class: x80.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a2.r(a2.this, matchFactory, (TestDescriptor) obj);
            }
        }).collect(Collectors.toSet());
        if (set.size() > 1) {
            f97787b.f(new Supplier() { // from class: x80.s1
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Possible configuration error: method [%s] resulted in multiple TestDescriptors %s. This is typically the result of annotating a method with multiple competing annotations such as @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, etc.", method.toGenericString(), set.stream().map(new z1()).map(new Function() { // from class: x80.p1
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String name;
                            name = ((TestDescriptor) obj).getClass().getName();
                            return name;
                        }
                    }).collect(Collectors.toList()));
                    return format;
                }
            });
        }
        return set.isEmpty() ? u.c.g() : u.c.e(set);
    }
}
