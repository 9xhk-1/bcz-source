package c80;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class c0 implements org.apache.http.s {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8302a = new h();

    @Override // org.apache.http.s
    public void g(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        if (httpResponse.n().getStatusCode() < 200 || httpResponse.f("Date")) {
            return;
        }
        httpResponse.g("Date", f8302a.a());
    }
}
