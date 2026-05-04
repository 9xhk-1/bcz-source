package f70;

import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class g implements HttpRoutePlanner {

    /* renamed from: a, reason: collision with root package name */
    public final r70.b f51164a;

    public g(r70.b bVar) {
        this.f51164a = bVar;
    }

    public final r70.b a(HttpContext httpContext) {
        r70.b bVar = (r70.b) httpContext.getAttribute("http.scheme-registry");
        return bVar == null ? this.f51164a : bVar;
    }

    @Override // org.apache.http.conn.routing.HttpRoutePlanner
    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        if (httpRequest == null) {
            throw new IllegalStateException("Request may not be null");
        }
        HttpRoute forcedRoute = ConnRouteParams.getForcedRoute(httpRequest.getParams());
        if (forcedRoute != null) {
            return forcedRoute;
        }
        if (httpHost == null) {
            throw new IllegalStateException("Target host may be null");
        }
        InetAddress localAddress = ConnRouteParams.getLocalAddress(httpRequest.getParams());
        HttpHost defaultProxy = ConnRouteParams.getDefaultProxy(httpRequest.getParams());
        try {
            r70.c b11 = a(httpContext).c(httpHost).b();
            boolean z11 = b11 != null && b11.isSecure();
            return defaultProxy == null ? new HttpRoute(httpHost, localAddress, z11) : new HttpRoute(httpHost, localAddress, defaultProxy, z11);
        } catch (IllegalStateException e11) {
            throw new HttpException(e11.getMessage());
        }
    }
}
