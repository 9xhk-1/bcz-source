package fy;

import c40.h1;
import c40.m0;
import io.ktor.server.engine.d2;
import io.ktor.server.engine.s1;
import kotlin.jvm.internal.g0;
import yz.g2;
import zx.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    public static final int b() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static final void c(@m80.k ey.a config, @m80.k s1 pipeline) {
        final String string;
        g0.p(config, "config");
        g0.p(pipeline, "pipeline");
        ey.c d11 = config.d("ktor.deployment.shutdown.url");
        if (d11 == null || (string = d11.getString()) == null) {
            return;
        }
        q.j(pipeline, d2.e.f61352a, new x00.l() { // from class: fy.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d12;
                d12 = b.d(string, (d2.d) obj);
                return d12;
            }
        });
    }

    public static final g2 d(String str, d2.d install) {
        g0.p(install, "$this$install");
        install.f(str);
        return g2.f100423a;
    }

    @m80.k
    public static final m0 e(@m80.k h1 h1Var) {
        g0.p(h1Var, "<this>");
        return h1.c();
    }

    public static final void f(@m80.l Object obj) {
        System.err.print(obj);
    }
}
