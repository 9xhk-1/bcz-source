package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d11) {
        if (d11 <= 0.0d) {
            return;
        }
        double d12 = this.mStiffness;
        double d13 = this.mDamping;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d12 / this.mMass) * d11) * 4.0d)) + 1.0d);
        double d14 = d11 / sqrt;
        int i11 = 0;
        while (i11 < sqrt) {
            float f11 = this.mPos;
            double d15 = this.mTargetPos;
            float f12 = this.mV;
            double d16 = d12;
            double d17 = ((-d12) * (f11 - d15)) - (f12 * d13);
            float f13 = this.mMass;
            double d18 = d13;
            double d19 = f12 + (((d17 / f13) * d14) / 2.0d);
            double d21 = ((((-((f11 + ((d14 * d19) / 2.0d)) - d15)) * d16) - (d19 * d18)) / f13) * d14;
            double d22 = f12 + (d21 / 2.0d);
            float f14 = f12 + ((float) d21);
            this.mV = f14;
            float f15 = f11 + ((float) (d22 * d14));
            this.mPos = f15;
            int i12 = this.mBoundaryMode;
            if (i12 > 0) {
                if (f15 < 0.0f && (i12 & 1) == 1) {
                    this.mPos = -f15;
                    this.mV = -f14;
                }
                float f16 = this.mPos;
                if (f16 > 1.0f && (i12 & 2) == 2) {
                    this.mPos = 2.0f - f16;
                    this.mV = -this.mV;
                }
            }
            i11++;
            d12 = d16;
            d13 = d18;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f11) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f11) {
        compute(f11 - this.mLastTime);
        this.mLastTime = f11;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d11 = this.mPos - this.mTargetPos;
        double d12 = this.mStiffness;
        double d13 = this.mV;
        return Math.sqrt((((d13 * d13) * ((double) this.mMass)) + ((d12 * d11) * d11)) / d12) <= ((double) this.mStopThreshold);
    }

    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        this.mTargetPos = f12;
        this.mDamping = f16;
        this.mInitialized = false;
        this.mPos = f11;
        this.mLastVelocity = f13;
        this.mStiffness = f15;
        this.mMass = f14;
        this.mStopThreshold = f17;
        this.mBoundaryMode = i11;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f11) {
        return this.mV;
    }
}
