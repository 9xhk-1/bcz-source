package n70;

import java.util.List;
import java.util.concurrent.Future;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import w70.b0;
import w70.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface b extends a {
    Future<List<HttpResponse>> f(HttpHost httpHost, List<HttpRequest> list, u60.b<List<HttpResponse>> bVar);

    <T> Future<List<T>> i(HttpHost httpHost, List<? extends z> list, List<? extends b0<T>> list2, HttpContext httpContext, u60.b<List<T>> bVar);

    Future<List<HttpResponse>> k(HttpHost httpHost, List<HttpRequest> list, HttpContext httpContext, u60.b<List<HttpResponse>> bVar);

    <T> Future<List<T>> q(HttpHost httpHost, List<? extends z> list, List<? extends b0<T>> list2, u60.b<List<T>> bVar);
}
