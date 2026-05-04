package b70;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class g implements m70.m<f> {

    /* renamed from: a, reason: collision with root package name */
    public final w60.e f6307a;

    /* renamed from: b, reason: collision with root package name */
    public final w60.e f6308b;

    /* renamed from: c, reason: collision with root package name */
    public final m70.o<HttpRequest> f6309c;

    /* renamed from: d, reason: collision with root package name */
    public final m70.q<HttpResponse> f6310d;

    /* renamed from: e, reason: collision with root package name */
    public final z70.b f6311e;

    /* renamed from: f, reason: collision with root package name */
    public final v60.a f6312f;

    @Deprecated
    public g(org.apache.http.p pVar, z70.b bVar, HttpParams httpParams) {
        e80.a.j(pVar, "HTTP request factory");
        e80.a.j(bVar, "Byte buffer allocator");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6307a = null;
        this.f6308b = null;
        this.f6309c = new e70.h(null, pVar);
        this.f6310d = null;
        this.f6311e = bVar;
        this.f6312f = a80.h.a(httpParams);
    }

    @Override // m70.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(x70.f fVar) {
        return new f(fVar, this.f6312f.d(), this.f6312f.f(), this.f6311e, x60.d.a(this.f6312f), x60.d.b(this.f6312f), this.f6312f.h(), this.f6307a, this.f6308b, this.f6309c, this.f6310d);
    }

    @Deprecated
    public f c(x70.f fVar, org.apache.http.p pVar, z70.b bVar, HttpParams httpParams) {
        return new f(fVar, pVar, bVar, httpParams);
    }

    @Deprecated
    public g(HttpParams httpParams) {
        this(x60.k.f97641a, z70.g.f101095a, httpParams);
    }

    public g(w60.e eVar, w60.e eVar2, m70.o<HttpRequest> oVar, m70.q<HttpResponse> qVar, z70.b bVar, v60.a aVar) {
        this.f6307a = eVar;
        this.f6308b = eVar2;
        this.f6309c = oVar;
        this.f6310d = qVar;
        this.f6311e = bVar;
        this.f6312f = aVar == null ? v60.a.f93116g : aVar;
    }

    public g(z70.b bVar, m70.o<HttpRequest> oVar, m70.q<HttpResponse> qVar, v60.a aVar) {
        this(null, null, oVar, qVar, bVar, aVar);
    }

    public g(v60.a aVar) {
        this(null, null, null, null, null, aVar);
    }

    public g() {
        this(null, null, null, null, null, null);
    }
}
