package z50;

import a00.h0;
import a00.m0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import t50.m;
import t50.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f101021i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final okhttp3.a f101022a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f101023b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final t50.b f101024c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m f101025d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public List<? extends Proxy> f101026e;

    /* renamed from: f, reason: collision with root package name */
    public int f101027f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public List<? extends InetSocketAddress> f101028g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<r> f101029h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final String a(@k InetSocketAddress inetSocketAddress) {
            g0.p(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                g0.o(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            g0.o(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<r> f101030a;

        /* renamed from: b, reason: collision with root package name */
        public int f101031b;

        public b(@k List<r> routes) {
            g0.p(routes, "routes");
            this.f101030a = routes;
        }

        @k
        public final List<r> a() {
            return this.f101030a;
        }

        public final boolean b() {
            return this.f101031b < this.f101030a.size();
        }

        @k
        public final r c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<r> list = this.f101030a;
            int i11 = this.f101031b;
            this.f101031b = i11 + 1;
            return list.get(i11);
        }
    }

    public i(@k okhttp3.a address, @k h routeDatabase, @k t50.b call, @k m eventListener) {
        g0.p(address, "address");
        g0.p(routeDatabase, "routeDatabase");
        g0.p(call, "call");
        g0.p(eventListener, "eventListener");
        this.f101022a = address;
        this.f101023b = routeDatabase;
        this.f101024c = call;
        this.f101025d = eventListener;
        this.f101026e = h0.J();
        this.f101028g = h0.J();
        this.f101029h = new ArrayList();
        f(address.w(), address.r());
    }

    public static final List<Proxy> g(Proxy proxy, okhttp3.i iVar, i iVar2) {
        if (proxy != null) {
            return a00.g0.l(proxy);
        }
        URI Z = iVar.Z();
        if (Z.getHost() == null) {
            return u50.f.C(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = iVar2.f101022a.t().select(Z);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return u50.f.C(Proxy.NO_PROXY);
        }
        g0.o(proxiesOrNull, "proxiesOrNull");
        return u50.f.h0(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.f101029h.isEmpty();
    }

    public final boolean b() {
        return this.f101027f < this.f101026e.size();
    }

    @k
    public final b c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d11 = d();
            Iterator<? extends InetSocketAddress> it = this.f101028g.iterator();
            while (it.hasNext()) {
                r rVar = new r(this.f101022a, d11, it.next());
                if (this.f101023b.c(rVar)) {
                    this.f101029h.add(rVar);
                } else {
                    arrayList.add(rVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            m0.s0(arrayList, this.f101029h);
            this.f101029h.clear();
        }
        return new b(arrayList);
    }

    public final Proxy d() throws IOException {
        if (b()) {
            List<? extends Proxy> list = this.f101026e;
            int i11 = this.f101027f;
            this.f101027f = i11 + 1;
            Proxy proxy = list.get(i11);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f101022a.w().F() + "; exhausted proxy configurations: " + this.f101026e);
    }

    public final void e(Proxy proxy) throws IOException {
        String F;
        int N;
        List<InetAddress> a11;
        ArrayList arrayList = new ArrayList();
        this.f101028g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            F = this.f101022a.w().F();
            N = this.f101022a.w().N();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f101021i;
            g0.o(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            F = aVar.a(inetSocketAddress);
            N = inetSocketAddress.getPort();
        }
        if (1 > N || N >= 65536) {
            throw new SocketException("No route to " + F + ':' + N + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(F, N));
            return;
        }
        if (u50.f.k(F)) {
            a11 = a00.g0.l(InetAddress.getByName(F));
        } else {
            this.f101025d.n(this.f101024c, F);
            a11 = this.f101022a.n().a(F);
            if (a11.isEmpty()) {
                throw new UnknownHostException(this.f101022a.n() + " returned no addresses for " + F);
            }
            this.f101025d.m(this.f101024c, F, a11);
        }
        Iterator<InetAddress> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), N));
        }
    }

    public final void f(okhttp3.i iVar, Proxy proxy) {
        this.f101025d.p(this.f101024c, iVar);
        List<Proxy> g11 = g(proxy, iVar, this);
        this.f101026e = g11;
        this.f101027f = 0;
        this.f101025d.o(this.f101024c, iVar, g11);
    }
}
