package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i11, @NonNull String str, @Nullable Throwable th2) {
        super(str, th2);
        this.mImageCaptureError = i11;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
