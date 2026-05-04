package o40;

import c40.y1;
import java.util.List;
import kotlin.DeprecationLevel;
import yz.g2;
import yz.w0;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final long f75747a = 60000;

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void a(@m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.b(dVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void b(@m80.k u uVar, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.c(uVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void c(@m80.k d0 d0Var, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.d(d0Var, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers.")
    public static final void d(@m80.k n0 n0Var, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.e(n0Var, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers.")
    public static final void f(@m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.g(dVar, pVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Define a total timeout for the whole test instead of using dispatchTimeoutMs. Warning: the proposed replacement is not identical as it uses 'dispatchTimeoutMs' as the timeout for the whole test!", replaceWith = @w0(expression = "runTest(context, timeout = dispatchTimeoutMs.milliseconds, testBody)", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static final void h(@m80.k kotlin.coroutines.d dVar, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        m.b(dVar, j11, pVar);
    }

    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "Use `TestScope.runTest` instead.")
    public static final void i(@m80.k d0 d0Var, long j11, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.j(d0Var, j11, pVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Define a total timeout for the whole test instead of using dispatchTimeoutMs. Warning: the proposed replacement is not identical as it uses 'dispatchTimeoutMs' as the timeout for the whole test!", replaceWith = @w0(expression = "this.runTest(timeout = dispatchTimeoutMs.milliseconds, testBody)", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static final void j(@m80.k n0 n0Var, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        m.c(n0Var, j11, pVar);
    }

    public static final void n(@m80.k kotlin.coroutines.d dVar, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        m.f(dVar, j11, pVar);
    }

    public static final void o(@m80.k n0 n0Var, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        m.g(n0Var, j11, pVar);
    }

    @m80.l
    @yz.n(message = "Used for support of legacy behavior")
    public static final <T extends c40.a<? super g2>> Object r(@m80.k c40.r0 r0Var, @m80.k T t11, long j11, @m80.k x00.l<? super T, ? extends Throwable> lVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k x00.a<? extends List<? extends Throwable>> aVar, @m80.k j00.c<? super g2> cVar) {
        return m.j(r0Var, t11, j11, lVar, pVar, aVar, cVar);
    }

    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead.")
    public static final void s(@m80.k kotlin.coroutines.d dVar, long j11, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.l(dVar, j11, pVar);
    }

    public static final void u(@m80.l Throwable th2, @m80.k List<? extends Throwable> list) {
        m.l(th2, list);
    }
}
