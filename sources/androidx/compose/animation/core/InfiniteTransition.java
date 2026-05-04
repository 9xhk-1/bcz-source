package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,345:1\n1101#2:346\n1083#2,2:347\n85#3:349\n113#3,2:350\n85#3:352\n113#3,2:353\n1247#4,6:355\n1247#4,6:361\n423#5,9:367\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n145#1:346\n145#1:347,2\n146#1:349\n146#1:350,2\n148#1:352\n148#1:353,2\n166#1:355,6\n168#1:361,6\n203#1:367,9\n*E\n"})
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;

    @k
    private final String label;

    @k
    private final MutableVector<TransitionAnimationState<?, ?>> _animations = new MutableVector<>(new TransitionAnimationState[16], 0);

    @k
    private final MutableState refreshChildNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private long startTimeNanos = Long.MIN_VALUE;

    @k
    private final MutableState isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,345:1\n85#2:346\n113#2,2:347\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n79#1:346\n79#1:347,2\n*E\n"})
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        @k
        private TargetBasedAnimation<T, V> animation;

        @k
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;

        @k
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;

        @k
        private final TwoWayConverter<T, V> typeConverter;

        @k
        private final MutableState value$delegate;

        public TransitionAnimationState(T t11, T t12, @k TwoWayConverter<T, V> twoWayConverter, @k AnimationSpec<T> animationSpec, @k String str) {
            this.initialValue = t11;
            this.targetValue = t12;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(this.animationSpec, twoWayConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (v) null);
        }

        @k
        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        @k
        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        @k
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged$animation_core_release(long j11) {
            InfiniteTransition.this.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j11;
            }
            long j12 = j11 - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j12));
            this.isFinished = this.animation.isFinishedFromNanos(j12);
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation$animation_core_release(@k TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation = targetBasedAnimation;
        }

        public final void setFinished$animation_core_release(boolean z11) {
            this.isFinished = z11;
        }

        public final void setInitialValue$animation_core_release(T t11) {
            this.initialValue = t11;
        }

        public final void setTargetValue$animation_core_release(T t11) {
            this.targetValue = t11;
        }

        public void setValue$animation_core_release(T t11) {
            this.value$delegate.setValue(t11);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues$animation_core_release(T t11, T t12, @k AnimationSpec<T> animationSpec) {
            this.initialValue = t11;
            this.targetValue = t12;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t11, t12, (AnimationVector) null, 16, (v) null);
            InfiniteTransition.this.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition(@k String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j11) {
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        TransitionAnimationState<?, ?>[] transitionAnimationStateArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            TransitionAnimationState<?, ?> transitionAnimationState = transitionAnimationStateArr[i11];
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(j11);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z11 = false;
            }
        }
        setRunning(!z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z11) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void setRunning(boolean z11) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void addAnimation$animation_core_release(@k TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.add(transitionAnimationState);
        setRefreshChildNeeded(true);
    }

    @k
    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    public final void removeAnimation$animation_core_release(@k TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    @Composable
    public final void run$animation_core_release(@l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-318043801, i12, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (isRunning() || getRefreshChildNeeded()) {
                startRestartGroup.startReplaceGroup(1719883733);
                boolean changedInstance = startRestartGroup.changedInstance(this);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                EffectsKt.LaunchedEffect(this, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue2, startRestartGroup, i12 & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1721270456);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    InfiniteTransition.this.run$animation_core_release(composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
