package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ExtensionDisabledQuirk implements Quirk {
    private static boolean isAdvancedExtenderSupported() {
        return ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_2) && ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static boolean isMoto() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean isPixel5() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isRealme() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean load() {
        return isPixel5() || isMoto() || isRealme();
    }

    public boolean shouldDisableExtension() {
        if (isPixel5() && !isAdvancedExtenderSupported()) {
            return true;
        }
        if (isMoto() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        return isRealme() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1);
    }
}
