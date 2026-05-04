package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor;
import androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    CaptureOutputSurfaceForCaptureProcessor mCaptureOutputSurface;

    @NonNull
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;

    @NonNull
    final CaptureResultImageMatcher mCaptureResultImageMatcher = new CaptureResultImageMatcher();
    final Object mLock = new Object();

    @NonNull
    @GuardedBy("mLock")
    HashMap<Integer, Pair<ImageReference, TotalCaptureResult>> mCaptureResults = new HashMap<>();

    @GuardedBy("mLock")
    OnCaptureResultCallback mOnCaptureResultCallback = null;

    @GuardedBy("mLock")
    TotalCaptureResult mSourceCaptureResult = null;

    @GuardedBy("mLock")
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i11);

        void onError(@NonNull Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size, @Nullable OutputSurface outputSurface, boolean z11) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        CaptureOutputSurfaceForCaptureProcessor captureOutputSurfaceForCaptureProcessor = new CaptureOutputSurfaceForCaptureProcessor(surface, size, z11);
        this.mCaptureOutputSurface = captureOutputSurfaceForCaptureProcessor;
        captureProcessorImpl.onOutputSurface(captureOutputSurfaceForCaptureProcessor.getSurface(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = outputSurface != null;
        if (outputSurface != null) {
            Version version = Version.VERSION_1_4;
            if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
                Preconditions.checkArgument(outputSurface.getImageFormat() == 35);
                captureProcessorImpl.onResolutionUpdate(size, outputSurface.getSize());
                captureProcessorImpl.onPostviewOutputSurface(outputSurface.getSurface());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    public static /* synthetic */ void a(StillCaptureProcessor stillCaptureProcessor, List list, OnCaptureResultCallback onCaptureResultCallback, boolean z11, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (stillCaptureProcessor.mLock) {
            try {
                if (stillCaptureProcessor.mIsClosed) {
                    imageReference.decrement();
                    Logger.d(TAG, "Ignore image in closed state");
                    return;
                }
                Logger.d(TAG, "onImageReferenceIncoming  captureStageId=" + i11);
                stillCaptureProcessor.mCaptureResults.put(Integer.valueOf(i11), new Pair<>(imageReference, totalCaptureResult));
                Logger.d(TAG, "mCaptureResult has capture stage Id: " + stillCaptureProcessor.mCaptureResults.keySet());
                if (stillCaptureProcessor.mCaptureResults.keySet().containsAll(list)) {
                    stillCaptureProcessor.process(stillCaptureProcessor.mCaptureResults, onCaptureResultCallback, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z11, HashMap hashMap, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e11) {
                        Logger.e(TAG, "mCaptureProcessorImpl.process exception ", e11);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e11);
                        }
                        Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                        }
                    }
                    if (this.mIsClosed) {
                        Logger.d(TAG, "Ignore process() in closed state.");
                        Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    Logger.d(TAG, "CaptureProcessorImpl.process() begin");
                    Version version = Version.VERSION_1_4;
                    if (ExtensionVersion.isMinimumCompatibleVersion(version) && ClientVersion.isMinimumCompatibleVersion(version) && z11 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j11, list);
                            }

                            public void onCaptureProcessProgressed(int i11) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i11);
                            }
                        }, CameraXExecutors.directExecutor());
                    } else {
                        Version version2 = Version.VERSION_1_3;
                        if (ExtensionVersion.isMinimumCompatibleVersion(version2) && ClientVersion.isMinimumCompatibleVersion(version2)) {
                            this.mCaptureProcessorImpl.process(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j11, list);
                                }

                                public void onCaptureProcessProgressed(int i11) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i11);
                                }
                            }, CameraXExecutors.directExecutor());
                        } else {
                            this.mCaptureProcessorImpl.process(hashMap);
                        }
                    }
                    Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th3;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<ImageReference, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((ImageReference) it.next().first).decrement();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            Logger.d(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.clearImageReferenceListener();
            this.mCaptureResultImageMatcher.clear();
            this.mCaptureOutputSurface.close();
        }
    }

    public void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult, int i11) {
        Long l11;
        this.mCaptureResultImageMatcher.captureResultIncoming(totalCaptureResult, i11);
        if (this.mTimeStampForOutputImage == -1 && (l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l11.longValue();
            this.mTimeStampForOutputImage = longValue;
            this.mCaptureOutputSurface.setOutputImageTimestamp(longValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyImage(@NonNull ImageReference imageReference) {
        this.mCaptureResultImageMatcher.imageIncoming(imageReference);
    }

    public void process(@NonNull Map<Integer, Pair<ImageReference, TotalCaptureResult>> map, @NonNull final OnCaptureResultCallback onCaptureResultCallback, final boolean z11) {
        final HashMap hashMap = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<ImageReference, TotalCaptureResult> pair = map.get(num);
                    hashMap.put(num, new Pair(((ImageReference) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        CameraXExecutors.ioExecutor().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            @Override // java.lang.Runnable
            public final void run() {
                StillCaptureProcessor.this.lambda$process$1(z11, hashMap, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z11, @NonNull final List<Integer> list, @NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        Logger.d(TAG, "Start the capture: enablePostview=" + z11);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.clear();
        this.mCaptureResultImageMatcher.setImageReferenceListener(new CaptureResultImageMatcher.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.g
            @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
            public final void onImageReferenceIncoming(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i11) {
                StillCaptureProcessor.a(StillCaptureProcessor.this, list, onCaptureResultCallback, z11, imageReference, totalCaptureResult, i11);
            }
        });
    }
}
