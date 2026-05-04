package b70;

import javax.net.ssl.SSLContext;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.nio.reactor.ssl.SSLMode;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class o implements m70.m<f> {

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f6351a;

    /* renamed from: b, reason: collision with root package name */
    public final y70.f f6352b;

    /* renamed from: c, reason: collision with root package name */
    public final w60.e f6353c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.e f6354d;

    /* renamed from: e, reason: collision with root package name */
    public final m70.o<HttpRequest> f6355e;

    /* renamed from: f, reason: collision with root package name */
    public final m70.q<HttpResponse> f6356f;

    /* renamed from: g, reason: collision with root package name */
    public final z70.b f6357g;

    /* renamed from: h, reason: collision with root package name */
    public final v60.a f6358h;

    @Deprecated
    public o(SSLContext sSLContext, y70.f fVar, org.apache.http.p pVar, z70.b bVar, HttpParams httpParams) {
        e80.a.j(pVar, "HTTP request factory");
        e80.a.j(bVar, "Byte buffer allocator");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6351a = sSLContext == null ? d80.d.b() : sSLContext;
        this.f6352b = fVar;
        this.f6353c = null;
        this.f6354d = null;
        this.f6355e = new e70.h(null, pVar);
        this.f6356f = null;
        this.f6357g = bVar;
        this.f6358h = a80.h.a(httpParams);
    }

    @Override // m70.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(x70.f fVar) {
        y70.e d11 = d(fVar, this.f6351a, this.f6352b);
        fVar.b(y70.e.f99492o, d11);
        return new f(d11, this.f6358h.d(), this.f6358h.f(), this.f6357g, x60.d.a(this.f6358h), x60.d.b(this.f6358h), this.f6358h.h(), this.f6353c, this.f6354d, this.f6355e, this.f6356f);
    }

    @Deprecated
    public f c(x70.f fVar, org.apache.http.p pVar, z70.b bVar, HttpParams httpParams) {
        return new f(fVar, pVar, bVar, httpParams);
    }

    public y70.e d(x70.f fVar, SSLContext sSLContext, y70.f fVar2) {
        return new y70.e(fVar, SSLMode.SERVER, sSLContext, fVar2);
    }

    @Deprecated
    public o(SSLContext sSLContext, y70.f fVar, HttpParams httpParams) {
        this(sSLContext, fVar, x60.k.f97641a, z70.g.f101095a, httpParams);
    }

    @Deprecated
    public o(HttpParams httpParams) {
        this((SSLContext) null, (y70.f) null, httpParams);
    }

    public o(SSLContext sSLContext, y70.f fVar, w60.e eVar, w60.e eVar2, m70.o<HttpRequest> oVar, m70.q<HttpResponse> qVar, z70.b bVar, v60.a aVar) {
        this.f6351a = sSLContext == null ? d80.d.b() : sSLContext;
        this.f6352b = fVar;
        this.f6353c = eVar;
        this.f6354d = eVar2;
        this.f6355e = oVar;
        this.f6356f = qVar;
        this.f6357g = bVar;
        this.f6358h = aVar == null ? v60.a.f93116g : aVar;
    }

    public o(SSLContext sSLContext, y70.f fVar, m70.o<HttpRequest> oVar, m70.q<HttpResponse> qVar, z70.b bVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, oVar, qVar, bVar, aVar);
    }

    public o(SSLContext sSLContext, y70.f fVar, m70.o<HttpRequest> oVar, m70.q<HttpResponse> qVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, oVar, qVar, null, aVar);
    }

    public o(SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, null, null, null, aVar);
    }

    public o(v60.a aVar) {
        this(null, null, null, null, null, null, null, aVar);
    }

    public o() {
        this(null, null, null, null, null, null, null, null);
    }
}
