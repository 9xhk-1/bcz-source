package h70;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.channels.Channel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.nio.reactor.IOReactorStatus;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c implements x70.d {

    /* renamed from: a, reason: collision with root package name */
    public volatile IOReactorStatus f58727a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final HttpParams f58728b;

    /* renamed from: c, reason: collision with root package name */
    public final i f58729c;

    /* renamed from: d, reason: collision with root package name */
    public final Selector f58730d;

    /* renamed from: e, reason: collision with root package name */
    public final long f58731e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58732f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58733g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadFactory f58734h;

    /* renamed from: i, reason: collision with root package name */
    public final d[] f58735i;

    /* renamed from: j, reason: collision with root package name */
    public final b[] f58736j;

    /* renamed from: k, reason: collision with root package name */
    public final Thread[] f58737k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f58738l;

    /* renamed from: m, reason: collision with root package name */
    public x70.e f58739m;

    /* renamed from: n, reason: collision with root package name */
    public List<h> f58740n;

    /* renamed from: o, reason: collision with root package name */
    public int f58741o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicLong f58742a = new AtomicLong(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "I/O dispatcher " + f58742a.getAndIncrement());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f58743a;

        /* renamed from: b, reason: collision with root package name */
        public final x70.c f58744b;

        /* renamed from: c, reason: collision with root package name */
        public volatile Throwable f58745c;

        public b(d dVar, x70.c cVar) {
            this.f58743a = dVar;
            this.f58744b = cVar;
        }

        public Throwable a() {
            return this.f58745c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f58743a.b(this.f58744b);
            } catch (Error e11) {
                this.f58745c = e11;
                throw e11;
            } catch (Exception e12) {
                this.f58745c = e12;
            }
        }
    }

    public c(i iVar, ThreadFactory threadFactory) throws IOReactorException {
        this.f58741o = 0;
        iVar = iVar == null ? i.f58765n : iVar;
        this.f58729c = iVar;
        this.f58728b = new BasicHttpParams();
        try {
            this.f58730d = Selector.open();
            this.f58731e = iVar.h();
            this.f58732f = iVar.n();
            this.f58738l = new Object();
            if (threadFactory != null) {
                this.f58734h = threadFactory;
            } else {
                this.f58734h = new a();
            }
            this.f58740n = new ArrayList();
            int f11 = iVar.f();
            this.f58733g = f11;
            this.f58735i = new d[f11];
            this.f58736j = new b[f11];
            this.f58737k = new Thread[f11];
            this.f58727a = IOReactorStatus.INACTIVE;
        } catch (IOException e11) {
            throw new IOReactorException("Failure opening selector", (Exception) e11);
        }
    }

    public static void m(Channel channel) {
        try {
            channel.close();
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static i n(int i11, HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return i.c().i(httpParams.getLongParameter(u70.a.f91883b, 1000L)).j(httpParams.getLongParameter(u70.a.f91884c, 500L)).f(httpParams.getBooleanParameter(u70.a.f91883b, false)).g(i11).o(httpParams.getIntParameter(a80.b.f2291a, 0)).d(httpParams.getIntParameter(a80.b.f2296f, 0)).o(httpParams.getIntParameter(a80.b.f2291a, 0)).n(httpParams.getBooleanParameter(a80.b.f2295e, false)).l(httpParams.getBooleanParameter(a80.b.f2301k, false)).m(httpParams.getIntParameter(a80.b.f2294d, -1)).p(httpParams.getBooleanParameter(a80.b.f2292b, true)).a();
    }

    @Override // x70.d
    public void b(x70.c cVar) throws InterruptedIOException, IOReactorException {
        e80.a.j(cVar, "Event dispatcher");
        synchronized (this.f58738l) {
            try {
                if (this.f58727a.compareTo(IOReactorStatus.SHUTDOWN_REQUEST) >= 0) {
                    this.f58727a = IOReactorStatus.SHUT_DOWN;
                    this.f58738l.notifyAll();
                    return;
                }
                e80.b.b(this.f58727a.compareTo(IOReactorStatus.INACTIVE) == 0, "Illegal state %s", this.f58727a);
                this.f58727a = IOReactorStatus.ACTIVE;
                for (int i11 = 0; i11 < this.f58735i.length; i11++) {
                    d dVar = new d(this.f58731e, this.f58732f);
                    dVar.K(this.f58739m);
                    this.f58735i[i11] = dVar;
                }
                for (int i12 = 0; i12 < this.f58733g; i12++) {
                    this.f58736j[i12] = new b(this.f58735i[i12], cVar);
                    this.f58737k[i12] = this.f58734h.newThread(this.f58736j[i12]);
                }
                for (int i13 = 0; i13 < this.f58733g; i13++) {
                    try {
                        try {
                            try {
                                if (this.f58727a != IOReactorStatus.ACTIVE) {
                                    o();
                                    synchronized (this.f58738l) {
                                        this.f58727a = IOReactorStatus.SHUT_DOWN;
                                        this.f58738l.notifyAll();
                                    }
                                    return;
                                }
                                this.f58737k[i13].start();
                            } catch (ClosedSelectorException e11) {
                                f(e11);
                                o();
                                synchronized (this.f58738l) {
                                    this.f58727a = IOReactorStatus.SHUT_DOWN;
                                    this.f58738l.notifyAll();
                                    return;
                                }
                            }
                        } catch (IOReactorException e12) {
                            if (e12.getCause() != null) {
                                f(e12.getCause());
                            }
                            throw e12;
                        }
                    } catch (Throwable th2) {
                        o();
                        synchronized (this.f58738l) {
                            this.f58727a = IOReactorStatus.SHUT_DOWN;
                            this.f58738l.notifyAll();
                            throw th2;
                        }
                    }
                }
                do {
                    try {
                        int select = this.f58730d.select(this.f58731e);
                        if (this.f58727a.compareTo(IOReactorStatus.ACTIVE) == 0) {
                            s(select);
                        }
                        for (int i14 = 0; i14 < this.f58733g; i14++) {
                            Throwable a11 = this.f58736j[i14].a();
                            if (a11 != null) {
                                throw new IOReactorException("I/O dispatch worker terminated abnormally", a11);
                            }
                        }
                    } catch (InterruptedIOException e13) {
                        throw e13;
                    } catch (IOException e14) {
                        throw new IOReactorException("Unexpected selector failure", (Exception) e14);
                    }
                } while (this.f58727a.compareTo(IOReactorStatus.ACTIVE) <= 0);
                o();
                synchronized (this.f58738l) {
                    this.f58727a = IOReactorStatus.SHUT_DOWN;
                    this.f58738l.notifyAll();
                }
            } finally {
            }
        }
    }

    public void e(e eVar) {
        int i11 = this.f58741o;
        this.f58741o = i11 + 1;
        this.f58735i[Math.abs(i11 % this.f58733g)].g(eVar);
    }

    public void f(Throwable th2) {
        g(th2, null);
    }

    public synchronized void g(Throwable th2, Date date) {
        if (th2 == null) {
            return;
        }
        synchronized (this.f58740n) {
            List<h> list = this.f58740n;
            if (date == null) {
                date = new Date();
            }
            list.add(new h(th2, date));
        }
    }

    @Override // x70.d
    public IOReactorStatus getStatus() {
        return this.f58727a;
    }

    public void h(long j11) throws InterruptedException {
        synchronized (this.f58738l) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + j11;
                long j12 = j11;
                while (this.f58727a != IOReactorStatus.SHUT_DOWN) {
                    this.f58738l.wait(j12);
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
    public void i(long j11) throws IOException {
        synchronized (this.f58738l) {
            try {
                if (this.f58727a.compareTo(IOReactorStatus.ACTIVE) > 0) {
                    return;
                }
                if (this.f58727a.compareTo(IOReactorStatus.INACTIVE) == 0) {
                    this.f58727a = IOReactorStatus.SHUT_DOWN;
                    k();
                    this.f58730d.close();
                } else {
                    this.f58727a = IOReactorStatus.SHUTDOWN_REQUEST;
                    this.f58730d.wakeup();
                    try {
                        h(j11);
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void k() throws IOReactorException;

    public void o() throws InterruptedIOException {
        synchronized (this.f58738l) {
            try {
                IOReactorStatus iOReactorStatus = this.f58727a;
                IOReactorStatus iOReactorStatus2 = IOReactorStatus.SHUTTING_DOWN;
                if (iOReactorStatus.compareTo(iOReactorStatus2) >= 0) {
                    return;
                }
                this.f58727a = iOReactorStatus2;
                try {
                    k();
                } catch (IOReactorException e11) {
                    if (e11.getCause() != null) {
                        f(e11.getCause());
                    }
                }
                this.f58730d.wakeup();
                if (this.f58730d.isOpen()) {
                    Iterator<SelectionKey> it = this.f58730d.keys().iterator();
                    while (it.hasNext()) {
                        try {
                            SelectableChannel channel = it.next().channel();
                            if (channel != null) {
                                channel.close();
                            }
                        } catch (IOException e12) {
                            f(e12);
                        }
                    }
                    try {
                        this.f58730d.close();
                    } catch (IOException e13) {
                        f(e13);
                    }
                }
                for (int i11 = 0; i11 < this.f58733g; i11++) {
                    this.f58735i[i11].t();
                }
                long i12 = this.f58729c.i();
                for (int i13 = 0; i13 < this.f58733g; i13++) {
                    try {
                        d dVar = this.f58735i[i13];
                        if (dVar.getStatus() != IOReactorStatus.INACTIVE) {
                            dVar.h(i12);
                        }
                        if (dVar.getStatus() != IOReactorStatus.SHUT_DOWN) {
                            try {
                                dVar.u();
                            } catch (IOReactorException e14) {
                                if (e14.getCause() != null) {
                                    f(e14.getCause());
                                }
                            }
                        }
                    } catch (InterruptedException e15) {
                        throw new InterruptedIOException(e15.getMessage());
                    }
                }
                for (int i14 = 0; i14 < this.f58733g; i14++) {
                    Thread thread = this.f58737k[i14];
                    if (thread != null) {
                        thread.join(i12);
                    }
                }
            } finally {
            }
        }
    }

    public List<h> q() {
        ArrayList arrayList;
        synchronized (this.f58740n) {
            arrayList = new ArrayList(this.f58740n);
        }
        return arrayList;
    }

    public void r(Socket socket) throws IOException {
        socket.setTcpNoDelay(this.f58729c.q());
        socket.setKeepAlive(this.f58729c.o());
        if (this.f58729c.m() > 0) {
            socket.setSoTimeout(this.f58729c.m());
        }
        if (this.f58729c.j() > 0) {
            socket.setSendBufferSize(this.f58729c.j());
        }
        if (this.f58729c.g() > 0) {
            socket.setReceiveBufferSize(this.f58729c.g());
        }
        int l11 = this.f58729c.l();
        if (l11 >= 0) {
            socket.setSoLinger(true, l11);
        }
    }

    public abstract void s(int i11) throws IOReactorException;

    @Override // x70.d
    public void shutdown() throws IOException {
        i(2000L);
    }

    public SelectionKey t(SelectableChannel selectableChannel, int i11) throws ClosedChannelException {
        return selectableChannel.register(this.f58730d, i11);
    }

    public void u(x70.e eVar) {
        this.f58739m = eVar;
    }

    public c() throws IOReactorException {
        this(null, null);
    }

    @Deprecated
    public c(int i11, ThreadFactory threadFactory, HttpParams httpParams) throws IOReactorException {
        this(n(i11, httpParams), threadFactory);
    }
}
