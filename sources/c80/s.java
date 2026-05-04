package c80;

import com.badlogic.gdx.Net;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public volatile HttpParams f8356a;

    /* renamed from: b, reason: collision with root package name */
    public volatile j f8357b;

    /* renamed from: c, reason: collision with root package name */
    public volatile n f8358c;

    /* renamed from: d, reason: collision with root package name */
    public volatile org.apache.http.a f8359d;

    /* renamed from: e, reason: collision with root package name */
    public volatile org.apache.http.r f8360e;

    /* renamed from: f, reason: collision with root package name */
    public volatile i f8361f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public final p f8362a;

        public a(p pVar) {
            this.f8362a = pVar;
        }

        @Override // c80.n
        public m a(HttpRequest httpRequest) {
            return this.f8362a.a(httpRequest.getRequestLine().getUri());
        }
    }

    @Deprecated
    public s(j jVar, org.apache.http.a aVar, org.apache.http.r rVar, p pVar, i iVar, HttpParams httpParams) {
        this(jVar, aVar, rVar, new a(pVar), iVar);
        this.f8356a = httpParams;
    }

    public final boolean a(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return ((httpRequest != null && Net.a.f11462a.equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) || (statusCode = httpResponse.n().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public void b(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        m a11 = this.f8358c != null ? this.f8358c.a(httpRequest) : null;
        if (a11 != null) {
            a11.a(httpRequest, httpResponse, httpContext);
        } else {
            httpResponse.e(501);
        }
    }

    @Deprecated
    public HttpParams c() {
        return this.f8356a;
    }

    public void d(HttpException httpException, HttpResponse httpResponse) {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.e(501);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.e(505);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.e(400);
        } else {
            httpResponse.e(500);
        }
        String message = httpException.getMessage();
        if (message == null) {
            message = httpException.toString();
        }
        w60.d dVar = new w60.d(e80.d.a(message));
        dVar.i("text/plain; charset=US-ASCII");
        httpResponse.setEntity(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(org.apache.http.t r9, org.apache.http.protocol.HttpContext r10) throws java.io.IOException, org.apache.http.HttpException {
        /*
            r8 = this;
            java.lang.String r0 = "http.connection"
            r10.b(r0, r9)
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = 0
            org.apache.http.HttpRequest r2 = r9.I8()     // Catch: org.apache.http.HttpException -> L84
            boolean r3 = r2 instanceof org.apache.http.l     // Catch: org.apache.http.HttpException -> L3d
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L5e
            r3 = r2
            org.apache.http.l r3 = (org.apache.http.l) r3     // Catch: org.apache.http.HttpException -> L3d
            boolean r3 = r3.expectContinue()     // Catch: org.apache.http.HttpException -> L3d
            if (r3 == 0) goto L58
            org.apache.http.r r3 = r8.f8360e     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpVersion r5 = org.apache.http.HttpVersion.HTTP_1_1     // Catch: org.apache.http.HttpException -> L3d
            r6 = 100
            org.apache.http.HttpResponse r3 = r3.a(r5, r6, r10)     // Catch: org.apache.http.HttpException -> L3d
            c80.i r5 = r8.f8361f     // Catch: org.apache.http.HttpException -> L3d
            if (r5 == 0) goto L3f
            c80.i r5 = r8.f8361f     // Catch: org.apache.http.HttpException -> L2f
            r5.a(r2, r3, r10)     // Catch: org.apache.http.HttpException -> L2f
            goto L3f
        L2f:
            r3 = move-exception
            org.apache.http.r r5 = r8.f8360e     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpVersion r6 = org.apache.http.HttpVersion.HTTP_1_0     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpResponse r5 = r5.a(r6, r0, r10)     // Catch: org.apache.http.HttpException -> L3d
            r8.d(r3, r5)     // Catch: org.apache.http.HttpException -> L3d
            r3 = r5
            goto L3f
        L3d:
            r1 = move-exception
            goto L88
        L3f:
            org.apache.http.x r5 = r3.n()     // Catch: org.apache.http.HttpException -> L3d
            int r5 = r5.getStatusCode()     // Catch: org.apache.http.HttpException -> L3d
            if (r5 >= r4) goto L56
            r9.F1(r3)     // Catch: org.apache.http.HttpException -> L3d
            r9.flush()     // Catch: org.apache.http.HttpException -> L3d
            r3 = r2
            org.apache.http.l r3 = (org.apache.http.l) r3     // Catch: org.apache.http.HttpException -> L3d
            r9.S3(r3)     // Catch: org.apache.http.HttpException -> L3d
            goto L5e
        L56:
            r1 = r3
            goto L5e
        L58:
            r3 = r2
            org.apache.http.l r3 = (org.apache.http.l) r3     // Catch: org.apache.http.HttpException -> L3d
            r9.S3(r3)     // Catch: org.apache.http.HttpException -> L3d
        L5e:
            java.lang.String r3 = "http.request"
            r10.b(r3, r2)     // Catch: org.apache.http.HttpException -> L3d
            if (r1 != 0) goto L75
            org.apache.http.r r1 = r8.f8360e     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpVersion r3 = org.apache.http.HttpVersion.HTTP_1_1     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpResponse r1 = r1.a(r3, r4, r10)     // Catch: org.apache.http.HttpException -> L3d
            c80.j r3 = r8.f8357b     // Catch: org.apache.http.HttpException -> L3d
            r3.process(r2, r10)     // Catch: org.apache.http.HttpException -> L3d
            r8.b(r2, r1, r10)     // Catch: org.apache.http.HttpException -> L3d
        L75:
            boolean r3 = r2 instanceof org.apache.http.l     // Catch: org.apache.http.HttpException -> L3d
            if (r3 == 0) goto L94
            r3 = r2
            org.apache.http.l r3 = (org.apache.http.l) r3     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpEntity r3 = r3.getEntity()     // Catch: org.apache.http.HttpException -> L3d
            e80.e.a(r3)     // Catch: org.apache.http.HttpException -> L3d
            goto L94
        L84:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L88:
            org.apache.http.r r3 = r8.f8360e
            org.apache.http.HttpVersion r4 = org.apache.http.HttpVersion.HTTP_1_0
            org.apache.http.HttpResponse r0 = r3.a(r4, r0, r10)
            r8.d(r1, r0)
            r1 = r0
        L94:
            java.lang.String r0 = "http.response"
            r10.b(r0, r1)
            c80.j r0 = r8.f8357b
            r0.g(r1, r10)
            r9.F1(r1)
            boolean r0 = r8.a(r2, r1)
            if (r0 == 0) goto Laa
            r9.N5(r1)
        Laa:
            r9.flush()
            org.apache.http.a r0 = r8.f8359d
            boolean r10 = r0.a(r1, r10)
            if (r10 != 0) goto Lb8
            r9.close()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.s.e(org.apache.http.t, org.apache.http.protocol.HttpContext):void");
    }

    @Deprecated
    public void f(org.apache.http.a aVar) {
        e80.a.j(aVar, "Connection reuse strategy");
        this.f8359d = aVar;
    }

    @Deprecated
    public void g(i iVar) {
        this.f8361f = iVar;
    }

    @Deprecated
    public void h(p pVar) {
        this.f8358c = new a(pVar);
    }

    @Deprecated
    public void i(j jVar) {
        e80.a.j(jVar, "HTTP processor");
        this.f8357b = jVar;
    }

    @Deprecated
    public void j(HttpParams httpParams) {
        this.f8356a = httpParams;
    }

    @Deprecated
    public void k(org.apache.http.r rVar) {
        e80.a.j(rVar, "Response factory");
        this.f8360e = rVar;
    }

    @Deprecated
    public s(j jVar, org.apache.http.a aVar, org.apache.http.r rVar, p pVar, HttpParams httpParams) {
        this(jVar, aVar, rVar, new a(pVar), (i) null);
        this.f8356a = httpParams;
    }

    @Deprecated
    public s(j jVar, org.apache.http.a aVar, org.apache.http.r rVar) {
        this.f8356a = null;
        this.f8357b = null;
        this.f8358c = null;
        this.f8359d = null;
        this.f8360e = null;
        this.f8361f = null;
        i(jVar);
        f(aVar);
        k(rVar);
    }

    public s(j jVar, org.apache.http.a aVar, org.apache.http.r rVar, n nVar, i iVar) {
        this.f8356a = null;
        this.f8357b = null;
        this.f8358c = null;
        this.f8359d = null;
        this.f8360e = null;
        this.f8361f = null;
        this.f8357b = (j) e80.a.j(jVar, "HTTP processor");
        this.f8359d = aVar == null ? x60.i.f97640a : aVar;
        this.f8360e = rVar == null ? x60.l.f97646b : rVar;
        this.f8358c = nVar;
        this.f8361f = iVar;
    }

    public s(j jVar, org.apache.http.a aVar, org.apache.http.r rVar, n nVar) {
        this(jVar, aVar, rVar, nVar, (i) null);
    }

    public s(j jVar, n nVar) {
        this(jVar, (org.apache.http.a) null, (org.apache.http.r) null, nVar, (i) null);
    }
}
