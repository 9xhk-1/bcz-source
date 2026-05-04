package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraCaptureResults {
    private CameraCaptureResults() {
    }

    @Nullable
    public static CameraCaptureResult retrieveCameraCaptureResult(@NonNull ImageInfo imageInfo) {
        if (imageInfo instanceof CameraCaptureResultImageInfo) {
            return ((CameraCaptureResultImageInfo) imageInfo).getCameraCaptureResult();
        }
        return null;
    }
}
