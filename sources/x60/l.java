package x60;

import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.w;
import org.apache.http.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class l implements org.apache.http.r {

    /* renamed from: b, reason: collision with root package name */
    public static final l f97646b = new l();

    /* renamed from: a, reason: collision with root package name */
    public final w f97647a;

    public l(w wVar) {
        this.f97647a = (w) e80.a.j(wVar, "Reason phrase catalog");
    }

    @Override // org.apache.http.r
    public HttpResponse a(ProtocolVersion protocolVersion, int i11, HttpContext httpContext) {
        e80.a.j(protocolVersion, "HTTP version");
        Locale c11 = c(httpContext);
        return new l70.i(new BasicStatusLine(protocolVersion, i11, this.f97647a.a(i11, c11)), this.f97647a, c11);
    }

    @Override // org.apache.http.r
    public HttpResponse b(x xVar, HttpContext httpContext) {
        e80.a.j(xVar, "Status line");
        return new l70.i(xVar, this.f97647a, c(httpContext));
    }

    public Locale c(HttpContext httpContext) {
        return Locale.getDefault();
    }

    public l() {
        this(n.f97648a);
    }
}
