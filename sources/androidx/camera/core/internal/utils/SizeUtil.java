package androidx.camera.core.internal.utils;

import android.support.v4.media.session.MediaSessionCompat;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import pd.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(MediaSessionCompat.K, 240);
    public static final Size RESOLUTION_VGA = new Size(640, 480);
    public static final Size RESOLUTION_480P = new Size(720, 480);
    public static final Size RESOLUTION_720P = new Size(1280, 720);
    public static final Size RESOLUTION_1080P = new Size(1920, a.f80340j);
    public static final Size RESOLUTION_1440P = new Size(1920, 1440);

    private SizeUtil() {
    }

    @Nullable
    public static <T> T findNearestHigherFor(@NonNull Size size, @NonNull TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry<Size, T> floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public static int getArea(int i11, int i12) {
        return i11 * i12;
    }

    @Nullable
    public static Size getMaxSize(@NonNull List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    public static boolean isLongerInAnyEdge(@NonNull Size size, @NonNull Size size2) {
        return size.getWidth() > size2.getWidth() || size.getHeight() > size2.getHeight();
    }

    public static boolean isSmallerByArea(@NonNull Size size, @NonNull Size size2) {
        return getArea(size) < getArea(size2);
    }

    public static int getArea(@NonNull Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }
}
