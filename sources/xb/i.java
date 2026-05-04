package xb;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Window;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i {
    public i() {
        throw new AssertionError();
    }

    public static int a(Context context, float dp2) {
        return (int) TypedValue.applyDimension(1, dp2, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        return (context.getTheme() == null || !context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) ? a(context, 48.0f) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static Point c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f11 = displayMetrics.widthPixels;
        float f12 = displayMetrics.density;
        return new Point((int) ((f11 / f12) + 0.5d), (int) ((displayMetrics.heightPixels / f12) + 0.5d));
    }

    public static int d(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static Point e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int f(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    @TargetApi(11)
    public static boolean g(Window window) {
        return window.hasFeature(9);
    }

    public static boolean h(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean i(Context context) {
        return h(context) && j(context);
    }

    public static boolean j(Context context) {
        return context != null && (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static boolean k(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) == 4;
    }

    public static int l(Context context, int px2) {
        return (int) ((px2 / context.getResources().getDisplayMetrics().density) + 0.5d);
    }
}
