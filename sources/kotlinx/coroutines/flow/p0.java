package kotlinx.coroutines.flow;

import h40.x0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n426#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
/* loaded from: classes8.dex */
public final class p0 extends kotlinx.coroutines.flow.internal.c<n0<?>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final AtomicReference<Object> f68350a = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@m80.k n0<?> n0Var) {
        x0 x0Var;
        if (h40.g.a(this.f68350a) != null) {
            return false;
        }
        AtomicReference<Object> atomicReference = this.f68350a;
        x0Var = o0.f68347a;
        h40.g.d(atomicReference, x0Var);
        return true;
    }

    @m80.l
    public final Object e(@m80.k j00.c<? super g2> cVar) {
        x0 x0Var;
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        AtomicReference atomicReference = this.f68350a;
        x0Var = o0.f68347a;
        if (!androidx.camera.view.q.a(atomicReference, x0Var, pVar)) {
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F == kotlin.coroutines.intrinsics.b.l() ? F : g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j00.c<g2>[] b(@m80.k n0<?> n0Var) {
        h40.g.d(this.f68350a, null);
        return kotlinx.coroutines.flow.internal.b.f68157a;
    }

    public final void g() {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        AtomicReference<Object> atomicReference = this.f68350a;
        while (true) {
            Object a11 = h40.g.a(atomicReference);
            if (a11 == null) {
                return;
            }
            x0Var = o0.f68348b;
            if (a11 == x0Var) {
                return;
            }
            x0Var2 = o0.f68347a;
            if (a11 == x0Var2) {
                AtomicReference<Object> atomicReference2 = this.f68350a;
                x0Var3 = o0.f68348b;
                if (androidx.camera.view.q.a(atomicReference2, a11, x0Var3)) {
                    return;
                }
            } else {
                AtomicReference<Object> atomicReference3 = this.f68350a;
                x0Var4 = o0.f68347a;
                if (androidx.camera.view.q.a(atomicReference3, a11, x0Var4)) {
                    Result.a aVar = Result.Companion;
                    ((c40.p) a11).resumeWith(Result.m6308constructorimpl(g2.f100423a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        x0 x0Var;
        x0 x0Var2;
        AtomicReference<Object> atomicReference = this.f68350a;
        x0Var = o0.f68347a;
        Object andSet = atomicReference.getAndSet(x0Var);
        kotlin.jvm.internal.g0.m(andSet);
        x0Var2 = o0.f68348b;
        return andSet == x0Var2;
    }
}
