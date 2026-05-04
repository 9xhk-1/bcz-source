package c40;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class j {
    public static final <T> T a(@m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar) throws InterruptedException {
        o1 a11;
        kotlin.coroutines.d j11;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(kotlin.coroutines.c.f66933w0);
        if (cVar == null) {
            a11 = o3.f7899a.b();
            j11 = k0.j(b2.f7824a, dVar.plus(a11));
        } else {
            o1 o1Var = cVar instanceof o1 ? (o1) cVar : null;
            if (o1Var != null) {
                o1 o1Var2 = o1Var.k0() ? o1Var : null;
                if (o1Var2 != null) {
                    a11 = o1Var2;
                    j11 = k0.j(b2.f7824a, dVar);
                }
            }
            a11 = o3.f7899a.a();
            j11 = k0.j(b2.f7824a, dVar);
        }
        g gVar = new g(j11, currentThread, a11);
        gVar.d2(CoroutineStart.DEFAULT, gVar, pVar);
        return (T) gVar.e2();
    }

    public static /* synthetic */ Object b(kotlin.coroutines.d dVar, x00.p pVar, int i11, Object obj) throws InterruptedException {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return i.f(dVar, pVar);
    }
}
