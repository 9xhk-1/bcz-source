package w70;

import java.io.IOException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public interface h0 {
    void a(HttpContext httpContext, Object obj);

    void b(HttpContext httpContext);

    HttpRequest c(HttpContext httpContext);

    void d(HttpResponse httpResponse, HttpContext httpContext) throws IOException;

    t70.b e(HttpResponse httpResponse, HttpContext httpContext) throws IOException;
}
