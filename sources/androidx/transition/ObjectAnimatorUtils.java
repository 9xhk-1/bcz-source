package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class ObjectAnimatorUtils {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static <T, V> ObjectAnimator ofObject(T t11, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t11, property, (TypeConverter) null, path);
        }
    }

    private ObjectAnimatorUtils() {
    }

    public static <T> ObjectAnimator ofPointF(T t11, Property<T, PointF> property, Path path) {
        return Api21Impl.ofObject(t11, property, path);
    }
}
