package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class AttachedSurfaceInfo {
    @NonNull
    public static AttachedSurfaceInfo create(@NonNull SurfaceConfig surfaceConfig, int i11, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull List<UseCaseConfigFactory.CaptureType> list, @Nullable Config config, @Nullable Range<Integer> range) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i11, size, dynamicRange, list, config, range);
    }

    @NonNull
    public abstract List<UseCaseConfigFactory.CaptureType> getCaptureTypes();

    @NonNull
    public abstract DynamicRange getDynamicRange();

    public abstract int getImageFormat();

    @Nullable
    public abstract Config getImplementationOptions();

    @NonNull
    public abstract Size getSize();

    @NonNull
    public abstract SurfaceConfig getSurfaceConfig();

    @Nullable
    public abstract Range<Integer> getTargetFrameRate();

    @NonNull
    public StreamSpec toStreamSpec(@NonNull Config config) {
        StreamSpec.Builder implementationOptions = StreamSpec.builder(getSize()).setDynamicRange(getDynamicRange()).setImplementationOptions(config);
        if (getTargetFrameRate() != null) {
            implementationOptions.setExpectedFrameRateRange(getTargetFrameRate());
        }
        return implementationOptions.build();
    }
}
