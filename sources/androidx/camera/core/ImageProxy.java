package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageProxy extends AutoCloseable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PlaneProxy {
        @NonNull
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    @NonNull
    Rect getCropRect();

    int getFormat();

    int getHeight();

    @Nullable
    @ExperimentalGetImage
    Image getImage();

    @NonNull
    ImageInfo getImageInfo();

    @NonNull
    @SuppressLint({"ArrayReturn"})
    PlaneProxy[] getPlanes();

    int getWidth();

    void setCropRect(@Nullable Rect rect);

    @NonNull
    default Bitmap toBitmap() {
        return ImageUtil.createBitmapFromImageProxy(this);
    }
}
