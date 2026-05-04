package e60;

import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends j {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f49472g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f49473h;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Provider f49474f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ boolean b(a aVar, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                i12 = 0;
            }
            if ((i14 & 4) != 0) {
                i13 = 0;
            }
            return aVar.a(i11, i12, i13);
        }

        public final boolean a(int i11, int i12, int i13) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i11 ? version.major() > i11 : version.minor() != i12 ? version.minor() > i12 : version.patch() >= i13;
        }

        @l
        public final d c() {
            v vVar = null;
            if (d()) {
                return new d(vVar);
            }
            return null;
        }

        public final boolean d() {
            return d.f49473h;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f49475a = new b();

        public final boolean a(@l String str, @l SSLSession sSLSession) {
            return true;
        }

        @Override // org.conscrypt.ConscryptHostnameVerifier
        public boolean verify(@l X509Certificate[] x509CertificateArr, @l String str, @l SSLSession sSLSession) {
            return true;
        }
    }

    static {
        a aVar = new a(null);
        f49472g = aVar;
        boolean z11 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z11 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f49473h = z11;
    }

    public /* synthetic */ d(v vVar) {
        this();
    }

    @Override // e60.j
    public void f(@k SSLSocket sslSocket, @l String str, @k List<Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.f(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) j.f49490a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // e60.j
    @l
    public String j(@k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.j(sslSocket);
    }

    @Override // e60.j
    @k
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f49474f);
        g0.o(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // e60.j
    @k
    public SSLSocketFactory q(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        SSLContext p11 = p();
        p11.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = p11.getSocketFactory();
        g0.o(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // e60.j
    @k
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        g0.m(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                g0.n(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f49475a);
                return x509TrustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        g0.o(arrays, "toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @Override // e60.j
    @l
    public X509TrustManager s(@k SSLSocketFactory sslSocketFactory) {
        g0.p(sslSocketFactory, "sslSocketFactory");
        return null;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        g0.o(newProvider, "newProvider()");
        this.f49474f = newProvider;
    }
}
