package e60;

import a00.h0;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import f60.m;
import f60.n;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u50.c
@u0({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b extends j {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f49463h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f49464i;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<m> f49465f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f60.j f49466g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f49464i;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: e60.b$b, reason: collision with other inner class name */
    public static final class C0595b implements i60.e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final X509TrustManager f49467a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Method f49468b;

        public C0595b(@k X509TrustManager trustManager, @k Method findByIssuerAndSignatureMethod) {
            g0.p(trustManager, "trustManager");
            g0.p(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f49467a = trustManager;
            this.f49468b = findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ C0595b e(C0595b c0595b, X509TrustManager x509TrustManager, Method method, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                x509TrustManager = c0595b.f49467a;
            }
            if ((i11 & 2) != 0) {
                method = c0595b.f49468b;
            }
            return c0595b.d(x509TrustManager, method);
        }

        @Override // i60.e
        @l
        public X509Certificate a(@k X509Certificate cert) {
            g0.p(cert, "cert");
            try {
                Object invoke = this.f49468b.invoke(this.f49467a, cert);
                g0.n(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e11) {
                throw new AssertionError("unable to get issues and signature", e11);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final X509TrustManager b() {
            return this.f49467a;
        }

        public final Method c() {
            return this.f49468b;
        }

        @k
        public final C0595b d(@k X509TrustManager trustManager, @k Method findByIssuerAndSignatureMethod) {
            g0.p(trustManager, "trustManager");
            g0.p(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new C0595b(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0595b)) {
                return false;
            }
            C0595b c0595b = (C0595b) obj;
            return g0.g(this.f49467a, c0595b.f49467a) && g0.g(this.f49468b, c0595b.f49468b);
        }

        public int hashCode() {
            return (this.f49467a.hashCode() * 31) + this.f49468b.hashCode();
        }

        @k
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f49467a + ", findByIssuerAndSignatureMethod=" + this.f49468b + ')';
        }
    }

    static {
        boolean z11 = false;
        if (j.f49490a.h() && Build.VERSION.SDK_INT < 30) {
            z11 = true;
        }
        f49464i = z11;
    }

    public b() {
        List S = h0.S(n.a.b(n.f51139j, null, 1, null), new f60.l(f60.h.f51121f.d()), new f60.l(f60.k.f51135a.a()), new f60.l(f60.i.f51129a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : S) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f49465f = arrayList;
        this.f49466g = f60.j.f51131d.a();
    }

    @Override // e60.j
    @k
    public i60.c d(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        f60.d a11 = f60.d.f51113d.a(trustManager);
        return a11 != null ? a11 : super.d(trustManager);
    }

    @Override // e60.j
    @k
    public i60.e e(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            g0.o(method, "method");
            return new C0595b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.e(trustManager);
        }
    }

    @Override // e60.j
    public void f(@k SSLSocket sslSocket, @l String str, @k List<Protocol> protocols) {
        Object obj;
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        Iterator<T> it = this.f49465f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.c(sslSocket, str, protocols);
        }
    }

    @Override // e60.j
    public void g(@k Socket socket, @k InetSocketAddress address, int i11) throws IOException {
        g0.p(socket, "socket");
        g0.p(address, "address");
        try {
            socket.connect(address, i11);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e11;
            }
            throw new IOException("Exception in connect", e11);
        }
    }

    @Override // e60.j
    @l
    public String j(@k SSLSocket sslSocket) {
        Object obj;
        g0.p(sslSocket, "sslSocket");
        Iterator<T> it = this.f49465f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // e60.j
    @l
    public Object k(@k String closer) {
        g0.p(closer, "closer");
        return this.f49466g.a(closer);
    }

    @Override // e60.j
    public boolean l(@k String hostname) {
        g0.p(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // e60.j
    public void o(@k String message, @l Object obj) {
        g0.p(message, "message");
        if (this.f49466g.b(obj)) {
            return;
        }
        j.n(this, message, 5, null, 4, null);
    }

    @Override // e60.j
    @l
    public X509TrustManager s(@k SSLSocketFactory sslSocketFactory) {
        Object obj;
        g0.p(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f49465f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).e(sslSocketFactory)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.d(sslSocketFactory);
        }
        return null;
    }
}
