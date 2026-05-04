package kotlinx.coroutines.scheduling;

import g10.u;
import h40.s0;
import h40.x0;
import j40.i;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.g;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1041:1\n286#1:1044\n284#1:1045\n284#1:1046\n286#1:1047\n281#1:1050\n282#1,5:1051\n292#1:1057\n284#1:1058\n285#1:1059\n284#1:1062\n285#1:1063\n281#1:1064\n289#1:1065\n284#1:1066\n284#1:1069\n285#1:1070\n286#1:1071\n77#2:1042\n77#2:1056\n77#2:1067\n1#3:1043\n29#4:1048\n29#4:1060\n16#5:1049\n16#5:1061\n619#6:1068\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1044\n289#1:1045\n290#1:1046\n299#1:1047\n348#1:1050\n377#1:1051,5\n400#1:1057\n444#1:1058\n445#1:1059\n481#1:1062\n482#1:1063\n488#1:1064\n497#1:1065\n497#1:1066\n578#1:1069\n579#1:1070\n580#1:1071\n120#1:1042\n397#1:1056\n514#1:1067\n348#1:1048\n477#1:1060\n348#1:1049\n477#1:1061\n521#1:1068\n*E\n"})
/* loaded from: classes8.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f68448h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f68449i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f68450j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68451k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    @g
    @k
    public static final x0 f68452l = new x0("NOT_IN_STACK");

    /* renamed from: m, reason: collision with root package name */
    public static final int f68453m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f68454n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f68455o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f68456p = 21;

    /* renamed from: q, reason: collision with root package name */
    public static final long f68457q = 2097151;

    /* renamed from: r, reason: collision with root package name */
    public static final long f68458r = 4398044413952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f68459s = 42;

    /* renamed from: t, reason: collision with root package name */
    public static final long f68460t = 9223367638808264704L;

    /* renamed from: u, reason: collision with root package name */
    public static final int f68461u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f68462v = 2097150;

    /* renamed from: w, reason: collision with root package name */
    public static final long f68463w = 2097151;

    /* renamed from: x, reason: collision with root package name */
    public static final long f68464x = -2097152;

    /* renamed from: y, reason: collision with root package name */
    public static final long f68465y = 2097152;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    @g
    public final int f68466a;

    /* renamed from: b, reason: collision with root package name */
    @g
    public final int f68467b;

    /* renamed from: c, reason: collision with root package name */
    @g
    public final long f68468c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    @g
    @k
    public final String f68469d;

    /* renamed from: e, reason: collision with root package name */
    @g
    @k
    public final j40.c f68470e;

    /* renamed from: f, reason: collision with root package name */
    @g
    @k
    public final j40.c f68471f;

    /* renamed from: g, reason: collision with root package name */
    @g
    @k
    public final s0<c> f68472g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class WorkerState {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ WorkerState[] $VALUES;
        public static final WorkerState CPU_ACQUIRED = new WorkerState("CPU_ACQUIRED", 0);
        public static final WorkerState BLOCKING = new WorkerState("BLOCKING", 1);
        public static final WorkerState PARKING = new WorkerState("PARKING", 2);
        public static final WorkerState DORMANT = new WorkerState("DORMANT", 3);
        public static final WorkerState TERMINATED = new WorkerState("TERMINATED", 4);

        private static final /* synthetic */ WorkerState[] $values() {
            return new WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            WorkerState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private WorkerState(String str, int i11) {
        }

        @k
        public static m00.a<WorkerState> getEntries() {
            return $ENTRIES;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68473a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f68473a = iArr;
        }
    }

    public CoroutineScheduler(int i11, int i12, long j11, @k String str) {
        this.f68466a = i11;
        this.f68467b = i12;
        this.f68468c = j11;
        this.f68469d = str;
        if (i11 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i11 + " should be at least 1").toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("Max pool size " + i12 + " should be greater than or equals to core pool size " + i11).toString());
        }
        if (i12 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i12 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j11 > 0) {
            this.f68470e = new j40.c();
            this.f68471f = new j40.c();
            this.f68472g = new s0<>((i11 + 1) * 2);
            this.controlState$volatile = i11 << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j11 + " must be positive").toString());
    }

    public static /* synthetic */ boolean G0(CoroutineScheduler coroutineScheduler, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = f68450j.get(coroutineScheduler);
        }
        return coroutineScheduler.F0(j11);
    }

    public static /* synthetic */ void H(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        coroutineScheduler.E(runnable, z11, z12);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater S() {
        return f68450j;
    }

    public final void A0(long j11) {
        if (H0() || F0(j11)) {
            return;
        }
        H0();
    }

    public final int C() {
        return (int) (S().getAndDecrement(this) & 2097151);
    }

    public final void C0() {
        if (H0() || G0(this, 0L, 1, null)) {
            return;
        }
        H0();
    }

    public final j40.g D0(c cVar, j40.g gVar, boolean z11) {
        WorkerState workerState;
        if (cVar == null || (workerState = cVar.f68477c) == WorkerState.TERMINATED) {
            return gVar;
        }
        if (!gVar.f63193b && workerState == WorkerState.BLOCKING) {
            return gVar;
        }
        cVar.f68481g = true;
        return cVar.f68475a.a(gVar, z11);
    }

    public final void E(@k Runnable runnable, boolean z11, boolean z12) {
        c40.b bVar = c40.c.f7825a;
        if (bVar != null) {
            bVar.e();
        }
        j40.g k11 = k(runnable, z11);
        boolean z13 = k11.f63193b;
        long addAndGet = z13 ? f68450j.addAndGet(this, 2097152L) : 0L;
        j40.g D0 = D0(r(), k11, z12);
        if (D0 != null && !c(D0)) {
            throw new RejectedExecutionException(this.f68469d + " was terminated");
        }
        if (z13) {
            A0(addAndGet);
        } else {
            C0();
        }
    }

    public final boolean E0() {
        long j11;
        AtomicLongFieldUpdater S = S();
        do {
            j11 = S.get(this);
            if (((int) ((f68460t & j11) >> 42)) == 0) {
                return false;
            }
        } while (!S().compareAndSet(this, j11, j11 - 4398046511104L));
        return true;
    }

    public final boolean F0(long j11) {
        if (u.u(((int) (2097151 & j11)) - ((int) ((j11 & f68458r) >> 21)), 0) < this.f68466a) {
            int j12 = j();
            if (j12 == 1 && this.f68466a > 1) {
                j();
            }
            if (j12 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H0() {
        c k02;
        do {
            k02 = k0();
            if (k02 == null) {
                return false;
            }
        } while (!c.f68474i.compareAndSet(k02, -1, 0));
        LockSupport.unpark(k02);
        return true;
    }

    public final int I() {
        return (int) ((f68450j.get(this) & f68460t) >> 42);
    }

    public final /* synthetic */ long L() {
        return this.controlState$volatile;
    }

    public final int U() {
        return (int) (S().get(this) & 2097151);
    }

    public final /* synthetic */ long V() {
        return this.parkedWorkersStack$volatile;
    }

    public final /* synthetic */ int a0() {
        return this._isTerminated$volatile;
    }

    public final boolean c(j40.g gVar) {
        return gVar.f63193b ? this.f68471f.a(gVar) : this.f68470e.a(gVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z0(10000L);
    }

    public final long d0() {
        return f68450j.addAndGet(this, 2097152L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@k Runnable runnable) {
        H(this, runnable, false, false, 6, null);
    }

    public final int f(long j11) {
        return (int) ((j11 & f68460t) >> 42);
    }

    public final int f0() {
        return (int) (f68450j.incrementAndGet(this) & 2097151);
    }

    public final /* synthetic */ void h0(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l<? super Long, g2> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final int i(long j11) {
        return (int) ((j11 & f68458r) >> 21);
    }

    public final int i0(c cVar) {
        Object h11 = cVar.h();
        while (h11 != f68452l) {
            if (h11 == null) {
                return 0;
            }
            c cVar2 = (c) h11;
            int g11 = cVar2.g();
            if (g11 != 0) {
                return g11;
            }
            h11 = cVar2.h();
        }
        return -1;
    }

    public final boolean isTerminated() {
        return f68451k.get(this) == 1;
    }

    public final int j() {
        synchronized (this.f68472g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j11 = f68450j.get(this);
                int i11 = (int) (j11 & 2097151);
                int u11 = u.u(i11 - ((int) ((j11 & f68458r) >> 21)), 0);
                if (u11 >= this.f68466a) {
                    return 0;
                }
                if (i11 >= this.f68467b) {
                    return 0;
                }
                int i12 = ((int) (S().get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f68472g.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i12);
                this.f68472g.c(i12, cVar);
                if (i12 != ((int) (2097151 & f68450j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = u11 + 1;
                cVar.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @k
    public final j40.g k(@k Runnable runnable, boolean z11) {
        long a11 = i.f63200f.a();
        if (!(runnable instanceof j40.g)) {
            return i.b(runnable, a11, z11);
        }
        j40.g gVar = (j40.g) runnable;
        gVar.f63192a = a11;
        gVar.f63193b = z11;
        return gVar;
    }

    public final c k0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f68449i;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            c b11 = this.f68472g.b((int) (2097151 & j11));
            if (b11 == null) {
                return null;
            }
            long j12 = (2097152 + j11) & f68464x;
            int i02 = i0(b11);
            if (i02 >= 0 && f68449i.compareAndSet(this, j11, i02 | j12)) {
                b11.t(f68452l);
                return b11;
            }
        }
    }

    public final boolean m0(@k c cVar) {
        long j11;
        long j12;
        int g11;
        if (cVar.h() != f68452l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f68449i;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = (2097152 + j11) & f68464x;
            g11 = cVar.g();
            cVar.t(this.f68472g.b((int) (2097151 & j11)));
        } while (!f68449i.compareAndSet(this, j11, j12 | g11));
        return true;
    }

    public final void o0(@k c cVar, int i11, int i12) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f68449i;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            int i13 = (int) (2097151 & j11);
            long j12 = (2097152 + j11) & f68464x;
            if (i13 == i11) {
                i13 = i12 == 0 ? i0(cVar) : i12;
            }
            if (i13 >= 0) {
                if (f68449i.compareAndSet(this, j11, j12 | i13)) {
                    return;
                }
            }
        }
    }

    public final int q(long j11) {
        return (int) (j11 & 2097151);
    }

    public final c r() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !g0.g(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    public final long s0() {
        return S().addAndGet(this, 4398046511104L);
    }

    @k
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a11 = this.f68472g.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a11; i16++) {
            c b11 = this.f68472g.b(i16);
            if (b11 != null) {
                int n11 = b11.f68475a.n();
                int i17 = b.f68473a[b11.f68477c.ordinal()];
                if (i17 == 1) {
                    i13++;
                } else if (i17 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(n11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(n11);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i14++;
                    if (n11 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(n11);
                        sb4.append(io.ktor.util.date.b.f62000f);
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15++;
                }
            }
        }
        long j11 = f68450j.get(this);
        return this.f68469d + '@' + c40.u0.b(this) + "[Pool Size {core = " + this.f68466a + ", max = " + this.f68467b + "}, Worker States {CPU = " + i11 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f68470e.c() + ", global blocking queue size = " + this.f68471f.c() + ", Control State {created workers= " + ((int) (2097151 & j11)) + ", blocking tasks = " + ((int) ((f68458r & j11) >> 21)) + ", CPUs acquired = " + (this.f68466a - ((int) ((f68460t & j11) >> 42))) + "}]";
    }

    public final void v0(@k j40.g gVar) {
        try {
            gVar.run();
        } catch (Throwable th2) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                c40.b bVar = c40.c.f7825a;
                if (bVar != null) {
                    bVar.f();
                }
            } finally {
                c40.b bVar2 = c40.c.f7825a;
                if (bVar2 != null) {
                    bVar2.f();
                }
            }
        }
    }

    public final void w() {
        S().addAndGet(this, f68464x);
    }

    public final /* synthetic */ void w0(long j11) {
        this.controlState$volatile = j11;
    }

    public final /* synthetic */ void x0(long j11) {
        this.parkedWorkersStack$volatile = j11;
    }

    public final /* synthetic */ void y0(int i11) {
        this._isTerminated$volatile = i11;
    }

    public final void z0(long j11) {
        int i11;
        j40.g j12;
        if (f68451k.compareAndSet(this, 0, 1)) {
            c r11 = r();
            synchronized (this.f68472g) {
                i11 = (int) (S().get(this) & 2097151);
            }
            if (1 <= i11) {
                int i12 = 1;
                while (true) {
                    c b11 = this.f68472g.b(i12);
                    g0.m(b11);
                    c cVar = b11;
                    if (cVar != r11) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j11);
                        }
                        cVar.f68475a.o(this.f68471f);
                    }
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f68471f.b();
            this.f68470e.b();
            while (true) {
                if (r11 != null) {
                    j12 = r11.f(true);
                    if (j12 != null) {
                        continue;
                        v0(j12);
                    }
                }
                j12 = this.f68470e.j();
                if (j12 == null && (j12 = this.f68471f.j()) == null) {
                    break;
                }
                v0(j12);
            }
            if (r11 != null) {
                r11.x(WorkerState.TERMINATED);
            }
            f68449i.set(this, 0L);
            f68450j.set(this, 0L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1041:1\n298#2,2:1042\n286#2:1044\n300#2,4:1045\n305#2:1049\n295#2,2:1050\n295#2,2:1055\n281#2:1059\n290#2:1060\n284#2:1061\n281#2:1062\n1#3:1052\n77#4:1053\n77#4:1054\n29#5:1057\n16#6:1058\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n684#1:1042,2\n684#1:1044\n684#1:1045,4\n699#1:1049\n773#1:1050,2\n821#1:1055,2\n872#1:1059\n898#1:1060\n898#1:1061\n971#1:1062\n812#1:1053\n815#1:1054\n868#1:1057\n868#1:1058\n*E\n"})
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f68474i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        @g
        @k
        public final j40.k f68475a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Ref.ObjectRef<j40.g> f68476b;

        /* renamed from: c, reason: collision with root package name */
        @g
        @k
        public WorkerState f68477c;

        /* renamed from: d, reason: collision with root package name */
        public long f68478d;

        /* renamed from: e, reason: collision with root package name */
        public long f68479e;

        /* renamed from: f, reason: collision with root package name */
        public int f68480f;

        /* renamed from: g, reason: collision with root package name */
        @g
        public boolean f68481g;
        private volatile int indexInArray;

        @m80.l
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f68475a = new j40.k();
            this.f68476b = new Ref.ObjectRef<>();
            this.f68477c = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f68452l;
            int nanoTime = (int) System.nanoTime();
            this.f68480f = nanoTime == 0 ? 42 : nanoTime;
        }

        public final void b(j40.g gVar) {
            this.f68478d = 0L;
            if (this.f68477c == WorkerState.PARKING) {
                this.f68477c = WorkerState.BLOCKING;
            }
            if (!gVar.f63193b) {
                CoroutineScheduler.this.v0(gVar);
                return;
            }
            if (x(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.C0();
            }
            CoroutineScheduler.this.v0(gVar);
            CoroutineScheduler.S().addAndGet(CoroutineScheduler.this, CoroutineScheduler.f68464x);
            if (this.f68477c != WorkerState.TERMINATED) {
                this.f68477c = WorkerState.DORMANT;
            }
        }

        public final j40.g c(boolean z11) {
            j40.g p11;
            j40.g p12;
            if (z11) {
                boolean z12 = n(CoroutineScheduler.this.f68466a * 2) == 0;
                if (z12 && (p12 = p()) != null) {
                    return p12;
                }
                j40.g p13 = this.f68475a.p();
                if (p13 != null) {
                    return p13;
                }
                if (!z12 && (p11 = p()) != null) {
                    return p11;
                }
            } else {
                j40.g p14 = p();
                if (p14 != null) {
                    return p14;
                }
            }
            return y(3);
        }

        public final j40.g d() {
            j40.g q11 = this.f68475a.q();
            if (q11 != null) {
                return q11;
            }
            j40.g j11 = CoroutineScheduler.this.f68471f.j();
            return j11 == null ? y(1) : j11;
        }

        public final j40.g e() {
            j40.g s11 = this.f68475a.s();
            if (s11 != null) {
                return s11;
            }
            j40.g j11 = CoroutineScheduler.this.f68471f.j();
            return j11 == null ? y(2) : j11;
        }

        @m80.l
        public final j40.g f(boolean z11) {
            return v() ? c(z11) : d();
        }

        public final int g() {
            return this.indexInArray;
        }

        @m80.l
        public final Object h() {
            return this.nextParkedWorker;
        }

        @k
        public final CoroutineScheduler i() {
            return CoroutineScheduler.this;
        }

        public final /* synthetic */ int j() {
            return this.workerCtl$volatile;
        }

        public final boolean l() {
            return this.nextParkedWorker != CoroutineScheduler.f68452l;
        }

        public final boolean m() {
            return this.f68477c == WorkerState.BLOCKING;
        }

        public final int n(int i11) {
            int i12 = this.f68480f;
            int i13 = i12 ^ (i12 << 13);
            int i14 = i13 ^ (i13 >> 17);
            int i15 = i14 ^ (i14 << 5);
            this.f68480f = i15;
            int i16 = i11 - 1;
            return (i16 & i11) == 0 ? i15 & i16 : (i15 & Integer.MAX_VALUE) % i11;
        }

        public final void o() {
            if (this.f68478d == 0) {
                this.f68478d = System.nanoTime() + CoroutineScheduler.this.f68468c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f68468c);
            if (System.nanoTime() - this.f68478d >= 0) {
                this.f68478d = 0L;
                z();
            }
        }

        public final j40.g p() {
            if (n(2) == 0) {
                j40.g j11 = CoroutineScheduler.this.f68470e.j();
                return j11 != null ? j11 : CoroutineScheduler.this.f68471f.j();
            }
            j40.g j12 = CoroutineScheduler.this.f68471f.j();
            return j12 != null ? j12 : CoroutineScheduler.this.f68470e.j();
        }

        public final long q() {
            boolean z11 = this.f68477c == WorkerState.CPU_ACQUIRED;
            j40.g e11 = z11 ? e() : d();
            if (e11 == null) {
                long j11 = this.f68479e;
                if (j11 == 0) {
                    return -1L;
                }
                return j11;
            }
            CoroutineScheduler.this.v0(e11);
            if (!z11) {
                CoroutineScheduler.S().addAndGet(CoroutineScheduler.this, CoroutineScheduler.f68464x);
            }
            return 0L;
        }

        public final void r() {
            loop0: while (true) {
                boolean z11 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f68477c != WorkerState.TERMINATED) {
                    j40.g f11 = f(this.f68481g);
                    if (f11 != null) {
                        this.f68479e = 0L;
                        b(f11);
                    } else {
                        this.f68481g = false;
                        if (this.f68479e == 0) {
                            w();
                        } else if (z11) {
                            x(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f68479e);
                            this.f68479e = 0L;
                        } else {
                            z11 = true;
                        }
                    }
                }
            }
            x(WorkerState.TERMINATED);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            r();
        }

        public final void s(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f68469d);
            sb2.append("-worker-");
            sb2.append(i11 == 0 ? "TERMINATED" : String.valueOf(i11));
            setName(sb2.toString());
            this.indexInArray = i11;
        }

        public final void t(@m80.l Object obj) {
            this.nextParkedWorker = obj;
        }

        public final /* synthetic */ void u(int i11) {
            this.workerCtl$volatile = i11;
        }

        public final boolean v() {
            long j11;
            if (this.f68477c == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater S = CoroutineScheduler.S();
            do {
                j11 = S.get(coroutineScheduler);
                if (((int) ((CoroutineScheduler.f68460t & j11) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.S().compareAndSet(coroutineScheduler, j11, j11 - 4398046511104L));
            this.f68477c = WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final void w() {
            if (!l()) {
                CoroutineScheduler.this.m0(this);
                return;
            }
            f68474i.set(this, -1);
            while (l() && f68474i.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f68477c != WorkerState.TERMINATED) {
                x(WorkerState.PARKING);
                Thread.interrupted();
                o();
            }
        }

        public final boolean x(@k WorkerState workerState) {
            WorkerState workerState2 = this.f68477c;
            boolean z11 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z11) {
                CoroutineScheduler.S().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f68477c = workerState;
            }
            return z11;
        }

        public final j40.g y(int i11) {
            int i12 = (int) (CoroutineScheduler.S().get(CoroutineScheduler.this) & 2097151);
            if (i12 < 2) {
                return null;
            }
            int n11 = n(i12);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j11 = Long.MAX_VALUE;
            for (int i13 = 0; i13 < i12; i13++) {
                n11++;
                if (n11 > i12) {
                    n11 = 1;
                }
                c b11 = coroutineScheduler.f68472g.b(n11);
                if (b11 != null && b11 != this) {
                    long B = b11.f68475a.B(i11, this.f68476b);
                    if (B == -1) {
                        Ref.ObjectRef<j40.g> objectRef = this.f68476b;
                        j40.g gVar = objectRef.element;
                        objectRef.element = null;
                        return gVar;
                    }
                    if (B > 0) {
                        j11 = Math.min(j11, B);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f68479e = j11;
            return null;
        }

        public final void z() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f68472g) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.S().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f68466a) {
                        return;
                    }
                    if (f68474i.compareAndSet(this, -1, 1)) {
                        int i11 = this.indexInArray;
                        s(0);
                        coroutineScheduler.o0(this, i11, 0);
                        int andDecrement = (int) (CoroutineScheduler.S().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i11) {
                            c b11 = coroutineScheduler.f68472g.b(andDecrement);
                            g0.m(b11);
                            c cVar = b11;
                            coroutineScheduler.f68472g.c(i11, cVar);
                            cVar.s(i11);
                            coroutineScheduler.o0(cVar, andDecrement, i11);
                        }
                        coroutineScheduler.f68472g.c(andDecrement, null);
                        g2 g2Var = g2.f100423a;
                        this.f68477c = WorkerState.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public c(CoroutineScheduler coroutineScheduler, int i11) {
            this();
            s(i11);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i11, int i12, long j11, String str, int i13, v vVar) {
        this(i11, i12, (i13 & 4) != 0 ? i.f63199e : j11, (i13 & 8) != 0 ? i.f63195a : str);
    }
}
