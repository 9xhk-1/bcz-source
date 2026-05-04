package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import androidx.databinding.BindingConversion;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Converters {
    @BindingConversion
    public static ColorStateList convertColorToColorStateList(int i11) {
        return ColorStateList.valueOf(i11);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int i11) {
        return new ColorDrawable(i11);
    }
}
