package e60;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
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
import org.openjsse.net.ssl.OpenJSSE;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOpenJSSEPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n*L\n68#1:102,2\n*E\n"})
/* loaded from: classes8.dex */
public final class i extends j {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f49487g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f49488h;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Provider f49489f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final i a() {
            v vVar = null;
            if (b()) {
                return new i(vVar);
            }
            return null;
        }

        public final boolean b() {
            return i.f49488h;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f49487g = aVar;
        boolean z11 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z11 = true;
        } catch (ClassNotFoundException unused) {
        }
        f49488h = z11;
    }

    public /* synthetic */ i(v vVar) {
        this();
    }

    @Override // e60.j
    public void f(@k SSLSocket sslSocket, @l String str, @k List<Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        super.f(sslSocket, str, protocols);
    }

    @Override // e60.j
    @l
    public String j(@k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return super.j(sslSocket);
    }

    @Override // e60.j
    @k
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(wr.f.f96679b, this.f49489f);
        g0.o(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // e60.j
    @k
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f49489f);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        g0.m(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                g0.n(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
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
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    public i() {
        this.f49489f = new OpenJSSE();
    }
}
