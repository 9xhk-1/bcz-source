package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final int imageFormat;
    private final Size size;
    private final Surface surface;

    public AutoValue_OutputSurface(Surface surface, Size size, int i11) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.imageFormat = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.surface.equals(outputSurface.getSurface()) && this.size.equals(outputSurface.getSize()) && this.imageFormat == outputSurface.getImageFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    @NonNull
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    @NonNull
    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.surface + ", size=" + this.size + ", imageFormat=" + this.imageFormat + com.alipay.sdk.m.u.i.f11099d;
    }
}
