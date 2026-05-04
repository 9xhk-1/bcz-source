package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod;

    static {
        try {
            Class cls = Integer.TYPE;
            sNewInstanceMethod = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e11) {
            Log.i(TAG, "Unable to initialize via reflection.", e11);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i11, int i12) {
        Throwable th2 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) Preconditions.checkNotNull(sNewInstanceMethod.invoke(null, surface, Integer.valueOf(i11), Integer.valueOf(i12)));
            } catch (IllegalAccessException | InvocationTargetException e11) {
                th2 = e11;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th2);
    }
}
