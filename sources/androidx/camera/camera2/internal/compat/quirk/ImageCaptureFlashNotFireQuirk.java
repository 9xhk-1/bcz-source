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
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {
    private static final List<String> BUILD_MODELS = Arrays.asList("itel w6004");
    private static final List<String> BUILD_MODELS_FRONT_CAMERA = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        List<String> list = BUILD_MODELS_FRONT_CAMERA;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) || BUILD_MODELS.contains(str.toLowerCase(locale));
    }
}
