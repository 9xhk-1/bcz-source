package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements Quirk {
    public static final List<String> BUILD_MODELS = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean load() {
        return BUILD_MODELS.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
