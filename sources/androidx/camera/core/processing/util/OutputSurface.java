package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import eo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@c
/* loaded from: classes.dex */
public abstract class OutputSurface {
    @NonNull
    public static OutputSurface of(@NonNull EGLSurface eGLSurface, int i11, int i12) {
        return new AutoValue_OutputSurface(eGLSurface, i11, i12);
    }

    @NonNull
    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
