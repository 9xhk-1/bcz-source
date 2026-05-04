package f60;

import f60.l;
import f60.m;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n37#2,2:69\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n53#1:69,2\n*E\n"})
/* loaded from: classes8.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f51129a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final l.a f51130b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l.a {
        @Override // f60.l.a
        public boolean a(@m80.k SSLSocket sslSocket) {
            g0.p(sslSocket, "sslSocket");
            e60.c.f49469g.b();
            return false;
        }

        @Override // f60.l.a
        @m80.k
        public m b(@m80.k SSLSocket sslSocket) {
            g0.p(sslSocket, "sslSocket");
            return new i();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final l.a a() {
            return i.f51130b;
        }

        public b() {
        }
    }

    @Override // f60.m
    public boolean a(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return false;
    }

    @Override // f60.m
    @m80.l
    public String b(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : g0.g(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // f60.m
    public void c(@m80.k SSLSocket sslSocket, @m80.l String str, @m80.k List<? extends Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) e60.j.f49490a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // f60.m
    @m80.l
    public X509TrustManager d(@m80.k SSLSocketFactory sSLSocketFactory) {
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // f60.m
    public boolean e(@m80.k SSLSocketFactory sSLSocketFactory) {
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // f60.m
    public boolean isSupported() {
        return e60.c.f49469g.b();
    }
}
