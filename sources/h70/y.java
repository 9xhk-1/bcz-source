package h70;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class y implements x70.l {

    /* renamed from: a, reason: collision with root package name */
    public final SocketAddress f58834a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketAddress f58835b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f58836c;

    /* renamed from: d, reason: collision with root package name */
    public final x70.m f58837d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<a> f58838e;

    /* renamed from: f, reason: collision with root package name */
    public volatile SelectionKey f58839f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f58840g;

    /* renamed from: h, reason: collision with root package name */
    public volatile x70.f f58841h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile IOException f58842i = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        ACTIVE,
        SUCCESSFUL,
        TIMEDOUT,
        CANCELLED,
        FAILED
    }

    public y(SocketAddress socketAddress, SocketAddress socketAddress2, Object obj, x70.m mVar) {
        e80.a.j(socketAddress, "Remote address");
        this.f58834a = socketAddress;
        this.f58835b = socketAddress2;
        this.f58836c = obj;
        this.f58837d = mVar;
        this.f58838e = new AtomicReference<>(a.ACTIVE);
    }

    @Override // x70.l
    public void a() throws InterruptedException {
        if (e()) {
            return;
        }
        synchronized (this) {
            while (!e()) {
                try {
                    wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // x70.l
    public x70.f b() {
        x70.f fVar;
        synchronized (this) {
            fVar = this.f58841h;
        }
        return fVar;
    }

    @Override // x70.l
    public int c() {
        return this.f58840g;
    }

    @Override // x70.l
    public void cancel() {
        if (androidx.camera.view.q.a(this.f58838e, a.ACTIVE, a.CANCELLED)) {
            SelectionKey selectionKey = this.f58839f;
            if (selectionKey != null) {
                selectionKey.cancel();
                SelectableChannel channel = selectionKey.channel();
                if (channel.isOpen()) {
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                }
            }
            synchronized (this) {
                try {
                    x70.m mVar = this.f58837d;
                    if (mVar != null) {
                        mVar.d(this);
                    }
                    notifyAll();
                } finally {
                }
            }
        }
    }

    @Override // x70.l
    public void d(int i11) {
        if (this.f58840g != i11) {
            this.f58840g = i11;
            SelectionKey selectionKey = this.f58839f;
            if (selectionKey != null) {
                selectionKey.selector().wakeup();
            }
        }
    }

    @Override // x70.l
    public boolean e() {
        return this.f58838e.get().compareTo(a.ACTIVE) != 0;
    }

    @Override // x70.l
    public Object f() {
        return this.f58836c;
    }

    public void g(x70.f fVar) {
        e80.a.j(fVar, "Session");
        if (androidx.camera.view.q.a(this.f58838e, a.ACTIVE, a.SUCCESSFUL)) {
            synchronized (this) {
                try {
                    this.f58841h = fVar;
                    x70.m mVar = this.f58837d;
                    if (mVar != null) {
                        mVar.b(this);
                    }
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // x70.l
    public SocketAddress getLocalAddress() {
        return this.f58835b;
    }

    public void h(IOException iOException) {
        if (iOException != null && androidx.camera.view.q.a(this.f58838e, a.ACTIVE, a.FAILED)) {
            SelectionKey selectionKey = this.f58839f;
            if (selectionKey != null) {
                selectionKey.cancel();
                try {
                    selectionKey.channel().close();
                } catch (IOException unused) {
                }
            }
            synchronized (this) {
                try {
                    this.f58842i = iOException;
                    x70.m mVar = this.f58837d;
                    if (mVar != null) {
                        mVar.c(this);
                    }
                    notifyAll();
                } finally {
                }
            }
        }
    }

    public boolean i() {
        return this.f58838e.get().compareTo(a.SUCCESSFUL) > 0;
    }

    public void j(SelectionKey selectionKey) {
        this.f58839f = selectionKey;
        if (e()) {
            selectionKey.cancel();
            SelectableChannel channel = selectionKey.channel();
            if (channel.isOpen()) {
                try {
                    channel.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public void k() {
        if (androidx.camera.view.q.a(this.f58838e, a.ACTIVE, a.TIMEDOUT)) {
            SelectionKey selectionKey = this.f58839f;
            if (selectionKey != null) {
                selectionKey.cancel();
                SelectableChannel channel = selectionKey.channel();
                if (channel.isOpen()) {
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                }
            }
            synchronized (this) {
                try {
                    x70.m mVar = this.f58837d;
                    if (mVar != null) {
                        mVar.a(this);
                    }
                } finally {
                }
            }
        }
    }

    @Override // x70.l
    public SocketAddress l() {
        return this.f58834a;
    }

    @Override // x70.l
    public IOException m() {
        IOException iOException;
        synchronized (this) {
            iOException = this.f58842i;
        }
        return iOException;
    }
}
