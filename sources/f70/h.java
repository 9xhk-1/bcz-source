package f70;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class h extends v70.a<HttpRoute, x70.f, j> {

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicLong f51165t = new AtomicLong(1);

    /* renamed from: p, reason: collision with root package name */
    public final Log f51166p;

    /* renamed from: q, reason: collision with root package name */
    public final r70.b f51167q;

    /* renamed from: r, reason: collision with root package name */
    public final long f51168r;

    /* renamed from: s, reason: collision with root package name */
    public final TimeUnit f51169s;

    public h(Log log, x70.a aVar, r70.b bVar, long j11, TimeUnit timeUnit) {
        super(aVar, new i(), 2, 20);
        this.f51166p = log;
        this.f51167q = bVar;
        this.f51168r = j11;
        this.f51169s = timeUnit;
    }

    @Override // v70.a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public j i(HttpRoute httpRoute, x70.f fVar) {
        return new j(this.f51166p, Long.toString(f51165t.getAndIncrement()), httpRoute, fVar, this.f51168r, this.f51169s);
    }

    @Override // v70.a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public SocketAddress K(HttpRoute httpRoute) {
        return new InetSocketAddress(httpRoute.getLocalAddress(), 0);
    }

    @Override // v70.a
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public SocketAddress L(HttpRoute httpRoute) {
        HttpHost proxyHost = httpRoute.getProxyHost();
        if (proxyHost == null) {
            proxyHost = httpRoute.getTargetHost();
        }
        String hostName = proxyHost.getHostName();
        int port = proxyHost.getPort();
        if (port < 0) {
            port = this.f51167q.c(proxyHost).d(port);
        }
        return new InetSocketAddress(hostName, port);
    }
}
