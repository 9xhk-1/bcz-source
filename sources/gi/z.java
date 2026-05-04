package gi;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class z {
    public static boolean a(Context context) {
        return b(context) || c(context) || d(context);
    }

    public static boolean b(Context context) {
        try {
            try {
                try {
                    Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                    return ((Boolean) loadClass.getMethod("hasNotchInScreen", null).invoke(loadClass, null)).booleanValue();
                } catch (NoSuchMethodException unused) {
                    qb.c.d("test", "hasNotchInScreen NoSuchMethodException", new Object[0]);
                    return false;
                }
            } catch (ClassNotFoundException unused2) {
                qb.c.d("test", "hasNotchInScreen ClassNotFoundException", new Object[0]);
                return false;
            } catch (Exception unused3) {
                qb.c.d("test", "hasNotchInScreen Exception", new Object[0]);
                return false;
            }
        } catch (Throwable unused4) {
            return false;
        }
    }

    public static boolean c(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        try {
            try {
                try {
                    Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
                    return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
                } catch (NoSuchMethodException unused) {
                    qb.c.d("test", "hasNotchInScreen NoSuchMethodException", new Object[0]);
                    return false;
                }
            } catch (ClassNotFoundException unused2) {
                qb.c.d("test", "hasNotchInScreen ClassNotFoundException", new Object[0]);
                return false;
            } catch (Exception unused3) {
                qb.c.d("test", "hasNotchInScreen Exception", new Object[0]);
                return false;
            }
        } catch (Throwable unused4) {
            return false;
        }
    }
}
