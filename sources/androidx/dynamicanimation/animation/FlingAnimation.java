package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction = DEFAULT_FRICTION;
        private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
        private float mVelocityThreshold;

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f11, float f12) {
            return f12 * this.mFriction;
        }

        public float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f11, float f12) {
            return Math.abs(f12) < this.mVelocityThreshold;
        }

        public void setFrictionScalar(float f11) {
            this.mFriction = f11 * DEFAULT_FRICTION;
        }

        public void setValueThreshold(float f11) {
            this.mVelocityThreshold = f11 * VELOCITY_THRESHOLD_MULTIPLIER;
        }

        public DynamicAnimation.MassState updateValueAndVelocity(float f11, float f12, long j11) {
            float f13 = j11;
            this.mMassState.mVelocity = (float) (f12 * Math.exp((f13 / 1000.0f) * this.mFriction));
            DynamicAnimation.MassState massState = this.mMassState;
            float f14 = this.mFriction;
            massState.mValue = (float) ((f11 - (f12 / f14)) + ((f12 / f14) * Math.exp((f14 * f13) / 1000.0f)));
            DynamicAnimation.MassState massState2 = this.mMassState;
            if (isAtEquilibrium(massState2.mValue, massState2.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f11, float f12) {
        return this.mFlingForce.getAcceleration(f11, f12);
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f11, float f12) {
        return f11 >= this.mMaxValue || f11 <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f11, f12);
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.mFlingForce.setFrictionScalar(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f11) {
        this.mFlingForce.setValueThreshold(f11);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j11) {
        DynamicAnimation.MassState updateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j11);
        float f11 = updateValueAndVelocity.mValue;
        this.mValue = f11;
        float f12 = updateValueAndVelocity.mVelocity;
        this.mVelocity = f12;
        float f13 = this.mMinValue;
        if (f11 < f13) {
            this.mValue = f13;
            return true;
        }
        float f14 = this.mMaxValue;
        if (f11 <= f14) {
            return isAtEquilibrium(f11, f12);
        }
        this.mValue = f14;
        return true;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f11) {
        super.setMaxValue(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f11) {
        super.setMinValue(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f11) {
        super.setStartVelocity(f11);
        return this;
    }

    public <K> FlingAnimation(K k11, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k11, floatPropertyCompat);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }
}
