package fx;

import ix.q0;
import ix.r0;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {
    @m80.k
    public static final q0 b(@m80.k x00.l<? super r0, g2> block) {
        g0.p(block, "block");
        r0 r0Var = new r0(0, 1, null);
        block.invoke(r0Var);
        return r0Var.build();
    }

    public static /* synthetic */ q0 c(x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: fx.j
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 d11;
                    d11 = k.d((r0) obj2);
                    return d11;
                }
            };
        }
        return b(lVar);
    }

    public static final g2 d(r0 r0Var) {
        g0.p(r0Var, "<this>");
        return g2.f100423a;
    }
}
