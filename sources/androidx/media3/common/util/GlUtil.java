package androidx.media3.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class GlUtil {
    private static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final String EXTENSION_COLORSPACE_BT2020_HLG = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    private static final long GL_FENCE_SYNC_FAILED = 0;
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {12445, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {12445, 13632, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    private static void assertValidTextureSize(int i11, int i12) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(com.badlogic.gdx.graphics.f.V0, iArr, 0);
        int i13 = iArr[0];
        Assertions.checkState(i13 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i11 < 0 || i12 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if (i11 > i13 || i12 > i13) {
            throw new GlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i13);
        }
    }

    public static void awaitSyncObject(long j11) throws GlException {
        if (j11 == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j11, 0, -1L);
            checkGlError();
        }
    }

    public static void bindTexture(int i11, int i12, int i13) throws GlException {
        GLES20.glBindTexture(i11, i12);
        checkGlError();
        GLES20.glTexParameteri(i11, com.badlogic.gdx.graphics.f.D2, i13);
        checkGlError();
        GLES20.glTexParameteri(i11, com.badlogic.gdx.graphics.f.E2, i13);
        checkGlError();
        GLES20.glTexParameteri(i11, com.badlogic.gdx.graphics.f.F2, com.badlogic.gdx.graphics.f.f11705z3);
        checkGlError();
        GLES20.glTexParameteri(i11, com.badlogic.gdx.graphics.f.G2, com.badlogic.gdx.graphics.f.f11705z3);
        checkGlError();
    }

    public static void blitFrameBuffer(int i11, GlRect glRect, int i12, GlRect glRect2) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.g.f11734e8, i11);
        checkGlError();
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.g.f11740f8, i12);
        checkGlError();
        GLES30.glBlitFramebuffer(glRect.left, glRect.bottom, glRect.right, glRect.top, glRect2.left, glRect2.bottom, glRect2.right, glRect2.top, 16384, 9729);
        checkGlError();
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, iArr[0]);
        checkGlError();
    }

    private static void checkEglException(String str) throws GlException {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new GlException(str + ", error code: 0x" + Integer.toHexString(eglGetError));
    }

    public static void checkGlError() throws GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z11 = true;
        }
        if (z11) {
            throw new GlException(sb2.toString());
        }
    }

    public static void checkGlException(boolean z11, String str) throws GlException {
        if (!z11) {
            throw new GlException(str);
        }
    }

    public static void clearFocusedBuffers() throws GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws GlException {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i11, boolean z11) throws GlException {
        int[] iArr;
        int[] iArr2;
        if (i11 == 3 || i11 == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        } else {
            if (i11 != 7 && i11 != 6) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i11);
            }
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z11) {
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else if (i11 == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new GlException("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new GlException("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG;
            }
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        checkEglException("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static int createExternalTexture() throws GlException {
        int generateTexture = generateTexture();
        bindTexture(36197, generateTexture, 9729);
        return generateTexture;
    }

    public static int createFboForTexture(int i11) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, i11, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        EGLSurface createPbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
        focusEglSurface(eGLDisplay, eGLContext, createPbufferSurface, 1, 1);
        return createPbufferSurface;
    }

    public static long createGlSyncFence() throws GlException {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long glFenceSync = GLES30.glFenceSync(com.badlogic.gdx.graphics.g.Z9, 0);
        checkGlError();
        GLES20.glFlush();
        checkGlError();
        return glFenceSync;
    }

    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i11, int i12, int[] iArr) throws GlException {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), new int[]{12375, i11, 12374, i12, 12344}, 0);
        checkEglException("Error creating a new EGL Pbuffer surface");
        return eglCreatePbufferSurface;
    }

    public static int createPixelBufferObject(int i11) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, iArr[0]);
        checkGlError();
        GLES20.glBufferData(com.badlogic.gdx.graphics.g.f11774l6, i11, null, com.badlogic.gdx.graphics.g.N5);
        checkGlError();
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, 0);
        checkGlError();
        return iArr[0];
    }

    public static int createRgb10A2Texture(int i11, int i12) throws GlException {
        return createTextureUninitialized(i11, i12, com.badlogic.gdx.graphics.g.f11767k5, com.badlogic.gdx.graphics.g.f11809r5);
    }

    public static int createTexture(Bitmap bitmap) throws GlException {
        int generateTexture = generateTexture();
        setTexture(generateTexture, bitmap);
        return generateTexture;
    }

    private static int createTextureUninitialized(int i11, int i12, int i13, int i14) throws GlException {
        assertValidTextureSize(i11, i12);
        int generateTexture = generateTexture();
        bindTexture(com.badlogic.gdx.graphics.f.f11552a0, generateTexture, 9729);
        GLES20.glTexImage2D(com.badlogic.gdx.graphics.f.f11552a0, 0, i13, i11, i12, 0, 6408, i14, null);
        checkGlError();
        return generateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i11 = 0; i11 < list.size(); i11++) {
            System.arraycopy(list.get(i11), 0, fArr, i11 * 4, 4);
        }
        return fArr;
    }

    public static void deleteBuffer(int i11) throws GlException {
        GLES20.glDeleteBuffers(1, new int[]{i11}, 0);
        checkGlError();
    }

    public static void deleteFbo(int i11) throws GlException {
        GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i11) throws GlException {
        GLES20.glDeleteRenderbuffers(1, new int[]{i11}, 0);
        checkGlError();
    }

    public static void deleteSyncObject(long j11) throws GlException {
        deleteSyncObjectQuietly(j11);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j11) {
        GLES30.glDeleteSync(j11);
    }

    public static void deleteTexture(int i11) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        checkGlError();
    }

    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        checkEglException("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            checkEglException("Error destroying context");
        }
        EGL14.eglReleaseThread();
        checkEglException("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        checkEglException("Error terminating display");
    }

    public static void destroyEglSurface(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        checkEglException("Error destroying surface");
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i11, int i12) throws GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i11, i12);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i11, int i12, int i13) throws GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i11, i12, i13);
    }

    public static void focusFramebufferUsingCurrentContext(int i11, int i12, int i13) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i11) {
            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, i11);
        }
        checkGlError();
        GLES20.glViewport(0, 0, i12, i13);
        checkGlError();
    }

    private static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i11, int i12, int i13) throws GlException {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        checkEglException("Error making context current");
        focusFramebufferUsingCurrentContext(i11, i12, i13);
    }

    public static int generateTexture() throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long getContextMajorVersion() throws GlException {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        checkGlError();
        return r0[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay getDefaultEglDisplay() throws GlException {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        checkGlException(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkGlError();
        return eglGetDisplay;
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlException("eglChooseConfig failed.");
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020HlgExtensionSupported() {
        return isExtensionSupported(EXTENSION_COLORSPACE_BT2020_HLG);
    }

    public static boolean isBt2020PqExtensionSupported() {
        return Util.SDK_INT >= 33 && isExtensionSupported(EXTENSION_COLORSPACE_BT2020_PQ);
    }

    private static boolean isExtensionSupported(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        int i11 = Util.SDK_INT;
        if (i11 < 24) {
            return false;
        }
        if (i11 < 26 && (com.google.android.material.internal.l.f31607b.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return isExtensionSupported(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return isExtensionSupported(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        String glGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                EGLContext createEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(createEglContext, defaultEglDisplay);
                glGetString = GLES20.glGetString(com.badlogic.gdx.graphics.f.f11686w2);
                destroyEglContext(defaultEglDisplay, createEglContext);
            } catch (GlException unused) {
                return false;
            }
        } else {
            glGetString = GLES20.glGetString(com.badlogic.gdx.graphics.f.f11686w2);
        }
        return glGetString != null && glGetString.contains(EXTENSION_YUV_TARGET);
    }

    @RequiresApi(24)
    public static ByteBuffer mapPixelBufferObject(int i11, int i12) throws GlException {
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, i11);
        checkGlError();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(com.badlogic.gdx.graphics.g.f11774l6, 0, i12, 1);
        checkGlError();
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, 0);
        checkGlError();
        return byteBuffer;
    }

    @RequiresApi(24)
    public static void schedulePixelBufferRead(int i11, int i12, int i13, int i14) throws GlException {
        focusFramebufferUsingCurrentContext(i11, i12, i13);
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, i14);
        checkGlError();
        GLES30.glReadBuffer(com.badlogic.gdx.graphics.f.G4);
        GLES30.glReadPixels(0, 0, i12, i13, 6408, com.badlogic.gdx.graphics.f.f11673u1, 0);
        checkGlError();
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, 0);
        checkGlError();
    }

    public static void setTexture(int i11, Bitmap bitmap) throws GlException {
        assertValidTextureSize(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(com.badlogic.gdx.graphics.f.f11552a0, i11, 9729);
        GLUtils.texImage2D(com.badlogic.gdx.graphics.f.f11552a0, 0, bitmap, 0);
        checkGlError();
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    @RequiresApi(24)
    public static void unmapPixelBufferObject(int i11) throws GlException {
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, i11);
        checkGlError();
        GLES30.glUnmapBuffer(com.badlogic.gdx.graphics.g.f11774l6);
        checkGlError();
        GLES20.glBindBuffer(com.badlogic.gdx.graphics.g.f11774l6, 0);
        checkGlError();
    }

    private static FloatBuffer createBuffer(int i11) {
        return ByteBuffer.allocateDirect(i11 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, @IntRange(from = 2, to = 3) int i11, int[] iArr) throws GlException {
        boolean z11 = true;
        Assertions.checkArgument(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i11 != 2 && i11 != 3) {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i11, 12344}, 0);
        if (eglCreateContext != null && !eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            checkGlError();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i11);
    }

    public static int createTexture(int i11, int i12, boolean z11) throws GlException {
        if (z11) {
            return createTextureUninitialized(i11, i12, com.badlogic.gdx.graphics.g.E6, com.badlogic.gdx.graphics.g.B8);
        }
        return createTextureUninitialized(i11, i12, 6408, com.badlogic.gdx.graphics.f.f11673u1);
    }
}
