package uy;

import c40.x0;
import e40.k0;
import e40.l0;
import io.ktor.utils.io.b0;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.z;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements a, io.ktor.websocket.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.b f92701a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final io.ktor.websocket.a f92702b;

    public b(@m80.k zx.b call, @m80.k io.ktor.websocket.a delegate) {
        g0.p(call, "call");
        g0.p(delegate, "delegate");
        this.f92701a = call;
        this.f92702b = delegate;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<z<?>> A0() {
        return this.f92702b.A0();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f92702b.E0(j11);
    }

    @Override // io.ktor.websocket.a
    public void L0(long j11) {
        this.f92702b.L0(j11);
    }

    @Override // io.ktor.websocket.a
    @b0
    public void N0(@m80.k List<? extends z<?>> negotiatedExtensions) {
        g0.p(negotiatedExtensions, "negotiatedExtensions");
        this.f92702b.N0(negotiatedExtensions);
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return this.f92702b.Q0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return this.f92702b.U(dVar, cVar);
    }

    @m80.k
    public final io.ktor.websocket.a a() {
        return this.f92702b;
    }

    @Override // io.ktor.websocket.a
    public long a0() {
        return this.f92702b.a0();
    }

    @Override // uy.k
    @m80.k
    public zx.b c() {
        return this.f92701a;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return this.f92702b.d0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return this.f92702b.g(cVar);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f92702b.getCoroutineContext();
    }

    @Override // io.ktor.websocket.a
    @m80.k
    public x0<CloseReason> h0() {
        return this.f92702b.h0();
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f92702b.i0(z11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public k0<io.ktor.websocket.d> j() {
        return this.f92702b.j();
    }

    @Override // io.ktor.websocket.a
    public void k0(long j11) {
        this.f92702b.k0(j11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public l0<io.ktor.websocket.d> q() {
        return this.f92702b.q();
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        this.f92702b.s0();
    }

    @Override // io.ktor.websocket.a
    public long x0() {
        return this.f92702b.x0();
    }
}
