package l;

import j.j;
import j.t;
import java.io.Closeable;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface e extends Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(e eVar, Integer num, String str, int i11, l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i12 & 8) != 0) {
                lVar = null;
            }
            return eVar.v3(num, str, i11, lVar);
        }

        public static /* synthetic */ c b(e eVar, Integer num, String str, l lVar, int i11, l lVar2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
            }
            if ((i12 & 16) != 0) {
                lVar2 = null;
            }
            return eVar.c5(num, str, lVar, i11, lVar2);
        }
    }

    @m80.l
    t.b A2();

    void F6(@k String[] strArr, @k j.a aVar);

    void Y1(@k String[] strArr, @k j.a aVar);

    @k
    <R> c<R> c5(@m80.l Integer num, @k String str, @k l<? super d, ? extends c<R>> lVar, int i11, @m80.l l<? super f, g2> lVar2);

    @k
    c<t.b> s6();

    @k
    c<Long> v3(@m80.l Integer num, @k String str, int i11, @m80.l l<? super f, g2> lVar);

    void x7(@k String... strArr);
}
