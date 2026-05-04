package kotlinx.coroutines.flow.internal;

import c40.l2;
import h40.t0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class SafeCollector_commonKt {
    @w00.j(name = "checkContext")
    public static final void b(@m80.k final SafeCollector<?> safeCollector, @m80.k kotlin.coroutines.d dVar) {
        if (((Number) dVar.fold(0, new x00.p() { // from class: kotlinx.coroutines.flow.internal.v
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                int c11;
                c11 = SafeCollector_commonKt.c(SafeCollector.this, ((Integer) obj).intValue(), (d.b) obj2);
                return Integer.valueOf(c11);
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + dVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int c(SafeCollector safeCollector, int i11, d.b bVar) {
        d.c<?> key = bVar.getKey();
        d.b bVar2 = safeCollector.collectContext.get(key);
        if (key != l2.f7886e0) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i11 + 1;
        }
        l2 l2Var = (l2) bVar2;
        g0.n(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        l2 d11 = d((l2) bVar, l2Var);
        if (d11 == l2Var) {
            return l2Var == null ? i11 : i11 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d11 + ", expected child of " + l2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @m80.l
    public static final l2 d(@m80.l l2 l2Var, @m80.l l2 l2Var2) {
        while (l2Var != null) {
            if (l2Var == l2Var2 || !(l2Var instanceof t0)) {
                return l2Var;
            }
            l2Var = ((t0) l2Var).getParent();
        }
        return null;
    }

    @v0
    @m80.k
    public static final <T> kotlinx.coroutines.flow.i<T> e(@yz.b @m80.k x00.p<? super kotlinx.coroutines.flow.j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new SafeCollector_commonKt$unsafeFlow$1(pVar);
    }
}
