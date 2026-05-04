package c80;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class a0 implements org.apache.http.s {
    @Override // org.apache.http.s
    public void g(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        g a11 = g.a(httpContext);
        int statusCode = httpResponse.n().getStatusCode();
        if (statusCode == 400 || statusCode == 408 || statusCode == 411 || statusCode == 413 || statusCode == 414 || statusCode == 503 || statusCode == 501) {
            httpResponse.g("Connection", f.f8327p);
            return;
        }
        org.apache.http.e w11 = httpResponse.w("Connection");
        if (w11 == null || !f.f8327p.equalsIgnoreCase(w11.getValue())) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                ProtocolVersion protocolVersion = httpResponse.n().getProtocolVersion();
                if (entity.c0() < 0 && (!entity.a0() || protocolVersion.lessEquals(HttpVersion.HTTP_1_0))) {
                    httpResponse.g("Connection", f.f8327p);
                    return;
                }
            }
            HttpRequest g11 = a11.g();
            if (g11 != null) {
                org.apache.http.e w12 = g11.w("Connection");
                if (w12 != null) {
                    httpResponse.g("Connection", w12.getValue());
                } else if (g11.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    httpResponse.g("Connection", f.f8327p);
                }
            }
        }
    }
}
