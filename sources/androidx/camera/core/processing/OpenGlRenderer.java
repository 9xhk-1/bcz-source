package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@WorkerThread
/* loaded from: classes.dex */
public class OpenGlRenderer {
    private static final String TAG = "OpenGlRenderer";

    @Nullable
    protected Surface mCurrentSurface;

    @Nullable
    protected EGLConfig mEglConfig;

    @Nullable
    protected Thread mGlThread;
    protected final AtomicBoolean mInitialized = new AtomicBoolean(false);
    protected final Map<Surface, OutputSurface> mOutputSurfaceMap = new HashMap();

    @NonNull
    protected EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;

    @NonNull
    protected EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;

    @NonNull
    protected int[] mSurfaceAttrib = GLUtils.EMPTY_ATTRIBS;

    @NonNull
    protected EGLSurface mTempSurface = EGL14.EGL_NO_SURFACE;

    @NonNull
    protected Map<GLUtils.InputFormat, GLUtils.Program2D> mProgramHandles = Collections.EMPTY_MAP;

    @Nullable
    protected GLUtils.Program2D mCurrentProgram = null;

    @NonNull
    protected GLUtils.InputFormat mCurrentInputformat = GLUtils.InputFormat.UNKNOWN;
    private int mExternalTextureId = -1;

    private void activateExternalTexture(int i11) {
        GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(36197, i11);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
    }

