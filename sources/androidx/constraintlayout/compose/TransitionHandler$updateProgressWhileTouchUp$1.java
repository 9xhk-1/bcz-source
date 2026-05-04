package androidx.constraintlayout.compose;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.TransitionHandler", f = "TransitionHandler.kt", i = {0}, l = {74}, m = "updateProgressWhileTouchUp", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class TransitionHandler$updateProgressWhileTouchUp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransitionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionHandler$updateProgressWhileTouchUp$1(TransitionHandler transitionHandler, j00.c<? super TransitionHandler$updateProgressWhileTouchUp$1> cVar) {
        super(cVar);
        this.this$0 = transitionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateProgressWhileTouchUp(this);
    }
}
