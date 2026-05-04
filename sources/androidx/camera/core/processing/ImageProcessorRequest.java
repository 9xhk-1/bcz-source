package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImageProcessorRequest implements ImageProcessor.Request {

    @NonNull
    private final ImageProxy mImageProxy;
    private final int mOutputFormat;

    public ImageProcessorRequest(@NonNull ImageProxy imageProxy, int i11) {
        this.mImageProxy = imageProxy;
        this.mOutputFormat = i11;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    @NonNull
    public ImageProxy getInputImage() {
        return this.mImageProxy;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.mOutputFormat;
    }
}
