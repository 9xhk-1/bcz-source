package o40;

import c40.b1;
import c40.k1;
import c40.z0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class k0 extends c40.m0 implements z0, b1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<c, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f75770a = new a();

        public a() {
            super(1, l0.class, "cancellableRunnableIsCancelled", "cancellableRunnableIsCancelled(Lkotlinx/coroutines/test/CancellableContinuationRunnable;)Z", 1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c cVar) {
            boolean b11;
            b11 = l0.b(cVar);
            return Boolean.valueOf(b11);
        }
    }

    public static final boolean E(Runnable runnable) {
        return false;
    }

    public final void H(@m80.k Object obj) {
        if (!(obj instanceof Runnable)) {
            throw new IllegalStateException("Check failed.");
        }
        ((Runnable) obj).run();
    }

    @Override // c40.b1
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Is only needed internally")
    public /* synthetic */ String c(long j11) {
        return "Timed out after " + ((Object) kotlin.time.e.f0(j11)) + " of _virtual_ (kotlinx.coroutines.test) time. To use the real time, wrap 'withTimeout' in 'withContext(Dispatchers.Default.limitedParallelism(1))'";
    }

    @Override // c40.z0
    @m80.k
    public k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        return w().N0(this, j11, runnable, dVar, new x00.l() { // from class: o40.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean E;
                E = k0.E((Runnable) obj);
                return Boolean.valueOf(E);
            }
        });
    }

    @Override // c40.z0
    public void j(long j11, @m80.k c40.n<? super g2> nVar) {
        c40.r.a(nVar, w().N0(this, j11, new c(nVar, this), nVar.getContext(), a.f75770a));
    }

    @Override // c40.z0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @m80.k j00.c<? super g2> cVar) {
        return z0.a.a(this, j11, cVar);
    }

    @m80.k
    public abstract b0 w();
}
