package w70;

import java.io.IOException;
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
public class m implements m70.u {

    /* renamed from: a, reason: collision with root package name */
    public final d f95601a;

    /* renamed from: b, reason: collision with root package name */
    public c80.p f95602b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r0 {

        /* renamed from: a, reason: collision with root package name */
        public final c80.m f95603a;

        public a(c80.m mVar) {
            this.f95603a = mVar;
        }

        @Override // w70.i0
        public t70.b a(org.apache.http.l lVar, HttpContext httpContext) throws HttpException, IOException {
            return new t70.a(lVar.getEntity(), z70.g.f101095a);
        }

        @Override // w70.r0
        public void c(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
            this.f95603a.a(httpRequest, httpResponse, httpContext);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements k0 {
        public b() {
        }

        @Override // w70.k0
        public i0 a(String str) {
            c80.m a11 = m.this.f95602b.a(str);
            if (a11 != null) {
                return new a(a11);
            }
            return null;
        }
    }

    public m(c80.j jVar, org.apache.http.r rVar, org.apache.http.a aVar, z70.b bVar, HttpParams httpParams) {
        d dVar = new d(jVar, rVar, aVar, bVar, httpParams);
        this.f95601a = dVar;
        dVar.E(new b());
    }

    @Override // m70.u
    public void a(m70.r rVar) {
        this.f95601a.a(rVar);
    }

    @Override // m70.u
    public void c(m70.r rVar) {
        this.f95601a.c(rVar);
    }

    public void d(o oVar) {
        this.f95601a.w(oVar);
    }

    public void e(c80.i iVar) {
        this.f95601a.D(iVar);
    }

    @Override // m70.u
    public void f(m70.r rVar, m70.c cVar) {
        this.f95601a.f(rVar, cVar);
    }

    @Override // m70.u
    public void g(m70.r rVar) {
        this.f95601a.g(rVar);
    }

    public void h(c80.p pVar) {
        this.f95602b = pVar;
    }

    @Override // m70.u
    public void j(m70.r rVar, m70.a aVar) {
        this.f95601a.j(rVar, aVar);
    }

    @Override // m70.u
    public void l(m70.r rVar) {
        this.f95601a.l(rVar);
    }

    @Override // m70.u
    public void n(m70.r rVar) {
        this.f95601a.n(rVar);
    }

    @Override // m70.u
    public void q(m70.r rVar, HttpException httpException) {
        this.f95601a.q(rVar, httpException);
    }

    @Override // m70.u
    public void r(m70.r rVar, IOException iOException) {
        this.f95601a.r(rVar, iOException);
    }

    public m(c80.j jVar, org.apache.http.r rVar, org.apache.http.a aVar, HttpParams httpParams) {
        this(jVar, rVar, aVar, z70.g.f101095a, httpParams);
    }
}
