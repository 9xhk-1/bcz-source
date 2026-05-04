package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ApiCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void close(@NonNull CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void onSurfacePrepared(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void onCaptureBufferLost(@NonNull CameraCaptureSession.CaptureCallback captureCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j11) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @NonNull
        public static <T> OutputConfiguration newOutputConfiguration(@NonNull Size size, @NonNull Class<T> cls) {
            return b.a(size, cls);
        }

        public static void onCaptureQueueEmpty(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void onCameraAccessPrioritiesChanged(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
            availabilityCallback.onCameraAccessPrioritiesChanged();
        }
    }

    private ApiCompat() {
    }
}
