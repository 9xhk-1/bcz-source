package w70;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e<T> implements p {

    /* renamed from: a, reason: collision with root package name */
    public final z f95557a;

    /* renamed from: b, reason: collision with root package name */
    public final b0<T> f95558b;

    /* renamed from: c, reason: collision with root package name */
    public final u60.a<T> f95559c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpContext f95560d;

    /* renamed from: e, reason: collision with root package name */
    public final m70.h f95561e;

    /* renamed from: f, reason: collision with root package name */
    public final c80.j f95562f;

    /* renamed from: g, reason: collision with root package name */
    public final org.apache.http.a f95563g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f95564h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f95565i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f95566j;

    public e(z zVar, b0<T> b0Var, u60.b<T> bVar, HttpContext httpContext, m70.h hVar, c80.j jVar, org.apache.http.a aVar) {
        this.f95557a = (z) e80.a.j(zVar, "Request producer");
        this.f95558b = (b0) e80.a.j(b0Var, "Response consumer");
        this.f95559c = new u60.a<>(bVar);
        this.f95560d = (HttpContext) e80.a.j(httpContext, "HTTP context");
        this.f95561e = (m70.h) e80.a.j(hVar, "HTTP connection");
        this.f95562f = (c80.j) e80.a.j(jVar, "HTTP processor");
        this.f95563g = aVar == null ? x60.i.f97640a : aVar;
        this.f95564h = new AtomicBoolean(false);
        this.f95565i = new AtomicBoolean(false);
        this.f95566j = new AtomicBoolean(false);
    }

    private void c() {
        try {
            this.f95558b.close();
        } catch (IOException unused) {
        }
        try {
            this.f95557a.close();
        } catch (IOException unused2) {
        }
    }

    @Override // w70.p
    public void B(HttpResponse httpResponse) throws IOException, HttpException {
        this.f95560d.b("http.response", httpResponse);
        this.f95562f.g(httpResponse, this.f95560d);
        this.f95558b.B(httpResponse);
        this.f95565i.set(this.f95563g.a(httpResponse, this.f95560d));
    }

    @Override // w70.p
    public void B2() throws IOException {
        try {
            if (!this.f95565i.get()) {
                this.f95561e.close();
            }
            this.f95558b.p(this.f95560d);
            T result = this.f95558b.getResult();
            Exception m11 = this.f95558b.m();
            if (result != null) {
                this.f95559c.a(result);
            } else {
                this.f95559c.c(m11);
            }
            if (this.f95566j.compareAndSet(false, true)) {
                c();
            }
        } catch (RuntimeException e11) {
            b(e11);
            throw e11;
        }
    }

    @Override // w70.p
    public void D5() {
        this.f95557a.s(this.f95560d);
        this.f95564h.set(true);
    }

    @Override // w70.p
    public HttpRequest G() throws IOException, HttpException {
        if (isDone()) {
            return null;
        }
        HttpRequest G = this.f95557a.G();
        this.f95560d.b("http.request", G);
        this.f95560d.b("http.connection", this.f95561e);
        this.f95562f.process(G, this.f95560d);
        return G;
    }

    @Override // w70.p
    public void W5() {
        b(new ConnectionClosedException());
    }

    public Future<T> a() {
        return this.f95559c;
    }

    @Override // w70.p
    public void b(Exception exc) {
        if (this.f95566j.compareAndSet(false, true)) {
            try {
                if (!this.f95564h.get()) {
                    this.f95557a.b(exc);
                }
                this.f95558b.b(exc);
                try {
                    this.f95559c.c(exc);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f95559c.c(exc);
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        try {
            if (!this.f95566j.compareAndSet(false, true)) {
                return false;
            }
            try {
                return this.f95558b.cancel();
            } finally {
                this.f95559c.cancel();
            }
        } finally {
            c();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f95566j.compareAndSet(false, true)) {
            c();
            if (this.f95559c.isDone()) {
                return;
            }
            this.f95559c.cancel();
        }
    }

    @Override // w70.p
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        this.f95557a.d(cVar, gVar);
    }

    @Override // w70.p
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        this.f95558b.h(aVar, gVar);
    }

    @Override // w70.p
    public boolean isDone() {
        return this.f95558b.isDone();
    }

    public e(z zVar, b0<T> b0Var, HttpContext httpContext, m70.h hVar, c80.j jVar) {
        this(zVar, b0Var, null, httpContext, hVar, jVar, null);
    }
}
