package h70;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
public class f extends c implements x70.a {

    /* renamed from: p, reason: collision with root package name */
    public final Queue<y> f58753p;

    /* renamed from: q, reason: collision with root package name */
    public long f58754q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PrivilegedExceptionAction<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SocketChannel f58755a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SocketAddress f58756b;

        public a(SocketChannel socketChannel, SocketAddress socketAddress) {
            this.f58755a = socketChannel;
            this.f58756b = socketAddress;
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean run() throws IOException {
            return Boolean.valueOf(this.f58755a.connect(this.f58756b));
        }
    }

    public f(i iVar, ThreadFactory threadFactory) throws IOReactorException {
        super(iVar, threadFactory);
        this.f58753p = new ConcurrentLinkedQueue();
        this.f58754q = System.currentTimeMillis();
    }

    private void v(SelectionKey selectionKey) {
        y b11;
        try {
            if (selectionKey.isConnectable()) {
                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                y b12 = ((x) selectionKey.attachment()).b();
                try {
                    socketChannel.finishConnect();
                } catch (IOException e11) {
                    b12.h(e11);
                }
                selectionKey.cancel();
                selectionKey.attach(null);
                if (!b12.e()) {
                    e(new e(socketChannel, b12));
                } else {
                    try {
                        socketChannel.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (CancelledKeyException unused2) {
            x xVar = (x) selectionKey.attachment();
            selectionKey.attach(null);
            if (xVar == null || (b11 = xVar.b()) == null) {
                return;
            }
            b11.cancel();
        }
    }

    @Override // x70.a
    public x70.l j(SocketAddress socketAddress, SocketAddress socketAddress2, Object obj, x70.m mVar) {
        e80.b.a(this.f58727a.compareTo(IOReactorStatus.ACTIVE) <= 0, "I/O reactor has been shut down");
        y yVar = new y(socketAddress, socketAddress2, obj, mVar);
        yVar.d(this.f58729c.e());
        this.f58753p.add(yVar);
        this.f58730d.wakeup();
        return yVar;
    }

    @Override // h70.c
    public void k() throws IOReactorException {
        while (true) {
            y poll = this.f58753p.poll();
            if (poll == null) {
                return;
            } else {
                poll.cancel();
            }
        }
    }

    @Override // h70.c
    public void s(int i11) throws IOReactorException {
        w();
        if (i11 > 0) {
            Set<SelectionKey> selectedKeys = this.f58730d.selectedKeys();
            Iterator<SelectionKey> it = selectedKeys.iterator();
            while (it.hasNext()) {
                v(it.next());
            }
            selectedKeys.clear();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f58754q >= this.f58731e) {
            this.f58754q = currentTimeMillis;
            x(this.f58730d.keys());
        }
    }

    public final void w() throws IOReactorException {
        while (true) {
            y poll = this.f58753p.poll();
            if (poll == null) {
                return;
            }
            if (!poll.e()) {
                try {
                    SocketChannel open = SocketChannel.open();
                    try {
                        y(poll.getLocalAddress());
                        y(poll.l());
                        open.configureBlocking(false);
                        r(open.socket());
                        if (poll.getLocalAddress() != null) {
                            Socket socket = open.socket();
                            socket.setReuseAddress(this.f58729c.p());
                            socket.bind(poll.getLocalAddress());
                        }
                        try {
                            if (((Boolean) AccessController.doPrivileged(new a(open, poll.l()))).booleanValue()) {
                                e(new e(open, poll));
                            } else {
                                try {
                                    poll.j(open.register(this.f58730d, 8, new x(poll)));
                                } catch (IOException e11) {
                                    c.m(open);
                                    throw new IOReactorException("Failure registering channel with the selector", (Exception) e11);
                                }
                            }
                        } catch (PrivilegedActionException e12) {
                            e80.b.a(e12.getCause() instanceof IOException, "method contract violation only checked exceptions are wrapped: " + e12.getCause());
                            throw ((IOException) e12.getCause());
                        }
                    } catch (IOException e13) {
                        c.m(open);
                        poll.h(e13);
                        return;
                    } catch (SecurityException e14) {
                        c.m(open);
                        poll.h(new IOException(e14));
                        return;
                    }
                } catch (IOException e15) {
                    poll.h(e15);
                    return;
                }
            }
        }
    }

    public final void x(Set<SelectionKey> set) {
        x xVar;
        y b11;
        int c11;
        long currentTimeMillis = System.currentTimeMillis();
        for (SelectionKey selectionKey : set) {
            if ((selectionKey.attachment() instanceof x) && (c11 = (b11 = (xVar = (x) selectionKey.attachment()).b()).c()) > 0 && xVar.a() + c11 < currentTimeMillis) {
                b11.k();
            }
        }
    }

    public final void y(SocketAddress socketAddress) throws UnknownHostException {
        if (socketAddress != null && (socketAddress instanceof InetSocketAddress)) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            if (inetSocketAddress.isUnresolved()) {
                throw new UnknownHostException(inetSocketAddress.getHostName());
            }
        }
    }

    public f(i iVar) throws IOReactorException {
        this(iVar, (ThreadFactory) null);
    }

    public f() throws IOReactorException {
        this((i) null, (ThreadFactory) null);
    }

    @Deprecated
    public f(int i11, ThreadFactory threadFactory, HttpParams httpParams) throws IOReactorException {
        this(c.n(i11, httpParams), threadFactory);
    }

    @Deprecated
    public f(int i11, HttpParams httpParams) throws IOReactorException {
        this(c.n(i11, httpParams), (ThreadFactory) null);
    }
}
