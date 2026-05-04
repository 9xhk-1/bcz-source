package eb0;

import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {
    @va0.a
    @k
    public static final na0.b a(@l c cVar) {
        return d(true, cVar != null ? cVar.c() : null);
    }

    @va0.a
    @k
    public static final na0.b b(@l x00.l<? super na0.b, g2> lVar) {
        return d(true, lVar);
    }

    @va0.a
    @k
    public static final na0.b c(boolean z11) {
        return d(z11, null);
    }

    @va0.a
    @k
    public static final na0.b d(boolean z11, @l x00.l<? super na0.b, g2> lVar) {
        na0.b a11 = na0.b.f75035c.a();
        if (lVar != null) {
            lVar.invoke(a11);
        }
        if (z11) {
            a11.c();
        }
        return a11;
    }

    public static /* synthetic */ na0.b e(boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        return d(z11, lVar);
    }
}
