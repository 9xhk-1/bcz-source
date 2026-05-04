package ax;

import e40.k0;
import e40.l0;
import io.ktor.websocket.j0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w implements u, j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f5552a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final mw.a f5553b;

    public w(@m80.k mw.a call, @m80.k j0 session) {
        g0.p(call, "call");
        g0.p(session, "session");
        this.f5552a = session;
        this.f5553b = call;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<io.ktor.websocket.z<?>> A0() {
        return this.f5552a.A0();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f5552a.E0(j11);
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return this.f5552a.Q0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return this.f5552a.U(dVar, cVar);
    }

    @Override // ax.u
    @m80.k
    public mw.a c() {
        return this.f5553b;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return this.f5552a.d0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return this.f5552a.g(cVar);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f5552a.getCoroutineContext();
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f5552a.i0(z11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public k0<io.ktor.websocket.d> j() {
        return this.f5552a.j();
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public l0<io.ktor.websocket.d> q() {
        return this.f5552a.q();
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        this.f5552a.s0();
    }
}
