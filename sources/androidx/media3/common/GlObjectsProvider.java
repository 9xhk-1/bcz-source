package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i11, int i12, int i13) throws GlUtil.GlException;

    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = 2, to = 3) int i11, int[] iArr) throws GlUtil.GlException;

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i11, boolean z11) throws GlUtil.GlException;

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException;

    void release(EGLDisplay eGLDisplay) throws GlUtil.GlException;
}
