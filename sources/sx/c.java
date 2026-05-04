package sx;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLockFreeMPSCQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueueCore\n+ 2 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueueCore$Companion\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n234#2,3:244\n234#2,3:253\n234#2,3:258\n234#2,3:263\n234#2,3:273\n476#3,4:247\n467#3,2:251\n467#3,2:256\n467#3,2:261\n498#3,4:267\n154#3,2:271\n1#4:266\n*S KotlinDebug\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueueCore\n*L\n73#1:244,3\n88#1:253,3\n134#1:258,3\n157#1:263,3\n188#1:273,3\n76#1:247,4\n86#1:251,2\n132#1:256,2\n156#1:261,2\n174#1:267,4\n180#1:271,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f89028g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f89029h = 30;

    /* renamed from: i, reason: collision with root package name */
    public static final int f89030i = 1073741823;

    /* renamed from: j, reason: collision with root package name */
    public static final int f89031j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f89032k = 1073741823;

    /* renamed from: l, reason: collision with root package name */
    public static final int f89033l = 30;

    /* renamed from: m, reason: collision with root package name */
    public static final long f89034m = 1152921503533105152L;

    /* renamed from: n, reason: collision with root package name */
    public static final int f89035n = 60;

    /* renamed from: o, reason: collision with root package name */
    public static final long f89036o = 1152921504606846976L;

    /* renamed from: p, reason: collision with root package name */
    public static final int f89037p = 61;

    /* renamed from: q, reason: collision with root package name */
    public static final long f89038q = 2305843009213693952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f89040s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f89041t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f89042u = 2;

    @k
    private volatile /* synthetic */ Object _next = null;

    @k
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f89043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89044b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicReferenceArray<Object> f89045c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f89025d = new b(null);

    /* renamed from: r, reason: collision with root package name */
    @w00.g
    @k
    public static final Object f89039r = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f89026e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f89027f = AtomicLongFieldUpdater.newUpdater(c.class, "_state");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public String toString() {
            return "REMOVE_FROZEN";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public final int e(long j11) {
            return (j11 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long f(long j11, int i11) {
            return i(j11, 1073741823L) | i11;
        }

        public final long g(long j11, int i11) {
            return i(j11, 1152921503533105152L) | (i11 << 30);
        }

        public final <T> T h(long j11, p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) (1073741823 & j11)), Integer.valueOf((int) ((j11 & 1152921503533105152L) >> 30)));
        }

        public final long i(long j11, long j12) {
            return j11 & (~j12);
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sx.c$c, reason: collision with other inner class name */
    public static final class C1166c {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        public final int f89046a;

        public C1166c(int i11) {
            this.f89046a = i11;
        }
    }

    public c(int i11) {
        this.f89043a = i11;
        int i12 = i11 - 1;
        this.f89044b = i12;
        this.f89045c = new AtomicReferenceArray<>(i11);
        if (i12 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i11 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(@k E element) {
        long j11;
        int i11;
        g0.p(element, "element");
        do {
            j11 = this._state;
            if ((3458764513820540928L & j11) != 0) {
                return f89025d.e(j11);
            }
            i11 = (int) ((1152921503533105152L & j11) >> 30);
            int i12 = this.f89044b;
            if (((i11 + 2) & i12) == (((int) (1073741823 & j11)) & i12)) {
                return 1;
            }
        } while (!f89027f.compareAndSet(this, j11, f89025d.g(j11, (i11 + 1) & 1073741823)));
        this.f89045c.set(this.f89044b & i11, element);
        c<E> cVar = this;
        while ((cVar._state & 1152921504606846976L) != 0 && (cVar = cVar.h().e(i11, element)) != null) {
        }
        return 0;
    }

    public final c<E> b(long j11) {
        c<E> cVar = new c<>(this.f89043a * 2);
        int i11 = (int) (1073741823 & j11);
        int i12 = (int) ((1152921503533105152L & j11) >> 30);
        while (true) {
            int i13 = this.f89044b;
            if ((i11 & i13) == (i12 & i13)) {
                cVar._state = f89025d.i(j11, 1152921504606846976L);
                return cVar;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = cVar.f89045c;
            int i14 = cVar.f89044b & i11;
            Object obj = this.f89045c.get(i13 & i11);
            if (obj == null) {
                obj = new C1166c(i11);
            }
            atomicReferenceArray.set(i14, obj);
            i11++;
        }
    }

    public final c<E> c(long j11) {
        while (true) {
            c<E> cVar = (c) this._next;
            if (cVar != null) {
                return cVar;
            }
            androidx.concurrent.futures.a.a(f89026e, this, null, b(j11));
        }
    }

    public final boolean d() {
        long j11;
        do {
            j11 = this._state;
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!f89027f.compareAndSet(this, j11, j11 | 2305843009213693952L));
        return true;
    }

    public final c<E> e(int i11, E e11) {
        Object obj = this.f89045c.get(this.f89044b & i11);
        if (!(obj instanceof C1166c) || ((C1166c) obj).f89046a != i11) {
            return null;
        }
        this.f89045c.set(i11 & this.f89044b, e11);
        return this;
    }

    public final boolean f() {
        long j11 = this._state;
        return ((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30));
    }

    public final long g() {
        long j11;
        long j12;
        do {
            j11 = this._state;
            if ((j11 & 1152921504606846976L) != 0) {
                return j11;
            }
            j12 = j11 | 1152921504606846976L;
        } while (!f89027f.compareAndSet(this, j11, j12));
        return j12;
    }

    @k
    public final c<E> h() {
        return c(g());
    }

    @l
    public final Object i() {
        Object obj;
        long j11 = this._state;
        if ((1152921504606846976L & j11) != 0) {
            return f89039r;
        }
        int i11 = (int) (1073741823 & j11);
        int i12 = this.f89044b;
        if ((((int) ((1152921503533105152L & j11) >> 30)) & i12) == (i11 & i12) || (obj = this.f89045c.get(i12 & i11)) == null || (obj instanceof C1166c)) {
            return null;
        }
        int i13 = (i11 + 1) & 1073741823;
        if (f89027f.compareAndSet(this, j11, f89025d.f(j11, i13))) {
            this.f89045c.set(this.f89044b & i11, null);
            return obj;
        }
        c<E> cVar = this;
        do {
            cVar = cVar.j(i11, i13);
        } while (cVar != null);
        return obj;
    }

    public final c<E> j(int i11, int i12) {
        long j11;
        int i13;
        do {
            j11 = this._state;
            i13 = (int) (1073741823 & j11);
            if (i13 != i11) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((1152921504606846976L & j11) != 0) {
                return h();
            }
        } while (!f89027f.compareAndSet(this, j11, f89025d.f(j11, i12)));
        this.f89045c.set(this.f89044b & i13, null);
        return null;
    }
}
