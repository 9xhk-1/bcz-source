package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class BaseOpenSSLSocketAdapterFactory extends SSLSocketFactory {
    private final OpenSSLSocketFactoryImpl delegate;

    public BaseOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        this.delegate = openSSLSocketFactoryImpl;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public abstract Socket wrap(OpenSSLSocketImpl openSSLSocketImpl) throws IOException;

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException, UnknownHostException {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException, UnknownHostException {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i11, inetAddress, i12));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i11, inetAddress2, i12));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(socket, str, i11, z11));
    }
}
