package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CheckedTextViewCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @Nullable
        public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @Nullable
        public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void setCheckMarkTintList(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void setCheckMarkTintMode(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private CheckedTextViewCompat() {
    }

    @Nullable
    public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @Nullable
    public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView checkedTextView) {
        return Api21Impl.getCheckMarkTintList(checkedTextView);
    }

    @Nullable
    public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView checkedTextView) {
        return Api21Impl.getCheckMarkTintMode(checkedTextView);
    }

    public static void setCheckMarkTintList(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
        Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
    }

    public static void setCheckMarkTintMode(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
        Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
    }
}
