package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    @NonNull
    List<CaptureConfig> getCaptureConfigs();

    @Nullable
    SessionConfig getSessionConfig();

    boolean isInOpenState();

    void issueCaptureRequests(@NonNull List<CaptureConfig> list);

    @NonNull
    com.google.common.util.concurrent.p1<Void> open(@NonNull SessionConfig sessionConfig, @NonNull CameraDevice cameraDevice, @NonNull SynchronizedCaptureSession.Opener opener);

    @NonNull
    com.google.common.util.concurrent.p1<Void> release(boolean z11);

    void setSessionConfig(@Nullable SessionConfig sessionConfig);

    void setStreamUseCaseMap(@NonNull Map<DeferrableSurface, Long> map);
}
