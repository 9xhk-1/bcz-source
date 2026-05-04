package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class LintKt {
    @yz.n(level = DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @w0(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@m80.k j<?> jVar, @m80.l CancellationException cancellationException) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void b(j jVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        a(jVar, cancellationException);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @w0(expression = "this", imports = {}))
    @m80.k
    public static final <T> i<T> c(@m80.k c0<? extends T> c0Var) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @w0(expression = "this", imports = {}))
    @o00.f
    public static final <T> i<T> d(c0<? extends T> c0Var, x00.q<? super j<? super T>, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> qVar) {
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return k.v(c0Var, qVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @w0(expression = "this", imports = {}))
    @m80.k
    public static final <T> i<T> e(@m80.k m0<? extends T> m0Var) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @o00.f
    public static final <T> Object f(c0<? extends T> c0Var, j00.c<? super Integer> cVar) {
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        kotlin.jvm.internal.d0.e(0);
        Object a02 = k.a0(c0Var, cVar);
        kotlin.jvm.internal.d0.e(1);
        return a02;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @w0(expression = "this", imports = {}))
    @m80.k
    public static final <T> i<T> g(@m80.k m0<? extends T> m0Var) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @w0(expression = "this", imports = {}))
    @m80.k
    public static final <T> i<T> h(@m80.k c0<? extends T> c0Var, @m80.k kotlin.coroutines.d dVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final kotlin.coroutines.d i(@m80.k j<?> jVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    public static final boolean k(@m80.k j<?> jVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @w0(expression = "this", imports = {}))
    @o00.f
    public static final <T> i<T> m(c0<? extends T> c0Var, long j11, x00.p<? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return k.y1(c0Var, j11, pVar);
    }

    public static /* synthetic */ i n(c0 c0Var, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Long.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            pVar = new LintKt$retry$1(null);
        }
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return k.y1(c0Var, j11, pVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @w0(expression = "this", imports = {}))
    @o00.f
    public static final <T> i<T> o(c0<? extends T> c0Var, x00.r<? super j<? super T>, ? super Throwable, ? super Long, ? super j00.c<? super Boolean>, ? extends Object> rVar) {
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return k.A1(c0Var, rVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @o00.f
    public static final <T> Object p(c0<? extends T> c0Var, j00.c<? super List<? extends T>> cVar) {
        Object c11;
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.d0.e(0);
        c11 = m.c(c0Var, null, cVar, 1, null);
        kotlin.jvm.internal.d0.e(1);
        return c11;
    }

    @o00.f
    public static final <T> Object q(c0<? extends T> c0Var, List<T> list, j00.c<?> cVar) {
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.d0.e(0);
        k.a2(c0Var, list, cVar);
        kotlin.jvm.internal.d0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @o00.f
    public static final <T> Object r(c0<? extends T> c0Var, j00.c<? super Set<? extends T>> cVar) {
        Object e11;
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.d0.e(0);
        e11 = m.e(c0Var, null, cVar, 1, null);
        kotlin.jvm.internal.d0.e(1);
        return e11;
    }

    @o00.f
    public static final <T> Object s(c0<? extends T> c0Var, Set<T> set, j00.c<?> cVar) {
        kotlin.jvm.internal.g0.n(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.d0.e(0);
        k.c2(c0Var, set, cVar);
        kotlin.jvm.internal.d0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @w0(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(j jVar) {
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @w0(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(j jVar) {
    }
}
