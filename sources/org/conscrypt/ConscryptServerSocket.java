package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class ConscryptServerSocket extends SSLServerSocket {
    private boolean channelIdEnabled;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    public ConscryptServerSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
        this.sslParameters = sSLParametersImpl;
    }

    @Override // java.net.ServerSocket
    public Socket accept() throws IOException {
        AbstractConscryptSocket createEngineSocket = this.useEngineSocket ? Platform.createEngineSocket(this.sslParameters) : Platform.createFileDescriptorSocket(this.sslParameters);
        createEngineSocket.setChannelIdEnabled(this.channelIdEnabled);
        implAccept(createEngineSocket);
        return createEngineSocket;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public boolean isChannelIdEnabled() {
        return this.channelIdEnabled;
    }

    public void setChannelIdEnabled(boolean z11) {
        this.channelIdEnabled = z11;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnableSessionCreation(boolean z11) {
        this.sslParameters.setEnableSessionCreation(z11);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setNeedClientAuth(boolean z11) {
        this.sslParameters.setNeedClientAuth(z11);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setUseClientMode(boolean z11) {
        this.sslParameters.setUseClientMode(z11);
    }

    public ConscryptServerSocket setUseEngineSocket(boolean z11) {
        this.useEngineSocket = z11;
        return this;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setWantClientAuth(boolean z11) {
        this.sslParameters.setWantClientAuth(z11);
    }

    public ConscryptServerSocket(int i11, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(i11);
        this.sslParameters = sSLParametersImpl;
    }

    public ConscryptServerSocket(int i11, int i12, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(i11, i12);
        this.sslParameters = sSLParametersImpl;
    }

    public ConscryptServerSocket(int i11, int i12, InetAddress inetAddress, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(i11, i12, inetAddress);
        this.sslParameters = sSLParametersImpl;
    }
}
