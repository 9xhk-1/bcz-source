package androidx.camera.core.impl.utils;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SurfaceUtil {
    public static final String JNI_LIB_NAME = "surface_util_jni";
    private static final String TAG = "SurfaceUtil";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    static {
        System.loadLibrary(JNI_LIB_NAME);
    }

    private SurfaceUtil() {
    }

    @NonNull
    public static SurfaceInfo getSurfaceInfo(@NonNull Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.format = nativeGetSurfaceInfo[0];
        surfaceInfo.width = nativeGetSurfaceInfo[1];
        surfaceInfo.height = nativeGetSurfaceInfo[2];
        return surfaceInfo;
    }

    private static native int[] nativeGetSurfaceInfo(@Nullable Surface surface);
}
