package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ZslUtil {
    private ZslUtil() {
    }

    public static boolean isCapabilitySupported(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
