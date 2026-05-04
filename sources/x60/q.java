package x60;

import a70.a0;
import a70.b0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class q extends a implements org.apache.http.n {

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f97660i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Socket f97661j = null;

    private static void S(StringBuilder sb2, SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        sb2.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }

    public void E() {
        e80.b.a(!this.f97660i, "Connection is already open");
    }

    public void H(Socket socket, HttpParams httpParams) throws IOException {
        e80.a.j(socket, "Socket");
        e80.a.j(httpParams, "HTTP parameters");
        this.f97661j = socket;
        int intParameter = httpParams.getIntParameter(a80.b.f2293c, -1);
        w(I(socket, intParameter, httpParams), L(socket, intParameter, httpParams), httpParams);
        this.f97660i = true;
    }

    public k70.h I(Socket socket, int i11, HttpParams httpParams) throws IOException {
        return new a0(socket, i11, httpParams);
    }

    public k70.i L(Socket socket, int i11, HttpParams httpParams) throws IOException {
        return new b0(socket, i11, httpParams);
    }

    public Socket U() {
        return this.f97661j;
    }

    @Override // x60.a
    public void a() {
        e80.b.a(this.f97660i, "Connection is not open");
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f97660i) {
            this.f97660i = false;
            Socket socket = this.f97661j;
            try {
                r();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (IOException | UnsupportedOperationException unused) {
                    }
                } catch (IOException unused2) {
                }
                socket.shutdownInput();
            } finally {
                socket.close();
            }
        }
    }

    @Override // org.apache.http.n
    public InetAddress getLocalAddress() {
        if (this.f97661j != null) {
            return this.f97661j.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.n
    public int getLocalPort() {
        if (this.f97661j != null) {
            return this.f97661j.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.f97660i;
    }

    @Override // org.apache.http.n
    public InetAddress l() {
        if (this.f97661j != null) {
            return this.f97661j.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i11) {
        a();
        if (this.f97661j != null) {
            try {
                this.f97661j.setSoTimeout(i11);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection, m70.g
    public void shutdown() throws IOException {
        this.f97660i = false;
        Socket socket = this.f97661j;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.f97661j == null) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        SocketAddress remoteSocketAddress = this.f97661j.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.f97661j.getLocalSocketAddress();
        if (remoteSocketAddress != null && localSocketAddress != null) {
            S(sb2, localSocketAddress);
            sb2.append("<->");
            S(sb2, remoteSocketAddress);
        }
        return sb2.toString();
    }

    @Override // org.apache.http.HttpConnection
    public int x() {
        if (this.f97661j == null) {
            return -1;
        }
        try {
            return this.f97661j.getSoTimeout();
        } catch (SocketException unused) {
            return -1;
        }
    }

    @Override // org.apache.http.n
    public int y() {
        if (this.f97661j != null) {
            return this.f97661j.getPort();
        }
        return -1;
    }
}
