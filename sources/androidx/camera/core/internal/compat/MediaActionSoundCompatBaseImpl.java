package androidx.camera.core.internal.compat;

import android.hardware.Camera;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class MediaActionSoundCompatBaseImpl {
    private static final int SAMPLE_CAMERA_ID = 0;

    private MediaActionSoundCompatBaseImpl() {
    }

    public static boolean mustPlayShutterSound() {
        if (Camera.getNumberOfCameras() < 1) {
            return false;
        }
        try {
            Camera.getCameraInfo(0, new Camera.CameraInfo());
            return !r0.canDisableShutterSound;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
