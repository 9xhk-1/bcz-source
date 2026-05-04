package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class OpenSSLSocketFactoryImpl extends SSLSocketFactory {
    private static boolean useEngineSocketByDefault = SSLUtils.USE_ENGINE_SOCKET_BY_DEFAULT;
    private final IOException instantiationException;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    public OpenSSLSocketFactoryImpl() {
        IOException iOException;
        this.useEngineSocket = useEngineSocketByDefault;
        SSLParametersImpl sSLParametersImpl = null;
        try {
            iOException = null;
            sSLParametersImpl = SSLParametersImpl.getDefault();
        } catch (KeyManagementException e11) {
            iOException = new IOException("Delayed instantiation exception:", e11);
        }
        this.sslParameters = sSLParametersImpl;
        this.instantiationException = iOException;
    }

    private boolean hasFileDescriptor(Socket socket) {
        try {
            Platform.getFileDescriptor(socket);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static void setUseEngineSocketByDefault(boolean z11) {
        useEngineSocketByDefault = z11;
        SocketFactory socketFactory = SSLSocketFactory.getDefault();
        if (socketFactory instanceof OpenSSLSocketFactoryImpl) {
            ((OpenSSLSocketFactoryImpl) socketFactory).setUseEngineSocket(z11);
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        IOException iOException = this.instantiationException;
        if (iOException == null) {
            return this.useEngineSocket ? Platform.createEngineSocket((SSLParametersImpl) this.sslParameters.clone()) : Platform.createFileDescriptorSocket((SSLParametersImpl) this.sslParameters.clone());
        }
        throw iOException;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public void setUseEngineSocket(boolean z11) {
        this.useEngineSocket = z11;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException, UnknownHostException {
        if (this.useEngineSocket) {
            return Platform.createEngineSocket(str, i11, (SSLParametersImpl) this.sslParameters.clone());
        }
        return Platform.createFileDescriptorSocket(str, i11, (SSLParametersImpl) this.sslParameters.clone());
    }

    public OpenSSLSocketFactoryImpl(SSLParametersImpl sSLParametersImpl) {
        this.useEngineSocket = useEngineSocketByDefault;
        this.sslParameters = sSLParametersImpl;
        this.instantiationException = null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException, UnknownHostException {
        if (this.useEngineSocket) {
            return Platform.createEngineSocket(str, i11, inetAddress, i12, (SSLParametersImpl) this.sslParameters.clone());
        }
        return Platform.createFileDescriptorSocket(str, i11, inetAddress, i12, (SSLParametersImpl) this.sslParameters.clone());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        if (this.useEngineSocket) {
            return Platform.createEngineSocket(inetAddress, i11, (SSLParametersImpl) this.sslParameters.clone());
        }
        return Platform.createFileDescriptorSocket(inetAddress, i11, (SSLParametersImpl) this.sslParameters.clone());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        if (this.useEngineSocket) {
            return Platform.createEngineSocket(inetAddress, i11, inetAddress2, i12, (SSLParametersImpl) this.sslParameters.clone());
        }
        return Platform.createFileDescriptorSocket(inetAddress, i11, inetAddress2, i12, (SSLParametersImpl) this.sslParameters.clone());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        Preconditions.checkNotNull(socket, "socket");
        if (socket.isConnected()) {
            if (!this.useEngineSocket && hasFileDescriptor(socket)) {
                return Platform.createFileDescriptorSocket(socket, str, i11, z11, (SSLParametersImpl) this.sslParameters.clone());
            }
            return Platform.createEngineSocket(socket, str, i11, z11, (SSLParametersImpl) this.sslParameters.clone());
        }
        throw new SocketException("Socket is not connected.");
    }
}
