package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class VelocityTrackerCompat {
    private static Map<VelocityTracker, VelocityTrackerFallback> sFallbackTrackers = Collections.synchronizedMap(new WeakHashMap());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static float getAxisVelocity(VelocityTracker velocityTracker, int i11, int i12) {
            return velocityTracker.getAxisVelocity(i11, i12);
        }

        @DoNotInline
        public static boolean isAxisSupported(VelocityTracker velocityTracker, int i11) {
            return velocityTracker.isAxisSupported(i11);
        }

        @DoNotInline
        public static float getAxisVelocity(VelocityTracker velocityTracker, int i11) {
            return velocityTracker.getAxisVelocity(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface VelocityTrackableMotionEventAxis {
    }

    private VelocityTrackerCompat() {
    }

    public static void addMovement(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!sFallbackTrackers.containsKey(velocityTracker)) {
                sFallbackTrackers.put(velocityTracker, new VelocityTrackerFallback());
            }
            sFallbackTrackers.get(velocityTracker).addMovement(motionEvent);
        }
    }

    public static void clear(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.clear();
        removeFallbackForTracker(velocityTracker);
    }

    public static void computeCurrentVelocity(@NonNull VelocityTracker velocityTracker, int i11, float f11) {
        velocityTracker.computeCurrentVelocity(i11, f11);
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            fallbackTrackerOrNull.computeCurrentVelocity(i11, f11);
        }
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i11);
        }
        if (i11 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i11 == 1) {
            return velocityTracker.getYVelocity();
        }
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            return fallbackTrackerOrNull.getAxisVelocity(i11);
        }
        return 0.0f;
    }

    @Nullable
    private static VelocityTrackerFallback getFallbackTrackerOrNull(VelocityTracker velocityTracker) {
        return sFallbackTrackers.get(velocityTracker);
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i11) {
        return velocityTracker.getXVelocity(i11);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i11) {
        return velocityTracker.getYVelocity(i11);
    }

    public static boolean isAxisSupported(@NonNull VelocityTracker velocityTracker, int i11) {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.isAxisSupported(velocityTracker, i11) : i11 == 26 || i11 == 0 || i11 == 1;
    }

    public static void recycle(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        removeFallbackForTracker(velocityTracker);
    }

    private static void removeFallbackForTracker(VelocityTracker velocityTracker) {
        sFallbackTrackers.remove(velocityTracker);
    }

    public static void computeCurrentVelocity(@NonNull VelocityTracker velocityTracker, int i11) {
        computeCurrentVelocity(velocityTracker, i11, Float.MAX_VALUE);
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i11, i12);
        }
        if (i11 == 0) {
            return velocityTracker.getXVelocity(i12);
        }
        if (i11 == 1) {
            return velocityTracker.getYVelocity(i12);
        }
        return 0.0f;
    }
}
