package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PathInterpolatorCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static Interpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }

        @DoNotInline
        public static Interpolator createPathInterpolator(float f11, float f12) {
            return new PathInterpolator(f11, f12);
        }

        @DoNotInline
        public static Interpolator createPathInterpolator(float f11, float f12, float f13, float f14) {
            return new PathInterpolator(f11, f12, f13, f14);
        }
    }

    private PathInterpolatorCompat() {
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return Api21Impl.createPathInterpolator(path);
    }

    @NonNull
    public static Interpolator create(float f11, float f12) {
        return Api21Impl.createPathInterpolator(f11, f12);
    }

    @NonNull
    public static Interpolator create(float f11, float f12, float f13, float f14) {
        return Api21Impl.createPathInterpolator(f11, f12, f13, f14);
    }
}
