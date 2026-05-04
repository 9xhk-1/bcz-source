package io.ktor.server.routing;

import ix.p1;
import kotlin.LazyThreadSafetyMode;
import yz.g2;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRoutingPipelineCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingPipelineCall.kt\nio/ktor/server/routing/RoutingPipelineCall\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,65:1\n24#2:66\n*S KotlinDebug\n*F\n+ 1 RoutingPipelineCall.kt\nio/ktor/server/routing/RoutingPipelineCall\n*L\n39#1:66\n*E\n"})
/* loaded from: classes8.dex */
public final class l1 implements zx.k0, c40.r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.k0 f61661a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d1 f61662b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f61663c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61664d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final m1 f61665e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final n1 f61666f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61667g;

    public l1(@m80.k zx.k0 engineCall, @m80.k d1 route, @m80.k kotlin.coroutines.d coroutineContext, @m80.k py.c receivePipeline, @m80.k qy.m responsePipeline, @m80.k ix.p1 pathParameters) {
        kotlin.jvm.internal.g0.p(engineCall, "engineCall");
        kotlin.jvm.internal.g0.p(route, "route");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(receivePipeline, "receivePipeline");
        kotlin.jvm.internal.g0.p(responsePipeline, "responsePipeline");
        kotlin.jvm.internal.g0.p(pathParameters, "pathParameters");
        this.f61661a = engineCall;
        this.f61662b = route;
        this.f61663c = coroutineContext;
        this.f61664d = pathParameters;
        this.f61665e = new m1(this, receivePipeline, engineCall.f());
        this.f61666f = new n1(this, responsePipeline, engineCall.k());
        this.f61667g = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: io.ktor.server.routing.k1
            @Override // x00.a
            public final Object invoke() {
                ix.p1 l11;
                l11 = l1.l(l1.this);
                return l11;
            }
        });
    }

    public static final ix.p1 l(l1 l1Var) {
        p1.a aVar = ix.p1.f62972b;
        ix.q1 b11 = ix.t1.b(0, 1, null);
        b11.j(l1Var.f61661a.getParameters());
        b11.i(l1Var.f61664d);
        return b11.build();
    }

    @Override // zx.k0, zx.b
    @m80.l
    public Object E(@m80.l Object obj, @m80.l gz.a aVar, @m80.k j00.c<? super g2> cVar) {
        return k0.a.b(this, obj, aVar, cVar);
    }

    @Override // zx.k0, zx.b
    @m80.l
    public <T> Object L(@m80.k gz.a aVar, @m80.k j00.c<? super T> cVar) {
        return k0.a.a(this, aVar, cVar);
    }

    @m80.k
    public final zx.k0 b() {
        return this.f61661a;
    }

    @m80.k
    public final ix.p1 d() {
        return this.f61664d;
    }

    @Override // zx.k0, zx.b
    @m80.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public m1 f() {
        return this.f61665e;
    }

    @Override // zx.b
    @m80.k
    public xy.b getAttributes() {
        return this.f61661a.getAttributes();
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61663c;
    }

    @Override // zx.b
    @m80.k
    public ix.p1 getParameters() {
        return (ix.p1) this.f61667g.getValue();
    }

    @Override // zx.k0, zx.b
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public n1 k() {
        return this.f61666f;
    }

    @m80.k
    public final d1 i() {
        return this.f61662b;
    }

    @m80.k
    public String toString() {
        return "RoutingApplicationCall(route=" + this.f61662b + ')';
    }

    @Override // zx.b
    @m80.k
    public zx.a w0() {
        return this.f61661a.w0();
    }
}
