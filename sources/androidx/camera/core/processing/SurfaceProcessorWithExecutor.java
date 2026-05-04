package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.p1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SurfaceProcessorWithExecutor implements SurfaceProcessorInternal {
    private static final String TAG = "SurfaceProcessor";

    @NonNull
    private final Consumer<Throwable> mErrorListener;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final SurfaceProcessor mSurfaceProcessor;

    public SurfaceProcessorWithExecutor(@NonNull CameraEffect cameraEffect) {
        SurfaceProcessor surfaceProcessor = cameraEffect.getSurfaceProcessor();
        Objects.requireNonNull(surfaceProcessor);
        this.mSurfaceProcessor = surfaceProcessor;
        this.mExecutor = cameraEffect.getExecutor();
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    public static /* synthetic */ void a(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceOutput surfaceOutput) {
        surfaceProcessorWithExecutor.getClass();
        try {
            surfaceProcessorWithExecutor.mSurfaceProcessor.onOutputSurface(surfaceOutput);
        } catch (ProcessingException e11) {
            Logger.e(TAG, "Failed to setup SurfaceProcessor output.", e11);
            surfaceProcessorWithExecutor.mErrorListener.accept(e11);
        }
    }

    public static /* synthetic */ void b(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceRequest surfaceRequest) {
        surfaceProcessorWithExecutor.getClass();
        try {
            surfaceProcessorWithExecutor.mSurfaceProcessor.onInputSurface(surfaceRequest);
        } catch (ProcessingException e11) {
            Logger.e(TAG, "Failed to setup SurfaceProcessor input.", e11);
            surfaceProcessorWithExecutor.mErrorListener.accept(e11);
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @NonNull
    @VisibleForTesting
    public SurfaceProcessor getProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorWithExecutor.b(SurfaceProcessorWithExecutor.this, surfaceRequest);
            }
        });
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.i0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorWithExecutor.a(SurfaceProcessorWithExecutor.this, surfaceOutput);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public p1<Void> snapshot(@IntRange(from = 0, to = 100) int i11, @IntRange(from = 0, to = 359) int i12) {
        return Futures.immediateFailedFuture(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }
}
