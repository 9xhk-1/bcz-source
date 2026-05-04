package l60;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,514:1\n1#2:515\n*E\n"})
/* loaded from: classes8.dex */
public class i extends i1 {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final a f70418j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final z0 f70419k = new z0();

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public static i f70420l = null;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final ReentrantLock f70421m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final Condition f70422n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f70423o = 65536;

    /* renamed from: p, reason: collision with root package name */
    public static final long f70424p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f70425q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f70426r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f70427s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f70428t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f70429u = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f70430g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public int f70431h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f70432i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final i b() throws InterruptedException {
            i c11 = f().c();
            if (c11 == null) {
                long nanoTime = System.nanoTime();
                c().await(i.f70424p, TimeUnit.MILLISECONDS);
                if (f().c() != null || System.nanoTime() - nanoTime < i.f70425q) {
                    return null;
                }
                return d();
            }
            long B = c11.B(System.nanoTime());
            if (B > 0) {
                c().await(B, TimeUnit.NANOSECONDS);
                return null;
            }
            f().f(c11);
            c11.f70430g = 2;
            return c11;
        }

        @m80.k
        public final Condition c() {
            return i.f70422n;
        }

        @m80.l
        public final i d() {
            return i.f70420l;
        }

        @m80.k
        public final ReentrantLock e() {
            return i.f70421m;
        }

        @m80.k
        public final z0 f() {
            return i.f70419k;
        }

        public final void g(i iVar) {
            if (d() == null) {
                h(new i());
                new b().start();
            }
            i.D(iVar, 0L, 1, null);
            f().a(iVar);
            if (iVar.f70431h == 1) {
                c().signal();
            }
        }

