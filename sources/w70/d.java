package w70;

import java.io.IOException;
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
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class d extends g0 implements m70.u {

    /* renamed from: g, reason: collision with root package name */
    public final org.apache.http.r f95508g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f95509h;

    /* renamed from: i, reason: collision with root package name */
    public c80.i f95510i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public final b f95511a;

        /* renamed from: b, reason: collision with root package name */
        public final m70.g f95512b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f95513c;

        public a(b bVar, m70.g gVar) {
            this.f95511a = bVar;
            this.f95512b = gVar;
        }

        @Override // w70.l0
        public void a(IOException iOException) {
            e80.b.a(!this.f95513c, "Response already triggered");
            this.f95513c = true;
            this.f95511a.r(iOException);
            this.f95512b.f();
        }

        @Override // w70.l0
        public void b(HttpException httpException) {
            e80.b.a(!this.f95513c, "Response already triggered");
            this.f95513c = true;
            this.f95511a.p(httpException);
            this.f95512b.f();
        }

        @Override // w70.l0
        public void t(HttpResponse httpResponse) {
            e80.a.j(httpResponse, "Response");
            e80.b.a(!this.f95513c, "Response already triggered");
            this.f95513c = true;
            this.f95511a.w(httpResponse);
            this.f95512b.f();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public volatile i0 f95514a;

        /* renamed from: b, reason: collision with root package name */
        public volatile HttpRequest f95515b;

        /* renamed from: c, reason: collision with root package name */
        public volatile t70.b f95516c;

        /* renamed from: d, reason: collision with root package name */
        public volatile HttpResponse f95517d;

        /* renamed from: e, reason: collision with root package name */
        public volatile t70.n f95518e;

        /* renamed from: f, reason: collision with root package name */
        public volatile IOException f95519f;

        /* renamed from: g, reason: collision with root package name */
        public volatile HttpException f95520g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f95521h;

        public void a() throws IOException {
            if (this.f95516c != null) {
                this.f95516c.a();
                this.f95516c = null;
            }
        }

        public void b() throws IOException {
            if (this.f95518e != null) {
                this.f95518e.a();
                this.f95518e = null;
            }
        }

        public t70.b c() {
            return this.f95516c;
        }

        public HttpException d() {
            return this.f95520g;
        }

        public HttpException e() {
            return this.f95520g;
        }

        public IOException f() {
            return this.f95519f;
        }

        public IOException g() {
            return this.f95519f;
        }

        public t70.n h() {
            return this.f95518e;
        }

        public HttpRequest i() {
            return this.f95515b;
        }

        public i0 j() {
            return this.f95514a;
        }

        public HttpResponse k() {
            return this.f95517d;
        }

        public boolean l() {
            return this.f95521h;
        }

        public void m() throws IOException {
            a();
            this.f95515b = null;
            b();
            this.f95521h = false;
            this.f95517d = null;
            this.f95519f = null;
            this.f95520g = null;
            this.f95514a = null;
        }

        public void n(t70.b bVar) {
            this.f95516c = bVar;
        }

        public void o(boolean z11) {
            this.f95521h = z11;
        }

        public void p(HttpException httpException) {
            this.f95520g = httpException;
        }

        public void q(HttpException httpException) {
            this.f95520g = httpException;
        }

        public void r(IOException iOException) {
            this.f95519f = iOException;
        }

        public void s(IOException iOException) {
            this.f95519f = iOException;
        }

        public void t(t70.n nVar) {
            this.f95518e = nVar;
        }

        public void u(HttpRequest httpRequest) {
            this.f95515b = httpRequest;
        }

        public void v(i0 i0Var) {
            this.f95514a = i0Var;
        }

        public void w(HttpResponse httpResponse) {
            this.f95517d = httpResponse;
        }
    }

    public d(c80.j jVar, org.apache.http.r rVar, org.apache.http.a aVar, z70.b bVar, HttpParams httpParams) {
        super(jVar, aVar, bVar, httpParams);
        e80.a.j(rVar, "Response factory");
        this.f95508g = rVar;
    }

    public final void A(m70.r rVar, HttpRequest httpRequest) throws IOException, HttpException {
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        HttpVersion httpVersion = HttpVersion.HTTP_1_1;
        if (!protocolVersion.lessEquals(httpVersion)) {
            protocolVersion = httpVersion;
        }
        a aVar = new a(bVar, rVar);
        try {
            this.f95584a.process(httpRequest, context);
            i0 j11 = bVar.j();
            if (j11 != null) {
                HttpResponse a11 = this.f95508g.a(protocolVersion, 200, context);
                a11.i(new a80.d(a11.getParams(), this.f95587d));
                j11.b(httpRequest, a11, aVar, context);
            } else {
                HttpResponse a12 = this.f95508g.a(protocolVersion, 501, context);
                a12.i(new a80.d(a12.getParams(), this.f95587d));
                aVar.t(a12);
            }
        } catch (HttpException e11) {
            aVar.b(e11);
        }
    }

    public final void C(m70.r rVar, HttpRequest httpRequest, HttpResponse httpResponse) throws IOException, HttpException {
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        bVar.a();
        context.b("http.request", httpRequest);
        this.f95584a.g(httpResponse, context);
        context.b("http.request", null);
        if (httpResponse.getEntity() != null && !s(httpRequest, httpResponse)) {
            httpResponse.setEntity(null);
        }
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            if (entity instanceof t70.n) {
                bVar.t((t70.n) entity);
            } else {
                bVar.t(new t70.l(entity));
            }
        }
        rVar.t(httpResponse);
        if (entity == null) {
            if (this.f95585b.a(httpResponse, context)) {
                bVar.m();
                rVar.j();
            } else {
                rVar.close();
            }
            B(httpResponse, context);
        }
    }

    public void D(c80.i iVar) {
        this.f95510i = iVar;
    }

    public void E(k0 k0Var) {
        this.f95509h = k0Var;
    }

    @Override // m70.u
    public void a(m70.r rVar) {
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        if (bVar.l()) {
            return;
        }
        HttpRequest i11 = bVar.i();
        try {
            IOException f11 = bVar.f();
            if (f11 != null) {
                throw f11;
            }
            HttpException d11 = bVar.d();
            if (d11 != null) {
                HttpResponse a11 = this.f95508g.a(HttpVersion.HTTP_1_0, 500, context);
                a11.i(new a80.d(a11.getParams(), this.f95587d));
                z(d11, a11);
                bVar.w(a11);
            }
            HttpResponse k11 = bVar.k();
            if (k11 != null) {
                bVar.o(true);
                C(rVar, i11, k11);
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
        HttpContext context = rVar.getContext();
        context.b(g0.f95583f, new b());
        context.b("http.connection", rVar);
        o oVar = this.f95588e;
        if (oVar != null) {
            oVar.a(rVar);
        }
    }

    @Override // m70.u
    public void f(m70.r rVar, m70.c cVar) {
        HttpContext context = rVar.getContext();
        b bVar = (b) context.getAttribute(g0.f95583f);
        HttpResponse N6 = rVar.N6();
        try {
            bVar.h().d(cVar, rVar);
            if (cVar.e()) {
                bVar.b();
                if (this.f95585b.a(N6, context)) {
                    bVar.m();
                    rVar.j();
                } else {
                    rVar.close();
                }
                B(N6, context);
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
        b bVar = (b) context.getAttribute(g0.f95583f);
        HttpRequest n02 = rVar.n0();
        n02.i(new a80.d(n02.getParams(), this.f95587d));
        bVar.u(n02);
        i0 y11 = y(n02);
        bVar.v(y11);
        ProtocolVersion protocolVersion = n02.getRequestLine().getProtocolVersion();
        ProtocolVersion protocolVersion2 = HttpVersion.HTTP_1_1;
        if (!protocolVersion.lessEquals(protocolVersion2)) {
            protocolVersion = protocolVersion2;
        }
        try {
            try {
                if (!(n02 instanceof org.apache.http.l)) {
                    rVar.e();
                    A(rVar, n02);
                    return;
                }
                org.apache.http.l lVar = (org.apache.http.l) n02;
                if (lVar.expectContinue()) {
                    HttpResponse a11 = this.f95508g.a(protocolVersion, 100, context);
                    a11.i(new a80.d(a11.getParams(), this.f95587d));
                    c80.i iVar = this.f95510i;
                    if (iVar != null) {
                        try {
                            iVar.a(n02, a11, context);
                        } catch (HttpException e11) {
                            HttpResponse a12 = this.f95508g.a(HttpVersion.HTTP_1_0, 500, context);
                            a12.i(new a80.d(a12.getParams(), this.f95587d));
                            z(e11, a12);
                            a11 = a12;
                        }
                    }
                    if (a11.n().getStatusCode() < 200) {
                        rVar.t(a11);
                    } else {
                        rVar.M();
                        C(rVar, n02, a11);
                    }
                }
                t70.b a13 = y11 != null ? y11.a(lVar, context) : null;
                if (a13 == null) {
                    a13 = new m0(lVar.getEntity());
                }
                lVar.setEntity(a13);
                bVar.n(a13);
            } catch (HttpException e12) {
                t(rVar, e12);
                o oVar = this.f95588e;
                if (oVar != null) {
                    oVar.c(e12, rVar);
                }
            }
        } catch (IOException e13) {
            x(rVar, e13);
            o oVar2 = this.f95588e;
            if (oVar2 != null) {
                oVar2.d(e13, rVar);
            }
        }
    }

    @Override // m70.u
    public void j(m70.r rVar, m70.a aVar) {
        b bVar = (b) rVar.getContext().getAttribute(g0.f95583f);
        HttpRequest i11 = bVar.i();
        try {
            bVar.c().h(aVar, rVar);
            if (aVar.e()) {
                rVar.e();
                A(rVar, i11);
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
    public void l(m70.r rVar) {
        try {
            ((b) rVar.getContext().getAttribute(g0.f95583f)).m();
        } catch (IOException e11) {
            if (this.f95588e != null) {
                this.f95588e.d(e11, rVar);
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
            t(rVar, httpException);
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.c(httpException, rVar);
                return;
            }
            return;
        }
        try {
            HttpResponse a11 = this.f95508g.a(HttpVersion.HTTP_1_0, 500, rVar.getContext());
            a11.i(new a80.d(a11.getParams(), this.f95587d));
            z(httpException, a11);
            a11.setEntity(null);
            C(rVar, null, a11);
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

    public final i0 y(HttpRequest httpRequest) {
        if (this.f95509h == null) {
            return null;
        }
        return this.f95509h.a(httpRequest.getRequestLine().getUri());
    }

    public final void z(HttpException httpException, HttpResponse httpResponse) {
        httpResponse.e(httpException instanceof MethodNotSupportedException ? 501 : httpException instanceof UnsupportedHttpVersionException ? 505 : httpException instanceof ProtocolException ? 400 : 500);
        t70.j jVar = new t70.j(e80.d.a(httpException.getMessage()));
        jVar.i("text/plain; charset=US-ASCII");
        httpResponse.setEntity(jVar);
    }

    public d(c80.j jVar, org.apache.http.r rVar, org.apache.http.a aVar, HttpParams httpParams) {
        this(jVar, rVar, aVar, z70.g.f101095a, httpParams);
    }

    public void B(HttpResponse httpResponse, HttpContext httpContext) {
    }
}
