package en;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static final float f50036a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f50037b = 0.54f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f50038c = 0.38f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f50039d = 0.32f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f50040e = 0.12f;

    /* renamed from: f, reason: collision with root package name */
    public static final int f50041f = 40;

    /* renamed from: g, reason: collision with root package name */
    public static final int f50042g = 100;

    /* renamed from: h, reason: collision with root package name */
    public static final int f50043h = 90;

    /* renamed from: i, reason: collision with root package name */
    public static final int f50044i = 10;

    /* renamed from: j, reason: collision with root package name */
    public static final int f50045j = 94;

    /* renamed from: k, reason: collision with root package name */
    public static final int f50046k = 92;

    /* renamed from: l, reason: collision with root package name */
    public static final int f50047l = 80;

    /* renamed from: m, reason: collision with root package name */
    public static final int f50048m = 20;

    /* renamed from: n, reason: collision with root package name */
    public static final int f50049n = 30;

    /* renamed from: o, reason: collision with root package name */
    public static final int f50050o = 90;

    /* renamed from: p, reason: collision with root package name */
    public static final int f50051p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static final int f50052q = 17;

    /* renamed from: r, reason: collision with root package name */
    public static final int f50053r = 6;

    @ColorInt
    public static int a(@ColorInt int i11, @IntRange(from = 0, to = 255) int i12) {
        return ColorUtils.setAlphaComponent(i11, (Color.alpha(i11) * i12) / 255);
    }

    @ColorInt
    public static int b(@NonNull Context context, @AttrRes int i11, @ColorInt int i12) {
        Integer f11 = f(context, i11);
        return f11 != null ? f11.intValue() : i12;
    }

    @ColorInt
    public static int c(Context context, @AttrRes int i11, String str) {
        return w(context, sn.b.i(context, i11, str));
    }

    @ColorInt
    public static int d(@NonNull View view, @AttrRes int i11) {
        return w(view.getContext(), sn.b.j(view, i11));
    }

    @ColorInt
    public static int e(@NonNull View view, @AttrRes int i11, @ColorInt int i12) {
        return b(view.getContext(), i11, i12);
    }

    @Nullable
    @ColorInt
    public static Integer f(@NonNull Context context, @AttrRes int i11) {
        TypedValue a11 = sn.b.a(context, i11);
        if (a11 != null) {
            return Integer.valueOf(w(context, a11));
        }
        return null;
    }

    @ColorInt
    public static int g(@ColorInt int i11, @IntRange(from = 0, to = 100) int i12) {
        fn.l b11 = fn.l.b(i11);
        b11.j(i12);
        return b11.k();
    }

    @ColorInt
    public static int h(@ColorInt int i11, @IntRange(from = 0, to = 100) int i12, int i13) {
        fn.l b11 = fn.l.b(g(i11, i12));
        b11.g(i13);
        return b11.k();
    }

    @NonNull
    public static n i(@ColorInt int i11, boolean z11) {
        return z11 ? new n(g(i11, 40), g(i11, 100), g(i11, 90), g(i11, 10)) : new n(g(i11, 80), g(i11, 20), g(i11, 30), g(i11, 90));
    }

    @NonNull
    public static n j(@NonNull Context context, @ColorInt int i11) {
        return i(i11, r(context));
    }

    @NonNull
    public static ColorStateList k(@NonNull Context context, @AttrRes int i11, @NonNull ColorStateList colorStateList) {
        TypedValue a11 = sn.b.a(context, i11);
        ColorStateList x11 = a11 != null ? x(context, a11) : null;
        return x11 == null ? colorStateList : x11;
    }

    @Nullable
    public static ColorStateList l(@NonNull Context context, @AttrRes int i11) {
        TypedValue a11 = sn.b.a(context, i11);
        if (a11 == null) {
            return null;
        }
        int i12 = a11.resourceId;
        if (i12 != 0) {
            return ContextCompat.getColorStateList(context, i12);
        }
        int i13 = a11.data;
        if (i13 != 0) {
            return ColorStateList.valueOf(i13);
        }
        return null;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int m(@NonNull Context context, @ColorInt int i11) {
        return h(i11, r(context) ? 94 : 12, 6);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int n(@NonNull Context context, @ColorInt int i11) {
        return h(i11, r(context) ? 92 : 17, 6);
    }

    @ColorInt
    public static int o(@ColorInt int i11, @ColorInt int i12) {
        return fn.a.b(i11, i12);
    }

    @ColorInt
    public static int p(@NonNull Context context, @ColorInt int i11) {
        return o(i11, c(context, R.attr.colorPrimary, u.class.getCanonicalName()));
    }

    public static boolean q(@ColorInt int i11) {
        return i11 != 0 && ColorUtils.calculateLuminance(i11) > 0.5d;
    }

    public static boolean r(@NonNull Context context) {
        return sn.b.b(context, R.attr.isLightTheme, true);
    }

    @ColorInt
    public static int s(@ColorInt int i11, @ColorInt int i12) {
        return ColorUtils.compositeColors(i12, i11);
    }

    @ColorInt
    public static int t(@ColorInt int i11, @ColorInt int i12, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return s(i11, ColorUtils.setAlphaComponent(i12, Math.round(Color.alpha(i12) * f11)));
    }

    @ColorInt
    public static int u(@NonNull View view, @AttrRes int i11, @AttrRes int i12) {
        return v(view, i11, i12, 1.0f);
    }

    @ColorInt
    public static int v(@NonNull View view, @AttrRes int i11, @AttrRes int i12, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return t(d(view, i11), d(view, i12), f11);
    }

    public static int w(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i11 = typedValue.resourceId;
        return i11 != 0 ? ContextCompat.getColor(context, i11) : typedValue.data;
    }

    public static ColorStateList x(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i11 = typedValue.resourceId;
        return i11 != 0 ? ContextCompat.getColorStateList(context, i11) : ColorStateList.valueOf(typedValue.data);
    }
}
