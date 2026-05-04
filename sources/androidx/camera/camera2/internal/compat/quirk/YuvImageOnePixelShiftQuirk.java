package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import com.google.android.material.internal.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    private static boolean isMotorolaMotoG3() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMA920F() {
        return l.f31607b.equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMG532F() {
        return l.f31607b.equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMJ415F() {
        return l.f31607b.equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMJ700F() {
        return l.f31607b.equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isXiaomiMiA1() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isMotorolaMotoG3() || isSamsungSMG532F() || isSamsungSMJ700F() || isSamsungSMA920F() || isSamsungSMJ415F() || isXiaomiMiA1();
    }
}
