package tx;

import tx.d;
import tx.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g extends d, tx.a, t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static void a(@m80.k g gVar) {
            d.a.a(gVar);
        }

        @m80.l
        public static Object b(@m80.k g gVar, @m80.k j00.c<? super q> cVar) {
            return t.a.a(gVar, cVar);
        }

        @m80.l
        public static Object c(@m80.k g gVar, @m80.k q qVar, @m80.k j00.c<? super g2> cVar) {
            Object b11 = t.a.b(gVar, qVar, cVar);
            return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
        }
    }
}
