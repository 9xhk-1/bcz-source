package d70;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.logging.Log;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a implements w70.p {

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicLong f47306q = new AtomicLong(1);

    /* renamed from: a, reason: collision with root package name */
    public final Log f47307a;

    /* renamed from: c, reason: collision with root package name */
    public final HttpClientContext f47309c;

    /* renamed from: d, reason: collision with root package name */
    public final q70.f f47310d;

    /* renamed from: e, reason: collision with root package name */
    public final org.apache.http.a f47311e;

    /* renamed from: f, reason: collision with root package name */
    public final ConnectionKeepAliveStrategy f47312f;

    /* renamed from: b, reason: collision with root package name */
    public final long f47308b = f47306q.getAndIncrement();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference<Future<m70.h>> f47313g = new AtomicReference<>(null);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<m70.h> f47314h = new AtomicReference<>(null);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference<HttpRoute> f47315i = new AtomicReference<>(null);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference<RouteTracker> f47316j = new AtomicReference<>(null);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f47317k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference<Long> f47318l = new AtomicReference<>(null);

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference<HttpRequestWrapper> f47319m = new AtomicReference<>(null);

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference<HttpResponse> f47320n = new AtomicReference<>(null);

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f47321o = new AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f47322p = new AtomicBoolean(false);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: d70.a$a, reason: collision with other inner class name */
    public class C0551a implements u60.b<m70.h> {
        public C0551a() {
        }

        @Override // u60.b
        public void a() {
            a.this.j();
        }

        @Override // u60.b
        public void b(Exception exc) {
            a.this.k(exc);
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(m70.h hVar) {
            a.this.f(hVar);
        }
    }

    public a(Log log, HttpClientContext httpClientContext, q70.f fVar, org.apache.http.a aVar, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f47307a = log;
        this.f47309c = httpClientContext;
        this.f47310d = fVar;
        this.f47311e = aVar;
        this.f47312f = connectionKeepAliveStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + this.f47308b + "] Connection request cancelled");
        }
        this.f47313g.set(null);
        try {
            r();
        } finally {
            close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Exception exc) {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + this.f47308b + "] connection request failed");
        }
        this.f47313g.set(null);
        b(exc);
    }

    public final HttpRoute C() {
        RouteTracker routeTracker = this.f47316j.get();
        if (routeTracker != null) {
            return routeTracker.toRoute();
        }
        return null;
    }

    public final m70.h E() {
        return this.f47314h.get();
    }

    public final HttpRequestWrapper H() {
        return this.f47319m.get();
    }

    public final HttpResponse I() {
        return this.f47320n.get();
    }

    public final long L() {
        return this.f47308b;
    }

    public final boolean S() {
        return this.f47321o.get();
    }

    public final boolean U() {
        return this.f47317k.get();
    }

    public final boolean V() {
        String str;
        HttpResponse httpResponse = this.f47320n.get();
        boolean z11 = false;
        e80.b.a(httpResponse != null, "Inconsistent state: HTTP response");
        m70.h hVar = this.f47314h.get();
        e80.b.a(hVar != null, "Inconsistent state: managed connection is null");
        if (hVar.isOpen() && this.f47311e.a(httpResponse, this.f47309c)) {
            z11 = true;
        }
        if (!z11) {
            if (this.f47307a.isDebugEnabled()) {
                this.f47307a.debug("[exchange: " + this.f47308b + "] Connection cannot be kept alive");
            }
            this.f47318l.set(null);
            return z11;
        }
        long keepAliveDuration = this.f47312f.getKeepAliveDuration(httpResponse, this.f47309c);
        if (this.f47307a.isDebugEnabled()) {
            if (keepAliveDuration > 0) {
                str = "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS;
            } else {
                str = "indefinitely";
            }
            this.f47307a.debug("[exchange: " + this.f47308b + "] Connection can be kept alive " + str);
        }
        this.f47318l.set(Long.valueOf(keepAliveDuration));
        return z11;
    }

    public final void Z() {
        this.f47321o.set(true);
    }

    public final void a0() {
        this.f47318l.set(null);
    }

    @Override // w70.p
    public final void b(Exception exc) {
        if (this.f47322p.compareAndSet(false, true)) {
            try {
                w(exc);
            } finally {
                q();
                m0();
            }
        }
    }

    public final void c0() {
        m70.h hVar = this.f47314h.get();
        e80.b.a(hVar != null, "Inconsistent state: managed connection is null");
        HttpRoute httpRoute = this.f47315i.get();
        e80.b.a(httpRoute != null, "Inconsistent state: HTTP route is null");
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + this.f47308b + "] route completed");
        }
        this.f47310d.d(hVar, httpRoute, this.f47309c);
        this.f47317k.set(true);
        this.f47316j.set(null);
    }

    @Override // org.apache.http.concurrent.Cancellable
    public final boolean cancel() {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + this.f47308b + "] Cancelled");
        }
        if (!this.f47322p.compareAndSet(false, true)) {
            return false;
        }
        try {
            Future<m70.h> andSet = this.f47313g.getAndSet(null);
            if (andSet != null) {
                andSet.cancel(true);
            }
            boolean r11 = r();
            q();
            m0();
            return r11;
        } catch (Throwable th2) {
            q();
            m0();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47322p.compareAndSet(false, true)) {
            q();
            m0();
        }
    }

    public final void d0() throws IOException {
        m70.h hVar = this.f47314h.get();
        e80.b.a(hVar != null, "Inconsistent state: managed connection is null");
        HttpRoute httpRoute = this.f47315i.get();
        e80.b.a(httpRoute != null, "Inconsistent state: HTTP route is null");
        RouteTracker routeTracker = this.f47316j.get();
        e80.b.a(routeTracker != null, "Inconsistent state: HTTP route tracker");
        this.f47310d.p(hVar, httpRoute, this.f47309c);
        routeTracker.connectProxy(httpRoute.getProxyHost(), false);
    }

    public final void f(m70.h hVar) {
        try {
            if (this.f47307a.isDebugEnabled()) {
                this.f47307a.debug("[exchange: " + this.f47308b + "] Connection allocated: " + hVar);
            }
            this.f47313g.set(null);
            this.f47314h.set(hVar);
            if (this.f47322p.get()) {
                q();
                return;
            }
            if (this.f47310d.c(hVar)) {
                this.f47317k.set(true);
                this.f47316j.set(null);
            }
            HttpContext context = hVar.getContext();
            synchronized (context) {
                try {
                    context.b(w70.u.f95682d, this);
                    if (hVar.X1()) {
                        b(new ConnectionClosedException("Connection closed"));
                    } else {
                        hVar.f();
                    }
                } finally {
                }
            }
        } catch (ConnectionShutdownException e11) {
            b(e11);
        } catch (RuntimeException e12) {
            b(e12);
            throw e12;
        }
    }

    public final void f0() throws IOException {
        m70.h hVar = this.f47314h.get();
        e80.b.a(hVar != null, "Inconsistent state: managed connection is null");
        HttpRoute httpRoute = this.f47315i.get();
        e80.b.a(httpRoute != null, "Inconsistent state: HTTP route is null");
        RouteTracker routeTracker = this.f47316j.get();
        e80.b.a(routeTracker != null, "Inconsistent state: HTTP route tracker");
        this.f47310d.p(hVar, httpRoute, this.f47309c);
        routeTracker.connectTarget(httpRoute.isSecure());
    }

    public final HttpRoute getRoute() {
        return this.f47315i.get();
    }

    public final void h0() {
        RouteTracker routeTracker = this.f47316j.get();
        e80.b.a(routeTracker != null, "Inconsistent state: HTTP route tracker");
        routeTracker.tunnelTarget(false);
    }

    public final void i0() throws IOException {
        m70.h hVar = this.f47314h.get();
        e80.b.a(hVar != null, "Inconsistent state: managed connection is null");
        HttpRoute httpRoute = this.f47315i.get();
        e80.b.a(httpRoute != null, "Inconsistent state: HTTP route is null");
        RouteTracker routeTracker = this.f47316j.get();
        e80.b.a(routeTracker != null, "Inconsistent state: HTTP route tracker");
        this.f47310d.j(hVar, httpRoute, this.f47309c);
        routeTracker.layerProtocol(httpRoute.isSecure());
    }

    @Override // w70.p
    public final boolean isDone() {
        return this.f47321o.get();
    }

    public final void k0() {
        m70.h andSet = this.f47314h.getAndSet(null);
        if (andSet != null) {
            if (this.f47307a.isDebugEnabled()) {
                this.f47307a.debug("[exchange: " + this.f47308b + "] releasing connection");
            }
            andSet.getContext().removeAttribute(w70.u.f95682d);
            Long l11 = this.f47318l.get();
            if (l11 != null) {
                this.f47310d.l(andSet, this.f47309c.getUserToken(), l11.longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            try {
                andSet.close();
                if (this.f47307a.isDebugEnabled()) {
                    this.f47307a.debug("[exchange: " + this.f47308b + "] connection discarded");
                }
            } catch (IOException e11) {
                if (this.f47307a.isDebugEnabled()) {
                    this.f47307a.debug("[exchange: " + this.f47308b + "] " + e11.getMessage(), e11);
                }
            } finally {
                this.f47310d.l(andSet, null, 0L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public abstract void m0();

    public final void o0() {
        HttpRoute httpRoute = this.f47315i.get();
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + this.f47308b + "] Request connection for " + httpRoute);
        }
        q();
        this.f47318l.set(null);
        this.f47316j.set(null);
        this.f47317k.set(false);
        Object userToken = this.f47309c.getUserToken();
        RequestConfig requestConfig = this.f47309c.getRequestConfig();
        this.f47313g.set(this.f47310d.i(httpRoute, userToken, requestConfig.getConnectTimeout(), requestConfig.getConnectionRequestTimeout(), TimeUnit.MILLISECONDS, new C0551a()));
    }

    public final void q() {
        m70.h andSet = this.f47314h.getAndSet(null);
        if (andSet != null) {
            try {
                try {
                    andSet.shutdown();
                    if (this.f47307a.isDebugEnabled()) {
                        this.f47307a.debug("[exchange: " + this.f47308b + "] connection aborted");
                    }
                } catch (IOException e11) {
                    if (this.f47307a.isDebugEnabled()) {
                        this.f47307a.debug("[exchange: " + this.f47308b + "] " + e11.getMessage(), e11);
                    }
                }
            } finally {
                this.f47310d.l(andSet, null, 0L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public abstract boolean r();

    public final void s0(HttpRequestWrapper httpRequestWrapper) {
        this.f47319m.set(httpRequestWrapper);
    }

    public final void v0(HttpResponse httpResponse) {
        this.f47320n.set(httpResponse);
    }

    public abstract void w(Exception exc);

    public final void w0(HttpRoute httpRoute) {
        this.f47315i.set(httpRoute);
    }

    public abstract void x0() throws HttpException, IOException;

    public final void y0() {
        if (this.f47317k.get() || this.f47316j.get() != null) {
            return;
        }
        m70.h hVar = this.f47314h.get();
        e80.b.a(hVar != null, "Inconsistent state: managed connection is null");
        boolean c11 = this.f47310d.c(hVar);
        this.f47317k.set(c11);
        if (c11) {
            if (this.f47307a.isDebugEnabled()) {
                this.f47307a.debug("[exchange: " + this.f47308b + "] Connection route already established");
                return;
            }
            return;
        }
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + this.f47308b + "] Start connection routing");
        }
        this.f47316j.set(new RouteTracker(this.f47315i.get()));
    }
}
