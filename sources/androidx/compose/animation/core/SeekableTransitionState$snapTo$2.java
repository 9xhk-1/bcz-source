package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", i = {}, l = {457}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState<S> seekableTransitionState, S s11, Transition<S> transition, j00.c<? super SeekableTransitionState$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = seekableTransitionState;
        this.$targetState = s11;
        this.$transition = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new SeekableTransitionState$snapTo$2(this.this$0, this.$targetState, this.$transition, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((SeekableTransitionState$snapTo$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object waitForCompositionAfterTargetStateChange;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            this.this$0.endAllAnimations();
            ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
            this.this$0.setFraction(0.0f);
            S s11 = this.$targetState;
            float f11 = g0.g(s11, this.this$0.getCurrentState()) ? -4.0f : g0.g(s11, this.this$0.getTargetState()) ? -5.0f : -3.0f;
            this.$transition.updateTarget$animation_core_release(this.$targetState);
            this.$transition.setPlayTimeNanos(0L);
            this.this$0.setTargetState$animation_core_release(this.$targetState);
            this.this$0.setFraction(0.0f);
            this.this$0.setCurrentState$animation_core_release(this.$targetState);
            this.$transition.resetAnimationFraction$animation_core_release(f11);
            if (f11 == -3.0f) {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                this.label = 1;
                waitForCompositionAfterTargetStateChange = seekableTransitionState.waitForCompositionAfterTargetStateChange(this);
                if (waitForCompositionAfterTargetStateChange == l11) {
                    return l11;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        this.$transition.onTransitionEnd$animation_core_release();
        return g2.f100423a;
    }
}
