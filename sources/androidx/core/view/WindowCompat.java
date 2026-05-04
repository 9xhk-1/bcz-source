package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Api16Impl {
        private Api16Impl() {
        }

        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z11 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static <T> T requireViewById(Window window, int i11) {
            return (T) window.requireViewById(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
            window.setDecorFitsSystemWindows(z11);
        }
    }

    private WindowCompat() {
    }

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) Api28Impl.requireViewById(window, i11);
        }
        T t11 = (T) window.findViewById(i11);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setDecorFitsSystemWindows(window, z11);
        } else {
            Api16Impl.setDecorFitsSystemWindows(window, z11);
        }
    }
}
