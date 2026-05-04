package androidx.camera.core.imagecapture;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.streamsharing.VirtualCameraCaptureResult;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class NoMetadataImageReader implements ImageReaderProxy {

    @Nullable
    private ProcessingRequest mPendingRequest;

    @NonNull
    private final ImageReaderProxy mWrappedImageReader;

    public NoMetadataImageReader(@NonNull ImageReaderProxy imageReaderProxy) {
        this.mWrappedImageReader = imageReaderProxy;
    }

    public static /* synthetic */ void a(NoMetadataImageReader noMetadataImageReader, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        noMetadataImageReader.getClass();
        onImageAvailableListener.onImageAvailable(noMetadataImageReader);
    }

    @Nullable
    private ImageProxy createImageProxyWithEmptyMetadata(@Nullable ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        TagBundle emptyBundle = this.mPendingRequest == null ? TagBundle.emptyBundle() : TagBundle.create(new Pair(this.mPendingRequest.getTagBundleKey(), this.mPendingRequest.getStageIds().get(0)));
        this.mPendingRequest = null;
        return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new VirtualCameraCaptureResult(emptyBundle, imageProxy.getImageInfo().getTimestamp())));
    }

    public void acceptProcessingRequest(@NonNull ProcessingRequest processingRequest) {
        Preconditions.checkState(this.mPendingRequest == null, "Pending request should be null");
        this.mPendingRequest = processingRequest;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        return createImageProxyWithEmptyMetadata(this.mWrappedImageReader.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        return createImageProxyWithEmptyMetadata(this.mWrappedImageReader.acquireNextImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        this.mWrappedImageReader.clearOnImageAvailableListener();
    }

    public void clearProcessingRequest() {
        this.mPendingRequest = null;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        this.mWrappedImageReader.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        return this.mWrappedImageReader.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        return this.mWrappedImageReader.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        return this.mWrappedImageReader.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        return this.mWrappedImageReader.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        return this.mWrappedImageReader.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        this.mWrappedImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.j
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                NoMetadataImageReader.a(NoMetadataImageReader.this, onImageAvailableListener, imageReaderProxy);
            }
        }, executor);
    }
}
