package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {
    public static final List<String> BUILD_MODELS = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return BUILD_MODELS.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
