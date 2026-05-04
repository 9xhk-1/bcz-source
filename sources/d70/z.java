package d70;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.logging.Log;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import w70.b0;
import w70.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@p0
/* loaded from: classes9.dex */
public class z<T> extends a {
    public final AtomicReference<b0<T>> A;

    /* renamed from: r, reason: collision with root package name */
    public final HttpHost f47472r;

    /* renamed from: s, reason: collision with root package name */
    public final Queue<w70.z> f47473s;

    /* renamed from: t, reason: collision with root package name */
    public final Queue<b0<T>> f47474t;

    /* renamed from: u, reason: collision with root package name */
    public final Queue<HttpRequest> f47475u;

    /* renamed from: v, reason: collision with root package name */
    public final Queue<T> f47476v;

    /* renamed from: w, reason: collision with root package name */
    public final HttpClientContext f47477w;

    /* renamed from: x, reason: collision with root package name */
    public final u60.a<List<T>> f47478x;

    /* renamed from: y, reason: collision with root package name */
    public final c80.j f47479y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference<w70.z> f47480z;

    public z(Log log, HttpHost httpHost, List<? extends w70.z> list, List<? extends b0<T>> list2, HttpClientContext httpClientContext, u60.a<List<T>> aVar, q70.f fVar, c80.j jVar, org.apache.http.a aVar2, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        super(log, httpClientContext, fVar, aVar2, connectionKeepAliveStrategy);
        e80.a.j(httpHost, "HTTP target");
        e80.a.g(list, "Request producer list");
        e80.a.g(list2, "Response consumer list");
        e80.a.a(list.size() == list2.size(), "Number of request producers does not match that of response consumers");
        this.f47472r = httpHost;
        this.f47473s = new ConcurrentLinkedQueue(list);
        this.f47474t = new ConcurrentLinkedQueue(list2);
        this.f47475u = new ConcurrentLinkedQueue();
        this.f47476v = new ConcurrentLinkedQueue();
        this.f47477w = httpClientContext;
        this.f47478x = aVar;
        this.f47479y = jVar;
        this.f47480z = new AtomicReference<>(null);
        this.A = new AtomicReference<>(null);
    }

    public final void A0(b0<?> b0Var) {
        if (b0Var != null) {
            try {
                b0Var.close();
            } catch (IOException e11) {
                this.f47307a.debug("I/O error closing response consumer", e11);
            }
        }
    }

