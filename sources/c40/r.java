package c40;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
/* loaded from: classes8.dex */
public final class r {
    @g2
    public static final void a(@m80.k n<?> nVar, @m80.k k1 k1Var) {
        c(nVar, new l1(k1Var));
    }

    @m80.k
    public static final <T> p<T> b(@m80.k j00.c<? super T> cVar) {
        if (!(cVar instanceof h40.l)) {
            return new p<>(cVar, 1);
        }
        p<T> k11 = ((h40.l) cVar).k();
        if (k11 != null) {
            if (!k11.Y()) {
                k11 = null;
            }
            if (k11 != null) {
                return k11;
            }
        }
        return new p<>(cVar, 2);
    }

    public static final <T> void c(@m80.k n<? super T> nVar, @m80.k m mVar) {
        if (!(nVar instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p) nVar).Q(mVar);
    }

    @m80.l
    public static final <T> Object d(@m80.k x00.l<? super n<? super T>, yz.g2> lVar, @m80.k j00.c<? super T> cVar) {
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        lVar.invoke(pVar);
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public static final <T> Object e(x00.l<? super n<? super T>, yz.g2> lVar, j00.c<? super T> cVar) {
        kotlin.jvm.internal.d0.e(0);
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        lVar.invoke(pVar);
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        kotlin.jvm.internal.d0.e(1);
        return F;
    }

    @m80.l
    public static final <T> Object f(@m80.k x00.l<? super p<? super T>, yz.g2> lVar, @m80.k j00.c<? super T> cVar) {
        p b11 = b(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        try {
            lVar.invoke(b11);
            Object F = b11.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return F;
        } catch (Throwable th2) {
            b11.X();
            throw th2;
        }
    }

    public static final <T> Object g(x00.l<? super p<? super T>, yz.g2> lVar, j00.c<? super T> cVar) {
        kotlin.jvm.internal.d0.e(0);
        p b11 = b(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        try {
            lVar.invoke(b11);
            Object F = b11.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            kotlin.jvm.internal.d0.e(1);
            return F;
        } catch (Throwable th2) {
            b11.X();
            throw th2;
        }
    }
}
