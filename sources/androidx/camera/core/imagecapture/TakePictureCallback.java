package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface TakePictureCallback {
    boolean isAborted();

    @MainThread
    void onCaptureFailure(@NonNull ImageCaptureException imageCaptureException);

    void onCaptureProcessProgressed(int i11);

    void onCaptureStarted();

    @MainThread
    void onFinalResult(@NonNull ImageCapture.OutputFileResults outputFileResults);

    @MainThread
    void onFinalResult(@NonNull ImageProxy imageProxy);

    @MainThread
    void onImageCaptured();

    void onPostviewBitmapAvailable(@NonNull Bitmap bitmap);

    @MainThread
    void onProcessFailure(@NonNull ImageCaptureException imageCaptureException);
}
