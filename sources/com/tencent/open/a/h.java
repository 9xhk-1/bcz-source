package com.tencent.open.a;

import com.tencent.open.log.SLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f44441a;

    /* renamed from: b, reason: collision with root package name */
    private TrustManager[] f44442b;

    public h() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        TrustManager[] b11 = b();
        this.f44442b = b11;
        sSLContext.init(null, b11, null);
        this.f44441a = sSLContext.getSocketFactory();
    }

    private TrustManager[] b() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return trustManagers;
            }
            SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "Unexpected default trust managers: " + Arrays.toString(trustManagers));
            return null;
        } catch (GeneralSecurityException unused) {
            SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "The system has no TLS. Just give up.");
            return null;
        }
    }

    public TrustManager a() {
        TrustManager[] trustManagerArr = this.f44442b;
        if (trustManagerArr == null || trustManagerArr.length <= 0) {
            return null;
        }
        return trustManagerArr[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException, UnknownHostException {
        return a(this.f44441a.createSocket(str, i11));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f44441a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f44441a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException, UnknownHostException {
        return a(this.f44441a.createSocket(str, i11, inetAddress, i12));
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return a(this.f44441a.createSocket(inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        return a(this.f44441a.createSocket(inetAddress, i11, inetAddress2, i12));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        return a(this.f44441a.createSocket(socket, str, i11, z11));
    }
}
