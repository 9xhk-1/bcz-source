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
public class l implements m70.j {

    /* renamed from: a, reason: collision with root package name */
    public final c f95599a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public final e0 f95600a;

        public a(e0 e0Var) {
            this.f95600a = e0Var;
        }

        @Override // w70.h0
        public void a(HttpContext httpContext, Object obj) {
            this.f95600a.a(httpContext, obj);
        }

        @Override // w70.h0
        public void b(HttpContext httpContext) {
            this.f95600a.b(httpContext);
        }

        @Override // w70.h0
        public HttpRequest c(HttpContext httpContext) {
            return this.f95600a.c(httpContext);
        }

        @Override // w70.h0
        public void d(HttpResponse httpResponse, HttpContext httpContext) throws IOException {
            this.f95600a.d(httpResponse, httpContext);
        }

        @Override // w70.h0
        public t70.b e(HttpResponse httpResponse, HttpContext httpContext) throws IOException {
            return new t70.a(httpResponse.getEntity(), z70.g.f101095a);
        }
    }

    public l(c80.j jVar, e0 e0Var, org.apache.http.a aVar, z70.b bVar, HttpParams httpParams) {
        this.f95599a = new c(jVar, new a(e0Var), aVar, bVar, httpParams);
    }

    public void a(o oVar) {
        this.f95599a.w(oVar);
    }

    @Override // m70.j
    public void b(m70.h hVar, m70.a aVar) {
        this.f95599a.b(hVar, aVar);
    }

    @Override // m70.j
    public void d(m70.h hVar, m70.c cVar) {
        this.f95599a.d(hVar, cVar);
    }

    @Override // m70.j
    public void e(m70.h hVar) {
        this.f95599a.e(hVar);
    }

    @Override // m70.j
    public void h(m70.h hVar, Object obj) {
        this.f95599a.h(hVar, obj);
    }

    @Override // m70.j
    public void i(m70.h hVar) {
        this.f95599a.i(hVar);
    }

    @Override // m70.j
    public void k(m70.h hVar) {
        this.f95599a.k(hVar);
    }

    @Override // m70.j
    public void m(m70.h hVar) {
        this.f95599a.m(hVar);
    }

    @Override // m70.j
    public void o(m70.h hVar, HttpException httpException) {
        this.f95599a.o(hVar, httpException);
    }

    @Override // m70.j
    public void p(m70.h hVar, IOException iOException) {
        this.f95599a.p(hVar, iOException);
    }

    public l(c80.j jVar, e0 e0Var, org.apache.http.a aVar, HttpParams httpParams) {
        this(jVar, e0Var, aVar, z70.g.f101095a, httpParams);
    }
}
