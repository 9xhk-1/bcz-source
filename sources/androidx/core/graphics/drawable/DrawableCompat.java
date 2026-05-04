package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DrawableCompat {
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void applyTheme(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        public static boolean canApplyTheme(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        public static ColorFilter getColorFilter(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static void setHotspot(Drawable drawable, float f11, float f12) {
            drawable.setHotspot(f11, f12);
        }

        @DoNotInline
        public static void setHotspotBounds(Drawable drawable, int i11, int i12, int i13, int i14) {
            drawable.setHotspotBounds(i11, i12, i13, i14);
        }

        @DoNotInline
        public static void setTint(Drawable drawable, int i11) {
            drawable.setTint(i11);
        }

        @DoNotInline
        public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static int getLayoutDirection(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        public static boolean setLayoutDirection(Drawable drawable, int i11) {
            return drawable.setLayoutDirection(i11);
        }
    }

    private DrawableCompat() {
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        Api21Impl.applyTheme(drawable, theme);
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        return Api21Impl.canApplyTheme(drawable);
    }

    public static void clearColorFilter(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        return Api21Impl.getColorFilter(drawable);
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        return Api23Impl.getLayoutDirection(drawable);
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z11) {
        drawable.setAutoMirrored(z11);
    }

    public static void setHotspot(@NonNull Drawable drawable, float f11, float f12) {
        Api21Impl.setHotspot(drawable, f11, f12);
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i11, int i12, int i13, int i14) {
        Api21Impl.setHotspotBounds(drawable, i11, i12, i13, i14);
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i11) {
        return Api23Impl.setLayoutDirection(drawable, i11);
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i11) {
        Api21Impl.setTint(drawable, i11);
    }

    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        Api21Impl.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        Api21Impl.setTintMode(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable) {
        return drawable;
    }
}
