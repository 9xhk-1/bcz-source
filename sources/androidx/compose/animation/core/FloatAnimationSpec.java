package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(@k FloatAnimationSpec floatAnimationSpec, float f11, float f12, float f13) {
            return FloatAnimationSpec.super.getEndVelocity(f11, f12, f13);
        }

        @Deprecated
        @k
        public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(@k FloatAnimationSpec floatAnimationSpec, @k TwoWayConverter<Float, V> twoWayConverter) {
            return FloatAnimationSpec.super.vectorize((TwoWayConverter) twoWayConverter);
        }
    }

    long getDurationNanos(float f11, float f12, float f13);

    default float getEndVelocity(float f11, float f12, float f13) {
        return getVelocityFromNanos(getDurationNanos(f11, f12, f13), f11, f12, f13);
    }

    float getValueFromNanos(long j11, float f11, float f12, float f13);

    float getVelocityFromNanos(long j11, float f11, float f12, float f13);

    @Override // androidx.compose.animation.core.AnimationSpec
    @k
    default <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(@k TwoWayConverter<Float, V> twoWayConverter) {
        return new VectorizedFloatAnimationSpec<>(this);
    }
}
