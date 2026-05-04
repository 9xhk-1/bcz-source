package w70;

import androidx.media3.datasource.cache.CacheDataSink;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class s0 extends g0 implements m70.j {

    /* renamed from: g, reason: collision with root package name */
    public e0 f95626g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f95627h;

    /* renamed from: i, reason: collision with root package name */
    public final int f95628i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f95629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ org.apache.http.l f95630b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m70.h f95631c;

        public a(c cVar, org.apache.http.l lVar, m70.h hVar) {
            this.f95629a = cVar;
            this.f95630b = lVar;
            this.f95631c = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (this.f95629a) {
                    while (true) {
                        try {
                            int e11 = this.f95629a.e();
                            if (!this.f95629a.i()) {
                                this.f95629a.q(true);
                                t70.g gVar = new t70.g(this.f95629a.d());
                                this.f95630b.getEntity().writeTo(gVar);
                                gVar.flush();
                                gVar.close();
                                synchronized (this.f95629a) {
                                    this.f95629a.q(false);
                                    this.f95629a.notifyAll();
                                }
                                return;
                            }
                            if (e11 == -1) {
                                return;
                            } else {
                                this.f95629a.wait();
                            }
                        } catch (InterruptedException unused) {
                            this.f95629a.r();
                            return;
                        }
                    }
                }
            } catch (IOException e12) {
                s0.this.x(this.f95631c, e12);
                o oVar = s0.this.f95588e;
                if (oVar != null) {
                    oVar.d(e12, this.f95631c);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f95633a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HttpResponse f95634b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HttpContext f95635c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m70.h f95636d;

        public b(c cVar, HttpResponse httpResponse, HttpContext httpContext, m70.h hVar) {
            this.f95633a = cVar;
            this.f95634b = httpResponse;
            this.f95635c = httpContext;
            this.f95636d = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
        
            r4.f95633a.q(true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0019, code lost:
        
            r4.f95637e.f95626g.d(r4.f95634b, r4.f95635c);
            r0 = r4.f95633a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
        
            r1 = r4.f95633a.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        
            if (r1 != 64) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
        
            if (r1 != (-1)) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
        
            r4.f95633a.wait();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x003e, code lost:
        
            r4.f95633a.r();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                w70.s0$c r0 = r4.f95633a     // Catch: java.io.IOException -> L69
                monitor-enter(r0)     // Catch: java.io.IOException -> L69
            L3:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L6b java.lang.InterruptedException -> L77
                int r1 = r1.e()     // Catch: java.lang.Throwable -> L6b java.lang.InterruptedException -> L77
                w70.s0$c r2 = r4.f95633a     // Catch: java.lang.Throwable -> L6b java.lang.InterruptedException -> L77
                boolean r2 = r2.i()     // Catch: java.lang.Throwable -> L6b java.lang.InterruptedException -> L77
                r3 = -1
                if (r2 != 0) goto L6d
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L6b
                r2 = 1
                r1.q(r2)     // Catch: java.lang.Throwable -> L6b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
                w70.s0 r0 = w70.s0.this     // Catch: java.io.IOException -> L69
                w70.e0 r0 = r0.f95626g     // Catch: java.io.IOException -> L69
                org.apache.http.HttpResponse r1 = r4.f95634b     // Catch: java.io.IOException -> L69
                org.apache.http.protocol.HttpContext r2 = r4.f95635c     // Catch: java.io.IOException -> L69
                r0.d(r1, r2)     // Catch: java.io.IOException -> L69
                w70.s0$c r0 = r4.f95633a     // Catch: java.io.IOException -> L69
                monitor-enter(r0)     // Catch: java.io.IOException -> L69
            L27:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L3e
                int r1 = r1.c()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L3e
                r2 = 64
                if (r1 != r2) goto L32
                goto L43
            L32:
                if (r1 != r3) goto L38
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                return
            L36:
                r1 = move-exception
                goto L67
            L38:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L3e
                r1.wait()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L3e
                goto L27
            L3e:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36
                r1.r()     // Catch: java.lang.Throwable -> L36
            L43:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36
                r1.j()     // Catch: java.lang.Throwable -> L36
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36
                r1.k()     // Catch: java.lang.Throwable -> L36
                m70.h r1 = r4.f95636d     // Catch: java.lang.Throwable -> L36
                boolean r1 = r1.isOpen()     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L5a
                m70.h r1 = r4.f95636d     // Catch: java.lang.Throwable -> L36
                r1.f()     // Catch: java.lang.Throwable -> L36
            L5a:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36
                r2 = 0
                r1.q(r2)     // Catch: java.lang.Throwable -> L36
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L36
                r1.notifyAll()     // Catch: java.lang.Throwable -> L36
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                goto L92
            L67:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                throw r1     // Catch: java.io.IOException -> L69
            L69:
                r0 = move-exception
                goto L80
            L6b:
                r1 = move-exception
                goto L7e
            L6d:
                if (r1 != r3) goto L71
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
                return
            L71:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L6b java.lang.InterruptedException -> L77
                r1.wait()     // Catch: java.lang.Throwable -> L6b java.lang.InterruptedException -> L77
                goto L3
            L77:
                w70.s0$c r1 = r4.f95633a     // Catch: java.lang.Throwable -> L6b
                r1.r()     // Catch: java.lang.Throwable -> L6b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
                goto L92
            L7e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
                throw r1     // Catch: java.io.IOException -> L69
            L80:
                w70.s0 r1 = w70.s0.this
                m70.h r2 = r4.f95636d
                r1.x(r2, r0)
                w70.s0 r1 = w70.s0.this
                w70.o r1 = r1.f95588e
                if (r1 == 0) goto L92
                m70.h r2 = r4.f95636d
                r1.d(r0, r2)
            L92:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w70.s0.b.run():void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: i, reason: collision with root package name */
        public static final int f95638i = -1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f95639j = 0;

        /* renamed from: k, reason: collision with root package name */
        public static final int f95640k = 1;

        /* renamed from: l, reason: collision with root package name */
        public static final int f95641l = 2;

        /* renamed from: m, reason: collision with root package name */
        public static final int f95642m = 4;

        /* renamed from: n, reason: collision with root package name */
        public static final int f95643n = 8;

        /* renamed from: o, reason: collision with root package name */
        public static final int f95644o = 16;

        /* renamed from: p, reason: collision with root package name */
        public static final int f95645p = 32;

        /* renamed from: q, reason: collision with root package name */
        public static final int f95646q = 64;

        /* renamed from: r, reason: collision with root package name */
        public static final int f95647r = 64;

        /* renamed from: a, reason: collision with root package name */
        public final z70.h f95648a;

        /* renamed from: b, reason: collision with root package name */
        public final z70.i f95649b;

        /* renamed from: c, reason: collision with root package name */
        public volatile int f95650c = 0;

        /* renamed from: d, reason: collision with root package name */
        public volatile int f95651d = 0;

        /* renamed from: e, reason: collision with root package name */
        public volatile HttpRequest f95652e;

        /* renamed from: f, reason: collision with root package name */
        public volatile HttpResponse f95653f;

        /* renamed from: g, reason: collision with root package name */
        public volatile int f95654g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f95655h;

        public c(int i11, m70.g gVar, z70.b bVar) {
            this.f95648a = new z70.h(i11, gVar, bVar);
            this.f95649b = new z70.i(i11, gVar, bVar);
        }

        public void a() {
            this.f95648a.w();
            this.f95649b.w();
            this.f95650c = -1;
            this.f95651d = -1;
        }

        public z70.c b() {
            return this.f95648a;
        }

        public int c() {
            return this.f95650c;
        }

        public z70.d d() {
            return this.f95649b;
        }

        public int e() {
            return this.f95651d;
        }

        public HttpRequest f() {
            return this.f95652e;
        }

        public HttpResponse g() {
            return this.f95653f;
        }

        public int h() {
            return this.f95654g;
        }

        public boolean i() {
            return this.f95655h;
        }

        public void j() {
            this.f95648a.reset();
            this.f95652e = null;
            this.f95650c = 0;
        }

        public void k() {
            this.f95649b.reset();
            this.f95653f = null;
            this.f95651d = 0;
        }

        public void l(int i11) {
            this.f95650c = i11;
        }

        public void m(int i11) {
            this.f95651d = i11;
        }

        public void n(HttpRequest httpRequest) {
            this.f95652e = httpRequest;
        }

        public void o(HttpResponse httpResponse) {
            this.f95653f = httpResponse;
        }

        public void p(int i11) {
            this.f95654g = i11;
        }

        public void q(boolean z11) {
            this.f95655h = z11;
        }

        public void r() {
            this.f95648a.B();
            this.f95649b.z();
            this.f95650c = -1;
            this.f95651d = -1;
        }
    }

    public s0(c80.j jVar, e0 e0Var, org.apache.http.a aVar, z70.b bVar, Executor executor, HttpParams httpParams) {
        super(jVar, aVar, bVar, httpParams);
        e80.a.j(e0Var, "HTTP request execution handler");
        e80.a.j(executor, "Executor");
        this.f95626g = e0Var;
        this.f95627h = executor;
        this.f95628i = this.f95587d.getIntParameter(u70.a.f91882a, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    private void A(m70.h hVar, Object obj) {
        HttpContext context = hVar.getContext();
        context.b("http.connection", hVar);
        this.f95626g.a(context, obj);
    }

    public final void B(org.apache.http.l lVar, c cVar, m70.h hVar) throws IOException {
        if (lVar.getEntity() != null) {
            this.f95627h.execute(new a(cVar, lVar, hVar));
        }
    }

    @Override // m70.j
    public void b(m70.h hVar, m70.a aVar) {
        HttpContext context = hVar.getContext();
        c cVar = (c) context.getAttribute(g0.f95583f);
        try {
            synchronized (cVar) {
                try {
                    HttpResponse g11 = cVar.g();
                    cVar.b().h(aVar);
                    if (aVar.e()) {
                        cVar.l(64);
                        if (!this.f95585b.a(g11, context)) {
                            hVar.close();
                        }
                    } else {
                        cVar.l(32);
                    }
                    cVar.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(hVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, hVar);
            }
        }
    }

    @Override // m70.j
    public void d(m70.h hVar, m70.c cVar) {
        c cVar2 = (c) hVar.getContext().getAttribute(g0.f95583f);
        try {
            synchronized (cVar2) {
                try {
                    if (cVar2.e() == 2) {
                        hVar.q();
                        return;
                    }
                    cVar2.d().k(cVar);
                    if (cVar.e()) {
                        cVar2.l(8);
                    } else {
                        cVar2.l(4);
                    }
                    cVar2.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(hVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, hVar);
            }
        }
    }

    @Override // m70.j
    public void e(m70.h hVar) {
        HttpContext context = hVar.getContext();
        c cVar = (c) context.getAttribute(g0.f95583f);
        try {
            synchronized (cVar) {
                try {
                    HttpResponse N6 = hVar.N6();
                    N6.i(new a80.d(N6.getParams(), this.f95587d));
                    HttpRequest f11 = cVar.f();
                    int statusCode = N6.n().getStatusCode();
                    if (statusCode < 200) {
                        if (statusCode == 100 && cVar.e() == 2) {
                            cVar.m(1);
                            y(hVar, cVar);
                        }
                        return;
                    }
                    cVar.o(N6);
                    cVar.l(16);
                    if (cVar.e() == 2) {
                        hVar.setSocketTimeout(cVar.h());
                        hVar.K();
                    }
                    if (!s(f11, N6)) {
                        hVar.M();
                        N6.setEntity(null);
                        cVar.l(64);
                        if (!this.f95585b.a(N6, context)) {
                            hVar.close();
                        }
                    }
                    if (N6.getEntity() != null) {
                        N6.setEntity(new t70.d(N6.getEntity(), cVar.b()));
                    }
                    context.b("http.response", N6);
                    this.f95584a.g(N6, context);
                    z(N6, cVar, hVar);
                    cVar.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(hVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, hVar);
            }
        } catch (HttpException e12) {
            t(hVar, e12);
            o oVar2 = this.f95588e;
            if (oVar2 != null) {
                oVar2.c(e12, hVar);
            }
        }
    }

    @Override // m70.j
    public void h(m70.h hVar, Object obj) {
        HttpContext context = hVar.getContext();
        A(hVar, obj);
        context.b(g0.f95583f, new c(this.f95628i, hVar, this.f95586c));
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.a(hVar);
        }
        i(hVar);
    }

    @Override // m70.j
    public void i(m70.h hVar) {
        HttpContext context = hVar.getContext();
        c cVar = (c) context.getAttribute(g0.f95583f);
        try {
            synchronized (cVar) {
                try {
                    if (cVar.e() != 0) {
                        return;
                    }
                    HttpRequest c11 = this.f95626g.c(context);
                    if (c11 == null) {
                        return;
                    }
                    c11.i(new a80.d(c11.getParams(), this.f95587d));
                    context.b("http.request", c11);
                    this.f95584a.process(c11, context);
                    cVar.n(c11);
                    hVar.G5(c11);
                    cVar.m(1);
                    hVar.j();
                    if (c11 instanceof org.apache.http.l) {
                        if (((org.apache.http.l) c11).expectContinue()) {
                            cVar.p(hVar.x());
                            hVar.setSocketTimeout(this.f95587d.getIntParameter(a80.c.f2309h, 3000));
                            cVar.m(2);
                        } else {
                            B((org.apache.http.l) c11, cVar, hVar);
                        }
                    }
                    cVar.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException e11) {
            x(hVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, hVar);
            }
        } catch (HttpException e12) {
            t(hVar, e12);
            o oVar2 = this.f95588e;
            if (oVar2 != null) {
                oVar2.c(e12, hVar);
            }
        }
    }

    @Override // m70.j
    public void k(m70.h hVar) {
        HttpContext context = hVar.getContext();
        c cVar = (c) context.getAttribute(g0.f95583f);
        if (cVar != null) {
            synchronized (cVar) {
                cVar.a();
                cVar.notifyAll();
            }
        }
        this.f95626g.b(context);
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.b(hVar);
        }
    }

    @Override // m70.j
    public void m(m70.h hVar) {
        c cVar = (c) hVar.getContext().getAttribute(g0.f95583f);
        try {
        } catch (IOException e11) {
            x(hVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, hVar);
            }
        }
        synchronized (cVar) {
            try {
                if (cVar.e() != 2) {
                    v(hVar);
                    return;
                }
                cVar.m(1);
                y(hVar, cVar);
                cVar.notifyAll();
            } finally {
            }
        }
    }

    @Override // m70.j
    public void o(m70.h hVar, HttpException httpException) {
        t(hVar, httpException);
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.c(httpException, hVar);
        }
    }

    @Override // m70.j
    public void p(m70.h hVar, IOException iOException) {
        x(hVar, iOException);
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.d(iOException, hVar);
        }
    }

    public final void y(m70.h hVar, c cVar) throws IOException {
        HttpRequest f11 = cVar.f();
        hVar.setSocketTimeout(cVar.h());
        B((org.apache.http.l) f11, cVar, hVar);
    }

    public final void z(HttpResponse httpResponse, c cVar, m70.h hVar) {
        this.f95627h.execute(new b(cVar, httpResponse, hVar.getContext(), hVar));
    }

    public s0(c80.j jVar, e0 e0Var, org.apache.http.a aVar, Executor executor, HttpParams httpParams) {
        this(jVar, e0Var, aVar, z70.e.f101089a, executor, httpParams);
    }
}
