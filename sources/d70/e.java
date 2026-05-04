package d70;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public abstract class e extends c implements n70.b {
    @Override // n70.b
    public Future<List<HttpResponse>> f(HttpHost httpHost, List<HttpRequest> list, u60.b<List<HttpResponse>> bVar) {
        return k(httpHost, list, HttpClientContext.create(), bVar);
    }

    @Override // n70.b
    public Future<List<HttpResponse>> k(HttpHost httpHost, List<HttpRequest> list, HttpContext httpContext, u60.b<List<HttpResponse>> bVar) {
        e80.a.g(list, "HTTP request list");
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(o70.d.a(httpHost, list.get(i11)));
            arrayList2.add(o70.d.c());
        }
        return i(httpHost, arrayList, arrayList2, httpContext, bVar);
    }

    @Override // n70.b
    public <T> Future<List<T>> q(HttpHost httpHost, List<? extends w70.z> list, List<? extends b0<T>> list2, u60.b<List<T>> bVar) {
        return i(httpHost, list, list2, HttpClientContext.create(), bVar);
    }
}
