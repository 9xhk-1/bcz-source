package v50;

import a00.r0;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import okhttp3.i;
import okhttp3.n;
import t50.e;
import t50.j;
import t50.l;
import t50.r;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements t50.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l f93107d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v50.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1251a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93108a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f93108a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // t50.a
    @m80.l
    public okhttp3.l a(@m80.l r rVar, @k n response) throws IOException {
        Proxy proxy;
        l lVar;
        PasswordAuthentication requestPasswordAuthentication;
        okhttp3.a d11;
        g0.p(response, "response");
        List<e> V = response.V();
        okhttp3.l A0 = response.A0();
        i q11 = A0.q();
        boolean z11 = response.Z() == 407;
        if (rVar == null || (proxy = rVar.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (e eVar : V) {
            if (f0.c2(jx.a.f64686b, eVar.h(), true)) {
                if (rVar == null || (d11 = rVar.d()) == null || (lVar = d11.n()) == null) {
                    lVar = this.f93107d;
                }
                if (z11) {
                    SocketAddress address = proxy.address();
                    g0.n(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    g0.o(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, q11, lVar), inetSocketAddress.getPort(), q11.X(), eVar.g(), eVar.h(), q11.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String F = q11.F();
                    g0.o(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(F, b(proxy, q11, lVar), q11.N(), q11.X(), eVar.g(), eVar.h(), q11.a0(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z11 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    g0.o(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    g0.o(password, "auth.password");
                    return A0.n().n(str, j.b(userName, new String(password), eVar.f())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, i iVar, l lVar) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C1251a.f93108a[type.ordinal()]) == 1) {
            return (InetAddress) r0.G2(lVar.a(iVar.F()));
        }
        SocketAddress address = proxy.address();
        g0.n(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        g0.o(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    public a(@k l defaultDns) {
        g0.p(defaultDns, "defaultDns");
        this.f93107d = defaultDns;
    }

    public /* synthetic */ a(l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? l.f89627b : lVar);
    }
}
