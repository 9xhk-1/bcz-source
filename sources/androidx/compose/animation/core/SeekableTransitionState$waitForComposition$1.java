package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {543, 2138}, m = "waitForComposition", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class SeekableTransitionState$waitForComposition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$waitForComposition$1(SeekableTransitionState<S> seekableTransitionState, j00.c<? super SeekableTransitionState$waitForComposition$1> cVar) {
        super(cVar);
        this.this$0 = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object waitForComposition;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        waitForComposition = this.this$0.waitForComposition(this);
        return waitForComposition;
    }
}
