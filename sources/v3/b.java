package v3;

import j.o;
import l.c;
import l.g;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ Object b(b bVar, g gVar, String str, boolean z11, p pVar, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrCreateDb");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return bVar.a(gVar, str, z11, pVar, cVar);
    }

    @l
    <T extends o> Object a(@k g<c.a<g2>> gVar, @k String str, boolean z11, @k p<? super l.e, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar);
}
