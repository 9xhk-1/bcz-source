package w7;

import com.microsoft.thrifty.service.a;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;
import z7.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {
    public static final <T> T b(@k l<? super d<T>, g2> config) {
        g0.p(config, "config");
        d dVar = new d();
        config.invoke(dVar);
        final z7.d dVar2 = new z7.d();
        return dVar.b().invoke(new z7.a(new ws.c(new z7.b(new z7.c(y7.f.b(dVar.d()), new h().a(), dVar.c(), dVar2))), new l() { // from class: w7.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c11;
                c11 = f.c(z7.d.this, (String) obj);
                return c11;
            }
        }), new a());
    }

    public static final g2 c(z7.d dVar, String it) {
        g0.p(it, "it");
        dVar.b(it);
        return g2.f100423a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements a.InterfaceC0480a {
        @Override // com.microsoft.thrifty.service.a.InterfaceC0480a
        public void onError(Throwable error) {
            g0.p(error, "error");
            throw new AssertionError(error);
        }

        @Override // com.microsoft.thrifty.service.a.InterfaceC0480a
        public void a() {
        }
    }
}
