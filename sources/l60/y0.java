package l60;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.DeprecationLevel;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n302#3,26:264\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n222#1:264,26\n*E\n"})
/* loaded from: classes8.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f70517a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f70518b = new k();

    /* renamed from: c, reason: collision with root package name */
    public boolean f70519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70520d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70521e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public e1 f70522f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ReentrantLock f70523g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final Condition f70524h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final e1 f70525i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final g1 f70526j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n222#3:264\n223#3:291\n222#3:292\n223#3:319\n222#3:320\n223#3:347\n302#4,26:265\n302#4,26:293\n302#4,26:321\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:264\n87#1:291\n106#1:292\n106#1:319\n124#1:320\n124#1:347\n87#1:265,26\n106#1:293,26\n124#1:321,26\n*E\n"})
    public static final class a implements e1 {

        /* renamed from: a, reason: collision with root package name */
        public final i1 f70527a = new i1();

        public a() {
        }

        @Override // l60.e1
        public i1 D() {
            return this.f70527a;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock j11 = y0.this.j();
            y0 y0Var = y0.this;
            j11.lock();
            try {
                if (y0Var.l()) {
                    j11.unlock();
                    return;
                }
                e1 i11 = y0Var.i();
                if (i11 == null) {
                    if (y0Var.m() && y0Var.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    y0Var.p(true);
                    y0Var.h().signalAll();
                    i11 = null;
                }
                g2 g2Var = g2.f100423a;
                j11.unlock();
                if (i11 != null) {
                    y0 y0Var2 = y0.this;
                    i1 D = i11.D();
                    i1 D2 = y0Var2.r().D();
                    long l11 = D.l();
                    long a11 = i1.f70437e.a(D2.l(), D.l());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    D.k(a11, timeUnit);
                    if (!D.h()) {
                        if (D2.h()) {
                            D.g(D2.f());
                        }
                        try {
                            i11.close();
                            D.k(l11, timeUnit);
                            if (D2.h()) {
                                D.c();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            D.k(l11, TimeUnit.NANOSECONDS);
                            if (D2.h()) {
                                D.c();
                            }
                            throw th2;
                        }
                    }
                    long f11 = D.f();
                    if (D2.h()) {
                        D.g(Math.min(D.f(), D2.f()));
                    }
                    try {
                        i11.close();
                        D.k(l11, timeUnit);
                        if (D2.h()) {
                            D.g(f11);
                        }
                    } catch (Throwable th3) {
                        D.k(l11, TimeUnit.NANOSECONDS);
                        if (D2.h()) {
                            D.g(f11);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                j11.unlock();
                throw th4;
            }
        }

        @Override // l60.e1, java.io.Flushable
        public void flush() {
            ReentrantLock j11 = y0.this.j();
            y0 y0Var = y0.this;
            j11.lock();
            try {
                if (y0Var.l()) {
                    throw new IllegalStateException("closed");
                }
                if (y0Var.g()) {
                    throw new IOException(com.squareup.picasso.h0.f41875q);
                }
                e1 i11 = y0Var.i();
                if (i11 == null) {
                    if (y0Var.m() && y0Var.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    i11 = null;
                }
                g2 g2Var = g2.f100423a;
                j11.unlock();
                if (i11 != null) {
                    y0 y0Var2 = y0.this;
                    i1 D = i11.D();
                    i1 D2 = y0Var2.r().D();
                    long l11 = D.l();
                    long a11 = i1.f70437e.a(D2.l(), D.l());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    D.k(a11, timeUnit);
                    if (!D.h()) {
                        if (D2.h()) {
                            D.g(D2.f());
                        }
                        try {
                            i11.flush();
                            D.k(l11, timeUnit);
                            if (D2.h()) {
                                D.c();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            D.k(l11, TimeUnit.NANOSECONDS);
                            if (D2.h()) {
                                D.c();
                            }
                            throw th2;
                        }
                    }
                    long f11 = D.f();
                    if (D2.h()) {
                        D.g(Math.min(D.f(), D2.f()));
                    }
                    try {
                        i11.flush();
                        D.k(l11, timeUnit);
                        if (D2.h()) {
                            D.g(f11);
                        }
                    } catch (Throwable th3) {
                        D.k(l11, TimeUnit.NANOSECONDS);
                        if (D2.h()) {
                            D.g(f11);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                j11.unlock();
                throw th4;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        
            r1 = yz.g2.f100423a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        
            r0 = r12.f70528b;
            r1 = r2.D();
            r0 = r0.r().D();
            r3 = r1.l();
            r5 = l60.i1.f70437e.a(r0.l(), r1.l());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.k(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        
            if (r1.h() == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
        
            r5 = r1.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        
            if (r0.h() == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        
            r1.g(java.lang.Math.min(r1.f(), r0.f()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        
            r2.y8(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
        
            r1.k(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
        
            if (r0.h() == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
        
            r1.g(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        
            r1.k(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        
            if (r0.h() != false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
        
            r1.g(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        
            if (r0.h() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
        
            r1.g(r0.f());
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
        
            r2.y8(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
        
            r1.k(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
        
            if (r0.h() == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
        
            r1.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0101, code lost:
        
            r1.k(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
        
            if (r0.h() != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
        
            r1.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
        
            return;
         */
        @Override // l60.e1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void y8(l60.k r13, long r14) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l60.y0.a.y8(l60.k, long):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
    public static final class b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final i1 f70529a = new i1();

        public b() {
        }

        @Override // l60.g1
        public i1 D() {
            return this.f70529a;
        }

        @Override // l60.g1
        public long L3(k sink, long j11) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            ReentrantLock j12 = y0.this.j();
            y0 y0Var = y0.this;
            j12.lock();
            try {
                if (y0Var.m()) {
                    throw new IllegalStateException("closed");
                }
                if (y0Var.g()) {
                    throw new IOException(com.squareup.picasso.h0.f41875q);
                }
                while (y0Var.f().size() == 0) {
                    if (y0Var.l()) {
                        j12.unlock();
                        return -1L;
                    }
                    this.f70529a.a(y0Var.h());
                    if (y0Var.g()) {
                        throw new IOException(com.squareup.picasso.h0.f41875q);
                    }
                }
                long L3 = y0Var.f().L3(sink, j11);
                y0Var.h().signalAll();
                j12.unlock();
                return L3;
            } catch (Throwable th2) {
                j12.unlock();
                throw th2;
            }
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock j11 = y0.this.j();
            y0 y0Var = y0.this;
            j11.lock();
            try {
                y0Var.q(true);
                y0Var.h().signalAll();
                g2 g2Var = g2.f100423a;
            } finally {
                j11.unlock();
            }
        }
    }

    public y0(long j11) {
        this.f70517a = j11;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f70523g = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.g0.o(newCondition, "newCondition(...)");
        this.f70524h = newCondition;
        if (j11 >= 1) {
            this.f70525i = new a();
            this.f70526j = new b();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j11).toString());
        }
    }

    @w00.j(name = "-deprecated_sink")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = "sink", imports = {}))
    @m80.k
    public final e1 a() {
        return this.f70525i;
    }

    @w00.j(name = "-deprecated_source")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = "source", imports = {}))
    @m80.k
    public final g1 b() {
        return this.f70526j;
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f70523g;
        reentrantLock.lock();
        try {
            this.f70519c = true;
            this.f70518b.e();
            this.f70524h.signalAll();
            g2 g2Var = g2.f100423a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(@m80.k e1 sink) throws IOException {
        k kVar;
        boolean z11;
        kotlin.jvm.internal.g0.p(sink, "sink");
        while (true) {
            this.f70523g.lock();
            try {
                if (this.f70522f != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.f70519c) {
                    this.f70522f = sink;
                    throw new IOException(com.squareup.picasso.h0.f41875q);
                }
                boolean z12 = this.f70520d;
                k kVar2 = null;
                if (this.f70518b.J()) {
                    this.f70521e = true;
                    this.f70522f = sink;
                    kVar = null;
                    z11 = true;
                } else {
                    kVar = new k();
                    k kVar3 = this.f70518b;
                    kVar.y8(kVar3, kVar3.size());
                    this.f70524h.signalAll();
                    z11 = false;
                }
                g2 g2Var = g2.f100423a;
                if (z11) {
                    if (z12) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (kVar == null) {
                    try {
                        kotlin.jvm.internal.g0.S("sinkBuffer");
                    } catch (Throwable th2) {
                        ReentrantLock reentrantLock = this.f70523g;
                        reentrantLock.lock();
                        try {
                            this.f70521e = true;
                            this.f70524h.signalAll();
                            g2 g2Var2 = g2.f100423a;
                            throw th2;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } else {
                    kVar2 = kVar;
                }
                sink.y8(kVar2, kVar.size());
                sink.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(e1 e1Var, x00.l<? super e1, g2> lVar) {
        i1 D = e1Var.D();
        i1 D2 = r().D();
        long l11 = D.l();
        long a11 = i1.f70437e.a(D2.l(), D.l());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        D.k(a11, timeUnit);
        if (!D.h()) {
            if (D2.h()) {
                D.g(D2.f());
            }
            try {
                lVar.invoke(e1Var);
                g2 g2Var = g2.f100423a;
                kotlin.jvm.internal.d0.d(1);
                D.k(l11, timeUnit);
                if (D2.h()) {
                    D.c();
                }
                kotlin.jvm.internal.d0.c(1);
                return;
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                D.k(l11, TimeUnit.NANOSECONDS);
                if (D2.h()) {
                    D.c();
                }
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
        long f11 = D.f();
        if (D2.h()) {
            D.g(Math.min(D.f(), D2.f()));
        }
        try {
            lVar.invoke(e1Var);
            g2 g2Var2 = g2.f100423a;
            kotlin.jvm.internal.d0.d(1);
            D.k(l11, timeUnit);
            if (D2.h()) {
                D.g(f11);
            }
            kotlin.jvm.internal.d0.c(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.d0.d(1);
            D.k(l11, TimeUnit.NANOSECONDS);
            if (D2.h()) {
                D.g(f11);
            }
            kotlin.jvm.internal.d0.c(1);
            throw th3;
        }
    }

    @m80.k
    public final k f() {
        return this.f70518b;
    }

    public final boolean g() {
        return this.f70519c;
    }

    @m80.k
    public final Condition h() {
        return this.f70524h;
    }

    @m80.l
    public final e1 i() {
        return this.f70522f;
    }

    @m80.k
    public final ReentrantLock j() {
        return this.f70523g;
    }

    public final long k() {
        return this.f70517a;
    }

    public final boolean l() {
        return this.f70520d;
    }

    public final boolean m() {
        return this.f70521e;
    }

    public final void n(boolean z11) {
        this.f70519c = z11;
    }

    public final void o(@m80.l e1 e1Var) {
        this.f70522f = e1Var;
    }

    public final void p(boolean z11) {
        this.f70520d = z11;
    }

    public final void q(boolean z11) {
        this.f70521e = z11;
    }

    @w00.j(name = "sink")
    @m80.k
    public final e1 r() {
        return this.f70525i;
    }

    @w00.j(name = "source")
    @m80.k
    public final g1 s() {
        return this.f70526j;
    }
}
