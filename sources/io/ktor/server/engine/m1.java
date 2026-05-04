package io.ktor.server.engine;

import io.ktor.server.engine.a;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m1 {
    @m80.k
    public static final <TEngine extends a, TConfiguration extends a.C0709a> b1<TEngine, TConfiguration> h(@m80.k c40.r0 r0Var, @m80.k b<? extends TEngine, TConfiguration> factory, int i11, @m80.k String host, @m80.k List<String> watchPaths, @m80.k kotlin.coroutines.d parentCoroutineContext, @m80.k x00.l<? super zx.a, yz.g2> module) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(factory, "factory");
        kotlin.jvm.internal.g0.p(host, "host");
        kotlin.jvm.internal.g0.p(watchPaths, "watchPaths");
        kotlin.jvm.internal.g0.p(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.g0.p(module, "module");
        n1 n1Var = new n1(null, 1, null);
        n1Var.l(i11);
        n1Var.k(host);
        yz.g2 g2Var = yz.g2.f100423a;
        return i(r0Var, factory, (o1[]) Arrays.copyOf(new o1[]{n1Var}, 1), watchPaths, parentCoroutineContext, module);
    }

    @m80.k
    public static final <TEngine extends a, TConfiguration extends a.C0709a> b1<TEngine, TConfiguration> i(@m80.k final c40.r0 r0Var, @m80.k b<? extends TEngine, TConfiguration> factory, @m80.k final o1[] connectors, @m80.k final List<String> watchPaths, @m80.k final kotlin.coroutines.d parentCoroutineContext, @m80.k final x00.l<? super zx.a, yz.g2> module) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(factory, "factory");
        kotlin.jvm.internal.g0.p(connectors, "connectors");
        kotlin.jvm.internal.g0.p(watchPaths, "watchPaths");
        kotlin.jvm.internal.g0.p(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.g0.p(module, "module");
        return l(factory, zx.j.d(f.b(new x00.l() { // from class: io.ktor.server.engine.f1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 r11;
                r11 = m1.r((d) obj);
                return r11;
            }
        }), new x00.l() { // from class: io.ktor.server.engine.g1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 s11;
                s11 = m1.s(c40.r0.this, parentCoroutineContext, watchPaths, module, (zx.w0) obj);
                return s11;
            }
        }), new x00.l() { // from class: io.ktor.server.engine.h1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 t11;
                t11 = m1.t(connectors, (a.C0709a) obj);
                return t11;
            }
        });
    }

    @m80.k
    public static final <TEngine extends a, TConfiguration extends a.C0709a> b1<TEngine, TConfiguration> j(@m80.k b<? extends TEngine, TConfiguration> factory, int i11, @m80.k String host, @m80.k List<String> watchPaths, @m80.k x00.l<? super zx.a, yz.g2> module) {
        kotlin.jvm.internal.g0.p(factory, "factory");
        kotlin.jvm.internal.g0.p(host, "host");
        kotlin.jvm.internal.g0.p(watchPaths, "watchPaths");
        kotlin.jvm.internal.g0.p(module, "module");
        return m(c40.b2.f7824a, factory, i11, host, watchPaths, null, module, 16, null);
    }

    @m80.k
    public static final <TEngine extends a, TConfiguration extends a.C0709a> b1<TEngine, TConfiguration> k(@m80.k b<? extends TEngine, TConfiguration> factory, @m80.k zx.f environment, @m80.k x00.l<? super TConfiguration, yz.g2> configure, @m80.k final x00.l<? super zx.a, yz.g2> module) {
        kotlin.jvm.internal.g0.p(factory, "factory");
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(configure, "configure");
        kotlin.jvm.internal.g0.p(module, "module");
        return l(factory, zx.j.d(environment, new x00.l() { // from class: io.ktor.server.engine.j1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 w11;
                w11 = m1.w(x00.l.this, (zx.w0) obj);
                return w11;
            }
        }), configure);
    }

    @m80.k
    public static final <TEngine extends a, TConfiguration extends a.C0709a> b1<TEngine, TConfiguration> l(@m80.k b<? extends TEngine, TConfiguration> factory, @m80.k zx.v0 rootConfig, @m80.k x00.l<? super TConfiguration, yz.g2> configure) {
        kotlin.jvm.internal.g0.p(factory, "factory");
        kotlin.jvm.internal.g0.p(rootConfig, "rootConfig");
        kotlin.jvm.internal.g0.p(configure, "configure");
        return new b1<>(rootConfig, factory, configure);
    }

    public static /* synthetic */ b1 m(c40.r0 r0Var, b bVar, int i11, String str, List list, kotlin.coroutines.d dVar, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 80;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = "0.0.0.0";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            list = a00.g0.l(a2.a());
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return h(r0Var, bVar, i13, str2, list2, dVar, lVar);
    }

    public static /* synthetic */ b1 n(c40.r0 r0Var, b bVar, o1[] o1VarArr, List list, kotlin.coroutines.d dVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            o1VarArr = new o1[0];
        }
        o1[] o1VarArr2 = o1VarArr;
        if ((i11 & 4) != 0) {
            list = a00.g0.l(a2.a());
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return i(r0Var, bVar, o1VarArr2, list2, dVar, lVar);
    }

    public static /* synthetic */ b1 o(b bVar, int i11, String str, List list, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 80;
        }
        if ((i12 & 4) != 0) {
            str = "0.0.0.0";
        }
        if ((i12 & 8) != 0) {
            list = a00.g0.l(a2.a());
        }
        return j(bVar, i11, str, list, lVar);
    }

    public static /* synthetic */ b1 p(b bVar, zx.f fVar, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = f.c(null, 1, null);
        }
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.engine.k1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 u11;
                    u11 = m1.u((a.C0709a) obj2);
                    return u11;
                }
            };
        }
        if ((i11 & 8) != 0) {
            lVar2 = new x00.l() { // from class: io.ktor.server.engine.l1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 v11;
                    v11 = m1.v((zx.a) obj2);
                    return v11;
                }
            };
        }
        return k(bVar, fVar, lVar, lVar2);
    }

    public static /* synthetic */ b1 q(b bVar, zx.v0 v0Var, x00.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.engine.i1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 x11;
                    x11 = m1.x((a.C0709a) obj2);
                    return x11;
                }
            };
        }
        return l(bVar, v0Var, lVar);
    }

    public static final yz.g2 r(d applicationEnvironment) {
        kotlin.jvm.internal.g0.p(applicationEnvironment, "$this$applicationEnvironment");
        applicationEnvironment.g(ez.a.a("io.ktor.server.Application"));
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(c40.r0 r0Var, kotlin.coroutines.d dVar, List list, x00.l lVar, zx.w0 serverConfig) {
        kotlin.jvm.internal.g0.p(serverConfig, "$this$serverConfig");
        serverConfig.j(r0Var.getCoroutineContext().plus(dVar));
        serverConfig.l(list);
        serverConfig.h(lVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 t(o1[] o1VarArr, a.C0709a c0709a) {
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        a00.m0.u0(c0709a.c(), o1VarArr);
        return yz.g2.f100423a;
    }

    public static final yz.g2 u(a.C0709a c0709a) {
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(zx.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(x00.l lVar, zx.w0 serverConfig) {
        kotlin.jvm.internal.g0.p(serverConfig, "$this$serverConfig");
        serverConfig.h(lVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x(a.C0709a c0709a) {
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        return yz.g2.f100423a;
    }
}
