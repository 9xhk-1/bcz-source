package androidx.compose.animation.core;

import a00.q;
import androidx.annotation.FloatRange;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import c40.n;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n+ 5 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2137:1\n85#2:2138\n113#2,2:2139\n85#2:2141\n113#2,2:2142\n79#3:2144\n112#3,2:2145\n71#4:2147\n33#5,5:2148\n52#5,5:2177\n314#6,11:2153\n314#6,11:2164\n919#7,2:2175\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n218#1:2138\n218#1:2139,2\n221#1:2141\n221#1:2142,2\n250#1:2144\n250#1:2145,2\n413#1:2147\n482#1:2148,5\n679#1:2177,5\n523#1:2153,11\n544#1:2164,11\n573#1:2175,2\n*E\n"})
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {

    @k
    private final l<Long, g2> animateOneFrameLambda;
    private S composedTargetState;

    @m80.l
    private n<? super S> compositionContinuation;

    @k
    private final n40.a compositionContinuationMutex;

    @m80.l
    private SeekingAnimationState currentAnimation;

    @k
    private final MutableState currentState$delegate;
    private float durationScale;

    @k
    private final l<Long, g2> firstFrameLambda;

    @k
    private final MutableFloatState fraction$delegate;

    @k
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;

    @k
    private final MutatorMutex mutatorMutex;

    @k
    private final x00.a<g2> recalculateTotalDurationNanos;

    @k
    private final MutableState targetState$delegate;
    private long totalDurationNanos;

    @m80.l
    private Transition<S> transition;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);

    @k
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }

        @k
        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class SeekingAnimationState {
        public static final int $stable = 8;

        @m80.l
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;

        @m80.l
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;

        @k
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        @m80.l
        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        @m80.l
        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        @k
        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final float getValue() {
            return this.value;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void setAnimationSpec(@m80.l VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final void setAnimationSpecDuration(long j11) {
            this.animationSpecDuration = j11;
        }

        public final void setComplete(boolean z11) {
            this.isComplete = z11;
        }

        public final void setDurationNanos(long j11) {
            this.durationNanos = j11;
        }

        public final void setInitialVelocity(@m80.l AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void setProgressNanos(long j11) {
            this.progressNanos = j11;
        }

        public final void setStart(@k AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final void setValue(float f11) {
            this.value = f11;
        }

        @k
        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    public SeekableTransitionState(S s11) {
        super(null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s11, null, 2, null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s11, null, 2, null);
        this.composedTargetState = s11;
        this.recalculateTotalDurationNanos = new x00.a<g2>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Transition transition;
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                transition = ((SeekableTransitionState) seekableTransitionState).transition;
                seekableTransitionState.setTotalDurationNanos$animation_core_release(transition != null ? transition.getTotalDurationNanos() : 0L);
            }
        };
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = n40.g.b(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, null);
        this.firstFrameLambda = new l<Long, g2>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j11) {
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j11;
            }
        };
        this.animateOneFrameLambda = new l<Long, g2>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j11) {
                long j12;
                float f11;
                MutableObjectList mutableObjectList;
                SeekableTransitionState.SeekingAnimationState seekingAnimationState;
                MutableObjectList mutableObjectList2;
                Transition transition;
                MutableObjectList mutableObjectList3;
                j12 = ((SeekableTransitionState) this.this$0).lastFrameTimeNanos;
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j11;
                double d11 = j11 - j12;
                f11 = ((SeekableTransitionState) this.this$0).durationScale;
                long M0 = c10.d.M0(d11 / f11);
                mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                if (mutableObjectList.isNotEmpty()) {
                    mutableObjectList2 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    Object[] objArr = mutableObjectList2.content;
                    int i11 = mutableObjectList2._size;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = (SeekableTransitionState.SeekingAnimationState) objArr[i13];
                        seekableTransitionState.recalculateAnimationValue(seekingAnimationState2, M0);
                        seekingAnimationState2.setComplete(true);
                    }
                    transition = ((SeekableTransitionState) this.this$0).transition;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core_release();
                    }
                    mutableObjectList3 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    int i14 = mutableObjectList3._size;
                    Object[] objArr2 = mutableObjectList3.content;
                    g10.l W1 = u.W1(0, i14);
                    int d12 = W1.d();
                    int f12 = W1.f();
                    if (d12 <= f12) {
                        while (true) {
                            objArr2[d12 - i12] = objArr2[d12];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[d12]).isComplete()) {
                                i12++;
                            }
                            if (d12 == f12) {
                                break;
                            } else {
                                d12++;
                            }
                        }
                    }
                    q.M1(objArr2, null, i14 - i12, i14);
                    mutableObjectList3._size -= i12;
                }
                seekingAnimationState = ((SeekableTransitionState) this.this$0).currentAnimation;
                if (seekingAnimationState != null) {
                    seekingAnimationState.setDurationNanos(this.this$0.getTotalDurationNanos$animation_core_release());
                    this.this$0.recalculateAnimationValue(seekingAnimationState, M0);
                    this.this$0.setFraction(seekingAnimationState.getValue());
                    if (seekingAnimationState.getValue() == 1.0f) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                    }
                    this.this$0.seekToFraction();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(j00.c<? super g2> cVar) {
        float durationScale = SuspendAnimationKt.getDurationScale(cVar.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return g2.f100423a;
        }
        this.durationScale = durationScale;
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, cVar);
        return withFrameNanos == kotlin.coroutines.intrinsics.b.l() ? withFrameNanos : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(j00.c<? super g2> cVar) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, cVar);
            return withFrameNanos == kotlin.coroutines.intrinsics.b.l() ? withFrameNanos : g2.f100423a;
        }
        Object animateOneFrame = animateOneFrame(cVar);
        return animateOneFrame == kotlin.coroutines.intrinsics.b.l() ? animateOneFrame : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core_release();
        }
        this.initialValueAnimations.clear();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || g0.g(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j11 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j11);
                seekingAnimationState.setAnimationSpecDuration(c10.d.M0(j11 * (1.0d - getFraction())));
                seekingAnimationState.getStart().set$animation_core_release(0, getFraction());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.initialValueAnimations.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core_release(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateAnimationValue(SeekingAnimationState seekingAnimationState, long j11) {
        long progressNanos = seekingAnimationState.getProgressNanos() + j11;
        seekingAnimationState.setProgressNanos(progressNanos);
        long animationSpecDuration = seekingAnimationState.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            seekingAnimationState.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec<AnimationVector1D> animationSpec = seekingAnimationState.getAnimationSpec();
        if (animationSpec == null) {
            float f11 = progressNanos / animationSpecDuration;
            seekingAnimationState.setValue((seekingAnimationState.getStart().get$animation_core_release(0) * (1 - f11)) + (f11 * 1.0f));
        } else {
            AnimationVector1D start = seekingAnimationState.getStart();
            AnimationVector1D animationVector1D = Target1;
            AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = ZeroVelocity;
            }
            seekingAnimationState.setValue(u.H(animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity).get$animation_core_release(0), 0.0f, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimations(j00.c<? super yz.g2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            java.lang.Object r2 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.e.n(r10)
            goto L76
        L3b:
            kotlin.e.n(r10)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r9.initialValueAnimations
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4d
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.currentAnimation
            if (r10 != 0) goto L4d
            yz.g2 r10 = yz.g2.f100423a
            return r10
        L4d:
            kotlin.coroutines.d r10 = r0.getContext()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.endAllAnimations()
            r9.lastFrameTimeNanos = r5
            yz.g2 r10 = yz.g2.f100423a
            return r10
        L62:
            long r7 = r9.lastFrameTimeNanos
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            x00.l<java.lang.Long, yz.g2> r10 = r9.firstFrameLambda
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0)
            if (r10 != r1) goto L75
            goto L92
        L75:
            r2 = r9
        L76:
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r2.initialValueAnimations
            boolean r10 = r10.isNotEmpty()
            if (r10 != 0) goto L88
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r2.currentAnimation
            if (r10 == 0) goto L83
            goto L88
        L83:
            r2.lastFrameTimeNanos = r5
            yz.g2 r10 = yz.g2.f100423a
            return r10
        L88:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r10 = r2.animateOneFrame(r0)
            if (r10 != r1) goto L76
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f11, Object obj, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f11, obj, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core_release(c10.d.M0(getFraction() * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f11) {
        this.fraction$delegate.setFloatValue(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForComposition(j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.e.n(r8)
            goto L8c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.e.n(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.getTargetState()
            n40.a r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = n40.a.C0899a.b(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L88
        L5c:
            r6 = r7
        L5d:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            c40.p r2 = new c40.p
            j00.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r2.<init>(r3, r5)
            r2.y()
            r6.setCompositionContinuation$animation_core_release(r2)
            n40.a r3 = r6.getCompositionContinuationMutex$animation_core_release()
            n40.a.C0899a.d(r3, r4, r5, r4)
            java.lang.Object r2 = r2.F()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            if (r2 != r3) goto L86
            l00.f.c(r0)
        L86:
            if (r2 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r8
            r8 = r2
            r0 = r6
        L8c:
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r1)
            if (r8 == 0) goto L95
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L95:
            r1 = -9223372036854775808
            r0.lastFrameTimeNanos = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.e.n(r8)
            goto L9a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.e.n(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.getTargetState()
            n40.a r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = n40.a.C0899a.b(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L96
        L5c:
            r6 = r7
        L5d:
            S r2 = r6.composedTargetState
            boolean r2 = kotlin.jvm.internal.g0.g(r8, r2)
            if (r2 == 0) goto L6b
            n40.a r8 = r6.compositionContinuationMutex
            n40.a.C0899a.d(r8, r4, r5, r4)
            goto La0
        L6b:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            c40.p r2 = new c40.p
            j00.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r2.<init>(r3, r5)
            r2.y()
            r6.setCompositionContinuation$animation_core_release(r2)
            n40.a r3 = r6.getCompositionContinuationMutex$animation_core_release()
            n40.a.C0899a.d(r3, r4, r5, r4)
            java.lang.Object r2 = r2.F()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            if (r2 != r3) goto L94
            l00.f.c(r0)
        L94:
            if (r2 != r1) goto L97
        L96:
            return r1
        L97:
            r1 = r8
            r8 = r2
            r0 = r6
        L9a:
            boolean r2 = kotlin.jvm.internal.g0.g(r8, r1)
            if (r2 == 0) goto La3
        La0:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        La3:
            r2 = -9223372036854775808
            r0.lastFrameTimeNanos = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(j00.c):java.lang.Object");
    }

    @m80.l
    public final Object animateTo(S s11, @m80.l FiniteAnimationSpec<Float> finiteAnimationSpec, @k j00.c<? super g2> cVar) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return g2.f100423a;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(transition, this, s11, finiteAnimationSpec, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    @m80.l
    public final n<S> getCompositionContinuation$animation_core_release() {
        return this.compositionContinuation;
    }

    @k
    public final n40.a getCompositionContinuationMutex$animation_core_release() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos$animation_core_release() {
        return this.totalDurationNanos;
    }

    public final void observeTotalDuration$animation_core_release() {
        l lVar;
        SnapshotStateObserver seekableStateObserver = TransitionKt.getSeekableStateObserver();
        lVar = TransitionKt.SeekableTransitionStateTotalDurationChanged;
        seekableStateObserver.observeReads(this, lVar, this.recalculateTotalDurationNanos);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long j11 = this.totalDurationNanos;
        observeTotalDuration$animation_core_release();
        long j12 = this.totalDurationNanos;
        if (j11 != j12) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j12 != 0) {
                    seekToFraction();
                }
            } else {
                seekingAnimationState.setDurationNanos(j12);
                if (seekingAnimationState.getAnimationSpec() == null) {
                    seekingAnimationState.setAnimationSpecDuration(c10.d.M0((1.0d - seekingAnimationState.getStart().get$animation_core_release(0)) * this.totalDurationNanos));
                }
            }
        }
    }

    @m80.l
    public final Object seekTo(@FloatRange(from = 0.0d, to = 1.0d) float f11, S s11, @k j00.c<? super g2> cVar) {
        boolean z11 = false;
        if (0.0f <= f11 && f11 <= 1.0f) {
            z11 = true;
        }
        if (!z11) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f11);
        }
        Transition<S> transition = this.transition;
        if (transition == null) {
            return g2.f100423a;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$seekTo$3(s11, getTargetState(), this, transition, f11, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    public final void setComposedTargetState$animation_core_release(S s11) {
        this.composedTargetState = s11;
    }

    public final void setCompositionContinuation$animation_core_release(@m80.l n<? super S> nVar) {
        this.compositionContinuation = nVar;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s11) {
        this.currentState$delegate.setValue(s11);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(S s11) {
        this.targetState$delegate.setValue(s11);
    }

    public final void setTotalDurationNanos$animation_core_release(long j11) {
        this.totalDurationNanos = j11;
    }

    @m80.l
    public final Object snapTo(S s11, @k j00.c<? super g2> cVar) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return g2.f100423a;
        }
        if (g0.g(getCurrentState(), s11) && g0.g(getTargetState(), s11)) {
            return g2.f100423a;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2(this, s11, transition, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@k Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || g0.g(transition, transition2))) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
        this.transition = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }
}
