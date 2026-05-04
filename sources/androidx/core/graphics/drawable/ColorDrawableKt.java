package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ColorDrawableKt {
    @k
    public static final ColorDrawable toDrawable(@ColorInt int i11) {
        return new ColorDrawable(i11);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @k
    public static final ColorDrawable toDrawable(@k Color color) {
        int argb;
        argb = color.toArgb();
        return new ColorDrawable(argb);
    }
}
