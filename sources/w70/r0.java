package w70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class r0 implements i0 {
    @Override // w70.i0
    public final void b(HttpRequest httpRequest, HttpResponse httpResponse, l0 l0Var, HttpContext httpContext) throws HttpException, IOException {
        c(httpRequest, httpResponse, httpContext);
        l0Var.t(httpResponse);
    }

    public abstract void c(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException;
}
