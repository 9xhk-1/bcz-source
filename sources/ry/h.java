package ry;

import a00.h0;
import c40.a0;
import c40.l2;
import c40.n2;
import c40.q0;
import e40.k0;
import e40.l0;
import io.ktor.websocket.j0;
import io.ktor.websocket.z;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k0<io.ktor.websocket.d> f86933a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l0<io.ktor.websocket.d> f86934b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a0 f86935c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f86936d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@m80.k kotlin.coroutines.d callContext, @m80.k k0<? extends io.ktor.websocket.d> incoming, @m80.k l0<? super io.ktor.websocket.d> outgoing) {
        g0.p(callContext, "callContext");
        g0.p(incoming, "incoming");
        g0.p(outgoing, "outgoing");
        this.f86933a = incoming;
        this.f86934b = outgoing;
        a0 a11 = n2.a((l2) callContext.get(l2.f7886e0));
        this.f86935c = a11;
        this.f86936d = callContext.plus(a11).plus(new q0("test-ws"));
    }

    public static final g2 d(h hVar, Throwable th2) {
        if (th2 != null) {
            hVar.f86935c.r(th2);
        } else {
            hVar.f86935c.complete();
        }
        return g2.f100423a;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<z<?>> A0() {
        return h0.J();
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return true;
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return j0.a.a(this, dVar, cVar);
    }

    @m80.l
    public final Object b(@m80.k j00.c<? super g2> cVar) {
        q().u(new x00.l() { // from class: ry.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = h.d(h.this, (Throwable) obj);
                return d11;
            }
        });
        Object K0 = this.f86935c.K0(cVar);
        return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : g2.f100423a;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return Long.MAX_VALUE;
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return g2.f100423a;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86936d;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public k0<io.ktor.websocket.d> j() {
        return this.f86933a;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public l0<io.ktor.websocket.d> q() {
        return this.f86934b;
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        throw new NotImplementedError("error");
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
    }
}