    @Override // w70.p
    public void B(HttpResponse httpResponse) throws IOException, HttpException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Response received " + httpResponse.n());
        }
        e80.b.a(this.A.get() == null, "Inconsistent state: response consumer is not null");
        b0<T> poll = this.f47474t.poll();
        e80.b.a(poll != null, "Inconsistent state: response consumer queue is empty");
        this.A.set(poll);
        HttpRequest poll2 = this.f47475u.poll();
        e80.b.a(poll2 != null, "Inconsistent state: request queue is empty");
        this.f47477w.setAttribute("http.request", poll2);
        this.f47477w.setAttribute("http.response", httpResponse);
        this.f47479y.g(httpResponse, this.f47477w);
        poll.B(httpResponse);
        v0(httpResponse);
    }

    @Override // w70.p
    public void B2() throws IOException, HttpException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Response processed");
        }
        boolean V = V();
        b0<T> andSet = this.A.getAndSet(null);
        e80.b.a(andSet != null, "Inconsistent state: response consumer is null");
        try {
            andSet.p(this.f47477w);
            T result = andSet.getResult();
            Exception m11 = andSet.m();
            try {
                andSet.close();
            } catch (IOException e11) {
                this.f47307a.debug(e11.getMessage(), e11);
            }
            if (result != null) {
                this.f47476v.add(result);
            } else {
                b(m11);
            }
            if (!this.f47478x.isDone() && this.f47474t.isEmpty()) {
                this.f47478x.a(new ArrayList(this.f47476v));
                this.f47476v.clear();
            }
            if (this.f47478x.isDone()) {
                close();
                return;
            }
            if (!V) {
                b(new ConnectionClosedException("Connection closed"));
                return;
            }
            m70.h E = E();
            if (E != null) {
                E.f();
            } else {
                o0();
            }
        } catch (RuntimeException e12) {
            b(e12);
            throw e12;
        }
    }

    public final void C0(w70.z zVar) {
        if (zVar != null) {
            try {
                zVar.close();
            } catch (IOException e11) {
                this.f47307a.debug("I/O error closing request producer", e11);
            }
        }
    }

    @Override // w70.p
    public void D5() {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Request completed");
        }
        w70.z andSet = this.f47480z.getAndSet(null);
        e80.b.a(andSet != null, "Inconsistent state: request producer is null");
        andSet.s(this.f47477w);
        try {
            andSet.close();
        } catch (IOException e11) {
            this.f47307a.debug(e11.getMessage(), e11);
        }
    }

    @Override // w70.p
    public HttpRequest G() throws IOException, HttpException {
        y0();
        if (!U()) {
            f0();
            c0();
        }
        m70.h E = E();
        this.f47477w.setAttribute("http.connection", E);
        e80.b.a(this.f47480z.get() == null, "Inconsistent state: currentRequest producer is not null");
        w70.z poll = this.f47473s.poll();
        if (poll == null) {
            return null;
        }
        this.f47480z.set(poll);
        HttpRequest wrap = HttpRequestWrapper.wrap(poll.G());
        RequestConfig requestConfig = this.f47477w.getRequestConfig();
        if (requestConfig.getSocketTimeout() > 0) {
            E.setSocketTimeout(requestConfig.getSocketTimeout());
        }
        this.f47479y.process(wrap, this.f47477w);
        this.f47475u.add(wrap);
        s0(wrap);
        return wrap;
    }

    @Override // w70.p
    public void W5() {
        b(new ConnectionClosedException("Connection closed"));
    }

    @Override // w70.p
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] produce content");
        }
        w70.z zVar = this.f47480z.get();
        e80.b.a(zVar != null, "Inconsistent state: request producer is null");
        zVar.d(cVar, gVar);
        if (cVar.e()) {
            zVar.g0();
        }
    }

    @Override // w70.p
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] Consume content");
        }
        b0<T> b0Var = this.A.get();
        e80.b.a(b0Var != null, "Inconsistent state: response consumer is null");
        b0Var.h(aVar, gVar);
    }

    @Override // d70.a
    public void m0() {
        C0(this.f47480z.getAndSet(null));
        A0(this.A.getAndSet(null));
        while (!this.f47473s.isEmpty()) {
            C0(this.f47473s.remove());
        }
        while (!this.f47474t.isEmpty()) {
            A0(this.f47474t.remove());
        }
        this.f47475u.clear();
        this.f47476v.clear();
    }

    @Override // d70.a
    public boolean r() {
        b0<T> b0Var = this.A.get();
        boolean z11 = b0Var != null && b0Var.cancel();
        this.f47478x.cancel();
        return z11;
    }

    @Override // d70.a
    public void w(Exception exc) {
        try {
            w70.z zVar = this.f47480z.get();
            if (zVar != null) {
                zVar.b(exc);
            }
            b0<T> b0Var = this.A.get();
            if (b0Var != null) {
                b0Var.b(exc);
            }
            Iterator<b0<T>> it = this.f47474t.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f47478x.c(exc);
        } catch (Throwable th2) {
            this.f47478x.c(exc);
            throw th2;
        }
    }

    @Override // d70.a
    public void x0() throws HttpException, IOException {
        if (this.f47307a.isDebugEnabled()) {
            this.f47307a.debug("[exchange: " + L() + "] start execution");
        }
        HttpRoute httpRoute = new HttpRoute(this.f47472r);
        w0(httpRoute);
        this.f47477w.setAttribute("http.target_host", this.f47472r);
        this.f47477w.setAttribute("http.route", httpRoute);
        o0();
    }

    public void z0() {
        q();
    }
}
