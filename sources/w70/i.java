package w70;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i implements z {

    /* renamed from: a, reason: collision with root package name */
    public final HttpHost f95590a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpRequest f95591b;

    /* renamed from: c, reason: collision with root package name */
    public final t70.i f95592c;

    public i(HttpHost httpHost, org.apache.http.l lVar, t70.i iVar) {
        e80.a.j(httpHost, "HTTP host");
        e80.a.j(lVar, "HTTP request");
        e80.a.j(iVar, "HTTP content producer");
        this.f95590a = httpHost;
        this.f95591b = lVar;
        this.f95592c = iVar;
    }

    @Override // w70.z
    public HttpRequest G() {
        return this.f95591b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        t70.i iVar = this.f95592c;
        if (iVar != null) {
            iVar.close();
        }
    }

    @Override // w70.z
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        t70.i iVar = this.f95592c;
        if (iVar != null) {
            iVar.d(cVar, gVar);
            if (cVar.e()) {
                this.f95592c.close();
            }
        }
    }

    @Override // w70.z
    public void g0() throws IOException {
        t70.i iVar = this.f95592c;
        if (iVar != null) {
            iVar.close();
        }
    }

    @Override // w70.z
    public HttpHost getTarget() {
        return this.f95590a;
    }

    @Override // w70.z
    public boolean n() {
        t70.i iVar = this.f95592c;
        return iVar == null || iVar.n();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f95590a);
        sb2.append(' ');
        sb2.append(this.f95591b);
        if (this.f95592c != null) {
            sb2.append(' ');
            sb2.append(this.f95592c);
        }
        return sb2.toString();
    }

    public i(HttpHost httpHost, HttpRequest httpRequest) {
        e80.a.j(httpHost, "HTTP host");
        e80.a.j(httpRequest, "HTTP request");
        this.f95590a = httpHost;
        this.f95591b = httpRequest;
        if (httpRequest instanceof org.apache.http.l) {
            HttpEntity entity = ((org.apache.http.l) httpRequest).getEntity();
            if (entity != null) {
                if (entity instanceof t70.i) {
                    this.f95592c = (t70.i) entity;
                    return;
                } else {
                    this.f95592c = new t70.h(entity);
                    return;
                }
            }
            this.f95592c = null;
            return;
        }
        this.f95592c = null;
    }

    @Override // w70.z, w70.b0
    public void b(Exception exc) {
    }

    @Override // w70.z
    public void s(HttpContext httpContext) {
    }
}
