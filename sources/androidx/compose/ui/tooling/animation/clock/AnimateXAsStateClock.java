package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimateXAsStateClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimateXAsStateClock<T, V extends AnimationVector> implements ComposeAnimationClock<AnimateXAsStateComposeAnimation<T, V>, TargetState<T>> {
    public static final int $stable = 8;

    @k
    private final AnimateXAsStateComposeAnimation<T, V> animation;
    private long clockTimeNanos;

    @k
    private TargetState<T> state = new TargetState<>(getAnimation().m5037getAnimationObject().getValue(), getAnimation().m5037getAnimationObject().getValue());
    private T currentValue = getAnimation().getToolingState().getValue();

    @k
    private TargetBasedAnimation<T, V> currAnimation = getCurrentAnimation();

    public AnimateXAsStateClock(@k AnimateXAsStateComposeAnimation<T, V> animateXAsStateComposeAnimation) {
        this.animation = animateXAsStateComposeAnimation;
    }

    private final TargetBasedAnimation<T, V> getCurrentAnimation() {
        return AnimationKt.TargetBasedAnimation(getAnimation().getAnimationSpec(), getAnimation().m5037getAnimationObject().getTypeConverter(), getState().getInitial(), getState().getTarget(), getAnimation().m5037getAnimationObject().getVelocity());
    }

    private final void setClockTimeNanos(long j11) {
        this.clockTimeNanos = j11;
        setCurrentValue(this.currAnimation.getValueFromNanos(j11));
    }

    private final void setCurrentValue(T t11) {
        this.currentValue = t11;
        getAnimation().getToolingState().setValue(t11);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        String label = getAnimation().getLabel();
        T t11 = this.currentValue;
        g0.n(t11, "null cannot be cast to non-null type kotlin.Any");
        return a00.g0.l(new ComposeAnimatedProperty(label, t11));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(this.currAnimation.getDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(this.currAnimation.getDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<TransitionInfo> getTransitions(long j11) {
        return a00.g0.l(Utils_androidKt.createTransitionInfo(this.currAnimation, getAnimation().getLabel(), getAnimation().getAnimationSpec(), j11));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j11) {
        setClockTimeNanos(j11);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@k Object obj, @l Object obj2) {
        TargetState<T> parseParametersToValue = Utils_androidKt.parseParametersToValue(this.currentValue, obj, obj2);
        if (parseParametersToValue != null) {
            setState((TargetState) parseParametersToValue);
        }
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public AnimateXAsStateComposeAnimation<T, V> getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public TargetState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(@k TargetState<T> targetState) {
        this.state = targetState;
        this.currAnimation = getCurrentAnimation();
        setClockTime(0L);
    }
}
