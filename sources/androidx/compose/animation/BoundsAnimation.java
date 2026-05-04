package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBoundsAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,103:1\n85#2:104\n113#2,2:105\n85#2:107\n113#2,2:108\n85#2:110\n113#2,2:111\n*S KotlinDebug\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n*L\n39#1:104\n39#1:105,2\n54#1:107\n54#1:108,2\n69#1:110\n69#1:111,2\n*E\n"})
/* loaded from: classes.dex */
public final class BoundsAnimation {
    public static final int $stable = 8;

    @k
    private final MutableState animation$delegate;

    @k
    private FiniteAnimationSpec<Rect> animationSpec;

    @k
    private final MutableState animationState$delegate;

    @k
    private final MutableState boundsTransform$delegate;

    @k
    private final Transition<Boolean> transition;

    @k
    private final SharedTransitionScope transitionScope;

    public BoundsAnimation(@k SharedTransitionScope sharedTransitionScope, @k Transition<Boolean> transition, @k Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, @k BoundsTransform boundsTransform) {
        SpringSpec springSpec;
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(deferredAnimation, null, 2, null);
        this.boundsTransform$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
        springSpec = BoundsAnimationKt.DefaultBoundsAnimation;
        this.animationSpec = springSpec;
        this.animationState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final BoundsTransform getBoundsTransform() {
        return (BoundsTransform) this.boundsTransform$delegate.getValue();
    }

    private final void setAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation) {
        this.animation$delegate.setValue(deferredAnimation);
    }

    private final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform$delegate.setValue(boundsTransform);
    }

    public final void animate(@k final Rect rect, @k final Rect rect2) {
        if (this.transitionScope.isTransitionActive()) {
            if (getAnimationState() == null) {
                this.animationSpec = getBoundsTransform().transform(rect, rect2);
            }
            setAnimationState(getAnimation().animate(new l<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>>() { // from class: androidx.compose.animation.BoundsAnimation$animate$1
                {
                    super(1);
                }

                @Override // x00.l
                public final FiniteAnimationSpec<Rect> invoke(Transition.Segment<Boolean> segment) {
                    return BoundsAnimation.this.getAnimationSpec();
                }
            }, new l<Boolean, Rect>() { // from class: androidx.compose.animation.BoundsAnimation$animate$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Rect invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }

                public final Rect invoke(boolean z11) {
                    return z11 == BoundsAnimation.this.getTransition().getTargetState().booleanValue() ? rect2 : rect;
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation() {
        return (Transition.DeferredAnimation) this.animation$delegate.getValue();
    }

    @k
    public final FiniteAnimationSpec<Rect> getAnimationSpec() {
        return this.animationSpec;
    }

    @m80.l
    public final State<Rect> getAnimationState() {
        return (State) this.animationState$delegate.getValue();
    }

    public final boolean getTarget() {
        return this.transition.getTargetState().booleanValue();
    }

    @k
    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    @k
    public final SharedTransitionScope getTransitionScope() {
        return this.transitionScope;
    }

    @m80.l
    public final Rect getValue() {
        State<Rect> animationState;
        if (!this.transitionScope.isTransitionActive() || (animationState = getAnimationState()) == null) {
            return null;
        }
        return animationState.getValue();
    }

    public final boolean isRunning() {
        Transition transition = this.transition;
        while (transition.getParentTransition() != null) {
            transition = transition.getParentTransition();
            g0.m(transition);
        }
        return !g0.g(transition.getCurrentState(), transition.getTargetState());
    }

    public final void setAnimationSpec(@k FiniteAnimationSpec<Rect> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setAnimationState(@m80.l State<Rect> state) {
        this.animationState$delegate.setValue(state);
    }

    public final void updateAnimation(@k Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, @k BoundsTransform boundsTransform) {
        SpringSpec springSpec;
        if (!g0.g(getAnimation(), deferredAnimation)) {
            setAnimation(deferredAnimation);
            setAnimationState(null);
            springSpec = BoundsAnimationKt.DefaultBoundsAnimation;
            this.animationSpec = springSpec;
        }
        setBoundsTransform(boundsTransform);
    }
}
