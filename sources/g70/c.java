package g70;

import b80.e;
import java.io.IOException;
import m70.h;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class c extends e<HttpHost, h> {

    /* renamed from: i, reason: collision with root package name */
    public volatile int f53153i;

    public c(String str, HttpHost httpHost, h hVar) {
        super(str, httpHost, hVar);
    }

    @Override // b80.e
    public void a() {
        try {
            h b11 = b();
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

    public int o() {
        return this.f53153i;
    }

    public void p(int i11) {
        this.f53153i = i11;
    }
}
