package rw;

import rw.y;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface y<TConfig, TPlugin> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object b(y yVar, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i11 & 1) != 0) {
                lVar = new x00.l() { // from class: rw.x
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 c11;
                        c11 = y.a.c(obj2);
                        return c11;
                    }
                };
            }
            return yVar.a(lVar);
        }

        public static g2 c(Object obj) {
            kotlin.jvm.internal.g0.p(obj, "<this>");
            return g2.f100423a;
        }
    }

    @m80.k
    TPlugin a(@m80.k x00.l<? super TConfig, g2> lVar);

    void b(@m80.k TPlugin tplugin, @m80.k lw.c cVar);

    @m80.k
    xy.a<TPlugin> getKey();
}
