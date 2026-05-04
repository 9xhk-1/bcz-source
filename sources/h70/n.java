package h70;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class n implements x70.g {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f58808a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f58809b;

    /* renamed from: c, reason: collision with root package name */
    public volatile SelectionKey f58810c;

    /* renamed from: d, reason: collision with root package name */
    public volatile SocketAddress f58811d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IOException f58812e;

    /* renamed from: f, reason: collision with root package name */
    public final m f58813f;

    public n(SocketAddress socketAddress, m mVar) {
        e80.a.j(socketAddress, "Address");
        this.f58811d = socketAddress;
        this.f58813f = mVar;
    }

    @Override // x70.g
    public void a() throws InterruptedException {
        if (this.f58808a) {
            return;
        }
        synchronized (this) {
            while (!this.f58808a) {
                try {
                    wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // x70.g
    public SocketAddress b() {
        return this.f58811d;
    }

    public void c() {
        if (this.f58808a) {
            return;
        }
        this.f58808a = true;
        this.f58809b = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // x70.g
    public void close() {
        if (this.f58809b) {
            return;
        }
        this.f58808a = true;
        this.f58809b = true;
        if (this.f58810c != null) {
            this.f58810c.cancel();
            try {
                this.f58810c.channel().close();
            } catch (IOException unused) {
            }
        }
        m mVar = this.f58813f;
        if (mVar != null) {
            mVar.a(this);
        }
        synchronized (this) {
            notifyAll();
        }
    }

    public void d(SocketAddress socketAddress) {
        e80.a.j(socketAddress, "Address");
        if (this.f58808a) {
            return;
        }
        this.f58808a = true;
        synchronized (this) {
            this.f58811d = socketAddress;
            notifyAll();
        }
    }

    public void e(IOException iOException) {
        if (iOException == null || this.f58808a) {
            return;
        }
        this.f58808a = true;
        synchronized (this) {
            this.f58812e = iOException;
            notifyAll();
        }
    }

    public boolean f() {
        return this.f58808a;
    }

    public void g(SelectionKey selectionKey) {
        this.f58810c = selectionKey;
    }

    @Override // x70.g
    public boolean isClosed() {
        if (this.f58809b) {
            return true;
        }
        return (this.f58810c == null || this.f58810c.isValid()) ? false : true;
    }

    @Override // x70.g
    public IOException m() {
        return this.f58812e;
    }

    public String toString() {
        return "[address=" + this.f58811d + ", key=" + this.f58810c + ", closed=" + this.f58809b + ", completed=" + this.f58808a + ", exception=" + this.f58812e + ", callback=" + this.f58813f + "]";
    }
}
