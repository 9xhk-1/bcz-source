package z60;

import a70.g;
import a70.w;
import java.io.IOException;
import k70.h;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final w60.e f101036a;

    public b(w60.e eVar) {
        this.f101036a = (w60.e) e80.a.j(eVar, "Content length strategy");
    }

    public HttpEntity a(h hVar, o oVar) throws HttpException, IOException {
        e80.a.j(hVar, "Session input buffer");
        e80.a.j(oVar, "HTTP message");
        return b(hVar, oVar);
    }

    public w60.b b(h hVar, o oVar) throws HttpException, IOException {
        w60.b bVar = new w60.b();
        long a11 = this.f101036a.a(oVar);
        if (a11 == -2) {
            bVar.c(true);
            bVar.h0(-1L);
            bVar.f0(new a70.e(hVar));
        } else if (a11 == -1) {
            bVar.c(false);
            bVar.h0(-1L);
            bVar.f0(new w(hVar));
        } else {
            bVar.c(false);
            bVar.h0(a11);
            bVar.f0(new g(hVar, a11));
        }
        org.apache.http.e w11 = oVar.w("Content-Type");
        if (w11 != null) {
            bVar.j(w11);
        }
        org.apache.http.e w12 = oVar.w("Content-Encoding");
        if (w12 != null) {
            bVar.f(w12);
        }
        return bVar;
    }
}
