package androidx.room;

import androidx.room.TriggerBasedInvalidationTracker$createFlow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_test_nodate, 250}, m = "emit", n = {"this", "newVersions", "this", "newVersions"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2<? super T> anonymousClass2, j00.c<? super TriggerBasedInvalidationTracker$createFlow$1$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((int[]) null, (j00.c<? super g2>) this);
    }
}
