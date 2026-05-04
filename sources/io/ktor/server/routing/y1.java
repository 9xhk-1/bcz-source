package io.ktor.server.routing;

import io.ktor.server.routing.RoutingRoot;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRoutingRoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingRoot.kt\nio/ktor/server/routing/RoutingRootKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,167:1\n18#2:168\n58#3,16:169\n*S KotlinDebug\n*F\n+ 1 RoutingRoot.kt\nio/ktor/server/routing/RoutingRootKt\n*L\n18#1:168\n18#1:169,16\n*E\n"})
/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<ix.g1> f61767a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Logger f61768b;

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(ix.g1.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(ix.g1.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f61767a = new xy.a<>("RoutingFailureStatusCode", new gz.a(d11, rVar));
        f61768b = ez.a.a("io.ktor.server.routing.Routing");
    }

    @m80.k
    public static final zx.a a(@m80.k g0 g0Var) {
        zx.a a11;
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        if (g0Var instanceof RoutingRoot) {
            return ((RoutingRoot) g0Var).w0();
        }
        g0 parent = g0Var.getParent();
        if (parent == null || (a11 = a(parent)) == null) {
            throw new UnsupportedOperationException("Cannot retrieve application from unattached routing entry");
        }
        return a11;
    }

    @m80.k
    public static final Logger b() {
        return f61768b;
    }

    @m80.k
    public static final xy.a<ix.g1> c() {
        return f61767a;
    }

    @io.ktor.utils.io.c0
    @m80.k
    public static final RoutingRoot e(@m80.k zx.a aVar, @m80.k x00.l<? super k0, g2> configuration) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        RoutingRoot.a aVar2 = RoutingRoot.f61551y;
        RoutingRoot routingRoot = (RoutingRoot) zx.q.s(aVar, aVar2);
        if (routingRoot == null) {
            return (RoutingRoot) zx.q.j(aVar, aVar2, configuration);
        }
        configuration.invoke(routingRoot);
        return routingRoot;
    }

    @io.ktor.utils.io.b0
    public static /* synthetic */ void d() {
    }
}
