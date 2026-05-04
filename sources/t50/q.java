package t50;

import a00.m0;
import a00.r0;
import e60.j;
import i60.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import okhttp3.Protocol;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import t50.b;
import t50.m;
import t50.n;
import t50.s;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
/* loaded from: classes8.dex */
public class q implements Cloneable, b.a, s.a {

    @m80.k
    public static final b E = new b(null);

    @m80.k
    public static final List<Protocol> F = u50.f.C(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @m80.k
    public static final List<okhttp3.e> G = u50.f.C(okhttp3.e.f77255i, okhttp3.e.f77257k);
    public final int A;
    public final int B;
    public final long C;

    @m80.k
    public final z50.h D;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k f89650a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g f89651b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<n> f89652c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<n> f89653d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final m.c f89654e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f89655f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final t50.a f89656g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89657h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89658i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final i f89659j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final okhttp3.b f89660k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final l f89661l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final Proxy f89662m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final ProxySelector f89663n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final t50.a f89664o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final SocketFactory f89665p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    public final SSLSocketFactory f89666q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    public final X509TrustManager f89667r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final List<okhttp3.e> f89668s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final List<Protocol> f89669t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final HostnameVerifier f89670u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final d f89671v;

    /* renamed from: w, reason: collision with root package name */
    @m80.l
    public final i60.c f89672w;

    /* renamed from: x, reason: collision with root package name */
    public final int f89673x;

    /* renamed from: y, reason: collision with root package name */
    public final int f89674y;

    /* renamed from: z, reason: collision with root package name */
    public final int f89675z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final List<okhttp3.e> a() {
            return q.G;
        }

        @m80.k
        public final List<Protocol> b() {
            return q.F;
        }

        public b() {
        }
    }

