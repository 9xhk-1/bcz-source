package c40;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.DeprecationLevel;

/* loaded from: classes8.dex */
public final class n2 {
    @m80.k
    public static final l2 A(@m80.k kotlin.coroutines.d dVar) {
        return p2.z(dVar);
    }

    @m80.k
    public static final k1 B(@m80.k l2 l2Var, boolean z11, @m80.k q2 q2Var) {
        return p2.A(l2Var, z11, q2Var);
    }

    public static final boolean D(@m80.k kotlin.coroutines.d dVar) {
        return p2.C(dVar);
    }

    @m80.k
    public static final a0 a(@m80.l l2 l2Var) {
        return p2.a(l2Var);
    }

    public static final void e(@m80.k l2 l2Var, @m80.k String str, @m80.l Throwable th2) {
        p2.e(l2Var, str, th2);
    }

    public static final void g(@m80.k kotlin.coroutines.d dVar, @m80.l CancellationException cancellationException) {
        p2.g(dVar, cancellationException);
    }

    @m80.l
    public static final Object l(@m80.k l2 l2Var, @m80.k j00.c<? super yz.g2> cVar) {
        return p2.l(l2Var, cVar);
    }

    public static final void o(@m80.k l2 l2Var, @m80.l CancellationException cancellationException) {
        p2.o(l2Var, cancellationException);
    }

    public static final void r(@m80.k kotlin.coroutines.d dVar, @m80.l CancellationException cancellationException) {
        p2.r(dVar, cancellationException);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @yz.w0(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void w(@m80.k n<?> nVar, @m80.k Future<?> future) {
        o2.a(nVar, future);
    }

    @m80.k
    public static final k1 x(@m80.k l2 l2Var, @m80.k k1 k1Var) {
        return p2.w(l2Var, k1Var);
    }

    public static final void y(@m80.k l2 l2Var) {
        p2.x(l2Var);
    }

    public static final void z(@m80.k kotlin.coroutines.d dVar) {
        p2.y(dVar);
    }
}
