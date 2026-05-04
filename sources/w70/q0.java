package w70;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@p0
/* loaded from: classes9.dex */
public class q0<T> implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Queue<z> f95613a;

    /* renamed from: b, reason: collision with root package name */
    public final Queue<b0<T>> f95614b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue<HttpRequest> f95615c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue<T> f95616d;

    /* renamed from: e, reason: collision with root package name */
    public final u60.a<List<T>> f95617e;

    /* renamed from: f, reason: collision with root package name */
    public final HttpContext f95618f;

    /* renamed from: g, reason: collision with root package name */
    public final m70.h f95619g;

    /* renamed from: h, reason: collision with root package name */
    public final c80.j f95620h;

    /* renamed from: i, reason: collision with root package name */
    public final org.apache.http.a f95621i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference<z> f95622j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference<b0<T>> f95623k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f95624l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f95625m;

    public q0(List<? extends z> list, List<? extends b0<T>> list2, u60.b<List<T>> bVar, HttpContext httpContext, m70.h hVar, c80.j jVar, org.apache.http.a aVar) {
        e80.a.g(list, "Request producer list");
        e80.a.g(list2, "Response consumer list");
        e80.a.a(list.size() == list2.size(), "Number of request producers does not match that of response consumers");
        this.f95613a = new ConcurrentLinkedQueue(list);
        this.f95614b = new ConcurrentLinkedQueue(list2);
        this.f95615c = new ConcurrentLinkedQueue();
        this.f95616d = new ConcurrentLinkedQueue();
        this.f95617e = new u60.a<>(bVar);
        HttpContext httpContext2 = (HttpContext) e80.a.j(httpContext, "HTTP context");
        this.f95618f = httpContext2;
        m70.h hVar2 = (m70.h) e80.a.j(hVar, "HTTP connection");
        this.f95619g = hVar2;
        this.f95620h = (c80.j) e80.a.j(jVar, "HTTP processor");
        this.f95621i = aVar == null ? x60.i.f97640a : aVar;
        httpContext2.b("http.connection", hVar2);
        this.f95622j = new AtomicReference<>(null);
        this.f95623k = new AtomicReference<>(null);
        this.f95624l = new AtomicBoolean(false);
        this.f95625m = new AtomicBoolean(false);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void e() {
        a(this.f95622j.getAndSet(null));
        a(this.f95623k.getAndSet(null));
        while (!this.f95613a.isEmpty()) {
            a(this.f95613a.remove());
        }
        while (!this.f95614b.isEmpty()) {
            a(this.f95614b.remove());
        }
        this.f95615c.clear();
        this.f95616d.clear();
    }

    @Override // w70.p
    public void B(HttpResponse httpResponse) throws IOException, HttpException {
        e80.b.a(this.f95623k.get() == null, "Inconsistent state: response consumer is not null");
        b0<T> poll = this.f95614b.poll();
        e80.b.a(poll != null, "Inconsistent state: response consumer queue is empty");
        this.f95623k.set(poll);
        HttpRequest poll2 = this.f95615c.poll();
        e80.b.a(poll2 != null, "Inconsistent state: request queue is empty");
        this.f95618f.b("http.request", poll2);
        this.f95618f.b("http.response", httpResponse);
        this.f95620h.g(httpResponse, this.f95618f);
        poll.B(httpResponse);
        this.f95624l.set(this.f95621i.a(httpResponse, this.f95618f));
    }

    @Override // w70.p
    public void B2() throws IOException {
        b0<T> andSet = this.f95623k.getAndSet(null);
        e80.b.a(andSet != null, "Inconsistent state: response consumer is null");
        try {
            if (!this.f95624l.get()) {
                this.f95619g.close();
            }
            andSet.p(this.f95618f);
            T result = andSet.getResult();
            Exception m11 = andSet.m();
            if (result != null) {
                this.f95616d.add(result);
            } else {
                this.f95617e.c(m11);
                this.f95619g.shutdown();
            }
            if (!this.f95619g.isOpen() && this.f95625m.compareAndSet(false, true)) {
                e();
            }
            if (this.f95617e.isDone() || !this.f95614b.isEmpty()) {
                return;
            }
            this.f95617e.a(new ArrayList(this.f95616d));
            this.f95616d.clear();
        } catch (RuntimeException e11) {
            b(e11);
            throw e11;
        }
    }

    @Override // w70.p
    public void D5() {
        z andSet = this.f95622j.getAndSet(null);
        e80.b.a(andSet != null, "Inconsistent state: request producer is null");
        andSet.s(this.f95618f);
    }

    @Override // w70.p
    public HttpRequest G() throws IOException, HttpException {
        e80.b.a(this.f95622j.get() == null, "Inconsistent state: request producer is not null");
        z poll = this.f95613a.poll();
        if (poll == null) {
            return null;
        }
        this.f95622j.set(poll);
        HttpRequest G = poll.G();
        this.f95620h.process(G, this.f95618f);
        this.f95615c.add(G);
        return G;
    }

    @Override // w70.p
    public void W5() {
        b(new ConnectionClosedException());
    }

    @Override // w70.p
    public void b(Exception exc) {
        if (this.f95625m.compareAndSet(false, true)) {
            try {
                z zVar = this.f95622j.get();
                if (zVar != null) {
                    zVar.b(exc);
                }
                b0<T> b0Var = this.f95623k.get();
                if (b0Var != null) {
                    b0Var.b(exc);
                }
                try {
                    this.f95617e.c(exc);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f95617e.c(exc);
                    throw th2;
                } finally {
                }
            }
        }
    }

    public Future<List<T>> c() {
        return this.f95617e;
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        boolean z11 = false;
        try {
            if (!this.f95625m.compareAndSet(false, true)) {
                return false;
            }
            try {
                b0<T> b0Var = this.f95623k.get();
                if (b0Var != null) {
                    if (b0Var.cancel()) {
                        z11 = true;
                    }
                }
                return z11;
            } finally {
                this.f95617e.cancel();
            }
        } finally {
            e();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f95625m.compareAndSet(false, true)) {
            e();
            if (this.f95617e.isDone()) {
                return;
            }
            this.f95617e.cancel();
        }
    }

    @Override // w70.p
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        z zVar = this.f95622j.get();
        e80.b.a(zVar != null, "Inconsistent state: request producer is null");
        zVar.d(cVar, gVar);
    }

    @Override // w70.p
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        b0<T> b0Var = this.f95623k.get();
        e80.b.a(b0Var != null, "Inconsistent state: response consumer is null");
        b0Var.h(aVar, gVar);
    }

    @Override // w70.p
    public boolean isDone() {
        return this.f95617e.isDone();
    }

    public q0(List<? extends z> list, List<? extends b0<T>> list2, HttpContext httpContext, m70.h hVar, c80.j jVar) {
        this(list, list2, null, httpContext, hVar, jVar, null);
    }
}
