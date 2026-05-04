package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {353, 356}, m = "runAnimations", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(SeekableTransitionState<S> seekableTransitionState, j00.c<? super SeekableTransitionState$runAnimations$1> cVar) {
        super(cVar);
        this.this$0 = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object runAnimations;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runAnimations = this.this$0.runAnimations(this);
        return runAnimations;
    }
}
