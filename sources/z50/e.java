package z50;

import a00.m0;
import androidx.core.app.NotificationCompat;
import e60.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import okhttp3.l;
import okhttp3.n;
import t50.m;
import t50.q;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
/* loaded from: classes8.dex */
public final class e implements t50.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q f100963a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f100964b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100965c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f100966d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final m f100967e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c f100968f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AtomicBoolean f100969g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public Object f100970h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public d f100971i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public f f100972j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f100973k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public z50.c f100974l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100975m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f100976n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f100977o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f100978p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    public volatile z50.c f100979q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    public volatile f f100980r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final t50.c f100981a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public volatile AtomicInteger f100982b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f100983c;

        public a(@k e eVar, t50.c responseCallback) {
            g0.p(responseCallback, "responseCallback");
            this.f100983c = eVar;
            this.f100981a = responseCallback;
            this.f100982b = new AtomicInteger(0);
        }

        public final void a(@k ExecutorService executorService) {
            g0.p(executorService, "executorService");
            t50.k Y = this.f100983c.j().Y();
            if (u50.f.f91853h && Thread.holdsLock(Y)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + Y);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e11) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e11);
                    this.f100983c.v(interruptedIOException);
                    this.f100981a.d(this.f100983c, interruptedIOException);
                    this.f100983c.j().Y().h(this);
                }
            } catch (Throwable th2) {
                this.f100983c.j().Y().h(this);
                throw th2;
            }
        }

        @k
        public final e b() {
            return this.f100983c;
        }

        @k
        public final AtomicInteger c() {
            return this.f100982b;
        }

        @k
        public final String d() {
            return this.f100983c.q().q().F();
        }

        @k
        public final l e() {
            return this.f100983c.q();
        }

        public final void f(@k a other) {
            g0.p(other, "other");
            this.f100982b = other.f100982b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            Throwable th2;
            IOException e11;
            q j11;
            String str = "OkHttp " + this.f100983c.w();
            e eVar = this.f100983c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                eVar.f100968f.x();
                try {
                    try {
                        z11 = true;
                        try {
                            this.f100981a.c(eVar, eVar.s());
                            j11 = eVar.j();
                        } catch (IOException e12) {
                            e11 = e12;
                            if (z11) {
                                j.f49490a.g().m("Callback failure for " + eVar.F(), 4, e11);
                            } else {
                                this.f100981a.d(eVar, e11);
                            }
                            j11 = eVar.j();
                            j11.Y().h(this);
                        } catch (Throwable th3) {
                            th2 = th3;
                            eVar.cancel();
                            if (!z11) {
                                IOException iOException = new IOException("canceled due to " + th2);
                                r.a(iOException, th2);
                                this.f100981a.d(eVar, iOException);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        eVar.j().Y().h(this);
                        throw th4;
                    }
                } catch (IOException e13) {
                    z11 = false;
                    e11 = e13;
                } catch (Throwable th5) {
                    z11 = false;
                    th2 = th5;
                }
                j11.Y().h(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final Object f100984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k e referent, @m80.l Object obj) {
            super(referent);
            g0.p(referent, "referent");
            this.f100984a = obj;
        }

        @m80.l
        public final Object a() {
            return this.f100984a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends l60.i {
        public c() {
        }

        @Override // l60.i
        public void G() {
            e.this.cancel();
        }
    }

    public e(@k q client, @k l originalRequest, boolean z11) {
        g0.p(client, "client");
        g0.p(originalRequest, "originalRequest");
        this.f100963a = client;
        this.f100964b = originalRequest;
        this.f100965c = z11;
        this.f100966d = client.T().c();
        this.f100967e = client.a0().a(this);
        c cVar = new c();
        cVar.k(client.O(), TimeUnit.MILLISECONDS);
        this.f100968f = cVar;
        this.f100969g = new AtomicBoolean();
        this.f100977o = true;
    }

    @Override // t50.b
    @k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public l60.i D() {
        return this.f100968f;
    }

    public final void B() {
        if (this.f100973k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f100973k = true;
        this.f100968f.y();
    }

    public final <E extends IOException> E E(E e11) {
        if (this.f100973k || !this.f100968f.y()) {
            return e11;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(com.alipay.sdk.m.m.a.f10784h0);
        if (e11 != null) {
            interruptedIOException.initCause(e11);
        }
        return interruptedIOException;
    }

    public final String F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f100965c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(w());
        return sb2.toString();
    }

    @Override // t50.b
    public void U(@k t50.c responseCallback) {
        g0.p(responseCallback, "responseCallback");
        if (!this.f100969g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        e();
        this.f100963a.Y().c(new a(this, responseCallback));
    }

    public final void c(@k f connection) {
        g0.p(connection, "connection");
        if (!u50.f.f91853h || Thread.holdsLock(connection)) {
            if (this.f100972j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f100972j = connection;
            connection.s().add(new b(this, this.f100970h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // t50.b
    public void cancel() {
        if (this.f100978p) {
            return;
        }
        this.f100978p = true;
        z50.c cVar = this.f100979q;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f100980r;
        if (fVar != null) {
            fVar.i();
        }
        this.f100967e.g(this);
    }

    public final <E extends IOException> E d(E e11) {
        Socket x11;
        boolean z11 = u50.f.f91853h;
        if (z11 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f100972j;
        if (fVar != null) {
            if (z11 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                x11 = x();
            }
            if (this.f100972j == null) {
                if (x11 != null) {
                    u50.f.q(x11);
                }
                this.f100967e.l(this, fVar);
            } else if (x11 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e12 = (E) E(e11);
        if (e11 == null) {
            this.f100967e.d(this);
            return e12;
        }
        m mVar = this.f100967e;
        g0.m(e12);
        mVar.e(this, e12);
        return e12;
    }

    public final void e() {
        this.f100970h = j.f49490a.g().k("response.body().close()");
        this.f100967e.f(this);
    }

    @Override // t50.b
    @k
    public n execute() {
        if (!this.f100969g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f100968f.x();
        e();
        try {
            this.f100963a.Y().d(this);
            return s();
        } finally {
            this.f100963a.Y().i(this);
        }
    }

    @Override // t50.b
    @k
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e mo6332clone() {
        return new e(this.f100963a, this.f100964b, this.f100965c);
    }

    public final okhttp3.a g(okhttp3.i iVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        t50.d dVar;
        if (iVar.G()) {
            sSLSocketFactory = this.f100963a.u0();
            hostnameVerifier = this.f100963a.f0();
            dVar = this.f100963a.Q();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            dVar = null;
        }
        return new okhttp3.a(iVar.F(), iVar.N(), this.f100963a.Z(), this.f100963a.t0(), sSLSocketFactory, hostnameVerifier, dVar, this.f100963a.p0(), this.f100963a.o0(), this.f100963a.n0(), this.f100963a.W(), this.f100963a.q0());
    }

    public final void h(@k l request, boolean z11) {
        g0.p(request, "request");
        if (this.f100974l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f100976n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f100975m) {
                throw new IllegalStateException("Check failed.");
            }
            g2 g2Var = g2.f100423a;
        }
        if (z11) {
            this.f100971i = new d(this.f100966d, g(request.q()), this, this.f100967e);
        }
    }

    public final void i(boolean z11) {
        z50.c cVar;
        synchronized (this) {
            if (!this.f100977o) {
                throw new IllegalStateException("released");
            }
            g2 g2Var = g2.f100423a;
        }
        if (z11 && (cVar = this.f100979q) != null) {
            cVar.d();
        }
        this.f100974l = null;
    }

    @Override // t50.b
    public boolean isCanceled() {
        return this.f100978p;
    }

    @Override // t50.b
    public boolean isExecuted() {
        return this.f100969g.get();
    }

    @k
    public final q j() {
        return this.f100963a;
    }

    @m80.l
    public final f l() {
        return this.f100972j;
    }

    @m80.l
    public final f m() {
        return this.f100980r;
    }

    @k
    public final m n() {
        return this.f100967e;
    }

    public final boolean o() {
        return this.f100965c;
    }

    @m80.l
    public final z50.c p() {
        return this.f100974l;
    }

    @k
    public final l q() {
        return this.f100964b;
    }

    @Override // t50.b
    @k
    public l request() {
        return this.f100964b;
    }

    @k
    public final n s() throws IOException {
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, this.f100963a.g0());
        arrayList.add(new a60.j(this.f100963a));
        arrayList.add(new a60.a(this.f100963a.X()));
        arrayList.add(new w50.a(this.f100963a.N()));
        arrayList.add(z50.a.f100930a);
        if (!this.f100965c) {
            m0.s0(arrayList, this.f100963a.j0());
        }
        arrayList.add(new a60.b(this.f100965c));
        boolean z11 = false;
        try {
            try {
                n c11 = new a60.g(this, arrayList, 0, null, this.f100964b, this.f100963a.R(), this.f100963a.r0(), this.f100963a.x0()).c(this.f100964b);
                if (isCanceled()) {
                    u50.f.o(c11);
                    throw new IOException("Canceled");
                }
                v(null);
                return c11;
            } catch (IOException e11) {
                z11 = true;
                IOException v11 = v(e11);
                g0.n(v11, "null cannot be cast to non-null type kotlin.Throwable");
                throw v11;
            }
        } catch (Throwable th2) {
            if (!z11) {
                v(null);
            }
            throw th2;
        }
    }

    @k
    public final z50.c t(@k a60.g chain) {
        g0.p(chain, "chain");
        synchronized (this) {
            if (!this.f100977o) {
                throw new IllegalStateException("released");
            }
            if (this.f100976n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f100975m) {
                throw new IllegalStateException("Check failed.");
            }
            g2 g2Var = g2.f100423a;
        }
        d dVar = this.f100971i;
        g0.m(dVar);
        z50.c cVar = new z50.c(this, this.f100967e, dVar, dVar.a(this.f100963a, chain));
        this.f100974l = cVar;
        this.f100979q = cVar;
        synchronized (this) {
            this.f100975m = true;
            this.f100976n = true;
        }
        if (this.f100978p) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E u(@m80.k z50.c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.g0.p(r2, r0)
            z50.c r0 = r1.f100979q
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 != 0) goto Le
            goto L58
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f100975m     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L59
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f100976n     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f100975m = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f100976n = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f100975m     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f100976n     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f100976n     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f100977o     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            yz.g2 r4 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.f100979q = r2
            z50.f r2 = r1.f100972j
            if (r2 == 0) goto L51
            r2.x()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.d(r5)
            return r2
        L58:
            return r5
        L59:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z50.e.u(z50.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @m80.l
    public final IOException v(@m80.l IOException iOException) {
        boolean z11;
        synchronized (this) {
            try {
                z11 = false;
                if (this.f100977o) {
                    this.f100977o = false;
                    if (!this.f100975m && !this.f100976n) {
                        z11 = true;
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11 ? d(iOException) : iOException;
    }

    @k
    public final String w() {
        return this.f100964b.q().V();
    }

    @m80.l
    public final Socket x() {
        f fVar = this.f100972j;
        g0.m(fVar);
        if (u50.f.f91853h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> s11 = fVar.s();
        Iterator<Reference<e>> it = s11.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (g0.g(it.next().get(), this)) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        s11.remove(i11);
        this.f100972j = null;
        if (s11.isEmpty()) {
            fVar.G(System.nanoTime());
            if (this.f100966d.c(fVar)) {
                return fVar.d();
            }
        }
        return null;
    }

    public final boolean y() {
        d dVar = this.f100971i;
        g0.m(dVar);
        return dVar.e();
    }

    public final void z(@m80.l f fVar) {
        this.f100980r = fVar;
    }
}
