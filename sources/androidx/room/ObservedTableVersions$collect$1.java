package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m = "collect", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ObservedTableVersions$collect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ObservedTableVersions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservedTableVersions$collect$1(ObservedTableVersions observedTableVersions, j00.c<? super ObservedTableVersions$collect$1> cVar) {
        super(cVar);
        this.this$0 = observedTableVersions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
