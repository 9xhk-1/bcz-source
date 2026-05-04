package yw;

import ix.f1;
import ix.g1;
import ix.q0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g extends ex.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final mw.a f100343a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.a<io.ktor.utils.io.g> f100344b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ex.c f100345c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final q0 f100346d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f100347e;

    public /* synthetic */ g(mw.a aVar, x00.a aVar2, ex.c cVar, q0 q0Var, int i11, v vVar) {
        this(aVar, (x00.a<? extends io.ktor.utils.io.g>) aVar2, cVar, (i11 & 8) != 0 ? cVar.a() : q0Var);
    }

    @Override // ix.a1
    @m80.k
    public q0 a() {
        return this.f100346d;
    }

    @Override // ex.c
    @m80.k
    public io.ktor.utils.io.g b() {
        return this.f100344b.invoke();
    }

    @Override // ex.c
    @m80.k
    public mw.a c() {
        return this.f100343a;
    }

    @Override // ex.c
    @m80.k
    public bz.b e() {
        return this.f100345c.e();
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f100347e;
    }

    @Override // ex.c
    @m80.k
    public bz.b h() {
        return this.f100345c.h();
    }

    @Override // ex.c
    @m80.k
    public g1 i() {
        return this.f100345c.i();
    }

    @Override // ex.c
    @m80.k
    public f1 l() {
        return this.f100345c.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k mw.a call, @m80.k x00.a<? extends io.ktor.utils.io.g> block, @m80.k ex.c origin, @m80.k q0 headers) {
        g0.p(call, "call");
        g0.p(block, "block");
        g0.p(origin, "origin");
        g0.p(headers, "headers");
        this.f100343a = call;
        this.f100344b = block;
        this.f100345c = origin;
        this.f100346d = headers;
        this.f100347e = origin.getCoroutineContext();
    }

    public /* synthetic */ g(mw.a aVar, io.ktor.utils.io.g gVar, ex.c cVar, q0 q0Var, int i11, v vVar) {
        this(aVar, gVar, cVar, (i11 & 8) != 0 ? cVar.a() : q0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@m80.k mw.a call, @m80.k final io.ktor.utils.io.g content, @m80.k ex.c origin, @m80.k q0 headers) {
        this(call, (x00.a<? extends io.ktor.utils.io.g>) new x00.a() { // from class: yw.f
            @Override // x00.a
            public final Object invoke() {
                io.ktor.utils.io.g n11;
                n11 = g.n(io.ktor.utils.io.g.this);
                return n11;
            }
        }, origin, headers);
        g0.p(call, "call");
        g0.p(content, "content");
        g0.p(origin, "origin");
        g0.p(headers, "headers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.g n(io.ktor.utils.io.g gVar) {
        return gVar;
    }
}
