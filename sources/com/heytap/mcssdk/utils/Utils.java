package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.heytap.mcssdk.PushService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Utils {
    public static String getString(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 : iArr) {
            sb2.append((char) i11);
        }
        return sb2.toString();
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e11) {
            LogUtil.d("getVersionCode--Exception:" + e11.getMessage());
            return 0;
        }
    }

    public static String getVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e11) {
            LogUtil.d("getVersionName--Exception:" + e11.getMessage());
            return null;
        }
    }

    public static boolean isExistPackage(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            LogUtil.e("isExistPackage NameNotFoundException:" + e11.getMessage());
            return false;
        }
    }

    public static boolean isSupportPush(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e11) {
            LogUtil.e("isSupportPush NameNotFoundException:" + e11.getMessage());
            applicationInfo = null;
        }
        return applicationInfo != null && applicationInfo.metaData.getBoolean(str2, false);
    }

    public static boolean isSupportPushByClient(Context context) {
        return PushService.getInstance().isSupportPushByClient(context);
    }

    public static int parseInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e11) {
            LogUtil.e("parseInt--NumberFormatException" + e11.getMessage());
            return -1;
        }
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e11) {
            LogUtil.d("getVersionCode--Exception:" + e11.getMessage());
            return 0;
        }
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e11) {
            LogUtil.d("getVersionName--Exception:" + e11.getMessage());
            return "0";
        }
    }
}
