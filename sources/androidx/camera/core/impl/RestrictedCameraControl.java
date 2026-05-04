package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.utils.SessionProcessorUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class RestrictedCameraControl extends ForwardingCameraControl {
    private final CameraControlInternal mCameraControl;

    @Nullable
    private final SessionProcessor mSessionProcessor;

    public RestrictedCameraControl(@NonNull CameraControlInternal cameraControlInternal, @Nullable SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.mCameraControl = cameraControlInternal;
        this.mSessionProcessor = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> cancelFocusAndMetering() {
        return this.mCameraControl.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> enableTorch(boolean z11) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 6) ? Futures.immediateFailedFuture(new IllegalStateException("Torch is not supported")) : this.mCameraControl.enableTorch(z11);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public CameraControlInternal getImplementation() {
        return this.mCameraControl;
    }

    @Nullable
    public SessionProcessor getSessionProcessor() {
        return this.mSessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public p1<Integer> setExposureCompensationIndex(int i11) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 7) ? Futures.immediateFailedFuture(new IllegalStateException("ExposureCompensation is not supported")) : this.mCameraControl.setExposureCompensationIndex(i11);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> setLinearZoom(float f11) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported")) : this.mCameraControl.setLinearZoom(f11);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> setZoomRatio(float f11) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported")) : this.mCameraControl.setZoomRatio(f11);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public p1<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction modifiedFocusMeteringAction = SessionProcessorUtil.getModifiedFocusMeteringAction(this.mSessionProcessor, focusMeteringAction);
        return modifiedFocusMeteringAction == null ? Futures.immediateFailedFuture(new IllegalStateException("FocusMetering is not supported")) : this.mCameraControl.startFocusAndMetering(modifiedFocusMeteringAction);
    }
}
