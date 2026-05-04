package h40;

import c40.l2;
import c40.o1;
import c40.o3;
import c40.x3;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.DispatchException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n293#1,5:321\n298#1,12:327\n310#1:395\n297#1:397\n298#1,12:399\n310#1:428\n207#2,7:314\n214#2,23:342\n237#2,2:375\n239#2:379\n217#2:380\n219#2:396\n1#3:326\n1#3:398\n1#3:429\n184#4,3:339\n187#4,14:381\n184#4,17:411\n184#4,17:430\n103#5,10:365\n114#5,2:377\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n278#1:321,5\n278#1:327,12\n278#1:395\n283#1:397\n283#1:399,12\n283#1:428\n278#1:314,7\n278#1:342,23\n278#1:375,2\n278#1:379\n278#1:380\n278#1:396\n278#1:326\n283#1:398\n278#1:339,3\n278#1:381,14\n283#1:411,17\n309#1:430,17\n278#1:365,10\n278#1:377,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x0 f58245a = new x0("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final x0 f58246b = new x0("REUSABLE_CLAIMED");

    public static final boolean b(l<?> lVar, Object obj, int i11, boolean z11, x00.a<g2> aVar) {
        o1 b11 = o3.f7899a.b();
        if (z11 && b11.f0()) {
            return false;
        }
        if (b11.d0()) {
            lVar.f58242f = obj;
            lVar.f7841c = i11;
            b11.H(lVar);
            return true;
        }
        b11.L(true);
        try {
            aVar.invoke();
            do {
            } while (b11.i0());
            kotlin.jvm.internal.d0.d(1);
        } catch (Throwable th2) {
            try {
                lVar.h(th2);
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.d0.d(1);
                b11.q(true);
                kotlin.jvm.internal.d0.c(1);
                throw th3;
            }
        }
        b11.q(true);
        kotlin.jvm.internal.d0.c(1);
        return false;
    }

    public static /* synthetic */ boolean c(l lVar, Object obj, int i11, boolean z11, x00.a aVar, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        o1 b11 = o3.f7899a.b();
        if (z11 && b11.f0()) {
            return false;
        }
        if (b11.d0()) {
            lVar.f58242f = obj;
            lVar.f7841c = i11;
            b11.H(lVar);
            return true;
        }
        b11.L(true);
        try {
            aVar.invoke();
            do {
            } while (b11.i0());
            kotlin.jvm.internal.d0.d(1);
        } catch (Throwable th2) {
            try {
                lVar.h(th2);
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.d0.d(1);
                b11.q(true);
                kotlin.jvm.internal.d0.c(1);
                throw th3;
            }
        }
        b11.q(true);
        kotlin.jvm.internal.d0.c(1);
        return false;
    }

    @c40.g2
    public static final <T> void d(@m80.k j00.c<? super T> cVar, @m80.k Object obj) {
        if (!(cVar instanceof l)) {
            cVar.resumeWith(obj);
            return;
        }
        l lVar = (l) cVar;
        Object b11 = c40.e0.b(obj);
        if (f(lVar.f58240d, lVar.getContext())) {
            lVar.f58242f = b11;
            lVar.f7841c = 1;
            e(lVar.f58240d, lVar.getContext(), lVar);
            return;
        }
        o1 b12 = o3.f7899a.b();
        if (b12.d0()) {
            lVar.f58242f = b11;
            lVar.f7841c = 1;
            b12.H(lVar);
            return;
        }
        b12.L(true);
        try {
            l2 l2Var = (l2) lVar.getContext().get(l2.f7886e0);
            if (l2Var == null || l2Var.isActive()) {
                j00.c<T> cVar2 = lVar.f58241e;
                Object obj2 = lVar.f58243g;
                kotlin.coroutines.d context = cVar2.getContext();
                Object i11 = g1.i(context, obj2);
                x3<?> m11 = i11 != g1.f58220a ? c40.k0.m(cVar2, context, i11) : null;
                try {
                    lVar.f58241e.resumeWith(obj);
                    g2 g2Var = g2.f100423a;
                } finally {
                    if (m11 == null || m11.f2()) {
                        g1.f(context, i11);
                    }
                }
            } else {
                CancellationException y02 = l2Var.y0();
                lVar.c(b11, y02);
                Result.a aVar = Result.Companion;
                lVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(y02)));
            }
            while (b12.i0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void e(@m80.k c40.m0 m0Var, @m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        try {
            m0Var.dispatch(dVar, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, m0Var, dVar);
        }
    }

    public static final boolean f(@m80.k c40.m0 m0Var, @m80.k kotlin.coroutines.d dVar) {
        try {
            return m0Var.isDispatchNeeded(dVar);
        } catch (Throwable th2) {
            throw new DispatchException(th2, m0Var, dVar);
        }
    }

    public static final boolean g(@m80.k l<? super g2> lVar) {
        g2 g2Var = g2.f100423a;
        o1 b11 = o3.f7899a.b();
        if (b11.f0()) {
            return false;
        }
        if (b11.d0()) {
            lVar.f58242f = g2Var;
            lVar.f7841c = 1;
            b11.H(lVar);
            return true;
        }
        b11.L(true);
        try {
            lVar.run();
            do {
            } while (b11.i0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
