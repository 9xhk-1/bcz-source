package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;

    @k
    private final FlingCalculator flingCalculator;

    public SplineBasedFloatDecayAnimationSpec(@k Density density) {
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float flingDistance(float f11) {
        return this.flingCalculator.flingDistance(f11) * Math.signum(f11);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f11, float f12) {
        return this.flingCalculator.flingDuration(f12) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f11, float f12) {
        return f11 + flingDistance(f12);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j11, float f11, float f12) {
        return f11 + this.flingCalculator.flingInfo(f12).position(j11 / 1000000);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j11, float f11, float f12) {
        return this.flingCalculator.flingInfo(f12).velocity(j11 / 1000000);
    }
}
