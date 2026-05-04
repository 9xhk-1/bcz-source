package io.ktor.server.routing;

import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RoutingBuilderKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61550a;

        static {
            int[] iArr = new int[RoutingPathSegmentKind.values().length];
            try {
                iArr[RoutingPathSegmentKind.Parameter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoutingPathSegmentKind.Constant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61550a = iArr;
        }
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 A(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.d(), new x00.l() { // from class: io.ktor.server.routing.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 C;
                C = RoutingBuilderKt.C(x00.p.this, (g0) obj);
                return C;
            }
        });
    }

    public static final g2 B(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 C(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 D(@m80.k g0 g0Var, @m80.k String name, @m80.k String value, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new g(name, value));
        build.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 E(@m80.k g0 g0Var, @m80.k ix.e1 method, @m80.k x00.l<? super g0, g2> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(body, "body");
        g0 d11 = g0Var.d(new h(method));
        body.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 F(@m80.k g0 g0Var, @m80.k String name, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new n(name));
        build.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 G(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.e(), new x00.l() { // from class: io.ktor.server.routing.q0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 I;
                I = RoutingBuilderKt.I(x00.p.this, (g0) obj);
                return I;
            }
        });
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 H(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.e(), new x00.l() { // from class: io.ktor.server.routing.r0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J;
                J = RoutingBuilderKt.J(x00.p.this, (g0) obj);
                return J;
            }
        });
    }

    public static final g2 I(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 J(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 K(@m80.k g0 g0Var, @m80.k String name, @m80.k String value, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new b(name, value));
        build.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 L(@m80.k g0 g0Var, @m80.k String name, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new p(name));
        build.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 M(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.f(), new x00.l() { // from class: io.ktor.server.routing.m0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O;
                O = RoutingBuilderKt.O(x00.p.this, (g0) obj);
                return O;
            }
        });
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 N(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.f(), new x00.l() { // from class: io.ktor.server.routing.w0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = RoutingBuilderKt.P(x00.p.this, (g0) obj);
                return P;
            }
        });
    }

    public static final g2 O(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 P(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @w00.j(name = "patchTyped")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 Q(g0 g0Var, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return N(g0Var, new RoutingBuilderKt$patch$3(body, null));
    }

    @w00.j(name = "patchTypedPath")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 R(g0 g0Var, String path, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return M(g0Var, path, new RoutingBuilderKt$patch$4(body, null));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 S(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.g(), new x00.l() { // from class: io.ktor.server.routing.y0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 U;
                U = RoutingBuilderKt.U(x00.p.this, (g0) obj);
                return U;
            }
        });
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 T(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.g(), new x00.l() { // from class: io.ktor.server.routing.l0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 V;
                V = RoutingBuilderKt.V(x00.p.this, (g0) obj);
                return V;
            }
        });
    }

    public static final g2 U(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 V(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @w00.j(name = "postTyped")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 W(g0 g0Var, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return T(g0Var, new RoutingBuilderKt$post$2(body, null));
    }

    @w00.j(name = "postTypedPath")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 X(g0 g0Var, String path, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return S(g0Var, path, new RoutingBuilderKt$post$3(body, null));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 Y(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.h(), new x00.l() { // from class: io.ktor.server.routing.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 a02;
                a02 = RoutingBuilderKt.a0(x00.p.this, (g0) obj);
                return a02;
            }
        });
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 Z(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.h(), new x00.l() { // from class: io.ktor.server.routing.n0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b02;
                b02 = RoutingBuilderKt.b0(x00.p.this, (g0) obj);
                return b02;
            }
        });
    }

    public static final g2 a0(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 b0(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @w00.j(name = "putTyped")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 c0(g0 g0Var, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return Z(g0Var, new RoutingBuilderKt$put$3(body, null));
    }

    @w00.j(name = "putTypedPath")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 d0(g0 g0Var, String path, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return Y(g0Var, path, new RoutingBuilderKt$put$4(body, null));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 e0(@m80.k g0 g0Var, @m80.k String path, @m80.k ix.e1 method, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = q(g0Var, path).d(new h(method));
        build.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 f0(@m80.k g0 g0Var, @m80.k String path, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 q11 = q(g0Var, path);
        build.invoke(q11);
        return q11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 o(@m80.k g0 g0Var, @m80.k ix.k[] contentTypes, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(contentTypes, "contentTypes");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new i(a00.h0.Q(Arrays.copyOf(contentTypes, contentTypes.length))));
        build.invoke(d11);
        return d11;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 p(@m80.k g0 g0Var, @m80.k ix.k contentType, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new c(contentType));
        build.invoke(d11);
        return d11;
    }

    @m80.k
    public static final g0 q(@m80.k g0 g0Var, @m80.k String path) {
        h0 c11;
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        List<j1> c12 = i1.f61647b.d(path).c();
        int size = c12.size();
        for (int i11 = 0; i11 < size; i11++) {
            j1 j1Var = c12.get(i11);
            String a11 = j1Var.a();
            int i12 = a.f61550a[j1Var.b().ordinal()];
            if (i12 == 1) {
                c11 = u.f61742a.c(a11);
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c11 = u.f61742a.a(a11);
            }
            g0Var = g0Var.d(c11);
        }
        return u30.f0.b2(path, "/", false, 2, null) ? g0Var.d(a2.f61578a) : g0Var;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 r(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.b(), new x00.l() { // from class: io.ktor.server.routing.p0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t11;
                t11 = RoutingBuilderKt.t(x00.p.this, (g0) obj);
                return t11;
            }
        });
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 s(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.b(), new x00.l() { // from class: io.ktor.server.routing.x0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = RoutingBuilderKt.u(x00.p.this, (g0) obj);
                return u11;
            }
        });
    }

    public static final g2 t(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 u(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 v(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.c(), new x00.l() { // from class: io.ktor.server.routing.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = RoutingBuilderKt.x(x00.p.this, (g0) obj);
                return x11;
            }
        });
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 w(@m80.k g0 g0Var, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(body, "body");
        return E(g0Var, ix.e1.f62753b.c(), new x00.l() { // from class: io.ktor.server.routing.u0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 y11;
                y11 = RoutingBuilderKt.y(x00.p.this, (g0) obj);
                return y11;
            }
        });
    }

    public static final g2 x(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    public static final g2 y(x00.p pVar, g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        method.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 z(@m80.k g0 g0Var, @m80.k String path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return e0(g0Var, path, ix.e1.f62753b.d(), new x00.l() { // from class: io.ktor.server.routing.s0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B;
                B = RoutingBuilderKt.B(x00.p.this, (g0) obj);
                return B;
            }
        });
    }
}
