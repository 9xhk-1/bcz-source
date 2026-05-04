package androidx.camera.core.impl.capability;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.PreviewCapabilities;
import androidx.camera.core.impl.CameraInfoInternal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class PreviewCapabilitiesImpl implements PreviewCapabilities {
    private boolean mIsStabilizationSupported;

    public PreviewCapabilitiesImpl(@NonNull CameraInfoInternal cameraInfoInternal) {
        this.mIsStabilizationSupported = cameraInfoInternal.isPreviewStabilizationSupported();
    }

    @NonNull
    public static PreviewCapabilities from(@NonNull CameraInfo cameraInfo) {
        return new PreviewCapabilitiesImpl((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.core.PreviewCapabilities
    public boolean isStabilizationSupported() {
        return this.mIsStabilizationSupported;
    }
}
