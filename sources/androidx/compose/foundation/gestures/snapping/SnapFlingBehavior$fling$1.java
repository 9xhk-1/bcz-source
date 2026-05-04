package androidx.compose.foundation.gestures.snapping;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {115}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, c<? super SnapFlingBehavior$fling$1> cVar) {
        super(cVar);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object fling;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fling = this.this$0.fling(null, 0.0f, null, this);
        return fling;
    }
}
