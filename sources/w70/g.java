package w70;

import java.io.IOException;
import java.util.concurrent.Future;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class g<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final z f95576a;

    /* renamed from: b, reason: collision with root package name */
    public final b0<T> f95577b;

    /* renamed from: c, reason: collision with root package name */
    public final u60.a<T> f95578c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpContext f95579d;

    /* renamed from: e, reason: collision with root package name */
    public final c80.j f95580e;

    /* renamed from: f, reason: collision with root package name */
    public final org.apache.http.a f95581f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95582g;

    public g(z zVar, b0<T> b0Var, u60.b<T> bVar, HttpContext httpContext, c80.j jVar, org.apache.http.a aVar, HttpParams httpParams) {
        e80.a.j(zVar, "Request producer");
        e80.a.j(b0Var, "Response consumer");
        e80.a.j(httpContext, "HTTP context");
        e80.a.j(jVar, "HTTP processor");
        e80.a.j(aVar, "Connection reuse strategy");
        e80.a.j(httpParams, "HTTP parameters");
        this.f95576a = zVar;
        this.f95577b = b0Var;
        this.f95578c = new u60.a<>(bVar);
        this.f95579d = httpContext;
        this.f95580e = jVar;
        this.f95581f = aVar;
    }

    private void c() {
        try {
            this.f95577b.close();
        } catch (IOException unused) {
        }
        try {
            this.f95576a.close();
        } catch (IOException unused2) {
        }
    }

    @Override // w70.b0
    public void B(HttpResponse httpResponse) throws IOException, HttpException {
        this.f95577b.B(httpResponse);
    }

    @Override // w70.z
    public HttpRequest G() throws IOException, HttpException {
        return this.f95576a.G();
    }

    @Override // w70.t
    public c80.j P4() {
        return this.f95580e;
    }

    public Future<T> a() {
        return this.f95578c;
    }

    @Override // w70.z, w70.b0
    public void b(Exception exc) {
        try {
            if (!this.f95582g) {
                this.f95576a.b(exc);
            }
            this.f95577b.b(exc);
            try {
                this.f95578c.c(exc);
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f95578c.c(exc);
                throw th2;
            } finally {
            }
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        try {
            boolean cancel = this.f95577b.cancel();
            this.f95578c.cancel();
            c();
            return cancel;
        } catch (RuntimeException e11) {
            b(e11);
            throw e11;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c();
        if (this.f95578c.isDone()) {
            return;
        }
        this.f95578c.cancel();
    }

    @Override // w70.z
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        this.f95576a.d(cVar, gVar);
    }

    @Override // w70.t
    public HttpContext getContext() {
        return this.f95579d;
    }

    @Override // w70.b0
    public T getResult() {
        return this.f95577b.getResult();
    }

    @Override // w70.z
    public HttpHost getTarget() {
        return this.f95576a.getTarget();
    }

    @Override // w70.b0
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        this.f95577b.h(aVar, gVar);
    }

    @Override // w70.b0
    public boolean isDone() {
        return this.f95577b.isDone();
    }

    @Override // w70.t
    public org.apache.http.a k7() {
        return this.f95581f;
    }

    @Override // w70.b0
    public Exception m() {
        return this.f95577b.m();
    }

    @Override // w70.z
    public boolean n() {
        return false;
    }

    @Override // w70.b0
    public void p(HttpContext httpContext) {
        try {
            this.f95577b.p(httpContext);
            T result = this.f95577b.getResult();
            Exception m11 = this.f95577b.m();
            if (m11 == null) {
                this.f95578c.a(result);
            } else {
                this.f95578c.c(m11);
            }
            c();
        } catch (RuntimeException e11) {
            b(e11);
            throw e11;
        }
    }

    @Override // w70.z
    public void s(HttpContext httpContext) {
        this.f95576a.s(httpContext);
        this.f95582g = true;
    }

    public g(z zVar, b0<T> b0Var, HttpContext httpContext, c80.j jVar, org.apache.http.a aVar, HttpParams httpParams) {
        this(zVar, b0Var, null, httpContext, jVar, aVar, httpParams);
    }

    @Override // w70.z
    public void g0() {
    }
}
