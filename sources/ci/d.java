package ci;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static l<? super String, g2> f8678a = new l() { // from class: ci.c
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 c11;
            c11 = d.c((String) obj);
            return c11;
        }
    };

    @k
    public static final l<String, g2> b() {
        return f8678a;
    }

    public static final g2 c(String it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    public static final void d(@k l<? super String, g2> lVar) {
        g0.p(lVar, "<set-?>");
        f8678a = lVar;
    }
}
