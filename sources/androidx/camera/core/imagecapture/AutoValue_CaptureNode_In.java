package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.processing.Edge;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.In {
    private final Edge<TakePictureManager.CaptureError> errorEdge;
    private final ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final int outputFormat;
    private final int postviewImageFormat;
    private final Size postviewSize;
    private final Edge<ProcessingRequest> requestEdge;
    private final Size size;
    private final boolean virtualCamera;

    public AutoValue_CaptureNode_In(Size size, int i11, int i12, boolean z11, @Nullable ImageReaderProxyProvider imageReaderProxyProvider, @Nullable Size size2, int i13, Edge<ProcessingRequest> edge, Edge<TakePictureManager.CaptureError> edge2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.inputFormat = i11;
        this.outputFormat = i12;
        this.virtualCamera = z11;
        this.imageReaderProxyProvider = imageReaderProxyProvider;
        this.postviewSize = size2;
        this.postviewImageFormat = i13;
        if (edge == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.requestEdge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.errorEdge = edge2;
    }

    public boolean equals(Object obj) {
        ImageReaderProxyProvider imageReaderProxyProvider;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CaptureNode.In) {
            CaptureNode.In in2 = (CaptureNode.In) obj;
            if (this.size.equals(in2.getSize()) && this.inputFormat == in2.getInputFormat() && this.outputFormat == in2.getOutputFormat() && this.virtualCamera == in2.isVirtualCamera() && ((imageReaderProxyProvider = this.imageReaderProxyProvider) != null ? imageReaderProxyProvider.equals(in2.getImageReaderProxyProvider()) : in2.getImageReaderProxyProvider() == null) && ((size = this.postviewSize) != null ? size.equals(in2.getPostviewSize()) : in2.getPostviewSize() == null) && this.postviewImageFormat == in2.getPostviewImageFormat() && this.requestEdge.equals(in2.getRequestEdge()) && this.errorEdge.equals(in2.getErrorEdge())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @NonNull
    public Edge<TakePictureManager.CaptureError> getErrorEdge() {
        return this.errorEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @Nullable
    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return this.imageReaderProxyProvider;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public int getPostviewImageFormat() {
        return this.postviewImageFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @Nullable
    public Size getPostviewSize() {
        return this.postviewSize;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @NonNull
    public Edge<ProcessingRequest> getRequestEdge() {
        return this.requestEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = (((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat) * 1000003) ^ (this.virtualCamera ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        int hashCode2 = (hashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        Size size = this.postviewSize;
        return ((((((hashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.postviewImageFormat) * 1000003) ^ this.requestEdge.hashCode()) * 1000003) ^ this.errorEdge.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public boolean isVirtualCamera() {
        return this.virtualCamera;
    }

    public String toString() {
        return "In{size=" + this.size + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + ", virtualCamera=" + this.virtualCamera + ", imageReaderProxyProvider=" + this.imageReaderProxyProvider + ", postviewSize=" + this.postviewSize + ", postviewImageFormat=" + this.postviewImageFormat + ", requestEdge=" + this.requestEdge + ", errorEdge=" + this.errorEdge + com.alipay.sdk.m.u.i.f11099d;
    }
}
