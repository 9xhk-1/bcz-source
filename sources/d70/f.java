package d70;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.client.ClientParamsStack;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.HttpAuthenticator;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.client.RoutedRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class f<T> implements w70.t<T> {
    public static final AtomicLong J = new AtomicLong(1);
    public ClientParamsStack A;
    public RequestWrapper B;
    public HttpResponse C;
    public boolean D;
    public int E;
    public ByteBuffer F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: a, reason: collision with root package name */
    public final Log f47355a;

    /* renamed from: b, reason: collision with root package name */
    public final w70.z f47356b;

    /* renamed from: c, reason: collision with root package name */
    public final b0<T> f47357c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpContext f47358d;

    /* renamed from: e, reason: collision with root package name */
    public final a0<T> f47359e;

    /* renamed from: f, reason: collision with root package name */
    public final q70.c f47360f;

    /* renamed from: g, reason: collision with root package name */
    public final c80.j f47361g;

    /* renamed from: h, reason: collision with root package name */
    public final HttpRoutePlanner f47362h;

    /* renamed from: j, reason: collision with root package name */
    public final org.apache.http.a f47364j;

    /* renamed from: k, reason: collision with root package name */
    public final ConnectionKeepAliveStrategy f47365k;

    /* renamed from: l, reason: collision with root package name */
    public final RedirectStrategy f47366l;

    /* renamed from: m, reason: collision with root package name */
    public final AuthenticationStrategy f47367m;

    /* renamed from: n, reason: collision with root package name */
    public final AuthenticationStrategy f47368n;

    /* renamed from: o, reason: collision with root package name */
    public final UserTokenHandler f47369o;

    /* renamed from: r, reason: collision with root package name */
    public final HttpAuthenticator f47372r;

    /* renamed from: s, reason: collision with root package name */
    public final HttpParams f47373s;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f47375u;

    /* renamed from: v, reason: collision with root package name */
    public volatile f<T>.b f47376v;

    /* renamed from: w, reason: collision with root package name */
    public volatile q70.d f47377w;

    /* renamed from: x, reason: collision with root package name */
    public RoutedRequest f47378x;

    /* renamed from: y, reason: collision with root package name */
    public RoutedRequest f47379y;

    /* renamed from: z, reason: collision with root package name */
    public HttpResponse f47380z;

    /* renamed from: i, reason: collision with root package name */
    public final HttpRouteDirector f47363i = new BasicRouteDirector();

    /* renamed from: p, reason: collision with root package name */
    public final AuthState f47370p = new AuthState();

    /* renamed from: q, reason: collision with root package name */
    public final AuthState f47371q = new AuthState();

    /* renamed from: t, reason: collision with root package name */
    public final long f47374t = J.getAndIncrement();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements u60.b<q70.d> {
        public b() {
        }

        @Override // u60.b
        public void a() {
            f.this.f();
        }

        @Override // u60.b
        public void b(Exception exc) {
            f.this.j(exc);
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(q70.d dVar) {
            f.this.i(dVar);
        }
    }

    public f(Log log, w70.z zVar, b0<T> b0Var, HttpContext httpContext, a0<T> a0Var, q70.c cVar, c80.j jVar, HttpRoutePlanner httpRoutePlanner, org.apache.http.a aVar, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        this.f47355a = log;
        this.f47356b = zVar;
        this.f47357c = b0Var;
        this.f47358d = httpContext;
        this.f47359e = a0Var;
        this.f47360f = cVar;
        this.f47361g = jVar;
        this.f47362h = httpRoutePlanner;
        this.f47364j = aVar;
        this.f47365k = connectionKeepAliveStrategy;
        this.f47366l = redirectStrategy;
        this.f47367m = authenticationStrategy;
        this.f47368n = authenticationStrategy2;
        this.f47369o = userTokenHandler;
        this.f47372r = new HttpAuthenticator(log);
        this.f47373s = httpParams;
    }

    private void S() {
        if (this.f47377w != null) {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] releasing connection " + this.f47377w);
            }
            try {
                this.f47377w.getContext().removeAttribute(w70.u.f95682d);
                this.f47377w.releaseConnection();
            } catch (IOException e11) {
                this.f47355a.debug("I/O error releasing connection", e11);
            }
            this.f47377w = null;
        }
    }

    private void U() {
        HttpRoute route = this.f47378x.getRoute();
        if (this.f47355a.isDebugEnabled()) {
            this.f47355a.debug("[exchange: " + this.f47374t + "] Request connection for " + route);
        }
        long a11 = a80.g.a(this.A);
        Object attribute = this.f47358d.getAttribute("http.user-token");
        this.f47376v = new b();
        this.f47360f.p(route, attribute, a11, TimeUnit.MILLISECONDS, this.f47376v);
    }

    @Override // w70.b0
    public synchronized void B(HttpResponse httpResponse) throws IOException, HttpException {
        try {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] Response received " + httpResponse.n());
            }
            this.C = httpResponse;
            httpResponse.i(this.A);
            int statusCode = this.C.n().getStatusCode();
            if (this.D) {
                RoutedRequest I = I();
                this.f47379y = I;
                if (I == null) {
                    this.f47380z = httpResponse;
                }
                Object attribute = this.f47358d.getAttribute("http.user-token");
                if (this.f47377w != null) {
                    if (attribute == null) {
                        attribute = this.f47369o.getUserToken(this.f47358d);
                        this.f47358d.b("http.user-token", attribute);
                    }
                    if (attribute != null) {
                        this.f47377w.setState(attribute);
                    }
                }
            } else if (this.B.getMethod().equalsIgnoreCase("CONNECT") && statusCode == 200) {
                this.f47377w.Y(this.A);
            } else {
                RoutedRequest C = C();
                this.f47379y = C;
                if (C == null) {
                    this.f47380z = httpResponse;
                }
            }
            if (this.f47380z != null) {
                this.f47357c.B(httpResponse);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final RoutedRequest C() {
        CredentialsProvider credentialsProvider;
        RoutedRequest E;
        if (!HttpClientParams.isAuthenticating(this.A) || (credentialsProvider = (CredentialsProvider) this.f47358d.getAttribute("http.auth.credentials-provider")) == null || (E = E(credentialsProvider)) == null) {
            return null;
        }
        return E;
    }

    public final RoutedRequest E(CredentialsProvider credentialsProvider) {
        HttpHost proxyHost = this.f47378x.getRoute().getProxyHost();
        if (this.f47372r.isAuthenticationRequested(proxyHost, this.C, this.f47368n, this.f47371q, this.f47358d) && this.f47372r.authenticate(proxyHost, this.C, this.f47368n, this.f47371q, this.f47358d)) {
            return this.f47378x;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0001, B:5:0x000c, B:6:0x0018, B:21:0x001b, B:22:0x0036, B:7:0x003a, B:25:0x0044, B:26:0x004b, B:8:0x004c, B:10:0x0054, B:11:0x0071, B:12:0x0081, B:14:0x0085, B:28:0x008a, B:29:0x00a8, B:30:0x00a9, B:32:0x00b5, B:33:0x00b9, B:35:0x00df, B:37:0x00f1, B:38:0x0100, B:39:0x0105, B:41:0x0117, B:43:0x011f, B:46:0x0124, B:47:0x012b, B:48:0x012c, B:50:0x0139, B:51:0x0160), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[SYNTHETIC] */
    @Override // w70.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized org.apache.http.HttpRequest G() throws java.io.IOException, org.apache.http.HttpException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d70.f.G():org.apache.http.HttpRequest");
    }

    public final RoutedRequest H() throws HttpException {
        if (!this.f47366l.isRedirected(this.B, this.C, this.f47358d)) {
            return null;
        }
        HttpRoute route = this.f47378x.getRoute();
        RequestWrapper request = this.f47378x.getRequest();
        int intParameter = this.A.getIntParameter("http.protocol.max-redirects", 100);
        int i11 = this.E;
        if (i11 >= intParameter) {
            throw new RedirectException("Maximum redirects (" + intParameter + ") exceeded");
        }
        this.E = i11 + 1;
        HttpUriRequest redirect = this.f47366l.getRedirect(this.B, this.C, this.f47358d);
        redirect.setHeaders(request.getOriginal().x());
        URI uri = redirect.getURI();
        if (uri.getHost() == null) {
            throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
        }
        HttpHost httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        if (!route.getTargetHost().equals(httpHost)) {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] Resetting target auth state");
            }
            this.f47370p.reset();
            AuthScheme authScheme = this.f47371q.getAuthScheme();
            if (authScheme != null && authScheme.isConnectionBased()) {
                if (this.f47355a.isDebugEnabled()) {
                    this.f47355a.debug("[exchange: " + this.f47374t + "] Resetting proxy auth state");
                }
                this.f47371q.reset();
            }
        }
        RequestWrapper a02 = a0(redirect);
        a02.setParams(this.A);
        HttpRoute q11 = q(httpHost, a02, this.f47358d);
        if (this.f47355a.isDebugEnabled()) {
            this.f47355a.debug("[exchange: " + this.f47374t + "] Redirecting to '" + uri + "' via " + q11);
        }
        return new RoutedRequest(a02, q11);
    }

    public final RoutedRequest I() throws HttpException {
        RoutedRequest H;
        CredentialsProvider credentialsProvider;
        if (HttpClientParams.isAuthenticating(this.A) && (credentialsProvider = (CredentialsProvider) this.f47358d.getAttribute("http.auth.credentials-provider")) != null) {
            RoutedRequest L = L(credentialsProvider);
            if (L != null) {
                return L;
            }
            RoutedRequest E = E(credentialsProvider);
            if (E != null) {
                return E;
            }
        }
        if (!HttpClientParams.isRedirecting(this.A) || (H = H()) == null) {
            return null;
        }
        return H;
    }

    public final RoutedRequest L(CredentialsProvider credentialsProvider) {
        HttpRoute route = this.f47378x.getRoute();
        HttpHost httpHost = (HttpHost) this.f47358d.getAttribute("http.target_host");
        if (httpHost == null) {
            httpHost = route.getTargetHost();
        }
        HttpHost httpHost2 = httpHost;
        if (this.f47372r.isAuthenticationRequested(httpHost2, this.C, this.f47367m, this.f47370p, this.f47358d) && this.f47372r.authenticate(httpHost2, this.C, this.f47367m, this.f47370p, this.f47358d)) {
            return this.f47378x;
        }
        return null;
    }

    @Override // w70.t
    public c80.j P4() {
        return this.f47361g;
    }

    public void V(RequestWrapper requestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = requestWrapper.getURI();
            if (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) {
                if (uri.isAbsolute()) {
                    requestWrapper.setURI(URIUtils.rewriteURI(uri, null));
                }
            } else {
                if (uri.isAbsolute()) {
                    return;
                }
                requestWrapper.setURI(URIUtils.rewriteURI(uri, httpRoute.getTargetHost()));
            }
        } catch (URISyntaxException e11) {
            throw new ProtocolException("Invalid URI: " + requestWrapper.getRequestLine().getUri(), e11);
        }
    }

    public synchronized void Z() {
        try {
            try {
                if (this.f47355a.isDebugEnabled()) {
                    this.f47355a.debug("[exchange: " + this.f47374t + "] start execution");
                }
                this.f47358d.b("http.auth.target-scope", this.f47370p);
                this.f47358d.b("http.auth.proxy-scope", this.f47371q);
                HttpHost target = this.f47356b.getTarget();
                HttpRequest G = this.f47356b.G();
                if (G instanceof AbortableHttpRequest) {
                    ((AbortableHttpRequest) G).setReleaseTrigger(new a());
                }
                this.A = new ClientParamsStack(null, this.f47373s, G.getParams(), null);
                RequestWrapper a02 = a0(G);
                a02.setParams(this.A);
                this.f47378x = new RoutedRequest(a02, q(target, a02, this.f47358d));
                this.f47358d.b("http.request-config", y.a(this.A));
                this.G = false;
                U();
            } catch (Exception e11) {
                b(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final RequestWrapper a0(HttpRequest httpRequest) throws ProtocolException {
        return httpRequest instanceof org.apache.http.l ? new EntityEnclosingRequestWrapper((org.apache.http.l) httpRequest) : new RequestWrapper(httpRequest);
    }

    @Override // w70.z, w70.b0
    public synchronized void b(Exception exc) {
        try {
            if (!this.H) {
                this.f47356b.b(exc);
            }
            this.f47357c.b(exc);
            try {
                this.f47359e.b(exc, this);
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f47359e.b(exc, this);
                throw th2;
            } finally {
            }
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public synchronized boolean cancel() {
        boolean cancel;
        if (this.f47355a.isDebugEnabled()) {
            this.f47355a.debug("[exchange: " + this.f47374t + "] Cancelled");
        }
        try {
            try {
                cancel = this.f47357c.cancel();
                T result = this.f47357c.getResult();
                Exception m11 = this.f47357c.m();
                if (m11 != null) {
                    this.f47359e.b(m11, this);
                } else if (result != null) {
                    this.f47359e.c(result, this);
                } else {
                    this.f47359e.a(this);
                }
                close();
            } catch (RuntimeException e11) {
                this.f47359e.b(e11, this);
                throw e11;
            }
        } catch (Throwable th2) {
            close();
            throw th2;
        }
        return cancel;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f47375u) {
            return;
        }
        this.f47375u = true;
        q70.d dVar = this.f47377w;
        if (dVar != null) {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] aborting connection " + dVar);
            }
            try {
                dVar.abortConnection();
            } catch (IOException e11) {
                this.f47355a.debug("I/O error releasing connection", e11);
            }
        }
        try {
            this.f47356b.close();
        } catch (IOException e12) {
            this.f47355a.debug("I/O error closing request producer", e12);
        }
        try {
            this.f47357c.close();
        } catch (IOException e13) {
            this.f47355a.debug("I/O error closing response consumer", e13);
        }
    }

    @Override // w70.z
    public synchronized void d(m70.c cVar, m70.g gVar) throws IOException {
        try {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] produce content");
            }
            this.G = true;
            this.f47356b.d(cVar, gVar);
            if (cVar.e()) {
                this.f47356b.g0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f() {
        try {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] Connection request cancelled");
            }
            this.f47376v = null;
            try {
                this.f47359e.a(this);
            } finally {
                close();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // w70.z
    public void g0() throws IOException {
        this.H = false;
        this.f47356b.g0();
    }

    @Override // w70.t
    public HttpContext getContext() {
        return this.f47358d;
    }

    @Override // w70.b0
    public T getResult() {
        return this.f47357c.getResult();
    }

    @Override // w70.z
    public HttpHost getTarget() {
        return this.f47356b.getTarget();
    }

    @Override // w70.b0
    public synchronized void h(m70.a aVar, m70.g gVar) throws IOException {
        try {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] Consume content");
            }
            if (this.f47380z != null) {
                this.f47357c.h(aVar, gVar);
            } else {
                if (this.F == null) {
                    this.F = ByteBuffer.allocate(2048);
                }
                this.F.clear();
                aVar.read(this.F);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(q70.d dVar) {
        try {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] Connection allocated: " + dVar);
            }
            this.f47376v = null;
            try {
                try {
                    this.f47377w = dVar;
                } catch (RuntimeException e11) {
                    b(e11);
                    throw e11;
                }
            } catch (IOException e12) {
                b(e12);
            }
            if (this.f47375u) {
                dVar.releaseConnection();
                return;
            }
            HttpRoute route = this.f47378x.getRoute();
            if (!dVar.isOpen()) {
                dVar.open(route, this.f47358d, this.A);
            }
            dVar.getContext().b(w70.u.f95682d, this);
            dVar.f();
            this.D = route.equals(dVar.getRoute());
            if (!dVar.isOpen()) {
                throw new ConnectionClosedException("Connection closed");
            }
        } finally {
        }
    }

    @Override // w70.b0
    public boolean isDone() {
        return this.f47359e.isDone();
    }

    public final synchronized void j(Exception exc) {
        try {
            if (this.f47355a.isDebugEnabled()) {
                this.f47355a.debug("[exchange: " + this.f47374t + "] connection request failed");
            }
            this.f47376v = null;
            try {
                this.f47359e.b(exc, this);
            } finally {
                close();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final HttpRequest k(HttpRoute httpRoute) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = w(this.f47358d).b(targetHost.getSchemeName()).a();
        }
        StringBuilder sb2 = new StringBuilder(hostName.length() + 6);
        sb2.append(hostName);
        sb2.append(':');
        sb2.append(Integer.toString(port));
        return new l70.h("CONNECT", sb2.toString(), a80.k.f(this.A));
    }

    @Override // w70.t
    public org.apache.http.a k7() {
        return this.f47364j;
    }

    @Override // w70.b0
    public Exception m() {
        return this.f47357c.m();
    }

    @Override // w70.z
    public boolean n() {
        return this.f47356b.n();
    }

    @Override // w70.b0
    public synchronized void p(HttpContext httpContext) {
        String str;
        if (this.f47355a.isDebugEnabled()) {
            this.f47355a.debug("[exchange: " + this.f47374t + "] Response fully read");
        }
        try {
            if (this.f47359e.isDone()) {
                return;
            }
            if (this.f47377w.isOpen()) {
                long keepAliveDuration = this.f47365k.getKeepAliveDuration(this.C, this.f47358d);
                if (this.f47355a.isDebugEnabled()) {
                    if (keepAliveDuration > 0) {
                        str = "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS;
                    } else {
                        str = "indefinitely";
                    }
                    this.f47355a.debug("[exchange: " + this.f47374t + "] Connection can be kept alive " + str);
                }
                this.f47377w.setIdleDuration(keepAliveDuration, TimeUnit.MILLISECONDS);
            } else {
                if (this.f47355a.isDebugEnabled()) {
                    this.f47355a.debug("[exchange: " + this.f47374t + "] Connection cannot be kept alive");
                }
                this.f47377w.unmarkReusable();
                if (this.f47371q.getState() == AuthProtocolState.SUCCESS && this.f47371q.getAuthScheme() != null && this.f47371q.getAuthScheme().isConnectionBased()) {
                    if (this.f47355a.isDebugEnabled()) {
                        this.f47355a.debug("[exchange: " + this.f47374t + "] Resetting proxy auth state");
                    }
                    this.f47371q.reset();
                }
                if (this.f47370p.getState() == AuthProtocolState.SUCCESS && this.f47370p.getAuthScheme() != null && this.f47370p.getAuthScheme().isConnectionBased()) {
                    if (this.f47355a.isDebugEnabled()) {
                        this.f47355a.debug("[exchange: " + this.f47374t + "] Resetting target auth state");
                    }
                    this.f47370p.reset();
                }
            }
            if (this.f47380z != null) {
                this.f47357c.p(this.f47358d);
                if (this.f47355a.isDebugEnabled()) {
                    this.f47355a.debug("[exchange: " + this.f47374t + "] Response processed");
                }
                S();
                T result = this.f47357c.getResult();
                Exception m11 = this.f47357c.m();
                if (m11 == null) {
                    this.f47359e.c(result, this);
                } else {
                    this.f47359e.b(m11, this);
                }
            } else {
                if (this.f47379y != null) {
                    if (!this.f47378x.getRoute().equals(this.f47379y.getRoute())) {
                        S();
                    }
                    this.f47378x = this.f47379y;
                }
                if (this.f47377w != null && !this.f47377w.isOpen()) {
                    S();
                }
                if (this.f47377w != null) {
                    this.f47377w.f();
                } else {
                    U();
                }
            }
            this.f47379y = null;
            this.B = null;
            this.C = null;
        } catch (RuntimeException e11) {
            b(e11);
            throw e11;
        }
    }

    public HttpRoute q(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter("http.default-host");
        }
        if (httpHost != null) {
            return this.f47362h.determineRoute(httpHost, httpRequest, httpContext);
        }
        throw new IllegalStateException("Target host could not be resolved");
    }

    public synchronized void r() {
        try {
            if (this.f47377w != null) {
                if (this.f47355a.isDebugEnabled()) {
                    this.f47355a.debug("[exchange: " + this.f47374t + "] Unexpected end of data stream");
                }
                S();
                if (this.f47376v == null) {
                    U();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // w70.z
    public void s(HttpContext httpContext) {
        if (this.f47355a.isDebugEnabled()) {
            this.f47355a.debug("[exchange: " + this.f47374t + "] Request completed");
        }
        this.H = true;
        this.f47356b.s(httpContext);
    }

    public final r70.b w(HttpContext httpContext) {
        r70.b bVar = (r70.b) httpContext.getAttribute("http.scheme-registry");
        return bVar == null ? this.f47360f.getSchemeRegistry() : bVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ConnectionReleaseTrigger {
        public a() {
        }

        @Override // org.apache.http.conn.ConnectionReleaseTrigger
        public void abortConnection() throws IOException {
            f.this.cancel();
        }

        @Override // org.apache.http.conn.ConnectionReleaseTrigger
        public void releaseConnection() throws IOException {
        }
    }
}
