package d70;

import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestExpectContinue;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.NoopUserTokenHandler;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.apache.http.impl.client.TargetAuthenticationStrategy;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.DefaultRoutePlanner;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.SystemDefaultDnsResolver;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.impl.cookie.DefaultCookieSpecProvider;
import org.apache.http.impl.cookie.IgnoreSpecProvider;
import org.apache.http.impl.cookie.NetscapeDraftSpecProvider;
import org.apache.http.impl.cookie.RFC6265CookieSpecProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l {
    public v60.a A;
    public RequestConfig B;
    public ThreadFactory C;
    public m70.i D;
    public PublicSuffixMatcher E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J = 0;
    public int K = 0;
    public long L = -1;
    public TimeUnit M = TimeUnit.MILLISECONDS;

    /* renamed from: a, reason: collision with root package name */
    public q70.f f47393a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47394b;

    /* renamed from: c, reason: collision with root package name */
    public SchemePortResolver f47395c;

    /* renamed from: d, reason: collision with root package name */
    public q70.i f47396d;

    /* renamed from: e, reason: collision with root package name */
    public HostnameVerifier f47397e;

    /* renamed from: f, reason: collision with root package name */
    public SSLContext f47398f;

    /* renamed from: g, reason: collision with root package name */
    public org.apache.http.a f47399g;

    /* renamed from: h, reason: collision with root package name */
    public ConnectionKeepAliveStrategy f47400h;

    /* renamed from: i, reason: collision with root package name */
    public AuthenticationStrategy f47401i;

    /* renamed from: j, reason: collision with root package name */
    public AuthenticationStrategy f47402j;

    /* renamed from: k, reason: collision with root package name */
    public UserTokenHandler f47403k;

    /* renamed from: l, reason: collision with root package name */
    public c80.j f47404l;

    /* renamed from: m, reason: collision with root package name */
    public LinkedList<org.apache.http.q> f47405m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedList<org.apache.http.q> f47406n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedList<org.apache.http.s> f47407o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedList<org.apache.http.s> f47408p;

    /* renamed from: q, reason: collision with root package name */
    public HttpRoutePlanner f47409q;

    /* renamed from: r, reason: collision with root package name */
    public RedirectStrategy f47410r;

    /* renamed from: s, reason: collision with root package name */
    public v60.b<AuthSchemeProvider> f47411s;

    /* renamed from: t, reason: collision with root package name */
    public v60.b<CookieSpecProvider> f47412t;

    /* renamed from: u, reason: collision with root package name */
    public CookieStore f47413u;

    /* renamed from: v, reason: collision with root package name */
    public CredentialsProvider f47414v;

    /* renamed from: w, reason: collision with root package name */
    public String f47415w;

    /* renamed from: x, reason: collision with root package name */
    public HttpHost f47416x;

    /* renamed from: y, reason: collision with root package name */
    public Collection<? extends org.apache.http.e> f47417y;

    /* renamed from: z, reason: collision with root package name */
    public h70.i f47418z;

    public static String[] O(String str) {
        if (e80.i.b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public static l f() {
        return new l();
    }

    public final l A(int i11) {
        this.J = i11;
        return this;
    }

    public final l B(HttpHost httpHost) {
        this.f47416x = httpHost;
        return this;
    }

    public final l C(AuthenticationStrategy authenticationStrategy) {
        this.f47402j = authenticationStrategy;
        return this;
    }

    public final l D(PublicSuffixMatcher publicSuffixMatcher) {
        this.E = publicSuffixMatcher;
        return this;
    }

    public final l E(RedirectStrategy redirectStrategy) {
        this.f47410r = redirectStrategy;
        return this;
    }

    public final l F(HttpRoutePlanner httpRoutePlanner) {
        this.f47409q = httpRoutePlanner;
        return this;
    }

    public final l G(SSLContext sSLContext) {
        this.f47398f = sSLContext;
        return this;
    }

    public final l H(HostnameVerifier hostnameVerifier) {
        this.f47397e = hostnameVerifier;
        return this;
    }

    public final l I(q70.i iVar) {
        this.f47396d = iVar;
        return this;
    }

    public final l J(SchemePortResolver schemePortResolver) {
        this.f47395c = schemePortResolver;
        return this;
    }

    public final l K(AuthenticationStrategy authenticationStrategy) {
        this.f47401i = authenticationStrategy;
        return this;
    }

    public final l L(ThreadFactory threadFactory) {
        this.C = threadFactory;
        return this;
    }

    public final l M(String str) {
        this.f47415w = str;
        return this;
    }

    public final l N(UserTokenHandler userTokenHandler) {
        this.f47403k = userTokenHandler;
        return this;
    }

    public final l P() {
        this.F = true;
        return this;
    }

    public final l a(org.apache.http.q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f47405m == null) {
            this.f47405m = new LinkedList<>();
        }
        this.f47405m.addFirst(qVar);
        return this;
    }

    public final l b(org.apache.http.s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f47407o == null) {
            this.f47407o = new LinkedList<>();
        }
        this.f47407o.addFirst(sVar);
        return this;
    }

    public final l c(org.apache.http.q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f47406n == null) {
            this.f47406n = new LinkedList<>();
        }
        this.f47406n.addLast(qVar);
        return this;
    }

    public final l d(org.apache.http.s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f47408p == null) {
            this.f47408p = new LinkedList<>();
        }
        this.f47408p.addLast(sVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [org.apache.http.client.protocol.ResponseProcessCookies, org.apache.http.s] */
    /* JADX WARN: Type inference failed for: r3v33, types: [org.apache.http.client.protocol.RequestAddCookies, org.apache.http.q] */
    public c e() {
        q70.f fVar;
        ThreadFactory threadFactory;
        m70.i iVar;
        PublicSuffixMatcher publicSuffixMatcher = this.E;
        if (publicSuffixMatcher == null) {
            publicSuffixMatcher = PublicSuffixMatcherLoader.getDefault();
        }
        q70.f fVar2 = this.f47393a;
        if (fVar2 == null) {
            q70.i iVar2 = this.f47396d;
            if (iVar2 == null) {
                SSLContext sSLContext = this.f47398f;
                if (sSLContext == null) {
                    sSLContext = this.F ? d80.d.b() : d80.d.a();
                }
                String[] O = this.F ? O(System.getProperty("https.protocols")) : null;
                String[] O2 = this.F ? O(System.getProperty("https.cipherSuites")) : null;
                DefaultHostnameVerifier defaultHostnameVerifier = this.f47397e;
                if (defaultHostnameVerifier == null) {
                    defaultHostnameVerifier = new DefaultHostnameVerifier(publicSuffixMatcher);
                }
                iVar2 = new s70.a(sSLContext, O, O2, (HostnameVerifier) defaultHostnameVerifier);
            }
            h70.i iVar3 = this.f47418z;
            if (iVar3 == null) {
                iVar3 = h70.i.f58765n;
            }
            f70.p pVar = new f70.p(n.a(iVar3, this.C), f70.m.f51184h, v60.e.b().c("http", q70.h.f81832a).c("https", iVar2).a(), DefaultSchemePortResolver.INSTANCE, SystemDefaultDnsResolver.INSTANCE, this.L, this.M);
            v60.a aVar = this.A;
            if (aVar != null) {
                pVar.E(aVar);
            }
            if (!this.F) {
                int i11 = this.J;
                if (i11 > 0) {
                    pVar.o(i11);
                }
                int i12 = this.K;
                if (i12 > 0) {
                    pVar.f(i12);
                }
            } else if (n6.m.f74525c.equalsIgnoreCase(System.getProperty("http.keepAlive", n6.m.f74525c))) {
                int parseInt = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
                pVar.f(parseInt);
                pVar.o(parseInt * 2);
            }
            fVar = pVar;
        } else {
            fVar = fVar2;
        }
        org.apache.http.a aVar2 = this.f47399g;
        if (aVar2 == null) {
            aVar2 = this.F ? n6.m.f74525c.equalsIgnoreCase(System.getProperty("http.keepAlive", n6.m.f74525c)) ? x60.i.f97640a : x60.p.f97659a : x60.i.f97640a;
        }
        org.apache.http.a aVar3 = aVar2;
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy = this.f47400h;
        if (connectionKeepAliveStrategy == null) {
            connectionKeepAliveStrategy = DefaultConnectionKeepAliveStrategy.INSTANCE;
        }
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy2 = connectionKeepAliveStrategy;
        TargetAuthenticationStrategy targetAuthenticationStrategy = this.f47401i;
        if (targetAuthenticationStrategy == null) {
            targetAuthenticationStrategy = TargetAuthenticationStrategy.INSTANCE;
        }
        TargetAuthenticationStrategy targetAuthenticationStrategy2 = targetAuthenticationStrategy;
        ProxyAuthenticationStrategy proxyAuthenticationStrategy = this.f47402j;
        if (proxyAuthenticationStrategy == null) {
            proxyAuthenticationStrategy = ProxyAuthenticationStrategy.INSTANCE;
        }
        ProxyAuthenticationStrategy proxyAuthenticationStrategy2 = proxyAuthenticationStrategy;
        NoopUserTokenHandler noopUserTokenHandler = this.f47403k;
        if (noopUserTokenHandler == null) {
            noopUserTokenHandler = !this.I ? g.f47383a : NoopUserTokenHandler.INSTANCE;
        }
        NoopUserTokenHandler noopUserTokenHandler2 = noopUserTokenHandler;
        DefaultSchemePortResolver defaultSchemePortResolver = this.f47395c;
        if (defaultSchemePortResolver == null) {
            defaultSchemePortResolver = DefaultSchemePortResolver.INSTANCE;
        }
        c80.j jVar = this.f47404l;
        if (jVar == null) {
            String str = this.f47415w;
            if (str == null) {
                if (this.F) {
                    str = System.getProperty("http.agent");
                }
                if (str == null) {
                    str = e80.j.g("Apache-HttpAsyncClient", "org.apache.http.nio.client", getClass());
                }
            }
            c80.k n11 = c80.k.n();
            LinkedList<org.apache.http.q> linkedList = this.f47405m;
            if (linkedList != null) {
                Iterator<org.apache.http.q> it = linkedList.iterator();
                while (it.hasNext()) {
                    n11.i(it.next());
                }
            }
            LinkedList<org.apache.http.s> linkedList2 = this.f47407o;
            if (linkedList2 != null) {
                Iterator<org.apache.http.s> it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    n11.j(it2.next());
                }
            }
            n11.c(new RequestDefaultHeaders(this.f47417y), new c80.v(), new c80.y(), new RequestClientConnControl(), new c80.z(str), new RequestExpectContinue());
            if (!this.G) {
                n11.a(new RequestAddCookies());
            }
            if (!this.H) {
                n11.a(new RequestAuthCache());
            }
            if (!this.G) {
                n11.b(new ResponseProcessCookies());
            }
            LinkedList<org.apache.http.q> linkedList3 = this.f47406n;
            if (linkedList3 != null) {
                Iterator<org.apache.http.q> it3 = linkedList3.iterator();
                while (it3.hasNext()) {
                    n11.k(it3.next());
                }
            }
            LinkedList<org.apache.http.s> linkedList4 = this.f47408p;
            if (linkedList4 != null) {
                Iterator<org.apache.http.s> it4 = linkedList4.iterator();
                while (it4.hasNext()) {
                    n11.l(it4.next());
                }
            }
            jVar = n11.m();
        }
        c80.j jVar2 = jVar;
        DefaultProxyRoutePlanner defaultProxyRoutePlanner = this.f47409q;
        if (defaultProxyRoutePlanner == null) {
            defaultProxyRoutePlanner = this.f47416x != null ? new DefaultProxyRoutePlanner(this.f47416x, defaultSchemePortResolver) : this.F ? new SystemDefaultRoutePlanner(defaultSchemePortResolver, ProxySelector.getDefault()) : new DefaultRoutePlanner(defaultSchemePortResolver);
        }
        DefaultProxyRoutePlanner defaultProxyRoutePlanner2 = defaultProxyRoutePlanner;
        v60.b bVar = this.f47411s;
        if (bVar == null) {
            bVar = v60.e.b().c(jx.a.f64686b, new BasicSchemeFactory()).c(jx.a.f64687c, new DigestSchemeFactory()).c("NTLM", new NTLMSchemeFactory()).c(jx.a.f64688d, new SPNegoSchemeFactory()).c("Kerberos", new KerberosSchemeFactory()).a();
        }
        v60.b bVar2 = this.f47412t;
        if (bVar2 == null) {
            DefaultCookieSpecProvider defaultCookieSpecProvider = new DefaultCookieSpecProvider(publicSuffixMatcher);
            bVar2 = v60.e.b().c("default", defaultCookieSpecProvider).c("best-match", defaultCookieSpecProvider).c("compatibility", defaultCookieSpecProvider).c("standard", new RFC6265CookieSpecProvider(RFC6265CookieSpecProvider.CompatibilityLevel.RELAXED, publicSuffixMatcher)).c("standard-strict", new RFC6265CookieSpecProvider(RFC6265CookieSpecProvider.CompatibilityLevel.STRICT, publicSuffixMatcher)).c("netscape", new NetscapeDraftSpecProvider()).c("ignoreCookies", new IgnoreSpecProvider()).a();
        }
        CookieStore cookieStore = this.f47413u;
        if (cookieStore == null) {
            cookieStore = new BasicCookieStore();
        }
        SystemDefaultCredentialsProvider systemDefaultCredentialsProvider = this.f47414v;
        if (systemDefaultCredentialsProvider == null) {
            systemDefaultCredentialsProvider = this.F ? new SystemDefaultCredentialsProvider() : new BasicCredentialsProvider();
        }
        DefaultRedirectStrategy defaultRedirectStrategy = this.f47410r;
        if (defaultRedirectStrategy == null) {
            defaultRedirectStrategy = DefaultRedirectStrategy.INSTANCE;
        }
        DefaultRedirectStrategy defaultRedirectStrategy2 = defaultRedirectStrategy;
        RequestConfig requestConfig = this.B;
        if (requestConfig == null) {
            requestConfig = RequestConfig.DEFAULT;
        }
        RequestConfig requestConfig2 = requestConfig;
        u uVar = new u(jVar2, defaultProxyRoutePlanner2, defaultRedirectStrategy2, targetAuthenticationStrategy2, proxyAuthenticationStrategy2, noopUserTokenHandler2);
        if (this.f47394b) {
            threadFactory = null;
            iVar = null;
        } else {
            ThreadFactory threadFactory2 = this.C;
            if (threadFactory2 == null) {
                threadFactory2 = Executors.defaultThreadFactory();
            }
            ThreadFactory threadFactory3 = threadFactory2;
            m70.i iVar4 = this.D;
            if (iVar4 == null) {
                iVar4 = new w70.u();
            }
            iVar = iVar4;
            threadFactory = threadFactory3;
        }
        return new p(fVar, aVar3, connectionKeepAliveStrategy2, threadFactory, iVar, uVar, bVar2, bVar, cookieStore, systemDefaultCredentialsProvider, requestConfig2);
    }

    public final l g() {
        this.H = true;
        return this;
    }

    public final l h() {
        this.I = true;
        return this;
    }

    public final l i() {
        this.G = true;
        return this;
    }

    public final l j(q70.f fVar) {
        this.f47393a = fVar;
        return this;
    }

    public final l k(boolean z11) {
        this.f47394b = z11;
        return this;
    }

    public final l l(org.apache.http.a aVar) {
        this.f47399g = aVar;
        return this;
    }

    public final l m(long j11, TimeUnit timeUnit) {
        this.L = j11;
        this.M = timeUnit;
        return this;
    }

    public final l n(v60.b<AuthSchemeProvider> bVar) {
        this.f47411s = bVar;
        return this;
    }

    public final l o(v60.a aVar) {
        this.A = aVar;
        return this;
    }

    public final l p(v60.b<CookieSpecProvider> bVar) {
        this.f47412t = bVar;
        return this;
    }

    public final l q(CookieStore cookieStore) {
        this.f47413u = cookieStore;
        return this;
    }

    public final l r(CredentialsProvider credentialsProvider) {
        this.f47414v = credentialsProvider;
        return this;
    }

    public final l s(Collection<? extends org.apache.http.e> collection) {
        this.f47417y = collection;
        return this;
    }

    public final l t(h70.i iVar) {
        this.f47418z = iVar;
        return this;
    }

    public final l u(RequestConfig requestConfig) {
        this.B = requestConfig;
        return this;
    }

    public final l v(m70.i iVar) {
        this.D = iVar;
        return this;
    }

    @Deprecated
    public final l w(X509HostnameVerifier x509HostnameVerifier) {
        this.f47397e = x509HostnameVerifier;
        return this;
    }

    public final l x(c80.j jVar) {
        this.f47404l = jVar;
        return this;
    }

    public final l y(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f47400h = connectionKeepAliveStrategy;
        return this;
    }

    public final l z(int i11) {
        this.K = i11;
        return this;
    }
}
