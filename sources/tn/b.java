package tn;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import en.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean f90831a = true;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f90832b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f90833c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f90834d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f90835e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f90836f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f90837g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f90838h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f90839i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f90840j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f90841k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    @VisibleForTesting
    public static final String f90842l = b.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    @VisibleForTesting
    public static final String f90843m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static Drawable b(@NonNull Context context, @Px int i11) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(u.k(context, com.google.android.material.R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i11, i11, i11, i11));
        }
    }

    @NonNull
    public static ColorStateList a(@Nullable ColorStateList colorStateList) {
        if (f90831a) {
            int[] iArr = f90834d;
            return new ColorStateList(new int[][]{f90840j, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, f90836f), d(colorStateList, iArr), d(colorStateList, f90832b)});
        }
        int[] iArr2 = f90836f;
        int[] iArr3 = f90837g;
        int[] iArr4 = f90838h;
        int[] iArr5 = f90839i;
        int[] iArr6 = f90832b;
        int[] iArr7 = f90833c;
        int[] iArr8 = f90834d;
        int[] iArr9 = f90835e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f90840j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{d(colorStateList, iArr2), d(colorStateList, iArr3), d(colorStateList, iArr4), d(colorStateList, iArr5), 0, d(colorStateList, iArr6), d(colorStateList, iArr7), d(colorStateList, iArr8), d(colorStateList, iArr9), 0});
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable b(@NonNull Context context, @Px int i11) {
        return a.b(context, i11);
    }

    @ColorInt
    @TargetApi(21)
    public static int c(@ColorInt int i11) {
        return ColorUtils.setAlphaComponent(i11, Math.min(Color.alpha(i11) * 2, 255));
    }

    @ColorInt
    public static int d(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f90831a ? c(colorForState) : colorForState;
    }

    @NonNull
    public static ColorStateList e(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f90841k, 0)) != 0) {
            Log.w(f90842l, f90843m);
        }
        return colorStateList;
    }

    public static boolean f(@NonNull int[] iArr) {
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 : iArr) {
            if (i11 == 16842910) {
                z11 = true;
            } else if (i11 == 16842908 || i11 == 16842919 || i11 == 16843623) {
                z12 = true;
            }
        }
        return z11 && z12;
    }
}
