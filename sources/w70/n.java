package w70;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HttpResponse f95606a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpEntity f95607b;

    /* renamed from: c, reason: collision with root package name */
    public final t70.i f95608c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f95609d;

    public n(HttpResponse httpResponse, HttpEntity httpEntity, boolean z11) {
        this.f95606a = httpResponse;
        this.f95607b = httpEntity;
        if (httpEntity instanceof t70.i) {
            this.f95608c = (t70.i) httpEntity;
        } else {
            this.f95608c = new t70.h(httpEntity);
        }
        this.f95609d = z11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95608c.close();
    }

    @Override // w70.c0
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        this.f95608c.d(cVar, gVar);
    }

    @Override // w70.c0
    public HttpResponse k5() {
        if (this.f95609d) {
            this.f95606a.q("Connection", "Keep-Alive");
        } else {
            this.f95606a.q("Connection", c80.f.f8327p);
        }
        this.f95606a.setEntity(this.f95607b);
        return this.f95606a;
    }

    @Override // w70.c0
    public void b(Exception exc) {
    }

    @Override // w70.c0
    public void p(HttpContext httpContext) {
    }
}
