package i40;

import h40.m;
import j00.c;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.DispatchException;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,65:1\n45#1,6:66\n45#1,6:72\n45#1,6:78\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n15#1:66,6\n25#1:72,6\n34#1:78,6\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    public static final void a(c<?> cVar, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(e.a(th2)));
        throw th2;
    }

    public static final void b(c<?> cVar, x00.a<g2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static final void c(@k c<? super g2> cVar, @k c<?> cVar2) {
        try {
            c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            Result.a aVar = Result.Companion;
            m.d(e11, Result.m6308constructorimpl(g2.f100423a));
        } catch (Throwable th2) {
            a(cVar2, th2);
        }
    }

    @c40.g2
    public static final <T> void d(@k l<? super c<? super T>, ? extends Object> lVar, @k c<? super T> cVar) {
        try {
            c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, cVar));
            Result.a aVar = Result.Companion;
            m.d(e11, Result.m6308constructorimpl(g2.f100423a));
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static final <R, T> void e(@k p<? super R, ? super c<? super T>, ? extends Object> pVar, R r11, @k c<? super T> cVar) {
        try {
            c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r11, cVar));
            Result.a aVar = Result.Companion;
            m.d(e11, Result.m6308constructorimpl(g2.f100423a));
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }
}
