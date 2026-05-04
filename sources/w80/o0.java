package w80;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apiguardian.api.API;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.TestInstantiationException;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.descriptor.ClassSource;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;
import org.junit.platform.engine.support.hierarchical.Node;
import org.junit.platform.engine.support.hierarchical.m;
import p80.q;
import w80.u2;
import z80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.5", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public abstract class o0 extends u2 {

    /* renamed from: p, reason: collision with root package name */
    public static final z80.n f95871p = new z80.n();

    /* renamed from: i, reason: collision with root package name */
    public final Class<?> f95872i;

    /* renamed from: j, reason: collision with root package name */
    public final Set<TestTag> f95873j;

    /* renamed from: k, reason: collision with root package name */
    public final TestInstance.Lifecycle f95874k;

    /* renamed from: l, reason: collision with root package name */
    public Node.ExecutionMode f95875l;

    /* renamed from: m, reason: collision with root package name */
    public p80.y f95876m;

    /* renamed from: n, reason: collision with root package name */
    public List<Method> f95877n;

    /* renamed from: o, reason: collision with root package name */
    public List<Method> f95878o;

    public o0(UniqueId uniqueId, Class<?> testClass, Supplier<String> displayNameSupplier, v80.e0 configuration) {
        super(uniqueId, testClass, displayNameSupplier, ClassSource.from(testClass), configuration);
        this.f95872i = testClass;
        this.f95873j = u2.P(testClass);
        TestInstance.Lifecycle a11 = v3.a(testClass, configuration);
        this.f95874k = a11;
        this.f95875l = a11 == TestInstance.Lifecycle.PER_CLASS ? Node.ExecutionMode.SAME_THREAD : null;
    }

    public static /* synthetic */ void Y(o0 o0Var, Method method, p80.n nVar, a90.o oVar) {
        o0Var.getClass();
        o0Var.O0(method, nVar, oVar, new n.a.InterfaceC1389a() { // from class: w80.n
            @Override // z80.n.a.InterfaceC1389a
            public final void a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar2) {
                qVar.v(aVar, vVar, nVar2);
            }
        });
    }

    public static /* synthetic */ JUnitException c0(Method method) {
        return new JUnitException("Failed to find instance for method: " + method.toGenericString());
    }

    public static /* synthetic */ void e0(o0 o0Var, Method method, Object obj, p80.n nVar, a90.o oVar) {
        p80.n nVar2;
        a90.o oVar2;
        o0Var.getClass();
        try {
            nVar2 = nVar;
            oVar2 = oVar;
            try {
                f95871p.c(method, obj, nVar2, oVar2, n.a.c(new n.a.InterfaceC1389a() { // from class: w80.c0
                    @Override // z80.n.a.InterfaceC1389a
                    public final void a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar3) {
                        qVar.J(aVar, vVar, nVar3);
                    }
                }));
            } catch (Throwable th2) {
                th = th2;
                o0Var.M0(oVar2, nVar2, th);
            }
        } catch (Throwable th3) {
            th = th3;
            nVar2 = nVar;
            oVar2 = oVar;
        }
    }

    public static /* synthetic */ void g0(o0 o0Var, final p80.z zVar, final p80.n nVar, final p80.b0 b0Var) {
        o0Var.getClass();
        o0Var.C0(new r80.a() { // from class: w80.p
            @Override // r80.a
            public final void execute() {
                p80.b0.this.r(zVar, nVar);
            }
        });
    }

    public static /* synthetic */ void k0(o0 o0Var, p80.f0 f0Var, a90.o oVar, p80.n nVar, a90.n nVar2) {
        o0Var.getClass();
        o0Var.R0(f0Var.d(), oVar, nVar);
        nVar2.d(o0Var.f95872i, f0Var.d());
    }

    public static /* synthetic */ p80.j n0(a90.b0 b0Var, p80.n nVar) {
        return new z80.h(nVar, b0Var);
    }

    public static /* synthetic */ void o0(o0 o0Var, final Object obj, final p80.n nVar, final p80.a0 a0Var) {
        o0Var.getClass();
        o0Var.C0(new r80.a() { // from class: w80.s
            @Override // r80.a
            public final void execute() {
                p80.a0.this.d(obj, nVar);
            }
        });
    }

    public static /* synthetic */ void p0(final o0 o0Var, org.junit.platform.engine.support.hierarchical.m mVar, final Object obj, final p80.n nVar, final a90.o oVar, final Method method) {
        o0Var.getClass();
        mVar.c(new m.a() { // from class: w80.g0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                o0.u0(o0.this, method, obj, nVar, oVar);
            }
        });
    }

    public static /* synthetic */ p80.f0 t0(final o0 o0Var, final p0 p0Var, final z80.t tVar, final a90.o oVar, final a90.n nVar, final org.junit.platform.engine.support.hierarchical.m mVar) {
        o0Var.getClass();
        return p0Var.I().orElseGet(new Supplier() { // from class: w80.z
            @Override // java.util.function.Supplier
            public final Object get() {
                p80.f0 F0;
                F0 = o0.this.F0(tVar, p0Var, oVar, nVar, mVar);
                return F0;
            }
        });
    }

    public static /* synthetic */ void u0(o0 o0Var, Method method, Object obj, p80.n nVar, a90.o oVar) {
        p80.n nVar2;
        a90.o oVar2;
        o0Var.getClass();
        try {
            nVar2 = nVar;
            oVar2 = oVar;
            try {
                f95871p.c(method, obj, nVar2, oVar2, n.a.c(new n.a.InterfaceC1389a() { // from class: w80.k0
                    @Override // z80.n.a.InterfaceC1389a
                    public final void a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar3) {
                        qVar.p(aVar, vVar, nVar3);
                    }
                }));
            } catch (Throwable th2) {
                th = th2;
                o0Var.J0(oVar2, nVar2, th);
            }
        } catch (Throwable th3) {
            th = th3;
            nVar2 = nVar;
            oVar2 = oVar;
        }
    }

    public static /* synthetic */ void w0(o0 o0Var, Method method, p80.n nVar, a90.o oVar) {
        o0Var.getClass();
        o0Var.O0(method, nVar, oVar, new n.a.InterfaceC1389a() { // from class: w80.r
            @Override // z80.n.a.InterfaceC1389a
            public final void a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar2) {
                qVar.o(aVar, vVar, nVar2);
            }
        });
    }

    public static /* synthetic */ void y0(a90.n nVar, Function function, Method method) {
        i2.p(nVar, method);
        nVar.f((p80.m) function.apply(method), method);
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void x(z80.t context) {
        org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        Throwable d11 = l11.d();
        if (context.d()) {
            K0(context);
        }
        if (context.b()) {
            I0(context);
        }
        if (U0(context) && context.i().E().isPresent()) {
            T0(context);
        }
        if (d11 != l11.d()) {
            l11.b();
        }
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public z80.t D(final z80.t context) {
        final org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        if (U0(context)) {
            final p0 p0Var = (p0) context.i();
            l11.c(new m.a() { // from class: w80.d0
                @Override // org.junit.platform.engine.support.hierarchical.m.a
                public final void execute() {
                    z80.t tVar = z80.t.this;
                    p0Var.m0(tVar.k().a(tVar.j(), l11));
                }
            });
        }
        if (l11.f()) {
            context.a(true);
            L0(context);
            if (l11.f()) {
                context.c(true);
                N0(context);
            }
        }
        l11.b();
        return context;
    }

    public final void C0(r80.a executable) {
        try {
            executable.execute();
        } catch (Throwable th2) {
            throw ba0.o1.e(th2);
        }
    }

    public abstract List<Class<?>> D0();

    public final Class<?> E0() {
        return this.f95872i;
    }

    public final p80.f0 F0(z80.t parentExecutionContext, final p80.n extensionContext, final a90.o registry, final a90.n registrar, org.junit.platform.engine.support.hierarchical.m throwableCollector) {
        final p80.f0 H0 = H0(parentExecutionContext, registry, registrar, extensionContext, throwableCollector);
        throwableCollector.c(new m.a() { // from class: w80.t
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                o0.k0(o0.this, H0, registry, extensionContext, registrar);
            }
        });
        return H0;
    }

    public p80.f0 G0(Optional<p80.f0> outerInstances, a90.o registry, p80.n extensionContext) {
        Optional<Object> map = outerInstances.map(new b0());
        S0(new t0(this.f95872i, map), registry, extensionContext);
        final Object Q0 = this.f95876m != null ? Q0(map, extensionContext) : P0(map, registry, extensionContext);
        return (p80.f0) outerInstances.map(new Function() { // from class: w80.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                z80.k f11;
                f11 = z80.k.f((p80.f0) obj, Q0);
                return f11;
            }
        }).orElse(z80.k.e(Q0));
    }

    public abstract p80.f0 H0(z80.t parentExecutionContext, a90.o registry, a90.n registrar, p80.n extensionContext, org.junit.platform.engine.support.hierarchical.m throwableCollector);

    public final void I0(z80.t context) {
        a90.b0 j11 = context.j();
        final p80.n i11 = context.i();
        final org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        ba0.n1.d(j11.c(p80.a.class), new Consumer() { // from class: w80.w
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.m.this.c(new m.a() { // from class: w80.i0
                    @Override // org.junit.platform.engine.support.hierarchical.m.a
                    public final void execute() {
                        p80.a.this.g(r2);
                    }
                });
            }
        });
    }

    public final void J0(a90.o registry, final p80.n context, Throwable throwable) {
        Q(p80.r.class, registry, throwable, new u2.b() { // from class: w80.j0
            @Override // w80.u2.b
            public final void a(p80.m mVar, Throwable th2) {
                ((p80.r) mVar).j(p80.n.this, th2);
            }
        });
    }

    public final void K0(z80.t context) {
        final a90.b0 j11 = context.j();
        final p80.n i11 = context.i();
        final org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        final Object orElse = i11.E().orElse(null);
        this.f95878o.forEach(new Consumer() { // from class: w80.j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.p0(o0.this, l11, orElse, i11, j11, (Method) obj);
            }
        });
    }

    @Override // w80.u2
    public Optional<Node.ExecutionMode> L() {
        return Optional.ofNullable(this.f95875l);
    }

    public final void L0(z80.t context) {
        a90.b0 j11 = context.j();
        final p80.n i11 = context.i();
        org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        for (final p80.e eVar : j11.c(p80.e.class)) {
            l11.c(new m.a() { // from class: w80.e0
                @Override // org.junit.platform.engine.support.hierarchical.m.a
                public final void execute() {
                    p80.e.this.A(i11);
                }
            });
            if (l11.g()) {
                return;
            }
        }
    }

    public final void M0(a90.o registry, final p80.n context, Throwable throwable) {
        Q(p80.r.class, registry, throwable, new u2.b() { // from class: w80.i
            @Override // w80.u2.b
            public final void a(p80.m mVar, Throwable th2) {
                ((p80.r) mVar).q(p80.n.this, th2);
            }
        });
    }

    public final void N0(z80.t context) {
        final a90.b0 j11 = context.j();
        final p80.n i11 = context.i();
        org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        final Object orElse = i11.E().orElse(null);
        for (final Method method : this.f95877n) {
            l11.c(new m.a() { // from class: w80.f0
                @Override // org.junit.platform.engine.support.hierarchical.m.a
                public final void execute() {
                    o0.e0(o0.this, method, orElse, i11, j11);
                }
            });
            if (l11.g()) {
                return;
            }
        }
    }

    @Override // w80.u2
    public Optional<Node.ExecutionMode> O() {
        return N(E0());
    }

    public final void O0(final Method method, p80.n context, a90.o registry, n.a.InterfaceC1389a interceptorCall) {
        f95871p.c(method, context.r().c(this.f95872i).orElseThrow(new Supplier() { // from class: w80.y
            @Override // java.util.function.Supplier
            public final Object get() {
                return o0.c0(method);
            }
        }), context, registry, n.a.c(interceptorCall));
    }

    public final Object P0(Optional<Object> outerInstance, a90.o registry, p80.n extensionContext) {
        return f95871p.b(ReflectionUtils.r0(this.f95872i), outerInstance, extensionContext, registry, new n.a() { // from class: w80.x
            @Override // z80.n.a
            public final Object a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar) {
                return qVar.i(aVar, vVar, nVar);
            }
        });
    }

    public final Object Q0(Optional<Object> outerInstance, p80.n extensionContext) {
        try {
            Object G = this.f95876m.G(new t0(this.f95872i, outerInstance), extensionContext);
            if (this.f95872i.isInstance(G)) {
                return G;
            }
            String name = this.f95872i.getName();
            Class<?> cls = G == null ? null : G.getClass();
            String name2 = cls == null ? "null" : cls.getName();
            if (name.equals(name2)) {
                String str = name + EmailAutoCompleteEditText.f17091d + Integer.toHexString(System.identityHashCode(this.f95872i));
                name2 = name2 + EmailAutoCompleteEditText.f17091d + Integer.toHexString(System.identityHashCode(cls));
                name = str;
            }
            throw new TestInstantiationException(String.format("TestInstanceFactory [%s] failed to return an instance of [%s] and instead returned an instance of [%s].", this.f95876m.getClass().getName(), name, name2));
        } catch (Throwable th2) {
            ba0.h4.a(th2);
            if (th2 instanceof TestInstantiationException) {
                throw th2;
            }
            String format = String.format("TestInstanceFactory [%s] failed to instantiate test class [%s]", this.f95876m.getClass().getName(), this.f95872i.getName());
            if (ba0.e4.h(th2.getMessage())) {
                format = format + ": " + th2.getMessage();
            }
            throw new TestInstantiationException(format, th2);
        }
    }

    public final void R0(final Object instance, a90.o registry, final p80.n context) {
        registry.a(p80.a0.class).forEach(new Consumer() { // from class: w80.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.o0(o0.this, instance, context, (p80.a0) obj);
            }
        });
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: S */
    public z80.t l(z80.t context) {
        final a90.b0 m11 = i2.m(context.j(), this.f95872i);
        i2.r(m11, this.f95872i);
        p80.y Y0 = Y0(m11);
        this.f95876m = Y0;
        if (Y0 == null) {
            i2.o(m11, this.f95872i);
        }
        Class<?> cls = this.f95872i;
        TestInstance.Lifecycle lifecycle = this.f95874k;
        TestInstance.Lifecycle lifecycle2 = TestInstance.Lifecycle.PER_METHOD;
        this.f95877n = y2.i(cls, lifecycle == lifecycle2);
        this.f95878o = y2.g(this.f95872i, this.f95874k == lifecycle2);
        this.f95877n.forEach(new Consumer() { // from class: w80.l0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i2.p(a90.b0.this, (Method) obj);
            }
        });
        W0(m11);
        V0(m11);
        this.f95878o.forEach(new Consumer() { // from class: w80.m0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i2.p(a90.b0.this, (Method) obj);
            }
        });
        i2.q(m11, this.f95872i);
        org.junit.platform.engine.support.hierarchical.m a11 = b90.a.a();
        p0 p0Var = new p0(context.i(), context.h(), this, this.f95874k, context.g(), a11, new Function() { // from class: w80.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return o0.n0(a90.b0.this, (p80.n) obj);
            }
        });
        return context.f().e(c1(context, p0Var)).d(m11).c(p0Var).f(a11).a();
    }

    public final void S0(final p80.z factoryContext, a90.o registry, final p80.n context) {
        registry.a(p80.b0.class).forEach(new Consumer() { // from class: w80.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.g0(o0.this, factoryContext, context, (p80.b0) obj);
            }
        });
    }

    public final void T0(z80.t context) {
        final p80.n i11 = context.i();
        final org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        ba0.n1.d(context.j().c(p80.e0.class), new Consumer() { // from class: w80.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.m.this.c(new m.a() { // from class: w80.o
                    @Override // org.junit.platform.engine.support.hierarchical.m.a
                    public final void execute() {
                        p80.e0.this.f(r2);
                    }
                });
            }
        });
    }

    public final boolean U0(z80.t context) {
        return context.i().V().orElse(TestInstance.Lifecycle.PER_METHOD) == TestInstance.Lifecycle.PER_CLASS;
    }

    public final void V0(a90.n registrar) {
        ArrayList arrayList = new ArrayList(y2.h(this.f95872i));
        Collections.reverse(arrayList);
        X0(arrayList, registrar, new Function() { // from class: w80.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                z80.a a12;
                a12 = o0.this.a1((Method) obj);
                return a12;
            }
        });
    }

    public final void W0(a90.n registrar) {
        X0(y2.j(this.f95872i), registrar, new Function() { // from class: w80.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                z80.b b12;
                b12 = o0.this.b1((Method) obj);
                return b12;
            }
        });
    }

    public final void X0(List<Method> methods, final a90.n registrar, final Function<Method, p80.m> extensionSynthesizer) {
        methods.forEach(new Consumer() { // from class: w80.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.y0(a90.n.this, extensionSynthesizer, (Method) obj);
            }
        });
    }

    public final p80.y Y0(a90.o registry) {
        List c11 = registry.c(p80.y.class);
        if (c11.size() == 1) {
            return (p80.y) c11.get(0);
        }
        if (c11.size() <= 1) {
            return null;
        }
        throw new ExtensionConfigurationException(String.format("The following TestInstanceFactory extensions were registered for test class [%s], but only one is permitted: %s", this.f95872i.getName(), (String) c11.stream().map(new Function() { // from class: w80.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String name;
                name = ((p80.y) obj).getClass().getName();
                return name;
            }
        }).collect(Collectors.joining(org.junit.jupiter.api.j2.O))));
    }

    public void Z0(Node.ExecutionMode defaultChildExecutionMode) {
        this.f95875l = defaultChildExecutionMode;
    }

    public final z80.a a1(final Method method) {
        return new z80.a() { // from class: w80.v
            @Override // z80.a
            public final void y(p80.n nVar, a90.o oVar) {
                o0.Y(o0.this, method, nVar, oVar);
            }
        };
    }

    public final z80.b b1(final Method method) {
        return new z80.b() { // from class: w80.q
            @Override // z80.b
            public final void k(p80.n nVar, a90.o oVar) {
                o0.w0(o0.this, method, nVar, oVar);
            }
        };
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public String c() {
        return this.f95872i.getName();
    }

    public final z80.l0 c1(final z80.t parentExecutionContext, final p0 extensionContext) {
        return new z80.l0() { // from class: w80.h
            @Override // z80.l0
            public final p80.f0 b(a90.o oVar, a90.n nVar, org.junit.platform.engine.support.hierarchical.m mVar) {
                return o0.t0(o0.this, extensionContext, parentExecutionContext, oVar, nVar, mVar);
            }
        };
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.CONTAINER;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    public Set<ExclusiveResource> n() {
        return M(E0());
    }
}
