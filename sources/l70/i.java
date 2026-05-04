package l70;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.w;
import org.apache.http.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i extends a implements HttpResponse {

    /* renamed from: c, reason: collision with root package name */
    public x f70698c;

    /* renamed from: d, reason: collision with root package name */
    public ProtocolVersion f70699d;

    /* renamed from: e, reason: collision with root package name */
    public int f70700e;

    /* renamed from: f, reason: collision with root package name */
    public String f70701f;

    /* renamed from: g, reason: collision with root package name */
    public HttpEntity f70702g;

    /* renamed from: h, reason: collision with root package name */
    public final w f70703h;

    /* renamed from: i, reason: collision with root package name */
    public Locale f70704i;

    public i(x xVar, w wVar, Locale locale) {
        this.f70698c = (x) e80.a.j(xVar, "Status line");
        this.f70699d = xVar.getProtocolVersion();
        this.f70700e = xVar.getStatusCode();
        this.f70701f = xVar.getReasonPhrase();
        this.f70703h = wVar;
        this.f70704i = locale;
    }

    @Override // org.apache.http.HttpResponse
    public void a(ProtocolVersion protocolVersion, int i11, String str) {
        e80.a.h(i11, "Status code");
        this.f70698c = null;
        this.f70699d = protocolVersion;
        this.f70700e = i11;
        this.f70701f = str;
    }

    @Override // org.apache.http.HttpResponse
    public void b(String str) {
        this.f70698c = null;
        if (e80.i.b(str)) {
            str = null;
        }
        this.f70701f = str;
    }

    @Override // org.apache.http.HttpResponse
    public void e(int i11) {
        e80.a.h(i11, "Status code");
        this.f70698c = null;
        this.f70700e = i11;
        this.f70701f = null;
    }

    @Override // org.apache.http.HttpResponse
    public HttpEntity getEntity() {
        return this.f70702g;
    }

    @Override // org.apache.http.o
    public ProtocolVersion getProtocolVersion() {
        return this.f70699d;
    }

    @Override // org.apache.http.HttpResponse
    public Locale h() {
        return this.f70704i;
    }

    public String k(int i11) {
        w wVar = this.f70703h;
        if (wVar == null) {
            return null;
        }
        Locale locale = this.f70704i;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return wVar.a(i11, locale);
    }

    @Override // org.apache.http.HttpResponse
    public x n() {
        if (this.f70698c == null) {
            ProtocolVersion protocolVersion = this.f70699d;
            if (protocolVersion == null) {
                protocolVersion = HttpVersion.HTTP_1_1;
            }
            int i11 = this.f70700e;
            String str = this.f70701f;
            if (str == null) {
                str = k(i11);
            }
            this.f70698c = new BasicStatusLine(protocolVersion, i11, str);
        }
        return this.f70698c;
    }

    @Override // org.apache.http.HttpResponse
    public void o(ProtocolVersion protocolVersion, int i11) {
        e80.a.h(i11, "Status code");
        this.f70698c = null;
        this.f70699d = protocolVersion;
        this.f70700e = i11;
        this.f70701f = null;
    }

    @Override // org.apache.http.HttpResponse
    public void p(x xVar) {
        this.f70698c = (x) e80.a.j(xVar, "Status line");
        this.f70699d = xVar.getProtocolVersion();
        this.f70700e = xVar.getStatusCode();
        this.f70701f = xVar.getReasonPhrase();
    }

    @Override // org.apache.http.HttpResponse
    public void setEntity(HttpEntity httpEntity) {
        this.f70702g = httpEntity;
    }

    @Override // org.apache.http.HttpResponse
    public void setLocale(Locale locale) {
        this.f70704i = (Locale) e80.a.j(locale, "Locale");
        this.f70698c = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n());
        sb2.append(' ');
        sb2.append(this.f70670a);
        if (this.f70702g != null) {
            sb2.append(' ');
            sb2.append(this.f70702g);
        }
        return sb2.toString();
    }

    public i(x xVar) {
        this.f70698c = (x) e80.a.j(xVar, "Status line");
        this.f70699d = xVar.getProtocolVersion();
        this.f70700e = xVar.getStatusCode();
        this.f70701f = xVar.getReasonPhrase();
        this.f70703h = null;
        this.f70704i = null;
    }

    public i(ProtocolVersion protocolVersion, int i11, String str) {
        e80.a.h(i11, "Status code");
        this.f70698c = null;
        this.f70699d = protocolVersion;
        this.f70700e = i11;
        this.f70701f = str;
        this.f70703h = null;
        this.f70704i = null;
    }
}
