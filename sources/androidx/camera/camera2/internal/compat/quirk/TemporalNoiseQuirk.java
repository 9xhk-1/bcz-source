package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean isPixel8() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isPixel8() && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
