package o40;

import c40.y1;
import h40.k1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.n;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineScheduler.kt\nkotlinx/coroutines/test/TestCoroutineScheduler\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,277:1\n29#2:278\n29#2:281\n29#2:283\n29#2:285\n29#2:287\n29#2:290\n29#2:299\n29#2:302\n29#2:311\n29#2:313\n16#3:279\n16#3:282\n16#3:284\n16#3:286\n16#3:288\n16#3:291\n16#3:300\n16#3:303\n16#3:312\n16#3:314\n1#4:280\n51#5:289\n52#5,7:292\n51#5:301\n52#5,7:304\n*S KotlinDebug\n*F\n+ 1 TestCoroutineScheduler.kt\nkotlinx/coroutines/test/TestCoroutineScheduler\n*L\n45#1:278\n71#1:281\n91#1:283\n127#1:285\n129#1:287\n130#1:290\n166#1:299\n168#1:302\n189#1:311\n79#1:313\n45#1:279\n71#1:282\n91#1:284\n127#1:286\n129#1:288\n130#1:291\n166#1:300\n168#1:303\n189#1:312\n79#1:314\n130#1:289\n130#1:292,7\n168#1:301\n168#1:304,7\n*E\n"})
/* loaded from: classes8.dex */
public final class b0 extends kotlin.coroutines.a implements d.b {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f75722g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f75723h = AtomicLongFieldUpdater.newUpdater(b0.class, "count$volatile");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k1<i0<Object>> f75724a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object f75725b;

    /* renamed from: c, reason: collision with root package name */
    public long f75726c;
    private volatile /* synthetic */ long count$volatile;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e40.o<g2> f75727d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final e40.o<g2> f75728e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final n.c f75729f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements d.c<b0> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends kotlin.time.b {
        public c(DurationUnit durationUnit) {
            super(durationUnit);
        }

        @Override // kotlin.time.b
        public long g() {
            return b0.this.i0();
        }
    }

    public b0() {
        super(f75722g);
        this.f75724a = new k1<>();
        this.f75725b = new Object();
        this.f75727d = e40.r.d(-1, null, null, 6, null);
        this.f75728e = e40.r.d(-1, null, null, 6, null);
        this.f75729f = new c(DurationUnit.MILLISECONDS);
    }

    public static /* synthetic */ boolean E0(b0 b0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return b0Var.A0(z11);
    }

    public static final boolean F0(i0 i0Var) {
        return !i0Var.f75753f.invoke().booleanValue();
    }

    public static final boolean Q0(x00.l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public static final void R0(b0 b0Var, i0 i0Var) {
        synchronized (b0Var.f75725b) {
            b0Var.f75724a.l(i0Var);
            g2 g2Var = g2.f100423a;
        }
    }

    public static final boolean a0(b0 b0Var) {
        boolean h11;
        h11 = c0.h(b0Var.f75724a, new PropertyReference1Impl() { // from class: o40.b0.b
            @Override // kotlin.jvm.internal.PropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return Boolean.valueOf(((i0) obj).f75752e);
            }
        });
        return h11;
    }

