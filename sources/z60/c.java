package z60;

import a70.f;
import a70.h;
import a70.x;
import java.io.IOException;
import java.io.OutputStream;
import k70.i;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final w60.e f101037a;

    public c(w60.e eVar) {
        this.f101037a = (w60.e) e80.a.j(eVar, "Content length strategy");
    }

    public OutputStream a(i iVar, o oVar) throws HttpException, IOException {
        long a11 = this.f101037a.a(oVar);
        return a11 == -2 ? new f(iVar) : a11 == -1 ? new x(iVar) : new h(iVar, a11);
    }

    public void b(i iVar, o oVar, HttpEntity httpEntity) throws HttpException, IOException {
        e80.a.j(iVar, "Session output buffer");
        e80.a.j(oVar, "HTTP message");
        e80.a.j(httpEntity, "HTTP entity");
        OutputStream a11 = a(iVar, oVar);
        httpEntity.writeTo(a11);
        a11.close();
    }
}
