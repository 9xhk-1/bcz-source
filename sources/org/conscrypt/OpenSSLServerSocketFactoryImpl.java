package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class OpenSSLServerSocketFactoryImpl extends SSLServerSocketFactory {
    private static boolean useEngineSocketByDefault = SSLUtils.USE_ENGINE_SOCKET_BY_DEFAULT;
    private IOException instantiationException;
    private SSLParametersImpl sslParameters;
    private boolean useEngineSocket = useEngineSocketByDefault;

    public OpenSSLServerSocketFactoryImpl() {
        try {
            SSLParametersImpl sSLParametersImpl = SSLParametersImpl.getDefault();
            this.sslParameters = sSLParametersImpl;
            sSLParametersImpl.setUseClientMode(false);
        } catch (KeyManagementException e11) {
            IOException iOException = new IOException("Delayed instantiation exception:");
            this.instantiationException = iOException;
            iOException.initCause(e11);
        }
    }

    public static void setUseEngineSocketByDefault(boolean z11) {
        useEngineSocketByDefault = z11;
        ServerSocketFactory serverSocketFactory = SSLServerSocketFactory.getDefault();
        if (serverSocketFactory instanceof OpenSSLServerSocketFactoryImpl) {
            ((OpenSSLServerSocketFactoryImpl) serverSocketFactory).setUseEngineSocket(z11);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() throws IOException {
        return new ConscryptServerSocket((SSLParametersImpl) this.sslParameters.clone()).setUseEngineSocket(this.useEngineSocket);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public void setUseEngineSocket(boolean z11) {
        this.useEngineSocket = z11;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i11) throws IOException {
        return new ConscryptServerSocket(i11, (SSLParametersImpl) this.sslParameters.clone()).setUseEngineSocket(this.useEngineSocket);
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i11, int i12) throws IOException {
        return new ConscryptServerSocket(i11, i12, (SSLParametersImpl) this.sslParameters.clone()).setUseEngineSocket(this.useEngineSocket);
    }

    public OpenSSLServerSocketFactoryImpl(SSLParametersImpl sSLParametersImpl) {
        SSLParametersImpl sSLParametersImpl2 = (SSLParametersImpl) sSLParametersImpl.clone();
        this.sslParameters = sSLParametersImpl2;
        sSLParametersImpl2.setUseClientMode(false);
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i11, int i12, InetAddress inetAddress) throws IOException {
        return new ConscryptServerSocket(i11, i12, inetAddress, (SSLParametersImpl) this.sslParameters.clone()).setUseEngineSocket(this.useEngineSocket);
    }
}
