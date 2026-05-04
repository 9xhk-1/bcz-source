package io.ktor.server.testing;

import io.ktor.server.testing.TestApplicationEngine;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g1 {
    @m80.k
    public static final zx.f h(@m80.k final x00.l<? super io.ktor.server.engine.d, g2> configure) {
        kotlin.jvm.internal.g0.p(configure, "configure");
        return io.ktor.server.engine.f.b(new x00.l() { // from class: io.ktor.server.testing.f1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k11;
                k11 = g1.k(x00.l.this, (io.ktor.server.engine.d) obj);
                return k11;
            }
        });
    }

    public static /* synthetic */ zx.f i(x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.testing.z0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 j11;
                    j11 = g1.j((io.ktor.server.engine.d) obj2);
                    return j11;
                }
            };
        }
        return h(lVar);
    }

    public static final g2 j(io.ktor.server.engine.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 k(x00.l lVar, io.ktor.server.engine.d applicationEnvironment) {
        kotlin.jvm.internal.g0.p(applicationEnvironment, "$this$applicationEnvironment");
        applicationEnvironment.f(new ey.i((Pair<String, String>[]) new Pair[]{yz.h1.a("ktor.deployment.environment", "test")}));
        applicationEnvironment.g(ez.a.a("io.ktor.test"));
        lVar.invoke(applicationEnvironment);
        return g2.f100423a;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use new `testApplication` API: https://ktor.io/docs/migration-to-20x.html#testing-api")
    public static final <R> R l(@m80.k zx.f environment, @m80.k x00.l<? super TestApplicationEngine.b, g2> configure, @m80.k x00.l<? super TestApplicationEngine, ? extends R> test) {
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(configure, "configure");
        kotlin.jvm.internal.g0.p(test, "test");
        io.ktor.server.engine.b1 b1Var = new io.ktor.server.engine.b1(zx.j.d(environment, new x00.l() { // from class: io.ktor.server.testing.d1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = g1.o((zx.w0) obj);
                return o11;
            }
        }), y0.f61979a, configure);
        io.ktor.server.engine.b1.B(b1Var, false, 1, null);
        try {
            return test.invoke(b1Var.p());
        } finally {
            io.ktor.server.engine.b1.F(b1Var, 0L, 0L, 3, null);
        }
    }

    public static /* synthetic */ Object m(zx.f fVar, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = i(null, 1, null);
        }
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.testing.a1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 n11;
                    n11 = g1.n((TestApplicationEngine.b) obj2);
                    return n11;
                }
            };
        }
        return l(fVar, lVar, lVar2);
    }

    public static final g2 n(TestApplicationEngine.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 o(zx.w0 serverConfig) {
        kotlin.jvm.internal.g0.p(serverConfig, "$this$serverConfig");
        serverConfig.l(a00.h0.J());
        return g2.f100423a;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use new `testApplication` API: https://ktor.io/docs/migration-to-20x.html#testing-api")
    public static final <R> R p(@m80.k x00.l<? super TestApplicationEngine, ? extends R> test) {
        kotlin.jvm.internal.g0.p(test, "test");
        return (R) m(i(null, 1, null), null, test, 2, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use new `testApplication` API: https://ktor.io/docs/migration-to-20x.html#testing-api")
    public static final <R> R q(@m80.k final x00.l<? super zx.a, g2> moduleFunction, @m80.k final x00.l<? super TestApplicationEngine, ? extends R> test) {
        kotlin.jvm.internal.g0.p(moduleFunction, "moduleFunction");
        kotlin.jvm.internal.g0.p(test, "test");
        return (R) m(i(null, 1, null), null, new x00.l() { // from class: io.ktor.server.testing.e1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object t11;
                t11 = g1.t(x00.l.this, test, (TestApplicationEngine) obj);
                return t11;
            }
        }, 2, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use new `testApplication` API: https://ktor.io/docs/migration-to-20x.html#testing-api")
    public static final <R> R r(@m80.k final x00.l<? super zx.a, g2> moduleFunction, @m80.k x00.l<? super TestApplicationEngine.b, g2> configure, @m80.k final x00.l<? super TestApplicationEngine, ? extends R> test) {
        kotlin.jvm.internal.g0.p(moduleFunction, "moduleFunction");
        kotlin.jvm.internal.g0.p(configure, "configure");
        kotlin.jvm.internal.g0.p(test, "test");
        return (R) l(i(null, 1, null), configure, new x00.l() { // from class: io.ktor.server.testing.b1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object v11;
                v11 = g1.v(x00.l.this, test, (TestApplicationEngine) obj);
                return v11;
            }
        });
    }

    public static /* synthetic */ Object s(x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = new x00.l() { // from class: io.ktor.server.testing.c1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 u11;
                    u11 = g1.u((TestApplicationEngine.b) obj2);
                    return u11;
                }
            };
        }
        return r(lVar, lVar2, lVar3);
    }

    public static final Object t(x00.l lVar, x00.l lVar2, TestApplicationEngine withApplication) {
        kotlin.jvm.internal.g0.p(withApplication, "$this$withApplication");
        lVar.invoke(withApplication.w0());
        return lVar2.invoke(withApplication);
    }

    public static final g2 u(TestApplicationEngine.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return g2.f100423a;
    }

    public static final Object v(x00.l lVar, x00.l lVar2, TestApplicationEngine withApplication) {
        kotlin.jvm.internal.g0.p(withApplication, "$this$withApplication");
        lVar.invoke(withApplication.w0());
        return lVar2.invoke(withApplication);
    }
}
