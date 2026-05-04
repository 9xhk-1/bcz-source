package n70;

import java.util.concurrent.Future;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import w70.b0;
import w70.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface a {
    <T> Future<T> a(z zVar, b0<T> b0Var, u60.b<T> bVar);

    Future<HttpResponse> c(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, u60.b<HttpResponse> bVar);

    Future<HttpResponse> e(HttpUriRequest httpUriRequest, u60.b<HttpResponse> bVar);

    <T> Future<T> j(z zVar, b0<T> b0Var, HttpContext httpContext, u60.b<T> bVar);

    Future<HttpResponse> r(HttpUriRequest httpUriRequest, HttpContext httpContext, u60.b<HttpResponse> bVar);

    Future<HttpResponse> w(HttpHost httpHost, HttpRequest httpRequest, u60.b<HttpResponse> bVar);
}
