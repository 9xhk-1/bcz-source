package f70;

import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class e extends b70.d implements q70.a {

    /* renamed from: v, reason: collision with root package name */
    public final Log f51151v;

    /* renamed from: w, reason: collision with root package name */
    public final Log f51152w;

    /* renamed from: x, reason: collision with root package name */
    public final Log f51153x;

    /* renamed from: y, reason: collision with root package name */
    public final String f51154y;

    /* renamed from: z, reason: collision with root package name */
    public x70.f f51155z;

    public e(String str, x70.f fVar, r rVar, z70.b bVar, HttpParams httpParams) {
        super(fVar, rVar, bVar, httpParams);
        this.f51151v = org.apache.commons.logging.g.r("org.apache.http.headers");
        Log r11 = org.apache.commons.logging.g.r("org.apache.http.wire");
        this.f51152w = r11;
        this.f51154y = str;
        this.f51155z = fVar;
        Log q11 = org.apache.commons.logging.g.q(fVar.getClass());
        this.f51153x = q11;
        if (q11.isDebugEnabled() || r11.isDebugEnabled()) {
            S0(new k(fVar, str, q11, r11));
        }
    }

    @Override // q70.a
    public void c1(x70.f fVar) {
        this.f51155z = fVar;
        if (!this.f51153x.isDebugEnabled() && !this.f51152w.isDebugEnabled()) {
            S0(fVar);
            return;
        }
        this.f51153x.debug(this.f51154y + " Upgrade session " + fVar);
        S0(new k(fVar, this.f51154y, this.f51151v, this.f51152w));
    }

    @Override // b70.d
    public void d0(HttpRequest httpRequest) {
        if (httpRequest == null || !this.f51151v.isDebugEnabled()) {
            return;
        }
        this.f51151v.debug(this.f51154y + " >> " + httpRequest.getRequestLine().toString());
        for (org.apache.http.e eVar : httpRequest.x()) {
            this.f51151v.debug(this.f51154y + " >> " + eVar.toString());
        }
    }

    @Override // b70.d
    public void f0(HttpResponse httpResponse) {
        if (httpResponse == null || !this.f51151v.isDebugEnabled()) {
            return;
        }
        this.f51151v.debug(this.f51154y + " << " + httpResponse.n().toString());
        for (org.apache.http.e eVar : httpResponse.x()) {
            this.f51151v.debug(this.f51154y + " << " + eVar.toString());
        }
    }

    public String getId() {
        return this.f51154y;
    }

    @Override // q70.a
    public x70.f o() {
        return this.f51155z;
    }

    @Override // b70.j
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51154y);
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
