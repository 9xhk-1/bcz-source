package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R;
import sn.b;
import sn.c;
import zn.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean d(Context context) {
        return b.b(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    public static int e(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int g(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @StyleableRes int... iArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < iArr.length && i11 < 0; i12++) {
            i11 = c.d(context, typedArray, iArr[i12], -1);
        }
        return i11;
    }

    public static boolean h(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i11, i12);
        int g11 = g(context, obtainStyledAttributes, R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return g11 != -1;
    }

    public final void c(@NonNull Resources.Theme theme, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i11, R.styleable.MaterialTextAppearance);
        int g11 = g(getContext(), obtainStyledAttributes, R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (g11 >= 0) {
            setLineHeight(g11);
        }
    }

    public final void f(@Nullable AttributeSet attributeSet, int i11, int i12) {
        int e11;
        Context context = getContext();
        if (d(context)) {
            Resources.Theme theme = context.getTheme();
            if (h(context, theme, attributeSet, i11, i12) || (e11 = e(theme, attributeSet, i11, i12)) == -1) {
                return;
            }
            c(theme, e11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        if (d(context)) {
            c(context.getTheme(), i11);
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(a.c(context, attributeSet, i11, 0), attributeSet, i11);
        f(attributeSet, i11, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(a.c(context, attributeSet, i11, i12), attributeSet, i11);
        f(attributeSet, i11, i12);
    }
}
