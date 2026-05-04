package w70;

import androidx.media3.datasource.cache.CacheDataSink;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class t0 extends g0 implements m70.u {

    /* renamed from: g, reason: collision with root package name */
    public final org.apache.http.r f95656g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f95657h;

    /* renamed from: i, reason: collision with root package name */
    public c80.p f95658i;

    /* renamed from: j, reason: collision with root package name */
    public c80.i f95659j;

    /* renamed from: k, reason: collision with root package name */
    public final int f95660k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HttpRequest f95661a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f95662b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m70.r f95663c;

        public a(HttpRequest httpRequest, b bVar, m70.r rVar) {
            this.f95661a = httpRequest;
            this.f95662b = bVar;
            this.f95663c = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                t0.this.A(this.f95661a, this.f95662b, this.f95663c);
            } catch (IOException e11) {
                t0.this.x(this.f95663c, e11);
                o oVar = t0.this.f95588e;
                if (oVar != null) {
                    oVar.d(e11, this.f95663c);
                }
            } catch (HttpException e12) {
                t0.this.x(this.f95663c, e12);
                o oVar2 = t0.this.f95588e;
                if (oVar2 != null) {
                    oVar2.c(e12, this.f95663c);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f95665h = -1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f95666i = 0;

        /* renamed from: j, reason: collision with root package name */
        public static final int f95667j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f95668k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f95669l = 4;

        /* renamed from: m, reason: collision with root package name */
        public static final int f95670m = 8;

        /* renamed from: n, reason: collision with root package name */
        public static final int f95671n = 16;

        /* renamed from: o, reason: collision with root package name */
        public static final int f95672o = 32;

        /* renamed from: p, reason: collision with root package name */
        public static final int f95673p = 32;

        /* renamed from: a, reason: collision with root package name */
        public final z70.h f95674a;

        /* renamed from: b, reason: collision with root package name */
        public final z70.i f95675b;

        /* renamed from: c, reason: collision with root package name */
        public volatile int f95676c = 0;

        /* renamed from: d, reason: collision with root package name */
        public volatile int f95677d = 0;

        /* renamed from: e, reason: collision with root package name */
        public volatile HttpRequest f95678e;

        /* renamed from: f, reason: collision with root package name */
        public volatile HttpResponse f95679f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f95680g;

        public b(int i11, m70.g gVar, z70.b bVar) {
            this.f95674a = new z70.h(i11, gVar, bVar);
            this.f95675b = new z70.i(i11, gVar, bVar);
        }

        public void a() {
            this.f95674a.w();
            this.f95675b.w();
            this.f95676c = -1;
            this.f95677d = -1;
        }

        public z70.c b() {
            return this.f95674a;
        }

        public int c() {
            return this.f95676c;
        }

        public z70.d d() {
            return this.f95675b;
        }

        public int e() {
            return this.f95677d;
        }

        public HttpRequest f() {
            return this.f95678e;
        }

        public HttpResponse g() {
            return this.f95679f;
        }

        public boolean h() {
            return this.f95680g;
        }

        public void i() {
            this.f95674a.reset();
            this.f95678e = null;
            this.f95676c = 0;
        }

        public void j() {
            this.f95675b.reset();
            this.f95679f = null;
            this.f95677d = 0;
            this.f95680g = false;
        }

        public void k(boolean z11) {
            this.f95680g = z11;
        }

        public void l(int i11) {
            this.f95676c = i11;
        }

        public void m(int i11) {
            this.f95677d = i11;
        }

        public void n(HttpRequest httpRequest) {
            this.f95678e = httpRequest;
        }

        public void o(HttpResponse httpResponse) {
            this.f95679f = httpResponse;
        }

        public void p() {
            this.f95674a.B();
            this.f95675b.z();
            this.f95676c = -1;
            this.f95677d = -1;
        }
    }

    public t0(c80.j jVar, org.apache.http.r rVar, org.apache.http.a aVar, z70.b bVar, Executor executor, HttpParams httpParams) {
        super(jVar, aVar, bVar, httpParams);
        e80.a.j(rVar, "Response factory");
        e80.a.j(executor, "Executor");
        this.f95656g = rVar;
        this.f95657h = executor;
        this.f95660k = this.f95587d.getIntParameter(u70.a.f91882a, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    private void z(HttpException httpException, HttpResponse httpResponse) {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.e(501);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.e(505);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.e(400);
        } else {
            httpResponse.e(500);
        }
        w60.d dVar = new w60.d(e80.d.a(httpException.getMessage()));
        dVar.i("text/plain; charset=US-ASCII");
        httpResponse.setEntity(dVar);
    }

    public final void A(HttpRequest httpRequest, b bVar, m70.r rVar) throws HttpException, IOException {
        HttpResponse httpResponse;
        c80.m mVar;
        HttpContext context = rVar.getContext();
        synchronized (bVar) {
            while (true) {
                try {
                    int e11 = bVar.e();
                    if (e11 == 0) {
                        bVar.l(1);
                        bVar.n(httpRequest);
                        httpRequest.i(new a80.d(httpRequest.getParams(), this.f95587d));
                        context.b("http.connection", rVar);
                        context.b("http.request", httpRequest);
                        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
                        ProtocolVersion protocolVersion2 = HttpVersion.HTTP_1_1;
                        if (protocolVersion.lessEquals(protocolVersion2)) {
                            protocolVersion2 = protocolVersion;
                        }
                        boolean z11 = httpRequest instanceof org.apache.http.l;
                        if (z11) {
                            org.apache.http.l lVar = (org.apache.http.l) httpRequest;
                            if (lVar.expectContinue()) {
                                httpResponse = this.f95656g.a(protocolVersion2, 100, context);
                                httpResponse.i(new a80.d(httpResponse.getParams(), this.f95587d));
                                c80.i iVar = this.f95659j;
                                if (iVar != null) {
                                    try {
                                        iVar.a(httpRequest, httpResponse, context);
                                    } catch (HttpException e12) {
                                        HttpResponse a11 = this.f95656g.a(HttpVersion.HTTP_1_0, 500, context);
                                        a11.i(new a80.d(a11.getParams(), this.f95587d));
                                        z(e12, a11);
                                        httpResponse = a11;
                                    }
                                }
                                synchronized (bVar) {
                                    try {
                                        if (httpResponse.n().getStatusCode() < 200) {
                                            bVar.o(httpResponse);
                                            rVar.f();
                                            while (true) {
                                                int e13 = bVar.e();
                                                if (e13 == 8) {
                                                    bVar.j();
                                                    httpResponse = null;
                                                    break;
                                                } else if (e13 == -1) {
                                                    return;
                                                } else {
                                                    bVar.wait();
                                                }
                                            }
                                        } else {
                                            lVar.setEntity(null);
                                            rVar.e();
                                            bVar.k(true);
                                        }
                                    } catch (InterruptedException unused) {
                                        bVar.p();
                                        return;
                                    } finally {
                                    }
                                }
                            } else {
                                httpResponse = null;
                            }
                            if (lVar.getEntity() != null) {
                                lVar.setEntity(new t70.d(lVar.getEntity(), bVar.b()));
                            }
                        } else {
                            httpResponse = null;
                        }
                        if (httpResponse == null) {
                            httpResponse = this.f95656g.a(protocolVersion2, 200, context);
                            httpResponse.i(new a80.d(httpResponse.getParams(), this.f95587d));
                            context.b("http.response", httpResponse);
                            try {
                                this.f95584a.process(httpRequest, context);
                                if (this.f95658i != null) {
                                    mVar = this.f95658i.a(httpRequest.getRequestLine().getUri());
                                } else {
                                    mVar = null;
                                }
                                if (mVar != null) {
                                    mVar.a(httpRequest, httpResponse, context);
                                } else {
                                    httpResponse.e(501);
                                }
                            } catch (HttpException e14) {
                                HttpResponse a12 = this.f95656g.a(HttpVersion.HTTP_1_0, 500, context);
                                a12.i(new a80.d(a12.getParams(), this.f95587d));
                                z(e14, a12);
                                httpResponse = a12;
                            }
                        }
                        if (z11) {
                            e80.e.a(((org.apache.http.l) httpRequest).getEntity());
                        }
                        bVar.i();
                        this.f95584a.g(httpResponse, context);
                        if (!s(httpRequest, httpResponse)) {
                            httpResponse.setEntity(null);
                        }
                        bVar.o(httpResponse);
                        rVar.f();
                        if (httpResponse.getEntity() != null) {
                            t70.g gVar = new t70.g(bVar.d());
                            httpResponse.getEntity().writeTo(gVar);
                            gVar.flush();
                            gVar.close();
                        }
                        synchronized (bVar) {
                            while (true) {
                                try {
                                    int e15 = bVar.e();
                                    if (e15 == 32) {
                                        bVar.j();
                                        rVar.j();
                                        bVar.notifyAll();
                                        return;
                                    } else if (e15 == -1) {
                                        return;
                                    } else {
                                        bVar.wait();
                                    }
                                } catch (InterruptedException unused2) {
                                    bVar.p();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } else if (e11 == -1) {
                        return;
                    } else {
                        bVar.wait();
                    }
                } catch (InterruptedException unused3) {
                    bVar.p();
                    return;
                }
            }
        }
    }

    public void B(c80.i iVar) {
        this.f95659j = iVar;
    }

    public void C(c80.p pVar) {
        this.f95658i = pVar;
    }

    @Override // m70.u
    public void a(m70.r rVar) {
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        try {
            synchronized (bVar) {
                try {
                    if (bVar.h()) {
                        rVar.M();
                        bVar.k(false);
                    }
                    HttpResponse g11 = bVar.g();
                    if (bVar.e() == 0 && g11 != null && !rVar.t0()) {
                        rVar.t(g11);
                        int statusCode = g11.n().getStatusCode();
                        HttpEntity entity = g11.getEntity();
                        if (statusCode < 200 || entity != null) {
                            bVar.m(8);
                        } else {
                            bVar.m(32);
                            if (!this.f95585b.a(g11, context)) {
                                rVar.close();
                            }
                        }
                    }
                    bVar.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(rVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, rVar);
            }
        } catch (HttpException e12) {
            t(rVar, e12);
            o oVar2 = this.f95588e;
            if (oVar2 != null) {
                oVar2.c(e12, rVar);
            }
        }
    }

    @Override // m70.u
    public void c(m70.r rVar) {
        rVar.getContext().b(g0.f95583f, new b(this.f95660k, rVar, this.f95586c));
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.a(rVar);
        }
    }

    @Override // m70.u
    public void f(m70.r rVar, m70.c cVar) {
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        try {
            synchronized (bVar) {
                try {
                    HttpResponse g11 = bVar.g();
                    bVar.d().k(cVar);
                    if (cVar.e()) {
                        bVar.m(32);
                        if (!this.f95585b.a(g11, context)) {
                            rVar.close();
                        }
                    } else {
                        bVar.m(16);
                    }
                    bVar.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(rVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, rVar);
            }
        }
    }

    @Override // m70.u
    public void g(m70.r rVar) {
        HttpContext context = rVar.getContext();
        HttpRequest n02 = rVar.n0();
        b bVar = (b) context.getAttribute(g0.f95583f);
        synchronized (bVar) {
            try {
                if (!(n02 instanceof org.apache.http.l) || ((org.apache.http.l) n02).getEntity() == null) {
                    rVar.e();
                }
                this.f95657h.execute(new a(n02, bVar, rVar));
                bVar.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m70.u
    public void j(m70.r rVar, m70.a aVar) {
        b bVar = (b) rVar.getContext().getAttribute(g0.f95583f);
        try {
            synchronized (bVar) {
                try {
                    bVar.b().h(aVar);
                    if (aVar.e()) {
                        bVar.l(4);
                    } else {
                        bVar.l(2);
                    }
                    bVar.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(rVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, rVar);
            }
        }
    }

    @Override // m70.u
    public void l(m70.r rVar) {
        b bVar = (b) rVar.getContext().getAttribute(g0.f95583f);
        if (bVar != null) {
            synchronized (bVar) {
                bVar.a();
                bVar.notifyAll();
            }
        }
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.b(rVar);
        }
    }

    @Override // m70.u
    public void n(m70.r rVar) {
        v(rVar);
    }

    @Override // m70.u
    public void q(m70.r rVar, HttpException httpException) {
        if (rVar.t0()) {
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.c(httpException, rVar);
                return;
            }
            return;
        }
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        try {
            HttpResponse a11 = this.f95656g.a(HttpVersion.HTTP_1_0, 500, context);
            a11.i(new a80.d(a11.getParams(), this.f95587d));
            z(httpException, a11);
            a11.setEntity(null);
            this.f95584a.g(a11, context);
            synchronized (bVar) {
                bVar.o(a11);
                rVar.f();
            }
        } catch (IOException e11) {
            x(rVar, e11);
            o oVar2 = this.f95588e;
            if (oVar2 != null) {
                oVar2.d(e11, rVar);
            }
        } catch (HttpException e12) {
            t(rVar, e12);
            o oVar3 = this.f95588e;
            if (oVar3 != null) {
                oVar3.c(e12, rVar);
            }
        }
    }

    @Override // m70.u
    public void r(m70.r rVar, IOException iOException) {
        x(rVar, iOException);
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.d(iOException, rVar);
        }
    }

    @Override // w70.g0
    public void x(m70.l lVar, Throwable th2) {
        b bVar = (b) lVar.getContext().getAttribute(g0.f95583f);
        super.x(lVar, th2);
        if (bVar != null) {
            bVar.p();
        }
    }

    public t0(c80.j jVar, org.apache.http.r rVar, org.apache.http.a aVar, Executor executor, HttpParams httpParams) {
        this(jVar, rVar, aVar, z70.e.f101089a, executor, httpParams);
    }
}
