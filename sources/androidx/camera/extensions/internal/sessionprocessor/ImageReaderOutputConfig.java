package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements Camera2OutputConfig {
    public static ImageReaderOutputConfig create(int i11, int i12, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Size size, int i13, int i14) {
        return new AutoValue_ImageReaderOutputConfig(i11, i12, str, list, size, i13, i14);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();

    @NonNull
    public abstract Size getSize();

    public static ImageReaderOutputConfig create(int i11, @NonNull Size size, int i12, int i13) {
        return new AutoValue_ImageReaderOutputConfig(i11, -1, null, Collections.EMPTY_LIST, size, i12, i13);
    }
}
