package c80;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class b0 implements org.apache.http.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8299a;

    public b0() {
        this(false);
    }

    @Override // org.apache.http.s
    public void g(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        if (this.f8299a) {
            httpResponse.v("Transfer-Encoding");
            httpResponse.v("Content-Length");
        } else {
            if (httpResponse.f("Transfer-Encoding")) {
                throw new ProtocolException("Transfer-encoding header already present");
            }
            if (httpResponse.f("Content-Length")) {
                throw new ProtocolException("Content-Length header already present");
            }
        }
        ProtocolVersion protocolVersion = httpResponse.n().getProtocolVersion();
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            int statusCode = httpResponse.n().getStatusCode();
            if (statusCode == 204 || statusCode == 304 || statusCode == 205) {
                return;
            }
            httpResponse.q("Content-Length", "0");
            return;
        }
        long c02 = entity.c0();
        if (entity.a0() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
            httpResponse.q("Transfer-Encoding", f.f8329r);
        } else if (c02 >= 0) {
            httpResponse.q("Content-Length", Long.toString(entity.c0()));
        }
        if (entity.getContentType() != null && !httpResponse.f("Content-Type")) {
            httpResponse.c(entity.getContentType());
        }
        if (entity.Z() == null || httpResponse.f("Content-Encoding")) {
            return;
        }
        httpResponse.c(entity.Z());
    }

    public b0(boolean z11) {
        this.f8299a = z11;
    }
}
