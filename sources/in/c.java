package in;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.internal.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class c {
    @NonNull
    public static Rect a(@NonNull Context context, @AttrRes int i11, int i12) {
        TypedArray k11 = d0.k(context, null, R.styleable.MaterialAlertDialog, i11, i12, new int[0]);
        int dimensionPixelSize = k11.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = k11.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = k11.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = k11.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        k11.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @NonNull
    public static InsetDrawable b(@Nullable Drawable drawable, @NonNull Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
