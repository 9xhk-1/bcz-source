package lr;

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
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import wr.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class c extends SSLSocketFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final X509HostnameVerifier f71588c = new BrowserCompatHostnameVerifier();

    /* renamed from: d, reason: collision with root package name */
    public static final X509HostnameVerifier f71589d = new StrictHostnameVerifier();

    /* renamed from: e, reason: collision with root package name */
    public static volatile c f71590e = null;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f71591a;

    /* renamed from: b, reason: collision with root package name */
    public Context f71592b;

    public c(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
    }

    @Deprecated
    public static c b(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalAccessException {
        if (f71590e == null) {
            synchronized (c.class) {
                try {
                    if (f71590e == null) {
                        f71590e = new c(keyStore, context, (SecureRandom) null);
                    }
                } finally {
                }
            }
        }
        return f71590e;
    }

    @Deprecated
    public static c c(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalAccessException {
        if (f71590e == null) {
            synchronized (c.class) {
                try {
                    if (f71590e == null) {
                        f71590e = new c(keyStore, context, secureRandom);
                    }
                } finally {
                }
            }
        }
        return f71590e;
    }

    public final void a(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        f.g(sSLSocket);
        f.f(sSLSocket);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        Socket createSocket = this.f71591a.getSocketFactory().createSocket(socket, str, i11, z11);
        a(createSocket);
        return createSocket;
    }

    public c(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalAccessException {
        super(keyStore);
        this.f71592b = context;
        this.f71591a = f.i();
        this.f71591a.init(null, new X509TrustManager[]{new e(this.f71592b)}, secureRandom);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        Socket createSocket = this.f71591a.getSocketFactory().createSocket();
        a(createSocket);
        return createSocket;
    }

    @Deprecated
    public c(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        super(keyStore);
        this.f71591a = f.i();
        this.f71591a.init(null, new X509TrustManager[]{new a(inputStream, str)}, null);
    }

    @Deprecated
    public c(KeyStore keyStore, InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        super(keyStore);
        this.f71591a = f.i();
        this.f71591a.init(null, new X509TrustManager[]{new a(inputStream, str)}, secureRandom);
    }
}
