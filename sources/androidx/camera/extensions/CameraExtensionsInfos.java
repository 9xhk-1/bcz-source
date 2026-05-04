package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class CameraExtensionsInfos {
    private static final CameraExtensionsInfo NORMAL_MODE_CAMERA_EXTENSIONS_INFO = new CameraExtensionsInfo() { // from class: androidx.camera.extensions.CameraExtensionsInfos.1
    };

    private CameraExtensionsInfos() {
    }

    @NonNull
    public static CameraExtensionsInfo from(@NonNull CameraInfo cameraInfo) {
        Preconditions.checkArgument(cameraInfo instanceof RestrictedCameraInfo, "The input camera info must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector.");
        SessionProcessor sessionProcessor = ((RestrictedCameraInfo) cameraInfo).getSessionProcessor();
        return sessionProcessor instanceof CameraExtensionsInfo ? (CameraExtensionsInfo) sessionProcessor : NORMAL_MODE_CAMERA_EXTENSIONS_INFO;
    }
}
