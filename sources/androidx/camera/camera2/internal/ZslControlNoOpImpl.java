package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ZslControlNoOpImpl implements ZslControl {
    @Override // androidx.camera.camera2.internal.ZslControl
    @Nullable
    public ImageProxy dequeueImageFromBuffer() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean enqueueImageToImageWriter(@NonNull ImageProxy imageProxy) {
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByFlashMode() {
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByUserCaseConfig() {
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByFlashMode(boolean z11) {
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean z11) {
    }
}
