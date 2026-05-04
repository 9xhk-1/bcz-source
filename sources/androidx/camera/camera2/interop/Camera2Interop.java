package androidx.camera.camera2.interop;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2Interop {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Extender<T> {
        ExtendableBuilder<T> mBaseBuilder;

        public Extender(@NonNull ExtendableBuilder<T> extendableBuilder) {
            this.mBaseBuilder = extendableBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> Extender<T> setCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.createCaptureRequestOption(key), Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Extender<T> setCaptureRequestTemplate(int i11) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.TEMPLATE_TYPE_OPTION, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setDeviceStateCallback(@NonNull CameraDevice.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        @NonNull
        @RequiresApi(28)
        public Extender<T> setPhysicalCameraId(@NonNull String str) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
            return this;
        }

        @NonNull
        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setSessionCaptureCallback(@NonNull CameraCaptureSession.CaptureCallback captureCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        @NonNull
        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setSessionStateCallback(@NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        @NonNull
        @RequiresApi(33)
        public Extender<T> setStreamUseCase(long j11) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION, Long.valueOf(j11));
            return this;
        }
    }

    private Camera2Interop() {
    }
}
