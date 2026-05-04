package g70;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m70.h;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import v70.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class b extends v70.a<HttpHost, h, c> {

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicLong f53151q = new AtomicLong();

    /* renamed from: p, reason: collision with root package name */
    public final int f53152p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements e<HttpHost> {
        @Override // v70.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SocketAddress a(HttpHost httpHost) {
            return null;
        }

        @Override // v70.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public SocketAddress b(HttpHost httpHost) {
            String hostName = httpHost.getHostName();
            int port = httpHost.getPort();
            if (port == -1) {
                if (httpHost.getSchemeName().equalsIgnoreCase("http")) {
                    port = 80;
                } else if (httpHost.getSchemeName().equalsIgnoreCase("https")) {
                    port = 443;
                }
            }
            return new InetSocketAddress(hostName, port);
        }
    }

    @Deprecated
    public b(x70.a aVar, v70.c<HttpHost, h> cVar, HttpParams httpParams) {
        super(aVar, cVar, 2, 20);
        e80.a.j(httpParams, "HTTP parameters");
        this.f53152p = httpParams.getIntParameter(a80.b.f2296f, 0);
    }

    @Override // v70.a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public c i(HttpHost httpHost, h hVar) {
        c cVar = new c(Long.toString(f53151q.getAndIncrement()), httpHost, hVar);
        cVar.p(hVar.x());
        return cVar;
    }

    @Override // v70.a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Future<c> v(HttpHost httpHost, Object obj) {
        return super.x(httpHost, obj, this.f53152p, TimeUnit.MILLISECONDS, null);
    }

    @Override // v70.a, b80.c
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Future<c> b(HttpHost httpHost, Object obj, u60.b<c> bVar) {
        return super.x(httpHost, obj, this.f53152p, TimeUnit.MILLISECONDS, bVar);
    }

    @Override // v70.a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void y(c cVar) {
        cVar.b().setSocketTimeout(cVar.o());
    }

    @Override // v70.a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void z(c cVar) {
        h b11 = cVar.b();
        cVar.p(b11.x());
        b11.setSocketTimeout(0);
    }

    @Override // v70.a
    @Deprecated
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public SocketAddress K(HttpHost httpHost) {
        return null;
    }

    @Override // v70.a
    @Deprecated
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public SocketAddress L(HttpHost httpHost) {
        return new InetSocketAddress(httpHost.getHostName(), httpHost.getPort());
    }

    @Deprecated
    public b(x70.a aVar, HttpParams httpParams) {
        this(aVar, new g70.a(httpParams), httpParams);
    }

    public b(x70.a aVar, v70.c<HttpHost, h> cVar, int i11) {
        super(aVar, cVar, new a(), 2, 20);
        this.f53152p = i11;
    }

    public b(x70.a aVar, int i11, v60.a aVar2) {
        this(aVar, new g70.a(aVar2), i11);
    }

    public b(x70.a aVar, v60.a aVar2) {
        this(aVar, new g70.a(aVar2), 0);
    }

    public b(x70.a aVar) {
        this(aVar, new g70.a(v60.a.f93116g), 0);
    }
}
