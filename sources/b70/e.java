package b70;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class e implements m70.m<d> {

    /* renamed from: g, reason: collision with root package name */
    public static final e f6298g = new e();

    /* renamed from: a, reason: collision with root package name */
    public final w60.e f6299a;

    /* renamed from: b, reason: collision with root package name */
    public final w60.e f6300b;

    /* renamed from: c, reason: collision with root package name */
    public final m70.o<HttpResponse> f6301c;

    /* renamed from: d, reason: collision with root package name */
    public final m70.q<HttpRequest> f6302d;

    /* renamed from: e, reason: collision with root package name */
    public final z70.b f6303e;

    /* renamed from: f, reason: collision with root package name */
    public final v60.a f6304f;

    @Deprecated
    public e(r rVar, z70.b bVar, HttpParams httpParams) {
        e80.a.j(rVar, "HTTP response factory");
        e80.a.j(bVar, "Byte buffer allocator");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6303e = bVar;
        this.f6299a = null;
        this.f6300b = null;
        this.f6301c = new e70.l(null, rVar);
        this.f6302d = null;
        this.f6304f = a80.h.a(httpParams);
    }

    @Override // m70.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(x70.f fVar) {
        return new d(fVar, this.f6304f.d(), this.f6304f.f(), this.f6303e, x60.d.a(this.f6304f), x60.d.b(this.f6304f), this.f6304f.h(), this.f6299a, this.f6300b, this.f6302d, this.f6301c);
    }

    @Deprecated
    public d c(x70.f fVar, r rVar, z70.b bVar, HttpParams httpParams) {
        return new d(fVar, rVar, bVar, httpParams);
    }

    @Deprecated
    public e(HttpParams httpParams) {
        this(x60.l.f97646b, z70.g.f101095a, httpParams);
    }

    public e(w60.e eVar, w60.e eVar2, m70.o<HttpResponse> oVar, m70.q<HttpRequest> qVar, z70.b bVar, v60.a aVar) {
        this.f6299a = eVar;
        this.f6300b = eVar2;
        this.f6301c = oVar;
        this.f6302d = qVar;
        this.f6303e = bVar;
        this.f6304f = aVar == null ? v60.a.f93116g : aVar;
    }

    public e(m70.o<HttpResponse> oVar, m70.q<HttpRequest> qVar, z70.b bVar, v60.a aVar) {
        this(null, null, oVar, qVar, bVar, aVar);
    }

    public e(m70.o<HttpResponse> oVar, m70.q<HttpRequest> qVar, v60.a aVar) {
        this(null, null, oVar, qVar, null, aVar);
    }

    public e(v60.a aVar) {
        this(null, null, null, null, null, aVar);
    }

    public e() {
        this(null, null, null, null, null, null);
    }
}
