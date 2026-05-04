package zb;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.google.android.material.timepicker.TimeModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import qb.c;
import zb.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102476a = "StatusBarUtil";

    /* renamed from: b, reason: collision with root package name */
    public static b f102477b;

    public static boolean a(Window window, boolean dark) {
        if (window == null) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i11 = declaredField.getInt(null);
            int i12 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, dark ? i12 | i11 : (~i11) & i12);
            window.setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Window window, boolean dark) {
        if (Build.MANUFACTURER.toLowerCase().contains("xiaomi")) {
            return c(window, dark);
        }
        return false;
    }

    public static boolean c(Window window, boolean dark) {
        try {
            if (dark) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                return true;
            }
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
            return true;
        } catch (Exception e11) {
            c.c(f102476a, "", e11);
            return false;
        }
    }

    public static boolean d(Window window, boolean dark) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i11 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (dark) {
                    method.invoke(window, Integer.valueOf(i11), Integer.valueOf(i11));
                    return true;
                }
                method.invoke(window, 0, Integer.valueOf(i11));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void e(Activity activity, int type) {
        if (type == 1) {
            b(activity.getWindow(), false);
        } else if (type == 2) {
            a(activity.getWindow(), false);
        } else if (type == 3) {
            activity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
    }

    public static int f(Activity activity, boolean dark) {
        if (b(activity.getWindow(), dark)) {
            return 1;
        }
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i11 = dark ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
        if (i11 == systemUiVisibility) {
            return 3;
        }
        decorView.setSystemUiVisibility(i11);
        return 3;
    }

    public static void g(Activity activity, int type) {
        View decorView;
        int systemUiVisibility;
        int systemUiVisibility2;
        if (type == 1) {
            b(activity.getWindow(), true);
            return;
        }
        if (type == 2) {
            a(activity.getWindow(), true);
        } else {
            if (type != 3 || (systemUiVisibility2 = (systemUiVisibility = (decorView = activity.getWindow().getDecorView()).getSystemUiVisibility()) | 8192) == systemUiVisibility) {
                return;
            }
            decorView.setSystemUiVisibility(systemUiVisibility2);
        }
    }

    public static int h(Activity activity, boolean light) {
        return i(activity, light, true);
    }

    public static int i(Activity activity, boolean light, boolean setIfAny) {
        return Build.MANUFACTURER.toLowerCase().contains("xiaomi") ? l(activity, light, setIfAny) : l(activity, light, setIfAny);
    }

    public static int j(Activity activity) {
        Resources resources = activity.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier(b.C1392b.f102487j, "dimen", "android"));
        c.i(f102476a, "getStatusBarDpHeight: %d", Integer.valueOf(dimensionPixelSize));
        return (int) (dimensionPixelSize / resources.getDisplayMetrics().density);
    }

    public static int k(Activity activity) {
        Resources resources = activity.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier(b.C1392b.f102487j, "dimen", "android"));
        c.i("", TimeModel.f32588i, Integer.valueOf(dimensionPixelSize));
        return dimensionPixelSize;
    }

    @RequiresApi(api = 23)
    public static int l(Activity activity, boolean light, boolean setIfAny) {
        if (!setIfAny) {
            return -1;
        }
        Window window = activity.getWindow();
        if (window == null) {
            c.d(f102476a, "window null!", new Object[0]);
        } else if (light) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        }
        return 0;
    }

    public static void m(Activity activity, boolean flag_fullscreen) {
        b bVar;
        View childAt = ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
        if (flag_fullscreen) {
            activity.getWindow().addFlags(1024);
        } else {
            activity.getWindow().clearFlags(1024);
        }
        if (childAt == null || (bVar = f102477b) == null) {
            return;
        }
        if (flag_fullscreen) {
            bVar.m(false);
        } else {
            bVar.m(true);
        }
    }

    public static void n(Activity activity, int colorId) {
        p(activity);
        View childAt = ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(true);
        }
        b bVar = new b(activity);
        f102477b = bVar;
        bVar.m(true);
        f102477b.k(colorId);
    }

    public static void o(Activity activity, boolean navigationBarState) {
        Window window = activity.getWindow();
        if (!navigationBarState) {
            window.getDecorView().setSystemUiVisibility(0);
            return;
        }
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(5634);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    public static void p(Activity activity) {
        activity.getWindow().setFlags(67108864, 67108864);
    }
}
