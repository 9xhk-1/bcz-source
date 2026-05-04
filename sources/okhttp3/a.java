package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import okhttp3.i;
import org.junit.jupiter.api.j2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t50.l f77106a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final SocketFactory f77107b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final SSLSocketFactory f77108c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final HostnameVerifier f77109d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final t50.d f77110e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final t50.a f77111f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final Proxy f77112g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final ProxySelector f77113h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final i f77114i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final List<Protocol> f77115j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final List<e> f77116k;

    public a(@m80.k String uriHost, int i11, @m80.k t50.l dns, @m80.k SocketFactory socketFactory, @m80.l SSLSocketFactory sSLSocketFactory, @m80.l HostnameVerifier hostnameVerifier, @m80.l t50.d dVar, @m80.k t50.a proxyAuthenticator, @m80.l Proxy proxy, @m80.k List<? extends Protocol> protocols, @m80.k List<e> connectionSpecs, @m80.k ProxySelector proxySelector) {
        g0.p(uriHost, "uriHost");
        g0.p(dns, "dns");
        g0.p(socketFactory, "socketFactory");
        g0.p(proxyAuthenticator, "proxyAuthenticator");
        g0.p(protocols, "protocols");
        g0.p(connectionSpecs, "connectionSpecs");
        g0.p(proxySelector, "proxySelector");
        this.f77106a = dns;
        this.f77107b = socketFactory;
        this.f77108c = sSLSocketFactory;
        this.f77109d = hostnameVerifier;
        this.f77110e = dVar;
        this.f77111f = proxyAuthenticator;
        this.f77112g = proxy;
        this.f77113h = proxySelector;
        this.f77114i = new i.a().M(sSLSocketFactory != null ? "https" : "http").x(uriHost).D(i11).h();
        this.f77115j = u50.f.h0(protocols);
        this.f77116k = u50.f.h0(connectionSpecs);
    }

    @m80.l
    @w00.j(name = "-deprecated_certificatePinner")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "certificatePinner", imports = {}))
    public final t50.d a() {
        return this.f77110e;
    }

    @w00.j(name = "-deprecated_connectionSpecs")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "connectionSpecs", imports = {}))
    @m80.k
    public final List<e> b() {
        return this.f77116k;
    }

    @w00.j(name = "-deprecated_dns")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "dns", imports = {}))
    @m80.k
    public final t50.l c() {
        return this.f77106a;
    }

    @m80.l
    @w00.j(name = "-deprecated_hostnameVerifier")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "hostnameVerifier", imports = {}))
    public final HostnameVerifier d() {
        return this.f77109d;
    }

    @w00.j(name = "-deprecated_protocols")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "protocols", imports = {}))
    @m80.k
    public final List<Protocol> e() {
        return this.f77115j;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f77114i, aVar.f77114i) && o(aVar);
    }

    @m80.l
    @w00.j(name = "-deprecated_proxy")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxy", imports = {}))
    public final Proxy f() {
        return this.f77112g;
    }

    @w00.j(name = "-deprecated_proxyAuthenticator")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxyAuthenticator", imports = {}))
    @m80.k
    public final t50.a g() {
        return this.f77111f;
    }

    @w00.j(name = "-deprecated_proxySelector")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxySelector", imports = {}))
    @m80.k
    public final ProxySelector h() {
        return this.f77113h;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f77114i.hashCode()) * 31) + this.f77106a.hashCode()) * 31) + this.f77111f.hashCode()) * 31) + this.f77115j.hashCode()) * 31) + this.f77116k.hashCode()) * 31) + this.f77113h.hashCode()) * 31) + Objects.hashCode(this.f77112g)) * 31) + Objects.hashCode(this.f77108c)) * 31) + Objects.hashCode(this.f77109d)) * 31) + Objects.hashCode(this.f77110e);
    }

    @w00.j(name = "-deprecated_socketFactory")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "socketFactory", imports = {}))
    @m80.k
    public final SocketFactory i() {
        return this.f77107b;
    }

    @m80.l
    @w00.j(name = "-deprecated_sslSocketFactory")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "sslSocketFactory", imports = {}))
    public final SSLSocketFactory j() {
        return this.f77108c;
    }

    @w00.j(name = "-deprecated_url")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "url", imports = {}))
    @m80.k
    public final i k() {
        return this.f77114i;
    }

    @m80.l
    @w00.j(name = "certificatePinner")
    public final t50.d l() {
        return this.f77110e;
    }

    @w00.j(name = "connectionSpecs")
    @m80.k
    public final List<e> m() {
        return this.f77116k;
    }

    @w00.j(name = "dns")
    @m80.k
    public final t50.l n() {
        return this.f77106a;
    }

    public final boolean o(@m80.k a that) {
        g0.p(that, "that");
        return g0.g(this.f77106a, that.f77106a) && g0.g(this.f77111f, that.f77111f) && g0.g(this.f77115j, that.f77115j) && g0.g(this.f77116k, that.f77116k) && g0.g(this.f77113h, that.f77113h) && g0.g(this.f77112g, that.f77112g) && g0.g(this.f77108c, that.f77108c) && g0.g(this.f77109d, that.f77109d) && g0.g(this.f77110e, that.f77110e) && this.f77114i.N() == that.f77114i.N();
    }

    @m80.l
    @w00.j(name = "hostnameVerifier")
    public final HostnameVerifier p() {
        return this.f77109d;
    }

    @w00.j(name = "protocols")
    @m80.k
    public final List<Protocol> q() {
        return this.f77115j;
    }

    @m80.l
    @w00.j(name = "proxy")
    public final Proxy r() {
        return this.f77112g;
    }

    @w00.j(name = "proxyAuthenticator")
    @m80.k
    public final t50.a s() {
        return this.f77111f;
    }

    @w00.j(name = "proxySelector")
    @m80.k
    public final ProxySelector t() {
        return this.f77113h;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f77114i.F());
        sb3.append(':');
        sb3.append(this.f77114i.N());
        sb3.append(j2.O);
        if (this.f77112g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f77112g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f77113h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append(l50.b.f69928j);
        return sb3.toString();
    }

    @w00.j(name = "socketFactory")
    @m80.k
    public final SocketFactory u() {
        return this.f77107b;
    }

    @m80.l
    @w00.j(name = "sslSocketFactory")
    public final SSLSocketFactory v() {
        return this.f77108c;
    }

    @w00.j(name = "url")
    @m80.k
    public final i w() {
        return this.f77114i;
    }
}
