package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class TakePictureRequest {
    private int mRemainingRetires = new CaptureFailedRetryEnabler().getRetryCount();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface RetryControl {
        void retryRequest(@NonNull TakePictureRequest takePictureRequest);
    }

    public static /* synthetic */ void a(TakePictureRequest takePictureRequest, ImageCaptureException imageCaptureException) {
        boolean z11 = takePictureRequest.getInMemoryCallback() != null;
        boolean z12 = takePictureRequest.getOnDiskCallback() != null;
        if (z11 && !z12) {
            ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
            Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (!z12 || z11) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
            Objects.requireNonNull(onDiskCallback);
            onDiskCallback.onError(imageCaptureException);
        }
    }

    public static /* synthetic */ void b(TakePictureRequest takePictureRequest, ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
        Objects.requireNonNull(onDiskCallback);
        Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    public static /* synthetic */ void c(TakePictureRequest takePictureRequest, ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
        Objects.requireNonNull(inMemoryCallback);
        Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    public static /* synthetic */ void d(TakePictureRequest takePictureRequest, Bitmap bitmap) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    public static /* synthetic */ void e(TakePictureRequest takePictureRequest, int i11) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onCaptureProcessProgressed(i11);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onCaptureProcessProgressed(i11);
        }
    }

    @NonNull
    public static TakePictureRequest of(@NonNull Executor executor, @Nullable ImageCapture.OnImageCapturedCallback onImageCapturedCallback, @Nullable ImageCapture.OnImageSavedCallback onImageSavedCallback, @Nullable ImageCapture.OutputFileOptions outputFileOptions, @NonNull Rect rect, @NonNull Matrix matrix, int i11, int i12, int i13, @NonNull List<CameraCaptureCallback> list) {
        Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        return new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i11, i12, i13, list);
    }

    @MainThread
    public boolean decrementRetryCounter() {
        Threads.checkMainThread();
        int i11 = this.mRemainingRetires;
        if (i11 <= 0) {
            return false;
        }
        this.mRemainingRetires = i11 - 1;
        return true;
    }

    @NonNull
    public abstract Executor getAppExecutor();

    public abstract int getCaptureMode();

    @NonNull
    public abstract Rect getCropRect();

    @Nullable
    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    @IntRange(from = 1, to = 100)
    public abstract int getJpegQuality();

    @Nullable
    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    @Nullable
    public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    @MainThread
    @VisibleForTesting
    public int getRemainingRetries() {
        Threads.checkMainThread();
        return this.mRemainingRetires;
    }

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Matrix getSensorToBufferTransform();

    @NonNull
    public abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    @MainThread
    public void incrementRetryCounter() {
        Threads.checkMainThread();
        this.mRemainingRetires++;
    }

    public void onCaptureProcessProgressed(final int i11) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.a0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.e(TakePictureRequest.this, i11);
            }
        });
    }

    public void onError(@NonNull final ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.b0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.a(TakePictureRequest.this, imageCaptureException);
            }
        });
    }

    public void onPostviewBitmapAvailable(@NonNull final Bitmap bitmap) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.y
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.d(TakePictureRequest.this, bitmap);
            }
        });
    }

    public void onResult(@Nullable final ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.z
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.b(TakePictureRequest.this, outputFileResults);
            }
        });
    }

    public void onResult(@Nullable final ImageProxy imageProxy) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.x
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.c(TakePictureRequest.this, imageProxy);
            }
        });
    }
}
