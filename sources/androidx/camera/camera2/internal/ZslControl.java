package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface ZslControl {
    void addZslConfig(@NonNull SessionConfig.Builder builder);

    @Nullable
    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(@NonNull ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z11);

    void setZslDisabledByUserCaseConfig(boolean z11);
}
