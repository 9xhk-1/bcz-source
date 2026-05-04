package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Camera {
    @NonNull
    CameraControl getCameraControl();

    @NonNull
    CameraInfo getCameraInfo();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CameraConfig getExtendedConfig();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupported(boolean z11, @NonNull UseCase... useCaseArr) {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupportedByFramework(@NonNull UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(false, useCaseArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupported(@NonNull UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }
}
