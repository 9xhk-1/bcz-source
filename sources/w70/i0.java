package w70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public interface i0 {
    t70.b a(org.apache.http.l lVar, HttpContext httpContext) throws HttpException, IOException;

    void b(HttpRequest httpRequest, HttpResponse httpResponse, l0 l0Var, HttpContext httpContext) throws HttpException, IOException;
}
