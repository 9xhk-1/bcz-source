package androidx.camera.core;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SurfaceProcessor {
    void onInputSurface(@NonNull SurfaceRequest surfaceRequest) throws ProcessingException;

    void onOutputSurface(@NonNull SurfaceOutput surfaceOutput) throws ProcessingException;
}
