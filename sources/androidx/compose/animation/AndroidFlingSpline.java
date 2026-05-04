package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidFlingSpline {
    public static final int $stable;

    @k
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final int NbSamples = 100;

    @k
    private static final float[] SplinePositions;

    @k
    private static final float[] SplineTimes;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        public FlingResult(float f11, float f12) {
            this.distanceCoefficient = f11;
            this.velocityCoefficient = f12;
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = flingResult.distanceCoefficient;
            }
            if ((i11 & 2) != 0) {
                f12 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f11, f12);
        }

        public final float component1() {
            return this.distanceCoefficient;
        }

        public final float component2() {
            return this.velocityCoefficient;
        }

        @k
        public final FlingResult copy(float f11, float f12) {
            return new FlingResult(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return (Float.hashCode(this.distanceCoefficient) * 31) + Float.hashCode(this.velocityCoefficient);
        }

        @k
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        SplineBasedDecayKt.computeSplineInfo(fArr, fArr2, 100);
        $stable = 8;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f11, float f12) {
        return Math.log((Math.abs(f11) * 0.35f) / f12);
    }

    @k
    public final FlingResult flingPosition(float f11) {
        float f12 = 0.0f;
        float f13 = 1.0f;
        float H = u.H(f11, 0.0f, 1.0f);
        float f14 = 100;
        int i11 = (int) (f14 * H);
        if (i11 < 100) {
            float f15 = i11 / f14;
            int i12 = i11 + 1;
            float f16 = i12 / f14;
            float[] fArr = SplinePositions;
            float f17 = fArr[i11];
            float f18 = (fArr[i12] - f17) / (f16 - f15);
            float f19 = ((H - f15) * f18) + f17;
            f12 = f18;
            f13 = f19;
        }
        return new FlingResult(f13, f12);
    }
}
