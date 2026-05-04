package rw;

import org.slf4j.Logger;
import rw.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84674a = ez.a.a("io.ktor.client.plugins.DefaultRequest");

    public static final void c(@m80.k lw.j<?> jVar, @m80.k final x00.l<? super g.a, g2> block) {
        kotlin.jvm.internal.g0.p(jVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        jVar.s(g.f84657b, new x00.l() { // from class: rw.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = i.d(x00.l.this, (g.a) obj);
                return d11;
            }
        });
    }

    public static final g2 d(x00.l lVar, g.a install) {
        kotlin.jvm.internal.g0.p(install, "$this$install");
        lVar.invoke(install);
        return g2.f100423a;
    }
}
