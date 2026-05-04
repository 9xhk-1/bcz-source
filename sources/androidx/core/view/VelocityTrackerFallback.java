package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j11;
        int i11 = this.mDataPointsBufferSize;
        if (i11 < 2) {
            return 0.0f;
        }
        int i12 = this.mDataPointsBufferLastUsedIndex;
        int i13 = ((i12 + 20) - (i11 - 1)) % 20;
        long j12 = this.mEventTimes[i12];
        while (true) {
            jArr = this.mEventTimes;
            j11 = jArr[i13];
            if (j12 - j11 <= 100) {
                break;
            }
            this.mDataPointsBufferSize--;
            i13 = (i13 + 1) % 20;
        }
        int i14 = this.mDataPointsBufferSize;
        if (i14 < 2) {
            return 0.0f;
        }
        if (i14 == 2) {
            int i15 = (i13 + 1) % 20;
            if (j11 == jArr[i15]) {
                return 0.0f;
            }
            return this.mMovements[i15] / (r2 - j11);
        }
        float f11 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < this.mDataPointsBufferSize - 1; i17++) {
            int i18 = i17 + i13;
            long[] jArr2 = this.mEventTimes;
            long j13 = jArr2[i18 % 20];
            int i19 = (i18 + 1) % 20;
            if (jArr2[i19] != j13) {
                i16++;
                float kineticEnergyToVelocity = kineticEnergyToVelocity(f11);
                float f12 = this.mMovements[i19] / (this.mEventTimes[i19] - j13);
                f11 += (f12 - kineticEnergyToVelocity) * Math.abs(f12);
                if (i16 == 1) {
                    f11 *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(f11);
    }

    private static float kineticEnergyToVelocity(float f11) {
        return (f11 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
    }

    public void addMovement(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > 40) {
            clear();
        }
        int i11 = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i11;
        int i12 = this.mDataPointsBufferSize;
        if (i12 != 20) {
            this.mDataPointsBufferSize = i12 + 1;
        }
        this.mMovements[i11] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    public void computeCurrentVelocity(int i11) {
        computeCurrentVelocity(i11, Float.MAX_VALUE);
    }

    public float getAxisVelocity(int i11) {
        if (i11 != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    public void computeCurrentVelocity(int i11, float f11) {
        float currentVelocity = getCurrentVelocity() * i11;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f11))) {
            this.mLastComputedVelocity = -Math.abs(f11);
        } else if (this.mLastComputedVelocity > Math.abs(f11)) {
            this.mLastComputedVelocity = Math.abs(f11);
        }
    }
}
