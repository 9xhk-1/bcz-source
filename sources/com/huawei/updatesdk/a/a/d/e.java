package com.huawei.updatesdk.a.a.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.android.content.pm.ApplicationInfoEx;
import com.huawei.ohos.localability.BundleAdapter;
import com.huawei.ohos.localability.base.BundleInfo;
import com.huawei.ohos.localability.base.DeviceInfo;
import java.lang.reflect.Field;
import java.util.Optional;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f36815a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f36816b = false;

    public static PackageInfo a(PackageInfo packageInfo) {
        BundleInfo a11;
        if (d() && (a11 = a(packageInfo.packageName)) != null) {
            packageInfo.versionName = a11.getVersionName();
            packageInfo.versionCode = a11.getVersionCode();
            packageInfo.applicationInfo.targetSdkVersion = c(packageInfo.packageName);
            if (a11.isMultiFrameworkBundle()) {
                packageInfo.baseRevisionCode = packageInfo.versionCode;
            }
        }
        return packageInfo;
    }

    private static BundleInfo b(String str) {
        try {
            Optional bundleInfo = BundleAdapter.getBundleInfo(str, 0);
            if (bundleInfo.isPresent()) {
                return (BundleInfo) bundleInfo.get();
            }
            return null;
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "get BundleInfo exception, pkg:" + str + ", e:" + th2.getMessage());
            return null;
        }
    }

    public static int c(String str) {
        try {
            if (!d()) {
                return 0;
            }
            Pair sdkVersionInfo = BundleAdapter.getSdkVersionInfo(str);
            if (sdkVersionInfo != null) {
                return ((Integer) sdkVersionInfo.second).intValue();
            }
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "pair is null getHarmonySdkVersionInfo fail");
            return 0;
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "getHarmonySdkVersionInfo fail");
            return 0;
        }
    }

    private static boolean d() {
        if (!f36816b) {
            f36815a = a(com.huawei.updatesdk.a.b.a.a.c().a(), com.huawei.updatesdk.a.b.a.a.c().a().getPackageName()) && c();
            f36816b = true;
        }
        return f36815a;
    }

    private static BundleInfo a(String str) {
        if (d()) {
            return b(str);
        }
        return null;
    }

    public static String b() {
        DeviceInfo a11;
        return (d() && (a11 = a()) != null) ? a11.getDeviceType() : "";
    }

    private static boolean c() {
        try {
            new BundleAdapter();
            return true;
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "not Integrate HarmonySdk ");
            return false;
        }
    }

    public static boolean d(String str) {
        if (d() && !TextUtils.isEmpty(str)) {
            try {
                return BundleAdapter.isHarmonyApp(str);
            } catch (Throwable unused) {
                com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "get isHarmonyApp fail");
            }
        }
        return false;
    }

    private static DeviceInfo a() {
        try {
            return BundleAdapter.getDeviceInfo();
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("HarmonyDeviceInfo", "get DeviceInfo fail");
            return null;
        }
    }

    private static boolean a(Context context, String str) {
        Class<?> cls;
        Field declaredField;
        ApplicationInfo applicationInfo;
        try {
            cls = Class.forName("android.content.pm.AbsApplicationInfo");
            declaredField = cls.getDeclaredField("PARSE_IS_ZIDANE_APK");
            PackageInfo a11 = com.huawei.updatesdk.b.h.b.a(str, context);
            applicationInfo = a11 != null ? a11.applicationInfo : null;
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "isHarmonyByHwFlag exception for pkg: " + str + ", throwable : " + th2.getMessage());
        }
        if (applicationInfo != null) {
            int hwFlags = new ApplicationInfoEx(applicationInfo).getHwFlags();
            int i11 = declaredField.getInt(cls);
            boolean z11 = (hwFlags & i11) == i11;
            com.huawei.updatesdk.a.a.a.b("HarmonyUtils", "isHarmonyByHwFlag: " + z11 + ", packageName: " + str);
            return z11;
        }
        com.huawei.updatesdk.a.a.a.c("HarmonyUtils", "applicationInfo is null for pkg: " + str);
        return false;
    }
}
