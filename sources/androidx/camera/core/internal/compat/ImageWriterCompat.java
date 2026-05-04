package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(@NonNull ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    @NonNull
    public static Image dequeueInputImage(@NonNull ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i11, i12);
        }
        if (i13 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i11, i12);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i13 + ". Version 26 or higher required.");
    }

    public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i11) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i11);
    }
}
