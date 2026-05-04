package w80;

import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;
import org.junit.platform.engine.support.hierarchical.m;
import p80.q;
import w80.p4;
import w80.u2;
import z80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class p4 extends d3 {

    /* renamed from: n, reason: collision with root package name */
    public static final String f95899n = "method";

    /* renamed from: o, reason: collision with root package name */
    public static final z80.n f95900o = new z80.n();

    /* renamed from: p, reason: collision with root package name */
    public static final n.a<Method, Void> f95901p = n.a.c(new n.a.InterfaceC1389a() { // from class: w80.c4
        @Override // z80.n.a.InterfaceC1389a
        public final void a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar) {
            qVar.t(aVar, vVar, nVar);
        }
    });

    /* renamed from: m, reason: collision with root package name */
    public final n.a<Method, Void> f95902m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95903a;

        static {
            int[] iArr = new int[TestExecutionResult.Status.values().length];
            f95903a = iArr;
            try {
                iArr[TestExecutionResult.Status.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95903a[TestExecutionResult.Status.ABORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95903a[TestExecutionResult.Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b<T extends p80.m> {
        void a(T t11, p80.n context) throws Throwable;
    }

    public p4(UniqueId uniqueId, Class<?> testClass, Method testMethod, v80.e0 configuration) {
        super(uniqueId, testClass, testMethod, configuration);
        this.f95902m = f95901p;
    }

    private void I0(z80.t context) {
        B0(p80.e0.class, context, new b() { // from class: w80.j4
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                ((p80.e0) mVar).f(nVar);
            }
        });
    }

    public static /* synthetic */ p80.j f0(a90.b0 b0Var, p80.n nVar) {
        return new z80.h(nVar, b0Var);
    }

    public static /* synthetic */ void h0(p4 p4Var, a90.o oVar, z80.a aVar, p80.n nVar) {
        p4Var.getClass();
        try {
            aVar.y(nVar, oVar);
        } catch (Throwable th2) {
            p4Var.y0(nVar, oVar, th2);
        }
    }

    public static /* synthetic */ void l0(p4 p4Var, a90.o oVar, z80.b bVar, p80.n nVar) {
        p4Var.getClass();
        try {
            bVar.k(nVar, oVar);
        } catch (Throwable th2) {
            p4Var.D0(nVar, oVar, th2);
        }
    }

    public static /* synthetic */ void n0(TestExecutionResult.Status status, p80.n nVar, TestExecutionResult testExecutionResult, p80.i0 i0Var) {
        int i11 = a.f95903a[status.ordinal()];
        if (i11 == 1) {
            i0Var.x(nVar);
        } else if (i11 == 2) {
            i0Var.e(nVar, testExecutionResult.d().orElse(null));
        } else {
            if (i11 != 3) {
                return;
            }
            i0Var.B(nVar, testExecutionResult.d().orElse(null));
        }
    }

    public static /* synthetic */ void u0(p4 p4Var, p80.n nVar, z80.t tVar) {
        p80.n nVar2;
        p4Var.getClass();
        try {
            nVar2 = nVar;
            try {
                f95900o.c(p4Var.c0(), nVar.w(), nVar2, tVar.j(), p4Var.f95902m);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                ba0.h4.a(th3);
                p4Var.H0(tVar.j(), nVar2, th3);
            }
        } catch (Throwable th4) {
            th = th4;
            nVar2 = nVar;
        }
    }

    public final void A0(z80.t context) {
        B0(p80.c.class, context, new b() { // from class: w80.o4
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                ((p80.c) mVar).H(nVar);
            }
        });
    }

    public final <T extends p80.m> void B0(Class<T> type, z80.t context, final b<T> callbackInvoker) {
        a90.b0 j11 = context.j();
        final p80.n i11 = context.i();
        final org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        ba0.n1.d(j11.c(type), new Consumer() { // from class: w80.a4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.m.this.c(new m.a() { // from class: w80.f4
                    @Override // org.junit.platform.engine.support.hierarchical.m.a
                    public final void execute() {
                        p4.b.this.a(r2, r3);
                    }
                });
            }
        });
    }

    public final void C0(z80.t context) {
        F0(p80.f.class, context, new b() { // from class: w80.k4
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                ((p80.f) mVar).n(nVar);
            }
        });
    }

    public final void D0(final p80.n context, a90.o registry, Throwable throwable) {
        Q(p80.r.class, registry, throwable, new u2.b() { // from class: w80.z3
            @Override // w80.u2.b
            public final void a(p80.m mVar, Throwable th2) {
                ((p80.r) mVar).w(p80.n.this, th2);
            }
        });
    }

    public final void E0(z80.t context) {
        final a90.b0 j11 = context.j();
        F0(z80.b.class, context, new b() { // from class: w80.y3
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                p4.l0(p4.this, j11, (z80.b) mVar, nVar);
            }
        });
    }

    public final <T extends p80.m> void F0(Class<T> type, z80.t context, final b<T> callbackInvoker) {
        a90.b0 j11 = context.j();
        final p80.n i11 = context.i();
        org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        for (final p80.m mVar : j11.c(type)) {
            l11.c(new m.a() { // from class: w80.b4
                @Override // org.junit.platform.engine.support.hierarchical.m.a
                public final void execute() {
                    p4.b.this.a(mVar, i11);
                }
            });
            if (l11.g()) {
                return;
            }
        }
    }

    public final void G0(z80.t context) {
        F0(p80.g.class, context, new b() { // from class: w80.d4
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                ((p80.g) mVar).l(nVar);
            }
        });
    }

    public final void H0(a90.o registry, final p80.n context, Throwable throwable) {
        Q(p80.x.class, registry, throwable, new u2.b() { // from class: w80.n4
            @Override // w80.u2.b
            public final void a(p80.m mVar, Throwable th2) {
                ((p80.x) mVar).z(p80.n.this, th2);
            }
        });
    }

    public void J0(final z80.t context, Node.a dynamicTestExecutor) {
        final p80.n i11 = context.i();
        context.l().c(new m.a() { // from class: w80.x3
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                p4.u0(p4.this, i11, context);
            }
        });
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: K */
    public void v(final z80.t context) throws Exception {
        if (K0(context) && context.i().E().isPresent()) {
            I0(context);
        }
        context.l().c(new m.a() { // from class: w80.l4
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                super/*w80.u2*/.v(context);
            }
        });
        context.l().b();
    }

    public final boolean K0(z80.t context) {
        return context.i().V().orElse(TestInstance.Lifecycle.PER_CLASS) == TestInstance.Lifecycle.PER_METHOD;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void y(z80.t context, TestDescriptor descriptor, final TestExecutionResult result) {
        if (context != null) {
            final p80.n i11 = context.i();
            final TestExecutionResult.Status c11 = result.c();
            d0(context, true, new Consumer() { // from class: w80.e4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    p4.n0(TestExecutionResult.Status.this, i11, result, (p80.i0) obj);
                }
            });
        }
    }

    public a90.b0 M0(z80.t context) {
        a90.b0 m11 = i2.m(context.j(), c0());
        i2.p(m11, c0());
        return m11;
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: S */
    public z80.t l(final z80.t context) {
        final a90.b0 M0 = M0(context);
        final org.junit.platform.engine.support.hierarchical.m a11 = b90.a.a();
        final f3 f3Var = new f3(context.i(), context.h(), this, context.g(), a11, new Function() { // from class: w80.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return p4.f0(a90.b0.this, (p80.n) obj);
            }
        });
        a11.c(new m.a() { // from class: w80.g4
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                z80.t tVar = z80.t.this;
                f3Var.m0(tVar.k().a(M0, a11));
            }
        });
        return context.f().d(M0).c(f3Var).f(a11).a();
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.TEST;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public z80.t z(z80.t context, Node.a dynamicTestExecutor) {
        org.junit.platform.engine.support.hierarchical.m l11 = context.l();
        C0(context);
        if (l11.f()) {
            E0(context);
            if (l11.f()) {
                G0(context);
                if (l11.f()) {
                    J0(context, dynamicTestExecutor);
                }
                A0(context);
            }
            z0(context);
        }
        x0(context);
        return context;
    }

    public final void x0(z80.t context) {
        B0(p80.b.class, context, new b() { // from class: w80.h4
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                ((p80.b) mVar).C(nVar);
            }
        });
    }

    public final void y0(final p80.n context, a90.o registry, Throwable throwable) {
        Q(p80.r.class, registry, throwable, new u2.b() { // from class: w80.m4
            @Override // w80.u2.b
            public final void a(p80.m mVar, Throwable th2) {
                ((p80.r) mVar).s(p80.n.this, th2);
            }
        });
    }

    public final void z0(z80.t context) {
        final a90.b0 j11 = context.j();
        B0(z80.a.class, context, new b() { // from class: w80.i4
            @Override // w80.p4.b
            public final void a(p80.m mVar, p80.n nVar) {
                p4.h0(p4.this, j11, (z80.a) mVar, nVar);
            }
        });
    }

    public p4(UniqueId uniqueId, String displayName, Class<?> testClass, Method testMethod, v80.e0 configuration, n.a<Method, Void> interceptorCall) {
        super(uniqueId, displayName, testClass, testMethod, configuration);
        this.f95902m = interceptorCall;
    }
}
