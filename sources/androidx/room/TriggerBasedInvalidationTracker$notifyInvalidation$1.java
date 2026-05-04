package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {412}, m = "notifyInvalidation", n = {"this", "$this$ifNotClosed$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$notifyInvalidation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$notifyInvalidation$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, j00.c<? super TriggerBasedInvalidationTracker$notifyInvalidation$1> cVar) {
        super(cVar);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object notifyInvalidation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        notifyInvalidation = this.this$0.notifyInvalidation(this);
        return notifyInvalidation;
    }
}
