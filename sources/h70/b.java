package h70;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.nio.reactor.IOReactorStatus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b implements x70.d {

    /* renamed from: a, reason: collision with root package name */
    public volatile IOReactorStatus f58716a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f58717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58718c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58719d;

    /* renamed from: e, reason: collision with root package name */
    public final Selector f58720e;

    /* renamed from: f, reason: collision with root package name */
    public final Set<x70.f> f58721f;

    /* renamed from: g, reason: collision with root package name */
    public final Queue<k> f58722g;

    /* renamed from: h, reason: collision with root package name */
    public final Queue<x70.f> f58723h;

    /* renamed from: i, reason: collision with root package name */
    public final Queue<e> f58724i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t {
        public a() {
        }

        @Override // h70.t
        public void a(x70.f fVar) {
            b.this.A(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h70.b$b, reason: collision with other inner class name */
    public class C0664b implements l {
        public C0664b() {
        }

        @Override // h70.l
        public void a(k kVar) {
            b.this.B(kVar);
        }
    }

    public b(long j11) throws IOReactorException {
        this(j11, false);
    }

    public void A(x70.f fVar) {
        if (fVar != null) {
            this.f58723h.add(fVar);
        }
    }

    public final boolean B(k kVar) {
        e80.b.a(this.f58719d, "Interest ops queueing not enabled");
        if (kVar == null) {
            return false;
        }
        this.f58722g.add(kVar);
        return true;
    }

    public abstract void C(SelectionKey selectionKey);

    public void G(SelectionKey selectionKey, long j11) {
        int x11;
        j jVar = (j) selectionKey.attachment();
        if (jVar == null || (x11 = jVar.x()) <= 0 || jVar.n() + x11 >= j11) {
            return;
        }
        try {
            F(jVar);
        } catch (CancelledKeyException unused) {
            jVar.close();
            selectionKey.attach(null);
        }
    }

    public abstract void H(Set<SelectionKey> set);

    public abstract void I(SelectionKey selectionKey);

    public abstract void e(SelectionKey selectionKey);

    public void g(e eVar) {
        e80.a.j(eVar, "Channel entry");
        this.f58724i.add(eVar);
        this.f58720e.wakeup();
    }

    @Override // x70.d
    public IOReactorStatus getStatus() {
        return this.f58716a;
    }

    public void h(long j11) throws InterruptedException {
        synchronized (this.f58717b) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + j11;
                long j12 = j11;
                while (this.f58716a != IOReactorStatus.SHUT_DOWN) {
                    this.f58717b.wait(j12);
                    if (j11 > 0) {
                        j12 = currentTimeMillis - System.currentTimeMillis();
                        if (j12 <= 0) {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // x70.d
    public void i(long j11) throws IOReactorException {
        if (this.f58716a != IOReactorStatus.INACTIVE) {
            t();
            try {
                h(j11);
            } catch (InterruptedException unused) {
            }
        }
        if (this.f58716a != IOReactorStatus.SHUT_DOWN) {
            u();
        }
    }

    public void k() throws IOReactorException {
        try {
            Iterator<SelectionKey> it = this.f58720e.keys().iterator();
            while (it.hasNext()) {
                x70.f s11 = s(it.next());
                if (s11 != null) {
                    s11.close();
                }
            }
            this.f58720e.close();
        } catch (IOException unused) {
        }
    }

    public void m() throws IOReactorException {
        while (true) {
            e poll = this.f58724i.poll();
            if (poll == null) {
                return;
            }
            y c11 = poll.c();
            if (c11 != null) {
                c11.cancel();
            }
            try {
                poll.b().close();
            } catch (IOException unused) {
            }
        }
    }

    public void n() {
        synchronized (this.f58721f) {
            try {
                Iterator<x70.f> it = this.f58721f.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void o(SelectionKey selectionKey);

    public void q() throws InterruptedIOException, IOReactorException {
        this.f58716a = IOReactorStatus.ACTIVE;
        while (true) {
            try {
                try {
                    int select = this.f58720e.select(this.f58718c);
                    if (this.f58716a == IOReactorStatus.SHUT_DOWN) {
                        break;
                    }
                    if (this.f58716a == IOReactorStatus.SHUTTING_DOWN) {
                        n();
                        m();
                    }
                    if (select > 0) {
                        x(this.f58720e.selectedKeys());
                    }
                    H(this.f58720e.keys());
                    v();
                    IOReactorStatus iOReactorStatus = this.f58716a;
                    IOReactorStatus iOReactorStatus2 = IOReactorStatus.ACTIVE;
                    if (iOReactorStatus == iOReactorStatus2) {
                        y();
                    }
                    if (this.f58716a.compareTo(iOReactorStatus2) > 0 && this.f58721f.isEmpty()) {
                        break;
                    } else if (this.f58719d) {
                        z();
                    }
                } catch (InterruptedIOException e11) {
                    throw e11;
                } catch (IOException e12) {
                    throw new IOReactorException("Unexpected selector failure", (Exception) e12);
                }
            } catch (ClosedSelectorException unused) {
                u();
                synchronized (this.f58717b) {
                    this.f58717b.notifyAll();
                    return;
                }
            } catch (Throwable th2) {
                u();
                synchronized (this.f58717b) {
                    this.f58717b.notifyAll();
                    throw th2;
                }
            }
        }
        u();
        synchronized (this.f58717b) {
            this.f58717b.notifyAll();
        }
    }

    public boolean r() {
        return this.f58719d;
    }

    public x70.f s(SelectionKey selectionKey) {
        return (x70.f) selectionKey.attachment();
    }

    @Override // x70.d
    public void shutdown() throws IOReactorException {
        i(1000L);
    }

    public void t() {
        synchronized (this.f58717b) {
            try {
                if (this.f58716a != IOReactorStatus.ACTIVE) {
                    return;
                }
                this.f58716a = IOReactorStatus.SHUTTING_DOWN;
                this.f58720e.wakeup();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u() throws IOReactorException {
        synchronized (this.f58717b) {
            try {
                IOReactorStatus iOReactorStatus = this.f58716a;
                IOReactorStatus iOReactorStatus2 = IOReactorStatus.SHUT_DOWN;
                if (iOReactorStatus == iOReactorStatus2) {
                    return;
                }
                this.f58716a = iOReactorStatus2;
                m();
                k();
                v();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v() {
        while (true) {
            x70.f poll = this.f58723h.poll();
            if (poll == null) {
                return;
            }
            if (this.f58721f.remove(poll)) {
                try {
                    D(poll);
                } catch (CancelledKeyException unused) {
                }
            }
        }
    }

    public void w(SelectionKey selectionKey) {
        j jVar = (j) selectionKey.attachment();
        try {
            if (selectionKey.isAcceptable()) {
                e(selectionKey);
            }
            if (selectionKey.isConnectable()) {
                o(selectionKey);
            }
            if (selectionKey.isReadable()) {
                jVar.r();
                C(selectionKey);
            }
            if (selectionKey.isWritable()) {
                jVar.s();
                I(selectionKey);
            }
        } catch (CancelledKeyException unused) {
            A(jVar);
            selectionKey.attach(null);
        }
    }

    public final void x(Set<SelectionKey> set) {
        Iterator<SelectionKey> it = set.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        set.clear();
    }

    public final void y() throws IOReactorException {
        while (true) {
            e poll = this.f58724i.poll();
            if (poll == null) {
                return;
            }
            try {
                SocketChannel b11 = poll.b();
                int i11 = 0;
                b11.configureBlocking(false);
                SelectionKey register = b11.register(this.f58720e, 1);
                try {
                    x70.f jVar = new j(register, this.f58719d ? new C0664b() : null, new a());
                    try {
                        i11 = b11.socket().getSoTimeout();
                    } catch (IOException unused) {
                    }
                    jVar.b(x70.f.f97672c1, poll.a());
                    jVar.setSocketTimeout(i11);
                    try {
                        this.f58721f.add(jVar);
                        register.attach(jVar);
                        y c11 = poll.c();
                        if (c11 != null) {
                            if (!c11.i()) {
                                c11.g(jVar);
                            }
                            if (!c11.i() && !jVar.isClosed()) {
                                E(register, jVar);
                            }
                            if (c11.i()) {
                                throw new CancelledKeyException();
                            }
                        } else {
                            E(register, jVar);
                        }
                    } catch (CancelledKeyException unused2) {
                        jVar.close();
                        register.attach(null);
                    }
                } catch (CancelledKeyException unused3) {
                }
            } catch (ClosedChannelException e11) {
                y c12 = poll.c();
                if (c12 != null) {
                    c12.h(e11);
                    return;
                }
                return;
            } catch (IOException e12) {
                throw new IOReactorException("Failure registering channel with the selector", (Exception) e12);
            }
        }
    }

    public final void z() {
        if (!this.f58719d) {
            return;
        }
        while (true) {
            k poll = this.f58722g.poll();
            if (poll == null) {
                return;
            }
            SelectionKey b11 = poll.b();
            int a11 = poll.a();
            if (b11.isValid()) {
                try {
                    b11.interestOps(a11);
                } catch (CancelledKeyException unused) {
                }
            }
        }
    }

    public b(long j11, boolean z11) throws IOReactorException {
        e80.a.l(j11, "Select timeout");
        this.f58718c = j11;
        this.f58719d = z11;
        this.f58721f = Collections.synchronizedSet(new HashSet());
        this.f58722g = new ConcurrentLinkedQueue();
        this.f58723h = new ConcurrentLinkedQueue();
        this.f58724i = new ConcurrentLinkedQueue();
        try {
            this.f58720e = Selector.open();
            this.f58717b = new Object();
            this.f58716a = IOReactorStatus.INACTIVE;
        } catch (IOException e11) {
            throw new IOReactorException("Failure opening selector", (Exception) e11);
        }
    }

    public void D(x70.f fVar) {
    }

    public void F(x70.f fVar) {
    }

    public void E(SelectionKey selectionKey, x70.f fVar) {
    }
}
