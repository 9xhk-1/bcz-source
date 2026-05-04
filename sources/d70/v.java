package d70;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v<T> extends a {

    /* renamed from: r, reason: collision with root package name */
    public final w70.z f47455r;

    /* renamed from: s, reason: collision with root package name */
    public final b0<T> f47456s;

    /* renamed from: t, reason: collision with root package name */
    public final HttpClientContext f47457t;

    /* renamed from: u, reason: collision with root package name */
    public final u60.a<T> f47458u;

    /* renamed from: v, reason: collision with root package name */
    public final c80.j f47459v;

    public v(Log log, w70.z zVar, b0<T> b0Var, HttpClientContext httpClientContext, u60.a<T> aVar, q70.f fVar, c80.j jVar, org.apache.http.a aVar2, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        super(log, httpClientContext, fVar, aVar2, connectionKeepAliveStrategy);
        this.f47455r = zVar;
        this.f47456s = b0Var;
        this.f47457t = httpClientContext;
        this.f47458u = aVar;
        this.f47459v = jVar;
    }

    @Override // w70.p
    public void B(HttpResponse httpResponse) throws IOException, HttpException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Response received " + httpResponse.n());
        }
        this.f47457t.setAttribute("http.response", httpResponse);
        this.f47459v.g(httpResponse, this.f47457t);
        v0(httpResponse);
        this.f47456s.B(httpResponse);
    }

    @Override // w70.p
    public void B2() throws IOException, HttpException {
        V();
        this.f47456s.p(this.f47457t);
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Response processed");
        }
        try {
            Z();
            k0();
            T result = this.f47456s.getResult();
            Exception m11 = this.f47456s.m();
            if (m11 == null) {
                this.f47458u.a(result);
            } else {
                this.f47458u.c(m11);
            }
            close();
        } catch (Throwable th2) {
            close();
            throw th2;
        }
    }

    @Override // w70.p
    public void D5() {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Request completed");
        }
        this.f47455r.s(this.f47457t);
    }

    @Override // w70.p
    public HttpRequest G() throws IOException, HttpException {
        y0();
        if (!U()) {
            f0();
            c0();
        }
        m70.h E = E();
        this.f47457t.setAttribute("http.connection", E);
        RequestConfig requestConfig = this.f47457t.getRequestConfig();
        if (requestConfig.getSocketTimeout() > 0) {
            E.setSocketTimeout(requestConfig.getSocketTimeout());
        }
        return H();
    }

    @Override // w70.p
    public void W5() {
        close();
    }

    @Override // w70.p
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] produce content");
        }
        this.f47455r.d(cVar, gVar);
        if (cVar.e()) {
            this.f47455r.g0();
        }
    }

    @Override // w70.p
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Consume content");
        }
        this.f47456s.h(aVar, gVar);
        if (aVar.e() || !this.f47456s.isDone()) {
            return;
        }
        a0();
        try {
            Z();
            k0();
            this.f47458u.cancel();
        } finally {
            close();
        }
    }

    @Override // d70.a
    public void m0() {
        try {
            this.f47455r.close();
        } catch (IOException e11) {
            this.f47307a.debug("I/O error closing request producer", e11);
        }
        try {
            this.f47456s.close();
        } catch (IOException e12) {
            this.f47307a.debug("I/O error closing response consumer", e12);
        }
    }

    @Override // d70.a
    public boolean r() {
        boolean cancel = this.f47456s.cancel();
        T result = this.f47456s.getResult();
        Exception m11 = this.f47456s.m();
        if (m11 != null) {
            this.f47458u.c(m11);
            return cancel;
        }
        if (result != null) {
            this.f47458u.a(result);
            return cancel;
        }
        this.f47458u.cancel();
        return cancel;
    }

    @Override // d70.a
    public void w(Exception exc) {
        this.f47455r.b(exc);
        this.f47456s.b(exc);
    }

    @Override // d70.a
    public void x0() throws HttpException, IOException {
        RequestConfig config;
        HttpHost target = this.f47455r.getTarget();
        HttpExecutionAware G = this.f47455r.G();
        if (G instanceof HttpExecutionAware) {
            G.setCancellable(this);
        }
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] start execution");
        }
        if ((G instanceof Configurable) && (config = ((Configurable) G).getConfig()) != null) {
            this.f47457t.setRequestConfig(config);
        }
        HttpRequest wrap = HttpRequestWrapper.wrap(G);
        HttpRoute httpRoute = new HttpRoute(target);
        s0(wrap);
        w0(httpRoute);
        this.f47457t.setAttribute("http.request", wrap);
        this.f47457t.setAttribute("http.target_host", target);
        this.f47457t.setAttribute("http.route", httpRoute);
        this.f47459v.process(wrap, this.f47457t);
        o0();
    }

    public void z0() {
        q();
    }
}
