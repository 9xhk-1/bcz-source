package c80;

import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.HttpConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class y implements org.apache.http.q {
    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        g a11 = g.a(httpContext);
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        if ((httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) || httpRequest.f("Host")) {
            return;
        }
        HttpHost i11 = a11.i();
        if (i11 == null) {
            HttpConnection e11 = a11.e();
            if (e11 instanceof org.apache.http.n) {
                org.apache.http.n nVar = (org.apache.http.n) e11;
                InetAddress l11 = nVar.l();
                int y11 = nVar.y();
                if (l11 != null) {
                    i11 = new HttpHost(l11.getHostName(), y11);
                }
            }
            if (i11 == null) {
                if (!protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    throw new ProtocolException("Target host missing");
                }
                return;
            }
        }
        httpRequest.q("Host", i11.toHostString());
    }
}
