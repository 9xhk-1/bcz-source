package lr;

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
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import wr.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class d extends SSLSocketFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final X509HostnameVerifier f71593c = new BrowserCompatHostnameVerifier();

    /* renamed from: d, reason: collision with root package name */
    public static final X509HostnameVerifier f71594d = new StrictHostnameVerifier();

    /* renamed from: e, reason: collision with root package name */
    public static volatile d f71595e = null;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f71596a;

    /* renamed from: b, reason: collision with root package name */
    public Context f71597b;

    public d(Context context, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalAccessException {
        this.f71596a = null;
        this.f71597b = context;
        this.f71596a = f.i();
        this.f71596a.init(null, new X509TrustManager[]{new e(this.f71597b)}, secureRandom);
    }

    @Deprecated
    public static d b(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException {
        if (f71595e == null) {
            synchronized (d.class) {
                try {
                    if (f71595e == null) {
                        f71595e = new d(context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        return f71595e;
    }

    @Deprecated
    public static d c(Context context, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException {
        if (f71595e == null) {
            synchronized (d.class) {
                try {
                    if (f71595e == null) {
                        f71595e = new d(context, secureRandom);
                    }
                } finally {
                }
            }
        }
        return f71595e;
    }

    public final void a(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        f.g(sSLSocket);
        f.f(sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException, UnknownHostException {
        Socket createSocket = this.f71596a.getSocketFactory().createSocket(str, i11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException, UnknownHostException {
        return createSocket(str, i11);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i11);
    }

    @Deprecated
    public d(InputStream inputStream, String str) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException {
        this.f71596a = null;
        this.f71596a = f.i();
        this.f71596a.init(null, new X509TrustManager[]{new a(inputStream, str)}, null);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        Socket createSocket = this.f71596a.getSocketFactory().createSocket(socket, str, i11, z11);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
        }
        return createSocket;
    }

    @Deprecated
    public d(InputStream inputStream, String str, SecureRandom secureRandom) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException {
        this.f71596a = null;
        this.f71596a = f.i();
        this.f71596a.init(null, new X509TrustManager[]{new a(inputStream, str)}, secureRandom);
    }
}
