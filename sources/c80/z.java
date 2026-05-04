package c80;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class z implements org.apache.http.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f8368a;

    public z(String str) {
        this.f8368a = str;
    }

    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        if (httpRequest.f("User-Agent")) {
            return;
        }
        HttpParams params = httpRequest.getParams();
        String str = params != null ? (String) params.getParameter(a80.c.f2305d) : null;
        if (str == null) {
            str = this.f8368a;
        }
        if (str != null) {
            httpRequest.q("User-Agent", str);
        }
    }

    public z() {
        this(null);
    }
}
