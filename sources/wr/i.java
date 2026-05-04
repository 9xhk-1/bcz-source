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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    public static final String f96710i = "SSLFNew";

    /* renamed from: j, reason: collision with root package name */
    public static volatile i f96711j;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f96712a;

    /* renamed from: b, reason: collision with root package name */
    public SSLSocket f96713b;

    /* renamed from: c, reason: collision with root package name */
    public Context f96714c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f96715d;

    /* renamed from: e, reason: collision with root package name */
    public X509TrustManager f96716e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f96717f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f96718g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f96719h;

    @Deprecated
    public i(InputStream inputStream, String str) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f96712a = null;
        this.f96713b = null;
        this.f96712a = f.i();
        a aVar = new a(inputStream, str);
        q(aVar);
        this.f96712a.init(null, new X509TrustManager[]{aVar}, null);
    }

    @Deprecated
    public static i e(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        yr.c.b(context);
        if (f96711j == null) {
            synchronized (i.class) {
                try {
                    if (f96711j == null) {
                        f96711j = new i(context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        if (f96711j.f96714c == null && context != null) {
            f96711j.m(context);
        }
        yr.h.b(f96710i, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f96711j;
    }

    public static i f(Context context, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        yr.c.b(context);
        if (f96711j == null) {
            synchronized (i.class) {
                try {
                    if (f96711j == null) {
                        f96711j = new i(context, secureRandom);
                    }
                } finally {
                }
            }
        }
        if (f96711j.f96714c == null && context != null) {
            f96711j.m(context);
        }
        yr.h.b(f96710i, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f96711j;
    }

    public final void a(Socket socket) {
        boolean z11;
        boolean z12 = true;
        if (yr.d.a(this.f96719h)) {
            z11 = false;
        } else {
            yr.h.e(f96710i, "set protocols");
            f.h((SSLSocket) socket, this.f96719h);
            z11 = true;
        }
        if (yr.d.a(this.f96718g) && yr.d.a(this.f96717f)) {
            z12 = false;
        } else {
            yr.h.e(f96710i, "set cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            f.g(sSLSocket);
            if (yr.d.a(this.f96718g)) {
                f.e(sSLSocket, this.f96717f);
            } else {
                f.l(sSLSocket, this.f96718g);
            }
        }
        if (!z11) {
            yr.h.e(f96710i, "set default protocols");
            f.g((SSLSocket) socket);
        }
        if (z12) {
            return;
        }
        yr.h.e(f96710i, "set default cipher");
        f.f((SSLSocket) socket);
    }

    public String[] b() {
        return this.f96717f;
    }

    public X509Certificate[] c() {
        X509TrustManager x509TrustManager = this.f96716e;
        return x509TrustManager instanceof k ? ((k) x509TrustManager).e() : new X509Certificate[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException {
        yr.h.e(f96710i, "createSocket: host , port");
        Socket createSocket = this.f96712a.getSocketFactory().createSocket(str, i11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96713b = sSLSocket;
            this.f96715d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public Context d() {
        return this.f96714c;
    }

    public String[] g() {
        return this.f96719h;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f96715d;
        return strArr != null ? strArr : new String[0];
    }

    public SSLContext h() {
        return this.f96712a;
    }

    public SSLSocket i() {
        return this.f96713b;
    }

    public String[] j() {
        return this.f96718g;
    }

    public X509TrustManager k() {
        return this.f96716e;
    }

    public void l(String[] strArr) {
        this.f96717f = strArr;
    }

    public void m(Context context) {
        this.f96714c = context.getApplicationContext();
    }

    public void n(String[] strArr) {
        this.f96719h = strArr;
    }

    public void o(SSLContext sSLContext) {
        this.f96712a = sSLContext;
    }

    public void p(String[] strArr) {
        this.f96718g = strArr;
    }

    public void q(X509TrustManager x509TrustManager) {
        this.f96716e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    public i(InputStream inputStream, String str, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f96712a = null;
        this.f96713b = null;
        this.f96712a = f.i();
        a aVar = new a(inputStream, str);
        q(aVar);
        this.f96712a.init(null, new X509TrustManager[]{aVar}, secureRandom);
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
        yr.h.e(f96710i, "createSocket");
        Socket createSocket = this.f96712a.getSocketFactory().createSocket(socket, str, i11, z11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f96713b = sSLSocket;
            this.f96715d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public i(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.f96712a = null;
        this.f96713b = null;
        if (context == null) {
            yr.h.d(f96710i, "SecureSSLSocketFactory: context is null");
            return;
        }
        m(context);
        o(f.i());
        k a11 = j.a(context);
        this.f96716e = a11;
        this.f96712a.init(null, new X509TrustManager[]{a11}, secureRandom);
    }

    @Deprecated
    public i(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f96712a = null;
        this.f96713b = null;
        this.f96712a = f.i();
        q(x509TrustManager);
        this.f96712a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public i(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f96712a = null;
        this.f96713b = null;
        this.f96712a = f.i();
        q(x509TrustManager);
        this.f96712a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
