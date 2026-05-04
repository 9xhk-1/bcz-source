package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34877a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f34878b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @vo.a(vb.a.f93813p)
    public a f34879c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final v1 f34880a;

        /* renamed from: b, reason: collision with root package name */
        public final Condition f34881b;

        /* renamed from: c, reason: collision with root package name */
        @vo.a("monitor.lock")
        public int f34882c = 0;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        @vo.a("monitor.lock")
        public a f34883d;

        public a(v1 monitor) {
            this.f34880a = (v1) Preconditions.checkNotNull(monitor, "monitor");
            this.f34881b = monitor.f34878b.newCondition();
        }

        public abstract boolean a();
    }

    public v1() {
        this(false);
    }

    public static long E(long startTime, long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        return timeoutNanos - (System.nanoTime() - startTime);
    }

    public static long H(long time, TimeUnit unit) {
        return ro.k.g(unit.toNanos(time), 0L, 6917529027641081853L);
    }

    public static long y(long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    public boolean A() {
        return this.f34878b.isLocked();
    }

    public boolean B() {
        return this.f34878b.isHeldByCurrentThread();
    }

    @vo.a(vb.a.f93813p)
    public final boolean C(a guard) {
        try {
            return guard.a();
        } catch (Throwable th2) {
            F();
            throw th2;
        }
    }

    public void D() {
        ReentrantLock reentrantLock = this.f34878b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                G();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @vo.a(vb.a.f93813p)
    public final void F() {
        for (a aVar = this.f34879c; aVar != null; aVar = aVar.f34883d) {
            aVar.f34881b.signalAll();
        }
    }

    @vo.a(vb.a.f93813p)
    public final void G() {
        for (a aVar = this.f34879c; aVar != null; aVar = aVar.f34883d) {
            if (C(aVar)) {
                aVar.f34881b.signal();
                return;
            }
        }
    }

    public boolean I() {
        return this.f34878b.tryLock();
    }

    public boolean J(a guard) {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f34878b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean a11 = guard.a();
            if (!a11) {
            }
            return a11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void K(a guard) throws InterruptedException {
        if (guard.f34880a != this || !this.f34878b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return;
        }
        b(guard, true);
    }

    public boolean L(a guard, long time, TimeUnit unit) throws InterruptedException {
        long H = H(time, unit);
        if (guard.f34880a != this || !this.f34878b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return c(guard, H, true);
    }

    public void M(a guard) {
        if (guard.f34880a != this || !this.f34878b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return;
        }
        d(guard, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean N(com.google.common.util.concurrent.v1.a r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r6 = this;
            long r8 = H(r8, r10)
            com.google.common.util.concurrent.v1 r10 = r7.f34880a
            if (r10 != r6) goto L53
            java.util.concurrent.locks.ReentrantLock r10 = r6.f34878b
            boolean r10 = r10.isHeldByCurrentThread()
            if (r10 == 0) goto L53
            boolean r10 = r7.a()
            r0 = 1
            if (r10 == 0) goto L18
            return r0
        L18:
            long r1 = y(r8)
            boolean r10 = java.lang.Thread.interrupted()
            r3 = r8
            r5 = r0
        L22:
            boolean r7 = r6.c(r7, r3, r5)     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L33
            if (r10 == 0) goto L2f
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L2f:
            return r7
        L30:
            r7 = move-exception
            r0 = r10
            goto L49
        L33:
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L41
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return r0
        L41:
            long r3 = E(r1, r8)     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r10 = r0
            goto L22
        L48:
            r7 = move-exception
        L49:
            if (r0 == 0) goto L52
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L52:
            throw r7
        L53:
            java.lang.IllegalMonitorStateException r7 = new java.lang.IllegalMonitorStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.v1.N(com.google.common.util.concurrent.v1$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    @vo.a(vb.a.f93813p)
    public final void b(a guard, boolean signalBeforeWaiting) throws InterruptedException {
        if (signalBeforeWaiting) {
            G();
        }
        e(guard);
        do {
            try {
                guard.f34881b.await();
            } finally {
                f(guard);
            }
        } while (!guard.a());
    }

    @vo.a(vb.a.f93813p)
    public final boolean c(a guard, long nanos, boolean signalBeforeWaiting) throws InterruptedException {
        boolean z11 = true;
        while (nanos > 0) {
            if (z11) {
                if (signalBeforeWaiting) {
                    try {
                        G();
                    } catch (Throwable th2) {
                        if (!z11) {
                            f(guard);
                        }
                        throw th2;
                    }
                }
                e(guard);
                z11 = false;
            }
            nanos = guard.f34881b.awaitNanos(nanos);
            if (guard.a()) {
                if (!z11) {
                    f(guard);
                }
                return true;
            }
        }
        if (!z11) {
            f(guard);
        }
        return false;
    }

    @vo.a(vb.a.f93813p)
    public final void d(a guard, boolean signalBeforeWaiting) {
        if (signalBeforeWaiting) {
            G();
        }
        e(guard);
        do {
            try {
                guard.f34881b.awaitUninterruptibly();
            } finally {
                f(guard);
            }
        } while (!guard.a());
    }

    @vo.a(vb.a.f93813p)
    public final void e(a guard) {
        int i11 = guard.f34882c;
        guard.f34882c = i11 + 1;
        if (i11 == 0) {
            guard.f34883d = this.f34879c;
            this.f34879c = guard;
        }
    }

    @vo.a(vb.a.f93813p)
    public final void f(a guard) {
        int i11 = guard.f34882c - 1;
        guard.f34882c = i11;
        if (i11 == 0) {
            a aVar = this.f34879c;
            a aVar2 = null;
            while (aVar != guard) {
                aVar2 = aVar;
                aVar = aVar.f34883d;
            }
            if (aVar2 == null) {
                this.f34879c = aVar.f34883d;
            } else {
                aVar2.f34883d = aVar.f34883d;
            }
            aVar.f34883d = null;
        }
    }

    public void g() {
        this.f34878b.lock();
    }

    public boolean h(long time, TimeUnit unit) {
        boolean tryLock;
        long H = H(time, unit);
        ReentrantLock reentrantLock = this.f34878b;
        boolean z11 = true;
        if (!this.f34877a && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = Thread.interrupted();
        try {
            long nanoTime = System.nanoTime();
            long j11 = H;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j11, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    j11 = E(nanoTime, H);
                    interrupted = true;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (Throwable th3) {
            th = th3;
            z11 = interrupted;
        }
    }

    public boolean i(a guard) {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f34878b;
        reentrantLock.lock();
        try {
            boolean a11 = guard.a();
            if (!a11) {
            }
            return a11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean j(a guard, long time, TimeUnit unit) {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        if (!h(time, unit)) {
            return false;
        }
        try {
            boolean a11 = guard.a();
            if (!a11) {
            }
            return a11;
        } finally {
            this.f34878b.unlock();
        }
    }

    public boolean k(a guard) throws InterruptedException {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f34878b;
        reentrantLock.lockInterruptibly();
        try {
            boolean a11 = guard.a();
            if (!a11) {
            }
            return a11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean l(a guard, long time, TimeUnit unit) throws InterruptedException {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f34878b;
        if (!reentrantLock.tryLock(time, unit)) {
            return false;
        }
        try {
            boolean a11 = guard.a();
            if (!a11) {
            }
            return a11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void m() throws InterruptedException {
        this.f34878b.lockInterruptibly();
    }

    public boolean n(long time, TimeUnit unit) throws InterruptedException {
        return this.f34878b.tryLock(time, unit);
    }

    public void o(a guard) throws InterruptedException {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f34878b;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.a()) {
                return;
            }
            b(guard, isHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (c(r11, r0, r3) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p(com.google.common.util.concurrent.v1.a r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = H(r12, r14)
            com.google.common.util.concurrent.v1 r2 = r11.f34880a
            if (r2 != r10) goto L62
            java.util.concurrent.locks.ReentrantLock r2 = r10.f34878b
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f34877a
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = y(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.a()     // Catch: java.lang.Throwable -> L4a
            if (r12 != 0) goto L4c
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = E(r8, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            boolean r11 = r10.c(r11, r0, r3)     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            goto L4c
        L4a:
            r11 = move-exception
            goto L53
        L4c:
            r5 = 1
        L4d:
            if (r5 != 0) goto L52
            r2.unlock()
        L52:
            return r5
        L53:
            if (r3 != 0) goto L5e
            r10.G()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5e:
            r2.unlock()
            throw r11
        L62:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.v1.p(com.google.common.util.concurrent.v1$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public void q(a guard) {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f34878b;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.a()) {
                return;
            }
            d(guard, isHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:5:0x0012, B:7:0x001a, B:22:0x004f, B:33:0x005c, B:34:0x005f, B:35:0x0025, B:38:0x002a, B:13:0x0032, B:17:0x003d, B:18:0x0049, B:27:0x0045), top: B:4:0x0012, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r(com.google.common.util.concurrent.v1.a r12, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r11 = this;
            long r13 = H(r13, r15)
            com.google.common.util.concurrent.v1 r15 = r12.f34880a
            if (r15 != r11) goto L7f
            java.util.concurrent.locks.ReentrantLock r15 = r11.f34878b
            boolean r0 = r15.isHeldByCurrentThread()
            boolean r1 = java.lang.Thread.interrupted()
            boolean r2 = r11.f34877a     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r4 = 0
            r6 = 1
            if (r2 != 0) goto L25
            boolean r2 = r15.tryLock()     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L21
            goto L25
        L21:
            r7 = r4
            goto L32
        L23:
            r12 = move-exception
            goto L75
        L25:
            long r7 = y(r13)     // Catch: java.lang.Throwable -> L23
            r9 = r13
        L2a:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L6d
            boolean r2 = r15.tryLock(r9, r2)     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L6d
            if (r2 == 0) goto L63
        L32:
            boolean r2 = r12.a()     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
            if (r2 == 0) goto L39
            goto L4d
        L39:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L45
            long r7 = y(r13)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
            r9 = r13
            goto L49
        L43:
            r12 = move-exception
            goto L5c
        L45:
            long r9 = E(r7, r13)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
        L49:
            boolean r6 = r11.c(r12, r9, r0)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
        L4d:
            if (r6 != 0) goto L52
            r15.unlock()     // Catch: java.lang.Throwable -> L23
        L52:
            if (r1 == 0) goto L5b
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L5b:
            return r6
        L5c:
            r15.unlock()     // Catch: java.lang.Throwable -> L23
            throw r12     // Catch: java.lang.Throwable -> L23
        L60:
            r0 = r3
            r1 = r6
            goto L32
        L63:
            if (r1 == 0) goto L6c
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L6c:
            return r3
        L6d:
            long r9 = E(r7, r13)     // Catch: java.lang.Throwable -> L73
            r1 = r6
            goto L2a
        L73:
            r12 = move-exception
            r1 = r6
        L75:
            if (r1 == 0) goto L7e
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L7e:
            throw r12
        L7f:
            java.lang.IllegalMonitorStateException r12 = new java.lang.IllegalMonitorStateException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.v1.r(com.google.common.util.concurrent.v1$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public int s() {
        return this.f34878b.getHoldCount();
    }

    public int t() {
        return this.f34878b.getQueueLength();
    }

    public int u(a guard) {
        if (guard.f34880a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f34878b.lock();
        try {
            return guard.f34882c;
        } finally {
            this.f34878b.unlock();
        }
    }

    public boolean v(Thread thread) {
        return this.f34878b.hasQueuedThread(thread);
    }

    public boolean w() {
        return this.f34878b.hasQueuedThreads();
    }

    public boolean x(a guard) {
        return u(guard) > 0;
    }

    public boolean z() {
        return this.f34877a;
    }

    public v1(boolean fair) {
        this.f34879c = null;
        this.f34877a = fair;
        this.f34878b = new ReentrantLock(fair);
    }
}
