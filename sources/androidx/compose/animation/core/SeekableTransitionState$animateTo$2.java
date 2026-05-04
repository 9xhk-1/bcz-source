package androidx.compose.animation.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.r0;
import c40.s0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", i = {}, l = {599}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", i = {0}, l = {2143, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 614, 668, 670}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    @u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2137:1\n120#2,10:2138\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n*L\n610#1:2138,10\n*E\n"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s11, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = seekableTransitionState;
            this.$targetState = s11;
            this.$transition = transition;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x01e8, code lost:
        
            if (r2 == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01d6, code lost:
        
            if (r2 == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00b7, code lost:
        
            if (r2 == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
        
            if (r2 == r0) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 504
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s11, FiniteAnimationSpec<Float> finiteAnimationSpec, j00.c<? super SeekableTransitionState$animateTo$2> cVar) {
        super(1, cVar);
        this.$transition = transition;
        this.this$0 = seekableTransitionState;
        this.$targetState = s11;
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new SeekableTransitionState$animateTo$2(this.$transition, this.this$0, this.$targetState, this.$animationSpec, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((SeekableTransitionState$animateTo$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null);
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
        this.$transition.onTransitionEnd$animation_core_release();
        return g2.f100423a;
    }
}
