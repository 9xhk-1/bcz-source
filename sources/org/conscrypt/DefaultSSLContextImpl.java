package org.conscrypt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DefaultSSLContextImpl extends OpenSSLContextImpl {
    private static KeyManager[] KEY_MANAGERS;
    private static TrustManager[] TRUST_MANAGERS;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TLSv12 extends DefaultSSLContextImpl {
        public TLSv12() throws GeneralSecurityException, IOException {
            super(NativeCrypto.TLSV12_PROTOCOLS);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TLSv13 extends DefaultSSLContextImpl {
        public TLSv13() throws GeneralSecurityException, IOException {
            super(NativeCrypto.TLSV13_PROTOCOLS);
        }
    }

    @Override // org.conscrypt.OpenSSLContextImpl, javax.net.ssl.SSLContextSpi
    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) throws KeyManagementException {
        throw new KeyManagementException("Do not init() the default SSLContext ");
    }

    public KeyManager[] getKeyManagers() throws GeneralSecurityException, IOException {
        KeyManager[] keyManagerArr = KEY_MANAGERS;
        if (keyManagerArr != null) {
            return keyManagerArr;
        }
        String property = System.getProperty("javax.net.ssl.keyStore");
        BufferedInputStream bufferedInputStream = null;
        if (property == null) {
            return null;
        }
        String property2 = System.getProperty("javax.net.ssl.keyStorePassword");
        char[] charArray = property2 == null ? null : property2.toCharArray();
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(property));
            try {
                keyStore.load(bufferedInputStream2, charArray);
                bufferedInputStream2.close();
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, charArray);
                KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
                KEY_MANAGERS = keyManagers;
                return keyManagers;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public TrustManager[] getTrustManagers() throws GeneralSecurityException, IOException {
        TrustManager[] trustManagerArr = TRUST_MANAGERS;
        if (trustManagerArr != null) {
            return trustManagerArr;
        }
        String property = System.getProperty("javax.net.ssl.trustStore");
        BufferedInputStream bufferedInputStream = null;
        if (property == null) {
            return null;
        }
        String property2 = System.getProperty("javax.net.ssl.trustStorePassword");
        char[] charArray = property2 == null ? null : property2.toCharArray();
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(property));
            try {
                keyStore.load(bufferedInputStream2, charArray);
                bufferedInputStream2.close();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                TRUST_MANAGERS = trustManagers;
                return trustManagers;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private DefaultSSLContextImpl(String[] strArr) throws GeneralSecurityException, IOException {
        super(strArr, true);
    }
}
