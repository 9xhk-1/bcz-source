package w70;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HttpResponse f95597a;

    /* renamed from: b, reason: collision with root package name */
    public final t70.i f95598b;

    public k(HttpResponse httpResponse, t70.i iVar) {
        e80.a.j(httpResponse, "HTTP response");
        e80.a.j(iVar, "HTTP content producer");
        this.f95597a = httpResponse;
        this.f95598b = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        t70.i iVar = this.f95598b;
        if (iVar != null) {
            iVar.close();
        }
    }

    @Override // w70.c0
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        t70.i iVar = this.f95598b;
        if (iVar != null) {
            iVar.d(cVar, gVar);
            if (cVar.e()) {
                this.f95598b.close();
            }
        }
    }

    @Override // w70.c0
    public HttpResponse k5() {
        return this.f95597a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f95597a);
        if (this.f95598b != null) {
            sb2.append(" ");
            sb2.append(this.f95598b);
        }
        return sb2.toString();
    }

    public k(HttpResponse httpResponse) {
        e80.a.j(httpResponse, "HTTP response");
        this.f95597a = httpResponse;
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            if (entity instanceof t70.i) {
                this.f95598b = (t70.i) entity;
                return;
            } else {
                this.f95598b = new t70.h(entity);
                return;
            }
        }
        this.f95598b = null;
    }

    @Override // w70.c0
    public void b(Exception exc) {
    }

    @Override // w70.c0
    public void p(HttpContext httpContext) {
    }
}
