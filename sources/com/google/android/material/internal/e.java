package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31575a = 128;

    public static void a(@NonNull Window window, boolean z11) {
        b(window, z11, null, null);
    }

    public static void b(@NonNull Window window, boolean z11, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z12 = num == null || num.intValue() == 0;
        boolean z13 = num2 == null || num2.intValue() == 0;
        if (z12 || z13) {
            int b11 = en.u.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z12) {
                num = Integer.valueOf(b11);
            }
            if (z13) {
                num2 = Integer.valueOf(b11);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z11);
        int d11 = d(window.getContext(), z11);
        int c11 = c(window.getContext(), z11);
        window.setStatusBarColor(d11);
        window.setNavigationBarColor(c11);
        g(window, e(d11, en.u.q(num.intValue())));
        f(window, e(c11, en.u.q(num2.intValue())));
    }

    @TargetApi(21)
    public static int c(Context context, boolean z11) {
        if (z11 && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.setAlphaComponent(en.u.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z11) {
            return 0;
        }
        return en.u.b(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    public static int d(Context context, boolean z11) {
        if (z11) {
            return 0;
        }
        return en.u.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean e(int i11, boolean z11) {
        if (en.u.q(i11)) {
            return true;
        }
        return i11 == 0 && z11;
    }

    public static void f(@NonNull Window window, boolean z11) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z11);
    }

    public static void g(@NonNull Window window, boolean z11) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z11);
    }
}
