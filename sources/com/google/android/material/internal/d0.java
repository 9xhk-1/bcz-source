package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f31572b = "Theme.AppCompat";

    /* renamed from: d, reason: collision with root package name */
    public static final String f31574d = "Theme.MaterialComponents";

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f31571a = {R.attr.colorPrimary};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f31573c = {R.attr.colorPrimaryVariant};

    public static void a(@NonNull Context context) {
        e(context, f31571a, f31572b);
    }

    public static void b(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i11, i12);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@NonNull Context context) {
        e(context, f31573c, f31574d);
    }

    public static void d(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @Nullable @StyleableRes int... iArr2) {
        boolean z11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i11, i12);
        if (!obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z11 = obtainStyledAttributes.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z11 = g(context, attributeSet, iArr, i11, i12, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z11) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (j(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(@NonNull Context context) {
        return j(context, f31571a);
    }

    public static boolean g(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @NonNull @StyleableRes int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        for (int i13 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i13, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@NonNull Context context) {
        return sn.b.b(context, R.attr.isMaterial3Theme, false);
    }

    public static boolean i(@NonNull Context context) {
        return j(context, f31573c);
    }

    public static boolean j(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!obtainStyledAttributes.hasValue(i11)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray k(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @StyleableRes int... iArr2) {
        b(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    public static TintTypedArray l(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @StyleableRes int... iArr2) {
        b(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, i12);
    }
}
