package h40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n62#1,18:155\n62#1,18:173\n29#2:191\n29#2:193\n16#3:192\n16#3:194\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:155,18\n51#1:173,18\n85#1:191\n98#1:193\n85#1:192\n98#1:194\n*E\n"})
/* loaded from: classes8.dex */
public final class x extends c40.m0 implements c40.z0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58284g = AtomicIntegerFieldUpdater.newUpdater(x.class, "runningWorkers$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c40.z0 f58285a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.m0 f58286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58287c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f58288d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final e0<Runnable> f58289e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Object f58290f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n29#2:155\n16#3:156\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n*L\n139#1:155\n139#1:156\n*E\n"})
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public Runnable f58291a;

        public a(@m80.k Runnable runnable) {
            this.f58291a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = 0;
            while (true) {
                try {
                    this.f58291a.run();
                } catch (Throwable th2) {
                    c40.o0.b(EmptyCoroutineContext.INSTANCE, th2);
                }
                Runnable a02 = x.this.a0();
                if (a02 == null) {
                    return;
                }
                try {
                    this.f58291a = a02;
                    i11++;
                    if (i11 >= 16 && m.f(x.this.f58286b, x.this)) {
                        m.e(x.this.f58286b, x.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = x.this.f58290f;
                    x xVar = x.this;
                    synchronized (obj) {
                        x.U().decrementAndGet(xVar);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@m80.k c40.m0 m0Var, int i11, @m80.l String str) {
        c40.z0 z0Var = m0Var instanceof c40.z0 ? (c40.z0) m0Var : null;
        this.f58285a = z0Var == null ? c40.w0.a() : z0Var;
        this.f58286b = m0Var;
        this.f58287c = i11;
        this.f58288d = str;
        this.f58289e = new e0<>(false);
        this.f58290f = new Object();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater U() {
        return f58284g;
    }

    public final void I(Runnable runnable, x00.l<? super a, g2> lVar) {
        Runnable a02;
        this.f58289e.a(runnable);
        if (f58284g.get(this) < this.f58287c && f0() && (a02 = a0()) != null) {
            try {
                lVar.invoke(new a(a02));
            } catch (Throwable th2) {
                f58284g.decrementAndGet(this);
                throw th2;
            }
        }
    }

    public final /* synthetic */ int L() {
        return this.runningWorkers$volatile;
    }

    public final Runnable a0() {
        while (true) {
            Runnable j11 = this.f58289e.j();
            if (j11 != null) {
                return j11;
            }
            synchronized (this.f58290f) {
                f58284g.decrementAndGet(this);
                if (this.f58289e.c() == 0) {
                    return null;
                }
                f58284g.incrementAndGet(this);
            }
        }
    }

    public final /* synthetic */ void d0(int i11) {
        this.runningWorkers$volatile = i11;
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        Runnable a02;
        this.f58289e.a(runnable);
        if (f58284g.get(this) >= this.f58287c || !f0() || (a02 = a0()) == null) {
            return;
        }
        try {
            m.e(this.f58286b, this, new a(a02));
        } catch (Throwable th2) {
            f58284g.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // c40.m0
    @c40.g2
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        Runnable a02;
        this.f58289e.a(runnable);
        if (f58284g.get(this) >= this.f58287c || !f0() || (a02 = a0()) == null) {
            return;
        }
        try {
            this.f58286b.dispatchYield(this, new a(a02));
        } catch (Throwable th2) {
            f58284g.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // c40.z0
    @m80.k
    public c40.k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        return this.f58285a.f(j11, runnable, dVar);
    }

    public final boolean f0() {
        synchronized (this.f58290f) {
            if (f58284g.get(this) >= this.f58287c) {
                return false;
            }
            f58284g.incrementAndGet(this);
            return true;
        }
    }

    @Override // c40.z0
    public void j(long j11, @m80.k c40.n<? super g2> nVar) {
        this.f58285a.j(j11, nVar);
    }

    @Override // c40.z0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @m80.k j00.c<? super g2> cVar) {
        return this.f58285a.k(j11, cVar);
    }

    @Override // c40.m0
    @m80.k
    public c40.m0 limitedParallelism(int i11, @m80.l String str) {
        y.a(i11);
        return i11 >= this.f58287c ? y.b(this, str) : super.limitedParallelism(i11, str);
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        String str = this.f58288d;
        if (str != null) {
            return str;
        }
        return this.f58286b + ".limitedParallelism(" + this.f58287c + ')';
    }
}
