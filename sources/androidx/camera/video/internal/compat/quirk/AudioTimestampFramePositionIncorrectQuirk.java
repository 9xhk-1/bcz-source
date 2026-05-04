package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.google.android.material.internal.l;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AudioTimestampFramePositionIncorrectQuirk implements Quirk {
    private static final List<String> AFFECTED_OPPO_MODELS = Arrays.asList("cph1920", "cph1923", "cph2015", "cph2083");

    private static boolean isAffectedOppoDevices() {
        return "oppo".equalsIgnoreCase(Build.BRAND) && AFFECTED_OPPO_MODELS.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean isLgK10() {
        return l.f31606a.equalsIgnoreCase(Build.BRAND) && "lg-m250".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isMotoC() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isRealmeC2() {
        return "realme".equalsIgnoreCase(Build.BRAND) && "rmx1941".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isRedmi6A() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isVivo1820() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isVivoY17() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "VIVO Y17".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isAffectedOppoDevices() || isLgK10() || isMotoC() || isRealmeC2() || isRedmi6A() || isVivo1820() || isVivoY17();
    }
}
