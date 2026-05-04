package qa0;

import java.util.List;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ void a(c cVar, List list, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKoinModules");
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            cVar.g(list, z11);
        }

        public static /* synthetic */ void b(c cVar, va0.c cVar2, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKoinModules");
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            cVar.a(cVar2, z11);
        }
    }

    void a(@k va0.c cVar, boolean z11);

    void b();

    @l
    na0.a c();

    @k
    na0.b d(@k x00.l<? super na0.b, g2> lVar);

    void e(@k List<va0.c> list);

    @k
    na0.b f(@k na0.b bVar);

    void g(@k List<va0.c> list, boolean z11);

    @k
    na0.a get();

    void h(@k va0.c cVar);
}
