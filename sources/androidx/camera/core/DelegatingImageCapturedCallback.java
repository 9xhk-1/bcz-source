package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DelegatingImageCapturedCallback extends ImageCapture.OnImageCapturedCallback {

    @m80.k
    private final AtomicReference<ImageCapture.OnImageCapturedCallback> _delegate;

    public DelegatingImageCapturedCallback(@m80.k ImageCapture.OnImageCapturedCallback delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this._delegate = new AtomicReference<>(delegate);
    }

    private final ImageCapture.OnImageCapturedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureProcessProgressed(int i11) {
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i11);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureStarted() {
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureSuccess(@m80.k ImageProxy imageProxy) {
        kotlin.jvm.internal.g0.p(imageProxy, "imageProxy");
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureSuccess(imageProxy);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onError(@m80.k ImageCaptureException exception) {
        kotlin.jvm.internal.g0.p(exception, "exception");
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(exception);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onPostviewBitmapAvailable(@m80.k Bitmap bitmap) {
        kotlin.jvm.internal.g0.p(bitmap, "bitmap");
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
