package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(@m80.k Density density) {
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f11) {
        float f12;
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.INSTANCE;
        f12 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        return androidFlingSpline.deceleration(f11, f12 * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f11) {
        float f12;
        double d11;
        double d12;
        double splineDeceleration = getSplineDeceleration(f11);
        f12 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        double d13 = f12 * this.magicPhysicalCoefficient;
        d11 = WindowInsetsConnection_androidKt.DecelerationRate;
        d12 = WindowInsetsConnection_androidKt.DecelMinusOne;
        return ((float) (d13 * Math.exp((d11 / d12) * splineDeceleration))) * Math.signum(f11);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f11, float f12) {
        double d11;
        double splineDeceleration = getSplineDeceleration(f12);
        d11 = WindowInsetsConnection_androidKt.DecelMinusOne;
        return (long) (Math.exp(splineDeceleration / d11) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f11, float f12) {
        return f11 + flingDistance(f12);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j11, float f11, float f12) {
        long durationNanos = getDurationNanos(0.0f, f12);
        return f11 + (flingDistance(f12) * AndroidFlingSpline.FlingResult.m602getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m597flingPositionLfoxSSI(durationNanos > 0 ? j11 / durationNanos : 1.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j11, float f11, float f12) {
        long durationNanos = getDurationNanos(0.0f, f12);
        return ((AndroidFlingSpline.FlingResult.m603getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m597flingPositionLfoxSSI(durationNanos > 0 ? j11 / durationNanos : 1.0f)) * flingDistance(f12)) / durationNanos) * 1.0E9f;
    }
}
