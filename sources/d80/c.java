package d80;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f47483i = "TLS";

    /* renamed from: a, reason: collision with root package name */
    public String f47484a;

    /* renamed from: g, reason: collision with root package name */
    public SecureRandom f47490g;

    /* renamed from: h, reason: collision with root package name */
    public Provider f47491h;

    /* renamed from: c, reason: collision with root package name */
    public String f47486c = KeyManagerFactory.getDefaultAlgorithm();

    /* renamed from: d, reason: collision with root package name */
    public String f47487d = KeyStore.getDefaultType();

    /* renamed from: f, reason: collision with root package name */
    public String f47489f = TrustManagerFactory.getDefaultAlgorithm();

    /* renamed from: b, reason: collision with root package name */
    public final Set<KeyManager> f47485b = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final Set<TrustManager> f47488e = new LinkedHashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends X509ExtendedKeyManager {

        /* renamed from: a, reason: collision with root package name */
        public final X509ExtendedKeyManager f47492a;

        /* renamed from: b, reason: collision with root package name */
        public final d80.b f47493b;

        public a(X509ExtendedKeyManager x509ExtendedKeyManager, d80.b bVar) {
            this.f47492a = x509ExtendedKeyManager;
            this.f47493b = bVar;
        }

        public Map<String, d80.a> a(String[] strArr, Principal[] principalArr) {
            HashMap hashMap = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.f47492a.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        hashMap.put(str2, new d80.a(str, this.f47492a.getCertificateChain(str2)));
                    }
                }
            }
            return hashMap;
        }

        public Map<String, d80.a> b(String str, Principal[] principalArr) {
            HashMap hashMap = new HashMap();
            String[] serverAliases = this.f47492a.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (String str2 : serverAliases) {
                    hashMap.put(str2, new d80.a(str, this.f47492a.getCertificateChain(str2)));
                }
            }
            return hashMap;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return this.f47493b.a(a(strArr, principalArr), socket);
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
            return this.f47493b.a(a(strArr, principalArr), null);
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
            return this.f47493b.a(b(str, principalArr), null);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return this.f47493b.a(b(str, principalArr), socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.f47492a.getCertificateChain(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.f47492a.getClientAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.f47492a.getPrivateKey(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.f47492a.getServerAliases(str, principalArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements X509TrustManager {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f47494a;

        /* renamed from: b, reason: collision with root package name */
        public final e f47495b;

        public b(X509TrustManager x509TrustManager, e eVar) {
            this.f47494a = x509TrustManager;
            this.f47495b = eVar;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f47494a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (this.f47495b.a(x509CertificateArr, str)) {
                return;
            }
            this.f47494a.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f47494a.getAcceptedIssuers();
        }
    }

    public static c b() {
        return new c();
    }

    public SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
        String str = this.f47484a;
        if (str == null) {
            str = "TLS";
        }
        Provider provider = this.f47491h;
        SSLContext sSLContext = provider != null ? SSLContext.getInstance(str, provider) : SSLContext.getInstance(str);
        c(sSLContext, this.f47485b, this.f47488e, this.f47490g);
        return sSLContext;
    }

    public void c(SSLContext sSLContext, Collection<KeyManager> collection, Collection<TrustManager> collection2, SecureRandom secureRandom) throws KeyManagementException {
        sSLContext.init(!collection.isEmpty() ? (KeyManager[]) collection.toArray(new KeyManager[collection.size()]) : null, collection2.isEmpty() ? null : (TrustManager[]) collection2.toArray(new TrustManager[collection2.size()]), secureRandom);
    }

    public c d(File file, char[] cArr, char[] cArr2) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        return e(file, cArr, cArr2, null);
    }

    public c e(File file, char[] cArr, char[] cArr2, d80.b bVar) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        e80.a.j(file, "Keystore file");
        KeyStore keyStore = KeyStore.getInstance(this.f47487d);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            keyStore.load(fileInputStream, cArr);
            fileInputStream.close();
            return i(keyStore, cArr2, bVar);
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public c f(URL url, char[] cArr, char[] cArr2) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        return g(url, cArr, cArr2, null);
    }

    public c g(URL url, char[] cArr, char[] cArr2, d80.b bVar) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        e80.a.j(url, "Keystore URL");
        KeyStore keyStore = KeyStore.getInstance(this.f47487d);
        InputStream openStream = url.openStream();
        try {
            keyStore.load(openStream, cArr);
            openStream.close();
            return i(keyStore, cArr2, bVar);
        } catch (Throwable th2) {
            openStream.close();
            throw th2;
        }
    }

    public c h(KeyStore keyStore, char[] cArr) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException {
        return i(keyStore, cArr, null);
    }

    public c i(KeyStore keyStore, char[] cArr, d80.b bVar) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException {
        String str = this.f47486c;
        if (str == null) {
            str = KeyManagerFactory.getDefaultAlgorithm();
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(str);
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            if (bVar != null) {
                for (int i11 = 0; i11 < keyManagers.length; i11++) {
                    KeyManager keyManager = keyManagers[i11];
                    if (keyManager instanceof X509ExtendedKeyManager) {
                        keyManagers[i11] = new a((X509ExtendedKeyManager) keyManager, bVar);
                    }
                }
            }
            Collections.addAll(this.f47485b, keyManagers);
        }
        return this;
    }

    public c j(e eVar) throws NoSuchAlgorithmException, KeyStoreException {
        return p(null, eVar);
    }

    public c k(File file) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        return l(file, null);
    }

    public c l(File file, char[] cArr) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        return m(file, cArr, null);
    }

    public c m(File file, char[] cArr, e eVar) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        e80.a.j(file, "Truststore file");
        KeyStore keyStore = KeyStore.getInstance(this.f47487d);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            keyStore.load(fileInputStream, cArr);
            fileInputStream.close();
            return p(keyStore, eVar);
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public c n(URL url, char[] cArr) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        return o(url, cArr, null);
    }

    public c o(URL url, char[] cArr, e eVar) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        e80.a.j(url, "Truststore URL");
        KeyStore keyStore = KeyStore.getInstance(this.f47487d);
        InputStream openStream = url.openStream();
        try {
            keyStore.load(openStream, cArr);
            openStream.close();
            return p(keyStore, eVar);
        } catch (Throwable th2) {
            openStream.close();
            throw th2;
        }
    }

    public c p(KeyStore keyStore, e eVar) throws NoSuchAlgorithmException, KeyStoreException {
        String str = this.f47489f;
        if (str == null) {
            str = TrustManagerFactory.getDefaultAlgorithm();
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(str);
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (eVar != null) {
                for (int i11 = 0; i11 < trustManagers.length; i11++) {
                    TrustManager trustManager = trustManagers[i11];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i11] = new b((X509TrustManager) trustManager, eVar);
                    }
                }
            }
            Collections.addAll(this.f47488e, trustManagers);
        }
        return this;
    }

    public c q(String str) {
        this.f47486c = str;
        return this;
    }

    public c r(String str) {
        this.f47487d = str;
        return this;
    }

    public c s(String str) {
        this.f47484a = str;
        return this;
    }

    public c t(String str) {
        this.f47491h = Security.getProvider(str);
        return this;
    }

    public String toString() {
        return "[provider=" + this.f47491h + ", protocol=" + this.f47484a + ", keyStoreType=" + this.f47487d + ", keyManagerFactoryAlgorithm=" + this.f47486c + ", keyManagers=" + this.f47485b + ", trustManagerFactoryAlgorithm=" + this.f47489f + ", trustManagers=" + this.f47488e + ", secureRandom=" + this.f47490g + "]";
    }

    public c u(Provider provider) {
        this.f47491h = provider;
        return this;
    }

    public c v(SecureRandom secureRandom) {
        this.f47490g = secureRandom;
        return this;
    }

    public c w(String str) {
        this.f47489f = str;
        return this;
    }

    @Deprecated
    public c x(String str) {
        this.f47484a = str;
        return this;
    }
}