    public q(@m80.k a builder) {
        ProxySelector R;
        g0.p(builder, "builder");
        this.f89650a = builder.E();
        this.f89651b = builder.B();
        this.f89652c = u50.f.h0(builder.K());
        this.f89653d = u50.f.h0(builder.M());
        this.f89654e = builder.G();
        this.f89655f = builder.T();
        this.f89656g = builder.v();
        this.f89657h = builder.H();
        this.f89658i = builder.I();
        this.f89659j = builder.D();
        this.f89660k = builder.w();
        this.f89661l = builder.F();
        this.f89662m = builder.P();
        if (builder.P() != null) {
            R = g60.a.f53092a;
        } else {
            R = builder.R();
            R = R == null ? ProxySelector.getDefault() : R;
            if (R == null) {
                R = g60.a.f53092a;
            }
        }
        this.f89663n = R;
        this.f89664o = builder.Q();
        this.f89665p = builder.V();
        List<okhttp3.e> C = builder.C();
        this.f89668s = C;
        this.f89669t = builder.O();
        this.f89670u = builder.J();
        this.f89673x = builder.x();
        this.f89674y = builder.A();
        this.f89675z = builder.S();
        this.A = builder.X();
        this.B = builder.N();
        this.C = builder.L();
        z50.h U = builder.U();
        this.D = U == null ? new z50.h() : U;
        List<okhttp3.e> list = C;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((okhttp3.e) it.next()).i()) {
                    if (builder.W() != null) {
                        this.f89666q = builder.W();
                        i60.c y11 = builder.y();
                        g0.m(y11);
                        this.f89672w = y11;
                        X509TrustManager Y = builder.Y();
                        g0.m(Y);
                        this.f89667r = Y;
                        d z11 = builder.z();
                        g0.m(y11);
                        this.f89671v = z11.j(y11);
                    } else {
                        j.a aVar = e60.j.f49490a;
                        X509TrustManager r11 = aVar.g().r();
                        this.f89667r = r11;
                        e60.j g11 = aVar.g();
                        g0.m(r11);
                        this.f89666q = g11.q(r11);
                        c.a aVar2 = i60.c.f60209a;
                        g0.m(r11);
                        i60.c a11 = aVar2.a(r11);
                        this.f89672w = a11;
                        d z12 = builder.z();
                        g0.m(a11);
                        this.f89671v = z12.j(a11);
                    }
                    v0();
                }
            }
        }
        this.f89666q = null;
        this.f89672w = null;
        this.f89667r = null;
        this.f89671v = d.f89579d;
        v0();
    }

    @w00.j(name = "-deprecated_retryOnConnectionFailure")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "retryOnConnectionFailure", imports = {}))
    public final boolean A() {
        return this.f89655f;
    }

    @w00.j(name = "-deprecated_socketFactory")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "socketFactory", imports = {}))
    @m80.k
    public final SocketFactory B() {
        return this.f89665p;
    }

    @w00.j(name = "-deprecated_sslSocketFactory")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "sslSocketFactory", imports = {}))
    @m80.k
    public final SSLSocketFactory E() {
        return u0();
    }

    @w00.j(name = "-deprecated_writeTimeoutMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "writeTimeoutMillis", imports = {}))
    public final int F() {
        return this.A;
    }

    @w00.j(name = "authenticator")
    @m80.k
    public final t50.a M() {
        return this.f89656g;
    }

    @m80.l
    @w00.j(name = "cache")
    public final okhttp3.b N() {
        return this.f89660k;
    }

    @w00.j(name = "callTimeoutMillis")
    public final int O() {
        return this.f89673x;
    }

    @m80.l
    @w00.j(name = "certificateChainCleaner")
    public final i60.c P() {
        return this.f89672w;
    }

    @w00.j(name = "certificatePinner")
    @m80.k
    public final d Q() {
        return this.f89671v;
    }

    @w00.j(name = "connectTimeoutMillis")
    public final int R() {
        return this.f89674y;
    }

    @w00.j(name = "connectionPool")
    @m80.k
    public final g T() {
        return this.f89651b;
    }

    @w00.j(name = "connectionSpecs")
    @m80.k
    public final List<okhttp3.e> W() {
        return this.f89668s;
    }

    @w00.j(name = "cookieJar")
    @m80.k
    public final i X() {
        return this.f89659j;
    }

    @w00.j(name = "dispatcher")
    @m80.k
    public final k Y() {
        return this.f89650a;
    }

    @w00.j(name = "dns")
    @m80.k
    public final l Z() {
        return this.f89661l;
    }

    @Override // t50.s.a
    @m80.k
    public s a(@m80.k okhttp3.l request, @m80.k t listener) {
        g0.p(request, "request");
        g0.p(listener, "listener");
        j60.e eVar = new j60.e(y50.d.f99391i, request, listener, new Random(), this.B, null, this.C);
        eVar.q(this);
        return eVar;
    }

    @w00.j(name = "eventListenerFactory")
    @m80.k
    public final m.c a0() {
        return this.f89654e;
    }

    @Override // t50.b.a
    @m80.k
    public t50.b b(@m80.k okhttp3.l request) {
        g0.p(request, "request");
        return new z50.e(this, request, false);
    }

    @w00.j(name = "followRedirects")
    public final boolean b0() {
        return this.f89657h;
    }

    @w00.j(name = "-deprecated_authenticator")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "authenticator", imports = {}))
    @m80.k
    public final t50.a c() {
        return this.f89656g;
    }

    @w00.j(name = "followSslRedirects")
    public final boolean c0() {
        return this.f89658i;
    }

    @m80.k
    public Object clone() {
        return super.clone();
    }

    @m80.l
    @w00.j(name = "-deprecated_cache")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cache", imports = {}))
    public final okhttp3.b d() {
        return this.f89660k;
    }

    @w00.j(name = "-deprecated_callTimeoutMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "callTimeoutMillis", imports = {}))
    public final int e() {
        return this.f89673x;
    }

    @m80.k
    public final z50.h e0() {
        return this.D;
    }

    @w00.j(name = "-deprecated_certificatePinner")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "certificatePinner", imports = {}))
    @m80.k
    public final d f() {
        return this.f89671v;
    }

    @w00.j(name = "hostnameVerifier")
    @m80.k
    public final HostnameVerifier f0() {
        return this.f89670u;
    }

    @w00.j(name = "-deprecated_connectTimeoutMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "connectTimeoutMillis", imports = {}))
    public final int g() {
        return this.f89674y;
    }

    @w00.j(name = "interceptors")
    @m80.k
    public final List<n> g0() {
        return this.f89652c;
    }

    @w00.j(name = "-deprecated_connectionPool")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "connectionPool", imports = {}))
    @m80.k
    public final g h() {
        return this.f89651b;
    }

    @w00.j(name = "minWebSocketMessageToCompress")
    public final long h0() {
        return this.C;
    }

    @w00.j(name = "-deprecated_connectionSpecs")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "connectionSpecs", imports = {}))
    @m80.k
    public final List<okhttp3.e> i() {
        return this.f89668s;
    }

    @w00.j(name = "-deprecated_cookieJar")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cookieJar", imports = {}))
    @m80.k
    public final i j() {
        return this.f89659j;
    }

    @w00.j(name = "networkInterceptors")
    @m80.k
    public final List<n> j0() {
        return this.f89653d;
    }

    @w00.j(name = "-deprecated_dispatcher")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "dispatcher", imports = {}))
    @m80.k
    public final k l() {
        return this.f89650a;
    }

    @m80.k
    public a l0() {
        return new a(this);
    }

    @w00.j(name = "-deprecated_dns")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "dns", imports = {}))
    @m80.k
    public final l m() {
        return this.f89661l;
    }

    @w00.j(name = "pingIntervalMillis")
    public final int m0() {
        return this.B;
    }

    @w00.j(name = "-deprecated_eventListenerFactory")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "eventListenerFactory", imports = {}))
    @m80.k
    public final m.c n() {
        return this.f89654e;
    }

    @w00.j(name = "protocols")
    @m80.k
    public final List<Protocol> n0() {
        return this.f89669t;
    }

    @w00.j(name = "-deprecated_followRedirects")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "followRedirects", imports = {}))
    public final boolean o() {
        return this.f89657h;
    }

    @m80.l
    @w00.j(name = "proxy")
    public final Proxy o0() {
        return this.f89662m;
    }

    @w00.j(name = "-deprecated_followSslRedirects")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "followSslRedirects", imports = {}))
    public final boolean p() {
        return this.f89658i;
    }

    @w00.j(name = "proxyAuthenticator")
    @m80.k
    public final t50.a p0() {
        return this.f89664o;
    }

    @w00.j(name = "-deprecated_hostnameVerifier")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "hostnameVerifier", imports = {}))
    @m80.k
    public final HostnameVerifier q() {
        return this.f89670u;
    }

    @w00.j(name = "proxySelector")
    @m80.k
    public final ProxySelector q0() {
        return this.f89663n;
    }

    @w00.j(name = "readTimeoutMillis")
    public final int r0() {
        return this.f89675z;
    }

    @w00.j(name = "-deprecated_interceptors")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "interceptors", imports = {}))
    @m80.k
    public final List<n> s() {
        return this.f89652c;
    }

    @w00.j(name = "retryOnConnectionFailure")
    public final boolean s0() {
        return this.f89655f;
    }

    @w00.j(name = "-deprecated_networkInterceptors")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "networkInterceptors", imports = {}))
    @m80.k
    public final List<n> t() {
        return this.f89653d;
    }

    @w00.j(name = "socketFactory")
    @m80.k
    public final SocketFactory t0() {
        return this.f89665p;
    }

    @w00.j(name = "-deprecated_pingIntervalMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "pingIntervalMillis", imports = {}))
    public final int u() {
        return this.B;
    }

    @w00.j(name = "sslSocketFactory")
    @m80.k
    public final SSLSocketFactory u0() {
        SSLSocketFactory sSLSocketFactory = this.f89666q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @w00.j(name = "-deprecated_protocols")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "protocols", imports = {}))
    @m80.k
    public final List<Protocol> v() {
        return this.f89669t;
    }

    public final void v0() {
        List<n> list = this.f89652c;
        g0.n(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f89652c).toString());
        }
        List<n> list2 = this.f89653d;
        g0.n(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f89653d).toString());
        }
        List<okhttp3.e> list3 = this.f89668s;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((okhttp3.e) it.next()).i()) {
                    if (this.f89666q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f89672w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f89667r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f89666q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f89672w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f89667r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!g0.g(this.f89671v, d.f89579d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @m80.l
    @w00.j(name = "-deprecated_proxy")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxy", imports = {}))
    public final Proxy w() {
        return this.f89662m;
    }

    @w00.j(name = "-deprecated_proxyAuthenticator")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxyAuthenticator", imports = {}))
    @m80.k
    public final t50.a x() {
        return this.f89664o;
    }

    @w00.j(name = "writeTimeoutMillis")
    public final int x0() {
        return this.A;
    }

    @w00.j(name = "-deprecated_proxySelector")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxySelector", imports = {}))
    @m80.k
    public final ProxySelector y() {
        return this.f89663n;
    }

    @w00.j(name = "-deprecated_readTimeoutMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "readTimeoutMillis", imports = {}))
    public final int z() {
        return this.f89675z;
    }

    @m80.l
    @w00.j(name = "x509TrustManager")
    public final X509TrustManager z0() {
        return this.f89667r;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    public static final class a {
        public int A;
        public int B;
        public long C;

        @m80.l
        public z50.h D;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public k f89676a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public g f89677b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<n> f89678c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<n> f89679d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public m.c f89680e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f89681f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public t50.a f89682g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f89683h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f89684i;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public i f89685j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public okhttp3.b f89686k;

        /* renamed from: l, reason: collision with root package name */
        @m80.k
        public l f89687l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public Proxy f89688m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public ProxySelector f89689n;

        /* renamed from: o, reason: collision with root package name */
        @m80.k
        public t50.a f89690o;

        /* renamed from: p, reason: collision with root package name */
        @m80.k
        public SocketFactory f89691p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public SSLSocketFactory f89692q;

        /* renamed from: r, reason: collision with root package name */
        @m80.l
        public X509TrustManager f89693r;

        /* renamed from: s, reason: collision with root package name */
        @m80.k
        public List<okhttp3.e> f89694s;

        /* renamed from: t, reason: collision with root package name */
        @m80.k
        public List<? extends Protocol> f89695t;

        /* renamed from: u, reason: collision with root package name */
        @m80.k
        public HostnameVerifier f89696u;

        /* renamed from: v, reason: collision with root package name */
        @m80.k
        public d f89697v;

        /* renamed from: w, reason: collision with root package name */
        @m80.l
        public i60.c f89698w;

        /* renamed from: x, reason: collision with root package name */
        public int f89699x;

        /* renamed from: y, reason: collision with root package name */
        public int f89700y;

        /* renamed from: z, reason: collision with root package name */
        public int f89701z;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        /* renamed from: t50.q$a$a, reason: collision with other inner class name */
        public static final class C1182a implements n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<n.a, okhttp3.n> f89702a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1182a(x00.l<? super n.a, okhttp3.n> lVar) {
                this.f89702a = lVar;
            }

            @Override // t50.n
            @m80.k
            public final okhttp3.n intercept(@m80.k n.a chain) {
                g0.p(chain, "chain");
                return this.f89702a.invoke(chain);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<n.a, okhttp3.n> f89703a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(x00.l<? super n.a, okhttp3.n> lVar) {
                this.f89703a = lVar;
            }

            @Override // t50.n
            @m80.k
            public final okhttp3.n intercept(@m80.k n.a chain) {
                g0.p(chain, "chain");
                return this.f89703a.invoke(chain);
            }
        }

        public a() {
            this.f89676a = new k();
            this.f89677b = new g();
            this.f89678c = new ArrayList();
            this.f89679d = new ArrayList();
            this.f89680e = u50.f.g(m.f89630b);
            this.f89681f = true;
            t50.a aVar = t50.a.f89575b;
            this.f89682g = aVar;
            this.f89683h = true;
            this.f89684i = true;
            this.f89685j = i.f89616b;
            this.f89687l = l.f89627b;
            this.f89690o = aVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            g0.o(socketFactory, "getDefault()");
            this.f89691p = socketFactory;
            b bVar = q.E;
            this.f89694s = bVar.a();
            this.f89695t = bVar.b();
            this.f89696u = i60.d.f60210a;
            this.f89697v = d.f89579d;
            this.f89700y = 10000;
            this.f89701z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final int A() {
            return this.f89700y;
        }

        public final void A0(@m80.k HostnameVerifier hostnameVerifier) {
            g0.p(hostnameVerifier, "<set-?>");
            this.f89696u = hostnameVerifier;
        }

        @m80.k
        public final g B() {
            return this.f89677b;
        }

        public final void B0(long j11) {
            this.C = j11;
        }

        @m80.k
        public final List<okhttp3.e> C() {
            return this.f89694s;
        }

        public final void C0(int i11) {
            this.B = i11;
        }

        @m80.k
        public final i D() {
            return this.f89685j;
        }

        public final void D0(@m80.k List<? extends Protocol> list) {
            g0.p(list, "<set-?>");
            this.f89695t = list;
        }

        @m80.k
        public final k E() {
            return this.f89676a;
        }

        public final void E0(@m80.l Proxy proxy) {
            this.f89688m = proxy;
        }

        @m80.k
        public final l F() {
            return this.f89687l;
        }

        public final void F0(@m80.k t50.a aVar) {
            g0.p(aVar, "<set-?>");
            this.f89690o = aVar;
        }

        @m80.k
        public final m.c G() {
            return this.f89680e;
        }

        public final void G0(@m80.l ProxySelector proxySelector) {
            this.f89689n = proxySelector;
        }

        public final boolean H() {
            return this.f89683h;
        }

        public final void H0(int i11) {
            this.f89701z = i11;
        }

        public final boolean I() {
            return this.f89684i;
        }

        public final void I0(boolean z11) {
            this.f89681f = z11;
        }

        @m80.k
        public final HostnameVerifier J() {
            return this.f89696u;
        }

        public final void J0(@m80.l z50.h hVar) {
            this.D = hVar;
        }

        @m80.k
        public final List<n> K() {
            return this.f89678c;
        }

        public final void K0(@m80.k SocketFactory socketFactory) {
            g0.p(socketFactory, "<set-?>");
            this.f89691p = socketFactory;
        }

        public final long L() {
            return this.C;
        }

        public final void L0(@m80.l SSLSocketFactory sSLSocketFactory) {
            this.f89692q = sSLSocketFactory;
        }

        @m80.k
        public final List<n> M() {
            return this.f89679d;
        }

        public final void M0(int i11) {
            this.A = i11;
        }

        public final int N() {
            return this.B;
        }

        public final void N0(@m80.l X509TrustManager x509TrustManager) {
            this.f89693r = x509TrustManager;
        }

        @m80.k
        public final List<Protocol> O() {
            return this.f89695t;
        }

        @m80.k
        public final a O0(@m80.k SocketFactory socketFactory) {
            g0.p(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!g0.g(socketFactory, this.f89691p)) {
                this.D = null;
            }
            this.f89691p = socketFactory;
            return this;
        }

        @m80.l
        public final Proxy P() {
            return this.f89688m;
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @m80.k
        public final a P0(@m80.k SSLSocketFactory sslSocketFactory) {
            g0.p(sslSocketFactory, "sslSocketFactory");
            if (!g0.g(sslSocketFactory, this.f89692q)) {
                this.D = null;
            }
            this.f89692q = sslSocketFactory;
            j.a aVar = e60.j.f49490a;
            X509TrustManager s11 = aVar.g().s(sslSocketFactory);
            if (s11 != null) {
                this.f89693r = s11;
                e60.j g11 = aVar.g();
                X509TrustManager x509TrustManager = this.f89693r;
                g0.m(x509TrustManager);
                this.f89698w = g11.d(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + aVar.g() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @m80.k
        public final t50.a Q() {
            return this.f89690o;
        }

        @m80.k
        public final a Q0(@m80.k SSLSocketFactory sslSocketFactory, @m80.k X509TrustManager trustManager) {
            g0.p(sslSocketFactory, "sslSocketFactory");
            g0.p(trustManager, "trustManager");
            if (!g0.g(sslSocketFactory, this.f89692q) || !g0.g(trustManager, this.f89693r)) {
                this.D = null;
            }
            this.f89692q = sslSocketFactory;
            this.f89698w = i60.c.f60209a.a(trustManager);
            this.f89693r = trustManager;
            return this;
        }

        @m80.l
        public final ProxySelector R() {
            return this.f89689n;
        }

        @m80.k
        public final a R0(long j11, @m80.k TimeUnit unit) {
            g0.p(unit, "unit");
            this.A = u50.f.m(com.alipay.sdk.m.m.a.f10784h0, j11, unit);
            return this;
        }

        public final int S() {
            return this.f89701z;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a S0(@m80.k Duration duration) {
            long millis;
            g0.p(duration, "duration");
            millis = duration.toMillis();
            R0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        public final boolean T() {
            return this.f89681f;
        }

        @m80.l
        public final z50.h U() {
            return this.D;
        }

        @m80.k
        public final SocketFactory V() {
            return this.f89691p;
        }

        @m80.l
        public final SSLSocketFactory W() {
            return this.f89692q;
        }

        public final int X() {
            return this.A;
        }

        @m80.l
        public final X509TrustManager Y() {
            return this.f89693r;
        }

        @m80.k
        public final a Z(@m80.k HostnameVerifier hostnameVerifier) {
            g0.p(hostnameVerifier, "hostnameVerifier");
            if (!g0.g(hostnameVerifier, this.f89696u)) {
                this.D = null;
            }
            this.f89696u = hostnameVerifier;
            return this;
        }

        @w00.j(name = "-addInterceptor")
        @m80.k
        public final a a(@m80.k x00.l<? super n.a, okhttp3.n> block) {
            g0.p(block, "block");
            return c(new C1182a(block));
        }

        @m80.k
        public final List<n> a0() {
            return this.f89678c;
        }

        @w00.j(name = "-addNetworkInterceptor")
        @m80.k
        public final a b(@m80.k x00.l<? super n.a, okhttp3.n> block) {
            g0.p(block, "block");
            return d(new b(block));
        }

        @m80.k
        public final a b0(long j11) {
            if (j11 >= 0) {
                this.C = j11;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j11).toString());
        }

        @m80.k
        public final a c(@m80.k n interceptor) {
            g0.p(interceptor, "interceptor");
            this.f89678c.add(interceptor);
            return this;
        }

        @m80.k
        public final List<n> c0() {
            return this.f89679d;
        }

        @m80.k
        public final a d(@m80.k n interceptor) {
            g0.p(interceptor, "interceptor");
            this.f89679d.add(interceptor);
            return this;
        }

        @m80.k
        public final a d0(long j11, @m80.k TimeUnit unit) {
            g0.p(unit, "unit");
            this.B = u50.f.m("interval", j11, unit);
            return this;
        }

        @m80.k
        public final a e(@m80.k t50.a authenticator) {
            g0.p(authenticator, "authenticator");
            this.f89682g = authenticator;
            return this;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a e0(@m80.k Duration duration) {
            long millis;
            g0.p(duration, "duration");
            millis = duration.toMillis();
            d0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @m80.k
        public final q f() {
            return new q(this);
        }

        @m80.k
        public final a f0(@m80.k List<? extends Protocol> protocols) {
            g0.p(protocols, "protocols");
            List d62 = r0.d6(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!d62.contains(protocol) && !d62.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + d62).toString());
            }
            if (d62.contains(protocol) && d62.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + d62).toString());
            }
            if (d62.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + d62).toString());
            }
            g0.n(d62, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (d62.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            d62.remove(Protocol.SPDY_3);
            if (!g0.g(d62, this.f89695t)) {
                this.D = null;
            }
            List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(d62);
            g0.o(unmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f89695t = unmodifiableList;
            return this;
        }

        @m80.k
        public final a g(@m80.l okhttp3.b bVar) {
            this.f89686k = bVar;
            return this;
        }

        @m80.k
        public final a g0(@m80.l Proxy proxy) {
            if (!g0.g(proxy, this.f89688m)) {
                this.D = null;
            }
            this.f89688m = proxy;
            return this;
        }

        @m80.k
        public final a h(long j11, @m80.k TimeUnit unit) {
            g0.p(unit, "unit");
            this.f89699x = u50.f.m(com.alipay.sdk.m.m.a.f10784h0, j11, unit);
            return this;
        }

        @m80.k
        public final a h0(@m80.k t50.a proxyAuthenticator) {
            g0.p(proxyAuthenticator, "proxyAuthenticator");
            if (!g0.g(proxyAuthenticator, this.f89690o)) {
                this.D = null;
            }
            this.f89690o = proxyAuthenticator;
            return this;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a i(@m80.k Duration duration) {
            long millis;
            g0.p(duration, "duration");
            millis = duration.toMillis();
            h(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @m80.k
        public final a i0(@m80.k ProxySelector proxySelector) {
            g0.p(proxySelector, "proxySelector");
            if (!g0.g(proxySelector, this.f89689n)) {
                this.D = null;
            }
            this.f89689n = proxySelector;
            return this;
        }

        @m80.k
        public final a j(@m80.k d certificatePinner) {
            g0.p(certificatePinner, "certificatePinner");
            if (!g0.g(certificatePinner, this.f89697v)) {
                this.D = null;
            }
            this.f89697v = certificatePinner;
            return this;
        }

        @m80.k
        public final a j0(long j11, @m80.k TimeUnit unit) {
            g0.p(unit, "unit");
            this.f89701z = u50.f.m(com.alipay.sdk.m.m.a.f10784h0, j11, unit);
            return this;
        }

        @m80.k
        public final a k(long j11, @m80.k TimeUnit unit) {
            g0.p(unit, "unit");
            this.f89700y = u50.f.m(com.alipay.sdk.m.m.a.f10784h0, j11, unit);
            return this;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a k0(@m80.k Duration duration) {
            long millis;
            g0.p(duration, "duration");
            millis = duration.toMillis();
            j0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a l(@m80.k Duration duration) {
            long millis;
            g0.p(duration, "duration");
            millis = duration.toMillis();
            k(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @m80.k
        public final a l0(boolean z11) {
            this.f89681f = z11;
            return this;
        }

        @m80.k
        public final a m(@m80.k g connectionPool) {
            g0.p(connectionPool, "connectionPool");
            this.f89677b = connectionPool;
            return this;
        }

        public final void m0(@m80.k t50.a aVar) {
            g0.p(aVar, "<set-?>");
            this.f89682g = aVar;
        }

        @m80.k
        public final a n(@m80.k List<okhttp3.e> connectionSpecs) {
            g0.p(connectionSpecs, "connectionSpecs");
            if (!g0.g(connectionSpecs, this.f89694s)) {
                this.D = null;
            }
            this.f89694s = u50.f.h0(connectionSpecs);
            return this;
        }

        public final void n0(@m80.l okhttp3.b bVar) {
            this.f89686k = bVar;
        }

        @m80.k
        public final a o(@m80.k i cookieJar) {
            g0.p(cookieJar, "cookieJar");
            this.f89685j = cookieJar;
            return this;
        }

        public final void o0(int i11) {
            this.f89699x = i11;
        }

        @m80.k
        public final a p(@m80.k k dispatcher) {
            g0.p(dispatcher, "dispatcher");
            this.f89676a = dispatcher;
            return this;
        }

        public final void p0(@m80.l i60.c cVar) {
            this.f89698w = cVar;
        }

        @m80.k
        public final a q(@m80.k l dns) {
            g0.p(dns, "dns");
            if (!g0.g(dns, this.f89687l)) {
                this.D = null;
            }
            this.f89687l = dns;
            return this;
        }

        public final void q0(@m80.k d dVar) {
            g0.p(dVar, "<set-?>");
            this.f89697v = dVar;
        }

        @m80.k
        public final a r(@m80.k m eventListener) {
            g0.p(eventListener, "eventListener");
            this.f89680e = u50.f.g(eventListener);
            return this;
        }

        public final void r0(int i11) {
            this.f89700y = i11;
        }

        @m80.k
        public final a s(@m80.k m.c eventListenerFactory) {
            g0.p(eventListenerFactory, "eventListenerFactory");
            this.f89680e = eventListenerFactory;
            return this;
        }

        public final void s0(@m80.k g gVar) {
            g0.p(gVar, "<set-?>");
            this.f89677b = gVar;
        }

        @m80.k
        public final a t(boolean z11) {
            this.f89683h = z11;
            return this;
        }

        public final void t0(@m80.k List<okhttp3.e> list) {
            g0.p(list, "<set-?>");
            this.f89694s = list;
        }

        @m80.k
        public final a u(boolean z11) {
            this.f89684i = z11;
            return this;
        }

        public final void u0(@m80.k i iVar) {
            g0.p(iVar, "<set-?>");
            this.f89685j = iVar;
        }

        @m80.k
        public final t50.a v() {
            return this.f89682g;
        }

        public final void v0(@m80.k k kVar) {
            g0.p(kVar, "<set-?>");
            this.f89676a = kVar;
        }

        @m80.l
        public final okhttp3.b w() {
            return this.f89686k;
        }

        public final void w0(@m80.k l lVar) {
            g0.p(lVar, "<set-?>");
            this.f89687l = lVar;
        }

        public final int x() {
            return this.f89699x;
        }

        public final void x0(@m80.k m.c cVar) {
            g0.p(cVar, "<set-?>");
            this.f89680e = cVar;
        }

        @m80.l
        public final i60.c y() {
            return this.f89698w;
        }

        public final void y0(boolean z11) {
            this.f89683h = z11;
        }

        @m80.k
        public final d z() {
            return this.f89697v;
        }

        public final void z0(boolean z11) {
            this.f89684i = z11;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@m80.k q okHttpClient) {
            this();
            g0.p(okHttpClient, "okHttpClient");
            this.f89676a = okHttpClient.Y();
            this.f89677b = okHttpClient.T();
            m0.s0(this.f89678c, okHttpClient.g0());
            m0.s0(this.f89679d, okHttpClient.j0());
            this.f89680e = okHttpClient.a0();
            this.f89681f = okHttpClient.s0();
            this.f89682g = okHttpClient.M();
            this.f89683h = okHttpClient.b0();
            this.f89684i = okHttpClient.c0();
            this.f89685j = okHttpClient.X();
            this.f89686k = okHttpClient.N();
            this.f89687l = okHttpClient.Z();
            this.f89688m = okHttpClient.o0();
            this.f89689n = okHttpClient.q0();
            this.f89690o = okHttpClient.p0();
            this.f89691p = okHttpClient.t0();
            this.f89692q = okHttpClient.f89666q;
            this.f89693r = okHttpClient.z0();
            this.f89694s = okHttpClient.W();
            this.f89695t = okHttpClient.n0();
            this.f89696u = okHttpClient.f0();
            this.f89697v = okHttpClient.Q();
            this.f89698w = okHttpClient.P();
            this.f89699x = okHttpClient.O();
            this.f89700y = okHttpClient.R();
            this.f89701z = okHttpClient.r0();
            this.A = okHttpClient.x0();
            this.B = okHttpClient.m0();
            this.C = okHttpClient.h0();
            this.D = okHttpClient.e0();
        }
    }

    public q() {
        this(new a());
    }
}
