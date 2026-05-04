package c80;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class w implements org.apache.http.q {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8366a = new h();

    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        if (!(httpRequest instanceof org.apache.http.l) || httpRequest.f("Date")) {
            return;
        }
        httpRequest.g("Date", f8366a.a());
    }
}
