package zx;

import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {
    @m80.k
    public static final Logger c(@m80.k a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return aVar.a().c();
    }

    @m80.k
    public static final v0 d(@m80.k f environment, @m80.k x00.l<? super w0, g2> block) {
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(block, "block");
        w0 w0Var = new w0(environment);
        block.invoke(w0Var);
        return w0Var.a();
    }

    public static /* synthetic */ v0 e(f fVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = io.ktor.server.engine.f.b(new x00.l() { // from class: zx.h
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 f11;
                    f11 = j.f((io.ktor.server.engine.d) obj2);
                    return f11;
                }
            });
        }
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: zx.i
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 g11;
                    g11 = j.g((w0) obj2);
                    return g11;
                }
            };
        }
        return d(fVar, lVar);
    }

    public static final g2 f(io.ktor.server.engine.d applicationEnvironment) {
        kotlin.jvm.internal.g0.p(applicationEnvironment, "$this$applicationEnvironment");
        return g2.f100423a;
    }

    public static final g2 g(w0 w0Var) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        return g2.f100423a;
    }
}
