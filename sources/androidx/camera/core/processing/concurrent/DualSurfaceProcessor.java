package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.n;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DualSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DualSurfaceProcessor";
    private final Executor mGlExecutor;

    @VisibleForTesting
    final Handler mGlHandler;
    private final DualOpenGlRenderer mGlRenderer;

    @VisibleForTesting
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;

    @Nullable
    private SurfaceTexture mPrimarySurfaceTexture;

    @Nullable
    private SurfaceTexture mSecondarySurfaceTexture;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory {
        private static q<DynamicRange, LayoutSettings, LayoutSettings, SurfaceProcessorInternal> sSupplier = new q() { // from class: androidx.camera.core.processing.concurrent.j
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new DualSurfaceProcessor((DynamicRange) obj, (LayoutSettings) obj2, (LayoutSettings) obj3);
            }
        };

        private Factory() {
        }

        @NonNull
        public static SurfaceProcessorInternal newInstance(@NonNull DynamicRange dynamicRange, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
            return sSupplier.invoke(dynamicRange, layoutSettings, layoutSettings2);
        }

        @VisibleForTesting
        public static void setSupplier(@NonNull q<DynamicRange, LayoutSettings, LayoutSettings, SurfaceProcessorInternal> qVar) {
            sSupplier = qVar;
        }
    }

    public DualSurfaceProcessor(@NonNull DynamicRange dynamicRange, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
        this(dynamicRange, Collections.EMPTY_MAP, layoutSettings, layoutSettings2);
    }

    public static /* synthetic */ void a(DualSurfaceProcessor dualSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        if (dualSurfaceProcessor.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void c(DualSurfaceProcessor dualSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        dualSurfaceProcessor.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        dualSurfaceProcessor.mInputSurfaceCount--;
        dualSurfaceProcessor.checkReadyToRelease();
    }

    @WorkerThread
    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    public static /* synthetic */ void d(DualSurfaceProcessor dualSurfaceProcessor) {
        dualSurfaceProcessor.mIsReleased = true;
        dualSurfaceProcessor.checkReadyToRelease();
    }

    public static /* synthetic */ void e(DualSurfaceProcessor dualSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        dualSurfaceProcessor.getClass();
        surfaceOutput.close();
        Surface remove = dualSurfaceProcessor.mOutputSurfaces.remove(surfaceOutput);
        if (remove != null) {
            dualSurfaceProcessor.mGlRenderer.unregisterOutputSurface(remove);
        }
    }

    private void executeSafely(@NonNull Runnable runnable) {
        executeSafely(runnable, new Runnable() { // from class: androidx.camera.core.processing.concurrent.h
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.b();
            }
        });
    }

    public static /* synthetic */ void f(final DualSurfaceProcessor dualSurfaceProcessor, final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.f
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DualSurfaceProcessor.e(DualSurfaceProcessor.this, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        dualSurfaceProcessor.mGlRenderer.registerOutputSurface(surface);
        dualSurfaceProcessor.mOutputSurfaces.put(surfaceOutput, surface);
    }

    public static /* synthetic */ void g(final DualSurfaceProcessor dualSurfaceProcessor, SurfaceRequest surfaceRequest) {
        dualSurfaceProcessor.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(dualSurfaceProcessor.mGlRenderer.getTextureName(surfaceRequest.isPrimary()));
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.i
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DualSurfaceProcessor.c(DualSurfaceProcessor.this, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        if (surfaceRequest.isPrimary()) {
            dualSurfaceProcessor.mPrimarySurfaceTexture = surfaceTexture;
        } else {
            dualSurfaceProcessor.mSecondarySurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(dualSurfaceProcessor, dualSurfaceProcessor.mGlHandler);
        }
    }

    public static /* synthetic */ void h(DualSurfaceProcessor dualSurfaceProcessor, DynamicRange dynamicRange, Map map, CallbackToFutureAdapter.Completer completer) {
        dualSurfaceProcessor.getClass();
        try {
            dualSurfaceProcessor.mGlRenderer.init(dynamicRange, map);
            completer.set(null);
        } catch (RuntimeException e11) {
            completer.setException(e11);
        }
    }

    public static /* synthetic */ Object i(final DualSurfaceProcessor dualSurfaceProcessor, final DynamicRange dynamicRange, final Map map, final CallbackToFutureAdapter.Completer completer) {
        dualSurfaceProcessor.getClass();
        dualSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.h(DualSurfaceProcessor.this, dynamicRange, map, completer);
            }
        });
        return "Init GlRenderer";
    }

    private void initGlRenderer(@NonNull final DynamicRange dynamicRange, @NonNull final Map<GLUtils.InputFormat, ShaderProvider> map) {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.concurrent.c
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return DualSurfaceProcessor.i(DualSurfaceProcessor.this, dynamicRange, map, completer);
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

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), value, key, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (RuntimeException e11) {
                    Logger.e(TAG, "Failed to render with OpenGL.", e11);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.concurrent.b
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.g(DualSurfaceProcessor.this, surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        executeSafely(runnable, new androidx.camera.core.processing.c(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.f(DualSurfaceProcessor.this, surfaceOutput);
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
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.d(DualSurfaceProcessor.this);
            }
        });
    }

    public DualSurfaceProcessor(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mOutputSurfaces = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new DualOpenGlRenderer(layoutSettings, layoutSettings2);
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    private void executeSafely(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.concurrent.g
                @Override // java.lang.Runnable
                public final void run() {
                    DualSurfaceProcessor.a(DualSurfaceProcessor.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e11) {
            Logger.w(TAG, "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    public static /* synthetic */ void b() {
    }
}
