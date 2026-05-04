package tx;

import c40.k1;
import c40.l2;
import java.io.Closeable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface d extends Closeable, k1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static void a(@m80.k d dVar) {
            try {
                dVar.close();
            } catch (Throwable unused) {
            }
        }
    }

    @m80.k
    l2 Z3();

    @Override // c40.k1
    void dispose();
}
