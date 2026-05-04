package androidx.room;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ x00.a<g2> $onRefreshCompleted;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, x00.a<g2> aVar, j00.c<? super TriggerBasedInvalidationTracker$refreshInvalidationAsync$3> cVar) {
        super(2, cVar);
        this.this$0 = triggerBasedInvalidationTracker;
        this.$onRefreshCompleted = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this.this$0, this.$onRefreshCompleted, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((TriggerBasedInvalidationTracker$refreshInvalidationAsync$3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                kotlin.e.n(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
                this.label = 1;
                obj = triggerBasedInvalidationTracker.notifyInvalidation(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.$onRefreshCompleted.invoke();
            return g2.f100423a;
        } catch (Throwable th2) {
            this.$onRefreshCompleted.invoke();
            throw th2;
        }
    }
}
