package c80;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final org.apache.http.q[] f8363a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.s[] f8364b;

    public t(org.apache.http.q[] qVarArr, org.apache.http.s[] sVarArr) {
        if (qVarArr != null) {
            int length = qVarArr.length;
            org.apache.http.q[] qVarArr2 = new org.apache.http.q[length];
            this.f8363a = qVarArr2;
            System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
        } else {
            this.f8363a = new org.apache.http.q[0];
        }
        if (sVarArr == null) {
            this.f8364b = new org.apache.http.s[0];
            return;
        }
        int length2 = sVarArr.length;
        org.apache.http.s[] sVarArr2 = new org.apache.http.s[length2];
        this.f8364b = sVarArr2;
        System.arraycopy(sVarArr, 0, sVarArr2, 0, length2);
    }

    @Override // org.apache.http.s
    public void g(HttpResponse httpResponse, HttpContext httpContext) throws IOException, HttpException {
        for (org.apache.http.s sVar : this.f8364b) {
            sVar.g(httpResponse, httpContext);
        }
    }

    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException, HttpException {
        for (org.apache.http.q qVar : this.f8363a) {
            qVar.process(httpRequest, httpContext);
        }
    }

    public t(List<org.apache.http.q> list, List<org.apache.http.s> list2) {
        if (list != null) {
            this.f8363a = (org.apache.http.q[]) list.toArray(new org.apache.http.q[list.size()]);
        } else {
            this.f8363a = new org.apache.http.q[0];
        }
        if (list2 != null) {
            this.f8364b = (org.apache.http.s[]) list2.toArray(new org.apache.http.s[list2.size()]);
        } else {
            this.f8364b = new org.apache.http.s[0];
        }
    }

    @Deprecated
    public t(q qVar, r rVar) {
        if (qVar != null) {
            int c11 = qVar.c();
            this.f8363a = new org.apache.http.q[c11];
            for (int i11 = 0; i11 < c11; i11++) {
                this.f8363a[i11] = qVar.l(i11);
            }
        } else {
            this.f8363a = new org.apache.http.q[0];
        }
        if (rVar != null) {
            int d11 = rVar.d();
            this.f8364b = new org.apache.http.s[d11];
            for (int i12 = 0; i12 < d11; i12++) {
                this.f8364b[i12] = rVar.i(i12);
            }
            return;
        }
        this.f8364b = new org.apache.http.s[0];
    }

    public t(org.apache.http.q... qVarArr) {
        this(qVarArr, (org.apache.http.s[]) null);
    }

    public t(org.apache.http.s... sVarArr) {
        this((org.apache.http.q[]) null, sVarArr);
    }
}
