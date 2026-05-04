package androidx.compose.foundation.gestures.snapping;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {175}, m = "tryApproach", n = {}, s = {})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$tryApproach$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, c<? super SnapFlingBehavior$tryApproach$1> cVar) {
        super(cVar);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object tryApproach;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryApproach = this.this$0.tryApproach(null, 0.0f, 0.0f, null, this);
        return tryApproach;
    }
}
