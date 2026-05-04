package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.google.android.material.internal.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ZslDisablerQuirk implements Quirk {
    private static final List<String> AFFECTED_SAMSUNG_MODEL = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");
    private static final List<String> AFFECTED_XIAOMI_MODEL = Arrays.asList("MI 8");

    private static boolean isAffectedModel(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAffectedSamsungDevices() {
        return l.f31607b.equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_SAMSUNG_MODEL);
    }

    private static boolean isAffectedXiaoMiDevices() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_XIAOMI_MODEL);
    }

    public static boolean load() {
        return isAffectedSamsungDevices() || isAffectedXiaoMiDevices();
    }
}
