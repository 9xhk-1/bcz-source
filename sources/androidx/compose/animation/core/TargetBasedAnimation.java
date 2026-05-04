package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n52#2,5:498\n1#3:503\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n274#1:498,5\n*E\n"})
/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 8;
    private long _durationNanos;

    @l
    private V _endVelocity;

    @k
    private final VectorizedAnimationSpec<V> animationSpec;

    @k
    private V initialValueVector;

    @k
    private final V initialVelocityVector;
    private T mutableInitialValue;
    private T mutableTargetValue;

    @k
    private V targetValueVector;

    @k
    private final TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(@k VectorizedAnimationSpec<V> vectorizedAnimationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, T t12, @l V v11) {
        V v12;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = t12;
        this.mutableInitialValue = t11;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(t11);
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(t12);
        this.initialVelocityVector = (v11 == null || (v12 = (V) AnimationVectorsKt.copy(v11)) == null) ? (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t11)) : v12;
        this._durationNanos = -1L;
    }

    private final V getEndVelocity() {
        V v11 = this._endVelocity;
        if (v11 != null) {
            return v11;
        }
        V endVelocity = this.animationSpec.getEndVelocity(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = endVelocity;
        return endVelocity;
    }

    @k
    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.getDurationNanos(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    public final T getMutableInitialValue$animation_core_release() {
        return this.mutableInitialValue;
    }

    public final T getMutableTargetValue$animation_core_release() {
        return this.mutableTargetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.mutableTargetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    @k
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j11) {
        if (isFinishedFromNanos(j11)) {
            return getTargetValue();
        }
        V valueFromNanos = this.animationSpec.getValueFromNanos(j11, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int size$animation_core_release = valueFromNanos.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            if (Float.isNaN(valueFromNanos.get$animation_core_release(i11))) {
                PreconditionsKt.throwIllegalStateException("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j11);
            }
        }
        return getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
    }

    @Override // androidx.compose.animation.core.Animation
    @k
    public V getVelocityVectorFromNanos(long j11) {
        return !isFinishedFromNanos(j11) ? this.animationSpec.getVelocityFromNanos(j11, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : getEndVelocity();
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    public final void setMutableInitialValue$animation_core_release(T t11) {
        if (g0.g(t11, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t11;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(t11);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final void setMutableTargetValue$animation_core_release(T t11) {
        if (g0.g(this.mutableTargetValue, t11)) {
            return;
        }
        this.mutableTargetValue = t11;
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(t11);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    @k
    public String toString() {
        return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i11, v vVar) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i11 & 16) != 0 ? null : animationVector);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i11, v vVar) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i11 & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(@k AnimationSpec<T> animationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, T t12, @l V v11) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t11, t12, v11);
    }
}
