package w70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class h implements v<HttpRequest> {

    /* renamed from: a, reason: collision with root package name */
    public final c80.m f95589a;

    public h(c80.m mVar) {
        e80.a.j(mVar, "Request handler");
        this.f95589a = mVar;
    }

    @Override // w70.v
    public s<HttpRequest> a(HttpRequest httpRequest, HttpContext httpContext) {
        return new f();
    }

    @Override // w70.v
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(HttpRequest httpRequest, q qVar, HttpContext httpContext) throws HttpException, IOException {
        this.f95589a.a(httpRequest, qVar.k(), httpContext);
        qVar.p();
    }
}