    private void createEglContext(@NonNull DynamicRange dynamicRange, @Nullable GraphicDeviceInfo.Builder builder) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEglDisplay = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            builder.setEglVersion(iArr[0] + "." + iArr[1]);
        }
        int i11 = dynamicRange.is10BitHdr() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEglDisplay, new int[]{12324, i11, 12323, i11, 12322, i11, 12321, dynamicRange.is10BitHdr() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.is10BitHdr() ? 64 : 4, qs.a.f82676h, dynamicRange.is10BitHdr() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, dynamicRange.is10BitHdr() ? 3 : 2, 12344}, 0);
        GLUtils.checkEglErrorOrThrow("eglCreateContext");
        this.mEglConfig = eGLConfig;
        this.mEglContext = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.mEglDisplay, eglCreateContext, 12440, iArr2, 0);
        Log.d(TAG, "EGLContext created, client version " + iArr2[0]);
    }

    private void createTempSurface() {
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLConfig eGLConfig = this.mEglConfig;
        Objects.requireNonNull(eGLConfig);
        this.mTempSurface = GLUtils.createPBufferSurface(eGLDisplay, eGLConfig, 1, 1);
    }

    @NonNull
    private Pair<String, String> getExtensionsBeforeInitialized(@NonNull DynamicRange dynamicRange) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        try {
            createEglContext(dynamicRange, null);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            String glGetString = GLES20.glGetString(com.badlogic.gdx.graphics.f.f11686w2);
            String eglQueryString = EGL14.eglQueryString(this.mEglDisplay, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new Pair<>(glGetString, eglQueryString);
        } catch (IllegalStateException e11) {
            Logger.w(TAG, "Failed to get GL or EGL extensions: " + e11.getMessage(), e11);
            return new Pair<>("", "");
        } finally {
            releaseInternal();
        }
    }

    private void releaseInternal() {
        Iterator<GLUtils.Program2D> it = this.mProgramHandles.values().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        this.mProgramHandles = Collections.EMPTY_MAP;
        this.mCurrentProgram = null;
        if (!Objects.equals(this.mEglDisplay, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (OutputSurface outputSurface : this.mOutputSurfaceMap.values()) {
                if (!Objects.equals(outputSurface.getEglSurface(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.mEglDisplay, outputSurface.getEglSurface())) {
                    GLUtils.checkEglErrorOrLog("eglDestroySurface");
                }
            }
            this.mOutputSurfaceMap.clear();
            if (!Objects.equals(this.mTempSurface, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mTempSurface);
                this.mTempSurface = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.mEglContext, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        }
        this.mEglConfig = null;
        this.mExternalTextureId = -1;
        this.mCurrentInputformat = GLUtils.InputFormat.UNKNOWN;
        this.mCurrentSurface = null;
        this.mGlThread = null;
    }

    @Nullable
    public OutputSurface createOutputSurfaceInternal(@NonNull Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLConfig eGLConfig = this.mEglConfig;
            Objects.requireNonNull(eGLConfig);
            EGLSurface createWindowSurface = GLUtils.createWindowSurface(eGLDisplay, eGLConfig, surface, this.mSurfaceAttrib);
            Size surfaceSize = GLUtils.getSurfaceSize(this.mEglDisplay, createWindowSurface);
            return OutputSurface.of(createWindowSurface, surfaceSize.getWidth(), surfaceSize.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e11) {
            Logger.w(TAG, "Failed to create EGL surface: " + e11.getMessage(), e11);
            return null;
        }
    }

    @NonNull
    public OutputSurface getOutSurfaceOrThrow(@NonNull Surface surface) {
        Preconditions.checkState(this.mOutputSurfaceMap.containsKey(surface), "The surface is not registered.");
        OutputSurface outputSurface = this.mOutputSurfaceMap.get(surface);
        Objects.requireNonNull(outputSurface);
        return outputSurface;
    }

    public int getTextureName() {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return this.mExternalTextureId;
    }

    @NonNull
    public GraphicDeviceInfo init(@NonNull DynamicRange dynamicRange) {
        return init(dynamicRange, Collections.EMPTY_MAP);
    }

    public void makeCurrent(@NonNull EGLSurface eGLSurface) {
        Preconditions.checkNotNull(this.mEglDisplay);
        Preconditions.checkNotNull(this.mEglContext);
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void registerOutputSurface(@NonNull Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mOutputSurfaceMap.containsKey(surface)) {
            return;
        }
        this.mOutputSurfaceMap.put(surface, GLUtils.NO_OUTPUT_SURFACE);
    }

    public void release() {
        if (this.mInitialized.getAndSet(false)) {
            GLUtils.checkGlThreadOrThrow(this.mGlThread);
            releaseInternal();
        }
    }

    public void removeOutputSurfaceInternal(@NonNull Surface surface, boolean z11) {
        if (this.mCurrentSurface == surface) {
            this.mCurrentSurface = null;
            makeCurrent(this.mTempSurface);
        }
        OutputSurface remove = z11 ? this.mOutputSurfaceMap.remove(surface) : this.mOutputSurfaceMap.put(surface, GLUtils.NO_OUTPUT_SURFACE);
        if (remove == null || remove == GLUtils.NO_OUTPUT_SURFACE) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.mEglDisplay, remove.getEglSurface());
        } catch (RuntimeException e11) {
            Logger.w(TAG, "Failed to destroy EGL surface: " + e11.getMessage(), e11);
        }
    }

    public void render(long j11, @NonNull float[] fArr, @NonNull Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        OutputSurface outSurfaceOrThrow = getOutSurfaceOrThrow(surface);
        if (outSurfaceOrThrow == GLUtils.NO_OUTPUT_SURFACE) {
            outSurfaceOrThrow = createOutputSurfaceInternal(surface);
            if (outSurfaceOrThrow == null) {
                return;
            } else {
                this.mOutputSurfaceMap.put(surface, outSurfaceOrThrow);
            }
        }
        if (surface != this.mCurrentSurface) {
            makeCurrent(outSurfaceOrThrow.getEglSurface());
            this.mCurrentSurface = surface;
            GLES20.glViewport(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
            GLES20.glScissor(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
        }
        GLUtils.Program2D program2D = (GLUtils.Program2D) Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j11);
        if (EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }

    public void setInputFormat(@NonNull GLUtils.InputFormat inputFormat) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mCurrentInputformat != inputFormat) {
            this.mCurrentInputformat = inputFormat;
            useAndConfigureProgramWithTexture(this.mExternalTextureId);
        }
    }

    @NonNull
    public Bitmap snapshot(@NonNull Size size, @NonNull float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        snapshot(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public void unregisterOutputSurface(@NonNull Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        removeOutputSurfaceInternal(surface, true);
    }

    public void useAndConfigureProgramWithTexture(int i11) {
        GLUtils.Program2D program2D = this.mProgramHandles.get(this.mCurrentInputformat);
        if (program2D == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.mCurrentInputformat);
        }
        if (this.mCurrentProgram != program2D) {
            this.mCurrentProgram = program2D;
            program2D.use();
            Log.d(TAG, "Using program for input format " + this.mCurrentInputformat + ": " + this.mCurrentProgram);
        }
        activateExternalTexture(i11);
    }

    @NonNull
    public GraphicDeviceInfo init(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        GraphicDeviceInfo.Builder builder = GraphicDeviceInfo.builder();
        try {
            if (dynamicRange.is10BitHdr()) {
                Pair<String, String> extensionsBeforeInitialized = getExtensionsBeforeInitialized(dynamicRange);
                String str = (String) Preconditions.checkNotNull(extensionsBeforeInitialized.first);
                String str2 = (String) Preconditions.checkNotNull(extensionsBeforeInitialized.second);
                if (!str.contains("GL_EXT_YUV_target")) {
                    Logger.w(TAG, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = DynamicRange.SDR;
                }
                this.mSurfaceAttrib = GLUtils.chooseSurfaceAttrib(str2, dynamicRange);
                builder.setGlExtensions(str);
                builder.setEglExtensions(str2);
            }
            createEglContext(dynamicRange, builder);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            builder.setGlVersion(GLUtils.getGlVersionNumber());
            this.mProgramHandles = GLUtils.createPrograms(dynamicRange, map);
            int createTexture = GLUtils.createTexture();
            this.mExternalTextureId = createTexture;
            useAndConfigureProgramWithTexture(createTexture);
            this.mGlThread = Thread.currentThread();
            this.mInitialized.set(true);
            return builder.build();
        } catch (IllegalArgumentException e11) {
            e = e11;
            releaseInternal();
            throw e;
        } catch (IllegalStateException e12) {
            e = e12;
            releaseInternal();
            throw e;
        }
    }

    private void snapshot(@NonNull ByteBuffer byteBuffer, @NonNull Size size, @NonNull float[] fArr) {
        Preconditions.checkArgument(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        Preconditions.checkArgument(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int generateTexture = GLUtils.generateTexture();
        GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.S2);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, generateTexture);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
        GLES20.glTexImage2D(com.badlogic.gdx.graphics.f.f11552a0, 0, com.badlogic.gdx.graphics.f.D1, size.getWidth(), size.getHeight(), 0, com.badlogic.gdx.graphics.f.D1, com.badlogic.gdx.graphics.f.f11673u1, null);
        GLUtils.checkGlErrorOrThrow("glTexImage2D");
        GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.D2, 9729);
        GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.E2, 9729);
        int generateFbo = GLUtils.generateFbo();
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, generateFbo);
        GLUtils.checkGlErrorOrThrow("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, generateTexture, 0);
        GLUtils.checkGlErrorOrThrow("glFramebufferTexture2D");
        GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(36197, this.mExternalTextureId);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
        this.mCurrentSurface = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLUtils.Program2D program2D = (GLUtils.Program2D) Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, com.badlogic.gdx.graphics.f.f11673u1, byteBuffer);
        GLUtils.checkGlErrorOrThrow("glReadPixels");
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
        GLUtils.deleteTexture(generateTexture);
        GLUtils.deleteFbo(generateFbo);
        activateExternalTexture(this.mExternalTextureId);
    }
}
