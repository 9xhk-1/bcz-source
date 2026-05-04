package f70;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.nio.reactor.IOReactorStatus;
import org.apache.http.pool.PoolStats;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class o implements q70.c, b80.d<HttpRoute> {

    /* renamed from: a, reason: collision with root package name */
    public final Log f51196a;

    /* renamed from: b, reason: collision with root package name */
    public final x70.a f51197b;

    /* renamed from: c, reason: collision with root package name */
    public final h f51198c;

    /* renamed from: d, reason: collision with root package name */
    public final r70.b f51199d;

    /* renamed from: e, reason: collision with root package name */
    public final q70.b f51200e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements u60.b<j> {

        /* renamed from: a, reason: collision with root package name */
        public final u60.a<q70.d> f51201a;

        public a(u60.a<q70.d> aVar) {
            this.f51201a = aVar;
        }

        @Override // u60.b
        public void a() {
            o.this.f51196a.debug("Connection request cancelled");
            this.f51201a.cancel(true);
        }

        @Override // u60.b
        public void b(Exception exc) {
            if (o.this.f51196a.isDebugEnabled()) {
                o.this.f51196a.debug("Connection request failed", exc);
            }
            this.f51201a.c(exc);
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(j jVar) {
            if (o.this.f51196a.isDebugEnabled()) {
                o.this.f51196a.debug("Connection leased: " + o.this.y(jVar) + o.this.A(jVar.f()));
            }
            o oVar = o.this;
            if (this.f51201a.a(new l(oVar, oVar.f51200e, jVar))) {
                return;
            }
            o.this.f51198c.a(jVar, true);
        }
    }

    public o(x70.a aVar, r70.b bVar, long j11, TimeUnit timeUnit) {
        Log q11 = org.apache.commons.logging.g.q(getClass());
        this.f51196a = q11;
        e80.a.j(aVar, "I/O reactor");
        e80.a.j(bVar, "Scheme registory");
        e80.a.j(timeUnit, "Time unit");
        this.f51197b = aVar;
        this.f51198c = new h(q11, aVar, bVar, j11, timeUnit);
        this.f51199d = bVar;
        this.f51200e = x();
    }

    public final String A(HttpRoute httpRoute) {
        StringBuilder sb2 = new StringBuilder();
        PoolStats h11 = this.f51198c.h();
        PoolStats n11 = this.f51198c.n(httpRoute);
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

    @Override // b80.d
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(HttpRoute httpRoute) {
        return this.f51198c.k(httpRoute);
    }

    @Override // b80.d
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public PoolStats n(HttpRoute httpRoute) {
        return this.f51198c.n(httpRoute);
    }

    @Override // b80.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void m(HttpRoute httpRoute, int i11) {
        this.f51198c.m(httpRoute, i11);
    }

    @Override // x70.d
    public void b(x70.c cVar) throws IOException {
        this.f51197b.b(cVar);
    }

    @Override // b80.d
    public int e() {
        return this.f51198c.e();
    }

    @Override // b80.d
    public void f(int i11) {
        this.f51198c.f(i11);
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
        return this.f51198c.g();
    }

    @Override // q70.c
    public r70.b getSchemeRegistry() {
        return this.f51199d;
    }

    @Override // x70.d
    public IOReactorStatus getStatus() {
        return this.f51197b.getStatus();
    }

    @Override // b80.d
    public PoolStats h() {
        return this.f51198c.h();
    }

    @Override // x70.d
    public void i(long j11) throws IOException {
        this.f51196a.debug("Connection manager is shutting down");
        this.f51198c.M(j11);
        this.f51196a.debug("Connection manager shut down");
    }

    @Override // q70.c
    public void l(q70.d dVar, long j11, TimeUnit timeUnit) {
        String str;
        e80.a.j(dVar, "HTTP connection");
        if (!(dVar instanceof l)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager");
        }
        e80.a.j(timeUnit, "Time unit");
        l lVar = (l) dVar;
        q70.c w11 = lVar.w();
        if (w11 != null && w11 != this) {
            throw new IllegalArgumentException("Connection not obtained from this manager");
        }
        if (this.f51198c.u()) {
            return;
        }
        synchronized (lVar) {
            j C = lVar.C();
            if (C == null) {
                return;
            }
            try {
                if (lVar.isOpen() && !lVar.isMarkedReusable()) {
                    try {
                        lVar.shutdown();
                    } catch (IOException e11) {
                        if (this.f51196a.isDebugEnabled()) {
                            this.f51196a.debug("I/O exception shutting down released connection", e11);
                        }
                    }
                }
                if (lVar.isOpen()) {
                    C.n(j11, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                    if (this.f51196a.isDebugEnabled()) {
                        if (j11 > 0) {
                            str = "for " + j11 + " " + timeUnit;
                        } else {
                            str = "indefinitely";
                        }
                        this.f51196a.debug("Connection " + y(C) + " can be kept alive " + str);
                    }
                    lVar.setSocketTimeout(0);
                }
                this.f51198c.a(lVar.a(), lVar.isMarkedReusable());
                if (this.f51196a.isDebugEnabled()) {
                    this.f51196a.debug("Connection released: " + y(C) + A(C.f()));
                }
            } catch (Throwable th2) {
                this.f51198c.a(lVar.a(), lVar.isMarkedReusable());
                throw th2;
            }
        }
    }

    @Override // b80.d
    public void o(int i11) {
        this.f51198c.o(i11);
    }

    @Override // q70.c
    public Future<q70.d> p(HttpRoute httpRoute, Object obj, long j11, TimeUnit timeUnit, u60.b<q70.d> bVar) {
        e80.a.j(httpRoute, "HTTP route");
        e80.a.j(timeUnit, "Time unit");
        if (this.f51196a.isDebugEnabled()) {
            this.f51196a.debug("Connection request: " + z(httpRoute, obj) + A(httpRoute));
        }
        u60.a aVar = new u60.a(bVar);
        this.f51198c.x(httpRoute, obj, j11, timeUnit, new a(aVar));
        return aVar;
    }

    @Override // x70.d
    public void shutdown() throws IOException {
        this.f51196a.debug("Connection manager is shutting down");
        this.f51198c.M(2000L);
        this.f51196a.debug("Connection manager shut down");
    }

    public void v() {
        this.f51196a.debug("Closing expired connections");
        this.f51198c.c();
    }

    public void w(long j11, TimeUnit timeUnit) {
        if (this.f51196a.isDebugEnabled()) {
            this.f51196a.debug("Closing connections idle longer than " + j11 + " " + timeUnit);
        }
        this.f51198c.d(j11, timeUnit);
    }

    public q70.b x() {
        return new f();
    }

    public final String y(j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[id: ");
        sb2.append(jVar.e());
        sb2.append("]");
        sb2.append("[route: ");
        sb2.append(jVar.f());
        sb2.append("]");
        Object g11 = jVar.g();
        if (g11 != null) {
            sb2.append("[state: ");
            sb2.append(g11);
            sb2.append("]");
        }
        return sb2.toString();
    }

    public final String z(HttpRoute httpRoute, Object obj) {
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

    public o(x70.a aVar, r70.b bVar) throws IOReactorException {
        this(aVar, bVar, -1L, TimeUnit.MILLISECONDS);
    }

    public o(x70.a aVar) throws IOReactorException {
        this(aVar, f70.a.a());
    }
}
