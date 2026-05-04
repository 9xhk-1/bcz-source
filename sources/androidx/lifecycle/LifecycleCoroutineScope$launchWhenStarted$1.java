package androidx.lifecycle;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class LifecycleCoroutineScope$launchWhenStarted$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ p<r0, j00.c<? super g2>, Object> $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleCoroutineScope$launchWhenStarted$1(LifecycleCoroutineScope lifecycleCoroutineScope, p<? super r0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super LifecycleCoroutineScope$launchWhenStarted$1> cVar) {
        super(2, cVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.this$0, this.$block, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            Lifecycle lifecycle$lifecycle_common = this.this$0.getLifecycle$lifecycle_common();
            p<r0, j00.c<? super g2>, Object> pVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, pVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
