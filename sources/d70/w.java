package d70;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import org.apache.commons.logging.Log;
import org.apache.http.HttpHost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Log f47460e;

    /* renamed from: f, reason: collision with root package name */
    public final q70.f f47461f;

    /* renamed from: g, reason: collision with root package name */
    public final c80.j f47462g;

    /* renamed from: h, reason: collision with root package name */
    public final org.apache.http.a f47463h;

    /* renamed from: i, reason: collision with root package name */
    public final ConnectionKeepAliveStrategy f47464i;

    public w(q70.f fVar, ThreadFactory threadFactory, m70.i iVar, c80.j jVar, org.apache.http.a aVar, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        super(fVar, threadFactory, iVar);
        this.f47460e = org.apache.commons.logging.g.q(getClass());
        this.f47461f = fVar;
        this.f47462g = jVar;
        this.f47463h = aVar;
        this.f47464i = connectionKeepAliveStrategy;
    }

    @Override // n70.b
    public <T> Future<List<T>> i(HttpHost httpHost, List<? extends w70.z> list, List<? extends b0<T>> list2, HttpContext httpContext, u60.b<List<T>> bVar) {
        u60.a aVar = new u60.a(bVar);
        if (httpContext == null) {
            httpContext = new c80.a();
        }
        z zVar = new z(this.f47460e, httpHost, list, list2, HttpClientContext.adapt(httpContext), aVar, this.f47461f, this.f47462g, this.f47463h, this.f47464i);
        S(zVar);
        return new k(aVar, zVar);
    }

    @Override // n70.a
    public <T> Future<T> j(w70.z zVar, b0<T> b0Var, HttpContext httpContext, u60.b<T> bVar) {
        u60.a aVar = new u60.a(bVar);
        if (httpContext == null) {
            httpContext = new c80.a();
        }
        v vVar = new v(this.f47460e, zVar, b0Var, HttpClientContext.adapt(httpContext), aVar, this.f47461f, this.f47462g, this.f47463h, this.f47464i);
        S(vVar);
        return new k(aVar, vVar);
    }

    public w(q70.f fVar, c80.j jVar) {
        this(fVar, Executors.defaultThreadFactory(), new w70.u(), jVar, x60.i.f97640a, DefaultConnectionKeepAliveStrategy.INSTANCE);
    }
}
