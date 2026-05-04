package io.ktor.server.engine;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class n implements py.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.k0 f61411a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61412b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final py.c f61413c;

    @m80.k
    private volatile /* synthetic */ Object receiveChannel;

    public n(@m80.k zx.k0 call) {
        kotlin.jvm.internal.g0.p(call, "call");
        this.f61411a = call;
        this.receiveChannel = null;
        this.f61412b = yz.e0.c(new x00.a() { // from class: io.ktor.server.engine.m
            @Override // x00.a
            public final Object invoke() {
                e0 r11;
                r11 = n.r(n.this);
                return r11;
            }
        });
        py.c cVar = new py.c(call.w0().u());
        cVar.O(call.w0().g0());
        this.f61413c = cVar;
    }

    public static final e0 r(n nVar) {
        return new e0(nVar.o());
    }

    @Override // py.d
    @m80.k
    public final ix.q0 a() {
        return (ix.q0) this.f61412b.getValue();
    }

    @Override // py.g
    @m80.k
    public py.c b() {
        return this.f61413c;
    }

    @Override // py.d
    public /* bridge */ /* synthetic */ zx.b c() {
        return this.f61411a;
    }

    @Override // py.g
    @io.ktor.utils.io.b0
    public final void e(@m80.k String name, @m80.l List<String> list) {
        kotlin.jvm.internal.g0.p(name, "name");
        ix.q0 a11 = a();
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type io.ktor.server.engine.DelegateHeaders");
        ((e0) a11).e(name, list);
    }

    @Override // py.d
    @m80.k
    public final io.ktor.utils.io.g i() {
        io.ktor.utils.io.g gVar = (io.ktor.utils.io.g) this.receiveChannel;
        return gVar == null ? p() : gVar;
    }

    @Override // py.g
    @io.ktor.utils.io.b0
    public final void l(@m80.k io.ktor.utils.io.g channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        this.receiveChannel = channel;
    }

    @m80.k
    public abstract ix.q0 o();

    @m80.k
    public abstract io.ktor.utils.io.g p();

    @Override // py.g, py.d
    @m80.k
    public final zx.k0 c() {
        return this.f61411a;
    }
}
