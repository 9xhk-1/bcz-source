package la;

import a00.r0;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import ma.t;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import qb0.h;
import t50.m;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nNetworkMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkMonitor.kt\ncom/baicizhan/client/business/stats/network/NetworkMonitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final long f70834c = 30000;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f70835d = "ready_to_send";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f70838g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public static h f70839h;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f70832a = new f();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Map<t50.b, la.a> f70836e = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f70833b = "NetworkMonitor";

    /* renamed from: f, reason: collision with root package name */
    public static final nc.a f70837f = nc.b.c(f70833b);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final m f70840i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final int f70841j = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends m {
        @Override // t50.m
        public void B(t50.b call, okhttp3.g gVar) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.O(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void C(t50.b call) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.P(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void d(t50.b call) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.w(System.currentTimeMillis());
                aVar.Q(true);
                f.f70836e.remove(call);
                f.f70832a.g(aVar);
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void e(t50.b call, IOException ioe) {
            g0.p(call, "call");
            g0.p(ioe, "ioe");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar == null) {
                qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
                return;
            }
            aVar.w(System.currentTimeMillis());
            aVar.Q(false);
            String message = ioe.getMessage();
            if (message != null) {
                aVar.D(message);
            }
            f.f70836e.remove(call);
            f.f70832a.g(aVar);
        }

        @Override // t50.m
        public void f(t50.b call) {
            la.a d11;
            g0.p(call, "call");
            super.f(call);
            if (f.f70836e.containsKey(call)) {
                la.a aVar = (la.a) f.f70836e.get(call);
                qb.c.d(f.f70833b, "call reuse ????? " + (aVar != null ? aVar.toString() : null), new Object[0]);
            }
            Map map = f.f70836e;
            d11 = g.d(call);
            map.put(call, d11);
        }

        @Override // t50.m
        public void h(t50.b call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            g0.p(call, "call");
            g0.p(inetSocketAddress, "inetSocketAddress");
            g0.p(proxy, "proxy");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.y(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void j(t50.b call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            g0.p(call, "call");
            g0.p(inetSocketAddress, "inetSocketAddress");
            g0.p(proxy, "proxy");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.z(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void k(t50.b call, t50.f connection) {
            TlsVersion o11;
            String name;
            g0.p(call, "call");
            g0.p(connection, "connection");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar == null) {
                aVar = g.d(call);
            }
            aVar.H(connection.a().name());
            okhttp3.g c11 = connection.c();
            if (c11 != null && (o11 = c11.o()) != null && (name = o11.name()) != null) {
                aVar.R(name);
            }
            f.f70836e.put(call, aVar);
        }

        @Override // t50.m
        public void m(t50.b call, String domainName, List<? extends InetAddress> inetAddressList) {
            g0.p(call, "call");
            g0.p(domainName, "domainName");
            g0.p(inetAddressList, "inetAddressList");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.A(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void n(t50.b call, String domainName) {
            g0.p(call, "call");
            g0.p(domainName, "domainName");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.B(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void q(t50.b call, long j11) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.I(System.currentTimeMillis());
                aVar.J(j11);
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void t(t50.b call, okhttp3.l request) {
            g0.p(call, "call");
            g0.p(request, "request");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.I(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void u(t50.b call) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.K(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void v(t50.b call, long j11) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.L(System.currentTimeMillis());
                aVar.M(j11);
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void w(t50.b call) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.L(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }

        @Override // t50.m
        public void z(t50.b call) {
            g0.p(call, "call");
            la.a aVar = (la.a) f.f70836e.get(call);
            if (aVar != null) {
                aVar.N(System.currentTimeMillis());
                return;
            }
            qb.c.d(f.f70833b, "empty call " + call.request().q(), new Object[0]);
        }
    }

    public static final g2 i(Long l11) {
        try {
            f70832a.f();
        } catch (Throwable th2) {
            qb.c.c(f70833b, "", th2);
        }
        return g2.f100423a;
    }

    public static final void j(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @k
    public final m e() {
        return f70840i;
    }

    public final void f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        nc.a mStore = f70837f;
        g0.o(mStore, "mStore");
        synchronized (mStore) {
            try {
                Set<String> stringSet = mStore.getStringSet(f70835d, new LinkedHashSet());
                if (stringSet != null) {
                    linkedHashSet.addAll(stringSet);
                }
                mStore.q(f70835d, new LinkedHashSet());
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ma.l.f(t.B, ma.a.f72765i3, r0.a6(linkedHashSet));
    }

    public final void g(la.a aVar) {
        c e11;
        if (y9.e.f().e(y9.c.f99704l) && !k0.n3(aVar.k(), "report_event", false, 2, null)) {
            Application a11 = pb.a.a();
            g0.o(a11, "getApp(...)");
            e11 = g.e(aVar, a11);
            String json = BczJson.toJson(e11);
            nc.a mStore = f70837f;
            g0.o(mStore, "mStore");
            synchronized (mStore) {
                try {
                    Set<String> stringSet = mStore.getStringSet(f70835d, new LinkedHashSet());
                    if (stringSet == null) {
                        stringSet = new LinkedHashSet<>();
                    }
                    stringSet.add(json);
                    mStore.q(f70835d, stringSet);
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        h hVar = f70839h;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<Long> I2 = rx.c.I2(30000L, TimeUnit.MILLISECONDS);
        final x00.l lVar = new x00.l() { // from class: la.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = f.i((Long) obj);
                return i11;
            }
        };
        f70839h = I2.L1(new wb0.b() { // from class: la.e
            @Override // wb0.b
            public final void call(Object obj) {
                f.j(x00.l.this, obj);
            }
        }).p5();
    }

    public final void k() {
        qb.c.d(f70833b, "START %b", Boolean.valueOf(f70838g));
        f70838g = true;
        h();
    }
}
