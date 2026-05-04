package d70;

import java.io.IOException;
import java.net.URI;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import org.apache.commons.logging.Log;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.DefaultUserTokenHandler;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.apache.http.impl.client.TargetAuthenticationStrategy;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.impl.cookie.IgnoreSpecFactory;
import org.apache.http.impl.cookie.NetscapeDraftSpecFactory;
import org.apache.http.impl.cookie.RFC2109SpecFactory;
import org.apache.http.impl.cookie.RFC2965SpecFactory;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.nio.reactor.IOReactorStatus;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class b implements n70.a {

    /* renamed from: a, reason: collision with root package name */
    public final Log f47324a;

    /* renamed from: b, reason: collision with root package name */
    public final q70.c f47325b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue<w70.t<?>> f47326c;

    /* renamed from: d, reason: collision with root package name */
    public Thread f47327d;

    /* renamed from: e, reason: collision with root package name */
    public c80.b f47328e;

    /* renamed from: f, reason: collision with root package name */
    public c80.t f47329f;

    /* renamed from: g, reason: collision with root package name */
    public org.apache.http.a f47330g;

    /* renamed from: h, reason: collision with root package name */
    public ConnectionKeepAliveStrategy f47331h;

    /* renamed from: i, reason: collision with root package name */
    public RedirectStrategy f47332i;

    /* renamed from: j, reason: collision with root package name */
    public CookieSpecRegistry f47333j;

    /* renamed from: k, reason: collision with root package name */
    public CookieStore f47334k;

    /* renamed from: l, reason: collision with root package name */
    public AuthSchemeRegistry f47335l;

    /* renamed from: m, reason: collision with root package name */
    public AuthenticationStrategy f47336m;

    /* renamed from: n, reason: collision with root package name */
    public AuthenticationStrategy f47337n;

    /* renamed from: o, reason: collision with root package name */
    public CredentialsProvider f47338o;

    /* renamed from: p, reason: collision with root package name */
    public HttpRoutePlanner f47339p;

    /* renamed from: q, reason: collision with root package name */
    public UserTokenHandler f47340q;

    /* renamed from: r, reason: collision with root package name */
    public HttpParams f47341r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f47342s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    public b(q70.c cVar) {
        this.f47324a = org.apache.commons.logging.g.q(getClass());
        this.f47325b = cVar;
        this.f47326c = new ConcurrentLinkedQueue();
    }

    public HttpRoutePlanner A() {
        return new f70.g(I().getSchemeRegistry());
    }

    public AuthenticationStrategy B() {
        return new ProxyAuthenticationStrategy();
    }

    public AuthenticationStrategy C() {
        return new TargetAuthenticationStrategy();
    }

    public UserTokenHandler D() {
        return new DefaultUserTokenHandler();
    }

    public final HttpHost E(HttpUriRequest httpUriRequest) throws ClientProtocolException {
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

    public final void F() {
        try {
            try {
                this.f47325b.b(new b70.b(new s(this.f47324a, new w70.u()), O()));
                this.f47342s = true;
                while (!this.f47326c.isEmpty()) {
                    this.f47326c.remove().cancel();
                }
            } catch (Exception e11) {
                this.f47324a.error("I/O reactor terminated abnormally", e11);
                this.f47342s = true;
                while (!this.f47326c.isEmpty()) {
                    this.f47326c.remove().cancel();
                }
            }
        } catch (Throwable th2) {
            this.f47342s = true;
            while (!this.f47326c.isEmpty()) {
                this.f47326c.remove().cancel();
            }
            throw th2;
        }
    }

    public final synchronized AuthSchemeRegistry G() {
        try {
            if (this.f47335l == null) {
                this.f47335l = o();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47335l;
    }

    public final synchronized ConnectionKeepAliveStrategy H() {
        try {
            if (this.f47331h == null) {
                this.f47331h = p();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47331h;
    }

    public synchronized q70.c I() {
        return this.f47325b;
    }

    public final synchronized org.apache.http.a J() {
        try {
            if (this.f47330g == null) {
                this.f47330g = s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47330g;
    }

    public final synchronized CookieSpecRegistry K() {
        try {
            if (this.f47333j == null) {
                this.f47333j = t();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47333j;
    }

    public final synchronized CookieStore L() {
        try {
            if (this.f47334k == null) {
                this.f47334k = u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47334k;
    }

    public final synchronized CredentialsProvider M() {
        try {
            if (this.f47338o == null) {
                this.f47338o = v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47338o;
    }

    public final synchronized c80.b N() {
        try {
            if (this.f47328e == null) {
                this.f47328e = z();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47328e;
    }

    public final synchronized HttpParams O() {
        try {
            if (this.f47341r == null) {
                this.f47341r = y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47341r;
    }

    public final synchronized c80.j P() {
        try {
            if (this.f47329f == null) {
                c80.b N = N();
                int c11 = N.c();
                org.apache.http.q[] qVarArr = new org.apache.http.q[c11];
                for (int i11 = 0; i11 < c11; i11++) {
                    qVarArr[i11] = N.l(i11);
                }
                int d11 = N.d();
                org.apache.http.s[] sVarArr = new org.apache.http.s[d11];
                for (int i12 = 0; i12 < d11; i12++) {
                    sVarArr[i12] = N.i(i12);
                }
                this.f47329f = new c80.t(qVarArr, sVarArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47329f;
    }

    public final synchronized AuthenticationStrategy Q() {
        try {
            if (this.f47337n == null) {
                this.f47337n = B();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47337n;
    }

    public final synchronized RedirectStrategy R() {
        try {
            if (this.f47332i == null) {
                this.f47332i = new DefaultRedirectStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47332i;
    }

    public synchronized org.apache.http.q S(int i11) {
        return N().l(i11);
    }

    public synchronized int T() {
        return N().c();
    }

    public synchronized org.apache.http.s U(int i11) {
        return N().i(i11);
    }

    public synchronized int V() {
        return N().d();
    }

    public final synchronized HttpRoutePlanner W() {
        try {
            if (this.f47339p == null) {
                this.f47339p = A();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47339p;
    }

    public IOReactorStatus X() {
        return this.f47325b.getStatus();
    }

    public final synchronized AuthenticationStrategy Y() {
        try {
            if (this.f47336m == null) {
                this.f47336m = C();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47336m;
    }

    public final synchronized UserTokenHandler Z() {
        try {
            if (this.f47340q == null) {
                this.f47340q = D();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47340q;
    }

    @Override // n70.a
    public <T> Future<T> a(w70.z zVar, b0<T> b0Var, u60.b<T> bVar) {
        return j(zVar, b0Var, new c80.a(), bVar);
    }

    public synchronized void a0(Class<? extends org.apache.http.q> cls) {
        N().f(cls);
        this.f47329f = null;
    }

    public synchronized void b0(Class<? extends org.apache.http.s> cls) {
        N().b(cls);
        this.f47329f = null;
    }

    @Override // n70.a
    public Future<HttpResponse> c(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, u60.b<HttpResponse> bVar) {
        return j(o70.d.a(httpHost, httpRequest), o70.d.c(), httpContext, bVar);
    }

    public synchronized void c0(AuthSchemeRegistry authSchemeRegistry) {
        this.f47335l = authSchemeRegistry;
    }

    public synchronized void d(org.apache.http.q qVar) {
        N().p(qVar);
        this.f47329f = null;
    }

    public synchronized void d0(CookieSpecRegistry cookieSpecRegistry) {
        this.f47333j = cookieSpecRegistry;
    }

    @Override // n70.a
    public Future<HttpResponse> e(HttpUriRequest httpUriRequest, u60.b<HttpResponse> bVar) {
        return r(httpUriRequest, new c80.a(), bVar);
    }

    public synchronized void e0(CookieStore cookieStore) {
        this.f47334k = cookieStore;
    }

    public synchronized void f0(CredentialsProvider credentialsProvider) {
        this.f47338o = credentialsProvider;
    }

    public synchronized void g(org.apache.http.q qVar, int i11) {
        N().q(qVar, i11);
        this.f47329f = null;
    }

    public synchronized void g0(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f47331h = connectionKeepAliveStrategy;
    }

    public synchronized void h(org.apache.http.s sVar) {
        N().s(sVar);
        this.f47329f = null;
    }

    public synchronized void h0(HttpParams httpParams) {
        this.f47341r = httpParams;
    }

    public synchronized void i0(AuthenticationStrategy authenticationStrategy) {
        this.f47337n = authenticationStrategy;
    }

    @Override // n70.a
    public <T> Future<T> j(w70.z zVar, b0<T> b0Var, HttpContext httpContext, u60.b<T> bVar) {
        f fVar;
        if (this.f47342s) {
            throw new IllegalStateException("Client has been shut down");
        }
        u60.a aVar = new u60.a(bVar);
        j jVar = new j(aVar, this.f47326c);
        synchronized (this) {
            HttpContext x11 = x();
            fVar = new f(this.f47324a, zVar, b0Var, httpContext == null ? x11 : new c80.d(httpContext, x11), jVar, this.f47325b, P(), W(), J(), H(), R(), Y(), Q(), Z(), O());
        }
        this.f47326c.add(fVar);
        fVar.Z();
        return aVar;
    }

    public synchronized void j0(RedirectStrategy redirectStrategy) {
        this.f47332i = redirectStrategy;
    }

    public synchronized void k0(org.apache.http.a aVar) {
        this.f47330g = aVar;
    }

    public synchronized void l(org.apache.http.s sVar, int i11) {
        N().t(sVar, i11);
        this.f47329f = null;
    }

    public synchronized void l0(HttpRoutePlanner httpRoutePlanner) {
        this.f47339p = httpRoutePlanner;
    }

    public synchronized void m() {
        N().h();
        this.f47329f = null;
    }

    public synchronized void m0(AuthenticationStrategy authenticationStrategy) {
        this.f47336m = authenticationStrategy;
    }

    public synchronized void n() {
        N().j();
        this.f47329f = null;
    }

    public synchronized void n0(UserTokenHandler userTokenHandler) {
        this.f47340q = userTokenHandler;
    }

    public AuthSchemeRegistry o() {
        AuthSchemeRegistry authSchemeRegistry = new AuthSchemeRegistry();
        authSchemeRegistry.register(jx.a.f64686b, new BasicSchemeFactory());
        authSchemeRegistry.register(jx.a.f64687c, new DigestSchemeFactory());
        authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
        authSchemeRegistry.register(jx.a.f64688d, new SPNegoSchemeFactory());
        authSchemeRegistry.register("Kerberos", new KerberosSchemeFactory());
        return authSchemeRegistry;
    }

    public void o0() throws InterruptedException {
        try {
            this.f47325b.i(5000L);
        } catch (IOException e11) {
            this.f47324a.error("I/O error shutting down", e11);
        }
        Thread thread = this.f47327d;
        if (thread != null) {
            thread.join();
        }
    }

    public ConnectionKeepAliveStrategy p() {
        return new DefaultConnectionKeepAliveStrategy();
    }

    public synchronized void p0() {
        a aVar = new a();
        this.f47327d = aVar;
        aVar.start();
    }

    @Override // n70.a
    public Future<HttpResponse> r(HttpUriRequest httpUriRequest, HttpContext httpContext, u60.b<HttpResponse> bVar) {
        try {
            return c(E(httpUriRequest), httpUriRequest, httpContext, bVar);
        } catch (ClientProtocolException e11) {
            u60.a aVar = new u60.a(bVar);
            aVar.c(e11);
            return aVar;
        }
    }

    public org.apache.http.a s() {
        return new x60.i();
    }

    public CookieSpecRegistry t() {
        CookieSpecRegistry cookieSpecRegistry = new CookieSpecRegistry();
        cookieSpecRegistry.register("best-match", new BestMatchSpecFactory());
        cookieSpecRegistry.register("compatibility", new BrowserCompatSpecFactory());
        cookieSpecRegistry.register("netscape", new NetscapeDraftSpecFactory());
        cookieSpecRegistry.register("rfc2109", new RFC2109SpecFactory());
        cookieSpecRegistry.register("rfc2965", new RFC2965SpecFactory());
        cookieSpecRegistry.register("ignoreCookies", new IgnoreSpecFactory());
        return cookieSpecRegistry;
    }

    public CookieStore u() {
        return new BasicCookieStore();
    }

    public CredentialsProvider v() {
        return new BasicCredentialsProvider();
    }

    @Override // n70.a
    public Future<HttpResponse> w(HttpHost httpHost, HttpRequest httpRequest, u60.b<HttpResponse> bVar) {
        return c(httpHost, httpRequest, new c80.a(), bVar);
    }

    public HttpContext x() {
        c80.a aVar = new c80.a();
        aVar.b("http.scheme-registry", I().getSchemeRegistry());
        aVar.b("http.authscheme-registry", G());
        aVar.b("http.cookiespec-registry", K());
        aVar.b("http.cookie-store", L());
        aVar.b("http.auth.credentials-provider", M());
        return aVar;
    }

    public abstract HttpParams y();

    public abstract c80.b z();

    public b(h70.i iVar) throws IOReactorException {
        Log q11 = org.apache.commons.logging.g.q(getClass());
        this.f47324a = q11;
        h70.f fVar = new h70.f(iVar);
        fVar.u(new r(q11));
        this.f47325b = new f70.o(fVar);
        this.f47326c = new ConcurrentLinkedQueue();
    }
}
