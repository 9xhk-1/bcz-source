package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class t {
    public static void a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                DrawableCompat.setTintList(drawable, colorStateList);
            } else {
                DrawableCompat.setTintList(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType b(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 5 ? i11 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static int[] c(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public static void d(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        DrawableCompat.setTintList(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void f(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z11 = onLongClickListener != null;
        boolean z12 = hasOnClickListeners || z11;
        checkableImageButton.setFocusable(z12);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z11);
        ViewCompat.setImportantForAccessibility(checkableImageButton, z12 ? 1 : 2);
    }

    public static void g(@NonNull CheckableImageButton checkableImageButton, @Px int i11) {
        checkableImageButton.setMinimumWidth(i11);
        checkableImageButton.setMinimumHeight(i11);
    }

    public static void h(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    public static void i(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    public static void j(@NonNull CheckableImageButton checkableImageButton, @NonNull ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    public static void e(@NonNull CheckableImageButton checkableImageButton) {
    }
}
