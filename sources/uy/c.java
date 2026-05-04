package uy;

import e40.k0;
import e40.l0;
import io.ktor.websocket.j0;
import io.ktor.websocket.z;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements k, j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.b f92703a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final j0 f92704b;

    public c(@m80.k zx.b call, @m80.k j0 delegate) {
        g0.p(call, "call");
        g0.p(delegate, "delegate");
        this.f92703a = call;
        this.f92704b = delegate;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<z<?>> A0() {
        return this.f92704b.A0();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f92704b.E0(j11);
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return this.f92704b.Q0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return this.f92704b.U(dVar, cVar);
    }

    @m80.k
    public final j0 a() {
        return this.f92704b;
    }

    @Override // uy.k
    @m80.k
    public zx.b c() {
        return this.f92703a;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return this.f92704b.d0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return this.f92704b.g(cVar);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f92704b.getCoroutineContext();
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f92704b.i0(z11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public k0<io.ktor.websocket.d> j() {
        return this.f92704b.j();
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public l0<io.ktor.websocket.d> q() {
        return this.f92704b.q();
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        this.f92704b.s0();
    }
}
