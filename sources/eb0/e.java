package eb0;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e {
    @va0.b
    @k
    public static final va0.c a(boolean z11, @k l<? super va0.c, g2> moduleDeclaration) {
        g0.p(moduleDeclaration, "moduleDeclaration");
        va0.c cVar = new va0.c(z11);
        moduleDeclaration.invoke(cVar);
        return cVar;
    }

    public static /* synthetic */ va0.c b(boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(z11, lVar);
    }
}
