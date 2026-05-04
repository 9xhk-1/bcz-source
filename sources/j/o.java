package j;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface o extends u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ Object a(o oVar, boolean z11, x00.p pVar, j00.c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return oVar.a(z11, pVar, cVar);
        }

        public static /* synthetic */ Object b(o oVar, boolean z11, x00.p pVar, j00.c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transactionWithResult");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return oVar.s(z11, pVar, cVar);
        }
    }

    @m80.l
    Object a(boolean z11, @m80.k x00.p<? super r, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar);

    @m80.l
    <R> Object s(boolean z11, @m80.k x00.p<? super q<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar);
}
