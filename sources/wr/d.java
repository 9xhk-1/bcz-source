package wr;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    public static final String f96666i = "d";

    /* renamed from: j, reason: collision with root package name */
    public static volatile d f96667j;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f96668a;

    /* renamed from: b, reason: collision with root package name */
    public SSLSocket f96669b;

    /* renamed from: c, reason: collision with root package name */
    public Context f96670c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f96671d;

    /* renamed from: e, reason: collision with root package name */
    public X509TrustManager f96672e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f96673f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f96674g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f96675h;

    public d(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.f96668a = null;
        this.f96669b = null;
        if (context == null) {
            yr.h.d(f96666i, "SecureSSLSocketFactory: context is null");
            return;
        }
        o(context);
        q(f.i());
        k a11 = e.a(context);
        this.f96672e = a11;
        this.f96668a.init(null, new X509TrustManager[]{a11}, secureRandom);
    }

    @Deprecated
    public static void b(X509TrustManager x509TrustManager) {
        yr.h.e(f96666i, "ssfc update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f96667j = new d(x509TrustManager);
        } catch (KeyManagementException unused) {
            yr.h.d(f96666i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            yr.h.d(f96666i, "NoSuchAlgorithmException");
        }
        yr.h.b(f96666i, "SSF system ca update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static void c(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        yr.h.e(f96666i, "ssfc update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f96667j = new d(x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            yr.h.d(f96666i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            yr.h.d(f96666i, "NoSuchAlgorithmException");
        }
        yr.h.b(f96666i, "SSF system ca update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    @Deprecated
    public static d g(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        yr.c.b(context);
        if (f96667j == null) {
            synchronized (d.class) {
                try {
                    if (f96667j == null) {
                        f96667j = new d(context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        if (f96667j.f96670c == null && context != null) {
            f96667j.o(context);
        }
        return f96667j;
    }

    public static d h(Context context, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        yr.c.b(context);
        if (f96667j == null) {
            synchronized (d.class) {
                try {
                    if (f96667j == null) {
                        f96667j = new d(context, secureRandom);
                    }
                } finally {
                }
            }
        }
        if (f96667j.f96670c == null && context != null) {
            f96667j.o(context);
        }
        return f96667j;
    }

    public final void a(Socket socket) {
        boolean z11;
        boolean z12 = true;
        if (yr.d.a(this.f96675h)) {
            z11 = false;
        } else {
            yr.h.e(f96666i, "set protocols");
            f.h((SSLSocket) socket, this.f96675h);
            z11 = true;
        }
        if (yr.d.a(this.f96674g) && yr.d.a(this.f96673f)) {
            z12 = false;
        } else {
            yr.h.e(f96666i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            f.g(sSLSocket);
            if (yr.d.a(this.f96674g)) {
                f.e(sSLSocket, this.f96673f);
            } else {
                f.l(sSLSocket, this.f96674g);
            }
        }
        if (!z11) {
            yr.h.e(f96666i, "set default protocols");
            f.g((SSLSocket) socket);
        }
        if (z12) {
            return;
        }
        yr.h.e(f96666i, "set default cipher suites");
        f.f((SSLSocket) socket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException {
        yr.h.e(f96666i, "createSocket: host , port");
        Socket createSocket = this.f96668a.getSocketFactory().createSocket(str, i11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96669b = sSLSocket;
            this.f96671d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public String[] d() {
        return this.f96673f;
    }

    public X509Certificate[] e() {
        X509TrustManager x509TrustManager = this.f96672e;
        return x509TrustManager instanceof k ? ((k) x509TrustManager).e() : new X509Certificate[0];
    }

    public Context f() {
        return this.f96670c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f96671d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] i() {
        return this.f96675h;
    }

    public SSLContext j() {
        return this.f96668a;
    }

    public SSLSocket k() {
        return this.f96669b;
    }

    public String[] l() {
        return this.f96674g;
    }

    public X509TrustManager m() {
        return this.f96672e;
    }

    public void n(String[] strArr) {
        this.f96673f = strArr;
    }

    public void o(Context context) {
        this.f96670c = context.getApplicationContext();
    }

    public void p(String[] strArr) {
        this.f96675h = strArr;
    }

    public void q(SSLContext sSLContext) {
        this.f96668a = sSLContext;
    }

    public void r(String[] strArr) {
        this.f96674g = strArr;
    }

    public void s(X509TrustManager x509TrustManager) {
        this.f96672e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException, UnknownHostException {
        return createSocket(str, i11);
    }

    @Deprecated
    public d(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f96668a = null;
        this.f96669b = null;
        this.f96668a = f.i();
        s(x509TrustManager);
        this.f96668a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        yr.h.e(f96666i, "createSocket: s , host , port , autoClose");
        Socket createSocket = this.f96668a.getSocketFactory().createSocket(socket, str, i11, z11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96669b = sSLSocket;
            this.f96671d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public d(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f96668a = null;
        this.f96669b = null;
        this.f96668a = f.i();
        s(x509TrustManager);
        this.f96668a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
