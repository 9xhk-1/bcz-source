package b70;

import javax.net.ssl.SSLContext;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.nio.reactor.ssl.SSLMode;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class n implements m70.m<d> {

    /* renamed from: i, reason: collision with root package name */
    public static final n f6342i = new n();

    /* renamed from: a, reason: collision with root package name */
    public final w60.e f6343a;

    /* renamed from: b, reason: collision with root package name */
    public final w60.e f6344b;

    /* renamed from: c, reason: collision with root package name */
    public final m70.o<HttpResponse> f6345c;

    /* renamed from: d, reason: collision with root package name */
    public final m70.q<HttpRequest> f6346d;

    /* renamed from: e, reason: collision with root package name */
    public final z70.b f6347e;

    /* renamed from: f, reason: collision with root package name */
    public final SSLContext f6348f;

    /* renamed from: g, reason: collision with root package name */
    public final y70.f f6349g;

    /* renamed from: h, reason: collision with root package name */
    public final v60.a f6350h;

    @Deprecated
    public n(SSLContext sSLContext, y70.f fVar, r rVar, z70.b bVar, HttpParams httpParams) {
        e80.a.j(rVar, "HTTP response factory");
        e80.a.j(bVar, "Byte buffer allocator");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6348f = sSLContext == null ? d80.d.b() : sSLContext;
        this.f6349g = fVar;
        this.f6347e = bVar;
        this.f6343a = null;
        this.f6344b = null;
        this.f6345c = new e70.l(null, rVar);
        this.f6346d = null;
        this.f6350h = a80.h.a(httpParams);
    }

    @Override // m70.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(x70.f fVar) {
        y70.e d11 = d(fVar, this.f6348f, this.f6349g);
        fVar.b(y70.e.f99492o, d11);
        return new d(d11, this.f6350h.d(), this.f6350h.f(), this.f6347e, x60.d.a(this.f6350h), x60.d.b(this.f6350h), this.f6350h.h(), this.f6343a, this.f6344b, this.f6346d, this.f6345c);
    }

    @Deprecated
    public d c(x70.f fVar, r rVar, z70.b bVar, HttpParams httpParams) {
        return new d(fVar, rVar, bVar, httpParams);
    }

    public y70.e d(x70.f fVar, SSLContext sSLContext, y70.f fVar2) {
        Object attribute = fVar.getAttribute(x70.f.f97672c1);
        return new y70.e(fVar, SSLMode.CLIENT, attribute instanceof HttpHost ? (HttpHost) attribute : null, sSLContext, fVar2);
    }

    @Deprecated
    public n(SSLContext sSLContext, y70.f fVar, HttpParams httpParams) {
        this(sSLContext, fVar, x60.l.f97646b, z70.g.f101095a, httpParams);
    }

    @Deprecated
    public n(HttpParams httpParams) {
        this((SSLContext) null, (y70.f) null, httpParams);
    }

    public n(SSLContext sSLContext, y70.f fVar, w60.e eVar, w60.e eVar2, m70.o<HttpResponse> oVar, m70.q<HttpRequest> qVar, z70.b bVar, v60.a aVar) {
        this.f6348f = sSLContext == null ? d80.d.b() : sSLContext;
        this.f6349g = fVar;
        this.f6343a = eVar;
        this.f6344b = eVar2;
        this.f6345c = oVar;
        this.f6346d = qVar;
        this.f6347e = bVar;
        this.f6350h = aVar == null ? v60.a.f93116g : aVar;
    }

    public n(SSLContext sSLContext, y70.f fVar, m70.o<HttpResponse> oVar, m70.q<HttpRequest> qVar, z70.b bVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, oVar, qVar, bVar, aVar);
    }

    public n(SSLContext sSLContext, y70.f fVar, m70.o<HttpResponse> oVar, m70.q<HttpRequest> qVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, oVar, qVar, null, aVar);
    }

    public n(SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, null, null, null, aVar);
    }

    public n(v60.a aVar) {
        this(null, null, null, null, null, null, null, aVar);
    }

    public n() {
        this(null, null, null, null, null, null);
    }
}
