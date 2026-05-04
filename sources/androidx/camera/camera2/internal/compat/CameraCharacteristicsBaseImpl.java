package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class CameraCharacteristicsBaseImpl implements CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {

    @NonNull
    protected final CameraCharacteristics mCameraCharacteristics;

    public CameraCharacteristicsBaseImpl(@NonNull CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @Nullable
    public <T> T get(@NonNull CameraCharacteristics.Key<T> key) {
        return (T) this.mCameraCharacteristics.get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @NonNull
    public Set<String> getPhysicalCameraIds() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @NonNull
    public CameraCharacteristics unwrap() {
        return this.mCameraCharacteristics;
    }
}
