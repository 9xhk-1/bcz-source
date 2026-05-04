package n40;

import c40.k1;
import c40.m0;
import c40.p;
import c40.r;
import c40.y1;
import c40.z3;
import h40.x0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k40.n;
import k40.o;
import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import n40.f;
import x00.q;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n444#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
/* loaded from: classes8.dex */
public class f extends j implements n40.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74423i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final q<n<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, g2>> f74424h;
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public final class a implements c40.n<g2>, z3 {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @m80.k
        public final p<g2> f74425a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Object f74426b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k p<? super g2> pVar, @m80.l Object obj) {
            this.f74425a = pVar;
            this.f74426b = obj;
        }

        public static final g2 h(f fVar, a aVar, Throwable th2) {
            fVar.unlock(aVar.f74426b);
            return g2.f100423a;
        }

        public static final g2 m(f fVar, a aVar, Throwable th2, g2 g2Var, kotlin.coroutines.d dVar) {
            f.L().set(fVar, aVar.f74426b);
            fVar.unlock(aVar.f74426b);
            return g2.f100423a;
        }

        @Override // c40.n
        @y1
        public void B(@m80.k m0 m0Var, @m80.k Throwable th2) {
            this.f74425a.B(m0Var, th2);
        }

        @Override // c40.n
        public boolean a(@m80.l Throwable th2) {
            return this.f74425a.a(th2);
        }

        @Override // c40.z3
        public void b(@m80.k h40.u0<?> u0Var, int i11) {
            this.f74425a.b(u0Var, i11);
        }

        @Override // c40.n
        public boolean e() {
            return this.f74425a.e();
        }

        @Override // c40.n
        @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @w0(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void x(@m80.k g2 g2Var, @m80.l x00.l<? super Throwable, g2> lVar) {
            this.f74425a.x(g2Var, lVar);
        }

        @Override // c40.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public <R extends g2> void A(@m80.k R r11, @m80.l q<? super Throwable, ? super R, ? super kotlin.coroutines.d, g2> qVar) {
            f.L().set(f.this, this.f74426b);
            p<g2> pVar = this.f74425a;
            final f fVar = f.this;
            pVar.x(r11, new x00.l() { // from class: n40.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 h11;
                    h11 = f.a.h(f.this, this, (Throwable) obj);
                    return h11;
                }
            });
        }

        @Override // j00.c
        @m80.k
        public kotlin.coroutines.d getContext() {
            return this.f74425a.getContext();
        }

        @Override // c40.n
        @y1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void l(@m80.k m0 m0Var, @m80.k g2 g2Var) {
            this.f74425a.l(m0Var, g2Var);
        }

        @Override // c40.n
        public boolean isActive() {
            return this.f74425a.isActive();
        }

        @Override // c40.n
        public boolean isCancelled() {
            return this.f74425a.isCancelled();
        }

        @Override // c40.n
        @m80.l
        @c40.g2
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object t(@m80.k g2 g2Var, @m80.l Object obj) {
            return this.f74425a.t(g2Var, obj);
        }

        @Override // c40.n
        @m80.l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public <R extends g2> Object n(@m80.k R r11, @m80.l Object obj, @m80.l q<? super Throwable, ? super R, ? super kotlin.coroutines.d, g2> qVar) {
            final f fVar = f.this;
            Object n11 = this.f74425a.n(r11, obj, new q() { // from class: n40.d
                @Override // x00.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    g2 m11;
                    m11 = f.a.m(f.this, this, (Throwable) obj2, (g2) obj3, (kotlin.coroutines.d) obj4);
                    return m11;
                }
            });
            if (n11 != null) {
                f.L().set(f.this, this.f74426b);
            }
            return n11;
        }

        @Override // c40.n
        public void p(@m80.k x00.l<? super Throwable, g2> lVar) {
            this.f74425a.p(lVar);
        }

        @Override // j00.c
        public void resumeWith(@m80.k Object obj) {
            this.f74425a.resumeWith(obj);
        }

        @Override // c40.n
        @c40.g2
        public void s(@m80.k Object obj) {
            this.f74425a.s(obj);
        }

        @Override // c40.n
        @m80.l
        @c40.g2
        public Object v(@m80.k Throwable th2) {
            return this.f74425a.v(th2);
        }

        @Override // c40.n
        @c40.g2
        public void y() {
            this.f74425a.y();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public final class b<Q> implements o<Q> {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @m80.k
        public final o<Q> f74428a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Object f74429b;

        public b(@m80.k o<Q> oVar, @m80.l Object obj) {
            this.f74428a = oVar;
            this.f74429b = obj;
        }

        @Override // c40.z3
        public void b(@m80.k h40.u0<?> u0Var, int i11) {
            this.f74428a.b(u0Var, i11);
        }

        @Override // k40.n
        public void e(@m80.l Object obj) {
            f.L().set(f.this, this.f74429b);
            this.f74428a.e(obj);
        }

        @Override // k40.n
        public void g(@m80.k k1 k1Var) {
            this.f74428a.g(k1Var);
        }

        @Override // k40.n
        @m80.k
        public kotlin.coroutines.d getContext() {
            return this.f74428a.getContext();
        }

        @Override // k40.n
        public boolean h(@m80.k Object obj, @m80.l Object obj2) {
            boolean h11 = this.f74428a.h(obj, obj2);
            f fVar = f.this;
            if (h11) {
                f.L().set(fVar, this.f74429b);
            }
            return h11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements q<f, n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f74431a = new c();

        public c() {
            super(3, f.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(f fVar, n<?> nVar, Object obj) {
            fVar.Q(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(f fVar, n<?> nVar, Object obj) {
            a(fVar, nVar, obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d extends FunctionReferenceImpl implements q<f, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f74432a = new d();

        public d() {
            super(3, f.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Object obj, Object obj2) {
            return fVar.P(obj, obj2);
        }
    }

    public f(boolean z11) {
        super(1, z11 ? 1 : 0);
        this.owner$volatile = z11 ? null : g.f74433a;
        this.f74424h = new q() { // from class: n40.c
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                q R;
                R = f.R(f.this, (n) obj, obj2, obj3);
                return R;
            }
        };
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater L() {
        return f74423i;
    }

    public static /* synthetic */ Object N(f fVar, Object obj, j00.c<? super g2> cVar) {
        if (fVar.tryLock(obj)) {
            return g2.f100423a;
        }
        Object O = fVar.O(obj, cVar);
        return O == kotlin.coroutines.intrinsics.b.l() ? O : g2.f100423a;
    }

    public static final q R(final f fVar, n nVar, final Object obj, Object obj2) {
        return new q() { // from class: n40.b
            @Override // x00.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                g2 S;
                S = f.S(f.this, obj, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
                return S;
            }
        };
    }

    public static final g2 S(f fVar, Object obj, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        fVar.unlock(obj);
        return g2.f100423a;
    }

    public final /* synthetic */ Object K() {
        return this.owner$volatile;
    }

    public final int M(Object obj) {
        x0 x0Var;
        while (isLocked()) {
            Object obj2 = f74423i.get(this);
            x0Var = g.f74433a;
            if (obj2 != x0Var) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object O(Object obj, j00.c<? super g2> cVar) {
        p b11 = r.b(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        try {
            g(new a(b11, obj));
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

    @m80.l
    public Object P(@m80.l Object obj, @m80.l Object obj2) {
        x0 x0Var;
        x0Var = g.f74434b;
        if (!g0.g(obj2, x0Var)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public void Q(@m80.k n<?> nVar, @m80.l Object obj) {
        x0 x0Var;
        if (obj == null || !holdsLock(obj)) {
            g0.n(nVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            w(new b((o) nVar, obj), obj);
        } else {
            x0Var = g.f74434b;
            nVar.e(x0Var);
        }
    }

    public final /* synthetic */ void T(Object obj) {
        this.owner$volatile = obj;
    }

    public final int U(Object obj) {
        while (!b()) {
            if (obj == null) {
                return 1;
            }
            int M = M(obj);
            if (M == 1) {
                return 2;
            }
            if (M == 2) {
                return 1;
            }
        }
        f74423i.set(this, obj);
        return 0;
    }

    @Override // n40.a
    @m80.k
    public k40.j<Object, n40.a> getOnLock() {
        c cVar = c.f74431a;
        g0.n(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) kotlin.jvm.internal.x0.q(cVar, 3);
        d dVar = d.f74432a;
        g0.n(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k40.k(this, qVar, (q) kotlin.jvm.internal.x0.q(dVar, 3), this.f74424h);
    }

    @Override // n40.a
    public boolean holdsLock(@m80.k Object obj) {
        return M(obj) == 1;
    }

    @Override // n40.a
    public boolean isLocked() {
        return c() == 0;
    }

    @Override // n40.a
    @m80.l
    public Object lock(@m80.l Object obj, @m80.k j00.c<? super g2> cVar) {
        return N(this, obj, cVar);
    }

    @m80.k
    public String toString() {
        return "Mutex@" + c40.u0.b(this) + "[isLocked=" + isLocked() + ",owner=" + f74423i.get(this) + l50.b.f69930l;
    }

    @Override // n40.a
    public boolean tryLock(@m80.l Object obj) {
        int U = U(obj);
        if (U == 0) {
            return true;
        }
        if (U == 1) {
            return false;
        }
        if (U != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // n40.a
    public void unlock(@m80.l Object obj) {
        x0 x0Var;
        x0 x0Var2;
        while (isLocked()) {
            Object obj2 = f74423i.get(this);
            x0Var = g.f74433a;
            if (obj2 != x0Var) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74423i;
                x0Var2 = g.f74433a;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, x0Var2)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public static /* synthetic */ void J() {
    }
}
