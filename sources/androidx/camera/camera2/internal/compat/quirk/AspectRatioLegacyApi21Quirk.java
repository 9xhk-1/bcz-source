package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AspectRatioLegacyApi21Quirk implements Quirk {
    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
