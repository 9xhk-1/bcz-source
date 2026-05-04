package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.p1;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ForwardingCameraControl implements CameraControlInternal {
    private final CameraControlInternal mCameraControlInternal;

    public ForwardingCameraControl(@NonNull CameraControlInternal cameraControlInternal) {
        this.mCameraControlInternal = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NonNull Config config) {
        this.mCameraControlInternal.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        this.mCameraControlInternal.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> cancelFocusAndMetering() {
        return this.mCameraControlInternal.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCameraControlInternal.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mCameraControlInternal.decrementVideoUsage();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> enableTorch(boolean z11) {
        return this.mCameraControlInternal.enableTorch(z11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public p1<CameraCapturePipeline> getCameraCapturePipelineAsync(int i11, int i12) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i11, i12);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mCameraControlInternal.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public CameraControlInternal getImplementation() {
        return this.mCameraControlInternal.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Config getInteropConfig() {
        return this.mCameraControlInternal.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect getSensorRect() {
        return this.mCameraControlInternal.getSensorRect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public SessionConfig getSessionConfig() {
        return this.mCameraControlInternal.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mCameraControlInternal.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @VisibleForTesting
    public boolean isInVideoUsage() {
        return this.mCameraControlInternal.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mCameraControlInternal.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public p1<Integer> setExposureCompensationIndex(int i11) {
        return this.mCameraControlInternal.setExposureCompensationIndex(i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i11) {
        this.mCameraControlInternal.setFlashMode(i11);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> setLinearZoom(float f11) {
        return this.mCameraControlInternal.setLinearZoom(f11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(@Nullable ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public p1<Void> setZoomRatio(float f11) {
        return this.mCameraControlInternal.setZoomRatio(f11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z11) {
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z11);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public p1<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public p1<List<Void>> submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i11, int i12) {
        return this.mCameraControlInternal.submitStillCaptureRequests(list, i11, i12);
    }
}
