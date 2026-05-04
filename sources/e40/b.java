package e40;

import c40.a3;
import c40.r0;
import c40.r2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @a3
    @m80.k
    public static final <E> l0<E> a(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k CoroutineStart coroutineStart, @m80.l x00.l<? super Throwable, g2> lVar, @m80.k x00.p<? super c<E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        kotlin.coroutines.d j11 = c40.k0.j(r0Var, dVar);
        o d11 = r.d(i11, null, null, 6, null);
        a d0Var = coroutineStart.isLazy() ? new d0(j11, d11, pVar) : new a(j11, d11, true);
        if (lVar != null) {
            ((r2) d0Var).z0(lVar);
        }
        ((c40.a) d0Var).d2(coroutineStart, d0Var, pVar);
        return (l0<E>) d0Var;
    }

    public static /* synthetic */ l0 b(r0 r0Var, kotlin.coroutines.d dVar, int i11, CoroutineStart coroutineStart, x00.l lVar, x00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return a(r0Var, dVar, i11, coroutineStart2, lVar, pVar);
    }
}
