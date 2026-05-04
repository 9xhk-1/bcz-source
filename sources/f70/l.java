package f70;

import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class l implements q70.d {

    /* renamed from: a, reason: collision with root package name */
    public final q70.c f51178a;

    /* renamed from: b, reason: collision with root package name */
    public final q70.b f51179b;

    /* renamed from: c, reason: collision with root package name */
    public volatile j f51180c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f51181d = true;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f51182e = Long.MAX_VALUE;

    public l(q70.c cVar, q70.b bVar, j jVar) {
        this.f51178a = cVar;
        this.f51179b = bVar;
        this.f51180c = jVar;
    }

    public j C() {
        return this.f51180c;
    }

    public final r70.b E(HttpContext httpContext) {
        r70.b bVar = (r70.b) httpContext.getAttribute("http.scheme-registry");
        return bVar == null ? this.f51178a.getSchemeRegistry() : bVar;
    }

    @Override // m70.h
    public void G5(HttpRequest httpRequest) throws IOException, HttpException {
        c().G5(httpRequest);
    }

    @Override // m70.h
    public void K() {
        c().K();
    }

    @Override // m70.h
    public void M() {
        c().M();
    }

    @Override // m70.l
    public HttpResponse N6() {
        return c().N6();
    }

    @Override // m70.h
    public boolean Q() {
        return c().Q();
    }

    @Override // org.apache.http.HttpConnection
    public boolean X1() {
        return isOpen();
    }

    @Override // q70.d
    public synchronized void Y(HttpParams httpParams) throws IOException {
        RouteTracker r11 = k().r();
        if (!r11.isConnected()) {
            throw new IllegalStateException("Connection not open");
        }
        if (r11.isTunnelled()) {
            throw new IllegalStateException("Connection is already tunnelled");
        }
        r11.tunnelTarget(false);
    }

    public j a() {
        j jVar = this.f51180c;
        this.f51180c = null;
        return jVar;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public synchronized void abortConnection() {
        if (this.f51180c == null) {
            return;
        }
        this.f51181d = false;
        try {
            ((q70.a) this.f51180c.b().getAttribute("http.connection")).shutdown();
        } catch (IOException unused) {
        }
        this.f51178a.l(this, this.f51182e, TimeUnit.MILLISECONDS);
        this.f51180c = null;
    }

    public final q70.a c() {
        j jVar = this.f51180c;
        if (jVar != null) {
            return (q70.a) jVar.b().getAttribute("http.connection");
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        q70.a r11 = r();
        if (r11 != null) {
            r11.close();
        }
    }

    @Override // m70.g
    public void e() {
        c().e();
    }

    @Override // m70.g
    public void f() {
        c().f();
    }

    @Override // m70.l
    public HttpContext getContext() {
        return c().getContext();
    }

    public InetAddress getLocalAddress() {
        return c().getLocalAddress();
    }

    public int getLocalPort() {
        return c().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public org.apache.http.k getMetrics() {
        return c().getMetrics();
    }

    public HttpRoute getRoute() {
        return k().o();
    }

    public SSLSession getSSLSession() {
        x70.f o11 = c().o();
        if (o11 instanceof y70.e) {
            return ((y70.e) o11).u();
        }
        return null;
    }

    @Override // q70.d
    public Object getState() {
        return k().g();
    }

    @Override // m70.l
    public int getStatus() {
        return c().getStatus();
    }

    @Override // q70.d
    public boolean isMarkedReusable() {
        return this.f51181d;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        q70.a r11 = r();
        if (r11 != null) {
            return r11.isOpen();
        }
        return false;
    }

    public boolean isSecure() {
        return c().o() instanceof y70.e;
    }

    @Override // m70.g
    public void j() {
        c().j();
    }

    public final j k() {
        j jVar = this.f51180c;
        if (jVar != null) {
            return jVar;
        }
        throw new ConnectionShutdownException();
    }

    public InetAddress l() {
        return c().l();
    }

    @Override // q70.d
    public synchronized void layerProtocol(HttpContext httpContext, HttpParams httpParams) throws IOException {
        j k11 = k();
        RouteTracker r11 = k11.r();
        if (!r11.isConnected()) {
            throw new IllegalStateException("Connection not open");
        }
        if (!r11.isTunnelled()) {
            throw new IllegalStateException("Protocol layering without a tunnel not supported");
        }
        if (r11.isLayered()) {
            throw new IllegalStateException("Multiple protocol layering not supported");
        }
        r70.a c11 = E(httpContext).c(r11.getTargetHost());
        r70.c b11 = c11.b();
        if (b11 == null) {
            throw new IllegalStateException(c11.c() + " scheme does not provider support for protocol layering");
        }
        x70.f b12 = k11.b();
        ((q70.a) b12.getAttribute("http.connection")).c1(b11.a(b12));
        r11.layerProtocol(b11.isSecure());
    }

    @Override // q70.d
    public void markReusable() {
        this.f51181d = true;
    }

    @Override // m70.l
    public HttpRequest n0() {
        return c().n0();
    }

    @Override // q70.d
    public synchronized void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) throws IOException {
        r70.c b11;
        try {
            j k11 = k();
            RouteTracker r11 = k11.r();
            if (r11.isConnected()) {
                throw new IllegalStateException("Connection already open");
            }
            HttpHost targetHost = httpRoute.getTargetHost();
            HttpHost proxyHost = httpRoute.getProxyHost();
            x70.f b12 = k11.b();
            if (proxyHost == null && (b11 = E(httpContext).c(targetHost).b()) != null) {
                b12 = b11.a(b12);
            }
            q70.a b13 = this.f51179b.b("http-outgoing-" + k11.e(), b12, httpParams);
            b12.b("http.connection", b13);
            if (proxyHost == null) {
                r11.connectTarget(b13.o() instanceof y70.e);
            } else {
                r11.connectProxy(proxyHost, false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // m70.g
    public void q() {
        c().q();
    }

    public final q70.a r() {
        j jVar = this.f51180c;
        if (jVar == null) {
            return null;
        }
        return (q70.a) jVar.b().getAttribute("http.connection");
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public synchronized void releaseConnection() {
        if (this.f51180c == null) {
            return;
        }
        this.f51178a.l(this, this.f51182e, TimeUnit.MILLISECONDS);
        this.f51180c = null;
    }

    @Override // q70.d
    public void setIdleDuration(long j11, TimeUnit timeUnit) {
        if (j11 > 0) {
            this.f51182e = timeUnit.toMillis(j11);
        } else {
            this.f51182e = -1L;
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i11) {
        c().setSocketTimeout(i11);
    }

    @Override // q70.d
    public void setState(Object obj) {
        k().m(obj);
    }

    @Override // org.apache.http.HttpConnection, m70.g
    public void shutdown() throws IOException {
        q70.a r11 = r();
        if (r11 != null) {
            r11.shutdown();
        }
    }

    public synchronized String toString() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f51180c != null ? this.f51180c.toString() : "released";
    }

    @Override // q70.d
    public void unmarkReusable() {
        this.f51181d = false;
    }

    public q70.c w() {
        return this.f51178a;
    }

    @Override // org.apache.http.HttpConnection
    public int x() {
        return c().x();
    }

    @Override // q70.d
    public synchronized void x3(HttpHost httpHost, HttpParams httpParams) throws IOException {
        RouteTracker r11 = k().r();
        if (!r11.isConnected()) {
            throw new IllegalStateException("Connection not open");
        }
        r11.tunnelProxy(httpHost, false);
    }

    public int y() {
        return c().y();
    }
}
