package wr;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    public static final X509HostnameVerifier f96686i = new BrowserCompatHostnameVerifier();

    /* renamed from: j, reason: collision with root package name */
    public static final X509HostnameVerifier f96687j = new StrictHostnameVerifier();

    /* renamed from: k, reason: collision with root package name */
    public static final String f96688k = g.class.getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    public static volatile g f96689l = null;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f96690a;

    /* renamed from: b, reason: collision with root package name */
    public SSLSocket f96691b;

    /* renamed from: c, reason: collision with root package name */
    public Context f96692c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f96693d;

    /* renamed from: e, reason: collision with root package name */
    public X509TrustManager f96694e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f96695f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f96696g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f96697h;

    public g(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        this.f96691b = null;
    }

    @Deprecated
    public static void b(X509TrustManager x509TrustManager) {
        yr.h.e(f96688k, "sasf update socket factory trust manager");
        try {
            f96689l = new g(null, x509TrustManager);
        } catch (IOException unused) {
            yr.h.d(f96688k, "IOException");
        } catch (KeyManagementException unused2) {
            yr.h.d(f96688k, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            yr.h.d(f96688k, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            yr.h.d(f96688k, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            yr.h.d(f96688k, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            yr.h.d(f96688k, "CertificateException");
        }
    }

    public static void c(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        yr.h.e(f96688k, "sasf update socket factory trust manager");
        try {
            f96689l = new g((KeyStore) null, x509TrustManager, secureRandom);
        } catch (IOException unused) {
            yr.h.d(f96688k, "IOException");
        } catch (KeyManagementException unused2) {
            yr.h.d(f96688k, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            yr.h.d(f96688k, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            yr.h.d(f96688k, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            yr.h.d(f96688k, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            yr.h.d(f96688k, "CertificateException");
        }
    }

    @Deprecated
    public static g g(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        yr.c.b(context);
        if (f96689l == null) {
            synchronized (g.class) {
                try {
                    if (f96689l == null) {
                        f96689l = new g(keyStore, context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        return f96689l;
    }

    public static g h(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        yr.c.b(context);
        if (f96689l == null) {
            synchronized (g.class) {
                try {
                    if (f96689l == null) {
                        f96689l = new g(keyStore, context, secureRandom);
                    }
                } finally {
                }
            }
        }
        return f96689l;
    }

    public final void a(Socket socket) {
        boolean z11;
        boolean z12 = true;
        if (yr.d.a(this.f96697h)) {
            z11 = false;
        } else {
            yr.h.e(f96688k, "set protocols");
            f.h((SSLSocket) socket, this.f96697h);
            z11 = true;
        }
        if (yr.d.a(this.f96696g) && yr.d.a(this.f96695f)) {
            z12 = false;
        } else {
            yr.h.e(f96688k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            f.g(sSLSocket);
            if (yr.d.a(this.f96696g)) {
                f.e(sSLSocket, this.f96695f);
            } else {
                f.l(sSLSocket, this.f96696g);
            }
        }
        if (!z11) {
            yr.h.e(f96688k, "set default protocols");
            f.g((SSLSocket) socket);
        }
        if (z12) {
            return;
        }
        yr.h.e(f96688k, "set default cipher suites");
        f.f((SSLSocket) socket);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        yr.h.e(f96688k, "createSocket: socket host port autoClose");
        Socket createSocket = this.f96690a.getSocketFactory().createSocket(socket, str, i11, z11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96691b = sSLSocket;
            this.f96693d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public String[] d() {
        return this.f96695f;
    }

    public X509Certificate[] e() {
        X509TrustManager x509TrustManager = this.f96694e;
        return x509TrustManager instanceof k ? ((k) x509TrustManager).e() : new X509Certificate[0];
    }

    public Context f() {
        return this.f96692c;
    }

    public String[] i() {
        return this.f96697h;
    }

    public SSLContext j() {
        return this.f96690a;
    }

    public SSLSocket k() {
        return this.f96691b;
    }

    public String[] l() {
        String[] strArr = this.f96693d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] m() {
        return this.f96696g;
    }

    public X509TrustManager n() {
        return this.f96694e;
    }

    public void o(String[] strArr) {
        this.f96695f = strArr;
    }

    public void p(Context context) {
        this.f96692c = context.getApplicationContext();
    }

    public void q(String[] strArr) {
        this.f96697h = strArr;
    }

    public void r(SSLContext sSLContext) {
        this.f96690a = sSLContext;
    }

    public void s(SSLSocket sSLSocket) {
        this.f96691b = sSLSocket;
    }

    public void t(String[] strArr) {
        this.f96696g = strArr;
    }

    public void u(X509TrustManager x509TrustManager) {
        this.f96694e = x509TrustManager;
    }

    public g(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f96691b = null;
        if (context == null) {
            yr.h.d(f96688k, "SecureSSLSocketFactory: context is null");
            return;
        }
        p(context);
        r(f.i());
        k a11 = j.a(context);
        this.f96694e = a11;
        this.f96690a.init(null, new X509TrustManager[]{a11}, secureRandom);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        yr.h.e(f96688k, "createSocket: ");
        Socket createSocket = this.f96690a.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96691b = sSLSocket;
            this.f96693d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Deprecated
    public g(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f96691b = null;
        this.f96690a = f.i();
        a aVar = new a(inputStream, str);
        u(aVar);
        this.f96690a.init(null, new X509TrustManager[]{aVar}, null);
    }

    public g(KeyStore keyStore, InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f96691b = null;
        this.f96690a = f.i();
        a aVar = new a(inputStream, str);
        u(aVar);
        this.f96690a.init(null, new X509TrustManager[]{aVar}, secureRandom);
    }

    @Deprecated
    public g(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f96691b = null;
        this.f96690a = f.i();
        u(x509TrustManager);
        this.f96690a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public g(KeyStore keyStore, X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f96691b = null;
        this.f96690a = f.i();
        u(x509TrustManager);
        this.f96690a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
