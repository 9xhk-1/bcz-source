package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import eo.c;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c
/* loaded from: classes.dex */
public abstract class OutConfig {
    @NonNull
    public static OutConfig of(@NonNull SurfaceEdge surfaceEdge) {
        return of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    @NonNull
    public abstract Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Size getSize();

    public abstract int getTargets();

    @NonNull
    public abstract UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    @NonNull
    public static OutConfig of(int i11, int i12, @NonNull Rect rect, @NonNull Size size, int i13, boolean z11) {
        return of(i11, i12, rect, size, i13, z11, false);
    }

    @NonNull
    public static OutConfig of(int i11, int i12, @NonNull Rect rect, @NonNull Size size, int i13, boolean z11, boolean z12) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i11, i12, rect, size, i13, z11, z12);
    }
}
