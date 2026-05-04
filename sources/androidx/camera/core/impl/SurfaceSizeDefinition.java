package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class SurfaceSizeDefinition {
    @NonNull
    public static SurfaceSizeDefinition create(@NonNull Size size, @NonNull Map<Integer, Size> map, @NonNull Size size2, @NonNull Map<Integer, Size> map2, @NonNull Size size3, @NonNull Map<Integer, Size> map3, @NonNull Map<Integer, Size> map4) {
        return new AutoValue_SurfaceSizeDefinition(size, map, size2, map2, size3, map3, map4);
    }

    @NonNull
    public abstract Size getAnalysisSize();

    @NonNull
    public Size getMaximumSize(int i11) {
        return getMaximumSizeMap().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> getMaximumSizeMap();

    @NonNull
    public abstract Size getPreviewSize();

    @NonNull
    public abstract Size getRecordSize();

    @NonNull
    public Size getS1440pSize(int i11) {
        return getS1440pSizeMap().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> getS1440pSizeMap();

    @NonNull
    public Size getS720pSize(int i11) {
        return getS720pSizeMap().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> getS720pSizeMap();

    @Nullable
    public Size getUltraMaximumSize(int i11) {
        return getUltraMaximumSizeMap().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> getUltraMaximumSizeMap();
}
