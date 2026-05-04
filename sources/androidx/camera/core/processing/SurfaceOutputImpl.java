package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SurfaceOutputImpl implements SurfaceOutput {
    private static final String TAG = "SurfaceOutputImpl";

    @NonNull
    private final float[] mAdditionalTransform;

    @NonNull
    private final SurfaceOutput.CameraInputInfo mCameraInputInfo;

    @NonNull
    private final p1<Void> mCloseFuture;
    private CallbackToFutureAdapter.Completer<Void> mCloseFutureCompleter;

    @Nullable
    @GuardedBy("mLock")
    private Consumer<SurfaceOutput.Event> mEventListener;

    @Nullable
    @GuardedBy("mLock")
    private Executor mExecutor;
    private final int mFormat;

    @NonNull
    private final float[] mInvertedTextureTransform;

    @NonNull
    private final float[] mSecondaryAdditionalTransform;

    @Nullable
    private final SurfaceOutput.CameraInputInfo mSecondaryCameraInputInfo;

    @NonNull
    private final float[] mSecondaryInvertedTextureTransform;

    @NonNull
    private Matrix mSensorToBufferTransform;

    @NonNull
    private final Size mSize;

    @NonNull
    private final Surface mSurface;
    private final int mTargets;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mHasPendingCloseRequest = false;

    @GuardedBy("mLock")
    private boolean mIsClosed = false;

    public SurfaceOutputImpl(@NonNull Surface surface, int i11, int i12, @NonNull Size size, @NonNull SurfaceOutput.CameraInputInfo cameraInputInfo, @Nullable SurfaceOutput.CameraInputInfo cameraInputInfo2, @NonNull Matrix matrix) {
        float[] fArr = new float[16];
        this.mAdditionalTransform = fArr;
        float[] fArr2 = new float[16];
        this.mSecondaryAdditionalTransform = fArr2;
        float[] fArr3 = new float[16];
        this.mInvertedTextureTransform = fArr3;
        float[] fArr4 = new float[16];
        this.mSecondaryInvertedTextureTransform = fArr4;
        this.mSurface = surface;
        this.mTargets = i11;
        this.mFormat = i12;
        this.mSize = size;
        this.mCameraInputInfo = cameraInputInfo;
        this.mSecondaryCameraInputInfo = cameraInputInfo2;
        this.mSensorToBufferTransform = matrix;
        calculateAdditionalTransform(fArr, fArr3, cameraInputInfo);
        calculateAdditionalTransform(fArr2, fArr4, cameraInputInfo2);
        this.mCloseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.c0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return SurfaceOutputImpl.a(SurfaceOutputImpl.this, completer);
            }
        });
    }

    public static /* synthetic */ Object a(SurfaceOutputImpl surfaceOutputImpl, CallbackToFutureAdapter.Completer completer) {
        surfaceOutputImpl.mCloseFutureCompleter = completer;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void c(SurfaceOutputImpl surfaceOutputImpl, AtomicReference atomicReference) {
        surfaceOutputImpl.getClass();
        ((Consumer) atomicReference.get()).accept(SurfaceOutput.Event.of(0, surfaceOutputImpl));
    }

    private static void calculateAdditionalTransform(@NonNull float[] fArr, @NonNull float[] fArr2, @Nullable SurfaceOutput.CameraInputInfo cameraInputInfo) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        MatrixExt.preVerticalFlip(fArr, 0.5f);
        MatrixExt.preRotate(fArr, cameraInputInfo.getRotationDegrees(), 0.5f, 0.5f);
        if (cameraInputInfo.getMirroring()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix rectToRect = TransformUtils.getRectToRect(TransformUtils.sizeToRectF(cameraInputInfo.getInputSize()), TransformUtils.sizeToRectF(TransformUtils.rotateSize(cameraInputInfo.getInputSize(), cameraInputInfo.getRotationDegrees())), cameraInputInfo.getRotationDegrees(), cameraInputInfo.getMirroring());
        RectF rectF = new RectF(cameraInputInfo.getInputCropRect());
        rectToRect.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        calculateInvertedTextureTransform(fArr2, cameraInputInfo.getCameraInternal());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void calculateInvertedTextureTransform(@NonNull float[] fArr, @Nullable CameraInternal cameraInternal) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        MatrixExt.preVerticalFlip(fArr, 0.5f);
        if (cameraInternal != null) {
            Preconditions.checkState(cameraInternal.getHasTransform(), "Camera has no transform.");
            MatrixExt.preRotate(fArr, cameraInternal.getCameraInfo().getSensorRotationDegrees(), 0.5f, 0.5f);
            if (cameraInternal.isFrontFacing()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    @AnyThread
    public void close() {
        synchronized (this.mLock) {
            try {
                if (!this.mIsClosed) {
                    this.mIsClosed = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mCloseFutureCompleter.set(null);
    }

    @Nullable
    @VisibleForTesting
    public CameraInternal getCamera() {
        return this.mCameraInputInfo.getCameraInternal();
    }

    @NonNull
    public p1<Void> getCloseFuture() {
        return this.mCloseFuture;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
        return this.mFormat;
    }

    @VisibleForTesting
    public Rect getInputCropRect() {
        return this.mCameraInputInfo.getInputCropRect();
    }

    @VisibleForTesting
    public Size getInputSize() {
        return this.mCameraInputInfo.getInputSize();
    }

    @VisibleForTesting
    public int getRotationDegrees() {
        return this.mCameraInputInfo.getRotationDegrees();
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public Matrix getSensorToBufferTransform() {
        return new Matrix(this.mSensorToBufferTransform);
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public Size getSize() {
        return this.mSize;
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public Surface getSurface(@NonNull Executor executor, @NonNull Consumer<SurfaceOutput.Event> consumer) {
        boolean z11;
        synchronized (this.mLock) {
            this.mExecutor = executor;
            this.mEventListener = consumer;
            z11 = this.mHasPendingCloseRequest;
        }
        if (z11) {
            requestClose();
        }
        return this.mSurface;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
        return this.mTargets;
    }

    @VisibleForTesting
    public boolean isClosed() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mIsClosed;
        }
        return z11;
    }

    @VisibleForTesting
    public boolean isMirroring() {
        return this.mCameraInputInfo.getMirroring();
    }

    public void requestClose() {
        Executor executor;
        Consumer<SurfaceOutput.Event> consumer;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.mLock) {
            try {
                if (this.mExecutor != null && (consumer = this.mEventListener) != null) {
                    if (!this.mIsClosed) {
                        atomicReference.set(consumer);
                        executor = this.mExecutor;
                        this.mHasPendingCloseRequest = false;
                    }
                    executor = null;
                }
                this.mHasPendingCloseRequest = true;
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.core.processing.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceOutputImpl.c(SurfaceOutputImpl.this, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.d(TAG, "Processor executor closed. Close request not posted.", e11);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    @AnyThread
    public void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2) {
        updateTransformMatrix(fArr, fArr2, true);
    }

    @Override // androidx.camera.core.SurfaceOutput
    @AnyThread
    public void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z11) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z11 ? this.mAdditionalTransform : this.mSecondaryAdditionalTransform, 0);
    }
}
