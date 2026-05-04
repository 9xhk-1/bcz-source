package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageReaderProxy {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnImageAvailableListener {
        void onImageAvailable(@NonNull ImageReaderProxy imageReaderProxy);
    }

    @Nullable
    ImageProxy acquireLatestImage();

    @Nullable
    ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    @Nullable
    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(@NonNull OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor);
}
