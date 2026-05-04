package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f11) {
        this.mDone = false;
        float f12 = this.mStage1Duration;
        if (f11 <= f12) {
            float f13 = this.mStage1Velocity;
            return (f13 * f11) + ((((this.mStage2Velocity - f13) * f11) * f11) / (f12 * 2.0f));
        }
        int i11 = this.mNumberOfStages;
        if (i11 == 1) {
            return this.mStage1EndPosition;
        }
        float f14 = f11 - f12;
        float f15 = this.mStage2Duration;
        if (f14 < f15) {
            float f16 = this.mStage1EndPosition;
            float f17 = this.mStage2Velocity;
            return f16 + (f17 * f14) + ((((this.mStage3Velocity - f17) * f14) * f14) / (f15 * 2.0f));
        }
        if (i11 == 2) {
            return this.mStage2EndPosition;
        }
        float f18 = f14 - f15;
        float f19 = this.mStage3Duration;
        if (f18 > f19) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f21 = this.mStage2EndPosition;
        float f22 = this.mStage3Velocity;
        return (f21 + (f22 * f18)) - (((f22 * f18) * f18) / (f19 * 2.0f));
    }

    private void setup(float f11, float f12, float f13, float f14, float f15) {
        this.mDone = false;
        this.mStage3EndPosition = f12;
        if (f11 == 0.0f) {
            f11 = 1.0E-4f;
        }
        float f16 = f11 / f13;
        float f17 = (f16 * f11) / 2.0f;
        if (f11 < 0.0f) {
            float sqrt = (float) Math.sqrt((f12 - ((((-f11) / f13) * f11) / 2.0f)) * f13);
            if (sqrt < f14) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f11;
                this.mStage2Velocity = sqrt;
                this.mStage3Velocity = 0.0f;
                float f18 = (sqrt - f11) / f13;
                this.mStage1Duration = f18;
                this.mStage2Duration = sqrt / f13;
                this.mStage1EndPosition = ((f11 + sqrt) * f18) / 2.0f;
                this.mStage2EndPosition = f12;
                this.mStage3EndPosition = f12;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f11;
            this.mStage2Velocity = f14;
            this.mStage3Velocity = f14;
            float f19 = (f14 - f11) / f13;
            this.mStage1Duration = f19;
            float f21 = f14 / f13;
            this.mStage3Duration = f21;
            float f22 = ((f11 + f14) * f19) / 2.0f;
            float f23 = (f21 * f14) / 2.0f;
            this.mStage2Duration = ((f12 - f22) - f23) / f14;
            this.mStage1EndPosition = f22;
            this.mStage2EndPosition = f12 - f23;
            this.mStage3EndPosition = f12;
            return;
        }
        if (f17 >= f12) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f11;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f12;
            this.mStage1Duration = (2.0f * f12) / f11;
            return;
        }
        float f24 = f12 - f17;
        float f25 = f24 / f11;
        if (f25 + f16 < f15) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f11;
            this.mStage2Velocity = f11;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f24;
            this.mStage2EndPosition = f12;
            this.mStage1Duration = f25;
            this.mStage2Duration = f16;
            return;
        }
        float sqrt2 = (float) Math.sqrt((f13 * f12) + ((f11 * f11) / 2.0f));
        float f26 = (sqrt2 - f11) / f13;
        this.mStage1Duration = f26;
        float f27 = sqrt2 / f13;
        this.mStage2Duration = f27;
        if (sqrt2 < f14) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f11;
            this.mStage2Velocity = sqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f26;
            this.mStage2Duration = f27;
            this.mStage1EndPosition = ((f11 + sqrt2) * f26) / 2.0f;
            this.mStage2EndPosition = f12;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f11;
        this.mStage2Velocity = f14;
        this.mStage3Velocity = f14;
        float f28 = (f14 - f11) / f13;
        this.mStage1Duration = f28;
        float f29 = f14 / f13;
        this.mStage3Duration = f29;
        float f31 = ((f11 + f14) * f28) / 2.0f;
        float f32 = (f29 * f14) / 2.0f;
        this.mStage2Duration = ((f12 - f31) - f32) / f14;
        this.mStage1EndPosition = f31;
        this.mStage2EndPosition = f12 - f32;
        this.mStage3EndPosition = f12;
    }

    public void config(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.mDone = false;
        this.mStartPosition = f11;
        boolean z11 = f11 > f12;
        this.mBackwards = z11;
        if (z11) {
            setup(-f13, f11 - f12, f15, f16, f14);
        } else {
            setup(f13, f12 - f11, f15, f16, f14);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f11) {
        String str2 = str + " ===== " + this.mType + "\n";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(this.mBackwards ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f11);
        sb2.append("  stages ");
        sb2.append(this.mNumberOfStages);
        sb2.append("\n");
        String str3 = sb2.toString() + str + " dur " + this.mStage1Duration + " vel " + this.mStage1Velocity + " pos " + this.mStage1EndPosition + "\n";
        if (this.mNumberOfStages > 1) {
            str3 = str3 + str + " dur " + this.mStage2Duration + " vel " + this.mStage2Velocity + " pos " + this.mStage2EndPosition + "\n";
        }
        if (this.mNumberOfStages > 2) {
            str3 = str3 + str + " dur " + this.mStage3Duration + " vel " + this.mStage3Velocity + " pos " + this.mStage3EndPosition + "\n";
        }
        float f12 = this.mStage1Duration;
        if (f11 <= f12) {
            return str3 + str + "stage 0\n";
        }
        int i11 = this.mNumberOfStages;
        if (i11 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f13 = f11 - f12;
        float f14 = this.mStage2Duration;
        if (f13 < f14) {
            return str3 + str + " stage 1\n";
        }
        if (i11 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f13 - f14 < this.mStage3Duration) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f11) {
        float calcY = calcY(f11);
        this.mLastPosition = calcY;
        this.mLastTime = f11;
        return this.mBackwards ? this.mStartPosition - calcY : this.mStartPosition + calcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f11) {
        float f12 = this.mStage1Duration;
        if (f11 <= f12) {
            float f13 = this.mStage1Velocity;
            return f13 + (((this.mStage2Velocity - f13) * f11) / f12);
        }
        int i11 = this.mNumberOfStages;
        if (i11 == 1) {
            return 0.0f;
        }
        float f14 = f11 - f12;
        float f15 = this.mStage2Duration;
        if (f14 < f15) {
            float f16 = this.mStage2Velocity;
            return f16 + (((this.mStage3Velocity - f16) * f14) / f15);
        }
        if (i11 == 2) {
            return 0.0f;
        }
        float f17 = f14 - f15;
        float f18 = this.mStage3Duration;
        if (f17 >= f18) {
            return 0.0f;
        }
        float f19 = this.mStage3Velocity;
        return f19 - ((f17 * f19) / f18);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.mStage3EndPosition - this.mLastPosition) < 1.0E-5f;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Decelerate implements StopEngine {
        private float mAcceleration;
        private float mDestination;
        private boolean mDone = false;
        private float mDuration;
        private float mInitialPos;
        private float mInitialVelocity;
        private float mLastVelocity;

        public void config(float f11, float f12, float f13) {
            this.mDone = false;
            this.mDestination = f12;
            this.mInitialVelocity = f13;
            this.mInitialPos = f11;
            float f14 = (f12 - f11) / (f13 / 2.0f);
            this.mDuration = f14;
            this.mAcceleration = (-f13) / f14;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public String debug(String str, float f11) {
            return this.mDuration + " " + this.mLastVelocity;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f11) {
            if (f11 > this.mDuration) {
                this.mDone = true;
                return this.mDestination;
            }
            getVelocity(f11);
            return this.mInitialPos + ((this.mInitialVelocity + ((this.mAcceleration * f11) / 2.0f)) * f11);
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f11) {
            if (f11 > this.mDuration) {
                return 0.0f;
            }
            float f12 = this.mInitialVelocity + (this.mAcceleration * f11);
            this.mLastVelocity = f12;
            return f12;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.mDone;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.mLastVelocity;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastTime) : getVelocity(this.mLastTime);
    }
}
