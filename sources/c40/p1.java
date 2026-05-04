package c40;

import c40.z0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n29#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
/* loaded from: classes8.dex */
public abstract class p1 extends q1 implements z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7908d = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_queue$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7909e = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_delayed$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7910f = AtomicIntegerFieldUpdater.newUpdater(p1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    public final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final n<yz.g2> f7911c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j11, @m80.k n<? super yz.g2> nVar) {
            super(j11);
            this.f7911c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7911c.l(p1.this, yz.g2.f100423a);
        }

        @Override // c40.p1.c
        @m80.k
        public String toString() {
            return super.toString() + this.f7911c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Runnable f7913c;

        public b(long j11, @m80.k Runnable runnable) {
            super(j11);
            this.f7913c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7913c.run();
        }

        @Override // c40.p1.c
        @m80.k
        public String toString() {
            return super.toString() + this.f7913c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n29#2:548\n29#2:551\n29#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    public static abstract class c implements Runnable, Comparable<c>, k1, h40.l1 {

        @m80.l
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        public long f7914a;

        /* renamed from: b, reason: collision with root package name */
        public int f7915b = -1;

        public c(long j11) {
            this.f7914a = j11;
        }

        @Override // h40.l1
        @m80.l
        public h40.k1<?> a() {
            Object obj = this._heap;
            if (obj instanceof h40.k1) {
                return (h40.k1) obj;
            }
            return null;
        }

        @Override // h40.l1
        public void b(@m80.l h40.k1<?> k1Var) {
            h40.x0 x0Var;
            Object obj = this._heap;
            x0Var = s1.f7954a;
            if (obj == x0Var) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = k1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(@m80.k c cVar) {
            long j11 = this.f7914a - cVar.f7914a;
            if (j11 > 0) {
                return 1;
            }
            return j11 < 0 ? -1 : 0;
        }

        public final int d(long j11, @m80.k d dVar, @m80.k p1 p1Var) {
            h40.x0 x0Var;
            synchronized (this) {
                Object obj = this._heap;
                x0Var = s1.f7954a;
                if (obj == x0Var) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c e11 = dVar.e();
                        if (p1Var.e()) {
                            return 1;
                        }
                        if (e11 == null) {
                            dVar.f7916c = j11;
                        } else {
                            long j12 = e11.f7914a;
                            if (j12 - j11 < 0) {
                                j11 = j12;
                            }
                            if (j11 - dVar.f7916c > 0) {
                                dVar.f7916c = j11;
                            }
                        }
                        long j13 = this.f7914a;
                        long j14 = dVar.f7916c;
                        if (j13 - j14 < 0) {
                            this.f7914a = j14;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // c40.k1
        public final void dispose() {
            h40.x0 x0Var;
            h40.x0 x0Var2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    x0Var = s1.f7954a;
                    if (obj == x0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.l(this);
                    }
                    x0Var2 = s1.f7954a;
                    this._heap = x0Var2;
                    yz.g2 g2Var = yz.g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean f(long j11) {
            return j11 - this.f7914a >= 0;
        }

        @Override // h40.l1
        public int getIndex() {
            return this.f7915b;
        }

        @Override // h40.l1
        public void setIndex(int i11) {
            this.f7915b = i11;
        }

        @m80.k
        public String toString() {
            return "Delayed[nanos=" + this.f7914a + l50.b.f69930l;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends h40.k1<c> {

        /* renamed from: c, reason: collision with root package name */
        @w00.g
        public long f7916c;

        public d(long j11) {
            this.f7916c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        return f7910f.get(this) == 1;
    }

    private final /* synthetic */ void e1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, yz.g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final void E0() {
        h40.x0 x0Var;
        h40.x0 x0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7908d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7908d;
                x0Var = s1.f7961h;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, x0Var)) {
                    return;
                }
            } else {
                if (obj instanceof h40.f0) {
                    ((h40.f0) obj).d();
                    return;
                }
                x0Var2 = s1.f7961h;
                if (obj == x0Var2) {
                    return;
                }
                h40.f0 f0Var = new h40.f0(8, true);
                kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                f0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f7908d, this, obj, f0Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable F0() {
        h40.x0 x0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7908d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof h40.f0) {
                kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                h40.f0 f0Var = (h40.f0) obj;
                Object s11 = f0Var.s();
                if (s11 != h40.f0.f58211t) {
                    return (Runnable) s11;
                }
                androidx.concurrent.futures.a.a(f7908d, this, obj, f0Var.r());
            } else {
                x0Var = s1.f7961h;
                if (obj == x0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f7908d, this, obj, null)) {
                    kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // c40.o1
    public long I() {
        c j11;
        h40.x0 x0Var;
        if (super.I() == 0) {
            return 0L;
        }
        Object obj = f7908d.get(this);
        if (obj != null) {
            if (!(obj instanceof h40.f0)) {
                x0Var = s1.f7961h;
                return obj == x0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((h40.f0) obj).m()) {
                return 0L;
            }
        }
        d dVar = (d) f7909e.get(this);
        if (dVar == null || (j11 = dVar.j()) == null) {
            return Long.MAX_VALUE;
        }
        long j12 = j11.f7914a;
        c40.b bVar = c40.c.f7825a;
        return g10.u.v(j12 - (bVar != null ? bVar.b() : System.nanoTime()), 0L);
    }

    public void L0(@m80.k Runnable runnable) {
        N0();
        if (Q0(runnable)) {
            x0();
        } else {
            v0.f7992g.L0(runnable);
        }
    }

    public final void N0() {
        c cVar;
        d dVar = (d) f7909e.get(this);
        if (dVar == null || dVar.i()) {
            return;
        }
        c40.b bVar = c40.c.f7825a;
        long b11 = bVar != null ? bVar.b() : System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c e11 = dVar.e();
                    if (e11 != null) {
                        c cVar2 = e11;
                        cVar = cVar2.f(b11) ? Q0(cVar2) : false ? dVar.m(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVar != null);
    }

    public final boolean Q0(Runnable runnable) {
        h40.x0 x0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7908d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (e()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f7908d, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof h40.f0) {
                kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                h40.f0 f0Var = (h40.f0) obj;
                int a11 = f0Var.a(runnable);
                if (a11 == 0) {
                    return true;
                }
                if (a11 == 1) {
                    androidx.concurrent.futures.a.a(f7908d, this, obj, f0Var.r());
                } else if (a11 == 2) {
                    return false;
                }
            } else {
                x0Var = s1.f7961h;
                if (obj == x0Var) {
                    return false;
                }
                h40.f0 f0Var2 = new h40.f0(8, true);
                kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                f0Var2.a((Runnable) obj);
                f0Var2.a(runnable);
                if (androidx.concurrent.futures.a.a(f7908d, this, obj, f0Var2)) {
                    return true;
                }
            }
        }
    }

    public final /* synthetic */ Object R0() {
        return this._delayed$volatile;
    }

    public final /* synthetic */ int Y0() {
        return this._isCompleted$volatile;
    }

    @Override // c40.o1
    public boolean a0() {
        h40.x0 x0Var;
        if (!f0()) {
            return false;
        }
        d dVar = (d) f7909e.get(this);
        if (dVar != null && !dVar.i()) {
            return false;
        }
        Object obj = f7908d.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof h40.f0) {
            return ((h40.f0) obj).m();
        }
        x0Var = s1.f7961h;
        return obj == x0Var;
    }

    public final /* synthetic */ Object a1() {
        return this._queue$volatile;
    }

    @Override // c40.m0
    public final void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        L0(runnable);
    }

    @Override // c40.z0
    @m80.k
    public k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        return z0.a.b(this, j11, runnable, dVar);
    }

    public final void f1() {
        c o11;
        c40.b bVar = c40.c.f7825a;
        long b11 = bVar != null ? bVar.b() : System.nanoTime();
        while (true) {
            d dVar = (d) f7909e.get(this);
            if (dVar == null || (o11 = dVar.o()) == null) {
                return;
            } else {
                w0(b11, o11);
            }
        }
    }

    public final void g1() {
        f7908d.set(this, null);
        f7909e.set(this, null);
    }

    @Override // c40.o1
    public long h0() {
        if (i0()) {
            return 0L;
        }
        N0();
        Runnable F0 = F0();
        if (F0 == null) {
            return I();
        }
        F0.run();
        return 0L;
    }

    public final void h1(long j11, @m80.k c cVar) {
        int i12 = i1(j11, cVar);
        if (i12 == 0) {
            if (o1(cVar)) {
                x0();
            }
        } else if (i12 == 1) {
            w0(j11, cVar);
        } else if (i12 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int i1(long j11, c cVar) {
        if (e()) {
            return 1;
        }
        d dVar = (d) f7909e.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f7909e, this, null, new d(j11));
            Object obj = f7909e.get(this);
            kotlin.jvm.internal.g0.m(obj);
            dVar = (d) obj;
        }
        return cVar.d(j11, dVar, this);
    }

    @Override // c40.z0
    public void j(long j11, @m80.k n<? super yz.g2> nVar) {
        long d11 = s1.d(j11);
        if (d11 < 4611686018427387903L) {
            c40.b bVar = c40.c.f7825a;
            long b11 = bVar != null ? bVar.b() : System.nanoTime();
            a aVar = new a(d11 + b11, nVar);
            h1(b11, aVar);
            r.a(nVar, aVar);
        }
    }

    @m80.k
    public final k1 j1(long j11, @m80.k Runnable runnable) {
        long d11 = s1.d(j11);
        if (d11 >= 4611686018427387903L) {
            return y2.f8014a;
        }
        c40.b bVar = c40.c.f7825a;
        long b11 = bVar != null ? bVar.b() : System.nanoTime();
        b bVar2 = new b(d11 + b11, runnable);
        h1(b11, bVar2);
        return bVar2;
    }

    @Override // c40.z0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @m80.k j00.c<? super yz.g2> cVar) {
        return z0.a.a(this, j11, cVar);
    }

    public final void k1(boolean z11) {
        f7910f.set(this, z11 ? 1 : 0);
    }

    public final /* synthetic */ void l1(Object obj) {
        this._delayed$volatile = obj;
    }

    public final /* synthetic */ void m1(int i11) {
        this._isCompleted$volatile = i11;
    }

    public final /* synthetic */ void n1(Object obj) {
        this._queue$volatile = obj;
    }

    public final boolean o1(c cVar) {
        d dVar = (d) f7909e.get(this);
        return (dVar != null ? dVar.j() : null) == cVar;
    }

    @Override // c40.o1
    public void shutdown() {
        o3.f7899a.c();
        k1(true);
        E0();
        while (h0() <= 0) {
        }
        f1();
    }
}