    public final boolean A0(boolean z11) {
        boolean i11;
        synchronized (this.f75725b) {
            try {
                i11 = z11 ? this.f75724a.i() : c0.h(this.f75724a, new x00.l() { // from class: o40.x
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        boolean F0;
                        F0 = b0.F0((i0) obj);
                        return Boolean.valueOf(F0);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @y1
    public final void I(long j11) {
        e.a aVar = kotlin.time.e.f67757b;
        L(kotlin.time.f.x(j11, DurationUnit.MILLISECONDS));
    }

    public final void L(long j11) {
        long d11;
        i0<Object> i0Var;
        i0<Object> i0Var2;
        if (kotlin.time.e.P(j11)) {
            throw new IllegalArgumentException(("Can not advance time by a negative delay: " + ((Object) kotlin.time.e.f0(j11))).toString());
        }
        d11 = c0.d(i0(), kotlin.time.e.x(j11));
        while (true) {
            synchronized (this.f75725b) {
                long i02 = i0();
                k1<i0<Object>> k1Var = this.f75724a;
                synchronized (k1Var) {
                    i0<Object> e11 = k1Var.e();
                    if (e11 != null) {
                        i0Var = d11 > e11.f75750c ? k1Var.m(0) : null;
                    }
                }
                i0Var2 = i0Var;
                if (i0Var2 == null) {
                    this.f75726c = d11;
                    return;
                }
                long j12 = i0Var2.f75750c;
                if (i02 > j12) {
                    c0.f();
                    throw new KotlinNothingValueException();
                }
                this.f75726c = j12;
            }
            i0Var2.f75748a.H(i0Var2.f75751d);
        }
    }

    @m80.l
    public final Object L0(@m80.k j00.c<? super g2> cVar) {
        Object H = this.f75728e.H(cVar);
        return H == kotlin.coroutines.intrinsics.b.l() ? H : g2.f100423a;
    }

    @m80.k
    public final <T> c40.k1 N0(@m80.k k0 k0Var, long j11, @m80.k final T t11, @m80.k kotlin.coroutines.d dVar, @m80.k final x00.l<? super T, Boolean> lVar) {
        long d11;
        c40.k1 k1Var;
        if (j11 < 0) {
            throw new IllegalArgumentException(("Attempted scheduling an event earlier in time (with the time delta " + j11 + ')').toString());
        }
        c0.e(this, dVar);
        long andIncrement = f75723h.getAndIncrement(this);
        boolean z11 = dVar.get(o40.b.f75721a) == null;
        synchronized (this.f75725b) {
            d11 = c0.d(i0(), j11);
            kotlin.jvm.internal.g0.n(t11, "null cannot be cast to non-null type kotlin.Any");
            final i0<Object> i0Var = new i0<>(k0Var, andIncrement, d11, t11, z11, new x00.a() { // from class: o40.y
                @Override // x00.a
                public final Object invoke() {
                    boolean Q0;
                    Q0 = b0.Q0(x00.l.this, t11);
                    return Boolean.valueOf(Q0);
                }
            });
            this.f75724a.b(i0Var);
            Y0(dVar);
            k1Var = new c40.k1() { // from class: o40.z
                @Override // c40.k1
                public final void dispose() {
                    b0.R0(b0.this, i0Var);
                }
            };
        }
        return k1Var;
    }

    public final void U() {
        d0(new x00.a() { // from class: o40.a0
            @Override // x00.a
            public final Object invoke() {
                boolean a02;
                a02 = b0.a0(b0.this);
                return Boolean.valueOf(a02);
            }
        });
    }

    public final void W0() {
        long i02;
        i0<Object> i0Var;
        i0<Object> i0Var2;
        synchronized (this.f75725b) {
            i02 = i0();
        }
        while (true) {
            synchronized (this.f75725b) {
                k1<i0<Object>> k1Var = this.f75724a;
                synchronized (k1Var) {
                    i0<Object> e11 = k1Var.e();
                    if (e11 != null) {
                        i0Var = e11.f75750c <= i02 ? k1Var.m(0) : null;
                    }
                }
                i0Var2 = i0Var;
                if (i0Var2 == null) {
                    return;
                }
            }
            i0Var2.f75748a.H(i0Var2.f75751d);
        }
    }

    public final void Y0(@m80.k kotlin.coroutines.d dVar) {
        e40.o<g2> oVar = this.f75728e;
        g2 g2Var = g2.f100423a;
        oVar.m(g2Var);
        o40.b bVar = o40.b.f75721a;
        if (dVar.get(bVar) != bVar) {
            this.f75727d.m(g2Var);
        }
    }

    public final /* synthetic */ void Z0(long j11) {
        this.count$volatile = j11;
    }

    public final boolean a1(@m80.k x00.a<Boolean> aVar) {
        synchronized (this.f75725b) {
            if (aVar.invoke().booleanValue()) {
                return false;
            }
            i0<Object> o11 = this.f75724a.o();
            if (o11 == null) {
                return false;
            }
            long i02 = i0();
            long j11 = o11.f75750c;
            if (i02 > j11) {
                c0.f();
                throw new KotlinNothingValueException();
            }
            this.f75726c = j11;
            o11.f75748a.H(o11.f75751d);
            return true;
        }
    }

    public final void d0(@m80.k x00.a<Boolean> aVar) {
        while (a1(aVar)) {
        }
    }

    public final /* synthetic */ long f0() {
        return this.count$volatile;
    }

    public final long i0() {
        long j11;
        synchronized (this.f75725b) {
            j11 = this.f75726c;
        }
        return j11;
    }

    @m80.k
    public final k40.h<g2> s0() {
        return this.f75728e.Q();
    }

    @m80.k
    public final k40.h<g2> w0() {
        return this.f75727d.Q();
    }

    @m80.k
    public final n.c x0() {
        return this.f75729f;
    }

    @y1
    public static /* synthetic */ void k0() {
    }
}
