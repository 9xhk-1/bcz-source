package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 4)
/* loaded from: classes.dex */
public final class AnimationResult<T, V extends AnimationVector> {
    public static final int $stable = 0;

    @k
    private final AnimationEndReason endReason;

    @k
    private final AnimationState<T, V> endState;

    public AnimationResult(@k AnimationState<T, V> animationState, @k AnimationEndReason animationEndReason) {
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    @k
    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    @k
    public final AnimationState<T, V> getEndState() {
        return this.endState;
    }

    @k
    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
