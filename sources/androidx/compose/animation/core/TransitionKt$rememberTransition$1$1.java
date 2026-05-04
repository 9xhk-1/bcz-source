package androidx.compose.animation.core;

import c40.n;
import c40.r0;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", i = {0}, l = {2143}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2137:1\n120#2,10:2138\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n806#1:2138,10\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState<T> transitionState, j00.c<? super TransitionKt$rememberTransition$1$1> cVar) {
        super(2, cVar);
        this.$transitionState = transitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((TransitionKt$rememberTransition$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n40.a compositionContinuationMutex$animation_core_release;
        TransitionState transitionState;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core_release();
            compositionContinuationMutex$animation_core_release = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex$animation_core_release();
            TransitionState transitionState2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex$animation_core_release;
            this.L$1 = transitionState2;
            this.label = 1;
            if (compositionContinuationMutex$animation_core_release.lock(null, this) == l11) {
                return l11;
            }
            transitionState = transitionState2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (TransitionState) this.L$1;
            compositionContinuationMutex$animation_core_release = (n40.a) this.L$0;
            kotlin.e.n(obj);
        }
        try {
            ((SeekableTransitionState) transitionState).setComposedTargetState$animation_core_release(transitionState.getTargetState());
            n compositionContinuation$animation_core_release = ((SeekableTransitionState) transitionState).getCompositionContinuation$animation_core_release();
            if (compositionContinuation$animation_core_release != null) {
                Result.a aVar = Result.Companion;
                compositionContinuation$animation_core_release.resumeWith(Result.m6308constructorimpl(transitionState.getTargetState()));
            }
            ((SeekableTransitionState) transitionState).setCompositionContinuation$animation_core_release(null);
            g2 g2Var = g2.f100423a;
            compositionContinuationMutex$animation_core_release.unlock(null);
            return g2Var;
        } catch (Throwable th2) {
            compositionContinuationMutex$animation_core_release.unlock(null);
            throw th2;
        }
    }
}
