package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d11 = this.mDampingRatio;
        if (d11 > 1.0d) {
            double d12 = this.mNaturalFreq;
            this.mGammaPlus = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
            double d13 = this.mDampingRatio;
            double d14 = this.mNaturalFreq;
            this.mGammaMinus = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
        } else if (d11 >= 0.0d && d11 < 1.0d) {
            this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d11 * d11));
        }
        this.mInitialized = true;
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f11, float f12) {
        float finalPosition = f11 - getFinalPosition();
        double d11 = this.mNaturalFreq;
        return (float) (((-(d11 * d11)) * finalPosition) - (((d11 * 2.0d) * this.mDampingRatio) * f12));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d11 = this.mNaturalFreq;
        return (float) (d11 * d11);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f11, float f12) {
        return ((double) Math.abs(f12)) < this.mVelocityThreshold && ((double) Math.abs(f11 - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f11;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f11) {
        this.mFinalPosition = f11;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f11);
        this.mInitialized = false;
        return this;
    }

    public void setValueThreshold(double d11) {
        double abs = Math.abs(d11);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    public DynamicAnimation.MassState updateValues(double d11, double d12, long j11) {
        double pow;
        double cos;
        init();
        double d13 = j11 / 1000.0d;
        double d14 = d11 - this.mFinalPosition;
        double d15 = this.mDampingRatio;
        if (d15 > 1.0d) {
            double d16 = this.mGammaMinus;
            double d17 = this.mGammaPlus;
            double d18 = d14 - (((d16 * d14) - d12) / (d16 - d17));
            double d19 = ((d14 * d16) - d12) / (d16 - d17);
            pow = (Math.pow(2.718281828459045d, d16 * d13) * d18) + (Math.pow(2.718281828459045d, this.mGammaPlus * d13) * d19);
            double d21 = this.mGammaMinus;
            double pow2 = d18 * d21 * Math.pow(2.718281828459045d, d21 * d13);
            double d22 = this.mGammaPlus;
            cos = pow2 + (d19 * d22 * Math.pow(2.718281828459045d, d22 * d13));
        } else if (d15 == 1.0d) {
            double d23 = this.mNaturalFreq;
            double d24 = d12 + (d23 * d14);
            double d25 = d14 + (d24 * d13);
            pow = Math.pow(2.718281828459045d, (-d23) * d13) * d25;
            double pow3 = d25 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d13);
            double d26 = this.mNaturalFreq;
            cos = (d24 * Math.pow(2.718281828459045d, (-d26) * d13)) + (pow3 * (-d26));
        } else {
            double d27 = 1.0d / this.mDampedFreq;
            double d28 = this.mNaturalFreq;
            double d29 = d27 * ((d15 * d28 * d14) + d12);
            pow = Math.pow(2.718281828459045d, (-d15) * d28 * d13) * ((Math.cos(this.mDampedFreq * d13) * d14) + (Math.sin(this.mDampedFreq * d13) * d29));
            double d31 = this.mNaturalFreq;
            double d32 = this.mDampingRatio;
            double pow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d13);
            double d33 = this.mDampedFreq;
            double sin = (-d33) * d14 * Math.sin(d33 * d13);
            double d34 = this.mDampedFreq;
            cos = ((-d31) * pow * d32) + (pow4 * (sin + (d29 * d34 * Math.cos(d34 * d13))));
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (pow + this.mFinalPosition);
        massState.mVelocity = (float) cos;
        return massState;
    }

    public SpringForce(float f11) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f11;
    }
}
