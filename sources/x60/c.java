package x60;

import a70.v;
import a70.w;
import a70.x;
import a70.y;
import a70.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c implements org.apache.http.n {

    /* renamed from: a, reason: collision with root package name */
    public final y f97617a;

    /* renamed from: b, reason: collision with root package name */
    public final z f97618b;

    /* renamed from: c, reason: collision with root package name */
    public final v60.c f97619c;

    /* renamed from: d, reason: collision with root package name */
    public final o f97620d;

    /* renamed from: e, reason: collision with root package name */
    public final w60.e f97621e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.e f97622f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference<Socket> f97623g;

    public c(int i11, int i12, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar, w60.e eVar, w60.e eVar2) {
        e80.a.k(i11, "Buffer size");
        v vVar = new v();
        v vVar2 = new v();
        this.f97617a = new y(vVar, i11, -1, cVar != null ? cVar : v60.c.f93129c, charsetDecoder);
        this.f97618b = new z(vVar2, i11, i12, charsetEncoder);
        this.f97619c = cVar;
        this.f97620d = new o(vVar, vVar2);
        this.f97621e = eVar == null ? z60.d.f101038d : eVar;
        this.f97622f = eVar2 == null ? z60.e.f101040d : eVar2;
        this.f97623g = new AtomicReference<>();
    }

    public Socket C() {
        return this.f97623g.get();
    }

    public InputStream E(Socket socket) throws IOException {
        return socket.getInputStream();
    }

    public OutputStream H(Socket socket) throws IOException {
        return socket.getOutputStream();
    }

    public void I() {
        this.f97620d.f();
    }

    public void L() {
        this.f97620d.g();
    }

    public HttpEntity S(org.apache.http.o oVar) throws HttpException {
        w60.b bVar = new w60.b();
        long a11 = this.f97621e.a(oVar);
        InputStream e11 = e(a11, this.f97617a);
        if (a11 == -2) {
            bVar.c(true);
            bVar.h0(-1L);
            bVar.f0(e11);
        } else if (a11 == -1) {
            bVar.c(false);
            bVar.h0(-1L);
            bVar.f0(e11);
        } else {
            bVar.c(false);
            bVar.h0(a11);
            bVar.f0(e11);
        }
        org.apache.http.e w11 = oVar.w("Content-Type");
        if (w11 != null) {
            bVar.j(w11);
        }
        org.apache.http.e w12 = oVar.w("Content-Encoding");
        if (w12 != null) {
            bVar.f(w12);
        }
        return bVar;
    }

    public OutputStream U(org.apache.http.o oVar) throws HttpException {
        return f(this.f97622f.a(oVar), this.f97618b);
    }

    @Override // org.apache.http.HttpConnection
    public boolean X1() {
        if (!isOpen()) {
            return true;
        }
        try {
            return q(1) < 0;
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    public boolean a(int i11) throws IOException {
        if (this.f97617a.i()) {
            return true;
        }
        q(i11);
        return this.f97617a.i();
    }

    public void c(Socket socket) throws IOException {
        e80.a.j(socket, "Socket");
        this.f97623g.set(socket);
        this.f97617a.e(null);
        this.f97618b.a(null);
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Socket andSet = this.f97623g.getAndSet(null);
        if (andSet != null) {
            try {
                this.f97617a.f();
                this.f97618b.flush();
            } finally {
                andSet.close();
            }
        }
    }

    public InputStream e(long j11, k70.h hVar) {
        return j11 == -2 ? new a70.e(hVar, this.f97619c) : j11 == -1 ? new w(hVar) : j11 == 0 ? a70.q.f2264a : new a70.g(hVar, j11);
    }

    public OutputStream f(long j11, k70.i iVar) {
        return j11 == -2 ? new a70.f(2048, iVar) : j11 == -1 ? new x(iVar) : new a70.h(iVar, j11);
    }

    @Override // org.apache.http.n
    public InetAddress getLocalAddress() {
        Socket socket = this.f97623g.get();
        if (socket != null) {
            return socket.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.n
    public int getLocalPort() {
        Socket socket = this.f97623g.get();
        if (socket != null) {
            return socket.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public org.apache.http.k getMetrics() {
        return this.f97620d;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.f97623g.get() != null;
    }

    public void j() throws IOException {
        this.f97618b.flush();
    }

    public void k() throws IOException {
        Socket socket = this.f97623g.get();
        if (socket == null) {
            throw new ConnectionClosedException();
        }
        if (!this.f97617a.j()) {
            this.f97617a.e(E(socket));
        }
        if (this.f97618b.h()) {
            return;
        }
        this.f97618b.a(H(socket));
    }

    @Override // org.apache.http.n
    public InetAddress l() {
        Socket socket = this.f97623g.get();
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    public final int q(int i11) throws IOException {
        Socket socket = this.f97623g.get();
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i11);
            return this.f97617a.g();
        } finally {
            socket.setSoTimeout(soTimeout);
        }
    }

    public k70.h r() {
        return this.f97617a;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i11) {
        Socket socket = this.f97623g.get();
        if (socket != null) {
            try {
                socket.setSoTimeout(i11);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection, m70.g
    public void shutdown() throws IOException {
        Socket andSet = this.f97623g.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.setSoLinger(true, 0);
            } catch (IOException unused) {
            } finally {
                andSet.close();
            }
        }
    }

    public String toString() {
        Socket socket = this.f97623g.get();
        if (socket == null) {
            return "[Not bound]";
        }
        StringBuilder sb2 = new StringBuilder();
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        SocketAddress localSocketAddress = socket.getLocalSocketAddress();
        if (remoteSocketAddress != null && localSocketAddress != null) {
            e80.h.a(sb2, localSocketAddress);
            sb2.append("<->");
            e80.h.a(sb2, remoteSocketAddress);
        }
        return sb2.toString();
    }

    public k70.i w() {
        return this.f97618b;
    }

    @Override // org.apache.http.HttpConnection
    public int x() {
        Socket socket = this.f97623g.get();
        if (socket == null) {
            return -1;
        }
        try {
            return socket.getSoTimeout();
        } catch (SocketException unused) {
            return -1;
        }
    }

    @Override // org.apache.http.n
    public int y() {
        Socket socket = this.f97623g.get();
        if (socket != null) {
            return socket.getPort();
        }
        return -1;
    }
}
