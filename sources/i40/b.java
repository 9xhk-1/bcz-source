package i40;

import c40.c0;
import c40.s2;
import h40.g1;
import h40.t0;
import j00.c;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import l00.f;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,105:1\n8#2:106\n11#2,2:110\n91#3,3:107\n95#3:112\n57#4,2:113\n57#4,2:115\n57#4,2:117\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n14#1:106\n19#1:110,2\n18#1:107,3\n18#1:112\n88#1:113,2\n89#1:115,2\n103#1:117,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    public static final Void a(t0<?> t0Var, DispatchException dispatchException) {
        t0Var.v1(new c0(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    public static final boolean b(t0<?> t0Var, Throwable th2) {
        return ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == t0Var) ? false : true;
    }

    public static final <R, T> void c(@k p<? super R, ? super c<? super T>, ? extends Object> pVar, R r11, @k c<? super T> cVar) {
        c a11 = f.a(cVar);
        try {
            d context = a11.getContext();
            Object i11 = g1.i(context, null);
            try {
                f.b(a11);
                Object j11 = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.j(pVar, r11, a11) : ((p) x0.q(pVar, 2)).invoke(r11, a11);
                g1.f(context, i11);
                if (j11 != kotlin.coroutines.intrinsics.b.l()) {
                    Result.a aVar = Result.Companion;
                    a11.resumeWith(Result.m6308constructorimpl(j11));
                }
            } catch (Throwable th2) {
                g1.f(context, i11);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.a aVar2 = Result.Companion;
            a11.resumeWith(Result.m6308constructorimpl(e.a(th)));
        }
    }

    @l
    public static final <T, R> Object d(@k t0<? super T> t0Var, R r11, @k p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        return f(t0Var, true, r11, pVar);
    }

    @l
    public static final <T, R> Object e(@k t0<? super T> t0Var, R r11, @k p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        return f(t0Var, false, r11, pVar);
    }

    public static final <T, R> Object f(t0<? super T> t0Var, boolean z11, R r11, p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        Object c0Var;
        try {
            c0Var = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.j(pVar, r11, t0Var) : ((p) x0.q(pVar, 2)).invoke(r11, t0Var);
        } catch (DispatchException e11) {
            a(t0Var, e11);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            c0Var = new c0(th2, false, 2, null);
        }
        if (c0Var == kotlin.coroutines.intrinsics.b.l()) {
            return kotlin.coroutines.intrinsics.b.l();
        }
        Object w12 = t0Var.w1(c0Var);
        if (w12 == s2.f7963b) {
            return kotlin.coroutines.intrinsics.b.l();
        }
        t0Var.e2();
        if (!(w12 instanceof c0)) {
            return s2.h(w12);
        }
        if (z11 || b(t0Var, ((c0) w12).f7827a)) {
            throw ((c0) w12).f7827a;
        }
        if (c0Var instanceof c0) {
            throw ((c0) c0Var).f7827a;
        }
        return c0Var;
    }
}
