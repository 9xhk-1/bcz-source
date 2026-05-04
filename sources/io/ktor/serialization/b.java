package io.ktor.serialization;

import io.ktor.serialization.b;
import ix.k;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ void b(b bVar, k kVar, c cVar, l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i11 & 4) != 0) {
                lVar = new l() { // from class: io.ktor.serialization.a
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 c11;
                        c11 = b.a.c((c) obj2);
                        return c11;
                    }
                };
            }
            bVar.a(kVar, cVar, lVar);
        }

        public static g2 c(c cVar) {
            g0.p(cVar, "<this>");
            return g2.f100423a;
        }
    }

    <T extends c> void a(@m80.k k kVar, @m80.k T t11, @m80.k l<? super T, g2> lVar);
}
