package x60;

import a70.u;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class b implements t {

    /* renamed from: c, reason: collision with root package name */
    public k70.h f97611c = null;

    /* renamed from: d, reason: collision with root package name */
    public k70.i f97612d = null;

    /* renamed from: e, reason: collision with root package name */
    public k70.b f97613e = null;

    /* renamed from: f, reason: collision with root package name */
    public k70.c<HttpRequest> f97614f = null;

    /* renamed from: g, reason: collision with root package name */
    public k70.e<HttpResponse> f97615g = null;

    /* renamed from: h, reason: collision with root package name */
    public o f97616h = null;

    /* renamed from: a, reason: collision with root package name */
    public final z60.c f97609a = f();

    /* renamed from: b, reason: collision with root package name */
    public final z60.b f97610b = e();

    public boolean C() {
        k70.b bVar = this.f97613e;
        return bVar != null && bVar.c();
    }

    @Override // org.apache.http.t
    public void F1(HttpResponse httpResponse) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        a();
        this.f97615g.a(httpResponse);
        if (httpResponse.n().getStatusCode() >= 200) {
            this.f97616h.g();
        }
    }

    @Override // org.apache.http.t
    public HttpRequest I8() throws HttpException, IOException {
        a();
        HttpRequest a11 = this.f97614f.a();
        this.f97616h.f();
        return a11;
    }

    @Override // org.apache.http.t
    public void N5(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse.getEntity() == null) {
            return;
        }
        this.f97609a.b(this.f97612d, httpResponse, httpResponse.getEntity());
    }

    @Override // org.apache.http.t
    public void S3(org.apache.http.l lVar) throws HttpException, IOException {
        e80.a.j(lVar, "HTTP request");
        a();
        lVar.setEntity(this.f97610b.a(this.f97611c, lVar));
    }

    @Override // org.apache.http.HttpConnection
    public boolean X1() {
        if (!isOpen() || C()) {
            return true;
        }
        try {
            this.f97611c.b(1);
            return C();
        } catch (IOException unused) {
            return true;
        }
    }

    public abstract void a() throws IllegalStateException;

    public o c(k70.g gVar, k70.g gVar2) {
        return new o(gVar, gVar2);
    }

    public z60.b e() {
        return new z60.b(new z60.a(new z60.d(0)));
    }

    public z60.c f() {
        return new z60.c(new z60.e());
    }

    @Override // org.apache.http.t
    public void flush() throws IOException {
        a();
        r();
    }

    @Override // org.apache.http.HttpConnection
    public org.apache.http.k getMetrics() {
        return this.f97616h;
    }

    public org.apache.http.p j() {
        return k.f97641a;
    }

    public k70.c<HttpRequest> k(k70.h hVar, org.apache.http.p pVar, HttpParams httpParams) {
        return new a70.i(hVar, (l70.q) null, pVar, httpParams);
    }

    public k70.e<HttpResponse> q(k70.i iVar, HttpParams httpParams) {
        return new u(iVar, null, httpParams);
    }

    public void r() throws IOException {
        this.f97612d.flush();
    }

    public void w(k70.h hVar, k70.i iVar, HttpParams httpParams) {
        this.f97611c = (k70.h) e80.a.j(hVar, "Input session buffer");
        this.f97612d = (k70.i) e80.a.j(iVar, "Output session buffer");
        if (hVar instanceof k70.b) {
            this.f97613e = (k70.b) hVar;
        }
        this.f97614f = k(hVar, j(), httpParams);
        this.f97615g = q(iVar, httpParams);
        this.f97616h = c(hVar.getMetrics(), iVar.getMetrics());
    }
}
