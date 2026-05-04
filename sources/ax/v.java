package ax;

import c40.x0;
import e40.k0;
import e40.l0;
import io.ktor.websocket.CloseReason;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v implements u, io.ktor.websocket.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.ktor.websocket.a f5550a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final mw.a f5551b;

    public v(@m80.k mw.a call, @m80.k io.ktor.websocket.a delegate) {
        g0.p(call, "call");
        g0.p(delegate, "delegate");
        this.f5550a = delegate;
        this.f5551b = call;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<io.ktor.websocket.z<?>> A0() {
        return this.f5550a.A0();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f5550a.E0(j11);
    }

    @Override // io.ktor.websocket.a
    public void L0(long j11) {
        this.f5550a.L0(j11);
    }

    @Override // io.ktor.websocket.a
    @io.ktor.utils.io.b0
    public void N0(@m80.k List<? extends io.ktor.websocket.z<?>> negotiatedExtensions) {
        g0.p(negotiatedExtensions, "negotiatedExtensions");
        this.f5550a.N0(negotiatedExtensions);
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return this.f5550a.Q0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return this.f5550a.U(dVar, cVar);
    }

    @Override // io.ktor.websocket.a
    public long a0() {
        return this.f5550a.a0();
    }

    @Override // ax.u
    @m80.k
    public mw.a c() {
        return this.f5551b;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return this.f5550a.d0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return this.f5550a.g(cVar);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f5550a.getCoroutineContext();
    }

    @Override // io.ktor.websocket.a
    @m80.k
    public x0<CloseReason> h0() {
        return this.f5550a.h0();
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f5550a.i0(z11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public k0<io.ktor.websocket.d> j() {
        return this.f5550a.j();
    }

    @Override // io.ktor.websocket.a
    public void k0(long j11) {
        this.f5550a.k0(j11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public l0<io.ktor.websocket.d> q() {
        return this.f5550a.q();
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        this.f5550a.s0();
    }

    @Override // io.ktor.websocket.a
    public long x0() {
        return this.f5550a.x0();
    }
}
