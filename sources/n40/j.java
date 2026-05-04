package n40;

import c40.n;
import c40.r;
import c40.z3;
import com.google.common.util.concurrent.s2;
import h40.v0;
import h40.x0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n444#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
/* loaded from: classes8.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74447c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f74448d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74449e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f74450f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f74451g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f74452a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q<Throwable, g2, kotlin.coroutines.d, g2> f74453b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements p<Long, m, m> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f74454a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m a(long j11, m mVar) {
            m j12;
            j12 = l.j(j11, mVar);
            return j12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ m invoke(Long l11, m mVar) {
            return a(l11.longValue(), mVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements p<Long, m, m> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f74455a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m a(long j11, m mVar) {
            m j12;
            j12 = l.j(j11, mVar);
            return j12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ m invoke(Long l11, m mVar) {
            return a(l11.longValue(), mVar);
        }
    }

    public j(int i11, int i12) {
        this.f74452a = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i11).toString());
        }
        if (i12 < 0 || i12 > i11) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i11).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i11 - i12;
        this.f74453b = new q() { // from class: n40.i
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                g2 x11;
                x11 = j.x(j.this, (Throwable) obj, (g2) obj2, (kotlin.coroutines.d) obj3);
                return x11;
            }
        };
    }

    public static final g2 x(j jVar, Throwable th2, g2 g2Var, kotlin.coroutines.d dVar) {
        jVar.release();
        return g2.f100423a;
    }

    public final /* synthetic */ void A(Object obj) {
        this.head$volatile = obj;
    }

    public final /* synthetic */ void B(Object obj) {
        this.tail$volatile = obj;
    }

    public final /* synthetic */ void C(int i11) {
        this._availablePermits$volatile = i11;
    }

    public final boolean D(Object obj) {
        if (!(obj instanceof n)) {
            if (obj instanceof k40.n) {
                return ((k40.n) obj).h(this, g2.f100423a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        n nVar = (n) obj;
        Object n11 = nVar.n(g2.f100423a, null, this.f74453b);
        if (n11 == null) {
            return false;
        }
        nVar.s(n11);
        return true;
    }

    public final boolean E() {
        int i11;
        Object i12;
        int i13;
        x0 x0Var;
        x0 x0Var2;
        int i14;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        m mVar = (m) f74447c.get(this);
        long andIncrement = f74448d.getAndIncrement(this);
        i11 = l.f74461f;
        long j11 = andIncrement / i11;
        b bVar = b.f74455a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74447c;
        loop0: while (true) {
            i12 = h40.e.i(mVar, j11, bVar);
            if (v0.h(i12)) {
                break;
            }
            h40.u0 f11 = v0.f(i12);
            while (true) {
                h40.u0 u0Var = (h40.u0) atomicReferenceFieldUpdater.get(this);
                if (u0Var.f58276c >= f11.f58276c) {
                    break loop0;
                }
                if (!f11.C()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, u0Var, f11)) {
                    if (u0Var.v()) {
                        u0Var.q();
                    }
                } else if (f11.v()) {
                    f11.q();
                }
            }
        }
        m mVar2 = (m) v0.f(i12);
        mVar2.c();
        if (mVar2.f58276c > j11) {
            return false;
        }
        i13 = l.f74461f;
        int i15 = (int) (andIncrement % i13);
        x0Var = l.f74457b;
        Object andSet = mVar2.F().getAndSet(i15, x0Var);
        if (andSet != null) {
            x0Var2 = l.f74460e;
            if (andSet == x0Var2) {
                return false;
            }
            return D(andSet);
        }
        i14 = l.f74456a;
        for (int i16 = 0; i16 < i14; i16++) {
            Object obj = mVar2.F().get(i15);
            x0Var5 = l.f74458c;
            if (obj == x0Var5) {
                return true;
            }
        }
        x0Var3 = l.f74457b;
        x0Var4 = l.f74459d;
        return !s2.a(mVar2.F(), i15, x0Var3, x0Var4);
    }

    @m80.l
    public final Object a(@m80.k j00.c<? super g2> cVar) {
        if (l() > 0) {
            return g2.f100423a;
        }
        Object i11 = i(cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    public final boolean b() {
        while (true) {
            int i11 = f74451g.get(this);
            if (i11 > this.f74452a) {
                k();
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (f74451g.compareAndSet(this, i11, i11 - 1)) {
                    return true;
                }
            }
        }
    }

    public final int c() {
        return Math.max(f74451g.get(this), 0);
    }

    public final void g(@m80.k n<? super g2> nVar) {
        while (l() <= 0) {
            g0.n(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((z3) nVar)) {
                return;
            }
        }
        nVar.A(g2.f100423a, this.f74453b);
    }

    public final <W> void h(W w11, x00.l<? super W, Boolean> lVar, x00.l<? super W, g2> lVar2) {
        while (l() <= 0) {
            if (lVar.invoke(w11).booleanValue()) {
                return;
            }
        }
        lVar2.invoke(w11);
    }

    public final Object i(j00.c<? super g2> cVar) {
        c40.p b11 = r.b(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        try {
            if (!j(b11)) {
                g(b11);
            }
            Object F = b11.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return F == kotlin.coroutines.intrinsics.b.l() ? F : g2.f100423a;
        } catch (Throwable th2) {
            b11.X();
            throw th2;
        }
    }

    public final boolean j(z3 z3Var) {
        int i11;
        Object i12;
        int i13;
        x0 x0Var;
        x0 x0Var2;
        m mVar = (m) f74449e.get(this);
        long andIncrement = f74450f.getAndIncrement(this);
        a aVar = a.f74454a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74449e;
        i11 = l.f74461f;
        long j11 = andIncrement / i11;
        loop0: while (true) {
            i12 = h40.e.i(mVar, j11, aVar);
            if (!v0.h(i12)) {
                h40.u0 f11 = v0.f(i12);
                while (true) {
                    h40.u0 u0Var = (h40.u0) atomicReferenceFieldUpdater.get(this);
                    if (u0Var.f58276c >= f11.f58276c) {
                        break loop0;
                    }
                    if (!f11.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, u0Var, f11)) {
                        if (u0Var.v()) {
                            u0Var.q();
                        }
                    } else if (f11.v()) {
                        f11.q();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) v0.f(i12);
        i13 = l.f74461f;
        int i14 = (int) (andIncrement % i13);
        if (s2.a(mVar2.F(), i14, null, z3Var)) {
            z3Var.b(mVar2, i14);
            return true;
        }
        x0Var = l.f74457b;
        x0Var2 = l.f74458c;
        if (!s2.a(mVar2.F(), i14, x0Var, x0Var2)) {
            return false;
        }
        if (z3Var instanceof n) {
            g0.n(z3Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((n) z3Var).A(g2.f100423a, this.f74453b);
        } else {
            if (!(z3Var instanceof k40.n)) {
                throw new IllegalStateException(("unexpected: " + z3Var).toString());
            }
            ((k40.n) z3Var).e(g2.f100423a);
        }
        return true;
    }

    public final void k() {
        int i11;
        do {
            i11 = f74451g.get(this);
            if (i11 <= this.f74452a) {
                return;
            }
        } while (!f74451g.compareAndSet(this, i11, this.f74452a));
    }

    public final int l() {
        int andDecrement;
        do {
            andDecrement = f74451g.getAndDecrement(this);
        } while (andDecrement > this.f74452a);
        return andDecrement;
    }

    public final /* synthetic */ long m() {
        return this.deqIdx$volatile;
    }

    public final /* synthetic */ long o() {
        return this.enqIdx$volatile;
    }

    public final /* synthetic */ Object q() {
        return this.head$volatile;
    }

    public final void release() {
        do {
            int andIncrement = f74451g.getAndIncrement(this);
            if (andIncrement >= this.f74452a) {
                k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f74452a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!E());
    }

    public final /* synthetic */ Object s() {
        return this.tail$volatile;
    }

    public final /* synthetic */ int u() {
        return this._availablePermits$volatile;
    }

    public final void w(@m80.k k40.n<?> nVar, @m80.l Object obj) {
        while (l() <= 0) {
            g0.n(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((z3) nVar)) {
                return;
            }
        }
        nVar.e(g2.f100423a);
    }

    public final /* synthetic */ void y(long j11) {
        this.deqIdx$volatile = j11;
    }

    public final /* synthetic */ void z(long j11) {
        this.enqIdx$volatile = j11;
    }
}
