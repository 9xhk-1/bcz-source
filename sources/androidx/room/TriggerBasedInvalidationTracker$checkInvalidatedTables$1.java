package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 1}, l = {440, 448}, m = "checkInvalidatedTables", n = {c60.c.f8163j, "invalidatedTableIds"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$checkInvalidatedTables$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$checkInvalidatedTables$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, j00.c<? super TriggerBasedInvalidationTracker$checkInvalidatedTables$1> cVar) {
        super(cVar);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object checkInvalidatedTables;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkInvalidatedTables = this.this$0.checkInvalidatedTables(null, this);
        return checkInvalidatedTables;
    }
}
