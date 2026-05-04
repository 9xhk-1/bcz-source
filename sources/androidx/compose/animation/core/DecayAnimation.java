package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 3)
/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;

    @k
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;

    @k
    private final V endVelocity;
    private final T initialValue;

    @k
    private final V initialValueVector;

    @k
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;

    @k
    private final TwoWayConverter<T, V> typeConverter;

    public DecayAnimation(@k VectorizedDecayAnimationSpec<V> vectorizedDecayAnimationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, @k V v11) {
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t11;
        V invoke = getTypeConverter().getConvertToVector().invoke(t11);
        this.initialValueVector = invoke;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(v11);
        this.targetValue = getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.getTargetValue(invoke, v11));
        this.durationNanos = vectorizedDecayAnimationSpec.getDurationNanos(invoke, v11);
        V v12 = (V) AnimationVectorsKt.copy(vectorizedDecayAnimationSpec.getVelocityFromNanos(getDurationNanos(), invoke, v11));
        this.endVelocity = v12;
        int size$animation_core_release = v12.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v13 = this.endVelocity;
            v13.set$animation_core_release(i11, u.H(v13.get$animation_core_release(i11), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    @k
    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    @k
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j11) {
        return !isFinishedFromNanos(j11) ? (T) getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j11, this.initialValueVector, this.initialVelocityVector)) : getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    @k
    public V getVelocityVectorFromNanos(long j11) {
        return !isFinishedFromNanos(j11) ? this.animationSpec.getVelocityFromNanos(j11, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    public DecayAnimation(@k DecayAnimationSpec<T> decayAnimationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, @k V v11) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t11, v11);
    }

    public DecayAnimation(@k DecayAnimationSpec<T> decayAnimationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, T t12) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t11, twoWayConverter.getConvertToVector().invoke(t12));
    }
}
