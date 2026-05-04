package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SynchronizedCaptureSession {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Opener {
        @NonNull
        SessionConfigurationCompat createSessionConfigurationCompat(int i11, @NonNull List<OutputConfigurationCompat> list, @NonNull StateCallback stateCallback);

        @NonNull
        Executor getExecutor();

        @NonNull
        com.google.common.util.concurrent.p1<Void> openCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat, @NonNull List<DeferrableSurface> list);

        @NonNull
        com.google.common.util.concurrent.p1<List<Surface>> startWithDeferrableSurface(@NonNull List<DeferrableSurface> list, long j11);

        boolean stop();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OpenerBuilder {
        private final Quirks mCameraQuirks;
        private final CaptureSessionRepository mCaptureSessionRepository;
        private final Handler mCompatHandler;
        private final Quirks mDeviceQuirks;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduledExecutorService;

        public OpenerBuilder(@NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler, @NonNull CaptureSessionRepository captureSessionRepository, @NonNull Quirks quirks, @NonNull Quirks quirks2) {
            this.mExecutor = executor;
            this.mScheduledExecutorService = scheduledExecutorService;
            this.mCompatHandler = handler;
            this.mCaptureSessionRepository = captureSessionRepository;
            this.mCameraQuirks = quirks;
            this.mDeviceQuirks = quirks2;
        }

        @NonNull
        public Opener build() {
            return new SynchronizedCaptureSessionImpl(this.mCameraQuirks, this.mDeviceQuirks, this.mCaptureSessionRepository, this.mExecutor, this.mScheduledExecutorService, this.mCompatHandler);
        }
    }

    void abortCaptures() throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void close();

    void finishClose();

    @NonNull
    CameraDevice getDevice();

    @Nullable
    Surface getInputSurface();

    @NonNull
    com.google.common.util.concurrent.p1<Void> getOpeningBlocker();

    @NonNull
    StateCallback getStateCallback();

    void onCameraDeviceError(int i11);

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void stopRepeating() throws CameraAccessException;

    @NonNull
    CameraCaptureSessionCompat toCameraCaptureSessionCompat();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class StateCallback {
        public void onActive(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        @RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onClosed(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigureFailed(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigured(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onReady(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSessionFinished(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        @RequiresApi(api = 23)
        public void onSurfacePrepared(@NonNull SynchronizedCaptureSession synchronizedCaptureSession, @NonNull Surface surface) {
        }
    }
}
