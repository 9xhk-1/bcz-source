package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.p1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    @NonNull
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.CameraControl
        @NonNull
        public p1<Void> cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public p1<Void> enableTorch(boolean z11) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public Rect getSensorRect() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public p1<Integer> setExposureCompensationIndex(int i11) {
            return Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public p1<Void> setLinearZoom(float f11) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public p1<Void> setZoomRatio(float f11) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public p1<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public p1<List<Void>> submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i11, int i12) {
            return Futures.immediateFuture(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(@NonNull Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i11) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z11) {
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(@NonNull List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(@NonNull Config config);

    void addZslConfig(@NonNull SessionConfig.Builder builder);

    void clearInteropConfig();

    @NonNull
    default p1<CameraCapturePipeline> getCameraCapturePipelineAsync(int i11, int i12) {
        return Futures.immediateFuture(new CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            @NonNull
            public p1<Void> invokePostCapture() {
                return Futures.immediateFuture(null);
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            @NonNull
            public p1<Void> invokePreCapture() {
                return Futures.immediateFuture(null);
            }
        });
    }

    int getFlashMode();

    @NonNull
    Config getInteropConfig();

    @NonNull
    Rect getSensorRect();

    @NonNull
    SessionConfig getSessionConfig();

    @VisibleForTesting
    default boolean isInVideoUsage() {
        return false;
    }

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i11);

    void setZslDisabledByUserCaseConfig(boolean z11);

    @NonNull
    p1<List<Void>> submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i11, int i12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CameraControlException extends Exception {

        @NonNull
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(@NonNull CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        @NonNull
        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(@NonNull CameraCaptureFailure cameraCaptureFailure, @NonNull Throwable th2) {
            super(th2);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    default void decrementVideoUsage() {
    }

    @NonNull
    default CameraControlInternal getImplementation() {
        return this;
    }

    default void incrementVideoUsage() {
    }

    default void setScreenFlash(@Nullable ImageCapture.ScreenFlash screenFlash) {
    }
}
