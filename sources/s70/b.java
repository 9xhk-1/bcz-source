package s70;

import java.net.InetSocketAddress;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.nio.reactor.ssl.SSLMode;
import y70.e;
import y70.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class b implements r70.c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f88114c = "TLS";

    /* renamed from: d, reason: collision with root package name */
    public static final String f88115d = "SSL";

    /* renamed from: e, reason: collision with root package name */
    public static final String f88116e = "SSLv2";

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f88117a;

    /* renamed from: b, reason: collision with root package name */
    public final X509HostnameVerifier f88118b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements f {
        public a() {
        }

        @Override // y70.f
        public void a(x70.f fVar, SSLSession sSLSession) throws SSLException {
            b.this.g(fVar, sSLSession);
        }

        @Override // y70.f
        public void b(SSLEngine sSLEngine) throws SSLException {
            b.this.e(sSLEngine);
        }
    }

    public b(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, X509HostnameVerifier x509HostnameVerifier) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(b(str, keyStore, str2, keyStore2, secureRandom, null), x509HostnameVerifier);
    }

    public static SSLContext b(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, TrustStrategy trustStrategy) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyManagementException {
        if (str == null) {
            str = "TLS";
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, str2 != null ? str2.toCharArray() : null);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore2);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null && trustStrategy != null) {
            for (int i11 = 0; i11 < trustManagers.length; i11++) {
                TrustManager trustManager = trustManagers[i11];
                if (trustManager instanceof X509TrustManager) {
                    trustManagers[i11] = new c((X509TrustManager) trustManager, trustStrategy);
                }
            }
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        sSLContext.init(keyManagers, trustManagers, secureRandom);
        return sSLContext;
    }

    public static b c() {
        return new b(SSLContexts.createDefault());
    }

    public static b d() {
        return new b(SSLContexts.createSystemDefault());
    }

    @Override // r70.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e a(x70.f fVar) {
        e eVar = new e(fVar, SSLMode.CLIENT, this.f88117a, new a());
        fVar.b(e.f99492o, eVar);
        return eVar;
    }

    public void g(x70.f fVar, SSLSession sSLSession) throws SSLException {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) fVar.l();
        this.f88118b.verify(inetSocketAddress.getHostName(), (X509Certificate) sSLSession.getPeerCertificates()[0]);
    }

    @Override // r70.c
    public boolean isSecure() {
        return true;
    }

    public b(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, TrustStrategy trustStrategy, X509HostnameVerifier x509HostnameVerifier) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(b(str, keyStore, str2, keyStore2, secureRandom, trustStrategy), x509HostnameVerifier);
    }

    public b(KeyStore keyStore, String str, KeyStore keyStore2) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", keyStore, str, keyStore2, null, null, new BrowserCompatHostnameVerifier());
    }

    public b(KeyStore keyStore, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", keyStore, str, null, null, null, new BrowserCompatHostnameVerifier());
    }

    public b(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", null, null, keyStore, null, null, new BrowserCompatHostnameVerifier());
    }

    public b(TrustStrategy trustStrategy, X509HostnameVerifier x509HostnameVerifier) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", null, null, null, null, trustStrategy, x509HostnameVerifier);
    }

    public b(TrustStrategy trustStrategy) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", null, null, null, null, trustStrategy, new BrowserCompatHostnameVerifier());
    }

    public b(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this.f88117a = sSLContext;
        this.f88118b = x509HostnameVerifier;
    }

    public b(SSLContext sSLContext) {
        this(sSLContext, new BrowserCompatHostnameVerifier());
    }

    public void e(SSLEngine sSLEngine) {
    }
}
