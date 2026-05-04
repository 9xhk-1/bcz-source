package h70;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class j implements x70.f, x70.n {

    /* renamed from: a, reason: collision with root package name */
    public final SelectionKey f58793a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteChannel f58794b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f58795c;

    /* renamed from: d, reason: collision with root package name */
    public final l f58796d;

    /* renamed from: e, reason: collision with root package name */
    public final t f58797e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f58798f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f58799g;

    /* renamed from: h, reason: collision with root package name */
    public volatile x70.i f58800h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f58801i;

    /* renamed from: j, reason: collision with root package name */
    public final long f58802j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f58803k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f58804l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f58805m;

    public j(SelectionKey selectionKey, l lVar, t tVar) {
        e80.a.j(selectionKey, "Selection key");
        this.f58793a = selectionKey;
        this.f58794b = (ByteChannel) selectionKey.channel();
        this.f58796d = lVar;
        this.f58797e = tVar;
        this.f58795c = Collections.synchronizedMap(new HashMap());
        this.f58799g = selectionKey.interestOps();
        this.f58801i = 0;
        this.f58798f = 0;
        long currentTimeMillis = System.currentTimeMillis();
        this.f58802j = currentTimeMillis;
        this.f58803k = currentTimeMillis;
        this.f58804l = currentTimeMillis;
        this.f58805m = currentTimeMillis;
    }

    public static void j(StringBuilder sb2, SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        sb2.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }

    public static void m(StringBuilder sb2, int i11) {
        if ((i11 & 1) > 0) {
            sb2.append('r');
        }
        if ((i11 & 4) > 0) {
            sb2.append('w');
        }
        if ((i11 & 16) > 0) {
            sb2.append('a');
        }
        if ((i11 & 8) > 0) {
            sb2.append('c');
        }
    }

    @Override // x70.f
    public boolean a() {
        x70.i iVar = this.f58800h;
        return iVar != null && iVar.a();
    }

    @Override // x70.f
    public void b(String str, Object obj) {
        this.f58795c.put(str, obj);
    }

    @Override // x70.f
    public boolean c() {
        x70.i iVar = this.f58800h;
        return iVar != null && iVar.c();
    }

    @Override // x70.f
    public void close() {
        synchronized (this) {
            try {
                if (this.f58798f == Integer.MAX_VALUE) {
                    return;
                }
                this.f58798f = Integer.MAX_VALUE;
                this.f58793a.cancel();
                try {
                    this.f58793a.channel().close();
                } catch (IOException unused) {
                }
                t tVar = this.f58797e;
                if (tVar != null) {
                    tVar.a(this);
                }
                if (this.f58793a.selector().isOpen()) {
                    this.f58793a.selector().wakeup();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x70.f
    public int d() {
        return this.f58796d != null ? this.f58799g : this.f58793a.interestOps();
    }

    @Override // x70.f
    public void e(x70.i iVar) {
        this.f58800h = iVar;
    }

    @Override // x70.f
    public synchronized void f(int i11) {
        try {
            if (this.f58798f == Integer.MAX_VALUE) {
                return;
            }
            if (this.f58796d != null) {
                this.f58799g = (~i11) & this.f58799g;
                this.f58796d.a(new k(this.f58793a, this.f58799g));
            } else {
                this.f58793a.interestOps((~i11) & this.f58793a.interestOps());
            }
            this.f58793a.selector().wakeup();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // x70.f
    public ByteChannel g() {
        return this.f58794b;
    }

    @Override // x70.f
    public Object getAttribute(String str) {
        return this.f58795c.get(str);
    }

    @Override // x70.f
    public SocketAddress getLocalAddress() {
        ByteChannel byteChannel = this.f58794b;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).socket().getLocalSocketAddress();
        }
        return null;
    }

    @Override // x70.f
    public int getStatus() {
        return this.f58798f;
    }

    @Override // x70.f
    public synchronized void h(int i11) {
        try {
            if (this.f58798f == Integer.MAX_VALUE) {
                return;
            }
            if (this.f58796d != null) {
                this.f58799g = i11 | this.f58799g;
                this.f58796d.a(new k(this.f58793a, this.f58799g));
            } else {
                this.f58793a.interestOps(i11 | this.f58793a.interestOps());
            }
            this.f58793a.selector().wakeup();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // x70.f
    public synchronized void i(int i11) {
        try {
            if (this.f58798f == Integer.MAX_VALUE) {
                return;
            }
            if (this.f58796d != null) {
                this.f58799g = i11;
                this.f58796d.a(new k(this.f58793a, this.f58799g));
            } else {
                this.f58793a.interestOps(i11);
            }
            this.f58793a.selector().wakeup();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // x70.f
    public boolean isClosed() {
        return this.f58798f == Integer.MAX_VALUE;
    }

    @Override // x70.n
    public Socket k() {
        ByteChannel byteChannel = this.f58794b;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).socket();
        }
        return null;
    }

    @Override // x70.f
    public SocketAddress l() {
        ByteChannel byteChannel = this.f58794b;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).socket().getRemoteSocketAddress();
        }
        return null;
    }

    public long n() {
        return this.f58805m;
    }

    public long o() {
        return this.f58803k;
    }

    public long p() {
        return this.f58804l;
    }

    public long q() {
        return this.f58802j;
    }

    public void r() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f58803k = currentTimeMillis;
        this.f58805m = currentTimeMillis;
    }

    @Override // x70.f
    public Object removeAttribute(String str) {
        return this.f58795c.remove(str);
    }

    public void s() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f58804l = currentTimeMillis;
        this.f58805m = currentTimeMillis;
    }

    @Override // x70.f
    public void setSocketTimeout(int i11) {
        this.f58801i = i11;
        this.f58805m = System.currentTimeMillis();
    }

    @Override // x70.f
    public void shutdown() {
        close();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f58793a) {
            try {
                SocketAddress l11 = l();
                SocketAddress localAddress = getLocalAddress();
                if (l11 != null && localAddress != null) {
                    j(sb2, localAddress);
                    sb2.append("<->");
                    j(sb2, l11);
                }
                sb2.append('[');
                int i11 = this.f58798f;
                if (i11 == 0) {
                    sb2.append("ACTIVE");
                } else if (i11 == 1) {
                    sb2.append("CLOSING");
                } else if (i11 == Integer.MAX_VALUE) {
                    sb2.append("CLOSED");
                }
                sb2.append("][");
                if (this.f58793a.isValid()) {
                    m(sb2, this.f58796d != null ? this.f58799g : this.f58793a.interestOps());
                    sb2.append(':');
                    m(sb2, this.f58793a.readyOps());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        sb2.append(l50.b.f69930l);
        return new String(sb2);
    }

    @Override // x70.f
    public int x() {
        return this.f58801i;
    }

    public j(SelectionKey selectionKey, t tVar) {
        this(selectionKey, null, tVar);
    }
}
