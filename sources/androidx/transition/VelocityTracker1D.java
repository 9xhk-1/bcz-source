package androidx.transition;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    public VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f11) {
        return (float) (Math.signum(f11) * Math.sqrt(Math.abs(f11) * 2.0f));
    }

    public void addDataPoint(long j11, float f11) {
        int i11 = (this.mIndex + 1) % 20;
        this.mIndex = i11;
        this.mTimeSamples[i11] = j11;
        this.mDataSamples[i11] = f11;
    }

    public float calculateVelocity() {
        float kineticEnergyToVelocity;
        int i11 = this.mIndex;
        if (i11 == 0 && this.mTimeSamples[i11] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j11 = this.mTimeSamples[i11];
        int i12 = 0;
        long j12 = j11;
        while (true) {
            long j13 = this.mTimeSamples[i11];
            if (j13 == Long.MIN_VALUE) {
                break;
            }
            float f11 = j11 - j13;
            float abs = Math.abs(j13 - j12);
            if (f11 > 100.0f || abs > 40.0f) {
                break;
            }
            if (i11 == 0) {
                i11 = 20;
            }
            i11--;
            i12++;
            if (i12 >= 20) {
                break;
            }
            j12 = j13;
        }
        if (i12 < 2) {
            return 0.0f;
        }
        if (i12 == 2) {
            int i13 = this.mIndex;
            int i14 = i13 == 0 ? 19 : i13 - 1;
            long[] jArr = this.mTimeSamples;
            float f12 = jArr[i13] - jArr[i14];
            if (f12 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            kineticEnergyToVelocity = (fArr[i13] - fArr[i14]) / f12;
        } else {
            int i15 = this.mIndex;
            int i16 = ((i15 - i12) + 21) % 20;
            int i17 = (i15 + 21) % 20;
            long j14 = this.mTimeSamples[i16];
            float f13 = this.mDataSamples[i16];
            int i18 = i16 + 1;
            float f14 = 0.0f;
            for (int i19 = i18 % 20; i19 != i17; i19 = (i19 + 1) % 20) {
                long j15 = this.mTimeSamples[i19];
                float f15 = j15 - j14;
                if (f15 != 0.0f) {
                    float f16 = this.mDataSamples[i19];
                    float f17 = (f16 - f13) / f15;
                    f14 += (f17 - kineticEnergyToVelocity(f14)) * Math.abs(f17);
                    if (i19 == i18) {
                        f14 *= 0.5f;
                    }
                    f13 = f16;
                    j14 = j15;
                }
            }
            kineticEnergyToVelocity = kineticEnergyToVelocity(f14);
        }
        return kineticEnergyToVelocity * 1000.0f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
