package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class CaptureResultImageMatcher {
    private static final int INVALID_TIMESTAMP = -1;

    @GuardedBy("mLock")
    ImageReferenceListener mImageReferenceListener;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private final LongSparseArray<List<TotalCaptureResult>> mPendingCaptureResults = new LongSparseArray<>();

    @GuardedBy("mLock")
    Map<TotalCaptureResult, Integer> mCaptureStageIdMap = new HashMap();

    @GuardedBy("mLock")
    private final LongSparseArray<List<ImageReference>> mPendingImages = new LongSparseArray<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ImageReferenceListener {
        void onImageReferenceIncoming(@NonNull ImageReference imageReference, @NonNull TotalCaptureResult totalCaptureResult, int i11);
    }

    private <T> void addToList(LongSparseArray<List<T>> longSparseArray, long j11, T t11) {
        List<T> list = longSparseArray.get(j11);
        if (list == null) {
            list = new ArrayList<>();
            longSparseArray.put(j11, list);
        }
        list.add(t11);
    }

    private long getTimeStampFromCaptureResult(TotalCaptureResult totalCaptureResult) {
        Long l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    private void matchImages() {
        TotalCaptureResult totalCaptureResult;
        ImageReference imageReference;
        synchronized (this.mLock) {
            try {
                int size = this.mPendingCaptureResults.size() - 1;
                while (true) {
                    if (size < 0) {
                        totalCaptureResult = null;
                        imageReference = null;
                        break;
                    }
                    List<TotalCaptureResult> valueAt = this.mPendingCaptureResults.valueAt(size);
                    if (!valueAt.isEmpty()) {
                        totalCaptureResult = valueAt.get(0);
                        long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
                        Preconditions.checkState(timeStampFromCaptureResult == this.mPendingCaptureResults.keyAt(size));
                        List<ImageReference> list = this.mPendingImages.get(timeStampFromCaptureResult);
                        if (list != null && !list.isEmpty()) {
                            imageReference = list.get(0);
                            removeFromList(this.mPendingImages, timeStampFromCaptureResult, imageReference);
                            valueAt.remove(totalCaptureResult);
                            if (valueAt.isEmpty()) {
                                this.mPendingCaptureResults.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                removeStaleData();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (imageReference == null || totalCaptureResult == null) {
            return;
        }
        notifyImage(imageReference, totalCaptureResult);
    }

    private void notifyImage(ImageReference imageReference, TotalCaptureResult totalCaptureResult) {
        ImageReferenceListener imageReferenceListener;
        Integer num;
        synchronized (this.mLock) {
            try {
                imageReferenceListener = this.mImageReferenceListener;
                if (imageReferenceListener != null) {
                    num = this.mCaptureStageIdMap.get(totalCaptureResult);
                } else {
                    imageReference.decrement();
                    imageReferenceListener = null;
                    num = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (imageReferenceListener != null) {
            imageReferenceListener.onImageReferenceIncoming(imageReference, totalCaptureResult, num.intValue());
        }
    }

    private <T> void removeFromList(LongSparseArray<List<T>> longSparseArray, long j11, T t11) {
        List<T> list = longSparseArray.get(j11);
        if (list != null) {
            list.remove(t11);
            if (list.isEmpty()) {
                longSparseArray.remove(j11);
            }
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            try {
                if (this.mPendingImages.size() != 0 && this.mPendingCaptureResults.size() != 0) {
                    long keyAt = this.mPendingImages.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.mPendingCaptureResults.keyAt(0);
                    Preconditions.checkArgument(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                            if (this.mPendingImages.keyAt(size) < keyAt2) {
                                Iterator<ImageReference> it = this.mPendingImages.valueAt(size).iterator();
                                while (it.hasNext()) {
                                    it.next().decrement();
                                }
                                this.mPendingImages.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.mPendingCaptureResults.size() - 1; size2 >= 0; size2--) {
                            if (this.mPendingCaptureResults.keyAt(size2) < keyAt) {
                                this.mPendingCaptureResults.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void captureResultIncoming(@NonNull TotalCaptureResult totalCaptureResult) {
        captureResultIncoming(totalCaptureResult, 0);
    }

    public void clear() {
        synchronized (this.mLock) {
            try {
                this.mPendingCaptureResults.clear();
                for (int i11 = 0; i11 < this.mPendingImages.size(); i11++) {
                    Iterator<ImageReference> it = this.mPendingImages.get(this.mPendingImages.keyAt(i11)).iterator();
                    while (it.hasNext()) {
                        it.next().decrement();
                    }
                }
                this.mPendingImages.clear();
                this.mCaptureStageIdMap.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearImageReferenceListener() {
        synchronized (this.mLock) {
            this.mImageReferenceListener = null;
        }
    }

    public void imageIncoming(@NonNull ImageReference imageReference) {
        synchronized (this.mLock) {
            addToList(this.mPendingImages, imageReference.get().getTimestamp(), imageReference);
        }
        matchImages();
    }

    public void setImageReferenceListener(@NonNull ImageReferenceListener imageReferenceListener) {
        synchronized (this.mLock) {
            this.mImageReferenceListener = imageReferenceListener;
        }
    }

    public void captureResultIncoming(@NonNull TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.mLock) {
            try {
                long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
                if (timeStampFromCaptureResult == -1) {
                    return;
                }
                addToList(this.mPendingCaptureResults, timeStampFromCaptureResult, totalCaptureResult);
                this.mCaptureStageIdMap.put(totalCaptureResult, Integer.valueOf(i11));
                matchImages();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
