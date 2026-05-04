package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nRoutingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingNode.kt\nio/ktor/server/routing/RoutingNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,328:1\n295#2,2:329\n1863#2,2:331\n*S KotlinDebug\n*F\n+ 1 RoutingNode.kt\nio/ktor/server/routing/RoutingNode\n*L\n50#1:329,2\n90#1:331,2\n*E\n"})
/* loaded from: classes8.dex */
public class d1 extends zx.c implements g0 {

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    public final d1 f61602r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final h0 f61603s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final List<d1> f61604t;

    /* renamed from: u, reason: collision with root package name */
    @m80.l
    public zx.c f61605u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final List<x00.p<c1, j00.c<? super g2>, Object>> f61606v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.RoutingNode$buildPipeline$1$1", f = "RoutingNode.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.u0({"SMAP\nRoutingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingNode.kt\nio/ktor/server/routing/RoutingNode$buildPipeline$1$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,328:1\n79#2:329\n*S KotlinDebug\n*F\n+ 1 RoutingNode.kt\nio/ktor/server/routing/RoutingNode$buildPipeline$1$1\n*L\n112#1:329\n*E\n"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<g2, zx.k0>, g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61607a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61608b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<x00.p<c1, j00.c<? super g2>, Object>> f61609c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f61610d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<x00.p<c1, j00.c<? super g2>, Object>> list, int i11, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f61609c = list;
            this.f61610d = i11;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<g2, zx.k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
            a aVar = new a(this.f61609c, this.f61610d, cVar);
            aVar.f61608b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61607a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                zx.k0 k0Var = (zx.k0) ((io.ktor.util.pipeline.d) this.f61608b).d();
                kotlin.jvm.internal.g0.n(k0Var, "null cannot be cast to non-null type io.ktor.server.routing.RoutingPipelineCall");
                l1 l1Var = (l1) k0Var;
                c1 c1Var = new c1(new b1(l1Var));
                if (zx.l0.c(l1Var)) {
                    return g2.f100423a;
                }
                x00.p<c1, j00.c<? super g2>, Object> pVar = this.f61609c.get(this.f61610d);
                this.f61607a = 1;
                if (pVar.invoke(c1Var, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public /* synthetic */ d1(d1 d1Var, h0 h0Var, boolean z11, zx.f fVar, int i11, kotlin.jvm.internal.v vVar) {
        this(d1Var, h0Var, (i11 & 4) != 0 ? false : z11, fVar);
    }

    @Override // io.ktor.server.routing.g0
    @m80.k
    public <B, F> F b(@m80.k zx.m0<? super zx.c, ? extends B, F> plugin, @m80.k x00.l<? super B, g2> configure) {
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        kotlin.jvm.internal.g0.p(configure, "configure");
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type io.ktor.server.application.ApplicationCallPipeline");
        return (F) zx.q.j(this, plugin, configure);
    }

    @Override // io.ktor.server.routing.g0
    public void e(@m80.k x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> body) {
        kotlin.jvm.internal.g0.p(body, "body");
        this.f61606v.add(body);
        this.f61605u = null;
    }

    @Override // io.ktor.server.routing.g0
    @m80.k
    public <F> F h(@m80.k zx.m0<?, ?, F> plugin) {
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type io.ktor.server.application.ApplicationCallPipeline");
        return (F) zx.q.r(this, plugin);
    }

    @m80.k
    public final zx.c l0() {
        zx.c cVar = this.f61605u;
        if (cVar == null) {
            cVar = new zx.c(u(), y1.a(this).a());
            ArrayList arrayList = new ArrayList();
            for (d1 d1Var = this; d1Var != null; d1Var = d1Var.getParent()) {
                arrayList.add(d1Var);
            }
            for (int L = a00.h0.L(arrayList); -1 < L; L--) {
                zx.c cVar2 = (zx.c) arrayList.get(L);
                cVar.H(cVar2);
                cVar.g0().H(cVar2.g0());
                cVar.j0().H(cVar2.j0());
            }
            List<x00.p<c1, j00.c<? super g2>, Object>> list = this.f61606v;
            int L2 = a00.h0.L(list);
            if (L2 >= 0) {
                int i11 = 0;
                while (true) {
                    cVar.C(zx.c.f103019k.a(), new a(list, i11, null));
                    if (i11 == L2) {
                        break;
                    }
                    i11++;
                }
            }
            this.f61605u = cVar;
        }
        return cVar;
    }

    @Override // io.ktor.util.pipeline.c
    public void m() {
        r0();
    }

    @Override // io.ktor.server.routing.g0
    @m80.k
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public d1 d(@m80.k h0 selector) {
        Object obj;
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<T> it = this.f61604t.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((d1) obj).f61603s, selector)) {
                break;
            }
        }
        d1 d1Var = (d1) obj;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(this, selector, u(), a());
        this.f61604t.add(d1Var2);
        return d1Var2;
    }

    @m80.k
    public final List<d1> n0() {
        return this.f61604t;
    }

    @m80.k
    public final List<x00.p<c1, j00.c<? super g2>, Object>> o0() {
        return this.f61606v;
    }

    @Override // io.ktor.server.routing.g0
    @m80.l
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public d1 getParent() {
        return this.f61602r;
    }

    @m80.k
    public final h0 q0() {
        return this.f61603s;
    }

    public final void r0() {
        this.f61605u = null;
        Iterator<T> it = this.f61604t.iterator();
        while (it.hasNext()) {
            ((d1) it.next()).r0();
        }
    }

    public final void t0(@m80.k x00.l<? super d1, g2> body) {
        kotlin.jvm.internal.g0.p(body, "body");
        body.invoke(this);
    }

    @Override // io.ktor.util.pipeline.c
    @m80.k
    public String toString() {
        d1 parent = getParent();
        String d1Var = parent != null ? parent.toString() : null;
        if (d1Var == null) {
            if (this.f61603s instanceof a2) {
                return "/";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            sb2.append(this.f61603s);
            return sb2.toString();
        }
        if (this.f61603s instanceof a2) {
            if (u30.k0.s3(d1Var, '/', false, 2, null)) {
                return d1Var;
            }
            return d1Var + '/';
        }
        if (u30.k0.s3(d1Var, '/', false, 2, null)) {
            return d1Var + this.f61603s;
        }
        return d1Var + '/' + this.f61603s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(@m80.l d1 d1Var, @m80.k h0 selector, boolean z11, @m80.k zx.f environment) {
        super(z11, environment);
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(environment, "environment");
        this.f61602r = d1Var;
        this.f61603s = selector;
        this.f61604t = new ArrayList();
        this.f61606v = new ArrayList();
    }
}
