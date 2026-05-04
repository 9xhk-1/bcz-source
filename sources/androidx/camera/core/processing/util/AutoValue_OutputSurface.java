package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final EGLSurface eglSurface;
    private final int height;
    private final int width;

    public AutoValue_OutputSurface(EGLSurface eGLSurface, int i11, int i12) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.eglSurface = eGLSurface;
        this.width = i11;
        this.height = i12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.eglSurface.equals(outputSurface.getEglSurface()) && this.width == outputSurface.getWidth() && this.height == outputSurface.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    @NonNull
    public EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.eglSurface.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.eglSurface + ", width=" + this.width + ", height=" + this.height + i.f11099d;
    }
}
