package f60;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import f60.m;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u50.c
@SuppressLint({"NewApi"})
@u0({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n60#1:78,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f51112a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u50.c
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.l
        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return e60.j.f49490a.h() && Build.VERSION.SDK_INT >= 29;
        }

        public a() {
        }
    }

    @Override // f60.m
    public boolean a(@m80.k SSLSocket sslSocket) {
        boolean isSupportedSocket;
        g0.p(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // f60.m
    @m80.l
    @SuppressLint({"NewApi"})
    public String b(@m80.k SSLSocket sslSocket) {
        String applicationProtocol;
        g0.p(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : g0.g(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // f60.m
    @SuppressLint({"NewApi"})
    public void c(@m80.k SSLSocket sslSocket, @m80.l String str, @m80.k List<? extends Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) e60.j.f49490a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e11) {
            throw new IOException("Android internal error", e11);
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
        return f51112a.b();
    }
}
