package sn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final float f88847a = 1.3f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f88848b = 2.0f;

    @Nullable
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateList;
    }

    @Nullable
    public static ColorStateList b(@NonNull Context context, @NonNull TintTypedArray tintTypedArray, @StyleableRes int i11) {
        int resourceId;
        ColorStateList colorStateList;
        return (!tintTypedArray.hasValue(i11) || (resourceId = tintTypedArray.getResourceId(i11, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i11) : colorStateList;
    }

    public static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i11, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i11, i12);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i12);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    public static Drawable e(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (drawable = AppCompatResources.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i11) : drawable;
    }

    public static float f(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @StyleableRes
    public static int g(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12) {
        return typedArray.hasValue(i11) ? i11 : i12;
    }

    @Nullable
    public static d h(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static int i(@NonNull Context context, @StyleRes int i11, int i12) {
        if (i11 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, R.styleable.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(R.styleable.TextAppearance_android_textSize, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i12;
    }

    public static boolean j(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean k(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
