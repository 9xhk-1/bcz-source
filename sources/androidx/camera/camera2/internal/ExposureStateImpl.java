package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ExposureState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ExposureStateImpl implements ExposureState {
    private final CameraCharacteristicsCompat mCameraCharacteristics;

    @GuardedBy("mLock")
    private int mExposureCompensation;
    private final Object mLock = new Object();

    public ExposureStateImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mExposureCompensation = i11;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i11;
        synchronized (this.mLock) {
            i11 = this.mExposureCompensation;
        }
        return i11;
    }

    @Override // androidx.camera.core.ExposureState
    @NonNull
    public Range<Integer> getExposureCompensationRange() {
        return (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    @NonNull
    public Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void setExposureCompensationIndex(int i11) {
        synchronized (this.mLock) {
            this.mExposureCompensation = i11;
        }
    }
}
