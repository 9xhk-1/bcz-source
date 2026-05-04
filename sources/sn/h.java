package sn;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class h {
    @Nullable
    public static Typeface a(@NonNull Context context, @NonNull Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    @Nullable
    public static Typeface b(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i11;
        int i12;
        int weight;
        int i13;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i11 = configuration.fontWeightAdjustment;
        if (i11 == Integer.MAX_VALUE) {
            return null;
        }
        i12 = configuration.fontWeightAdjustment;
        if (i12 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i13 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, MathUtils.clamp(weight + i13, 1, 1000), typeface.isItalic());
        return create;
    }
}
