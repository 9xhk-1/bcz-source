package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class CaptureNode implements Node<In, ProcessingNode.In> {

    @VisibleForTesting
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";

    @Nullable
    private In mInputEdge;

    @Nullable
    private ProcessingNode.In mOutputEdge;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;

    @Nullable
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    public class AnonymousClass1 extends CameraCaptureCallback {
        public AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        public static /* synthetic */ void b(AnonymousClass1 anonymousClass1, int i11) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i11);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i11, final int i12) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.h
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.AnonymousClass1.b(CaptureNode.AnonymousClass1.this, i12);
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i11) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.i
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.AnonymousClass1.a(CaptureNode.AnonymousClass1.this);
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class In {

        @NonNull
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };

        @Nullable
        private DeferrableSurface mPostviewSurface = null;

        @Nullable
        private DeferrableSurface mSurface;

        @NonNull
        public static In of(Size size, int i11, int i12, boolean z11, @Nullable ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i11, i12, z11, imageReaderProxyProvider, null, 35, new Edge(), new Edge());
        }

        @NonNull
        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        @NonNull
        public abstract Edge<TakePictureManager.CaptureError> getErrorEdge();

        @Nullable
        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract int getPostviewImageFormat();

        @Nullable
        public abstract Size getPostviewSize();

        @Nullable
        public DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        @NonNull
        public abstract Edge<ProcessingRequest> getRequestEdge();

        public abstract Size getSize();

        @NonNull
        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(@NonNull Surface surface, @NonNull Size size, int i11) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i11);
        }

        public void setSurface(@NonNull Surface surface) {
            Preconditions.checkState(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        @NonNull
        public static In of(Size size, int i11, int i12, boolean z11, @Nullable ImageReaderProxyProvider imageReaderProxyProvider, @Nullable Size size2, int i13) {
            return new AutoValue_CaptureNode_In(size, i11, i12, z11, imageReaderProxyProvider, size2, i13, new Edge(), new Edge());
        }
    }

    public static /* synthetic */ void a(CaptureNode captureNode, ProcessingRequest processingRequest) {
        captureNode.onRequestAvailable(processingRequest);
        captureNode.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    public static /* synthetic */ void b(CaptureNode captureNode, ImageReaderProxy imageReaderProxy) {
        captureNode.getClass();
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                captureNode.propagatePostviewImage(acquireLatestImage);
            }
        } catch (IllegalStateException e11) {
            Logger.e(TAG, "Failed to acquire latest image of postview", e11);
        }
    }

    @NonNull
    private static ImageReaderProxy createImageReaderProxy(@Nullable ImageReaderProxyProvider imageReaderProxyProvider, int i11, int i12, int i13) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i11, i12, i13, 4, 0L) : ImageReaderProxys.createIsolatedReader(i11, i12, i13, 4);
    }

    public static /* synthetic */ void d(CaptureNode captureNode, ImageReaderProxy imageReaderProxy) {
        captureNode.getClass();
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                captureNode.onImageProxyAvailable(acquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest = captureNode.mCurrentRequest;
            if (processingRequest != null) {
                captureNode.sendCaptureError(TakePictureManager.CaptureError.of(processingRequest.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e11) {
            ProcessingRequest processingRequest2 = captureNode.mCurrentRequest;
            if (processingRequest2 != null) {
                captureNode.sendCaptureError(TakePictureManager.CaptureError.of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e11)));
            }
        }
    }

    public static /* synthetic */ void e(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    @MainThread
    private void matchAndPropagateImage(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        ProcessingNode.In in2 = this.mOutputEdge;
        Objects.requireNonNull(in2);
        in2.getEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest = this.mCurrentRequest;
        this.mCurrentRequest = null;
        processingRequest.onImageCaptured();
    }

    private void propagatePostviewImage(@NonNull ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.In in2 = this.mOutputEdge;
            Objects.requireNonNull(in2);
            in2.getPostviewEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(@NonNull In in2, @NonNull final SafeCloseImageReaderProxy safeCloseImageReaderProxy, @Nullable final SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        in2.getSurface().close();
        in2.getSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.f
            @Override // java.lang.Runnable
            public final void run() {
                SafeCloseImageReaderProxy.this.safeClose();
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (in2.getPostviewSurface() != null) {
            in2.getPostviewSurface().close();
            in2.getPostviewSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.g
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.e(SafeCloseImageReaderProxy.this);
                }
            }, CameraXExecutors.mainThreadExecutor());
        }
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    @NonNull
    @VisibleForTesting
    public In getInputEdge() {
        In in2 = this.mInputEdge;
        Objects.requireNonNull(in2);
        return in2;
    }

    @NonNull
    @VisibleForTesting
    public SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    @MainThread
    @VisibleForTesting
    public void onImageProxyAvailable(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            Logger.w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
        } else {
            Logger.w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
        }
    }

    @MainThread
    @VisibleForTesting
    public void onRequestAvailable(@NonNull final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        Preconditions.checkState(processingRequest.getStageIds().size() == 1, "only one capture stage is supported.");
        Preconditions.checkState(getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        this.mCurrentRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Threads.checkMainThread();
                if (processingRequest == CaptureNode.this.mCurrentRequest) {
                    Logger.w(CaptureNode.TAG, "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r12) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public void release() {
        Threads.checkMainThread();
        In in2 = this.mInputEdge;
        Objects.requireNonNull(in2);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(in2, safeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    @MainThread
    public void sendCaptureError(@NonNull TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getRequestId()) {
            return;
        }
        this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
    }

    @MainThread
    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.processing.Node
    @NonNull
    public ProcessingNode.In transform(@NonNull In in2) {
        Consumer<ProcessingRequest> consumer;
        NoMetadataImageReader noMetadataImageReader;
        Preconditions.checkState(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = in2;
        Size size = in2.getSize();
        int inputFormat = in2.getInputFormat();
        boolean isVirtualCamera = in2.isVirtualCamera();
        CameraCaptureCallback anonymousClass1 = new AnonymousClass1();
        if (isVirtualCamera || in2.getImageReaderProxyProvider() != null) {
            NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(createImageReaderProxy(in2.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader2;
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.b
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    CaptureNode.a(CaptureNode.this, (ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        } else {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            anonymousClass1 = CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader.getCameraCaptureCallback());
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.a
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    CaptureNode.this.onRequestAvailable((ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = metadataImageReader;
        }
        in2.setCameraCaptureCallback(anonymousClass1);
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        in2.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.c
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                CaptureNode.d(CaptureNode.this, imageReaderProxy);
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (in2.getPostviewSize() != null) {
            ImageReaderProxy createImageReaderProxy = createImageReaderProxy(in2.getImageReaderProxyProvider(), in2.getPostviewSize().getWidth(), in2.getPostviewSize().getHeight(), in2.getPostviewImageFormat());
            createImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.d
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    CaptureNode.b(CaptureNode.this, imageReaderProxy);
                }
            }, CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new SafeCloseImageReaderProxy(createImageReaderProxy);
            in2.setPostviewSurface(createImageReaderProxy.getSurface(), in2.getPostviewSize(), in2.getPostviewImageFormat());
        }
        in2.getRequestEdge().setListener(consumer);
        in2.getErrorEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CaptureNode.this.sendCaptureError((TakePictureManager.CaptureError) obj);
            }
        });
        ProcessingNode.In of2 = ProcessingNode.In.of(in2.getInputFormat(), in2.getOutputFormat());
        this.mOutputEdge = of2;
        return of2;
    }
}
