package h40;

import a00.a0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f0<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f58199h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f58200i = 30;

    /* renamed from: j, reason: collision with root package name */
    public static final int f58201j = 1073741823;

    /* renamed from: k, reason: collision with root package name */
    public static final int f58202k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f58203l = 1073741823;

    /* renamed from: m, reason: collision with root package name */
    public static final int f58204m = 30;

    /* renamed from: n, reason: collision with root package name */
    public static final long f58205n = 1152921503533105152L;

    /* renamed from: o, reason: collision with root package name */
    public static final int f58206o = 60;

    /* renamed from: p, reason: collision with root package name */
    public static final long f58207p = 1152921504606846976L;

    /* renamed from: q, reason: collision with root package name */
    public static final int f58208q = 61;

    /* renamed from: r, reason: collision with root package name */
    public static final long f58209r = 2305843009213693952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f58210s = 1024;

    /* renamed from: u, reason: collision with root package name */
    public static final int f58212u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f58213v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f58214w = 2;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f58215a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f58218d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f58196e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58197f = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_next$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f58198g = AtomicLongFieldUpdater.newUpdater(f0.class, "_state$volatile");

    /* renamed from: t, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final x0 f58211t = new x0("REMOVE_FROZEN");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final int a(long j11) {
            return (j11 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j11, int i11) {
            return e(j11, 1073741823L) | i11;
        }

        public final long c(long j11, int i11) {
            return e(j11, 1152921503533105152L) | (i11 << 30);
        }

        public final <T> T d(long j11, @m80.k x00.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) (1073741823 & j11)), Integer.valueOf((int) ((j11 & 1152921503533105152L) >> 30)));
        }

        public final long e(long j11, long j12) {
            return j11 & (~j12);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        public final int f58219a;

        public b(int i11) {
            this.f58219a = i11;
        }
    }

    public f0(int i11, boolean z11) {
        this.f58215a = i11;
        this.f58216b = z11;
        int i12 = i11 - 1;
        this.f58217c = i12;
        this.f58218d = new AtomicReferenceArray(i11);
        if (i12 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i11 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(@m80.k E e11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f58198g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j11) != 0) {
                return f58196e.a(j11);
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.f58217c;
            if (((i12 + 2) & i13) == (i11 & i13)) {
                return 1;
            }
            if (!this.f58216b && f().get(i12 & i13) != null) {
                int i14 = this.f58215a;
                if (i14 < 1024 || ((i12 - i11) & 1073741823) > (i14 >> 1)) {
                    break;
                }
            } else if (f58198g.compareAndSet(this, j11, f58196e.c(j11, (i12 + 1) & 1073741823))) {
                f().set(i12 & i13, e11);
                f0<E> f0Var = this;
                while ((f58198g.get(f0Var) & 1152921504606846976L) != 0 && (f0Var = f0Var.r().e(i12, e11)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0<E> b(long j11) {
        f0<E> f0Var = new f0<>(this.f58215a * 2, this.f58216b);
        int i11 = (int) (1073741823 & j11);
        int i12 = (int) ((1152921503533105152L & j11) >> 30);
        while (true) {
            int i13 = this.f58217c;
            if ((i11 & i13) == (i13 & i12)) {
                f58198g.set(f0Var, f58196e.e(j11, 1152921504606846976L));
                return f0Var;
            }
            Object obj = f().get(this.f58217c & i11);
            if (obj == null) {
                obj = new b(i11);
            }
            f0Var.f().set(f0Var.f58217c & i11, obj);
            i11++;
        }
    }

    public final f0<E> c(long j11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58197f;
        while (true) {
            f0<E> f0Var = (f0) atomicReferenceFieldUpdater.get(this);
            if (f0Var != null) {
                return f0Var;
            }
            androidx.concurrent.futures.a.a(f58197f, this, null, b(j11));
        }
    }

    public final boolean d() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f58198g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, 2305843009213693952L | j11));
        return true;
    }

    public final f0<E> e(int i11, E e11) {
        Object obj = f().get(this.f58217c & i11);
        if (!(obj instanceof b) || ((b) obj).f58219a != i11) {
            return null;
        }
        f().set(i11 & this.f58217c, e11);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f58218d;
    }

    public final int g() {
        long j11 = f58198g.get(this);
        return (((int) ((j11 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j11))) & 1073741823;
    }

    public final /* synthetic */ Object h() {
        return this._next$volatile;
    }

    public final /* synthetic */ long j() {
        return this._state$volatile;
    }

    public final boolean l() {
        return (f58198g.get(this) & 2305843009213693952L) != 0;
    }

    public final boolean m() {
        long j11 = f58198g.get(this);
        return ((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30));
    }

    public final /* synthetic */ void n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final /* synthetic */ void o(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, x00.l<? super Long, g2> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    @m80.k
    public final <R> List<R> p(@m80.k x00.l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f58215a);
        long j11 = f58198g.get(this);
        int i11 = (int) (1073741823 & j11);
        int i12 = (int) ((j11 & 1152921503533105152L) >> 30);
        while (true) {
            int i13 = this.f58217c;
            if ((i11 & i13) == (i13 & i12)) {
                return arrayList;
            }
            a0.d dVar = (Object) f().get(this.f58217c & i11);
            if (dVar != null && !(dVar instanceof b)) {
                arrayList.add(lVar.invoke(dVar));
            }
            i11++;
        }
    }

    public final long q() {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f58198g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 1152921504606846976L) != 0) {
                return j11;
            }
            j12 = 1152921504606846976L | j11;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        return j12;
    }

    @m80.k
    public final f0<E> r() {
        return c(q());
    }

    @m80.l
    public final Object s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f58198g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j11) != 0) {
                return f58211t;
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = this.f58217c;
            if ((((int) ((1152921503533105152L & j11) >> 30)) & i12) == (i12 & i11)) {
                return null;
            }
            Object obj = f().get(this.f58217c & i11);
            if (obj == null) {
                if (this.f58216b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i11 + 1) & 1073741823;
                if (f58198g.compareAndSet(this, j11, f58196e.b(j11, i13))) {
                    f().set(this.f58217c & i11, null);
                    return obj;
                }
                if (this.f58216b) {
                    f0<E> f0Var = this;
                    do {
                        f0Var = f0Var.t(i11, i13);
                    } while (f0Var != null);
                    return obj;
                }
            }
        }
    }

    public final f0<E> t(int i11, int i12) {
        long j11;
        int i13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f58198g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            i13 = (int) (1073741823 & j11);
            if ((1152921504606846976L & j11) != 0) {
                return r();
            }
        } while (!f58198g.compareAndSet(this, j11, f58196e.b(j11, i12)));
        f().set(this.f58217c & i13, null);
        return null;
    }

    public final /* synthetic */ void u(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void v(long j11) {
        this._state$volatile = j11;
    }

    public final /* synthetic */ void w(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, x00.l<? super Long, Long> lVar) {
        while (true) {
            long j11 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j11, lVar.invoke(Long.valueOf(j11)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final /* synthetic */ long x(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, x00.l<? super Long, Long> lVar) {
        while (true) {
            long j11 = atomicLongFieldUpdater.get(obj);
            Long invoke = lVar.invoke(Long.valueOf(j11));
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j11, invoke.longValue())) {
                return invoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }
}
