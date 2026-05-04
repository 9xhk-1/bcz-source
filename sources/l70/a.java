package l70;

import org.apache.http.message.BasicHeader;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a implements org.apache.http.o {

    /* renamed from: a, reason: collision with root package name */
    public HeaderGroup f70670a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public HttpParams f70671b;

    @Deprecated
    public a(HttpParams httpParams) {
        this.f70670a = new HeaderGroup();
        this.f70671b = httpParams;
    }

    @Override // org.apache.http.o
    public void c(org.apache.http.e eVar) {
        this.f70670a.addHeader(eVar);
    }

    @Override // org.apache.http.o
    public void d(org.apache.http.e eVar) {
        this.f70670a.removeHeader(eVar);
    }

    @Override // org.apache.http.o
    public boolean f(String str) {
        return this.f70670a.containsHeader(str);
    }

    @Override // org.apache.http.o
    public void g(String str, String str2) {
        e80.a.j(str, "Header name");
        this.f70670a.updateHeader(new BasicHeader(str, str2));
    }

    @Override // org.apache.http.o
    @Deprecated
    public HttpParams getParams() {
        if (this.f70671b == null) {
            this.f70671b = new BasicHttpParams();
        }
        return this.f70671b;
    }

    @Override // org.apache.http.o
    @Deprecated
    public void i(HttpParams httpParams) {
        this.f70671b = (HttpParams) e80.a.j(httpParams, "HTTP parameters");
    }

    @Override // org.apache.http.o
    public org.apache.http.e j(String str) {
        return this.f70670a.getLastHeader(str);
    }

    @Override // org.apache.http.o
    public org.apache.http.h l() {
        return this.f70670a.iterator();
    }

    @Override // org.apache.http.o
    public org.apache.http.e[] m(String str) {
        return this.f70670a.getHeaders(str);
    }

    @Override // org.apache.http.o
    public void q(String str, String str2) {
        e80.a.j(str, "Header name");
        this.f70670a.addHeader(new BasicHeader(str, str2));
    }

    @Override // org.apache.http.o
    public void s(org.apache.http.e eVar) {
        this.f70670a.updateHeader(eVar);
    }

    @Override // org.apache.http.o
    public org.apache.http.h t(String str) {
        return this.f70670a.iterator(str);
    }

    @Override // org.apache.http.o
    public void u(org.apache.http.e[] eVarArr) {
        this.f70670a.setHeaders(eVarArr);
    }

    @Override // org.apache.http.o
    public void v(String str) {
        if (str == null) {
            return;
        }
        org.apache.http.h it = this.f70670a.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.r().getName())) {
                it.remove();
            }
        }
    }

    @Override // org.apache.http.o
    public org.apache.http.e w(String str) {
        return this.f70670a.getFirstHeader(str);
    }

    @Override // org.apache.http.o
    public org.apache.http.e[] x() {
        return this.f70670a.getAllHeaders();
    }

    public a() {
        this(null);
    }
}
