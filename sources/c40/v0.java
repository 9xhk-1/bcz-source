package c40;

import c40.p1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: classes8.dex */
public final class v0 extends p1 implements Runnable {

    @m80.l
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final v0 f7992g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f7993h = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: i, reason: collision with root package name */
    public static final long f7994i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public static final long f7995j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7996k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7997l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7998m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7999n = 3;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8000o = 4;

    static {
        Long l11;
        v0 v0Var = new v0();
        f7992g = v0Var;
        o1.U(v0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l11 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l11 = 1000L;
        }
        f7995j = timeUnit.toNanos(l11.longValue());
    }

    public final void A1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void C1(long j11) {
        try {
            long currentTimeMillis = System.currentTimeMillis() + j11;
            if (!w1()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    b bVar = c.f7825a;
                    if (bVar != null) {
                        bVar.g(thread);
                    } else {
                        LockSupport.unpark(thread);
                    }
                }
                if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type java.lang.Object");
                wait(j11);
            }
            debugStatus = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c40.p1
    public void L0(@m80.k Runnable runnable) {
        if (u1()) {
            A1();
        }
        super.L0(runnable);
    }

    @Override // c40.p1, c40.z0
    @m80.k
    public k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        return j1(j11, runnable);
    }

    public final synchronized void q1() {
        if (w1()) {
            debugStatus = 3;
            g1();
            kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread r1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f7993h);
            _thread = thread;
            thread.setContextClassLoader(f7992g.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        o3.f7899a.d(this);
        b bVar = c.f7825a;
        if (bVar != null) {
            bVar.d();
        }
        try {
            if (!y1()) {
                _thread = null;
                q1();
                b bVar2 = c.f7825a;
                if (bVar2 != null) {
                    bVar2.h();
                }
                if (a0()) {
                    return;
                }
                s0();
                return;
            }
            long j11 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long h02 = h0();
                if (h02 == Long.MAX_VALUE) {
                    b bVar3 = c.f7825a;
                    long b11 = bVar3 != null ? bVar3.b() : System.nanoTime();
                    if (j11 == Long.MAX_VALUE) {
                        j11 = f7995j + b11;
                    }
                    long j12 = j11 - b11;
                    if (j12 <= 0) {
                        _thread = null;
                        q1();
                        b bVar4 = c.f7825a;
                        if (bVar4 != null) {
                            bVar4.h();
                        }
                        if (a0()) {
                            return;
                        }
                        s0();
                        return;
                    }
                    h02 = g10.u.C(h02, j12);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (h02 > 0) {
                    if (w1()) {
                        _thread = null;
                        q1();
                        b bVar5 = c.f7825a;
                        if (bVar5 != null) {
                            bVar5.h();
                        }
                        if (a0()) {
                            return;
                        }
                        s0();
                        return;
                    }
                    b bVar6 = c.f7825a;
                    if (bVar6 != null) {
                        bVar6.c(this, h02);
                    } else {
                        LockSupport.parkNanos(this, h02);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            q1();
            b bVar7 = c.f7825a;
            if (bVar7 != null) {
                bVar7.h();
            }
            if (!a0()) {
                s0();
            }
            throw th2;
        }
    }

    @Override // c40.q1
    @m80.k
    public Thread s0() {
        Thread thread = _thread;
        return thread == null ? r1() : thread;
    }

    public final synchronized void s1() {
        debugStatus = 0;
        r1();
        while (debugStatus == 0) {
            kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // c40.p1, c40.o1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return "DefaultExecutor";
    }

    public final boolean u1() {
        return debugStatus == 4;
    }

    @Override // c40.q1
    public void w0(long j11, @m80.k p1.c cVar) {
        A1();
    }

    public final boolean w1() {
        int i11 = debugStatus;
        return i11 == 2 || i11 == 3;
    }

    public final boolean x1() {
        return _thread != null;
    }

    public final synchronized boolean y1() {
        if (w1()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public static /* synthetic */ void t1() {
    }
}
