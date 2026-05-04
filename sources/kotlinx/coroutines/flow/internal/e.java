package kotlinx.coroutines.flow.internal;

import h40.g1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final <T> d<T> b(@m80.k kotlinx.coroutines.flow.i<? extends T> iVar) {
        d<T> dVar = iVar instanceof d ? (d) iVar : null;
        if (dVar == null) {
            return new h(iVar, null, 0, null, 14, null);
        }
        return dVar;
    }

    @m80.l
    public static final <T, V> Object c(@m80.k kotlin.coroutines.d dVar, V v11, @m80.k Object obj, @m80.k x00.p<? super V, ? super j00.c<? super T>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        Object i11 = g1.i(dVar, obj);
        try {
            x xVar = new x(cVar, dVar);
            Object j11 = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.j(pVar, v11, xVar) : ((x00.p) x0.q(pVar, 2)).invoke(v11, xVar);
            g1.f(dVar, i11);
            if (j11 == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return j11;
        } catch (Throwable th2) {
            g1.f(dVar, i11);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(kotlin.coroutines.d dVar, Object obj, Object obj2, x00.p pVar, j00.c cVar, int i11, Object obj3) {
        if ((i11 & 4) != 0) {
            obj2 = g1.g(dVar);
        }
        return c(dVar, obj, obj2, pVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d dVar) {
        return !(jVar instanceof w) ? jVar instanceof r ? jVar : new z(jVar, dVar) : jVar;
    }
}
