package androidx.camera.core.streamsharing;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.streamsharing.StreamSharing;
import com.google.common.util.concurrent.p1;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class VirtualCamera implements CameraInternal {
    private static final String UNSUPPORTED_MESSAGE = "Operation not supported by VirtualCamera.";

    @NonNull
    private final CameraInternal mParentCamera;
    private final UseCase.StateChangeCallback mStateChangeCallback;

    @NonNull
    private final VirtualCameraControl mVirtualCameraControl;

    @NonNull
    private final VirtualCameraInfo mVirtualCameraInfo;

    public VirtualCamera(@NonNull CameraInternal cameraInternal, @NonNull UseCase.StateChangeCallback stateChangeCallback, @NonNull StreamSharing.Control control) {
        this.mParentCamera = cameraInternal;
        this.mStateChangeCallback = stateChangeCallback;
        this.mVirtualCameraControl = new VirtualCameraControl(cameraInternal.getCameraControlInternal(), control);
        this.mVirtualCameraInfo = new VirtualCameraInfo(cameraInternal.getCameraInfoInternal());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(@NonNull Collection<UseCase> collection) {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(@NonNull Collection<UseCase> collection) {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public CameraControlInternal getCameraControlInternal() {
        return this.mVirtualCameraControl;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public CameraInfoInternal getCameraInfoInternal() {
        return this.mVirtualCameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public Observable<CameraInternal.State> getCameraState() {
        return this.mParentCamera.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return false;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseActive(@NonNull UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseInactive(@NonNull UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseReset(@NonNull UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseUpdated(@NonNull UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public p1<Void> release() {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    public void setRotationDegrees(int i11) {
        this.mVirtualCameraInfo.setVirtualCameraRotationDegrees(i11);
    }
}
