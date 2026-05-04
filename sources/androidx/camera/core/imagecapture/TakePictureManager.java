package androidx.camera.core.imagecapture;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class TakePictureManager implements ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.RetryControl {
    private static final String TAG = "TakePictureManager";

    @Nullable
    private RequestWithCallback mCapturingRequest;
    final ImageCaptureControl mImageCaptureControl;
    ImagePipeline mImagePipeline;
    private final List<RequestWithCallback> mIncompleteRequests;

    @VisibleForTesting
    final Deque<TakePictureRequest> mNewRequests = new ArrayDeque();
    boolean mPaused = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class CaptureError {
        public static CaptureError of(int i11, @NonNull ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i11, imageCaptureException);
        }

        @NonNull
        public abstract ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();
    }

    @MainThread
    public TakePictureManager(@NonNull ImageCaptureControl imageCaptureControl) {
        Threads.checkMainThread();
        this.mImageCaptureControl = imageCaptureControl;
        this.mIncompleteRequests = new ArrayList();
    }

    public static /* synthetic */ void a(TakePictureManager takePictureManager) {
        takePictureManager.mCapturingRequest = null;
        takePictureManager.issueNextRequest();
    }

    @MainThread
    private p1<Void> submitCameraRequest(@NonNull final CameraRequest cameraRequest) {
        Threads.checkMainThread();
        this.mImageCaptureControl.lockFlashMode();
        p1<Void> submitStillCaptureRequests = this.mImageCaptureControl.submitStillCaptureRequests(cameraRequest.getCaptureConfigs());
        Futures.addCallback(submitStillCaptureRequests, new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManager.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (cameraRequest.isAborted()) {
                    return;
                }
                int id2 = cameraRequest.getCaptureConfigs().get(0).getId();
                if (th2 instanceof ImageCaptureException) {
                    TakePictureManager.this.mImagePipeline.notifyCaptureError(CaptureError.of(id2, (ImageCaptureException) th2));
                } else {
                    TakePictureManager.this.mImagePipeline.notifyCaptureError(CaptureError.of(id2, new ImageCaptureException(2, "Failed to submit capture request", th2)));
                }
                TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r12) {
                TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }
        }, CameraXExecutors.mainThreadExecutor());
        return submitStillCaptureRequests;
    }

    private void trackCurrentRequests(@NonNull final RequestWithCallback requestWithCallback) {
        Preconditions.checkState(!hasCapturingRequest());
        this.mCapturingRequest = requestWithCallback;
        requestWithCallback.getCaptureFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.u
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.a(TakePictureManager.this);
            }
        }, CameraXExecutors.directExecutor());
        this.mIncompleteRequests.add(requestWithCallback);
        requestWithCallback.getCompleteFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.v
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.this.mIncompleteRequests.remove(requestWithCallback);
            }
        }, CameraXExecutors.directExecutor());
    }

    @MainThread
    public void abortRequests() {
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<TakePictureRequest> it = this.mNewRequests.iterator();
        while (it.hasNext()) {
            it.next().onError(imageCaptureException);
        }
        this.mNewRequests.clear();
        Iterator it2 = new ArrayList(this.mIncompleteRequests).iterator();
        while (it2.hasNext()) {
            ((RequestWithCallback) it2.next()).abortAndSendErrorToApp(imageCaptureException);
        }
    }

    @Nullable
    @VisibleForTesting
    public RequestWithCallback getCapturingRequest() {
        return this.mCapturingRequest;
    }

    @NonNull
    @VisibleForTesting
    public ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    @VisibleForTesting
    public List<RequestWithCallback> getIncompleteRequests() {
        return this.mIncompleteRequests;
    }

    @VisibleForTesting
    public boolean hasCapturingRequest() {
        return this.mCapturingRequest != null;
    }

    @MainThread
    public void issueNextRequest() {
        Threads.checkMainThread();
        Log.d(TAG, "Issue the next TakePictureRequest.");
        if (hasCapturingRequest()) {
            Log.d(TAG, "There is already a request in-flight.");
            return;
        }
        if (this.mPaused) {
            Log.d(TAG, "The class is paused.");
            return;
        }
        if (this.mImagePipeline.getCapacity() == 0) {
            Log.d(TAG, "Too many acquire images. Close image to be able to process next.");
            return;
        }
        TakePictureRequest poll = this.mNewRequests.poll();
        if (poll == null) {
            Log.d(TAG, "No new request.");
            return;
        }
        RequestWithCallback requestWithCallback = new RequestWithCallback(poll, this);
        trackCurrentRequests(requestWithCallback);
        Pair<CameraRequest, ProcessingRequest> createRequests = this.mImagePipeline.createRequests(poll, requestWithCallback, requestWithCallback.getCaptureFuture());
        CameraRequest cameraRequest = createRequests.first;
        Objects.requireNonNull(cameraRequest);
        ProcessingRequest processingRequest = createRequests.second;
        Objects.requireNonNull(processingRequest);
        this.mImagePipeline.submitProcessingRequest(processingRequest);
        requestWithCallback.setCaptureRequestFuture(submitCameraRequest(cameraRequest));
    }

    @MainThread
    public void offerRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        this.mNewRequests.offer(takePictureRequest);
        issueNextRequest();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@NonNull ImageProxy imageProxy) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.w
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.this.issueNextRequest();
            }
        });
    }

    @MainThread
    public void pause() {
        Threads.checkMainThread();
        this.mPaused = true;
        RequestWithCallback requestWithCallback = this.mCapturingRequest;
        if (requestWithCallback != null) {
            requestWithCallback.abortSilentlyAndRetry();
        }
    }

    @MainThread
    public void resume() {
        Threads.checkMainThread();
        this.mPaused = false;
        issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    @MainThread
    public void retryRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        Logger.d(TAG, "Add a new request for retrying.");
        this.mNewRequests.addFirst(takePictureRequest);
        issueNextRequest();
    }

    @MainThread
    public void setImagePipeline(@NonNull ImagePipeline imagePipeline) {
        Threads.checkMainThread();
        this.mImagePipeline = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}
