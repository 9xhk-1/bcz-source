package ux;

import io.ktor.network.tls.TLSHandshakeType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public TLSHandshakeType f92600a = TLSHandshakeType.HelloRequest;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public y40.c0 f92601b = jz.j.i();

    @m80.k
    public final y40.c0 a() {
        return this.f92601b;
    }

    @m80.k
    public final TLSHandshakeType b() {
        return this.f92600a;
    }

    public final void c(@m80.k y40.c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<set-?>");
        this.f92601b = c0Var;
    }

    public final void d(@m80.k TLSHandshakeType tLSHandshakeType) {
        kotlin.jvm.internal.g0.p(tLSHandshakeType, "<set-?>");
        this.f92600a = tLSHandshakeType;
    }
}
