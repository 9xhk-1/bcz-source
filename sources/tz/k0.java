package tz;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes8.dex */
public class k0 {
    public static Object a(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.get(str);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context) {
        Object a11 = a(context, "com.openinstall.APP_KEY");
        if (a11 == null) {
            return "";
        }
        try {
            return String.valueOf(a11);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(Context context) {
        Object a11 = a(context, "com.openinstall.ENCRYPT");
        if (a11 == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(String.valueOf(a11));
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean d(Context context) {
        Object a11 = a(context, "com.openinstall.PB_ENABLED");
        if (a11 == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(String.valueOf(a11));
        } catch (Exception unused) {
            return true;
        }
    }
}
