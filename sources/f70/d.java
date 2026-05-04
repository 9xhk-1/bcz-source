package f70;

import java.io.IOException;
import java.net.InetAddress;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d implements q70.e {

    /* renamed from: a, reason: collision with root package name */
    public volatile c f51150a;

    public d(c cVar) {
        this.f51150a = cVar;
    }

    public static d C(m70.h hVar) {
        if (d.class.isInstance(hVar)) {
            return (d) d.class.cast(hVar);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + hVar.getClass());
    }

    public static m70.h H(c cVar) {
        return new d(cVar);
    }

    public static c c(m70.h hVar) {
        return C(hVar).a();
    }

    public static c w(m70.h hVar) {
        c r11 = C(hVar).r();
        if (r11 != null) {
            return r11;
        }
        throw new ConnectionShutdownException();
    }

    public q70.e E() {
        q70.e k11 = k();
        if (k11 != null) {
            return k11;
        }
        throw new ConnectionShutdownException();
    }

    @Override // m70.h
    public void G5(HttpRequest httpRequest) throws IOException, HttpException {
        E().G5(httpRequest);
    }

    @Override // m70.h
    public void K() {
        E().K();
    }

    @Override // m70.h
    public void M() {
        E().M();
    }

    @Override // m70.l
    public HttpResponse N6() {
        return E().N6();
    }

    @Override // m70.h
    public boolean Q() {
        return E().Q();
    }

    @Override // q70.e
    public void S0(x70.f fVar) {
        E().S0(fVar);
    }

    @Override // org.apache.http.HttpConnection
    public boolean X1() {
        q70.e k11 = k();
        return (k11 == null || k11.isOpen()) ? false : true;
    }

    public c a() {
        c cVar = this.f51150a;
        this.f51150a = null;
        return cVar;
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.f51150a;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // m70.g
    public void e() {
        q70.e k11 = k();
        if (k11 != null) {
            k11.e();
        }
    }

    @Override // m70.g
    public void f() {
        q70.e k11 = k();
        if (k11 != null) {
            k11.f();
        }
    }

    @Override // m70.l
    public HttpContext getContext() {
        return E().getContext();
    }

    @Override // q70.e
    public String getId() {
        return E().getId();
    }

    @Override // org.apache.http.n
    public InetAddress getLocalAddress() {
        return E().getLocalAddress();
    }

    @Override // org.apache.http.n
    public int getLocalPort() {
        return E().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public org.apache.http.k getMetrics() {
        return E().getMetrics();
    }

    @Override // q70.e
    public SSLSession getSSLSession() {
        return E().getSSLSession();
    }

    @Override // m70.l
    public int getStatus() {
        return E().getStatus();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        c cVar = this.f51150a;
        return (cVar == null || cVar.k()) ? false : true;
    }

    @Override // m70.g
    public void j() {
        q70.e k11 = k();
        if (k11 != null) {
            k11.j();
        }
    }

    public q70.e k() {
        c cVar = this.f51150a;
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }

    @Override // org.apache.http.n
    public InetAddress l() {
        return E().l();
    }

    @Override // m70.l
    public HttpRequest n0() {
        return E().n0();
    }

    @Override // q70.e
    public x70.f o() {
        return E().o();
    }

    @Override // m70.g
    public void q() {
        q70.e k11 = k();
        if (k11 != null) {
            k11.q();
        }
    }

    public c r() {
        return this.f51150a;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i11) {
        E().setSocketTimeout(i11);
    }

    @Override // org.apache.http.HttpConnection, m70.g
    public void shutdown() throws IOException {
        c cVar = this.f51150a;
        if (cVar != null) {
            cVar.t();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CPoolProxy{");
        q70.e k11 = k();
        if (k11 != null) {
            sb2.append(k11);
        } else {
            sb2.append("detached");
        }
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }

    @Override // org.apache.http.HttpConnection
    public int x() {
        return E().x();
    }

    @Override // org.apache.http.n
    public int y() {
        return E().y();
    }
}
