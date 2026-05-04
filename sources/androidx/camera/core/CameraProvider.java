package androidx.camera.core;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraProvider {
    @NonNull
    List<CameraInfo> getAvailableCameraInfos();

    @NonNull
    @ExperimentalCameraInfo
    default CameraInfo getCameraInfo(@NonNull CameraSelector cameraSelector) {
        throw new UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException;
}
