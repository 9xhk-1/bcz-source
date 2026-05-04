package wq;

import android.app.UiModeManager;
import android.content.Context;
import com.huawei.android.app.PackageManagerEx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f96655a = -1;

    public static int a(Context context) {
        int i11 = f96655a;
        if (i11 >= 0) {
            return i11;
        }
        f96655a = f(context) ? 1 : g(context) ? 2 : d(context) ? 3 : b() ? 4 : e(context) ? 7 : 0;
        return f96655a;
    }

    public static boolean b() {
        return c("com.huawei.software.features.kidpad");
    }

    public static boolean c(String str) {
        try {
            return PackageManagerEx.hasHwSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean e(Context context) {
        return context.getPackageManager().hasSystemFeature("com.huawei.software.features.car");
    }

    public static boolean f(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4;
    }

    public static boolean g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
