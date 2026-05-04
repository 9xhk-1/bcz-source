package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SessionProcessor {
    void abortCapture(int i11);

    void deInitSession();

    @Nullable
    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    @NonNull
    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    default Map<Integer, List<Size>> getSupportedPostviewSize(@NonNull Size size) {
        return Collections.EMPTY_MAP;
    }

    @NonNull
    SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor);

    void setParameters(@NonNull Config config);

    int startCapture(boolean z11, @NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback);

    int startRepeating(@NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback);

    default int startTrigger(@NonNull Config config, @NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface CaptureCallback {
        default void onCaptureFailed(int i11) {
        }

        default void onCaptureProcessProgressed(int i11) {
        }

        default void onCaptureProcessStarted(int i11) {
        }

        default void onCaptureSequenceAborted(int i11) {
        }

        default void onCaptureSequenceCompleted(int i11) {
        }

        default void onCaptureStarted(int i11, long j11) {
        }

        default void onCaptureCompleted(long j11, int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
        }
    }
}
