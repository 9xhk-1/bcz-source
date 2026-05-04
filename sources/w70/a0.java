package w70;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final c80.j f95470a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.a f95471b;

    /* renamed from: c, reason: collision with root package name */
    public final org.apache.http.c f95472c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T, E extends b80.e<HttpHost, m70.h>> implements u60.b<E> {

        /* renamed from: a, reason: collision with root package name */
        public final u60.a<List<T>> f95473a;

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends z> f95474b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends b0<T>> f95475c;

        /* renamed from: d, reason: collision with root package name */
        public final b80.c<HttpHost, E> f95476d;

        /* renamed from: e, reason: collision with root package name */
        public final HttpContext f95477e;

        public a(u60.a<List<T>> aVar, List<? extends z> list, List<? extends b0<T>> list2, b80.c<HttpHost, E> cVar, HttpContext httpContext) {
            this.f95473a = aVar;
            this.f95474b = list;
            this.f95475c = list2;
            this.f95476d = cVar;
            this.f95477e = httpContext;
        }

        @Override // u60.b
        public void a() {
            try {
                try {
                    Iterator<? extends b0<T>> it = this.f95475c.iterator();
                    while (it.hasNext()) {
                        it.next().cancel();
                    }
                } finally {
                    e();
                }
            } finally {
                this.f95473a.cancel(true);
            }
        }

        @Override // u60.b
        public void b(Exception exc) {
            try {
                try {
                    Iterator<? extends b0<T>> it = this.f95475c.iterator();
                    while (it.hasNext()) {
                        it.next().b(exc);
                    }
                } finally {
                    e();
                }
            } finally {
                this.f95473a.c(exc);
            }
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(E e11) {
            if (this.f95473a.isDone()) {
                this.f95476d.a(e11, true);
                return;
            }
            m70.h hVar = (m70.h) e11.b();
            a0.this.o(new q0(this.f95474b, this.f95475c, a0.this.new c(this.f95473a, e11, this.f95476d), this.f95477e, hVar, a0.this.f95470a, a0.this.f95471b), hVar);
        }

        public void e() {
            Iterator<? extends z> it = this.f95474b.iterator();
            while (it.hasNext()) {
                a0.this.e(it.next());
            }
            Iterator<? extends b0<T>> it2 = this.f95475c.iterator();
            while (it2.hasNext()) {
                a0.this.e(it2.next());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T, E extends b80.e<HttpHost, m70.h>> implements u60.b<E> {

        /* renamed from: a, reason: collision with root package name */
        public final u60.a<T> f95479a;

        /* renamed from: b, reason: collision with root package name */
        public final z f95480b;

        /* renamed from: c, reason: collision with root package name */
        public final b0<T> f95481c;

        /* renamed from: d, reason: collision with root package name */
        public final b80.c<HttpHost, E> f95482d;

        /* renamed from: e, reason: collision with root package name */
        public final HttpContext f95483e;

        public b(u60.a<T> aVar, z zVar, b0<T> b0Var, b80.c<HttpHost, E> cVar, HttpContext httpContext) {
            this.f95479a = aVar;
            this.f95480b = zVar;
            this.f95481c = b0Var;
            this.f95482d = cVar;
            this.f95483e = httpContext;
        }

        @Override // u60.b
        public void a() {
            try {
                try {
                    this.f95481c.cancel();
                } finally {
                    e();
                }
            } finally {
                this.f95479a.cancel(true);
            }
        }

        @Override // u60.b
        public void b(Exception exc) {
            try {
                try {
                    this.f95481c.b(exc);
                } finally {
                    e();
                }
            } finally {
                this.f95479a.c(exc);
            }
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(E e11) {
            if (this.f95479a.isDone()) {
                this.f95482d.a(e11, true);
                return;
            }
            m70.h hVar = (m70.h) e11.b();
            a0.this.o(new e(this.f95480b, this.f95481c, a0.this.new c(this.f95479a, e11, this.f95482d), this.f95483e, hVar, a0.this.f95470a, a0.this.f95471b), hVar);
        }

        public void e() {
            a0.this.e(this.f95480b);
            a0.this.e(this.f95481c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T, E extends b80.e<HttpHost, m70.h>> implements u60.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final u60.a<T> f95485a;

        /* renamed from: b, reason: collision with root package name */
        public final E f95486b;

        /* renamed from: c, reason: collision with root package name */
        public final b80.c<HttpHost, E> f95487c;

        public c(u60.a<T> aVar, E e11, b80.c<HttpHost, E> cVar) {
            this.f95485a = aVar;
            this.f95486b = e11;
            this.f95487c = cVar;
        }

        @Override // u60.b
        public void a() {
            try {
                this.f95487c.a(this.f95486b, false);
            } finally {
                this.f95485a.cancel(true);
            }
        }

        @Override // u60.b
        public void b(Exception exc) {
            try {
                this.f95487c.a(this.f95486b, false);
            } finally {
                this.f95485a.c(exc);
            }
        }

        @Override // u60.b
        public void c(T t11) {
            try {
                this.f95487c.a(this.f95486b, true);
            } finally {
                this.f95485a.a(t11);
            }
        }
    }

    @Deprecated
    public a0(c80.j jVar, org.apache.http.a aVar, HttpParams httpParams) {
        this(jVar, aVar);
    }

    public final void e(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e11) {
            p(e11);
        }
    }

    public <T, E extends b80.e<HttpHost, m70.h>> Future<T> f(z zVar, b0<T> b0Var, b80.c<HttpHost, E> cVar) {
        return g(zVar, b0Var, cVar, new c80.a());
    }

    public <T, E extends b80.e<HttpHost, m70.h>> Future<T> g(z zVar, b0<T> b0Var, b80.c<HttpHost, E> cVar, HttpContext httpContext) {
        return h(zVar, b0Var, cVar, httpContext, null);
    }

    public <T, E extends b80.e<HttpHost, m70.h>> Future<T> h(z zVar, b0<T> b0Var, b80.c<HttpHost, E> cVar, HttpContext httpContext, u60.b<T> bVar) {
        e80.a.j(zVar, "HTTP request producer");
        e80.a.j(b0Var, "HTTP response consumer");
        e80.a.j(cVar, "HTTP connection pool");
        e80.a.j(httpContext, "HTTP context");
        u60.a aVar = new u60.a(bVar);
        cVar.b(zVar.getTarget(), null, new b(aVar, zVar, b0Var, cVar, httpContext));
        return aVar;
    }

    public <T, E extends b80.e<HttpHost, m70.h>> Future<T> i(z zVar, b0<T> b0Var, E e11, b80.c<HttpHost, E> cVar, HttpContext httpContext, u60.b<T> bVar) {
        e80.a.j(zVar, "HTTP request producer");
        e80.a.j(b0Var, "HTTP response consumer");
        e80.a.j(cVar, "HTTP connection pool");
        e80.a.j(e11, "Pool entry");
        e80.a.j(httpContext, "HTTP context");
        u60.a aVar = new u60.a(bVar);
        m70.h hVar = (m70.h) e11.b();
        o(new e(zVar, b0Var, new c(aVar, e11, cVar), httpContext, hVar, this.f95470a, this.f95471b), hVar);
        return aVar;
    }

    public <T> Future<T> j(z zVar, b0<T> b0Var, m70.h hVar) {
        return k(zVar, b0Var, hVar, new c80.a());
    }

    public <T> Future<T> k(z zVar, b0<T> b0Var, m70.h hVar, HttpContext httpContext) {
        return l(zVar, b0Var, hVar, httpContext, null);
    }

    public <T> Future<T> l(z zVar, b0<T> b0Var, m70.h hVar, HttpContext httpContext, u60.b<T> bVar) {
        e80.a.j(zVar, "HTTP request producer");
        e80.a.j(b0Var, "HTTP response consumer");
        e80.a.j(hVar, "HTTP connection");
        e80.a.j(httpContext, "HTTP context");
        e eVar = new e(zVar, b0Var, bVar, httpContext, hVar, this.f95470a, this.f95471b);
        o(eVar, hVar);
        return eVar.a();
    }

    public <T, E extends b80.e<HttpHost, m70.h>> Future<List<T>> m(List<z> list, List<b0<T>> list2, E e11, b80.c<HttpHost, E> cVar, HttpContext httpContext, u60.b<List<T>> bVar) {
        e80.a.g(list, "Request producer list");
        e80.a.g(list2, "Response consumer list");
        e80.a.j(cVar, "HTTP connection pool");
        e80.a.j(e11, "Pool entry");
        e80.a.j(httpContext, "HTTP context");
        u60.a aVar = new u60.a(bVar);
        m70.h hVar = (m70.h) e11.b();
        o(new q0(list, list2, new c(aVar, e11, cVar), httpContext, hVar, this.f95470a, this.f95471b), hVar);
        return aVar;
    }

    public <T, E extends b80.e<HttpHost, m70.h>> Future<List<T>> n(HttpHost httpHost, List<? extends z> list, List<? extends b0<T>> list2, b80.c<HttpHost, E> cVar, HttpContext httpContext, u60.b<List<T>> bVar) {
        e80.a.j(httpHost, "HTTP target");
        e80.a.g(list, "Request producer list");
        e80.a.g(list2, "Response consumer list");
        e80.a.j(cVar, "HTTP connection pool");
        e80.a.j(httpContext, "HTTP context");
        u60.a aVar = new u60.a(bVar);
        cVar.b(httpHost, null, new a(aVar, list, list2, cVar, httpContext));
        return aVar;
    }

    public final void o(p pVar, m70.h hVar) {
        HttpContext context = hVar.getContext();
        synchronized (context) {
            try {
                context.b(u.f95682d, pVar);
                if (hVar.isOpen()) {
                    hVar.f();
                } else {
                    pVar.b(new ConnectionClosedException());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar.isDone()) {
            try {
                pVar.close();
            } catch (IOException e11) {
                p(e11);
            }
        }
    }

    public void p(Exception exc) {
        this.f95472c.a(exc);
    }

    public a0(c80.j jVar, org.apache.http.a aVar, org.apache.http.c cVar) {
        this.f95470a = (c80.j) e80.a.j(jVar, "HTTP processor");
        this.f95471b = aVar == null ? x60.i.f97640a : aVar;
        this.f95472c = cVar == null ? org.apache.http.c.f77710a : cVar;
    }

    public a0(c80.j jVar, org.apache.http.a aVar) {
        this(jVar, aVar, (org.apache.http.c) null);
    }

    public a0(c80.j jVar) {
        this(jVar, null);
    }
}
