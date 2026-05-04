package io.ktor.server.engine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f61384a = kotlin.jvm.internal.g0.g(System.getProperty("io.ktor.server.engine.ShutdownHook", n6.m.f74525c), n6.m.f74525c);

    public static final boolean b() {
        return f61384a;
    }

    public static final void c(@m80.k b1<?, ?> b1Var, @m80.k x00.a<yz.g2> stop) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(stop, "stop");
        final f2 f2Var = new f2(stop);
        b1Var.s().c(zx.c0.e(), new x00.l() { // from class: io.ktor.server.engine.g2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d11;
                d11 = h2.d(f2.this, (zx.a) obj);
                return d11;
            }
        });
        Runtime.getRuntime().addShutdownHook(f2Var);
    }

    public static final yz.g2 d(f2 f2Var, zx.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        try {
            Runtime.getRuntime().removeShutdownHook(f2Var);
        } catch (IllegalStateException unused) {
        }
        return yz.g2.f100423a;
    }
}
