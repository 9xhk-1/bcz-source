package io.ktor.server.testing;

import c40.p2;
import io.ktor.server.routing.y1;
import io.ktor.server.testing.TestApplicationEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nTestApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplication.kt\nio/ktor/server/testing/TestApplicationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1863#2,2:400\n*S KotlinDebug\n*F\n+ 1 TestApplication.kt\nio/ktor/server/testing/TestApplicationBuilder\n*L\n170#1:400,2\n*E\n"})
/* loaded from: classes8.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f61862a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f61863b = new k(this);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<x00.l<zx.a, g2>> f61864c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public x00.l<? super TestApplicationEngine.b, g2> f61865d = new x00.l() { // from class: io.ktor.server.testing.c0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 w11;
            w11 = e0.w((TestApplicationEngine.b) obj);
            return w11;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public x00.l<? super io.ktor.server.engine.d, g2> f61866e = new x00.l() { // from class: io.ktor.server.testing.d0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 A;
            A = e0.A((io.ktor.server.engine.d) obj);
            return A;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public x00.l<? super zx.w0, g2> f61867f = new x00.l() { // from class: io.ktor.server.testing.r
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 r11;
            r11 = e0.r((zx.w0) obj);
            return r11;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c40.a0 f61868g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61869h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61870i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61871j;

    public e0() {
        c40.a0 c11;
        c11 = p2.c(null, 1, null);
        this.f61868g = c11;
        this.f61869h = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.s
            @Override // x00.a
            public final Object invoke() {
                zx.v0 P;
                P = e0.P(e0.this);
                return P;
            }
        });
        this.f61870i = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.t
            @Override // x00.a
            public final Object invoke() {
                io.ktor.server.engine.b1 t11;
                t11 = e0.t(e0.this);
                return t11;
            }
        });
        this.f61871j = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.u
            @Override // x00.a
            public final Object invoke() {
                TestApplicationEngine x11;
                x11 = e0.x(e0.this);
                return x11;
            }
        });
    }

    public static final g2 A(io.ktor.server.engine.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return g2.f100423a;
    }

    public static /* synthetic */ void M(e0 e0Var, zx.m0 m0Var, x00.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: install");
        }
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.testing.x
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 N;
                    N = e0.N(obj2);
                    return N;
                }
            };
        }
        e0Var.L(m0Var, lVar);
    }

    public static final g2 N(Object obj) {
        kotlin.jvm.internal.g0.p(obj, "<this>");
        return g2.f100423a;
    }

    public static final g2 O(zx.m0 m0Var, x00.l lVar, zx.a add) {
        kotlin.jvm.internal.g0.p(add, "$this$add");
        kotlin.jvm.internal.g0.n(m0Var, "null cannot be cast to non-null type io.ktor.server.application.Plugin<io.ktor.server.application.ApplicationCallPipeline, B of io.ktor.server.testing.TestApplicationBuilder.install, F of io.ktor.server.testing.TestApplicationBuilder.install>");
        zx.q.j(add, m0Var, lVar);
        return g2.f100423a;
    }

    public static final zx.v0 P(final e0 e0Var) {
        e0Var.f61862a = true;
        return zx.j.d(g1.h(new x00.l() { // from class: io.ktor.server.testing.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Q;
                Q = e0.Q(e0.this, (io.ktor.server.engine.d) obj);
                return Q;
            }
        }), new x00.l() { // from class: io.ktor.server.testing.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R;
                R = e0.R(e0.this, (zx.w0) obj);
                return R;
            }
        });
    }

    public static final g2 Q(e0 e0Var, io.ktor.server.engine.d createTestEnvironment) {
        kotlin.jvm.internal.g0.p(createTestEnvironment, "$this$createTestEnvironment");
        ey.a c11 = createTestEnvironment.c();
        e0Var.f61866e.invoke(createTestEnvironment);
        if (kotlin.jvm.internal.g0.g(createTestEnvironment.c(), c11)) {
            createTestEnvironment.f(new ey.i());
        }
        return g2.f100423a;
    }

    public static final g2 R(e0 e0Var, zx.w0 serverConfig) {
        kotlin.jvm.internal.g0.p(serverConfig, "$this$serverConfig");
        Iterator<T> it = e0Var.f61864c.iterator();
        while (it.hasNext()) {
            serverConfig.h((x00.l) it.next());
        }
        serverConfig.j(serverConfig.e().plus(e0Var.f61868g));
        serverConfig.l(a00.h0.J());
        serverConfig.i(true);
        e0Var.f61867f.invoke(serverConfig);
        return g2.f100423a;
    }

    public static final g2 T(x00.l lVar, zx.a add) {
        kotlin.jvm.internal.g0.p(add, "$this$add");
        y1.e(add, lVar);
        return g2.f100423a;
    }

    public static final g2 V(x00.l lVar, x00.l lVar2, zx.w0 w0Var) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        lVar.invoke(w0Var);
        lVar2.invoke(w0Var);
        return g2.f100423a;
    }

    public static final g2 r(zx.w0 w0Var) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        return g2.f100423a;
    }

    public static final io.ktor.server.engine.b1 t(e0 e0Var) {
        return new io.ktor.server.engine.b1(e0Var.K(), y0.f61979a, e0Var.f61865d);
    }

    public static final g2 v(x00.l lVar, x00.l lVar2, TestApplicationEngine.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        lVar.invoke(bVar);
        lVar2.invoke(bVar);
        return g2.f100423a;
    }

    public static final g2 w(TestApplicationEngine.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return g2.f100423a;
    }

    public static final TestApplicationEngine x(e0 e0Var) {
        return e0Var.E().p();
    }

    public static final g2 z(x00.l lVar, x00.l lVar2, io.ktor.server.engine.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        lVar.invoke(dVar);
        lVar2.invoke(dVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    public final void B(@m80.k x00.l<? super k, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        s();
        block.invoke(this.f61863b);
    }

    @m80.k
    public final List<x00.l<zx.a, g2>> C() {
        return this.f61864c;
    }

    @m80.k
    public final x00.l<zx.w0, g2> D() {
        return this.f61867f;
    }

    @m80.k
    public final io.ktor.server.engine.b1<TestApplicationEngine, TestApplicationEngine.b> E() {
        return (io.ktor.server.engine.b1) this.f61870i.getValue();
    }

    @m80.k
    public final TestApplicationEngine F() {
        return (TestApplicationEngine) this.f61871j.getValue();
    }

    @m80.k
    public final x00.l<TestApplicationEngine.b, g2> G() {
        return this.f61865d;
    }

    @m80.k
    public final x00.l<io.ktor.server.engine.d, g2> H() {
        return this.f61866e;
    }

    @m80.k
    public final k I() {
        return this.f61863b;
    }

    @m80.k
    public final c40.a0 J() {
        return this.f61868g;
    }

    @m80.k
    public final zx.v0 K() {
        return (zx.v0) this.f61869h.getValue();
    }

    @io.ktor.utils.io.c0
    public final <P extends io.ktor.util.pipeline.c<?, zx.k0>, B, F> void L(@m80.k final zx.m0<? super P, ? extends B, F> plugin, @m80.k final x00.l<? super B, g2> configure) {
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        kotlin.jvm.internal.g0.p(configure, "configure");
        s();
        this.f61864c.add(new x00.l() { // from class: io.ktor.server.testing.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O;
                O = e0.O(zx.m0.this, configure, (zx.a) obj);
                return O;
            }
        });
    }

    @io.ktor.utils.io.c0
    public final void S(@m80.k final x00.l<? super io.ktor.server.routing.g0, g2> configuration) {
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        s();
        this.f61864c.add(new x00.l() { // from class: io.ktor.server.testing.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 T;
                T = e0.T(x00.l.this, (zx.a) obj);
                return T;
            }
        });
    }

    @io.ktor.utils.io.c0
    public final void U(@m80.k final x00.l<? super zx.w0, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        s();
        final x00.l<? super zx.w0, g2> lVar = this.f61867f;
        this.f61867f = new x00.l() { // from class: io.ktor.server.testing.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 V;
                V = e0.V(x00.l.this, block, (zx.w0) obj);
                return V;
            }
        };
    }

    public final void W(@m80.k x00.l<? super zx.w0, g2> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f61867f = lVar;
    }

    public final void X(@m80.k x00.l<? super TestApplicationEngine.b, g2> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f61865d = lVar;
    }

    public final void Y(@m80.k x00.l<? super io.ktor.server.engine.d, g2> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f61866e = lVar;
    }

    @io.ktor.utils.io.c0
    public final void q(@m80.k x00.l<? super zx.a, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        s();
        this.f61864c.add(block);
    }

    public final void s() {
        if (this.f61862a) {
            throw new IllegalStateException("The test application has already been built. Make sure you configure the application before accessing the client for the first time.");
        }
    }

    @io.ktor.utils.io.c0
    public final void u(@m80.k final x00.l<? super TestApplicationEngine.b, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        s();
        final x00.l<? super TestApplicationEngine.b, g2> lVar = this.f61865d;
        this.f61865d = new x00.l() { // from class: io.ktor.server.testing.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = e0.v(x00.l.this, block, (TestApplicationEngine.b) obj);
                return v11;
            }
        };
    }

    @io.ktor.utils.io.c0
    public final void y(@m80.k final x00.l<? super io.ktor.server.engine.d, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        s();
        final x00.l<? super io.ktor.server.engine.d, g2> lVar = this.f61866e;
        this.f61866e = new x00.l() { // from class: io.ktor.server.testing.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z11;
                z11 = e0.z(x00.l.this, block, (io.ktor.server.engine.d) obj);
                return z11;
            }
        };
    }
}
