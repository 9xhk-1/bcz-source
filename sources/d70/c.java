package d70;

import java.io.Closeable;
import java.net.URI;
import java.util.concurrent.Future;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public abstract class c implements n70.a, Closeable {
    private HttpHost C(HttpUriRequest httpUriRequest) throws ClientProtocolException {
        e80.a.j(httpUriRequest, "HTTP request");
        URI uri = httpUriRequest.getURI();
        if (!uri.isAbsolute()) {
            return null;
        }
        HttpHost extractHost = URIUtils.extractHost(uri);
        if (extractHost != null) {
            return extractHost;
        }
        throw new ClientProtocolException("URI does not specify a valid host name: " + uri);
    }

    public abstract boolean E();

    public abstract void H();

    @Override // n70.a
    public <T> Future<T> a(w70.z zVar, b0<T> b0Var, u60.b<T> bVar) {
        return j(zVar, b0Var, HttpClientContext.create(), bVar);
    }

    @Override // n70.a
    public Future<HttpResponse> c(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, u60.b<HttpResponse> bVar) {
        return j(o70.d.a(httpHost, httpRequest), o70.d.c(), httpContext, bVar);
    }

    @Override // n70.a
    public Future<HttpResponse> e(HttpUriRequest httpUriRequest, u60.b<HttpResponse> bVar) {
        return r(httpUriRequest, HttpClientContext.create(), bVar);
    }

    @Override // n70.a
    public Future<HttpResponse> r(HttpUriRequest httpUriRequest, HttpContext httpContext, u60.b<HttpResponse> bVar) {
        try {
            return c(C(httpUriRequest), httpUriRequest, httpContext, bVar);
        } catch (ClientProtocolException e11) {
            u60.a aVar = new u60.a(bVar);
            aVar.c(e11);
            return aVar;
        }
    }

    @Override // n70.a
    public Future<HttpResponse> w(HttpHost httpHost, HttpRequest httpRequest, u60.b<HttpResponse> bVar) {
        return c(httpHost, httpRequest, HttpClientContext.create(), bVar);
    }
}
