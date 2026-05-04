package wr;

import android.content.Context;
import java.io.IOException;
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
import org.apache.http.conn.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    public static final String f96656i = "c";

    /* renamed from: j, reason: collision with root package name */
    public static volatile c f96657j;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f96658a;

    /* renamed from: b, reason: collision with root package name */
    public SSLSocket f96659b;

    /* renamed from: c, reason: collision with root package name */
    public Context f96660c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f96661d;

    /* renamed from: e, reason: collision with root package name */
    public X509TrustManager f96662e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f96663f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f96664g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f96665h;

    public c(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        this.f96659b = null;
    }

    @Deprecated
    public static void b(X509TrustManager x509TrustManager) {
        yr.h.e(f96656i, "sasfc update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f96657j = new c(null, x509TrustManager);
        } catch (KeyManagementException unused) {
            yr.h.d(f96656i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            yr.h.d(f96656i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            yr.h.d(f96656i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            yr.h.d(f96656i, "UnrecoverableKeyException");
        }
        yr.h.b(f96656i, "sasf system ca update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static void c(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        yr.h.e(f96656i, "sasfc update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f96657j = new c((KeyStore) null, x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            yr.h.d(f96656i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            yr.h.d(f96656i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            yr.h.d(f96656i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            yr.h.d(f96656i, "UnrecoverableKeyException");
        }
        yr.h.b(f96656i, "sasf system ca update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    @Deprecated
    public static c g(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        yr.c.b(context);
        if (f96657j == null) {
            synchronized (g.class) {
                try {
                    if (f96657j == null) {
                        f96657j = new c(keyStore, context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        return f96657j;
    }

    public static c h(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        yr.c.b(context);
        if (f96657j == null) {
            synchronized (g.class) {
                try {
                    if (f96657j == null) {
                        f96657j = new c(keyStore, context, secureRandom);
                    }
                } finally {
                }
            }
        }
        return f96657j;
    }

    public final void a(Socket socket) {
        boolean z11;
        boolean z12 = true;
        if (yr.d.a(this.f96665h)) {
            z11 = false;
        } else {
            yr.h.e(f96656i, "set protocols");
            f.h((SSLSocket) socket, this.f96665h);
            z11 = true;
        }
        if (yr.d.a(this.f96664g) && yr.d.a(this.f96663f)) {
            z12 = false;
        } else {
            yr.h.e(f96656i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            f.g(sSLSocket);
            if (yr.d.a(this.f96664g)) {
                f.e(sSLSocket, this.f96663f);
            } else {
                f.l(sSLSocket, this.f96664g);
            }
        }
        if (!z11) {
            yr.h.e(f96656i, "set default protocols");
            f.g((SSLSocket) socket);
        }
        if (z12) {
            return;
        }
        yr.h.e(f96656i, "set default cipher suites");
        f.f((SSLSocket) socket);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        yr.h.e(f96656i, "createSocket: socket host port autoClose");
        Socket createSocket = this.f96658a.getSocketFactory().createSocket(socket, str, i11, z11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96659b = sSLSocket;
            this.f96661d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public String[] d() {
        return this.f96663f;
    }

    public X509Certificate[] e() {
        X509TrustManager x509TrustManager = this.f96662e;
        return x509TrustManager instanceof k ? ((k) x509TrustManager).e() : new X509Certificate[0];
    }

    public Context f() {
        return this.f96660c;
    }

    public String[] i() {
        return this.f96665h;
    }

    public SSLContext j() {
        return this.f96658a;
    }

    public SSLSocket k() {
        return this.f96659b;
    }

    public String[] l() {
        String[] strArr = this.f96661d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] m() {
        return this.f96664g;
    }

    public X509TrustManager n() {
        return this.f96662e;
    }

    public void o(String[] strArr) {
        this.f96663f = strArr;
    }

    public void p(Context context) {
        this.f96660c = context.getApplicationContext();
    }

    public void q(String[] strArr) {
        this.f96665h = strArr;
    }

    public void r(SSLContext sSLContext) {
        this.f96658a = sSLContext;
    }

    public void s(SSLSocket sSLSocket) {
        this.f96659b = sSLSocket;
    }

    public void t(String[] strArr) {
        this.f96664g = strArr;
    }

    public void u(X509TrustManager x509TrustManager) {
        this.f96662e = x509TrustManager;
    }

    public c(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f96659b = null;
        if (context == null) {
            yr.h.d(f96656i, "SecureSSLSocketFactory: context is null");
            return;
        }
        p(context);
        r(f.i());
        k a11 = e.a(context);
        this.f96662e = a11;
        this.f96658a.init(null, new X509TrustManager[]{a11}, secureRandom);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        yr.h.e(f96656i, "createSocket: ");
        Socket createSocket = this.f96658a.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96659b = sSLSocket;
            this.f96661d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Deprecated
    public c(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException, UnrecoverableKeyException, KeyStoreException {
        super(keyStore);
        this.f96659b = null;
        this.f96658a = f.i();
        u(x509TrustManager);
        this.f96658a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public c(KeyStore keyStore, X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException, UnrecoverableKeyException, KeyStoreException {
        super(keyStore);
        this.f96659b = null;
        this.f96658a = f.i();
        u(x509TrustManager);
        this.f96658a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
