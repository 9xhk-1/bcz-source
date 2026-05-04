package androidx.room;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InvalidationTracker$removeObserver$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ InvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidationTracker$removeObserver$1(InvalidationTracker invalidationTracker, j00.c<? super InvalidationTracker$removeObserver$1> cVar) {
        super(2, cVar);
        this.this$0 = invalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new InvalidationTracker$removeObserver$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((InvalidationTracker$removeObserver$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            triggerBasedInvalidationTracker = this.this$0.implementation;
            this.label = 1;
            if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == l11) {
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
