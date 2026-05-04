package c40;

import c40.m0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.c;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class m0 extends kotlin.coroutines.a implements kotlin.coroutines.c {

    @m80.k
    public static final a Key = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.c
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.c, m0> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final m0 d(d.b bVar) {
            if (bVar instanceof m0) {
                return (m0) bVar;
            }
            return null;
        }

        public a() {
            super(kotlin.coroutines.c.f66933w0, new x00.l() { // from class: c40.l0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    m0 d11;
                    d11 = m0.a.d((d.b) obj);
                    return d11;
                }
            });
        }
    }

    public m0() {
        super(kotlin.coroutines.c.f66933w0);
    }

    public static /* synthetic */ m0 limitedParallelism$default(m0 m0Var, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        return m0Var.limitedParallelism(i11, str);
    }

    public abstract void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable);

    @g2
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        h40.m.e(this, dVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) c.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.c
    @m80.k
    public final <T> j00.c<T> interceptContinuation(@m80.k j00.c<? super T> cVar) {
        return new h40.l(this, cVar);
    }

    public boolean isDispatchNeeded(@m80.k kotlin.coroutines.d dVar) {
        return true;
    }

    @m80.k
    public m0 limitedParallelism(int i11, @m80.l String str) {
        h40.y.a(i11);
        return new h40.x(this, i11, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return c.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.c
    public final void releaseInterceptedContinuation(@m80.k j00.c<?> cVar) {
        kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((h40.l) cVar).D();
    }

    @m80.k
    public String toString() {
        return u0.a(this) + '@' + u0.b(this);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @yz.w0(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ m0 limitedParallelism(int i11) {
        return limitedParallelism(i11, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @m80.k
    public final m0 plus(@m80.k m0 m0Var) {
        return m0Var;
    }
}
