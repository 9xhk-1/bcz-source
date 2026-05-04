package c80;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class v implements org.apache.http.q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8365a;

    public v() {
        this(false);
    }

    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        if (httpRequest instanceof org.apache.http.l) {
            if (this.f8365a) {
                httpRequest.v("Transfer-Encoding");
                httpRequest.v("Content-Length");
            } else {
                if (httpRequest.f("Transfer-Encoding")) {
                    throw new ProtocolException("Transfer-encoding header already present");
                }
                if (httpRequest.f("Content-Length")) {
                    throw new ProtocolException("Content-Length header already present");
                }
            }
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntity entity = ((org.apache.http.l) httpRequest).getEntity();
            if (entity == null) {
                httpRequest.q("Content-Length", "0");
                return;
            }
            if (!entity.a0() && entity.c0() >= 0) {
                httpRequest.q("Content-Length", Long.toString(entity.c0()));
            } else {
                if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    throw new ProtocolException("Chunked transfer encoding not allowed for " + protocolVersion);
                }
                httpRequest.q("Transfer-Encoding", f.f8329r);
            }
            if (entity.getContentType() != null && !httpRequest.f("Content-Type")) {
                httpRequest.c(entity.getContentType());
            }
            if (entity.Z() == null || httpRequest.f("Content-Encoding")) {
                return;
            }
            httpRequest.c(entity.Z());
        }
    }

    public v(boolean z11) {
        this.f8365a = z11;
    }
}
