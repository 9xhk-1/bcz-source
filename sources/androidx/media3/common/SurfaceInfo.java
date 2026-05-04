package androidx.media3.common;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SurfaceInfo {
    public final int height;
    public final boolean isEncoderInputSurface;
    public final int orientationDegrees;
    public final Surface surface;
    public final int width;

    public SurfaceInfo(Surface surface, int i11, int i12) {
        this(surface, i11, i12, 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceInfo)) {
            return false;
        }
        SurfaceInfo surfaceInfo = (SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.isEncoderInputSurface == surfaceInfo.isEncoderInputSurface && this.surface.equals(surfaceInfo.surface);
    }

    public int hashCode() {
        return (((((((this.surface.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.orientationDegrees) * 31) + (this.isEncoderInputSurface ? 1 : 0);
    }

    public SurfaceInfo(Surface surface, int i11, int i12, int i13) {
        this(surface, i11, i12, i13, false);
    }

    public SurfaceInfo(Surface surface, int i11, int i12, int i13, boolean z11) {
        Assertions.checkArgument(i13 == 0 || i13 == 90 || i13 == 180 || i13 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i11;
        this.height = i12;
        this.orientationDegrees = i13;
        this.isEncoderInputSurface = z11;
    }
}
