package io.ktor.server.routing;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b1 implements zx.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l1 f61582a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61583b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61584c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final xy.b f61585d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final zx.a f61586e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61587f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61588g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61589h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final d1 f61590i;

    public b1(@m80.k l1 pipelineCall) {
        kotlin.jvm.internal.g0.p(pipelineCall, "pipelineCall");
        this.f61582a = pipelineCall;
        this.f61583b = yz.e0.c(new x00.a() { // from class: io.ktor.server.routing.z0
            @Override // x00.a
            public final Object invoke() {
                o1 n11;
                n11 = b1.n(b1.this);
                return n11;
            }
        });
        this.f61584c = yz.e0.c(new x00.a() { // from class: io.ktor.server.routing.a1
            @Override // x00.a
            public final Object invoke() {
                w1 o11;
                o11 = b1.o(b1.this);
                return o11;
            }
        });
        this.f61585d = pipelineCall.getAttributes();
        this.f61586e = pipelineCall.w0();
        this.f61587f = pipelineCall.getParameters();
        this.f61588g = pipelineCall.d();
        this.f61589h = pipelineCall.b().getParameters();
        this.f61590i = pipelineCall.i();
    }

    public static final o1 n(b1 b1Var) {
        return new o1(b1Var.f61582a.d(), b1Var.f61582a.f(), b1Var);
    }

    public static final w1 o(b1 b1Var) {
        return new w1(b1Var, b1Var.f61582a.k());
    }

    @Override // zx.b
    @m80.l
    public Object E(@m80.l Object obj, @m80.l gz.a aVar, @m80.k j00.c<? super g2> cVar) {
        Object E = this.f61582a.E(obj, aVar, cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    @Override // zx.b
    @m80.l
    public <T> Object L(@m80.k gz.a aVar, @m80.k j00.c<? super T> cVar) {
        return this.f61582a.L(aVar, cVar);
    }

    @m80.k
    public final ix.p1 d() {
        return this.f61588g;
    }

    @m80.k
    public final l1 e() {
        return this.f61582a;
    }

    @Override // zx.b
    @m80.k
    public xy.b getAttributes() {
        return this.f61585d;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61582a.getCoroutineContext();
    }

    @Override // zx.b
    @m80.k
    public ix.p1 getParameters() {
        return this.f61587f;
    }

    @m80.k
    public final ix.p1 h() {
        return this.f61589h;
    }

    @Override // zx.b
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o1 f() {
        return (o1) this.f61583b.getValue();
    }

    @Override // zx.b
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public w1 k() {
        return (w1) this.f61584c.getValue();
    }

    @m80.k
    public final d1 m() {
        return this.f61590i;
    }

    @Override // zx.b
    @m80.k
    public zx.a w0() {
        return this.f61586e;
    }
}
