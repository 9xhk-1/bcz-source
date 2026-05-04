package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class PreKitKatPlatformOpenSSLSocketImplAdapter extends org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl {
    private final AbstractConscryptSocket delegate;

    public PreKitKatPlatformOpenSSLSocketImplAdapter(AbstractConscryptSocket abstractConscryptSocket) throws IOException {
        super((org.apache.harmony.xnet.provider.jsse.SSLParametersImpl) null);
        this.delegate = abstractConscryptSocket;
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.delegate.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void bind(SocketAddress socketAddress) throws IOException {
        this.delegate.bind(socketAddress);
    }

    public void clientCertificateRequested(byte[] bArr, byte[][] bArr2) throws CertificateEncodingException, SSLException {
        throw new RuntimeException("Shouldn't be here!");
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public void connect(SocketAddress socketAddress, int i11) throws IOException {
        this.delegate.connect(socketAddress, i11);
    }

    public byte[] getAlpnSelectedProtocol() {
        return this.delegate.getAlpnSelectedProtocol();
    }

    public SocketChannel getChannel() {
        return this.delegate.getChannel();
    }

    public byte[] getChannelId() throws SSLException {
        return this.delegate.getChannelId();
    }

    public boolean getEnableSessionCreation() {
        return this.delegate.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.delegate.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.delegate.getEnabledProtocols();
    }

    public FileDescriptor getFileDescriptor$() {
        return this.delegate.getFileDescriptor$();
    }

    public InetAddress getInetAddress() {
        return this.delegate.getInetAddress();
    }

    public InputStream getInputStream() throws IOException {
        return this.delegate.getInputStream();
    }

    public boolean getKeepAlive() throws SocketException {
        return this.delegate.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.delegate.getLocalAddress();
    }

    public int getLocalPort() {
        return this.delegate.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.delegate.getLocalSocketAddress();
    }

    public boolean getNeedClientAuth() {
        return this.delegate.getNeedClientAuth();
    }

    public byte[] getNpnSelectedProtocol() {
        return this.delegate.getNpnSelectedProtocol();
    }

    public boolean getOOBInline() throws SocketException {
        return this.delegate.getOOBInline();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.delegate.getOutputStream();
    }

    public int getPort() {
        return this.delegate.getPort();
    }

    public int getReceiveBufferSize() throws SocketException {
        return this.delegate.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.delegate.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() throws SocketException {
        return this.delegate.getReuseAddress();
    }

    public SSLParameters getSSLParameters() {
        return this.delegate.getSSLParameters();
    }

    public int getSendBufferSize() throws SocketException {
        return this.delegate.getSendBufferSize();
    }

    public SSLSession getSession() {
        return this.delegate.getSession();
    }

    public int getSoLinger() throws SocketException {
        return this.delegate.getSoLinger();
    }

    public int getSoTimeout() throws SocketException {
        return this.delegate.getSoTimeout();
    }

    public int getSoWriteTimeout() throws SocketException {
        return this.delegate.getSoWriteTimeout();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.delegate.getSupportedProtocols();
    }

    public boolean getTcpNoDelay() throws SocketException {
        return this.delegate.getTcpNoDelay();
    }

    public int getTrafficClass() throws SocketException {
        return this.delegate.getTrafficClass();
    }

    public boolean getUseClientMode() {
        return this.delegate.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.delegate.getWantClientAuth();
    }

    public void handshakeCompleted() {
        throw new RuntimeException("Shouldn't be here!");
    }

    public boolean isBound() {
        return this.delegate.isBound();
    }

    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    public boolean isConnected() {
        return this.delegate.isConnected();
    }

    public boolean isInputShutdown() {
        return this.delegate.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.delegate.isOutputShutdown();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.delegate.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void sendUrgentData(int i11) throws IOException {
        this.delegate.sendUrgentData(i11);
    }

    public void setAlpnProtocols(byte[] bArr) {
        this.delegate.setAlpnProtocols(bArr);
    }

    public void setChannelIdEnabled(boolean z11) {
        this.delegate.setChannelIdEnabled(z11);
    }

    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.delegate.setChannelIdPrivateKey(privateKey);
    }

    public void setEnableSessionCreation(boolean z11) {
        this.delegate.setEnableSessionCreation(z11);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.delegate.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.delegate.setEnabledProtocols(strArr);
    }

    public void setHandshakeTimeout(int i11) throws SocketException {
        this.delegate.setHandshakeTimeout(i11);
    }

    public void setHostname(String str) {
        this.delegate.setHostname(str);
    }

    public void setKeepAlive(boolean z11) throws SocketException {
        this.delegate.setKeepAlive(z11);
    }

    public void setNeedClientAuth(boolean z11) {
        this.delegate.setNeedClientAuth(z11);
    }

    public void setNpnProtocols(byte[] bArr) {
        this.delegate.setNpnProtocols(bArr);
    }

    public void setOOBInline(boolean z11) throws SocketException {
        this.delegate.setOOBInline(z11);
    }

    public void setPerformancePreferences(int i11, int i12, int i13) {
        this.delegate.setPerformancePreferences(i11, i12, i13);
    }

    public void setReceiveBufferSize(int i11) throws SocketException {
        this.delegate.setReceiveBufferSize(i11);
    }

    public void setReuseAddress(boolean z11) throws SocketException {
        this.delegate.setReuseAddress(z11);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.delegate.setSSLParameters(sSLParameters);
    }

    public void setSendBufferSize(int i11) throws SocketException {
        this.delegate.setSendBufferSize(i11);
    }

    public void setSoLinger(boolean z11, int i11) throws SocketException {
        this.delegate.setSoLinger(z11, i11);
    }

    public void setSoTimeout(int i11) throws SocketException {
        this.delegate.setSoTimeout(i11);
    }

    public void setSoWriteTimeout(int i11) throws SocketException {
        this.delegate.setSoWriteTimeout(i11);
    }

    public void setTcpNoDelay(boolean z11) throws SocketException {
        this.delegate.setTcpNoDelay(z11);
    }

    public void setTrafficClass(int i11) throws SocketException {
        this.delegate.setTrafficClass(i11);
    }

    public void setUseClientMode(boolean z11) {
        this.delegate.setUseClientMode(z11);
    }

    public void setUseSessionTickets(boolean z11) {
        this.delegate.setUseSessionTickets(z11);
    }

    public void setWantClientAuth(boolean z11) {
        this.delegate.setWantClientAuth(z11);
    }

    public void shutdownInput() throws IOException {
        this.delegate.shutdownInput();
    }

    public void shutdownOutput() throws IOException {
        this.delegate.shutdownOutput();
    }

    public void startHandshake() throws IOException {
        this.delegate.startHandshake();
    }

    public String toString() {
        return this.delegate.toString();
    }

    public void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
        throw new RuntimeException("Shouldn't be here!");
    }

    public void connect(SocketAddress socketAddress) throws IOException {
        this.delegate.connect(socketAddress);
    }
}
