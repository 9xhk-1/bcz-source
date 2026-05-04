package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlingCalculator {
    public static final int $stable = 0;

    @k
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f11, float f12, long j11) {
            this.initialVelocity = f11;
            this.distance = f12;
            this.duration = j11;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f11, float f12, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = flingInfo.initialVelocity;
            }
            if ((i11 & 2) != 0) {
                f12 = flingInfo.distance;
            }
            if ((i11 & 4) != 0) {
                j11 = flingInfo.duration;
            }
            return flingInfo.copy(f11, f12, j11);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        @k
        public final FlingInfo copy(float f11, float f12, long j11) {
            return new FlingInfo(f11, f12, j11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public final float position(long j11) {
            long j12 = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j12 > 0 ? j11 / j12 : 1.0f).getDistanceCoefficient();
        }

        @k
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j11) {
            long j12 = this.duration;
            return (((AndroidFlingSpline.INSTANCE.flingPosition(j12 > 0 ? j11 / j12 : 1.0f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }
    }

    public FlingCalculator(float f11, @k Density density) {
        this.friction = f11;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float f11) {
        return AndroidFlingSpline.INSTANCE.deceleration(f11, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f11) {
        float f12;
        float f13;
        double splineDeceleration = getSplineDeceleration(f11);
        f12 = FlingCalculatorKt.DecelerationRate;
        double d11 = f12 - 1.0d;
        double d12 = this.friction * this.magicPhysicalCoefficient;
        f13 = FlingCalculatorKt.DecelerationRate;
        return (float) (d12 * Math.exp((f13 / d11) * splineDeceleration));
    }

    public final long flingDuration(float f11) {
        float f12;
        double splineDeceleration = getSplineDeceleration(f11);
        f12 = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f12 - 1.0d)) * 1000.0d);
    }

    @k
    public final FlingInfo flingInfo(float f11) {
        float f12;
        float f13;
        double splineDeceleration = getSplineDeceleration(f11);
        f12 = FlingCalculatorKt.DecelerationRate;
        double d11 = f12 - 1.0d;
        double d12 = this.friction * this.magicPhysicalCoefficient;
        f13 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(f11, (float) (d12 * Math.exp((f13 / d11) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d11) * 1000.0d));
    }

    @k
    public final Density getDensity() {
        return this.density;
    }
}
