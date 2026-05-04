package f60;

import f60.m;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a f51137a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public m f51138b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        boolean a(@m80.k SSLSocket sSLSocket);

        @m80.k
        m b(@m80.k SSLSocket sSLSocket);
    }

    public l(@m80.k a socketAdapterFactory) {
        g0.p(socketAdapterFactory, "socketAdapterFactory");
        this.f51137a = socketAdapterFactory;
    }

    @Override // f60.m
    public boolean a(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return this.f51137a.a(sslSocket);
    }

    @Override // f60.m
    @m80.l
    public String b(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        m f11 = f(sslSocket);
        if (f11 != null) {
            return f11.b(sslSocket);
        }
        return null;
    }

    @Override // f60.m
    public void c(@m80.k SSLSocket sslSocket, @m80.l String str, @m80.k List<? extends Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        m f11 = f(sslSocket);
        if (f11 != null) {
            f11.c(sslSocket, str, protocols);
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

    public final synchronized m f(SSLSocket sSLSocket) {
        try {
            if (this.f51138b == null && this.f51137a.a(sSLSocket)) {
                this.f51138b = this.f51137a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f51138b;
    }

    @Override // f60.m
    public boolean isSupported() {
        return true;
    }
}
