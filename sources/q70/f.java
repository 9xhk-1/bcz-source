package q70;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface f {
    void b(x70.c cVar) throws IOException;

    boolean c(m70.h hVar);

    void closeExpiredConnections();

    void closeIdleConnections(long j11, TimeUnit timeUnit);

    void d(m70.h hVar, HttpRoute httpRoute, HttpContext httpContext);

    Future<m70.h> i(HttpRoute httpRoute, Object obj, long j11, long j12, TimeUnit timeUnit, u60.b<m70.h> bVar);

    void j(m70.h hVar, HttpRoute httpRoute, HttpContext httpContext) throws IOException;

    void l(m70.h hVar, Object obj, long j11, TimeUnit timeUnit);

    void p(m70.h hVar, HttpRoute httpRoute, HttpContext httpContext) throws IOException;

    void shutdown() throws IOException;
}
