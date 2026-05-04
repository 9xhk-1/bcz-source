package z50;

import a00.i0;
import e60.j;
import j60.e;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.i1;
import l60.m;
import l60.r0;
import m80.k;
import m80.l;
import okhttp3.Protocol;
import okhttp3.g;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.b;
import okhttp3.l;
import okhttp3.n;
import t50.q;
import t50.r;
import u30.f0;
import u30.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f extends b.c implements t50.f {

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final a f100986t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    @k
    public static final String f100987u = "throw with null exception";

    /* renamed from: v, reason: collision with root package name */
    public static final int f100988v = 21;

    /* renamed from: w, reason: collision with root package name */
    public static final long f100989w = 10000000000L;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f100990c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r f100991d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Socket f100992e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Socket f100993f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public okhttp3.g f100994g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Protocol f100995h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public okhttp3.internal.http2.b f100996i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public m f100997j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public l60.l f100998k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f100999l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f101000m;

    /* renamed from: n, reason: collision with root package name */
    public int f101001n;

    /* renamed from: o, reason: collision with root package name */
    public int f101002o;

    /* renamed from: p, reason: collision with root package name */
    public int f101003p;

    /* renamed from: q, reason: collision with root package name */
    public int f101004q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final List<Reference<z50.e>> f101005r;

    /* renamed from: s, reason: collision with root package name */
    public long f101006s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final f a(@k g connectionPool, @k r route, @k Socket socket, long j11) {
            g0.p(connectionPool, "connectionPool");
            g0.p(route, "route");
            g0.p(socket, "socket");
            f fVar = new f(connectionPool, route);
            fVar.f100993f = socket;
            fVar.G(j11);
            return fVar;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101007a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101007a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<List<? extends Certificate>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t50.d f101008a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ okhttp3.g f101009b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ okhttp3.a f101010c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t50.d dVar, okhttp3.g gVar, okhttp3.a aVar) {
            super(0);
            this.f101008a = dVar;
            this.f101009b = gVar;
            this.f101010c = aVar;
        }

        @Override // x00.a
        @k
        public final List<? extends Certificate> invoke() {
            i60.c e11 = this.f101008a.e();
            g0.m(e11);
            return e11.a(this.f101009b.m(), this.f101010c.w().F());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
    public static final class d extends Lambda implements x00.a<List<? extends X509Certificate>> {
        public d() {
            super(0);
        }

        @Override // x00.a
        @k
        public final List<? extends X509Certificate> invoke() {
            okhttp3.g gVar = f.this.f100994g;
            g0.m(gVar);
            List<Certificate> m11 = gVar.m();
            ArrayList arrayList = new ArrayList(i0.d0(m11, 10));
            for (Certificate certificate : m11) {
                g0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends e.d {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z50.c f101012d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar, l60.l lVar, z50.c cVar) {
            super(true, mVar, lVar);
            this.f101012d = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f101012d.a(-1L, true, true, null);
        }
    }

    public f(@k g connectionPool, @k r route) {
        g0.p(connectionPool, "connectionPool");
        g0.p(route, "route");
        this.f100990c = connectionPool;
        this.f100991d = route;
        this.f101004q = 1;
        this.f101005r = new ArrayList();
        this.f101006s = Long.MAX_VALUE;
    }

    public final boolean A() {
        return this.f100996i != null;
    }

    @k
    public final a60.d B(@k q client, @k a60.g chain) throws SocketException {
        g0.p(client, "client");
        g0.p(chain, "chain");
        Socket socket = this.f100993f;
        g0.m(socket);
        m mVar = this.f100997j;
        g0.m(mVar);
        l60.l lVar = this.f100998k;
        g0.m(lVar);
        okhttp3.internal.http2.b bVar = this.f100996i;
        if (bVar != null) {
            return new c60.c(client, this, chain, bVar);
        }
        socket.setSoTimeout(chain.a());
        i1 D = mVar.D();
        long m11 = chain.m();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        D.k(m11, timeUnit);
        lVar.D().k(chain.o(), timeUnit);
        return new b60.b(client, this, mVar, lVar);
    }

    @k
    public final e.d C(@k z50.c exchange) throws SocketException {
        g0.p(exchange, "exchange");
        Socket socket = this.f100993f;
        g0.m(socket);
        m mVar = this.f100997j;
        g0.m(mVar);
        l60.l lVar = this.f100998k;
        g0.m(lVar);
        socket.setSoTimeout(0);
        E();
        return new e(mVar, lVar, exchange);
    }

    public final synchronized void D() {
        this.f101000m = true;
    }

    public final synchronized void E() {
        this.f100999l = true;
    }

    public final boolean F(List<r> list) {
        List<r> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (r rVar : list2) {
            Proxy.Type type = rVar.e().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f100991d.e().type() == type2 && g0.g(this.f100991d.g(), rVar.g())) {
                return true;
            }
        }
        return false;
    }

    public final void G(long j11) {
        this.f101006s = j11;
    }

    public final void H(boolean z11) {
        this.f100999l = z11;
    }

    public final void I(int i11) {
        this.f101001n = i11;
    }

    public final void J(int i11) throws IOException {
        Socket socket = this.f100993f;
        g0.m(socket);
        m mVar = this.f100997j;
        g0.m(mVar);
        l60.l lVar = this.f100998k;
        g0.m(lVar);
        socket.setSoTimeout(0);
        okhttp3.internal.http2.b a11 = new b.a(true, y50.d.f99391i).y(socket, this.f100991d.d().w().F(), mVar, lVar).k(this).l(i11).a();
        this.f100996i = a11;
        this.f101004q = okhttp3.internal.http2.b.D.a().f();
        okhttp3.internal.http2.b.j1(a11, false, null, 3, null);
    }

    public final boolean K(okhttp3.i iVar) {
        okhttp3.g gVar;
        if (u50.f.f91853h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        okhttp3.i w11 = this.f100991d.d().w();
        if (iVar.N() != w11.N()) {
            return false;
        }
        if (g0.g(iVar.F(), w11.F())) {
            return true;
        }
        if (!this.f101000m && (gVar = this.f100994g) != null) {
            g0.m(gVar);
            if (j(iVar, gVar)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void L(@k z50.e call, @l IOException iOException) {
        try {
            g0.p(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i11 = this.f101003p + 1;
                    this.f101003p = i11;
                    if (i11 > 1) {
                        this.f100999l = true;
                        this.f101001n++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.isCanceled()) {
                    this.f100999l = true;
                    this.f101001n++;
                }
            } else if (!A() || (iOException instanceof ConnectionShutdownException)) {
                this.f100999l = true;
                if (this.f101002o == 0) {
                    if (iOException != null) {
                        l(call.j(), this.f100991d, iOException);
                    }
                    this.f101001n++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // t50.f
    @k
    public Protocol a() {
        Protocol protocol = this.f100995h;
        g0.m(protocol);
        return protocol;
    }

    @Override // t50.f
    @k
    public r b() {
        return this.f100991d;
    }

    @Override // t50.f
    @l
    public okhttp3.g c() {
        return this.f100994g;
    }

    @Override // t50.f
    @k
    public Socket d() {
        Socket socket = this.f100993f;
        g0.m(socket);
        return socket;
    }

    @Override // okhttp3.internal.http2.b.c
    public synchronized void e(@k okhttp3.internal.http2.b connection, @k c60.g settings) {
        g0.p(connection, "connection");
        g0.p(settings, "settings");
        this.f101004q = settings.f();
    }

    @Override // okhttp3.internal.http2.b.c
    public void f(@k c60.d stream) throws IOException {
        g0.p(stream, "stream");
        stream.d(ErrorCode.REFUSED_STREAM, null);
    }

    public final void i() {
        Socket socket = this.f100992e;
        if (socket != null) {
            u50.f.q(socket);
        }
    }

    public final boolean j(okhttp3.i iVar, okhttp3.g gVar) {
        List<Certificate> m11 = gVar.m();
        if (!m11.isEmpty()) {
            i60.d dVar = i60.d.f60210a;
            String F = iVar.F();
            Certificate certificate = m11.get(0);
            g0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(F, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r13, int r14, int r15, int r16, boolean r17, @m80.k t50.b r18, @m80.k t50.m r19) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z50.f.k(int, int, int, int, boolean, t50.b, t50.m):void");
    }

    public final void l(@k q client, @k r failedRoute, @k IOException failure) {
        g0.p(client, "client");
        g0.p(failedRoute, "failedRoute");
        g0.p(failure, "failure");
        if (failedRoute.e().type() != Proxy.Type.DIRECT) {
            okhttp3.a d11 = failedRoute.d();
            d11.t().connectFailed(d11.w().Z(), failedRoute.e().address(), failure);
        }
        client.e0().b(failedRoute);
    }

    public final void m(int i11, int i12, t50.b bVar, t50.m mVar) throws IOException {
        Socket createSocket;
        Proxy e11 = this.f100991d.e();
        okhttp3.a d11 = this.f100991d.d();
        Proxy.Type type = e11.type();
        int i13 = type == null ? -1 : b.f101007a[type.ordinal()];
        if (i13 == 1 || i13 == 2) {
            createSocket = d11.u().createSocket();
            g0.m(createSocket);
        } else {
            createSocket = new Socket(e11);
        }
        this.f100992e = createSocket;
        mVar.j(bVar, this.f100991d.g(), e11);
        createSocket.setSoTimeout(i12);
        try {
            j.f49490a.g().g(createSocket, this.f100991d.g(), i11);
            try {
                this.f100997j = r0.e(r0.w(createSocket));
                this.f100998k = r0.d(r0.q(createSocket));
            } catch (NullPointerException e12) {
                if (g0.g(e12.getMessage(), f100987u)) {
                    throw new IOException(e12);
                }
            }
        } catch (ConnectException e13) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f100991d.g());
            connectException.initCause(e13);
            throw connectException;
        }
    }

    public final void n(z50.b bVar) throws IOException {
        SSLSocket sSLSocket;
        okhttp3.a d11 = this.f100991d.d();
        SSLSocketFactory v11 = d11.v();
        SSLSocket sSLSocket2 = null;
        try {
            g0.m(v11);
            Socket createSocket = v11.createSocket(this.f100992e, d11.w().F(), d11.w().N(), true);
            g0.n(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            okhttp3.e a11 = bVar.a(sSLSocket);
            if (a11.k()) {
                j.f49490a.g().f(sSLSocket, d11.w().F(), d11.q());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            g.a aVar = okhttp3.g.f77273e;
            g0.o(sslSocketSession, "sslSocketSession");
            okhttp3.g b11 = aVar.b(sslSocketSession);
            HostnameVerifier p11 = d11.p();
            g0.m(p11);
            if (p11.verify(d11.w().F(), sslSocketSession)) {
                t50.d l11 = d11.l();
                g0.m(l11);
                this.f100994g = new okhttp3.g(b11.o(), b11.g(), b11.k(), new c(l11, b11, d11));
                l11.c(d11.w().F(), new d());
                String j11 = a11.k() ? j.f49490a.g().j(sSLSocket) : null;
                this.f100993f = sSLSocket;
                this.f100997j = r0.e(r0.w(sSLSocket));
                this.f100998k = r0.d(r0.q(sSLSocket));
                this.f100995h = j11 != null ? Protocol.Companion.a(j11) : Protocol.HTTP_1_1;
                j.f49490a.g().c(sSLSocket);
                return;
            }
            List<Certificate> m11 = b11.m();
            if (m11.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + d11.w().F() + " not verified (no certificates)");
            }
            Certificate certificate = m11.get(0);
            g0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(y.x("\n              |Hostname " + d11.w().F() + " not verified:\n              |    certificate: " + t50.d.f89578c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + i60.d.f60210a.a(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                j.f49490a.g().c(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                u50.f.q(sSLSocket2);
            }
            throw th;
        }
    }

    public final void o(int i11, int i12, int i13, t50.b bVar, t50.m mVar) throws IOException {
        okhttp3.l q11 = q();
        okhttp3.i q12 = q11.q();
        for (int i14 = 0; i14 < 21; i14++) {
            m(i11, i12, bVar, mVar);
            q11 = p(i12, i13, q11, q12);
            if (q11 == null) {
                return;
            }
            Socket socket = this.f100992e;
            if (socket != null) {
                u50.f.q(socket);
            }
            this.f100992e = null;
            this.f100998k = null;
            this.f100997j = null;
            mVar.h(bVar, this.f100991d.g(), this.f100991d.e(), null);
        }
    }

    public final okhttp3.l p(int i11, int i12, okhttp3.l lVar, okhttp3.i iVar) throws IOException {
        String str = "CONNECT " + u50.f.f0(iVar, true) + " HTTP/1.1";
        while (true) {
            m mVar = this.f100997j;
            g0.m(mVar);
            l60.l lVar2 = this.f100998k;
            g0.m(lVar2);
            b60.b bVar = new b60.b(null, this, mVar, lVar2);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mVar.D().k(i11, timeUnit);
            lVar2.D().k(i12, timeUnit);
            bVar.B(lVar.k(), str);
            bVar.d();
            n.a g11 = bVar.g(false);
            g0.m(g11);
            n c11 = g11.E(lVar).c();
            bVar.A(c11);
            int Z = c11.Z();
            if (Z == 200) {
                if (mVar.getBuffer().J() && lVar2.getBuffer().J()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (Z != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c11.Z());
            }
            okhttp3.l a11 = this.f100991d.d().s().a(this.f100991d, c11);
            if (a11 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (f0.c2("close", n.h0(c11, "Connection", null, 2, null), true)) {
                return a11;
            }
            lVar = a11;
        }
    }

    public final okhttp3.l q() throws IOException {
        okhttp3.l b11 = new l.a().D(this.f100991d.d().w()).p("CONNECT", null).n("Host", u50.f.f0(this.f100991d.d().w(), true)).n("Proxy-Connection", "Keep-Alive").n("User-Agent", u50.f.f91855j).b();
        okhttp3.l a11 = this.f100991d.d().s().a(this.f100991d, new n.a().E(b11).B(Protocol.HTTP_1_1).g(407).y("Preemptive Authenticate").b(u50.f.f91848c).F(-1L).C(-1L).v("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a11 == null ? b11 : a11;
    }

    public final void r(z50.b bVar, int i11, t50.b bVar2, t50.m mVar) throws IOException {
        if (this.f100991d.d().v() != null) {
            mVar.C(bVar2);
            n(bVar);
            mVar.B(bVar2, this.f100994g);
            if (this.f100995h == Protocol.HTTP_2) {
                J(i11);
                return;
            }
            return;
        }
        List<Protocol> q11 = this.f100991d.d().q();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!q11.contains(protocol)) {
            this.f100993f = this.f100992e;
            this.f100995h = Protocol.HTTP_1_1;
        } else {
            this.f100993f = this.f100992e;
            this.f100995h = protocol;
            J(i11);
        }
    }

    @k
    public final List<Reference<z50.e>> s() {
        return this.f101005r;
    }

    @k
    public final g t() {
        return this.f100990c;
    }

    @k
    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f100991d.d().w().F());
        sb2.append(':');
        sb2.append(this.f100991d.d().w().N());
        sb2.append(", proxy=");
        sb2.append(this.f100991d.e());
        sb2.append(" hostAddress=");
        sb2.append(this.f100991d.g());
        sb2.append(" cipherSuite=");
        okhttp3.g gVar = this.f100994g;
        if (gVar == null || (obj = gVar.g()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f100995h);
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }

    public final long u() {
        return this.f101006s;
    }

    public final boolean v() {
        return this.f100999l;
    }

    public final int w() {
        return this.f101001n;
    }

    public final synchronized void x() {
        this.f101002o++;
    }

    public final boolean y(@k okhttp3.a address, @m80.l List<r> list) {
        g0.p(address, "address");
        if (u50.f.f91853h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f101005r.size() >= this.f101004q || this.f100999l || !this.f100991d.d().o(address)) {
            return false;
        }
        if (g0.g(address.w().F(), b().d().w().F())) {
            return true;
        }
        if (this.f100996i == null || list == null || !F(list) || address.p() != i60.d.f60210a || !K(address.w())) {
            return false;
        }
        try {
            t50.d l11 = address.l();
            g0.m(l11);
            String F = address.w().F();
            okhttp3.g c11 = c();
            g0.m(c11);
            l11.a(F, c11.m());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean z(boolean z11) {
        long j11;
        if (u50.f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f100992e;
        g0.m(socket);
        Socket socket2 = this.f100993f;
        g0.m(socket2);
        m mVar = this.f100997j;
        g0.m(mVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        okhttp3.internal.http2.b bVar = this.f100996i;
        if (bVar != null) {
            return bVar.E0(nanoTime);
        }
        synchronized (this) {
            j11 = nanoTime - this.f101006s;
        }
        if (j11 < f100989w || !z11) {
            return true;
        }
        return u50.f.N(socket2, mVar);
    }
}
