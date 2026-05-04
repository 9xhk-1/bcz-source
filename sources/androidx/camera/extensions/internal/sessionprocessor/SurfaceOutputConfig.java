package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements Camera2OutputConfig {
    public static SurfaceOutputConfig create(int i11, int i12, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Surface surface) {
        return new AutoValue_SurfaceOutputConfig(i11, i12, str, list, surface);
    }

    @NonNull
    public abstract Surface getSurface();

    public static SurfaceOutputConfig create(int i11, @NonNull Surface surface) {
        return create(i11, -1, null, Collections.EMPTY_LIST, surface);
    }
}
