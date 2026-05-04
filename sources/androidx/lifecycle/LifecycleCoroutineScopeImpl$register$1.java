package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.p2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, j00.c<? super LifecycleCoroutineScopeImpl$register$1> cVar) {
        super(2, cVar);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, cVar);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        r0 r0Var = (r0) this.L$0;
        if (this.this$0.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            this.this$0.getLifecycle$lifecycle_common().addObserver(this.this$0);
        } else {
            p2.j(r0Var.getCoroutineContext(), null, 1, null);
        }
        return g2.f100423a;
    }
}
