package c80;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class x implements org.apache.http.q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8367a;

    @Deprecated
    public x() {
        this(false);
    }

    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        if (httpRequest.f("Expect") || !(httpRequest instanceof org.apache.http.l)) {
            return;
        }
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        HttpEntity entity = ((org.apache.http.l) httpRequest).getEntity();
        if (entity == null || entity.c0() == 0 || protocolVersion.lessEquals(HttpVersion.HTTP_1_0) || !httpRequest.getParams().getBooleanParameter(a80.c.f2308g, this.f8367a)) {
            return;
        }
        httpRequest.q("Expect", f.f8326o);
    }

    public x(boolean z11) {
        this.f8367a = z11;
    }
}
