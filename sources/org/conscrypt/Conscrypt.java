package org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Properties;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.io.IoUtils;
import wr.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class Conscrypt {
    private static final Version VERSION;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProviderBuilder {
        private String defaultTlsProtocol;
        private String name;
        private boolean provideTrustManager;

        public Provider build() {
            return new OpenSSLProvider(this.name, this.provideTrustManager, this.defaultTlsProtocol);
        }

        public ProviderBuilder defaultTlsProtocol(String str) {
            this.defaultTlsProtocol = str;
            return this;
        }

        @Deprecated
        public ProviderBuilder provideTrustManager() {
            return provideTrustManager(true);
        }

        public ProviderBuilder setName(String str) {
            this.name = str;
            return this;
        }

        private ProviderBuilder() {
            this.name = Platform.getDefaultProviderName();
            this.provideTrustManager = Platform.provideTrustManagerByDefault();
            this.defaultTlsProtocol = f.f96679b;
        }

        public ProviderBuilder provideTrustManager(boolean z11) {
            this.provideTrustManager = z11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Version {
        private final int major;
        private final int minor;
        private final int patch;

        public int major() {
            return this.major;
        }

        public int minor() {
            return this.minor;
        }

        public int patch() {
            return this.patch;
        }

        private Version(int i11, int i12, int i13) {
            this.major = i11;
            this.minor = i12;
            this.patch = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i11;
        int i12;
        InputStream inputStream;
        int i13;
        int i14 = -1;
        InputStream inputStream2 = null;
        Object[] objArr = 0;
        try {
            inputStream = Conscrypt.class.getResourceAsStream("conscrypt.properties");
            if (inputStream != null) {
                try {
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStream);
                        i11 = Integer.parseInt(properties.getProperty("org.conscrypt.version.major", "-1"));
                        try {
                            i12 = Integer.parseInt(properties.getProperty("org.conscrypt.version.minor", "-1"));
                        } catch (IOException unused) {
                            i12 = -1;
                        }
                        try {
                            i13 = Integer.parseInt(properties.getProperty("org.conscrypt.version.patch", "-1"));
                            i14 = i11;
                        } catch (IOException unused2) {
                            IoUtils.closeQuietly(inputStream);
                            i13 = -1;
                            i14 = i11;
                            if (i14 >= 0) {
                            }
                            VERSION = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        IoUtils.closeQuietly(inputStream2);
                        throw th;
                    }
                } catch (IOException unused3) {
                    i11 = -1;
                    i12 = -1;
                }
            } else {
                i13 = -1;
                i12 = -1;
            }
            IoUtils.closeQuietly(inputStream);
        } catch (IOException unused4) {
            i11 = -1;
            i12 = -1;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (i14 >= 0 || i12 < 0 || i13 < 0) {
            VERSION = null;
        } else {
            VERSION = new Version(i14, i12, i13);
        }
    }

    private Conscrypt() {
    }

    public static void checkAvailability() {
        NativeCrypto.checkAvailability();
    }

    public static byte[] exportKeyingMaterial(SSLSocket sSLSocket, String str, byte[] bArr, int i11) throws SSLException {
        return toConscrypt(sSLSocket).exportKeyingMaterial(str, bArr, i11);
    }

    public static String getApplicationProtocol(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getApplicationProtocol();
    }

    public static String[] getApplicationProtocols(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getApplicationProtocols();
    }

    public static byte[] getChannelId(SSLSocket sSLSocket) throws SSLException {
        return toConscrypt(sSLSocket).getChannelId();
    }

    public static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier(TrustManager trustManager) {
        ConscryptHostnameVerifier defaultHostnameVerifier;
        synchronized (Conscrypt.class) {
            defaultHostnameVerifier = TrustManagerImpl.getDefaultHostnameVerifier();
        }
        return defaultHostnameVerifier;
    }

    public static X509TrustManager getDefaultX509TrustManager() throws KeyManagementException {
        checkAvailability();
        return SSLParametersImpl.getDefaultX509TrustManager();
    }

    public static String getHostname(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getHostname();
    }

    public static String getHostnameOrIP(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getHostnameOrIP();
    }

    public static ConscryptHostnameVerifier getHostnameVerifier(TrustManager trustManager) {
        return toConscrypt(trustManager).getHostnameVerifier();
    }

    public static byte[] getTlsUnique(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getTlsUnique();
    }

    public static boolean isAvailable() {
        try {
            checkAvailability();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isConscrypt(Provider provider) {
        return provider instanceof OpenSSLProvider;
    }

    public static int maxEncryptedPacketLength() {
        return 16709;
    }

    public static int maxSealOverhead(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).maxSealOverhead();
    }

    public static SSLContextSpi newPreferredSSLContextSpi() {
        checkAvailability();
        return OpenSSLContextImpl.getPreferred();
    }

    public static Provider newProvider() {
        checkAvailability();
        return new OpenSSLProvider();
    }

    public static ProviderBuilder newProviderBuilder() {
        return new ProviderBuilder();
    }

    public static void setApplicationProtocolSelector(SSLSocket sSLSocket, ApplicationProtocolSelector applicationProtocolSelector) {
        toConscrypt(sSLSocket).setApplicationProtocolSelector(applicationProtocolSelector);
    }

    public static void setApplicationProtocols(SSLSocket sSLSocket, String[] strArr) {
        toConscrypt(sSLSocket).setApplicationProtocols(strArr);
    }

    public static void setBufferAllocator(SSLEngine sSLEngine, BufferAllocator bufferAllocator) {
        toConscrypt(sSLEngine).setBufferAllocator(bufferAllocator);
    }

    public static void setChannelIdEnabled(SSLSocket sSLSocket, boolean z11) {
        toConscrypt(sSLSocket).setChannelIdEnabled(z11);
    }

    public static void setChannelIdPrivateKey(SSLSocket sSLSocket, PrivateKey privateKey) {
        toConscrypt(sSLSocket).setChannelIdPrivateKey(privateKey);
    }

    public static void setClientSessionCache(SSLContext sSLContext, SSLClientSessionCache sSLClientSessionCache) {
        SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
        if (clientSessionContext instanceof ClientSessionContext) {
            ((ClientSessionContext) clientSessionContext).setPersistentCache(sSLClientSessionCache);
            return;
        }
        throw new IllegalArgumentException("Not a conscrypt client context: " + clientSessionContext.getClass().getName());
    }

    public static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
        ConscryptEngine.setDefaultBufferAllocator(bufferAllocator);
    }

    public static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        synchronized (Conscrypt.class) {
            TrustManagerImpl.setDefaultHostnameVerifier(conscryptHostnameVerifier);
        }
    }

    public static void setHandshakeListener(SSLEngine sSLEngine, HandshakeListener handshakeListener) {
        toConscrypt(sSLEngine).setHandshakeListener(handshakeListener);
    }

    public static void setHostname(SSLSocket sSLSocket, String str) {
        toConscrypt(sSLSocket).setHostname(str);
    }

    public static void setHostnameVerifier(TrustManager trustManager, ConscryptHostnameVerifier conscryptHostnameVerifier) {
        toConscrypt(trustManager).setHostnameVerifier(conscryptHostnameVerifier);
    }

    public static void setServerSessionCache(SSLContext sSLContext, SSLServerSessionCache sSLServerSessionCache) {
        SSLSessionContext serverSessionContext = sSLContext.getServerSessionContext();
        if (serverSessionContext instanceof ServerSessionContext) {
            ((ServerSessionContext) serverSessionContext).setPersistentCache(sSLServerSessionCache);
            return;
        }
        throw new IllegalArgumentException("Not a conscrypt client context: " + serverSessionContext.getClass().getName());
    }

    public static void setUseEngineSocket(SSLSocketFactory sSLSocketFactory, boolean z11) {
        toConscrypt(sSLSocketFactory).setUseEngineSocket(z11);
    }

    public static void setUseEngineSocketByDefault(boolean z11) {
        OpenSSLSocketFactoryImpl.setUseEngineSocketByDefault(z11);
        OpenSSLServerSocketFactoryImpl.setUseEngineSocketByDefault(z11);
    }

    public static void setUseSessionTickets(SSLSocket sSLSocket, boolean z11) {
        toConscrypt(sSLSocket).setUseSessionTickets(z11);
    }

    private static OpenSSLSocketFactoryImpl toConscrypt(SSLSocketFactory sSLSocketFactory) {
        if (isConscrypt(sSLSocketFactory)) {
            return (OpenSSLSocketFactoryImpl) sSLSocketFactory;
        }
        throw new IllegalArgumentException("Not a conscrypt socket factory: " + sSLSocketFactory.getClass().getName());
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
        return toConscrypt(sSLEngine).unwrap(byteBufferArr, byteBufferArr2);
    }

    public static Version version() {
        return VERSION;
    }

    public static ConscryptHostnameVerifier wrapHostnameVerifier(final HostnameVerifier hostnameVerifier) {
        return new ConscryptHostnameVerifier() { // from class: org.conscrypt.Conscrypt.1
            @Override // org.conscrypt.ConscryptHostnameVerifier
            public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
                return hostnameVerifier.verify(str, sSLSession);
            }
        };
    }

    public static byte[] exportKeyingMaterial(SSLEngine sSLEngine, String str, byte[] bArr, int i11) throws SSLException {
        return toConscrypt(sSLEngine).exportKeyingMaterial(str, bArr, i11);
    }

    public static String getApplicationProtocol(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getApplicationProtocol();
    }

    public static String[] getApplicationProtocols(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getApplicationProtocols();
    }

    public static byte[] getChannelId(SSLEngine sSLEngine) throws SSLException {
        return toConscrypt(sSLEngine).getChannelId();
    }

    public static String getHostname(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getHostname();
    }

    public static byte[] getTlsUnique(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getTlsUnique();
    }

    public static boolean isConscrypt(SSLContext sSLContext) {
        return sSLContext.getProvider() instanceof OpenSSLProvider;
    }

    public static void setApplicationProtocolSelector(SSLEngine sSLEngine, ApplicationProtocolSelector applicationProtocolSelector) {
        toConscrypt(sSLEngine).setApplicationProtocolSelector(applicationProtocolSelector);
    }

    public static void setApplicationProtocols(SSLEngine sSLEngine, String[] strArr) {
        toConscrypt(sSLEngine).setApplicationProtocols(strArr);
    }

    public static void setBufferAllocator(SSLSocket sSLSocket, BufferAllocator bufferAllocator) {
        AbstractConscryptSocket conscrypt = toConscrypt(sSLSocket);
        if (conscrypt instanceof ConscryptEngineSocket) {
            ((ConscryptEngineSocket) conscrypt).setBufferAllocator(bufferAllocator);
        }
    }

    public static void setChannelIdEnabled(SSLEngine sSLEngine, boolean z11) {
        toConscrypt(sSLEngine).setChannelIdEnabled(z11);
    }

    public static void setChannelIdPrivateKey(SSLEngine sSLEngine, PrivateKey privateKey) {
        toConscrypt(sSLEngine).setChannelIdPrivateKey(privateKey);
    }

    public static void setHostname(SSLEngine sSLEngine, String str) {
        toConscrypt(sSLEngine).setHostname(str);
    }

    public static void setUseEngineSocket(SSLServerSocketFactory sSLServerSocketFactory, boolean z11) {
        toConscrypt(sSLServerSocketFactory).setUseEngineSocket(z11);
    }

    public static void setUseSessionTickets(SSLEngine sSLEngine, boolean z11) {
        toConscrypt(sSLEngine).setUseSessionTickets(z11);
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, int i11, int i12, ByteBuffer[] byteBufferArr2, int i13, int i14) throws SSLException {
        return toConscrypt(sSLEngine).unwrap(byteBufferArr, i11, i12, byteBufferArr2, i13, i14);
    }

    public static boolean isConscrypt(SSLSocketFactory sSLSocketFactory) {
        return sSLSocketFactory instanceof OpenSSLSocketFactoryImpl;
    }

    @Deprecated
    public static Provider newProvider(String str) {
        checkAvailability();
        return newProviderBuilder().setName(str).build();
    }

    public static boolean isConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
        return sSLServerSocketFactory instanceof OpenSSLServerSocketFactoryImpl;
    }

    public static boolean isConscrypt(SSLSocket sSLSocket) {
        return sSLSocket instanceof AbstractConscryptSocket;
    }

    private static OpenSSLServerSocketFactoryImpl toConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
        if (isConscrypt(sSLServerSocketFactory)) {
            return (OpenSSLServerSocketFactoryImpl) sSLServerSocketFactory;
        }
        throw new IllegalArgumentException("Not a conscrypt server socket factory: " + sSLServerSocketFactory.getClass().getName());
    }

    public static boolean isConscrypt(SSLEngine sSLEngine) {
        return sSLEngine instanceof AbstractConscryptEngine;
    }

    public static boolean isConscrypt(TrustManager trustManager) {
        return trustManager instanceof TrustManagerImpl;
    }

    private static AbstractConscryptSocket toConscrypt(SSLSocket sSLSocket) {
        if (isConscrypt(sSLSocket)) {
            return (AbstractConscryptSocket) sSLSocket;
        }
        throw new IllegalArgumentException("Not a conscrypt socket: " + sSLSocket.getClass().getName());
    }

    private static AbstractConscryptEngine toConscrypt(SSLEngine sSLEngine) {
        if (isConscrypt(sSLEngine)) {
            return (AbstractConscryptEngine) sSLEngine;
        }
        throw new IllegalArgumentException("Not a conscrypt engine: " + sSLEngine.getClass().getName());
    }

    private static TrustManagerImpl toConscrypt(TrustManager trustManager) {
        if (isConscrypt(trustManager)) {
            return (TrustManagerImpl) trustManager;
        }
        throw new IllegalArgumentException("Not a Conscrypt trust manager: " + trustManager.getClass().getName());
    }
}
