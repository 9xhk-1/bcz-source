package io.ktor.client.engine.apache;

import a00.w1;
import c40.l2;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.SSLContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.apache.http.HttpHost;
import rw.c1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApacheEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApacheEngine.kt\nio/ktor/client/engine/apache/ApacheEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
/* loaded from: classes8.dex */
public final class e extends ow.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j f60734e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<? extends Object>> f60735f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d70.c f60736g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.apache.ApacheEngine", f = "ApacheEngine.kt", i = {0, 0}, l = {29, 32}, m = "execute", n = {"this", "data"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60737a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60738b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f60739c;

        /* renamed from: e, reason: collision with root package name */
        public int f60741e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60739c = obj;
            this.f60741e |= Integer.MIN_VALUE;
            return e.this.B0(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@m80.k j config) {
        super("ktor-apache");
        g0.p(config, "config");
        this.f60734e = config;
        this.f60735f = w1.u(c1.f84603a, zw.s.f102985a);
        d70.c c02 = c0();
        c02.H();
        this.f60736g = c02;
    }

    public static final g2 V(e eVar, Throwable th2) {
        eVar.f60736g.close();
        return g2.f100423a;
    }

    public static final Thread m0(Runnable runnable) {
        Thread thread = new Thread(runnable, "Ktor-client-apache");
        thread.setDaemon(true);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.ktor.client.engine.apache.b
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread2, Throwable th2) {
                e.o0(thread2, th2);
            }
        });
        return thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ow.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(@m80.k cx.z r7, @m80.k j00.c<? super cx.f0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.client.engine.apache.e.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.engine.apache.e$a r0 = (io.ktor.client.engine.apache.e.a) r0
            int r1 = r0.f60741e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60741e = r1
            goto L18
        L13:
            io.ktor.client.engine.apache.e$a r0 = new io.ktor.client.engine.apache.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f60739c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60741e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f60738b
            cx.z r7 = (cx.z) r7
            java.lang.Object r2 = r0.f60737a
            io.ktor.client.engine.apache.e r2 = (io.ktor.client.engine.apache.e) r2
            kotlin.e.n(r8)
            goto L51
        L40:
            kotlin.e.n(r8)
            r0.f60737a = r6
            r0.f60738b = r7
            r0.f60741e = r4
            java.lang.Object r8 = ow.u.e(r0)
            if (r8 != r1) goto L50
            goto L6b
        L50:
            r2 = r6
        L51:
            kotlin.coroutines.d r8 = (kotlin.coroutines.d) r8
            io.ktor.client.engine.apache.p r4 = new io.ktor.client.engine.apache.p
            io.ktor.client.engine.apache.j r5 = r2.getConfig()
            r4.<init>(r7, r5, r8)
            d70.c r2 = r2.f60736g
            r5 = 0
            r0.f60737a = r5
            r0.f60738b = r5
            r0.f60741e = r3
            java.lang.Object r7 = io.ktor.client.engine.apache.l.b(r2, r4, r8, r7, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.apache.e.B0(cx.z, j00.c):java.lang.Object");
    }

    @Override // ow.e, ow.a
    @m80.k
    public Set<ow.h<? extends Object>> D2() {
        return this.f60735f;
    }

    @Override // ow.a
    @m80.k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public j getConfig() {
        return this.f60734e;
    }

    public final d70.c c0() {
        d70.l k11 = d70.m.k();
        k11.L(new ThreadFactory() { // from class: io.ktor.client.engine.apache.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m02;
                m02 = e.m0(runnable);
                return m02;
            }
        });
        k11.g();
        k11.h();
        k11.i();
        k11.z(1000);
        k11.A(1000);
        k11.t(h70.i.c().g(4).a());
        g0.m(k11);
        v0(k11);
        x00.l<d70.l, d70.l> v11 = getConfig().v();
        g0.m(k11);
        v11.invoke(k11);
        SSLContext z11 = getConfig().z();
        if (z11 != null) {
            k11.G(z11);
        }
        d70.c e11 = k11.e();
        g0.m(e11);
        return e11;
    }

    @Override // ow.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        d.b bVar = getCoroutineContext().get(l2.f7886e0);
        g0.m(bVar);
        ((l2) bVar).z0(new x00.l() { // from class: io.ktor.client.engine.apache.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 V;
                V = e.V(e.this, (Throwable) obj);
                return V;
            }
        });
    }

    public final void v0(d70.l lVar) {
        Proxy c11 = getConfig().c();
        if (c11 == null || c11.type() == Proxy.Type.DIRECT) {
            return;
        }
        SocketAddress address = c11.address();
        if (c11.type() != Proxy.Type.HTTP || !(address instanceof InetSocketAddress)) {
            throw new IllegalStateException("Only http proxy is supported for Apache engine.");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
        sb2.append(inetSocketAddress.getHostName());
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
        lVar.B(HttpHost.create(sb2.toString()));
    }

    public static final void o0(Thread thread, Throwable th2) {
    }
}
