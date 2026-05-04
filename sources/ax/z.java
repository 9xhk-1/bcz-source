package ax;

import ix.q0;
import ix.r0;
import ix.y0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z extends cx.u {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f5555c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final q0 f5556d;

    public z() {
        String str = xy.f.g(xy.b0.f(16));
        g0.o(str, "toString(...)");
        this.f5555c = str;
        r0 r0Var = new r0(0, 1, null);
        y0 y0Var = y0.f63006a;
        r0Var.k(y0Var.K0(), "websocket");
        r0Var.k(y0Var.v(), "Upgrade");
        r0Var.k(y0Var.x0(), str);
        r0Var.k(y0Var.z0(), "13");
        this.f5556d = r0Var.build();
    }

    @Override // mx.v
    @m80.k
    public q0 d() {
        return this.f5556d;
    }

    @Override // cx.u
    public void s(@m80.k q0 headers) {
        g0.p(headers, "headers");
        y0 y0Var = y0.f63006a;
        String str = headers.get(y0Var.v0());
        if (str == null) {
            throw new IllegalStateException(("Server should specify header " + y0Var.v0()).toString());
        }
        String a11 = qx.a.a(this.f5555c);
        if (g0.g(a11, str)) {
            return;
        }
        throw new IllegalStateException(("Failed to verify server accept header. Expected: " + a11 + ", received: " + str).toString());
    }

    @m80.k
    public String toString() {
        return "WebSocketContent";
    }
}
