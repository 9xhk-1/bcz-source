package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {
    private static final Set<String> KNOWN_AFFECTED_FRONT_CAMERA_DEVICES = new HashSet(Arrays.asList("redmi note 8 pro"));

    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return KNOWN_AFFECTED_FRONT_CAMERA_DEVICES.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
