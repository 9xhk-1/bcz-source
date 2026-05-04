package ft;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {
    public static int a(View view) {
        return b(view, false);
    }

    public static int b(View view, boolean z11) {
        if (view == null) {
            return 0;
        }
        return n(view) ? z11 ? view.getLeft() + g(view) : view.getLeft() : z11 ? view.getRight() - g(view) : view.getRight();
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
    }

    public static int e(View view) {
        if (view == null) {
            return 0;
        }
        return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    public static int f(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public static int g(View view) {
        if (view == null) {
            return 0;
        }
        return ViewCompat.getPaddingEnd(view);
    }

    public static int h(View view) {
        if (view == null) {
            return 0;
        }
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int i(View view) {
        if (view == null) {
            return 0;
        }
        return ViewCompat.getPaddingStart(view);
    }

    public static int j(View view) {
        return k(view, false);
    }

    public static int k(View view, boolean z11) {
        if (view == null) {
            return 0;
        }
        return n(view) ? z11 ? view.getRight() - i(view) : view.getRight() : z11 ? view.getLeft() + i(view) : view.getLeft();
    }

    public static int l(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public static int m(View view) {
        return l(view) + d(view);
    }

    public static boolean n(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }
}
