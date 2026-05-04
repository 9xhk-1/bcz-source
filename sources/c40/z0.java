package c40;

import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
/* loaded from: classes8.dex */
public interface z0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n426#2,11:160\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n27#1:160,11\n*E\n"})
    public static final class a {
        @m80.l
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(@m80.k z0 z0Var, long j11, @m80.k j00.c<? super yz.g2> cVar) {
            if (j11 <= 0) {
                return yz.g2.f100423a;
            }
            p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
            pVar.y();
            z0Var.j(j11, pVar);
            Object F = pVar.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return F == kotlin.coroutines.intrinsics.b.l() ? F : yz.g2.f100423a;
        }

        @m80.k
        public static k1 b(@m80.k z0 z0Var, long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
            return w0.a().f(j11, runnable, dVar);
        }
    }

    @m80.k
    k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar);

    void j(long j11, @m80.k n<? super yz.g2> nVar);

    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    Object k(long j11, @m80.k j00.c<? super yz.g2> cVar);
}
