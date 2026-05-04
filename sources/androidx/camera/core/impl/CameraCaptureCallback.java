package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class CameraCaptureCallback {
    public void onCaptureCancelled(int i11) {
    }

    public void onCaptureStarted(int i11) {
    }

    public void onCaptureCompleted(int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
    }

    public void onCaptureFailed(int i11, @NonNull CameraCaptureFailure cameraCaptureFailure) {
    }

    public void onCaptureProcessProgressed(int i11, int i12) {
    }
}
