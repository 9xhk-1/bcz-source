package d70;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public q70.f f47465a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47466b;

    /* renamed from: c, reason: collision with root package name */
    public org.apache.http.a f47467c;

    /* renamed from: d, reason: collision with root package name */
    public ConnectionKeepAliveStrategy f47468d;

    /* renamed from: e, reason: collision with root package name */
    public String f47469e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadFactory f47470f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47471g;

    public static x b() {
        return new x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.apache.http.client.protocol.RequestAddCookies, org.apache.http.q] */
    /* JADX WARN: Type inference failed for: r0v16, types: [org.apache.http.client.protocol.ResponseProcessCookies, org.apache.http.s] */
    public w a() {
        ThreadFactory threadFactory;
        w70.u uVar;
        q70.f fVar = this.f47465a;
        if (fVar == null) {
            fVar = new f70.p(n.a(h70.i.f58765n, this.f47470f));
        }
        q70.f fVar2 = fVar;
        org.apache.http.a aVar = this.f47467c;
        if (aVar == null) {
            aVar = x60.i.f97640a;
        }
        org.apache.http.a aVar2 = aVar;
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy = this.f47468d;
        if (connectionKeepAliveStrategy == null) {
            connectionKeepAliveStrategy = DefaultConnectionKeepAliveStrategy.INSTANCE;
        }
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy2 = connectionKeepAliveStrategy;
        String str = this.f47469e;
        if (str == null) {
            str = e80.j.g("Apache-HttpAsyncClient", "org.apache.http.nio.client", getClass());
        }
        c80.k n11 = c80.k.n();
        n11.c(new c80.v(), new c80.y(), new RequestClientConnControl(), new c80.z(str));
        if (!this.f47471g) {
            n11.a(new RequestAddCookies());
            n11.b(new ResponseProcessCookies());
        }
        c80.j m11 = n11.m();
        if (this.f47466b) {
            threadFactory = null;
            uVar = null;
        } else {
            ThreadFactory threadFactory2 = this.f47470f;
            if (threadFactory2 == null) {
                threadFactory2 = Executors.defaultThreadFactory();
            }
            threadFactory = threadFactory2;
            uVar = new w70.u();
        }
        return new w(fVar2, threadFactory, uVar, m11, aVar2, connectionKeepAliveStrategy2);
    }

    public final x c() {
        this.f47471g = true;
        return this;
    }

    public final x d(q70.f fVar) {
        this.f47465a = fVar;
        return this;
    }

    public final x e(boolean z11) {
        this.f47466b = z11;
        return this;
    }

    public final x f(org.apache.http.a aVar) {
        this.f47467c = aVar;
        return this;
    }

    public final x g(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f47468d = connectionKeepAliveStrategy;
        return this;
    }

    public final x h(ThreadFactory threadFactory) {
        this.f47470f = threadFactory;
        return this;
    }

    public final x i(String str) {
        this.f47469e = str;
        return this;
    }
}
