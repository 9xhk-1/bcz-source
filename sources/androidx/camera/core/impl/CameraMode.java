package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraMode {
    public static final int CONCURRENT_CAMERA = 1;
    public static final int DEFAULT = 0;
    public static final int ULTRA_HIGH_RESOLUTION_CAMERA = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private CameraMode() {
    }

    @NonNull
    public static String toLabelString(int i11) {
        return i11 != 1 ? i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA";
    }
}
