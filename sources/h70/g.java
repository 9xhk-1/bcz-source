package h70;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadFactory;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.nio.reactor.IOReactorStatus;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends c implements x70.h {

    /* renamed from: p, reason: collision with root package name */
    public final Queue<n> f58758p;

    /* renamed from: q, reason: collision with root package name */
    public final Set<n> f58759q;

    /* renamed from: r, reason: collision with root package name */
    public final Set<SocketAddress> f58760r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f58761s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements m {
        public a() {
        }

        @Override // h70.m
        public void a(x70.g gVar) {
            g.this.f58759q.remove(gVar);
        }
    }

    public g(i iVar, ThreadFactory threadFactory) throws IOReactorException {
        super(iVar, threadFactory);
        this.f58758p = new ConcurrentLinkedQueue();
        this.f58759q = Collections.synchronizedSet(new HashSet());
        this.f58760r = new HashSet();
    }

    private void x(SelectionKey selectionKey) throws IOReactorException {
        SocketChannel socketChannel;
        try {
            if (selectionKey.isAcceptable()) {
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
                while (true) {
                    try {
                        socketChannel = serverSocketChannel.accept();
                    } catch (IOException e11) {
                        if (this.f58739m == null || !this.f58739m.b(e11)) {
                            throw new IOReactorException("Failure accepting connection", (Exception) e11);
                        }
                        socketChannel = null;
                    }
                    if (socketChannel == null) {
                        return;
                    }
                    try {
                        r(socketChannel.socket());
                    } catch (IOException e12) {
                        x70.e eVar = this.f58739m;
                        if (eVar == null || !eVar.b(e12)) {
                            throw new IOReactorException("Failure initalizing socket", (Exception) e12);
                        }
                    }
                    e(new e(socketChannel));
                }
                throw new IOReactorException("Failure accepting connection", (Exception) e11);
            }
        } catch (CancelledKeyException unused) {
            this.f58759q.remove((x70.g) selectionKey.attachment());
            selectionKey.attach(null);
        }
    }

    private void y() throws IOReactorException {
        while (true) {
            n poll = this.f58758p.poll();
            if (poll == null) {
                return;
            }
            SocketAddress b11 = poll.b();
            try {
                ServerSocketChannel open = ServerSocketChannel.open();
                try {
                    ServerSocket socket = open.socket();
                    socket.setReuseAddress(this.f58729c.p());
                    if (this.f58729c.m() > 0) {
                        socket.setSoTimeout(this.f58729c.m());
                    }
                    if (this.f58729c.g() > 0) {
                        socket.setReceiveBufferSize(this.f58729c.g());
                    }
                    open.configureBlocking(false);
                    socket.bind(b11, this.f58729c.d());
                    try {
                        SelectionKey register = open.register(this.f58730d, 16);
                        register.attach(poll);
                        poll.g(register);
                        this.f58759q.add(poll);
                        poll.d(open.socket().getLocalSocketAddress());
                    } catch (IOException e11) {
                        c.m(open);
                        throw new IOReactorException("Failure registering channel with the selector", (Exception) e11);
                    }
                } catch (IOException e12) {
                    c.m(open);
                    poll.e(e12);
                    x70.e eVar = this.f58739m;
                    if (eVar == null || !eVar.b(e12)) {
                        throw new IOReactorException("Failure binding socket to address " + b11, (Exception) e12);
                    }
                    return;
                }
            } catch (IOException e13) {
                throw new IOReactorException("Failure opening server socket", (Exception) e13);
            }
        }
    }

    @Override // x70.h
    public void a() throws IOException {
        if (this.f58761s) {
            this.f58761s = false;
            Iterator<SocketAddress> it = this.f58760r.iterator();
            while (it.hasNext()) {
                this.f58758p.add(w(it.next()));
            }
            this.f58760r.clear();
            this.f58730d.wakeup();
        }
    }

    @Override // x70.h
    public x70.g c(SocketAddress socketAddress) {
        e80.b.a(this.f58727a.compareTo(IOReactorStatus.ACTIVE) <= 0, "I/O reactor has been shut down");
        n w11 = w(socketAddress);
        this.f58758p.add(w11);
        this.f58730d.wakeup();
        return w11;
    }

    @Override // x70.h
    public Set<x70.g> d() {
        HashSet hashSet = new HashSet();
        synchronized (this.f58759q) {
            try {
                Iterator<n> it = this.f58759q.iterator();
                while (it.hasNext()) {
                    n next = it.next();
                    if (next.isClosed()) {
                        it.remove();
                    } else {
                        hashSet.add(next);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    @Override // h70.c
    public void k() throws IOReactorException {
        while (true) {
            n poll = this.f58758p.poll();
            if (poll == null) {
                return;
            } else {
                poll.c();
            }
        }
    }

    @Override // x70.h
    public void pause() throws IOException {
        if (this.f58761s) {
            return;
        }
        this.f58761s = true;
        synchronized (this.f58759q) {
            try {
                for (n nVar : this.f58759q) {
                    if (!nVar.isClosed()) {
                        nVar.close();
                        this.f58760r.add(nVar.b());
                    }
                }
                this.f58759q.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h70.c
    public void s(int i11) throws IOReactorException {
        if (!this.f58761s) {
            y();
        }
        if (i11 > 0) {
            Set<SelectionKey> selectedKeys = this.f58730d.selectedKeys();
            Iterator<SelectionKey> it = selectedKeys.iterator();
            while (it.hasNext()) {
                x(it.next());
            }
            selectedKeys.clear();
        }
    }

    public final n w(SocketAddress socketAddress) {
        return new n(socketAddress, new a());
    }

    public g(i iVar) throws IOReactorException {
        this(iVar, (ThreadFactory) null);
    }

    public g() throws IOReactorException {
        this((i) null, (ThreadFactory) null);
    }

    @Deprecated
    public g(int i11, ThreadFactory threadFactory, HttpParams httpParams) throws IOReactorException {
        this(c.n(i11, httpParams), threadFactory);
    }

    @Deprecated
    public g(int i11, HttpParams httpParams) throws IOReactorException {
        this(c.n(i11, httpParams), (ThreadFactory) null);
    }
}
