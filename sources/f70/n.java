package f70;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n extends b70.d implements q70.e {

    /* renamed from: v, reason: collision with root package name */
    public final Log f51191v;

    /* renamed from: w, reason: collision with root package name */
    public final Log f51192w;

    /* renamed from: x, reason: collision with root package name */
    public final Log f51193x;

    /* renamed from: y, reason: collision with root package name */
    public final String f51194y;

    /* renamed from: z, reason: collision with root package name */
    public x70.f f51195z;

    public n(String str, Log log, Log log2, Log log3, x70.f fVar, int i11, int i12, z70.b bVar, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar, w60.e eVar, w60.e eVar2, m70.q<HttpRequest> qVar, m70.o<HttpResponse> oVar) {
        super(fVar, i11, i12, bVar, charsetDecoder, charsetEncoder, cVar, eVar, eVar2, qVar, oVar);
        this.f51194y = str;
        this.f51193x = log;
        this.f51191v = log2;
        this.f51192w = log3;
        this.f51195z = fVar;
        if (log.isDebugEnabled() || log3.isDebugEnabled()) {
            super.S0(new k(fVar, str, log, log3));
        }
    }

    @Override // b70.j, q70.e
    public void S0(x70.f fVar) {
        e80.a.j(fVar, "I/O session");
        e80.b.a(!fVar.isClosed(), "I/O session is closed");
        this.f6335s = 0;
        this.f51195z = fVar;
        if (!this.f51193x.isDebugEnabled() && !this.f51192w.isDebugEnabled()) {
            super.S0(fVar);
            return;
        }
        this.f51193x.debug(this.f51194y + " Upgrade session " + fVar);
        super.S0(new k(fVar, this.f51194y, this.f51193x, this.f51192w));
    }

    @Override // b70.d
    public void d0(HttpRequest httpRequest) {
        if (httpRequest == null || !this.f51191v.isDebugEnabled()) {
            return;
        }
        this.f51191v.debug(this.f51194y + " >> " + httpRequest.getRequestLine().toString());
        for (org.apache.http.e eVar : httpRequest.x()) {
            this.f51191v.debug(this.f51194y + " >> " + eVar.toString());
        }
    }

    @Override // b70.d
    public void f0(HttpResponse httpResponse) {
        if (httpResponse == null || !this.f51191v.isDebugEnabled()) {
            return;
        }
        this.f51191v.debug(this.f51194y + " << " + httpResponse.n().toString());
        for (org.apache.http.e eVar : httpResponse.x()) {
            this.f51191v.debug(this.f51194y + " << " + eVar.toString());
        }
    }

    @Override // q70.e
    public String getId() {
        return this.f51194y;
    }

    @Override // q70.e
    public SSLSession getSSLSession() {
        x70.f fVar = this.f51195z;
        if (fVar instanceof y70.e) {
            return ((y70.e) fVar).u();
        }
        return null;
    }

    @Override // q70.e
    public x70.f o() {
        return this.f51195z;
    }

    @Override // b70.j
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51194y);
        sb2.append(" [");
        int i11 = this.f6335s;
        if (i11 == 0) {
            sb2.append("ACTIVE");
            if (this.f6319c.a()) {
                sb2.append(pn.j.f81006c);
                sb2.append(this.f6319c.length());
                sb2.append(pn.j.f81007d);
            }
        } else if (i11 == 1) {
            sb2.append("CLOSING");
        } else if (i11 == 2) {
            sb2.append("CLOSED");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
