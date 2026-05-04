package g70;

import b70.e;
import b70.n;
import java.io.IOException;
import javax.net.ssl.SSLContext;
import m70.h;
import m70.m;
import m70.o;
import m70.q;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.r;
import x60.l;
import x70.f;
import z70.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class a implements v70.c<HttpHost, h> {

    /* renamed from: a, reason: collision with root package name */
    public final m<? extends h> f53149a;

    /* renamed from: b, reason: collision with root package name */
    public final m<? extends h> f53150b;

    public a(m<? extends h> mVar, m<? extends h> mVar2) {
        e80.a.j(mVar, "Plain HTTP client connection factory");
        this.f53149a = mVar;
        this.f53150b = mVar2;
    }

    @Override // v70.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h a(HttpHost httpHost, f fVar) throws IOException {
        h a11;
        if (httpHost.getSchemeName().equalsIgnoreCase("https")) {
            m<? extends h> mVar = this.f53150b;
            if (mVar == null) {
                throw new IOException("SSL not supported");
            }
            a11 = mVar.a(fVar);
        } else {
            a11 = this.f53149a.a(fVar);
        }
        fVar.b("http.connection", a11);
        return a11;
    }

    public a(m<? extends h> mVar) {
        this(mVar, null);
    }

    @Deprecated
    public a(SSLContext sSLContext, y70.f fVar, r rVar, z70.b bVar, HttpParams httpParams) {
        this(new e(rVar, bVar, httpParams), new n(sSLContext, fVar, rVar, bVar, httpParams));
    }

    @Deprecated
    public a(SSLContext sSLContext, y70.f fVar, HttpParams httpParams) {
        this(sSLContext, fVar, l.f97646b, g.f101095a, httpParams);
    }

    @Deprecated
    public a(HttpParams httpParams) {
        this((SSLContext) null, (y70.f) null, httpParams);
    }

    public a(SSLContext sSLContext, y70.f fVar, o<HttpResponse> oVar, q<HttpRequest> qVar, z70.b bVar, v60.a aVar) {
        this(new e(oVar, qVar, bVar, aVar), new n(sSLContext, fVar, oVar, qVar, bVar, aVar));
    }

    public a(SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        this(sSLContext, fVar, null, null, null, aVar);
    }

    public a(v60.a aVar) {
        this(new e(aVar), null);
    }
}
