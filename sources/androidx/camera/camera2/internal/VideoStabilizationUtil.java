package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class VideoStabilizationUtil {
    private VideoStabilizationUtil() {
    }

    public static boolean isPreviewStabilizationSupported(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i11 : iArr) {
                if (i11 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
