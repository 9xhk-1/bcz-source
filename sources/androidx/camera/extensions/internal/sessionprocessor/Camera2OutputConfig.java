package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface Camera2OutputConfig {
    int getId();

    @Nullable
    String getPhysicalCameraId();

    int getSurfaceGroupId();

    @NonNull
    List<Camera2OutputConfig> getSurfaceSharingOutputConfigs();
}
