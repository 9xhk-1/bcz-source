package e60;

import a00.i0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import t50.q;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f49490a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static volatile j f49491b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49492c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49493d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f49494e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void m(a aVar, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = aVar.f();
            }
            aVar.l(jVar);
        }

        @k
        public final List<String> b(@k List<? extends Protocol> protocols) {
            g0.p(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        @k
        public final byte[] c(@k List<? extends Protocol> protocols) {
            g0.p(protocols, "protocols");
            l60.k kVar = new l60.k();
            for (String str : b(protocols)) {
                kVar.writeByte(str.length());
                kVar.n5(str);
            }
            return kVar.w2();
        }

        public final j d() {
            f60.e.f51116a.b();
            j a11 = e60.a.f49460g.a();
            if (a11 != null) {
                return a11;
            }
            j a12 = b.f49463h.a();
            g0.m(a12);
            return a12;
        }

        public final j e() {
            i a11;
            c a12;
            d c11;
            if (j() && (c11 = d.f49472g.c()) != null) {
                return c11;
            }
            if (i() && (a12 = c.f49469g.a()) != null) {
                return a12;
            }
            if (k() && (a11 = i.f49487g.a()) != null) {
                return a11;
            }
            h a13 = h.f49485f.a();
            if (a13 != null) {
                return a13;
            }
            j a14 = e.f49476k.a();
            return a14 != null ? a14 : new j();
        }

        public final j f() {
            return h() ? d() : e();
        }

        @o
        @k
        public final j g() {
            return j.f49491b;
        }

        public final boolean h() {
            return g0.g("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            return g0.g("BC", Security.getProviders()[0].getName());
        }

        public final boolean j() {
            return g0.g("Conscrypt", Security.getProviders()[0].getName());
        }

        public final boolean k() {
            return g0.g("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final void l(@k j platform) {
            g0.p(platform, "platform");
            j.f49491b = platform;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f49490a = aVar;
        f49491b = aVar.f();
        f49494e = Logger.getLogger(q.class.getName());
    }

    @o
    @k
    public static final j h() {
        return f49490a.g();
    }

    public static /* synthetic */ void n(j jVar, String str, int i11, Throwable th2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i12 & 2) != 0) {
            i11 = 4;
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        jVar.m(str, i11, th2);
    }

    public void c(@k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
    }

    @k
    public i60.c d(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        return new i60.a(e(trustManager));
    }

    @k
    public i60.e e(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        g0.o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new i60.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@k SSLSocket sslSocket, @l String str, @k List<Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
    }

    public void g(@k Socket socket, @k InetSocketAddress address, int i11) throws IOException {
        g0.p(socket, "socket");
        g0.p(address, "address");
        socket.connect(address, i11);
    }

    @k
    public final String i() {
        return "OkHttp";
    }

    @l
    public String j(@k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return null;
    }

    @l
    public Object k(@k String closer) {
        g0.p(closer, "closer");
        if (f49494e.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean l(@k String hostname) {
        g0.p(hostname, "hostname");
        return true;
    }

    public void m(@k String message, int i11, @l Throwable th2) {
        g0.p(message, "message");
        f49494e.log(i11 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void o(@k String message, @l Object obj) {
        g0.p(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(message, 5, (Throwable) obj);
    }

    @k
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        g0.o(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @k
    public SSLSocketFactory q(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        try {
            SSLContext p11 = p();
            p11.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = p11.getSocketFactory();
            g0.o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e11) {
            throw new AssertionError("No System TLS: " + e11, e11);
        }
    }

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

    @l
    public X509TrustManager s(@k SSLSocketFactory sslSocketFactory) {
        g0.p(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            g0.o(sslContextClass, "sslContextClass");
            Object U = u50.f.U(sslSocketFactory, sslContextClass, c90.k.f8409a);
            if (U == null) {
                return null;
            }
            return (X509TrustManager) u50.f.U(U, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e11) {
            if (!g0.g(e11.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e11;
            }
            return null;
        }
    }

    @k
    public String toString() {
        String simpleName = getClass().getSimpleName();
        g0.o(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
