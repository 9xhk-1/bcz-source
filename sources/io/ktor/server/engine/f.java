package io.ktor.server.engine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {
    @m80.k
    public static final zx.f b(@m80.k x00.l<? super d, yz.g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        d dVar = new d();
        block.invoke(dVar);
        return dVar.a();
    }

    public static /* synthetic */ zx.f c(x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.engine.e
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 d11;
                    d11 = f.d((d) obj2);
                    return d11;
                }
            };
        }
        return b(lVar);
    }

    public static final yz.g2 d(d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return yz.g2.f100423a;
    }
}
