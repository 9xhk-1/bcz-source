package androidx.camera.lifecycle;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.UseCase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface LifecycleCameraProvider extends CameraProvider {
    boolean isBound(@NonNull UseCase useCase);

    void unbind(@NonNull UseCase... useCaseArr);

    void unbindAll();
}
