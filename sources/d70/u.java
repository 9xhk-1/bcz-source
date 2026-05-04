package d70;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Log f47445a;

    /* renamed from: b, reason: collision with root package name */
    public final c80.j f47446b;

    /* renamed from: c, reason: collision with root package name */
    public final c80.j f47447c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpRoutePlanner f47448d;

    /* renamed from: e, reason: collision with root package name */
    public final AuthenticationStrategy f47449e;

    /* renamed from: f, reason: collision with root package name */
    public final AuthenticationStrategy f47450f;

    /* renamed from: g, reason: collision with root package name */
    public final UserTokenHandler f47451g;

    /* renamed from: h, reason: collision with root package name */
    public final RedirectStrategy f47452h;

    /* renamed from: i, reason: collision with root package name */
    public final HttpRouteDirector f47453i;

    /* renamed from: j, reason: collision with root package name */
    public final HttpAuthenticator f47454j;

    public u(c80.j jVar, HttpRoutePlanner httpRoutePlanner, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        Log q11 = org.apache.commons.logging.g.q(getClass());
        this.f47445a = q11;
        this.f47446b = jVar;
        this.f47447c = new c80.t(new c80.y(), new RequestClientConnControl());
        this.f47448d = httpRoutePlanner;
        this.f47452h = redirectStrategy;
        this.f47449e = authenticationStrategy;
        this.f47450f = authenticationStrategy2;
        this.f47451g = userTokenHandler;
        this.f47453i = new BasicRouteDirector();
        this.f47454j = new HttpAuthenticator(q11);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[LOOP:0: B:3:0x000f->B:9:?, LOOP_END, SYNTHETIC] */
    @Override // d70.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.http.HttpRequest a(d70.t r12, d70.a r13) throws java.io.IOException, org.apache.http.HttpException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d70.u.a(d70.t, d70.a):org.apache.http.HttpRequest");
    }

    @Override // d70.o
    public void b(t tVar, a aVar) {
        if (this.f47445a.isDebugEnabled()) {
            this.f47445a.debug("[exchange: " + tVar.c() + "] Request completed");
        }
        tVar.h().s(tVar.d());
    }

    @Override // d70.o
    public void c(HttpHost httpHost, HttpRequest httpRequest, t tVar, a aVar) throws HttpException, IOException {
        RequestConfig config;
        if (this.f47445a.isDebugEnabled()) {
            this.f47445a.debug("[exchange: " + tVar.c() + "] start execution");
        }
        HttpContext d11 = tVar.d();
        if ((httpRequest instanceof Configurable) && (config = ((Configurable) httpRequest).getConfig()) != null) {
            d11.setRequestConfig(config);
        }
        List redirectLocations = d11.getRedirectLocations();
        if (redirectLocations != null) {
            redirectLocations.clear();
        }
        HttpRequest wrap = HttpRequestWrapper.wrap(httpRequest);
        aVar.w0(this.f47448d.determineRoute(httpHost, wrap, d11));
        tVar.o(wrap);
        aVar.s0(wrap);
        l(tVar, aVar);
    }

    @Override // d70.o
    public void d(t tVar, m70.a aVar, m70.g gVar) throws IOException {
        if (this.f47445a.isDebugEnabled()) {
            this.f47445a.debug("[exchange: " + tVar.c() + "] Consume content");
        }
        if (tVar.b() != null) {
            tVar.i().h(aVar, gVar);
            return;
        }
        ByteBuffer j11 = tVar.j();
        j11.clear();
        aVar.read(j11);
    }

    @Override // d70.o
    public void e(t tVar, m70.c cVar, m70.g gVar) throws IOException {
        if (this.f47445a.isDebugEnabled()) {
            this.f47445a.debug("[exchange: " + tVar.c() + "] produce content");
        }
        w70.z h11 = tVar.h();
        tVar.q();
        h11.d(cVar, gVar);
        if (cVar.e()) {
            h11.g0();
        }
    }

    @Override // d70.o
    public void f(HttpResponse httpResponse, t tVar, a aVar) throws IOException, HttpException {
        if (this.f47445a.isDebugEnabled()) {
            this.f47445a.debug("[exchange: " + tVar.c() + "] Response received " + httpResponse.n());
        }
        HttpContext d11 = tVar.d();
        d11.setAttribute("http.response", httpResponse);
        this.f47446b.g(httpResponse, d11);
        aVar.v0(httpResponse);
        if (!aVar.U()) {
            int statusCode = httpResponse.n().getStatusCode();
            if (statusCode < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponse.n());
            }
            if (statusCode == 200) {
                aVar.h0();
                aVar.s0(null);
            } else if (!i(tVar, aVar)) {
                tVar.n(httpResponse);
            }
        } else if (!j(tVar, aVar)) {
            tVar.n(httpResponse);
        }
        if (tVar.b() != null) {
            tVar.i().B(httpResponse);
        }
    }

    @Override // d70.o
    public void g(t tVar, a aVar) throws IOException, HttpException {
        HttpContext d11 = tVar.d();
        HttpResponse I = aVar.I();
        if (!aVar.U() && I.n().getStatusCode() == 200) {
            aVar.v0(null);
            return;
        }
        if (!aVar.V()) {
            aVar.k0();
            AuthState proxyAuthState = d11.getProxyAuthState();
            if (proxyAuthState.getState() == AuthProtocolState.SUCCESS && proxyAuthState.getAuthScheme() != null && proxyAuthState.getAuthScheme().isConnectionBased()) {
                if (this.f47445a.isDebugEnabled()) {
                    this.f47445a.debug("[exchange: " + tVar.c() + "] Resetting proxy auth state");
                }
                proxyAuthState.reset();
            }
            AuthState targetAuthState = d11.getTargetAuthState();
            if (targetAuthState.getState() == AuthProtocolState.SUCCESS && targetAuthState.getAuthScheme() != null && targetAuthState.getAuthScheme().isConnectionBased()) {
                if (this.f47445a.isDebugEnabled()) {
                    this.f47445a.debug("[exchange: " + tVar.c() + "] Resetting target auth state");
                }
                targetAuthState.reset();
            }
        }
        if (d11.getUserToken() == null) {
            d11.setAttribute("http.user-token", this.f47451g.getUserToken(d11));
        }
        if (tVar.b() != null) {
            tVar.i().p(d11);
            if (this.f47445a.isDebugEnabled()) {
                this.f47445a.debug("[exchange: " + tVar.c() + "] Response processed");
            }
            aVar.k0();
        } else if (tVar.f() != null) {
            HttpUriRequest f11 = tVar.f();
            URI uri = f11.getURI();
            if (this.f47445a.isDebugEnabled()) {
                this.f47445a.debug("[exchange: " + tVar.c() + "] Redirecting to '" + uri + "'");
            }
            tVar.p(null);
            HttpHost extractHost = URIUtils.extractHost(uri);
            if (extractHost == null) {
                throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
            }
            HttpRoute route = aVar.getRoute();
            if (!route.getTargetHost().equals(extractHost)) {
                AuthState targetAuthState2 = d11.getTargetAuthState();
                if (this.f47445a.isDebugEnabled()) {
                    this.f47445a.debug("[exchange: " + tVar.c() + "] Resetting target auth state");
                }
                targetAuthState2.reset();
                AuthState proxyAuthState2 = d11.getProxyAuthState();
                AuthScheme authScheme = proxyAuthState2.getAuthScheme();
                if (authScheme != null && authScheme.isConnectionBased()) {
                    if (this.f47445a.isDebugEnabled()) {
                        this.f47445a.debug("[exchange: " + tVar.c() + "] Resetting proxy auth state");
                    }
                    proxyAuthState2.reset();
                }
            }
            if (!f11.headerIterator().hasNext()) {
                f11.setHeaders(tVar.e().getOriginal().x());
            }
            HttpRequest wrap = HttpRequestWrapper.wrap(f11);
            HttpRoute determineRoute = this.f47448d.determineRoute(extractHost, wrap, d11);
            if (!route.equals(determineRoute)) {
                aVar.k0();
            }
            aVar.w0(determineRoute);
            aVar.s0(wrap);
            tVar.o(wrap);
            l(tVar, aVar);
        }
        aVar.v0(null);
    }

    public final HttpRequest h(HttpRoute httpRoute, t tVar) throws IOException, HttpException {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        StringBuilder sb2 = new StringBuilder(hostName.length() + 6);
        sb2.append(hostName);
        sb2.append(':');
        sb2.append(Integer.toString(port));
        l70.h hVar = new l70.h("CONNECT", sb2.toString(), HttpVersion.HTTP_1_1);
        this.f47447c.process(hVar, tVar.d());
        return hVar;
    }

    public final boolean i(t tVar, a aVar) {
        HttpClientContext d11 = tVar.d();
        if (!d11.getRequestConfig().isAuthenticationEnabled() || d11.getCredentialsProvider() == null) {
            return false;
        }
        HttpHost proxyHost = aVar.getRoute().getProxyHost();
        HttpResponse I = aVar.I();
        AuthState proxyAuthState = d11.getProxyAuthState();
        if (this.f47454j.isAuthenticationRequested(proxyHost, I, this.f47450f, proxyAuthState, d11)) {
            return this.f47454j.handleAuthChallenge(proxyHost, I, this.f47450f, proxyAuthState, d11);
        }
        return false;
    }

    public final boolean j(t tVar, a aVar) throws HttpException {
        HttpClientContext d11 = tVar.d();
        RequestConfig requestConfig = d11.getRequestConfig();
        if (requestConfig.isAuthenticationEnabled() && k(tVar, aVar)) {
            HttpRequestWrapper H = aVar.H();
            HttpRequest original = H.getOriginal();
            if (!original.f("Authorization")) {
                H.removeHeaders("Authorization");
            }
            if (!original.f("Proxy-Authorization")) {
                H.removeHeaders("Proxy-Authorization");
            }
            return true;
        }
        if (!requestConfig.isRedirectsEnabled()) {
            return false;
        }
        HttpRequestWrapper H2 = aVar.H();
        HttpResponse I = aVar.I();
        if (!this.f47452h.isRedirected(H2, I, d11)) {
            return false;
        }
        int maxRedirects = requestConfig.getMaxRedirects() >= 0 ? requestConfig.getMaxRedirects() : 100;
        if (tVar.g() < maxRedirects) {
            tVar.l();
            tVar.p(this.f47452h.getRedirect(H2.getOriginal(), I, d11));
            return true;
        }
        throw new RedirectException("Maximum redirects (" + maxRedirects + ") exceeded");
    }

    public final boolean k(t tVar, a aVar) {
        HttpClientContext d11 = tVar.d();
        if (d11.getCredentialsProvider() == null) {
            return false;
        }
        HttpRoute route = aVar.getRoute();
        HttpResponse I = aVar.I();
        HttpHost targetHost = d11.getTargetHost();
        if (targetHost == null) {
            targetHost = route.getTargetHost();
        }
        HttpHost httpHost = targetHost.getPort() < 0 ? new HttpHost(targetHost.getHostName(), route.getTargetHost().getPort(), targetHost.getSchemeName()) : targetHost;
        AuthState targetAuthState = d11.getTargetAuthState();
        AuthState proxyAuthState = d11.getProxyAuthState();
        boolean isAuthenticationRequested = this.f47454j.isAuthenticationRequested(httpHost, I, this.f47449e, targetAuthState, d11);
        HttpHost httpHost2 = httpHost;
        HttpHost proxyHost = route.getProxyHost();
        if (proxyHost == null) {
            proxyHost = route.getTargetHost();
        }
        HttpHost httpHost3 = proxyHost;
        boolean isAuthenticationRequested2 = this.f47454j.isAuthenticationRequested(httpHost3, I, this.f47450f, proxyAuthState, d11);
        if (isAuthenticationRequested) {
            return this.f47454j.handleAuthChallenge(httpHost2, I, this.f47449e, targetAuthState, d11);
        }
        if (isAuthenticationRequested2) {
            return this.f47454j.handleAuthChallenge(httpHost3, I, this.f47450f, proxyAuthState, d11);
        }
        return false;
    }

    public final void l(t tVar, a aVar) throws IOException, HttpException {
        URI uri;
        String userInfo;
        HttpContext d11 = tVar.d();
        HttpRequest H = aVar.H();
        HttpRoute route = aVar.getRoute();
        HttpRequest original = H.getOriginal();
        HttpHost httpHost = null;
        if (original instanceof HttpUriRequest) {
            uri = ((HttpUriRequest) original).getURI();
        } else {
            String uri2 = original.getRequestLine().getUri();
            try {
                uri = URI.create(uri2);
            } catch (IllegalArgumentException e11) {
                if (this.f47445a.isDebugEnabled()) {
                    this.f47445a.debug("[exchange: " + tVar.c() + "] Unable to parse '" + uri2 + "' as a valid URI; request URI and Host header may be inconsistent", e11);
                }
                uri = null;
            }
        }
        H.setURI(uri);
        m(H, route);
        if (uri != null && uri.isAbsolute() && uri.getHost() != null) {
            httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        if (httpHost == null) {
            httpHost = route.getTargetHost();
        }
        if (uri != null && (userInfo = uri.getUserInfo()) != null) {
            d11.getCredentialsProvider().setCredentials(new AuthScope(httpHost), new UsernamePasswordCredentials(userInfo));
        }
        d11.setAttribute("http.request", H);
        d11.setAttribute("http.target_host", httpHost);
        d11.setAttribute("http.route", route);
        this.f47446b.process(H, d11);
    }

    public final void m(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = httpRequestWrapper.getURI();
            if (uri != null) {
                httpRequestWrapper.setURI((httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) ? uri.isAbsolute() ? URIUtils.rewriteURI(uri, null, true) : URIUtils.rewriteURI(uri) : !uri.isAbsolute() ? URIUtils.rewriteURI(uri, httpRoute.getTargetHost(), true) : URIUtils.rewriteURI(uri));
            }
        } catch (URISyntaxException e11) {
            throw new ProtocolException("Invalid URI: " + httpRequestWrapper.getRequestLine().getUri(), e11);
        }
    }
}
