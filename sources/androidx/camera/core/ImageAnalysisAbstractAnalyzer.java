package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    private static final String TAG = "ImageAnalysisAnalyzer";
    private volatile boolean mOnePixelShiftEnabled;
    private volatile boolean mOutputImageRotationEnabled;

    @IntRange(from = 0, to = 359)
    private volatile int mPrevBufferRotationDegrees;

    @Nullable
    @GuardedBy("mAnalyzerLock")
    private SafeCloseImageReaderProxy mProcessedImageReaderProxy;

    @Nullable
    @GuardedBy("mAnalyzerLock")
    private ImageWriter mProcessedImageWriter;

    @Nullable
    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mRGBConvertedBuffer;

    @IntRange(from = 0, to = 359)
    private volatile int mRelativeRotation;

    @GuardedBy("mAnalyzerLock")
    private ImageAnalysis.Analyzer mSubscribedAnalyzer;

    @Nullable
    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mURotatedBuffer;

    @GuardedBy("mAnalyzerLock")
    private Executor mUserExecutor;

    @Nullable
    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mVRotatedBuffer;

    @Nullable
    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mYRotatedBuffer;
    private volatile int mOutputImageFormat = 1;

    @GuardedBy("mAnalyzerLock")
    private Rect mOriginalViewPortCropRect = new Rect();

    @GuardedBy("mAnalyzerLock")
    private Rect mUpdatedViewPortCropRect = new Rect();

    @GuardedBy("mAnalyzerLock")
    private Matrix mOriginalSensorToBufferTransformMatrix = new Matrix();

    @GuardedBy("mAnalyzerLock")
    private Matrix mUpdatedSensorToBufferTransformMatrix = new Matrix();
    private final Object mAnalyzerLock = new Object();
    protected boolean mIsAttached = true;

    public static /* synthetic */ void a(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.Completer completer) {
        if (!imageAnalysisAbstractAnalyzer.mIsAttached) {
            completer.setException(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy2, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), imageAnalysisAbstractAnalyzer.mOutputImageRotationEnabled ? 0 : imageAnalysisAbstractAnalyzer.mRelativeRotation, matrix));
        if (!rect.isEmpty()) {
            settableImageProxy.setCropRect(rect);
        }
        analyzer.analyze(settableImageProxy);
        completer.set(null);
    }

    public static /* synthetic */ Object b(final ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, Executor executor, final ImageProxy imageProxy, final Matrix matrix, final ImageProxy imageProxy2, final Rect rect, final ImageAnalysis.Analyzer analyzer, final CallbackToFutureAdapter.Completer completer) {
        imageAnalysisAbstractAnalyzer.getClass();
        executor.execute(new Runnable() { // from class: androidx.camera.core.o
            @Override // java.lang.Runnable
            public final void run() {
                ImageAnalysisAbstractAnalyzer.a(ImageAnalysisAbstractAnalyzer.this, imageProxy, matrix, imageProxy2, rect, analyzer, completer);
            }
        });
        return "analyzeImage";
    }

    @GuardedBy("mAnalyzerLock")
    private void createHelperBuffer(@NonNull ImageProxy imageProxy) {
        if (this.mOutputImageFormat != 1) {
            if (this.mOutputImageFormat == 2 && this.mRGBConvertedBuffer == null) {
                this.mRGBConvertedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.mYRotatedBuffer == null) {
            this.mYRotatedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
        }
        this.mYRotatedBuffer.position(0);
        if (this.mURotatedBuffer == null) {
            this.mURotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
        }
        this.mURotatedBuffer.position(0);
        if (this.mVRotatedBuffer == null) {
            this.mVRotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
        }
        this.mVRotatedBuffer.position(0);
    }

    @NonNull
    private static SafeCloseImageReaderProxy createImageReaderProxy(int i11, int i12, int i13, int i14, int i15) {
        boolean z11 = i13 == 90 || i13 == 270;
        int i16 = z11 ? i12 : i11;
        if (!z11) {
            i11 = i12;
        }
        return new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(i16, i11, i14, i15));
    }

    @NonNull
    @VisibleForTesting
    public static Matrix getAdditionalTransformMatrixAppliedByProcessor(int i11, int i12, int i13, int i14, @IntRange(from = 0, to = 359) int i15) {
        Matrix matrix = new Matrix();
        if (i15 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i11, i12), TransformUtils.NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i15);
            matrix.postConcat(TransformUtils.getNormalizedToBuffer(new RectF(0.0f, 0.0f, i13, i14)));
        }
        return matrix;
    }

    @NonNull
    public static Rect getUpdatedCropRect(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @GuardedBy("mAnalyzerLock")
    private void recalculateTransformMatrixAndCropRect(int i11, int i12, int i13, int i14) {
        Matrix additionalTransformMatrixAppliedByProcessor = getAdditionalTransformMatrixAppliedByProcessor(i11, i12, i13, i14, this.mRelativeRotation);
        this.mUpdatedViewPortCropRect = getUpdatedCropRect(this.mOriginalViewPortCropRect, additionalTransformMatrixAppliedByProcessor);
        this.mUpdatedSensorToBufferTransformMatrix.setConcat(this.mOriginalSensorToBufferTransformMatrix, additionalTransformMatrixAppliedByProcessor);
    }

    @GuardedBy("mAnalyzerLock")
    private void recreateImageReaderProxy(@NonNull ImageProxy imageProxy, @IntRange(from = 0, to = 359) int i11) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.safeClose();
        this.mProcessedImageReaderProxy = createImageReaderProxy(imageProxy.getWidth(), imageProxy.getHeight(), i11, this.mProcessedImageReaderProxy.getImageFormat(), this.mProcessedImageReaderProxy.getMaxImages());
        if (this.mOutputImageFormat == 1) {
            ImageWriter imageWriter = this.mProcessedImageWriter;
            if (imageWriter != null) {
                ImageWriterCompat.close(imageWriter);
            }
            this.mProcessedImageWriter = ImageWriterCompat.newInstance(this.mProcessedImageReaderProxy.getSurface(), this.mProcessedImageReaderProxy.getMaxImages());
        }
    }

    @Nullable
    public abstract ImageProxy acquireImage(@NonNull ImageReaderProxy imageReaderProxy);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.common.util.concurrent.p1<java.lang.Void> analyzeImage(@androidx.annotation.NonNull final androidx.camera.core.ImageProxy r17) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageAnalysisAbstractAnalyzer.analyzeImage(androidx.camera.core.ImageProxy):com.google.common.util.concurrent.p1");
    }

    public void attach() {
        this.mIsAttached = true;
    }

    public abstract void clearCache();

    public void detach() {
        this.mIsAttached = false;
        clearCache();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(@NonNull ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireImage = acquireImage(imageReaderProxy);
            if (acquireImage != null) {
                onValidImageAvailable(acquireImage);
            }
        } catch (IllegalStateException e11) {
            Logger.e(TAG, "Failed to acquire image.", e11);
        }
    }

    public abstract void onValidImageAvailable(@NonNull ImageProxy imageProxy);

    public void setAnalyzer(@Nullable Executor executor, @Nullable ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            clearCache();
        }
        synchronized (this.mAnalyzerLock) {
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    public void setOnePixelShiftEnabled(boolean z11) {
        this.mOnePixelShiftEnabled = z11;
    }

    public void setOutputImageFormat(int i11) {
        this.mOutputImageFormat = i11;
    }

    public void setOutputImageRotationEnabled(boolean z11) {
        this.mOutputImageRotationEnabled = z11;
    }

    public void setProcessedImageReaderProxy(@NonNull SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        synchronized (this.mAnalyzerLock) {
            this.mProcessedImageReaderProxy = safeCloseImageReaderProxy;
        }
    }

    public void setRelativeRotation(int i11) {
        this.mRelativeRotation = i11;
    }

    public void setSensorToBufferTransformMatrix(@NonNull Matrix matrix) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalSensorToBufferTransformMatrix = matrix;
            this.mUpdatedSensorToBufferTransformMatrix = new Matrix(this.mOriginalSensorToBufferTransformMatrix);
        }
    }

    public void setViewPortCropRect(@NonNull Rect rect) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalViewPortCropRect = rect;
            this.mUpdatedViewPortCropRect = new Rect(this.mOriginalViewPortCropRect);
        }
    }
}
