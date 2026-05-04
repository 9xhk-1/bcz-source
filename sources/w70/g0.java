package w70;

import com.badlogic.gdx.Net;
import java.io.IOException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f95583f = "http.nio.conn-state";

    /* renamed from: a, reason: collision with root package name */
    public final c80.j f95584a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.a f95585b;

    /* renamed from: c, reason: collision with root package name */
    public final z70.b f95586c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpParams f95587d;

    /* renamed from: e, reason: collision with root package name */
    public o f95588e;

    public g0(c80.j jVar, org.apache.http.a aVar, z70.b bVar, HttpParams httpParams) {
        e80.a.j(jVar, "HTTP processor");
        e80.a.j(aVar, "Connection reuse strategy");
        e80.a.j(bVar, "ByteBuffer allocator");
        e80.a.j(httpParams, "HTTP parameters");
        this.f95584a = jVar;
        this.f95585b = aVar;
        this.f95586c = bVar;
        this.f95587d = httpParams;
    }

    public boolean s(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return ((httpRequest != null && Net.a.f11462a.equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) || (statusCode = httpResponse.n().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public void t(m70.l lVar, Throwable th2) {
        try {
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            lVar.shutdown();
        }
    }

    public HttpParams u() {
        return this.f95587d;
    }

    public void v(m70.l lVar) {
        try {
            if (lVar.getStatus() != 0) {
                lVar.shutdown();
                return;
            }
            lVar.close();
            if (lVar.getStatus() == 1) {
                lVar.setSocketTimeout(250);
            }
            o oVar = this.f95588e;
            if (oVar != null) {
                oVar.e(lVar);
            }
        } catch (IOException unused) {
        }
    }

    public void w(o oVar) {
        this.f95588e = oVar;
    }

    public void x(m70.l lVar, Throwable th2) {
        try {
            lVar.shutdown();
        } catch (IOException unused) {
        }
    }
}