        public final void h(@m80.l i iVar) {
            i.f70420l = iVar;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock e11;
            i b11;
            while (true) {
                try {
                    e11 = i.f70418j.e();
                    e11.lock();
                    try {
                        b11 = i.f70418j.b();
                    } finally {
                        e11.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (b11 == i.f70418j.d()) {
                    i.f70418j.h(null);
                    return;
                }
                g2 g2Var = g2.f100423a;
                e11.unlock();
                if (b11 != null) {
                    b11.G();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,514:1\n195#2,11:515\n195#2,11:526\n195#2,11:537\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n151#1:515,11\n157#1:526,11\n161#1:537,11\n*E\n"})
    public static final class c implements e1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1 f70434b;

        public c(e1 e1Var) {
            this.f70434b = e1Var;
        }

        @Override // l60.e1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i D() {
            return i.this;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i iVar = i.this;
            e1 e1Var = this.f70434b;
            iVar.x();
            try {
                e1Var.close();
                g2 g2Var = g2.f100423a;
                if (iVar.y()) {
                    throw iVar.u(null);
                }
            } catch (IOException e11) {
                if (!iVar.y()) {
                    throw e11;
                }
                throw iVar.u(e11);
            } finally {
                iVar.y();
            }
        }

        @Override // l60.e1, java.io.Flushable
        public void flush() {
            i iVar = i.this;
            e1 e1Var = this.f70434b;
            iVar.x();
            try {
                e1Var.flush();
                g2 g2Var = g2.f100423a;
                if (iVar.y()) {
                    throw iVar.u(null);
                }
            } catch (IOException e11) {
                if (!iVar.y()) {
                    throw e11;
                }
                throw iVar.u(e11);
            } finally {
                iVar.y();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f70434b + ')';
        }

        @Override // l60.e1
        public void y8(k source, long j11) {
            kotlin.jvm.internal.g0.p(source, "source");
            h.e(source.size(), 0L, j11);
            while (true) {
                long j12 = 0;
                if (j11 <= 0) {
                    return;
                }
                c1 c1Var = source.f70446a;
                kotlin.jvm.internal.g0.m(c1Var);
                while (true) {
                    if (j12 >= 65536) {
                        break;
                    }
                    j12 += c1Var.f70385c - c1Var.f70384b;
                    if (j12 >= j11) {
                        j12 = j11;
                        break;
                    } else {
                        c1Var = c1Var.f70388f;
                        kotlin.jvm.internal.g0.m(c1Var);
                    }
                }
                i iVar = i.this;
                e1 e1Var = this.f70434b;
                iVar.x();
                try {
                    try {
                        e1Var.y8(source, j12);
                        g2 g2Var = g2.f100423a;
                        if (iVar.y()) {
                            throw iVar.u(null);
                        }
                        j11 -= j12;
                    } catch (IOException e11) {
                        if (!iVar.y()) {
                            throw e11;
                        }
                        throw iVar.u(e11);
                    }
                } catch (Throwable th2) {
                    iVar.y();
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,514:1\n195#2,11:515\n195#2,11:526\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n177#1:515,11\n181#1:526,11\n*E\n"})
    public static final class d implements g1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g1 f70436b;

        public d(g1 g1Var) {
            this.f70436b = g1Var;
        }

        @Override // l60.g1
        public long L3(k sink, long j11) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            i iVar = i.this;
            g1 g1Var = this.f70436b;
            iVar.x();
            try {
                long L3 = g1Var.L3(sink, j11);
                if (iVar.y()) {
                    throw iVar.u(null);
                }
                return L3;
            } catch (IOException e11) {
                if (iVar.y()) {
                    throw iVar.u(e11);
                }
                throw e11;
            } finally {
                iVar.y();
            }
        }

        @Override // l60.g1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i D() {
            return i.this;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i iVar = i.this;
            g1 g1Var = this.f70436b;
            iVar.x();
            try {
                g1Var.close();
                g2 g2Var = g2.f100423a;
                if (iVar.y()) {
                    throw iVar.u(null);
                }
            } catch (IOException e11) {
                if (!iVar.y()) {
                    throw e11;
                }
                throw iVar.u(e11);
            } finally {
                iVar.y();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f70436b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f70421m = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.g0.o(newCondition, "newCondition(...)");
        f70422n = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f70424p = millis;
        f70425q = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static /* synthetic */ void D(i iVar, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i11 & 1) != 0) {
            j11 = System.nanoTime();
        }
        iVar.C(j11);
    }

    @m80.k
    public IOException A(@m80.l IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(com.alipay.sdk.m.m.a.f10784h0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long B(long j11) {
        return this.f70432i - j11;
    }

    public final void C(long j11) {
        long l11 = l();
        boolean h11 = h();
        if (l() != 0 && h()) {
            this.f70432i = j11 + Math.min(l11, f() - j11);
        } else if (l11 != 0) {
            this.f70432i = j11 + l11;
        } else {
            if (!h11) {
                throw new AssertionError();
            }
            this.f70432i = f();
        }
    }

    @m80.k
    public final e1 E(@m80.k e1 sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        return new c(sink);
    }

    @m80.k
    public final g1 F(@m80.k g1 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        return new d(source);
    }

    public final <T> T H(@m80.k x00.a<? extends T> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        x();
        try {
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.d0.d(1);
                if (y()) {
                    throw u(null);
                }
                kotlin.jvm.internal.d0.c(1);
                return invoke;
            } catch (IOException e11) {
                if (y()) {
                    throw u(e11);
                }
                throw e11;
            }
        } catch (Throwable th2) {
            kotlin.jvm.internal.d0.d(1);
            y();
            kotlin.jvm.internal.d0.c(1);
            throw th2;
        }
    }

    @Override // l60.i1
    public void b() {
        super.b();
        ReentrantLock reentrantLock = f70421m;
        reentrantLock.lock();
        try {
            if (this.f70430g == 1) {
                f70419k.f(this);
                this.f70430g = 3;
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @yz.v0
    @m80.k
    public final IOException u(@m80.l IOException iOException) {
        return A(iOException);
    }

    public final void x() {
        long l11 = l();
        boolean h11 = h();
        if (l11 != 0 || h11) {
            ReentrantLock reentrantLock = f70421m;
            reentrantLock.lock();
            try {
                if (this.f70430g != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f70430g = 1;
                f70418j.g(this);
                g2 g2Var = g2.f100423a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean y() {
        ReentrantLock reentrantLock = f70421m;
        reentrantLock.lock();
        try {
            int i11 = this.f70430g;
            this.f70430g = 0;
            if (i11 != 1) {
                return i11 == 2;
            }
            f70419k.f(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long z() {
        return this.f70432i;
    }

    public void G() {
    }
}
