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
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f51135a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final l.a f51136b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l.a {
        @Override // f60.l.a
        public boolean a(@m80.k SSLSocket sslSocket) {
            g0.p(sslSocket, "sslSocket");
            return e60.d.f49472g.d() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // f60.l.a
        @m80.k
        public m b(@m80.k SSLSocket sslSocket) {
            g0.p(sslSocket, "sslSocket");
            return new k();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final l.a a() {
            return k.f51136b;
        }

        public b() {
        }
    }

    @Override // f60.m
    public boolean a(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // f60.m
    @m80.l
    public String b(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // f60.m
    public void c(@m80.k SSLSocket sslSocket, @m80.l String str, @m80.k List<? extends Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) e60.j.f49490a.b(protocols).toArray(new String[0]));
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
        return e60.d.f49472g.d();
    }
}
