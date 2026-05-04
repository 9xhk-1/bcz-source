package j70;

import b80.e;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class c extends e<HttpHost, i> {
    public c(String str, HttpHost httpHost, i iVar) {
        super(str, httpHost, iVar);
    }

    @Override // b80.e
    public void a() {
        try {
            i b11 = b();
            try {
                int x11 = b11.x();
                if (x11 <= 0 || x11 > 1000) {
                    b11.setSocketTimeout(1000);
                }
                b11.close();
            } catch (IOException unused) {
                b11.shutdown();
            }
        } catch (IOException unused2) {
        }
    }

    @Override // b80.e
    public boolean k() {
        return !b().isOpen();
    }
}
