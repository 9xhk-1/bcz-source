package ow;

import kotlin.jvm.internal.g0;
import ow.j;
import ow.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface l<T extends j> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ow.a b(l lVar, x00.l lVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i11 & 1) != 0) {
                lVar2 = new x00.l() { // from class: ow.k
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 c11;
                        c11 = l.a.c((j) obj2);
                        return c11;
                    }
                };
            }
            return lVar.a(lVar2);
        }

        public static g2 c(j jVar) {
            g0.p(jVar, "<this>");
            return g2.f100423a;
        }
    }

    @m80.k
    ow.a a(@m80.k x00.l<? super T, g2> lVar);
}
