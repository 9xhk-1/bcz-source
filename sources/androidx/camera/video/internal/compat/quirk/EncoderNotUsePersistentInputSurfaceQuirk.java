package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList("SM-N9208", "SM-G920V");

    public static boolean load() {
        return DEVICE_MODELS.contains(Build.MODEL.toUpperCase());
    }
}
