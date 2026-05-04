package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DefaultSurfaceProcessor";
    private final Executor mGlExecutor;

    @VisibleForTesting
    final Handler mGlHandler;
    private final OpenGlRenderer mGlRenderer;

    @VisibleForTesting
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;
    private final List<PendingSnapshot> mPendingSnapshots;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory {
        private static Function<DynamicRange, SurfaceProcessorInternal> sSupplier = new Function() { // from class: androidx.camera.core.processing.p
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            }
        };

        private Factory() {
        }

        @NonNull
        public static SurfaceProcessorInternal newInstance(@NonNull DynamicRange dynamicRange) {
            return sSupplier.apply(dynamicRange);
        }

        @VisibleForTesting
        public static void setSupplier(@NonNull Function<DynamicRange, SurfaceProcessorInternal> function) {
            sSupplier = function;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class PendingSnapshot {
        @NonNull
        public static AutoValue_DefaultSurfaceProcessor_PendingSnapshot of(@IntRange(from = 0, to = 100) int i11, @IntRange(from = 0, to = 359) int i12, @NonNull CallbackToFutureAdapter.Completer<Void> completer) {
            return new AutoValue_DefaultSurfaceProcessor_PendingSnapshot(i11, i12, completer);
        }

        @NonNull
        public abstract CallbackToFutureAdapter.Completer<Void> getCompleter();

        @IntRange(from = 0, to = 100)
        public abstract int getJpegQuality();

        @IntRange(from = 0, to = 359)
        public abstract int getRotationDegrees();
    }

    public DefaultSurfaceProcessor(@NonNull DynamicRange dynamicRange) {
        this(dynamicRange, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void b(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceRequest surfaceRequest, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        defaultSurfaceProcessor.getClass();
        surfaceRequest.clearTransformationInfoListener();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        defaultSurfaceProcessor.mInputSurfaceCount--;
        defaultSurfaceProcessor.checkReadyToRelease();
    }

    public static /* synthetic */ void c(DefaultSurfaceProcessor defaultSurfaceProcessor) {
        defaultSurfaceProcessor.mIsReleased = true;
        defaultSurfaceProcessor.checkReadyToRelease();
    }

    @WorkerThread
    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<PendingSnapshot> it2 = this.mPendingSnapshots.iterator();
            while (it2.hasNext()) {
                it2.next().getCompleter().setException(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    public static /* synthetic */ void d(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange, Map map, CallbackToFutureAdapter.Completer completer) {
        defaultSurfaceProcessor.getClass();
        try {
            defaultSurfaceProcessor.mGlRenderer.init(dynamicRange, map);
            completer.set(null);
        } catch (RuntimeException e11) {
            completer.setException(e11);
        }
    }

    public static /* synthetic */ Object e(final DefaultSurfaceProcessor defaultSurfaceProcessor, int i11, int i12, final CallbackToFutureAdapter.Completer completer) {
        defaultSurfaceProcessor.getClass();
        final AutoValue_DefaultSurfaceProcessor_PendingSnapshot of2 = PendingSnapshot.of(i11, i12, completer);
        defaultSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.this.mPendingSnapshots.add(of2);
            }
        }, new Runnable() { // from class: androidx.camera.core.processing.g
            @Override // java.lang.Runnable
            public final void run() {
                CallbackToFutureAdapter.Completer.this.setException(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void executeSafely(@NonNull Runnable runnable) {
        executeSafely(runnable, new Runnable() { // from class: androidx.camera.core.processing.o
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.j();
            }
        });
    }

    public static /* synthetic */ void f(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
        defaultSurfaceProcessor.getClass();
        GLUtils.InputFormat inputFormat = GLUtils.InputFormat.DEFAULT;
        if (surfaceRequest.getDynamicRange().is10BitHdr() && transformationInfo.hasCameraTransform()) {
            inputFormat = GLUtils.InputFormat.YUV;
        }
        defaultSurfaceProcessor.mGlRenderer.setInputFormat(inputFormat);
    }

    private void failAllPendingSnapshots(@NonNull Throwable th2) {
        Iterator<PendingSnapshot> it = this.mPendingSnapshots.iterator();
        while (it.hasNext()) {
            it.next().getCompleter().setException(th2);
        }
        this.mPendingSnapshots.clear();
    }

    public static /* synthetic */ void g(final DefaultSurfaceProcessor defaultSurfaceProcessor, final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(defaultSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.h
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.h(DefaultSurfaceProcessor.this, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        defaultSurfaceProcessor.mGlRenderer.registerOutputSurface(surface);
        defaultSurfaceProcessor.mOutputSurfaces.put(surfaceOutput, surface);
    }

    @NonNull
    private Bitmap getBitmap(@NonNull Size size, @NonNull float[] fArr, int i11) {
        float[] fArr2 = (float[]) fArr.clone();
        MatrixExt.preRotate(fArr2, i11, 0.5f, 0.5f);
        MatrixExt.preVerticalFlip(fArr2, 0.5f);
        return this.mGlRenderer.snapshot(TransformUtils.rotateSize(size, i11), fArr2);
    }

    public static /* synthetic */ void h(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        defaultSurfaceProcessor.getClass();
        surfaceOutput.close();
        Surface remove = defaultSurfaceProcessor.mOutputSurfaces.remove(surfaceOutput);
        if (remove != null) {
            defaultSurfaceProcessor.mGlRenderer.unregisterOutputSurface(remove);
        }
    }

    public static /* synthetic */ Object i(final DefaultSurfaceProcessor defaultSurfaceProcessor, final DynamicRange dynamicRange, final Map map, final CallbackToFutureAdapter.Completer completer) {
        defaultSurfaceProcessor.getClass();
        defaultSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.l
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.d(DefaultSurfaceProcessor.this, dynamicRange, map, completer);
            }
        });
        return "Init GlRenderer";
    }

    private void initGlRenderer(@NonNull final DynamicRange dynamicRange, @NonNull final Map<GLUtils.InputFormat, ShaderProvider> map) {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.k
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return DefaultSurfaceProcessor.i(DefaultSurfaceProcessor.this, dynamicRange, map, completer);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            e = e11;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    public static /* synthetic */ void l(final DefaultSurfaceProcessor defaultSurfaceProcessor, final SurfaceRequest surfaceRequest) {
        defaultSurfaceProcessor.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(defaultSurfaceProcessor.mGlRenderer.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.setTransformationInfoListener(defaultSurfaceProcessor.mGlExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.core.processing.i
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                DefaultSurfaceProcessor.f(DefaultSurfaceProcessor.this, surfaceRequest, transformationInfo);
            }
        });
        surfaceRequest.provideSurface(surface, defaultSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.j
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.b(DefaultSurfaceProcessor.this, surfaceRequest, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(defaultSurfaceProcessor, defaultSurfaceProcessor.mGlHandler);
    }

    public static /* synthetic */ void m(DefaultSurfaceProcessor defaultSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        if (defaultSurfaceProcessor.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @WorkerThread
    private void takeSnapshotAndDrawJpeg(@Nullable Triple<Surface, Size, float[]> triple) {
        if (this.mPendingSnapshots.isEmpty()) {
            return;
        }
        if (triple == null) {
            failAllPendingSnapshots(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<PendingSnapshot> it = this.mPendingSnapshots.iterator();
                int i11 = -1;
                int i12 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    PendingSnapshot next = it.next();
                    if (i11 != next.getRotationDegrees() || bitmap == null) {
                        i11 = next.getRotationDegrees();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = getBitmap(triple.getSecond(), triple.getThird(), i11);
                        i12 = -1;
                    }
                    if (i12 != next.getJpegQuality()) {
                        byteArrayOutputStream.reset();
                        i12 = next.getJpegQuality();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface first = triple.getFirst();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.writeJpegBytesToSurface(first, bArr);
                    next.getCompleter().set(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e11) {
            failAllPendingSnapshots(e11);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        if (this.mIsReleaseRequested.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.mTextureMatrix);
        Triple<Surface, Size, float[]> triple = null;
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            key.updateTransformMatrix(this.mSurfaceOutputMatrix, this.mTextureMatrix);
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), this.mSurfaceOutputMatrix, value);
                } catch (RuntimeException e11) {
                    Logger.e(TAG, "Failed to render with OpenGL.", e11);
                }
            } else {
                Preconditions.checkState(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                Preconditions.checkState(triple == null, "Only one JPEG output is supported.");
                triple = new Triple<>(value, key.getSize(), (float[]) this.mSurfaceOutputMatrix.clone());
            }
        }
        try {
            takeSnapshotAndDrawJpeg(triple);
        } catch (RuntimeException e12) {
            failAllPendingSnapshots(e12);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.b
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.l(DefaultSurfaceProcessor.this, surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        executeSafely(runnable, new c(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.m
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.g(DefaultSurfaceProcessor.this, surfaceOutput);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        executeSafely(runnable, new n(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.e
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.c(DefaultSurfaceProcessor.this);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public p1<Void> snapshot(@IntRange(from = 0, to = 100) final int i11, @IntRange(from = 0, to = 359) final int i12) {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.f
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DefaultSurfaceProcessor.e(DefaultSurfaceProcessor.this, i11, i12, completer);
            }
        }));
    }

    public DefaultSurfaceProcessor(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map) {
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mTextureMatrix = new float[16];
        this.mSurfaceOutputMatrix = new float[16];
        this.mOutputSurfaces = new LinkedHashMap();
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mPendingSnapshots = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new OpenGlRenderer();
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    private void executeSafely(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSurfaceProcessor.m(DefaultSurfaceProcessor.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e11) {
            Logger.w(TAG, "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    public static /* synthetic */ void j() {
    }
}
