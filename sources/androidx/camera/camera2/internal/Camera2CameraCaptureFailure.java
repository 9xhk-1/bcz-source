package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureFailure;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraCaptureFailure;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Camera2CameraCaptureFailure extends CameraCaptureFailure {
    private final CaptureFailure mCaptureFailure;

    public Camera2CameraCaptureFailure(@NonNull CameraCaptureFailure.Reason reason, @NonNull CaptureFailure captureFailure) {
        super(reason);
        this.mCaptureFailure = captureFailure;
    }

    @Override // androidx.camera.core.impl.CameraCaptureFailure
    @NonNull
    public Object getCaptureFailure() {
        return this.mCaptureFailure;
    }
}
