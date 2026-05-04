package sn;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class b {
    @Nullable
    public static TypedValue a(@NonNull Context context, @AttrRes int i11) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@NonNull Context context, @AttrRes int i11, boolean z11) {
        TypedValue a11 = a(context, i11);
        return (a11 == null || a11.type != 18) ? z11 : a11.data != 0;
    }

    public static boolean c(@NonNull Context context, @AttrRes int i11, @NonNull String str) {
        return g(context, i11, str) != 0;
    }

    @Px
    public static int d(@NonNull Context context, @AttrRes int i11, @DimenRes int i12) {
        TypedValue a11 = a(context, i11);
        return (int) ((a11 == null || a11.type != 5) ? context.getResources().getDimension(i12) : a11.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int e(@NonNull Context context, @AttrRes int i11, int i12) {
        TypedValue a11 = a(context, i11);
        return (a11 == null || a11.type != 16) ? i12 : a11.data;
    }

    @Px
    public static int f(@NonNull Context context) {
        return d(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int g(@NonNull Context context, @AttrRes int i11, @NonNull String str) {
        return i(context, i11, str).data;
    }

    public static int h(@NonNull View view, @AttrRes int i11) {
        return j(view, i11).data;
    }

    @NonNull
    public static TypedValue i(@NonNull Context context, @AttrRes int i11, @NonNull String str) {
        TypedValue a11 = a(context, i11);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }

    @NonNull
    public static TypedValue j(@NonNull View view, @AttrRes int i11) {
        return i(view.getContext(), i11, view.getClass().getCanonicalName());
    }
}
