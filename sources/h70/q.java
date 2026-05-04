package h70;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class q implements y70.f {

    /* renamed from: a, reason: collision with root package name */
    public final p f58815a;

    /* renamed from: b, reason: collision with root package name */
    public HttpParams f58816b;

    public q(p pVar) {
        this.f58815a = pVar;
    }

    @Override // y70.f
    public void a(x70.f fVar, SSLSession sSLSession) throws SSLException {
        this.f58815a.c(fVar.l(), sSLSession);
    }

    @Override // y70.f
    public void b(SSLEngine sSLEngine) throws SSLException {
        p pVar = this.f58815a;
        HttpParams httpParams = this.f58816b;
        if (httpParams == null) {
            httpParams = new BasicHttpParams();
        }
        pVar.b(sSLEngine, httpParams);
    }

    public void c(HttpParams httpParams) {
        this.f58816b = httpParams;
    }
}
