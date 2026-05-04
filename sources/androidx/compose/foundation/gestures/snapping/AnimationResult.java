package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AnimationResult<T, V extends AnimationVector> {

    @k
    private final AnimationState<T, V> currentAnimationState;
    private final T remainingOffset;

    public AnimationResult(T t11, @k AnimationState<T, V> animationState) {
        this.remainingOffset = t11;
        this.currentAnimationState = animationState;
    }

    public final T component1() {
        return this.remainingOffset;
    }

    @k
    public final AnimationState<T, V> component2() {
        return this.currentAnimationState;
    }

    @k
    public final AnimationState<T, V> getCurrentAnimationState() {
        return this.currentAnimationState;
    }

    public final T getRemainingOffset() {
        return this.remainingOffset;
    }
}
