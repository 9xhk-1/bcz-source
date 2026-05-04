package androidx.camera.view;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface ProcessCameraProviderWrapper {
    @NonNull
    @MainThread
    Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup);

    @NonNull
    CameraInfo getCameraInfo(CameraSelector cameraSelector);

    boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException;

    @NonNull
    @VisibleForTesting
    p1<Void> shutdownAsync();

    void unbind(@NonNull UseCase... useCaseArr);

    void unbindAll();
}
