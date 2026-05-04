package x60;

import a70.s;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class a implements org.apache.http.i {

    /* renamed from: c, reason: collision with root package name */
    public k70.h f97603c = null;

    /* renamed from: d, reason: collision with root package name */
    public k70.i f97604d = null;

    /* renamed from: e, reason: collision with root package name */
    public k70.b f97605e = null;

    /* renamed from: f, reason: collision with root package name */
    public k70.c<HttpResponse> f97606f = null;

    /* renamed from: g, reason: collision with root package name */
    public k70.e<HttpRequest> f97607g = null;

    /* renamed from: h, reason: collision with root package name */
    public o f97608h = null;

    /* renamed from: a, reason: collision with root package name */
    public final z60.c f97601a = f();

    /* renamed from: b, reason: collision with root package name */
    public final z60.b f97602b = e();

    public boolean C() {
        k70.b bVar = this.f97605e;
        return bVar != null && bVar.c();
    }

    @Override // org.apache.http.i
    public boolean I5(int i11) throws IOException {
        a();
        try {
            return this.f97603c.b(i11);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    @Override // org.apache.http.i
    public void V7(HttpRequest httpRequest) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        a();
        this.f97607g.a(httpRequest);
        this.f97608h.f();
    }

    @Override // org.apache.http.HttpConnection
    public boolean X1() {
        if (!isOpen() || C()) {
            return true;
        }
        try {
            this.f97603c.b(1);
            return C();
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    @Override // org.apache.http.i
    public HttpResponse Y3() throws HttpException, IOException {
        a();
        HttpResponse a11 = this.f97606f.a();
        if (a11.n().getStatusCode() >= 200) {
            this.f97608h.g();
        }
        return a11;
    }

    public abstract void a() throws IllegalStateException;

    public o c(k70.g gVar, k70.g gVar2) {
        return new o(gVar, gVar2);
    }

    public z60.b e() {
        return new z60.b(new z60.d());
    }

    @Override // org.apache.http.i
    public void e0(org.apache.http.l lVar) throws HttpException, IOException {
        e80.a.j(lVar, "HTTP request");
        a();
        if (lVar.getEntity() == null) {
            return;
        }
        this.f97601a.b(this.f97604d, lVar, lVar.getEntity());
    }

    public z60.c f() {
        return new z60.c(new z60.e());
    }

    @Override // org.apache.http.i
    public void flush() throws IOException {
        a();
        r();
    }

    @Override // org.apache.http.HttpConnection
    public org.apache.http.k getMetrics() {
        return this.f97608h;
    }

    public org.apache.http.r j() {
        return l.f97646b;
    }

    public k70.e<HttpRequest> k(k70.i iVar, HttpParams httpParams) {
        return new s(iVar, null, httpParams);
    }

    public k70.c<HttpResponse> q(k70.h hVar, org.apache.http.r rVar, HttpParams httpParams) {
        return new a70.m(hVar, (l70.q) null, rVar, httpParams);
    }

    public void r() throws IOException {
        this.f97604d.flush();
    }

    public void w(k70.h hVar, k70.i iVar, HttpParams httpParams) {
        this.f97603c = (k70.h) e80.a.j(hVar, "Input session buffer");
        this.f97604d = (k70.i) e80.a.j(iVar, "Output session buffer");
        if (hVar instanceof k70.b) {
            this.f97605e = (k70.b) hVar;
        }
        this.f97606f = q(hVar, j(), httpParams);
        this.f97607g = k(iVar, httpParams);
        this.f97608h = c(hVar.getMetrics(), iVar.getMetrics());
    }

    @Override // org.apache.http.i
    public void y3(HttpResponse httpResponse) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        a();
        httpResponse.setEntity(this.f97602b.a(this.f97603c, httpResponse));
    }
}
