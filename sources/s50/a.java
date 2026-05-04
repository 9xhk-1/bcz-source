package s50;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    public a() {
        throw new AssertionError();
    }

    public static float a(Context context, float f11) {
        return f11 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static InputMethodManager b(Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    public static void c(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            d(activity, decorView);
        }
    }

    public static void d(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        b(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void e(Context context, EditText editText) {
        if (context == null || editText == null) {
            return;
        }
        b(context).showSoftInput(editText, 1);
    }

    public static void f(Dialog dialog, EditText editText) {
        if (dialog == null || editText == null) {
            return;
        }
        dialog.getWindow().setSoftInputMode(4);
        editText.requestFocus();
    }
}
