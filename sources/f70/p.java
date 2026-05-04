package f70;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.logging.Log;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class p implements q70.f, b80.d<HttpRoute> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f51203f = "http.ioSession-factory-registry";

    /* renamed from: a, reason: collision with root package name */
    public final Log f51204a;

    /* renamed from: b, reason: collision with root package name */
    public final x70.a f51205b;

    /* renamed from: c, reason: collision with root package name */
    public final c f51206c;

    /* renamed from: d, reason: collision with root package name */
    public final f70.b f51207d;

    /* renamed from: e, reason: collision with root package name */
    public final v60.d<q70.i> f51208e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements u60.b<f70.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u60.a f51209a;

        public a(u60.a aVar) {
            this.f51209a = aVar;
        }

        @Override // u60.b
        public void a() {
            p.this.f51204a.debug("Connection request cancelled");
            this.f51209a.cancel(true);
        }

        @Override // u60.b
        public void b(Exception exc) {
            if (p.this.f51204a.isDebugEnabled()) {
                p.this.f51204a.debug("Connection request failed", exc);
            }
            this.f51209a.c(exc);
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(f70.c cVar) {
            e80.b.a(cVar.b() != null, "Pool entry with no connection");
            if (p.this.f51204a.isDebugEnabled()) {
                p.this.f51204a.debug("Connection leased: " + p.this.t(cVar) + p.this.v(cVar.f()));
            }
            m70.h H = f70.d.H(cVar);
            synchronized (H) {
                try {
                    if (!this.f51209a.a(H)) {
                        p.this.f51207d.a(cVar, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Future<m70.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Future f51211a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u60.a f51212b;

        public b(Future future, u60.a aVar) {
            this.f51211a = future;
            this.f51212b = aVar;
        }

        @Override // java.util.concurrent.Future
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m70.h get() throws InterruptedException, ExecutionException {
            return (m70.h) this.f51212b.get();
        }

        @Override // java.util.concurrent.Future
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m70.h get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (m70.h) this.f51212b.get(j11, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            try {
                this.f51211a.cancel(z11);
            } catch (Throwable unused) {
            }
            return this.f51212b.cancel(z11);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f51212b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f51212b.isDone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Map<HttpHost, v60.a> f51214a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        public volatile v60.a f51215b;

        public v60.a a(HttpHost httpHost) {
            return this.f51214a.get(httpHost);
        }

        public v60.a b() {
            return this.f51215b;
        }

        public void c(HttpHost httpHost, v60.a aVar) {
            this.f51214a.put(httpHost, aVar);
        }

        public void d(v60.a aVar) {
            this.f51215b = aVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements v70.e<HttpRoute> {

        /* renamed from: a, reason: collision with root package name */
        public final SchemePortResolver f51216a;

        /* renamed from: b, reason: collision with root package name */
        public final DnsResolver f51217b;

        public d(SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
            throw null;
        }

        @Override // v70.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SocketAddress a(HttpRoute httpRoute) throws IOException {
            if (httpRoute.getLocalAddress() != null) {
                return new InetSocketAddress(httpRoute.getLocalAddress(), 0);
            }
            return null;
        }

        @Override // v70.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public SocketAddress b(HttpRoute httpRoute) throws IOException {
            HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
            return new InetSocketAddress(this.f51217b.resolve(proxyHost.getHostName())[0], this.f51216a.resolve(proxyHost));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements v70.c<HttpRoute, q70.e> {

        /* renamed from: a, reason: collision with root package name */
        public final c f51218a;

        /* renamed from: b, reason: collision with root package name */
        public final q70.g<q70.e> f51219b;

        public e(c cVar, q70.g<q70.e> gVar) {
            this.f51218a = cVar == null ? new c() : cVar;
            this.f51219b = gVar == null ? m.f51184h : gVar;
        }

        @Override // v70.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q70.e a(HttpRoute httpRoute, x70.f fVar) throws IOException {
            v60.a a11 = httpRoute.getProxyHost() != null ? this.f51218a.a(httpRoute.getProxyHost()) : null;
            if (a11 == null) {
                a11 = this.f51218a.a(httpRoute.getTargetHost());
            }
            if (a11 == null) {
                a11 = this.f51218a.b();
            }
            if (a11 == null) {
                a11 = v60.a.f93116g;
            }
            q70.e a12 = this.f51219b.a(fVar, a11);
            fVar.b("http.connection", a12);
            return a12;
        }
    }

    public p(x70.a aVar) {
        this(aVar, y());
    }

    private String u(HttpRoute httpRoute, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[route: ");
        sb2.append(httpRoute);
        sb2.append("]");
        if (obj != null) {
            sb2.append("[state: ");
            sb2.append(obj);
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String v(HttpRoute httpRoute) {
        StringBuilder sb2 = new StringBuilder();
        PoolStats h11 = this.f51207d.h();
        PoolStats n11 = this.f51207d.n(httpRoute);
        sb2.append("[total kept alive: ");
        sb2.append(h11.getAvailable());
        sb2.append("; ");
        sb2.append("route allocated: ");
        sb2.append(n11.getLeased() + n11.getAvailable());
        sb2.append(" of ");
        sb2.append(n11.getMax());
        sb2.append("; ");
        sb2.append("total allocated: ");
        sb2.append(h11.getLeased() + h11.getAvailable());
        sb2.append(" of ");
        sb2.append(h11.getMax());
        sb2.append("]");
        return sb2.toString();
    }

    public static v60.d<q70.i> y() {
        return v60.e.b().c("http", q70.h.f81832a).c("https", s70.a.f()).a();
    }

    @Override // b80.d
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int k(HttpRoute httpRoute) {
        return this.f51207d.k(httpRoute);
    }

    public Set<HttpRoute> B() {
        return this.f51207d.t();
    }

    @Override // b80.d
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public PoolStats n(HttpRoute httpRoute) {
        return this.f51207d.n(httpRoute);
    }

    public void D(HttpHost httpHost, v60.a aVar) {
        this.f51206c.c(httpHost, aVar);
    }

    public void E(v60.a aVar) {
        this.f51206c.d(aVar);
    }

    @Override // b80.d
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m(HttpRoute httpRoute, int i11) {
        this.f51207d.m(httpRoute, i11);
    }

    public void G(long j11) throws IOException {
        this.f51204a.debug("Connection manager is shutting down");
        this.f51207d.M(j11);
        this.f51204a.debug("Connection manager shut down");
    }

    public void H() {
        this.f51204a.debug("Validating pending requests");
        this.f51207d.N();
    }

    @Override // q70.f
    public void b(x70.c cVar) throws IOException {
        this.f51205b.b(cVar);
    }

    @Override // q70.f
    public boolean c(m70.h hVar) {
        boolean q11;
        e80.a.j(hVar, "Managed connection");
        synchronized (hVar) {
            q11 = f70.d.w(hVar).q();
        }
        return q11;
    }

    @Override // q70.f
    public void closeExpiredConnections() {
        this.f51204a.debug("Closing expired connections");
        this.f51207d.c();
    }

    @Override // q70.f
    public void closeIdleConnections(long j11, TimeUnit timeUnit) {
        if (this.f51204a.isDebugEnabled()) {
            this.f51204a.debug("Closing connections idle longer than " + j11 + " " + timeUnit);
        }
        this.f51207d.d(j11, timeUnit);
    }

    @Override // q70.f
    public void d(m70.h hVar, HttpRoute httpRoute, HttpContext httpContext) {
        e80.a.j(hVar, "Managed connection");
        e80.a.j(httpRoute, "HTTP route");
        synchronized (hVar) {
            f70.d.w(hVar).r();
        }
    }

    @Override // b80.d
    public int e() {
        return this.f51207d.e();
    }

    @Override // b80.d
    public void f(int i11) {
        this.f51207d.f(i11);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // b80.d
    public int g() {
        return this.f51207d.g();
    }

    @Override // b80.d
    public PoolStats h() {
        return this.f51207d.h();
    }

    @Override // q70.f
    public Future<m70.h> i(HttpRoute httpRoute, Object obj, long j11, long j12, TimeUnit timeUnit, u60.b<m70.h> bVar) {
        e80.a.j(httpRoute, "HTTP route");
        if (this.f51204a.isDebugEnabled()) {
            this.f51204a.debug("Connection request: " + u(httpRoute, obj) + v(httpRoute));
        }
        u60.a aVar = new u60.a(bVar);
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        if (this.f51208e.a(proxyHost.getSchemeName()) != null) {
            return new b(this.f51207d.w(httpRoute, obj, j11, j12, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS, new a(aVar)), aVar);
        }
        aVar.c(new UnsupportedSchemeException(proxyHost.getSchemeName() + " protocol is not supported"));
        return aVar;
    }

    @Override // q70.f
    public void j(m70.h hVar, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        e80.a.j(hVar, "Managed connection");
        e80.a.j(httpRoute, "HTTP route");
        HttpHost targetHost = httpRoute.getTargetHost();
        q70.i a11 = z(httpContext).a(targetHost.getSchemeName());
        if (a11 == null) {
            throw new UnsupportedSchemeException(targetHost.getSchemeName() + " protocol is not supported");
        }
        if (a11.b()) {
            synchronized (hVar) {
                q70.e b11 = f70.d.w(hVar).b();
                b11.S0(a11.a(targetHost, b11.o()));
            }
        } else {
            throw new UnsupportedSchemeException(targetHost.getSchemeName() + " protocol does not support connection upgrade");
        }
    }

    @Override // q70.f
    public void l(m70.h hVar, Object obj, long j11, TimeUnit timeUnit) {
        String str;
        e80.a.j(hVar, "Managed connection");
        synchronized (hVar) {
            try {
                f70.c c11 = f70.d.c(hVar);
                if (c11 == null) {
                    return;
                }
                if (this.f51204a.isDebugEnabled()) {
                    this.f51204a.debug("Releasing connection: " + t(c11) + v(c11.f()));
                }
                q70.e b11 = c11.b();
                boolean z11 = false;
                try {
                    if (b11.isOpen()) {
                        c11.m(obj);
                        if (timeUnit == null) {
                            timeUnit = TimeUnit.MILLISECONDS;
                        }
                        c11.n(j11, timeUnit);
                        if (this.f51204a.isDebugEnabled()) {
                            if (j11 > 0) {
                                str = "for " + (j11 / 1000.0d) + " seconds";
                            } else {
                                str = "indefinitely";
                            }
                            this.f51204a.debug("Connection " + t(c11) + " can be kept alive " + str);
                        }
                    }
                    f70.b bVar = this.f51207d;
                    if (b11.isOpen() && c11.q()) {
                        z11 = true;
                    }
                    bVar.a(c11, z11);
                    if (this.f51204a.isDebugEnabled()) {
                        this.f51204a.debug("Connection released: " + t(c11) + v(c11.f()));
                    }
                } catch (Throwable th2) {
                    f70.b bVar2 = this.f51207d;
                    if (b11.isOpen() && c11.q()) {
                        z11 = true;
                    }
                    bVar2.a(c11, z11);
                    if (this.f51204a.isDebugEnabled()) {
                        this.f51204a.debug("Connection released: " + t(c11) + v(c11.f()));
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b80.d
    public void o(int i11) {
        this.f51207d.o(i11);
    }

    @Override // q70.f
    public void p(m70.h hVar, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        e80.a.j(hVar, "Managed connection");
        e80.a.j(httpRoute, "HTTP route");
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        q70.i a11 = z(httpContext).a(proxyHost.getSchemeName());
        if (a11 == null) {
            throw new UnsupportedSchemeException(proxyHost.getSchemeName() + " protocol is not supported");
        }
        if (a11.b()) {
            synchronized (hVar) {
                q70.e b11 = f70.d.w(hVar).b();
                b11.S0(a11.a(proxyHost, b11.o()));
            }
        }
    }

    @Override // q70.f
    public void shutdown() throws IOException {
        this.f51204a.debug("Connection manager is shutting down");
        this.f51207d.M(2000L);
        this.f51204a.debug("Connection manager shut down");
    }

    public final String t(f70.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[id: ");
        sb2.append(cVar.e());
        sb2.append("]");
        sb2.append("[route: ");
        sb2.append(cVar.f());
        sb2.append("]");
        Object g11 = cVar.g();
        if (g11 != null) {
            sb2.append("[state: ");
            sb2.append(g11);
            sb2.append("]");
        }
        return sb2.toString();
    }

    public v60.a w(HttpHost httpHost) {
        return this.f51206c.a(httpHost);
    }

    public v60.a x() {
        return this.f51206c.b();
    }

    public final v60.b<q70.i> z(HttpContext httpContext) {
        v60.b<q70.i> bVar = (v60.b) httpContext.getAttribute(f51203f);
        return bVar == null ? this.f51208e : bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(x70.a aVar, v60.d<q70.i> dVar) {
        this(aVar, (q70.g<q70.e>) null, dVar, (DnsResolver) null);
    }

    public p(x70.a aVar, q70.g<q70.e> gVar, DnsResolver dnsResolver) {
        this(aVar, gVar, y(), dnsResolver);
    }

    public p(x70.a aVar, q70.g<q70.e> gVar, v70.e<HttpRoute> eVar) {
        this(aVar, gVar, y(), eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(x70.a aVar, q70.g<q70.e> gVar) {
        this(aVar, gVar, y(), (DnsResolver) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(x70.a aVar, q70.g<q70.e> gVar, v60.d<q70.i> dVar) {
        this(aVar, gVar, dVar, (DnsResolver) null);
    }

    public p(x70.a aVar, q70.g<q70.e> gVar, v60.d<q70.i> dVar, DnsResolver dnsResolver) {
        this(aVar, gVar, dVar, null, dnsResolver, -1L, TimeUnit.MILLISECONDS);
    }

    public p(x70.a aVar, q70.g<q70.e> gVar, v60.d<q70.i> dVar, v70.e<HttpRoute> eVar) {
        this(aVar, gVar, dVar, eVar, -1L, TimeUnit.MILLISECONDS);
    }

    public p(x70.a aVar, q70.g<q70.e> gVar, v60.d<q70.i> dVar, SchemePortResolver schemePortResolver, DnsResolver dnsResolver, long j11, TimeUnit timeUnit) {
        this(aVar, gVar, dVar, new d(schemePortResolver, dnsResolver), j11, timeUnit);
    }

    public p(x70.a aVar, q70.g<q70.e> gVar, v60.d<q70.i> dVar, v70.e<HttpRoute> eVar, long j11, TimeUnit timeUnit) {
        this.f51204a = org.apache.commons.logging.g.q(getClass());
        e80.a.j(aVar, "I/O reactor");
        e80.a.j(dVar, "I/O session factory registry");
        e80.a.j(eVar, "Socket address resolver");
        this.f51205b = aVar;
        c cVar = new c();
        this.f51206c = cVar;
        this.f51207d = new f70.b(aVar, new e(cVar, gVar), eVar, 2, 20, j11, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
        this.f51208e = dVar;
    }

    public p(x70.a aVar, f70.b bVar, v60.d<q70.i> dVar) {
        this.f51204a = org.apache.commons.logging.g.q(getClass());
        this.f51205b = aVar;
        this.f51206c = new c();
        this.f51207d = bVar;
        this.f51208e = dVar;
    }
}
