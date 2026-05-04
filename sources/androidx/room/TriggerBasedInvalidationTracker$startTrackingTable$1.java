package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {323, 328}, m = "startTrackingTable", n = {"this", c60.c.f8163j, "tableId", "this", c60.c.f8163j, "tableName", "tableId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$startTrackingTable$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, j00.c<? super TriggerBasedInvalidationTracker$startTrackingTable$1> cVar) {
        super(cVar);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object startTrackingTable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startTrackingTable = this.this$0.startTrackingTable(null, 0, this);
        return startTrackingTable;
    }
}
