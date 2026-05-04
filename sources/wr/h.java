package wr;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class h extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f96698i = new BrowserCompatHostnameVerifier();

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f96699j = new StrictHostnameVerifier();

    /* renamed from: k, reason: collision with root package name */
    public static final String f96700k = h.class.getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    public static volatile h f96701l = null;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f96702a;

    /* renamed from: b, reason: collision with root package name */
    public SSLSocket f96703b;

    /* renamed from: c, reason: collision with root package name */
    public Context f96704c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f96705d;

    /* renamed from: e, reason: collision with root package name */
    public X509TrustManager f96706e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f96707f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f96708g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f96709h;

    @Deprecated
    public h(InputStream inputStream, String str) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f96702a = null;
        this.f96703b = null;
        this.f96702a = f.i();
        a aVar = new a(inputStream, str);
        s(aVar);
        this.f96702a.init(null, new X509TrustManager[]{aVar}, null);
    }

    @Deprecated
    public static void b(X509TrustManager x509TrustManager) {
        yr.h.e(f96700k, "ssf update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f96701l = new h(x509TrustManager);
        } catch (KeyManagementException unused) {
            yr.h.d(f96700k, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            yr.h.d(f96700k, "NoSuchAlgorithmException");
        }
        yr.h.b(f96700k, "update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static void c(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        yr.h.e(f96700k, "ssf update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f96701l = new h(x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            yr.h.d(f96700k, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            yr.h.d(f96700k, "NoSuchAlgorithmException");
        }
        yr.h.b(f96700k, "update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    @Deprecated
    public static h g(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        yr.c.b(context);
        if (f96701l == null) {
            synchronized (h.class) {
                try {
                    if (f96701l == null) {
                        f96701l = new h(context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        if (f96701l.f96704c == null && context != null) {
            f96701l.o(context);
        }
        yr.h.b(f96700k, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f96701l;
    }

    public static h h(Context context, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        yr.c.b(context);
        if (f96701l == null) {
            synchronized (h.class) {
                try {
                    if (f96701l == null) {
                        f96701l = new h(context, secureRandom);
                    }
                } finally {
                }
            }
        }
        if (f96701l.f96704c == null && context != null) {
            f96701l.o(context);
        }
        yr.h.b(f96700k, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f96701l;
    }

    public final void a(Socket socket) {
        boolean z11;
        boolean z12 = true;
        if (yr.d.a(this.f96709h)) {
            z11 = false;
        } else {
            yr.h.e(f96700k, "set protocols");
            f.h((SSLSocket) socket, this.f96709h);
            z11 = true;
        }
        if (yr.d.a(this.f96708g) && yr.d.a(this.f96707f)) {
            z12 = false;
        } else {
            yr.h.e(f96700k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            f.g(sSLSocket);
            if (yr.d.a(this.f96708g)) {
                f.e(sSLSocket, this.f96707f);
            } else {
                f.l(sSLSocket, this.f96708g);
            }
        }
        if (!z11) {
            yr.h.e(f96700k, "set default protocols");
            f.g((SSLSocket) socket);
        }
        if (z12) {
            return;
        }
        yr.h.e(f96700k, "set default cipher suites");
        f.f((SSLSocket) socket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException {
        yr.h.e(f96700k, "createSocket: host , port");
        Socket createSocket = this.f96702a.getSocketFactory().createSocket(str, i11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96703b = sSLSocket;
            this.f96705d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public String[] d() {
        return this.f96707f;
    }

    public X509Certificate[] e() {
        X509TrustManager x509TrustManager = this.f96706e;
        return x509TrustManager instanceof k ? ((k) x509TrustManager).e() : new X509Certificate[0];
    }

    public Context f() {
        return this.f96704c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f96705d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] i() {
        return this.f96709h;
    }

    public SSLContext j() {
        return this.f96702a;
    }

    public SSLSocket k() {
        return this.f96703b;
    }

    public String[] l() {
        return this.f96708g;
    }

    public X509TrustManager m() {
        return this.f96706e;
    }

    public void n(String[] strArr) {
        this.f96707f = strArr;
    }

    public void o(Context context) {
        this.f96704c = context.getApplicationContext();
    }

    public void p(String[] strArr) {
        this.f96709h = strArr;
    }

    public void q(SSLContext sSLContext) {
        this.f96702a = sSLContext;
    }

    public void r(String[] strArr) {
        this.f96708g = strArr;
    }

    public void s(X509TrustManager x509TrustManager) {
        this.f96706e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    public h(InputStream inputStream, String str, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f96702a = null;
        this.f96703b = null;
        this.f96702a = f.i();
        a aVar = new a(inputStream, str);
        s(aVar);
        this.f96702a.init(null, new X509TrustManager[]{aVar}, secureRandom);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException, UnknownHostException {
        return createSocket(str, i11);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        yr.h.e(f96700k, "createSocket s host port autoClose");
        Socket createSocket = this.f96702a.getSocketFactory().createSocket(socket, str, i11, z11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96703b = sSLSocket;
            this.f96705d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public h(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.f96702a = null;
        this.f96703b = null;
        if (context == null) {
            yr.h.d(f96700k, "SecureSSLSocketFactory: context is null");
            return;
        }
        o(context);
        q(f.i());
        k a11 = j.a(context);
        this.f96706e = a11;
        this.f96702a.init(null, new X509TrustManager[]{a11}, secureRandom);
    }

    @Deprecated
    public h(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f96702a = null;
        this.f96703b = null;
        this.f96702a = f.i();
        s(x509TrustManager);
        this.f96702a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public h(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f96702a = null;
        this.f96703b = null;
        this.f96702a = f.i();
        s(x509TrustManager);
        this.f96702a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
