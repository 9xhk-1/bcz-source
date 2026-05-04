package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class LowMemoryQuirk implements Quirk {
    private static final Set<String> DEVICE_MODELS = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean load() {
        return DEVICE_MODELS.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
