package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class OutputSurface {
    @NonNull
    public static OutputSurface create(@NonNull Surface surface, @NonNull Size size, int i11) {
        return new AutoValue_OutputSurface(surface, size, i11);
    }

    public abstract int getImageFormat();

    @NonNull
    public abstract Size getSize();

    @NonNull
    public abstract Surface getSurface();
}
