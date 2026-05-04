package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class OutputSurfaceConfiguration {
    @NonNull
    public static OutputSurfaceConfiguration create(@NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3, @Nullable OutputSurface outputSurface4) {
        return new AutoValue_OutputSurfaceConfiguration(outputSurface, outputSurface2, outputSurface3, outputSurface4);
    }

    @Nullable
    public abstract OutputSurface getImageAnalysisOutputSurface();

    @NonNull
    public abstract OutputSurface getImageCaptureOutputSurface();

    @Nullable
    public abstract OutputSurface getPostviewOutputSurface();

    @NonNull
    public abstract OutputSurface getPreviewOutputSurface();
}
