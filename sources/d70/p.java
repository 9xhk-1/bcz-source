package d70;

import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import org.apache.commons.logging.Log;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthState;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class p extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Log f47419e;

    /* renamed from: f, reason: collision with root package name */
    public final q70.f f47420f;

    /* renamed from: g, reason: collision with root package name */
    public final org.apache.http.a f47421g;

    /* renamed from: h, reason: collision with root package name */
    public final ConnectionKeepAliveStrategy f47422h;

    /* renamed from: i, reason: collision with root package name */
    public final o f47423i;

    /* renamed from: j, reason: collision with root package name */
    public final v60.b<CookieSpecProvider> f47424j;

    /* renamed from: k, reason: collision with root package name */
    public final v60.b<AuthSchemeProvider> f47425k;

    /* renamed from: l, reason: collision with root package name */
    public final CookieStore f47426l;

    /* renamed from: m, reason: collision with root package name */
    public final CredentialsProvider f47427m;

    /* renamed from: n, reason: collision with root package name */
    public final RequestConfig f47428n;

    public p(q70.f fVar, org.apache.http.a aVar, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, ThreadFactory threadFactory, m70.i iVar, o oVar, v60.b<CookieSpecProvider> bVar, v60.b<AuthSchemeProvider> bVar2, CookieStore cookieStore, CredentialsProvider credentialsProvider, RequestConfig requestConfig) {
        super(fVar, threadFactory, iVar);
        this.f47419e = org.apache.commons.logging.g.q(getClass());
        this.f47420f = fVar;
        this.f47421g = aVar;
        this.f47422h = connectionKeepAliveStrategy;
        this.f47423i = oVar;
        this.f47424j = bVar;
        this.f47425k = bVar2;
        this.f47426l = cookieStore;
        this.f47427m = credentialsProvider;
        this.f47428n = requestConfig;
    }

    public final void U(HttpClientContext httpClientContext) {
        if (httpClientContext.getAttribute("http.auth.target-scope") == null) {
            httpClientContext.setAttribute("http.auth.target-scope", new AuthState());
        }
        if (httpClientContext.getAttribute("http.auth.proxy-scope") == null) {
            httpClientContext.setAttribute("http.auth.proxy-scope", new AuthState());
        }
        if (httpClientContext.getAttribute("http.authscheme-registry") == null) {
            httpClientContext.setAttribute("http.authscheme-registry", this.f47425k);
        }
        if (httpClientContext.getAttribute("http.cookiespec-registry") == null) {
            httpClientContext.setAttribute("http.cookiespec-registry", this.f47424j);
        }
        if (httpClientContext.getAttribute("http.cookie-store") == null) {
            httpClientContext.setAttribute("http.cookie-store", this.f47426l);
        }
        if (httpClientContext.getAttribute("http.auth.credentials-provider") == null) {
            httpClientContext.setAttribute("http.auth.credentials-provider", this.f47427m);
        }
        if (httpClientContext.getAttribute("http.request-config") == null) {
            httpClientContext.setAttribute("http.request-config", this.f47428n);
        }
    }

    @Override // n70.b
    public <T> Future<List<T>> i(HttpHost httpHost, List<? extends w70.z> list, List<? extends b0<T>> list2, HttpContext httpContext, u60.b<List<T>> bVar) {
        throw new UnsupportedOperationException("Pipelining not supported");
    }

    @Override // n70.a
    public <T> Future<T> j(w70.z zVar, b0<T> b0Var, HttpContext httpContext, u60.b<T> bVar) {
        u60.a aVar = new u60.a(bVar);
        if (httpContext == null) {
            httpContext = new c80.a();
        }
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        U(adapt);
        h hVar = new h(this.f47419e, zVar, b0Var, adapt, aVar, this.f47420f, this.f47421g, this.f47422h, this.f47423i);
        S(hVar);
        return new k(aVar, hVar);
    }
}
