package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.huawei.hms.android.SystemUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements Quirk {
    private static final Set<String> PROBLEMATIC_UNI_SOC_MODELS = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    private static boolean isHuaweiPSmart() {
        return SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isUniSocChipsetDevice() {
        String str;
        Set<String> set = PROBLEMATIC_UNI_SOC_MODELS;
        String str2 = Build.MODEL;
        Locale locale = Locale.US;
        if (set.contains(str2.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MANUFACTURER;
            if ("Spreadtrum".equalsIgnoreCase(str)) {
                return true;
            }
        }
        String str3 = Build.HARDWARE;
        if (str3.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        return "itel".equalsIgnoreCase(Build.BRAND) && str3.toLowerCase(locale).startsWith("sp");
    }

    public static boolean load() {
        return isUniSocChipsetDevice() || isHuaweiPSmart();
    }
}
