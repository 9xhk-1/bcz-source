package zn;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f102778a = {R.attr.theme, com.google.android.material.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f102779b = {com.google.android.material.R.attr.materialThemeOverlay};

    @StyleRes
    public static int a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f102778a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @StyleRes
    public static int b(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f102779b, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context c(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        int b11 = b(context, attributeSet, i11, i12);
        boolean z11 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == b11;
        if (b11 == 0 || z11) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, b11);
        int a11 = a(context, attributeSet);
        if (a11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(a11, true);
        }
        return contextThemeWrapper;
    }
}
