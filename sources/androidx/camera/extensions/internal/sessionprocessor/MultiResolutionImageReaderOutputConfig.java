package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    public static MultiResolutionImageReaderOutputConfig create(int i11, int i12, @Nullable String str, @NonNull List<Camera2OutputConfig> list, int i13, int i14) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i11, i12, str, list, i13, i14);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();
}
