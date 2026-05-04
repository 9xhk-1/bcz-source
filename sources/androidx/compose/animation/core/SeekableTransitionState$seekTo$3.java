package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.k;
import c40.r0;
import c40.s0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    final /* synthetic */ float $fraction;
    final /* synthetic */ S $oldTargetState;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", i = {}, l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", i = {}, l = {TypedValues.PositionType.TYPE_PERCENT_X}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00401 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00401(SeekableTransitionState<S> seekableTransitionState, j00.c<? super C00401> cVar) {
                super(2, cVar);
                this.this$0 = seekableTransitionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C00401(this.this$0, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C00401) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object runAnimations;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.label;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    runAnimations = seekableTransitionState.runAnimations(this);
                    if (runAnimations == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(S s11, S s12, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f11, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$targetState = s11;
            this.$oldTargetState = s12;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableObjectList mutableObjectList;
            Object waitForCompositionAfterTargetStateChange;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                r0 r0Var = (r0) this.L$0;
                if (g0.g(this.$targetState, this.$oldTargetState)) {
                    ((SeekableTransitionState) this.this$0).currentAnimation = null;
                    if (g0.g(this.this$0.getCurrentState(), this.$targetState)) {
                        return g2.f100423a;
                    }
                } else {
                    this.this$0.moveAnimationToInitialState();
                }
                if (!g0.g(this.$targetState, this.$oldTargetState)) {
                    this.$transition.updateTarget$animation_core_release(this.$targetState);
                    this.$transition.setPlayTimeNanos(0L);
                    this.this$0.setTargetState$animation_core_release(this.$targetState);
                    this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
                }
                this.this$0.setFraction(this.$fraction);
                mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                if (mutableObjectList.isNotEmpty()) {
                    k.f(r0Var, null, null, new C00401(this.this$0, null), 3, null);
                } else {
                    ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                }
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                this.label = 1;
                waitForCompositionAfterTargetStateChange = seekableTransitionState.waitForCompositionAfterTargetStateChange(this);
                if (waitForCompositionAfterTargetStateChange == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.this$0.seekToFraction();
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekTo$3(S s11, S s12, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f11, j00.c<? super SeekableTransitionState$seekTo$3> cVar) {
        super(1, cVar);
        this.$targetState = s11;
        this.$oldTargetState = s12;
        this.this$0 = seekableTransitionState;
        this.$transition = transition;
        this.$fraction = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new SeekableTransitionState$seekTo$3(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((SeekableTransitionState$seekTo$3) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
            this.label = 1;
            if (s0.g(anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
