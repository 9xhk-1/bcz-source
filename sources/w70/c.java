package w70;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class c extends g0 implements m70.j {

    /* renamed from: g, reason: collision with root package name */
    public h0 f95492g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f95493h = 0;

        /* renamed from: i, reason: collision with root package name */
        public static final int f95494i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f95495j = 2;

        /* renamed from: k, reason: collision with root package name */
        public static final int f95496k = 4;

        /* renamed from: l, reason: collision with root package name */
        public static final int f95497l = 8;

        /* renamed from: m, reason: collision with root package name */
        public static final int f95498m = 16;

        /* renamed from: n, reason: collision with root package name */
        public static final int f95499n = 32;

        /* renamed from: o, reason: collision with root package name */
        public static final int f95500o = 64;

        /* renamed from: a, reason: collision with root package name */
        public int f95501a;

        /* renamed from: b, reason: collision with root package name */
        public HttpRequest f95502b;

        /* renamed from: c, reason: collision with root package name */
        public HttpResponse f95503c;

        /* renamed from: d, reason: collision with root package name */
        public t70.b f95504d;

        /* renamed from: e, reason: collision with root package name */
        public t70.n f95505e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f95506f = true;

        /* renamed from: g, reason: collision with root package name */
        public int f95507g;

        public t70.b a() {
            return this.f95504d;
        }

        public int b() {
            return this.f95501a;
        }

        public t70.n c() {
            return this.f95505e;
        }

        public HttpRequest d() {
            return this.f95502b;
        }

        public HttpResponse e() {
            return this.f95503c;
        }

        public int f() {
            return this.f95507g;
        }

        public void g() {
            this.f95506f = false;
        }

        public boolean h() {
            return this.f95506f;
        }

        public void i() throws IOException {
            j();
            k();
        }

        public void j() throws IOException {
            this.f95503c = null;
            t70.b bVar = this.f95504d;
            if (bVar != null) {
                bVar.a();
                this.f95504d = null;
            }
        }

        public void k() throws IOException {
            this.f95502b = null;
            t70.n nVar = this.f95505e;
            if (nVar != null) {
                nVar.a();
                this.f95505e = null;
            }
            this.f95501a = 0;
        }

        public void l(t70.b bVar) {
            this.f95504d = bVar;
        }

        public void m(int i11) {
            this.f95501a = i11;
        }

        public void n(t70.n nVar) {
            this.f95505e = nVar;
        }

        public void o(HttpRequest httpRequest) {
            this.f95502b = httpRequest;
        }

        public void p(HttpResponse httpResponse) {
            this.f95503c = httpResponse;
        }

        public void q(int i11) {
            this.f95507g = i11;
        }
    }

    public c(c80.j jVar, h0 h0Var, org.apache.http.a aVar, z70.b bVar, HttpParams httpParams) {
        super(jVar, aVar, bVar, httpParams);
        this.f95492g = (h0) e80.a.j(h0Var, "HTTP request execution handler");
    }

    public final void A(m70.h hVar, Object obj) {
        HttpContext context = hVar.getContext();
        context.b("http.connection", hVar);
        this.f95492g.a(context, obj);
    }

    public final void B(m70.h hVar, a aVar) throws IOException, HttpException {
        if (!aVar.h()) {
            hVar.close();
        }
        HttpContext context = hVar.getContext();
        HttpResponse e11 = aVar.e();
        this.f95492g.d(e11, context);
        if (!this.f95585b.a(e11, context)) {
            hVar.close();
        }
        if (hVar.isOpen()) {
            aVar.j();
            aVar.k();
            hVar.f();
        }
    }

    @Override // m70.j
    public void b(m70.h hVar, m70.a aVar) {
        a aVar2 = (a) hVar.getContext().getAttribute(g0.f95583f);
        try {
            aVar2.a().h(aVar, hVar);
            if (aVar.e()) {
                B(hVar, aVar2);
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
    public void d(m70.h hVar, m70.c cVar) {
        a aVar = (a) hVar.getContext().getAttribute(g0.f95583f);
        try {
            if (aVar.b() == 2) {
                hVar.q();
                return;
            }
            aVar.c().d(cVar, hVar);
            if (cVar.e()) {
                aVar.m(8);
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
        a aVar = (a) context.getAttribute(g0.f95583f);
        HttpResponse N6 = hVar.N6();
        N6.i(new a80.d(N6.getParams(), this.f95587d));
        HttpRequest d11 = aVar.d();
        try {
            int statusCode = N6.n().getStatusCode();
            if (statusCode < 200) {
                if (statusCode == 100 && aVar.b() == 2) {
                    z(hVar, aVar);
                    return;
                }
                return;
            }
            aVar.p(N6);
            if (aVar.b() == 2) {
                y(hVar, aVar);
            } else if (aVar.b() == 4) {
                y(hVar, aVar);
                aVar.g();
                hVar.q();
            }
            context.b("http.response", N6);
            if (!s(d11, N6)) {
                hVar.M();
                N6.setEntity(null);
                this.f95584a.g(N6, context);
                B(hVar, aVar);
                return;
            }
            HttpEntity entity = N6.getEntity();
            if (entity != null) {
                t70.b e11 = this.f95492g.e(N6, context);
                if (e11 == null) {
                    e11 = new m0(entity);
                }
                N6.setEntity(e11);
                aVar.l(e11);
                this.f95584a.g(N6, context);
            }
        } catch (IOException e12) {
            x(hVar, e12);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e12, hVar);
            }
        } catch (HttpException e13) {
            t(hVar, e13);
            o oVar2 = this.f95588e;
            if (oVar2 != null) {
                oVar2.c(e13, hVar);
            }
        }
    }

    @Override // m70.j
    public void h(m70.h hVar, Object obj) {
        HttpContext context = hVar.getContext();
        A(hVar, obj);
        context.b(g0.f95583f, new a());
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.a(hVar);
        }
        i(hVar);
    }

    @Override // m70.j
    public void i(m70.h hVar) {
        org.apache.http.l lVar;
        HttpEntity httpEntity;
        HttpContext context = hVar.getContext();
        a aVar = (a) context.getAttribute(g0.f95583f);
        if (aVar.b() != 0) {
            return;
        }
        try {
            HttpRequest c11 = this.f95492g.c(context);
            if (c11 == null) {
                return;
            }
            c11.i(new a80.d(c11.getParams(), this.f95587d));
            context.b("http.request", c11);
            this.f95584a.process(c11, context);
            if (c11 instanceof org.apache.http.l) {
                lVar = (org.apache.http.l) c11;
                httpEntity = lVar.getEntity();
            } else {
                lVar = null;
                httpEntity = null;
            }
            if (httpEntity instanceof t70.n) {
                aVar.n((t70.n) httpEntity);
            } else if (httpEntity != null) {
                aVar.n(new t70.l(httpEntity));
            }
            aVar.o(c11);
            hVar.G5(c11);
            aVar.m(1);
            if (lVar == null || !lVar.expectContinue()) {
                if (aVar.c() != null) {
                    aVar.m(4);
                }
            } else {
                aVar.q(hVar.x());
                hVar.setSocketTimeout(this.f95587d.getIntParameter(a80.c.f2309h, 3000));
                aVar.m(2);
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
        try {
            ((a) context.getAttribute(g0.f95583f)).i();
        } catch (IOException e11) {
            if (this.f95588e != null) {
                this.f95588e.d(e11, hVar);
            }
        }
        this.f95492g.b(context);
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.b(hVar);
        }
    }

    @Override // m70.j
    public void m(m70.h hVar) {
        a aVar = (a) hVar.getContext().getAttribute(g0.f95583f);
        try {
            if (aVar.b() == 2) {
                z(hVar, aVar);
                return;
            }
        } catch (IOException e11) {
            x(hVar, e11);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.d(e11, hVar);
            }
        }
        v(hVar);
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

    public final void y(m70.h hVar, a aVar) throws IOException {
        hVar.setSocketTimeout(aVar.f());
        hVar.K();
        aVar.k();
    }

    public final void z(m70.h hVar, a aVar) throws IOException {
        hVar.setSocketTimeout(aVar.f());
        hVar.f();
        aVar.m(4);
    }

    public c(c80.j jVar, h0 h0Var, org.apache.http.a aVar, HttpParams httpParams) {
        this(jVar, h0Var, aVar, z70.g.f101095a, httpParams);
    }
}
