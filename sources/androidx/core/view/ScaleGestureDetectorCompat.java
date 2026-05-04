package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z11) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z11);
    }

    public static boolean isQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    public static void setQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z11) {
        scaleGestureDetector.setQuickScaleEnabled(z11);
    }
}
