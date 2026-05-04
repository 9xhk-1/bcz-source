package p40;

import c40.h1;
import c40.k1;
import c40.m0;
import c40.n;
import c40.v2;
import c40.w0;
import c40.z0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import o40.b0;
import o40.k0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestMainDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcher.kt\nkotlinx/coroutines/test/internal/TestMainDispatcher\n+ 2 TestMainDispatcher.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherKt\n*L\n1#1,101:1\n97#2:102\n*S KotlinDebug\n*F\n+ 1 TestMainDispatcher.kt\nkotlinx/coroutines/test/internal/TestMainDispatcher\n*L\n25#1:102\n*E\n"})
/* loaded from: classes8.dex */
public final class e extends v2 implements z0 {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f78911c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f78912a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public b<m0> f78913b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final k0 a() {
            b bVar;
            v2 e11 = h1.e();
            e eVar = e11 instanceof e ? (e) e11 : null;
            m0 m0Var = (eVar == null || (bVar = eVar.f78913b) == null) ? null : (m0) bVar.i();
            if (m0Var instanceof k0) {
                return (k0) m0Var;
            }
            return null;
        }

        @l
        public final b0 b() {
            k0 a11 = a();
            if (a11 != null) {
                return a11.w();
            }
            return null;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTestMainDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcher.kt\nkotlinx/coroutines/test/internal/TestMainDispatcher$NonConcurrentlyModifiable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
    public static final class b<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f78914b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "reader$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f78915c = AtomicIntegerFieldUpdater.newUpdater(b.class, "readers$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f78916d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "writer$volatile");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f78917e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "exceptionWhenReading$volatile");

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f78918f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_value$volatile");
        private volatile /* synthetic */ Object _value$volatile;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f78919a;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;

        public b(T t11, @k String str) {
            this.f78919a = str;
            this._value$volatile = t11;
        }

        public final IllegalStateException a(Throwable th2) {
            return new IllegalStateException(this.f78919a + " is used concurrently with setting it", th2);
        }

        public final IllegalStateException b(Throwable th2) {
            return new IllegalStateException(this.f78919a + " is modified concurrently", th2);
        }

        public final /* synthetic */ Object c() {
            return this.exceptionWhenReading$volatile;
        }

        public final /* synthetic */ Object e() {
            return this.reader$volatile;
        }

        public final /* synthetic */ int g() {
            return this.readers$volatile;
        }

        public final T i() {
            f78914b.set(this, new Throwable("reader location"));
            f78915c.incrementAndGet(this);
            Throwable th2 = (Throwable) f78916d.get(this);
            if (th2 != null) {
                f78917e.set(this, a(th2));
            }
            T t11 = (T) f78918f.get(this);
            f78915c.decrementAndGet(this);
            return t11;
        }

        public final /* synthetic */ Object j() {
            return this.writer$volatile;
        }

        public final /* synthetic */ Object l() {
            return this._value$volatile;
        }

        public final /* synthetic */ void n(Object obj) {
            this.exceptionWhenReading$volatile = obj;
        }

        public final /* synthetic */ void o(Object obj) {
            this.reader$volatile = obj;
        }

        public final /* synthetic */ void p(int i11) {
            this.readers$volatile = i11;
        }

        public final void q(T t11) {
            Throwable th2;
            Throwable th3;
            Throwable th4 = (Throwable) f78917e.getAndSet(this, null);
            if (th4 != null) {
                throw th4;
            }
            if (f78915c.get(this) != 0 && (th3 = (Throwable) f78914b.get(this)) != null) {
                throw a(th3);
            }
            Throwable th5 = new Throwable("other writer location");
            Throwable th6 = (Throwable) f78916d.getAndSet(this, th5);
            if (th6 != null) {
                throw b(th6);
            }
            f78918f.set(this, t11);
            androidx.concurrent.futures.a.a(f78916d, this, th5, null);
            if (f78915c.get(this) != 0 && (th2 = (Throwable) f78914b.get(this)) != null) {
                throw a(th2);
            }
        }

        public final /* synthetic */ void r(Object obj) {
            this.writer$volatile = obj;
        }

        public final /* synthetic */ void s(Object obj) {
            this._value$volatile = obj;
        }
    }

    public e(@k x00.a<? extends m0> aVar) {
        this.f78912a = e0.c(aVar);
        this.f78913b = new b<>(null, "Dispatchers.Main");
    }

    private final m0 E8() {
        m0 i11 = this.f78913b.i();
        return i11 == null ? U() : i11;
    }

    public final z0 L() {
        d.b E8 = E8();
        z0 z0Var = E8 instanceof z0 ? (z0) E8 : null;
        return z0Var == null ? w0.a() : z0Var;
    }

    public final m0 U() {
        return (m0) this.f78912a.getValue();
    }

    public final void a0() {
        this.f78913b.q(null);
    }

    public final void d0(@k m0 m0Var) {
        this.f78913b.q(m0Var);
    }

    @Override // c40.m0
    public void dispatch(@k kotlin.coroutines.d dVar, @k Runnable runnable) {
        E8().dispatch(dVar, runnable);
    }

    @Override // c40.m0
    public void dispatchYield(@k kotlin.coroutines.d dVar, @k Runnable runnable) {
        E8().dispatchYield(dVar, runnable);
    }

    @Override // c40.z0
    @k
    public k1 f(long j11, @k Runnable runnable, @k kotlin.coroutines.d dVar) {
        return L().f(j11, runnable, dVar);
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@k kotlin.coroutines.d dVar) {
        return E8().isDispatchNeeded(dVar);
    }

    @Override // c40.z0
    public void j(long j11, @k n<? super g2> nVar) {
        L().j(j11, nVar);
    }

    @Override // c40.z0
    @l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @k j00.c<? super g2> cVar) {
        return z0.a.a(this, j11, cVar);
    }

    @Override // c40.v2
    @k
    public v2 q() {
        v2 q11;
        m0 E8 = E8();
        v2 v2Var = E8 instanceof v2 ? (v2) E8 : null;
        return (v2Var == null || (q11 = v2Var.q()) == null) ? this : q11;
    }

    public e(@k final m0 m0Var) {
        this((x00.a<? extends m0>) new x00.a() { // from class: p40.d
            @Override // x00.a
            public final Object invoke() {
                m0 H;
                H = e.H(m0.this);
                return H;
            }
        });
    }

    public static final m0 H(m0 m0Var) {
        return m0Var;
    }
}
