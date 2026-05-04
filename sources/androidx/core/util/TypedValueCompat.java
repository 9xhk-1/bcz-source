package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static float deriveDimension(int i11, float f11, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i11, f11, displayMetrics);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i11, float f11, @NonNull DisplayMetrics displayMetrics) {
        float f12;
        float f13;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i11, f11, displayMetrics);
        }
        if (i11 == 0) {
            return f11;
        }
        if (i11 == 1) {
            float f14 = displayMetrics.density;
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return f11 / f14;
        }
        if (i11 == 2) {
            float f15 = displayMetrics.scaledDensity;
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return f11 / f15;
        }
        if (i11 == 3) {
            float f16 = displayMetrics.xdpi;
            if (f16 == 0.0f) {
                return 0.0f;
            }
            f12 = f11 / f16;
            f13 = INCHES_PER_PT;
        } else {
            if (i11 == 4) {
                float f17 = displayMetrics.xdpi;
                if (f17 == 0.0f) {
                    return 0.0f;
                }
                return f11 / f17;
            }
            if (i11 != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i11);
            }
            float f18 = displayMetrics.xdpi;
            if (f18 == 0.0f) {
                return 0.0f;
            }
            f12 = f11 / f18;
            f13 = INCHES_PER_MM;
        }
        return f12 / f13;
    }

    public static float dpToPx(float f11, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f11, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i11) {
        return i11 & 15;
    }

    public static float pxToDp(float f11, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(1, f11, displayMetrics);
    }

    public static float pxToSp(float f11, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(2, f11, displayMetrics);
    }

    public static float spToPx(float f11, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f11, displayMetrics);
    }
}
