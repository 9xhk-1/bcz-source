package com.huawei.hms.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import ct.d;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SystemUtils {
    public static final String PRODUCT_BRAND = "ro.product.brand";
    public static final String PRODUCT_HONOR = "HONOR";
    public static final String PRODUCT_HUAWEI = "HUAWEI";
    public static final String UNKNOWN = "unknown";

    private static String a() {
        return getSystemProperties("ro.product.locale", "");
    }

    private static String b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getAndoridVersion() {
        return getSystemProperties("ro.build.version.release", "unknown");
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : "";
    }

    public static String getManufacturer() {
        return getSystemProperties("ro.product.manufacturer", "unknown");
    }

    public static long getMegabyte(double d11) {
        double d12 = Build.VERSION.SDK_INT > 25 ? 1000.0d : 1024.0d;
        return (long) (d11 * d12 * d12);
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? "" : activeNetworkInfo.getTypeName();
    }

    public static String getPhoneModel() {
        return getSystemProperties("ro.product.model", "unknown");
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod(d.f46852f, String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    @Deprecated
    public static boolean isChinaROM() {
        String b11 = b();
        if (!TextUtils.isEmpty(b11)) {
            return AdvanceSetting.CLEAR_NOTIFICATION.equalsIgnoreCase(b11);
        }
        String a11 = a();
        if (!TextUtils.isEmpty(a11)) {
            return a11.toLowerCase(Locale.US).contains(AdvanceSetting.CLEAR_NOTIFICATION);
        }
        String localCountry = getLocalCountry();
        if (TextUtils.isEmpty(localCountry)) {
            return false;
        }
        return AdvanceSetting.CLEAR_NOTIFICATION.equalsIgnoreCase(localCountry);
    }

    public static boolean isEMUI() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is Emui :");
        int i11 = HwBuildEx.VERSION.EMUI_SDK_INT;
        sb2.append(i11);
        HMSLog.i("SystemUtils", sb2.toString());
        return i11 > 0;
    }

    public static boolean isHuawei() {
        String systemProperties = getSystemProperties(PRODUCT_BRAND, "unknown");
        return PRODUCT_HUAWEI.equalsIgnoreCase(systemProperties) || PRODUCT_HONOR.equalsIgnoreCase(systemProperties);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isSystemApp(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            java.lang.String r1 = "SystemUtils"
            if (r3 != 0) goto Lb
            java.lang.String r3 = "isSystemApp context is null"
            com.huawei.hms.support.log.HMSLog.w(r1, r3)
            return r0
        Lb:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.RuntimeException -> L16 android.util.AndroidException -> L18
            r2 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: java.lang.RuntimeException -> L16 android.util.AndroidException -> L18
            goto L44
        L16:
            r3 = move-exception
            goto L1a
        L18:
            r3 = move-exception
            goto L2f
        L1a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "isSystemApp RuntimeException:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r3)
            goto L43
        L2f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "isSystemApp Exception: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r3)
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L4f
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo
            int r3 = r3.flags
            r4 = 1
            r3 = r3 & r4
            if (r3 <= 0) goto L4f
            r0 = r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.android.SystemUtils.isSystemApp(android.content.Context, java.lang.String):boolean");
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", "default").equalsIgnoreCase("tv");
    }
}
