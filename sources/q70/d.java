package q70;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.HttpRoutedConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public interface d extends HttpRoutedConnection, m70.h, ConnectionReleaseTrigger {
    void Y(HttpParams httpParams) throws IOException;

    Object getState();

    boolean isMarkedReusable();

    void layerProtocol(HttpContext httpContext, HttpParams httpParams) throws IOException;

    void markReusable();

    void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) throws IOException;

    void setIdleDuration(long j11, TimeUnit timeUnit);

    void setState(Object obj);

    void unmarkReusable();

    void x3(HttpHost httpHost, HttpParams httpParams) throws IOException;
}
