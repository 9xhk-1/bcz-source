package io.ktor.server.routing;

import kotlin.text.Regex;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RegexRoutingKt {
    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 A(@m80.k g0 g0Var, @m80.k Regex path, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 h11 = h(g0Var, path);
        build.invoke(h11);
        return h11;
    }

    public static final g0 h(g0 g0Var, Regex regex) {
        return g0Var.d(new t(regex));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 i(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.b(), new x00.l() { // from class: io.ktor.server.routing.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = RegexRoutingKt.j(x00.p.this, (g0) obj);
                return j11;
            }
        });
    }

    public static final g2 j(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 k(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.c(), new x00.l() { // from class: io.ktor.server.routing.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l11;
                l11 = RegexRoutingKt.l(x00.p.this, (g0) obj);
                return l11;
            }
        });
    }

    public static final g2 l(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 m(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.d(), new x00.l() { // from class: io.ktor.server.routing.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n11;
                n11 = RegexRoutingKt.n(x00.p.this, (g0) obj);
                return n11;
            }
        });
    }

    public static final g2 n(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 o(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.e(), new x00.l() { // from class: io.ktor.server.routing.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 p11;
                p11 = RegexRoutingKt.p(x00.p.this, (g0) obj);
                return p11;
            }
        });
    }

    public static final g2 p(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 q(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.f(), new x00.l() { // from class: io.ktor.server.routing.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = RegexRoutingKt.r(x00.p.this, (g0) obj);
                return r11;
            }
        });
    }

    public static final g2 r(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @w00.j(name = "patchTypedPath")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 s(g0 g0Var, Regex path, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return q(g0Var, path, new RegexRoutingKt$patch$2(body, null));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 t(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.g(), new x00.l() { // from class: io.ktor.server.routing.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = RegexRoutingKt.u(x00.p.this, (g0) obj);
                return u11;
            }
        });
    }

    public static final g2 u(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @w00.j(name = "postTypedPath")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 v(g0 g0Var, Regex path, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return t(g0Var, path, new RegexRoutingKt$post$2(body, null));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 w(@m80.k g0 g0Var, @m80.k Regex path, @m80.k final x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        return z(g0Var, path, ix.e1.f62753b.h(), new x00.l() { // from class: io.ktor.server.routing.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = RegexRoutingKt.x(x00.p.this, (g0) obj);
                return x11;
            }
        });
    }

    public static final g2 x(x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        route.e(pVar);
        return g2.f100423a;
    }

    @w00.j(name = "putTypedPath")
    @io.ktor.utils.io.c0
    public static final /* synthetic */ <R> g0 y(g0 g0Var, Regex path, x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.w();
        return w(g0Var, path, new RegexRoutingKt$put$2(body, null));
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final g0 z(@m80.k g0 g0Var, @m80.k Regex path, @m80.k ix.e1 method, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = h(g0Var, path).d(new h(method));
        build.invoke(d11);
        return d11;
    }
}
