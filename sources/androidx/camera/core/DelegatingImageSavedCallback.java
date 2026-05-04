package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DelegatingImageSavedCallback implements ImageCapture.OnImageSavedCallback {

    @m80.k
    private final AtomicReference<ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(@m80.k ImageCapture.OnImageSavedCallback delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this._delegate = new AtomicReference<>(delegate);
    }

    private final ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureProcessProgressed(int i11) {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i11);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureStarted() {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onError(@m80.k ImageCaptureException exception) {
        kotlin.jvm.internal.g0.p(exception, "exception");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(exception);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(@m80.k ImageCapture.OutputFileResults outputFileResults) {
        kotlin.jvm.internal.g0.p(outputFileResults, "outputFileResults");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(outputFileResults);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onPostviewBitmapAvailable(@m80.k Bitmap bitmap) {
        kotlin.jvm.internal.g0.p(bitmap, "bitmap");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
