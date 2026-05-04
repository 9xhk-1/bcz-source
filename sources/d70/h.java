package d70;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h<T> extends a {

    /* renamed from: r, reason: collision with root package name */
    public final w70.z f47384r;

    /* renamed from: s, reason: collision with root package name */
    public final b0<T> f47385s;

    /* renamed from: t, reason: collision with root package name */
    public final u60.a<T> f47386t;

    /* renamed from: u, reason: collision with root package name */
    public final o f47387u;

    /* renamed from: v, reason: collision with root package name */
    public final t f47388v;

    public h(Log log, w70.z zVar, b0<T> b0Var, HttpClientContext httpClientContext, u60.a<T> aVar, q70.f fVar, org.apache.http.a aVar2, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, o oVar) {
        super(log, httpClientContext, fVar, aVar2, connectionKeepAliveStrategy);
        this.f47384r = zVar;
        this.f47385s = b0Var;
        this.f47386t = aVar;
        this.f47387u = oVar;
        this.f47388v = new t(L(), zVar, b0Var, httpClientContext);
    }

    @Override // w70.p
    public void B(HttpResponse httpResponse) throws IOException, HttpException {
        this.f47387u.f(httpResponse, this.f47388v, this);
    }

    @Override // w70.p
    public void B2() throws IOException, HttpException {
        this.f47387u.g(this.f47388v, this);
        if (this.f47388v.b() == null && !this.f47386t.isDone()) {
            m70.h E = E();
            if (E != null && !E.isOpen()) {
                k0();
                E = null;
            }
            if (E != null) {
                E.f();
                return;
            } else {
                o0();
                return;
            }
        }
        try {
            Z();
            k0();
            T result = this.f47385s.getResult();
            Exception m11 = this.f47385s.m();
            if (m11 == null) {
                this.f47386t.a(result);
            } else {
                this.f47386t.c(m11);
            }
            close();
        } catch (Throwable th2) {
            close();
            throw th2;
        }
    }

    @Override // w70.p
    public void D5() {
        this.f47387u.b(this.f47388v, this);
    }

    @Override // w70.p
    public HttpRequest G() throws IOException, HttpException {
        return this.f47387u.a(this.f47388v, this);
    }

    @Override // w70.p
    public void W5() {
        if (S()) {
            close();
        } else {
            o0();
        }
    }

    @Override // w70.p
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        this.f47387u.e(this.f47388v, cVar, gVar);
    }

    @Override // w70.p
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        this.f47387u.d(this.f47388v, aVar, gVar);
        if (aVar.e() || !this.f47385s.isDone()) {
            return;
        }
        a0();
        try {
            Z();
            k0();
            this.f47386t.cancel();
        } finally {
            close();
        }
    }

    @Override // d70.a
    public void m0() {
        try {
            this.f47384r.close();
        } catch (IOException e11) {
            this.f47307a.debug("I/O error closing request producer", e11);
        }
        try {
            this.f47385s.close();
        } catch (IOException e12) {
            this.f47307a.debug("I/O error closing response consumer", e12);
        }
    }

    @Override // d70.a
    public boolean r() {
        boolean cancel = this.f47385s.cancel();
        T result = this.f47385s.getResult();
        Exception m11 = this.f47385s.m();
        if (m11 != null) {
            this.f47386t.c(m11);
            return cancel;
        }
        if (result != null) {
            this.f47386t.a(result);
            return cancel;
        }
        this.f47386t.cancel();
        return cancel;
    }

    @Override // d70.a
    public void w(Exception exc) {
        try {
            this.f47384r.b(exc);
            this.f47385s.b(exc);
        } finally {
            this.f47386t.c(exc);
        }
    }

    @Override // d70.a
    public void x0() throws HttpException, IOException {
        HttpHost target = this.f47384r.getTarget();
        HttpExecutionAware G = this.f47384r.G();
        if (G instanceof HttpExecutionAware) {
            G.setCancellable(this);
        }
        this.f47387u.c(target, G, this.f47388v, this);
        o0();
    }

    public void z0() {
        q();
    }
}
