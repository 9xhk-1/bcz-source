package ga;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f53516a;

    public b(SSLSocketFactory sslSocketFactory) {
        this.f53516a = sslSocketFactory;
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{wr.f.f96682e, "TLSv1.1", wr.f.f96680c, wr.f.f96679b});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return a(this.f53516a.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f53516a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f53516a.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s11, String host, int port, boolean autoClose) throws IOException {
        return a(this.f53516a.createSocket(s11, host, port, autoClose));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        return a(this.f53516a.createSocket(host, port));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
        return a(this.f53516a.createSocket(host, port, localHost, localPort));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int port) throws IOException {
        return a(this.f53516a.createSocket(host, port));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        return a(this.f53516a.createSocket(address, port, localAddress, localPort));
    }
}
