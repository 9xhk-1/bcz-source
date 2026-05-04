package w70;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface c0 extends Closeable {
    void b(Exception exc);

    void d(m70.c cVar, m70.g gVar) throws IOException;

    HttpResponse k5();

    void p(HttpContext httpContext);
}
