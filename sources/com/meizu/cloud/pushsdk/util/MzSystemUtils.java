package com.meizu.cloud.pushsdk.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class MzSystemUtils {
    private static final String PUSH_SERVICE_PROCESS_NAME = "mzservice_v1";
    private static final String TAG = "MzSystemUtils";
    private static int flymeVersion = -1;
    private static String sCharacteristics;

    public static boolean compareVersion(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            i11 = split[i12].length() - split2[i12].length();
            if (i11 != 0 || (i11 = split[i12].compareTo(split2[i12])) != 0) {
                break;
            }
        }
        if (i11 == 0) {
            i11 = split.length - split2.length;
        }
        return i11 >= 0;
    }

    public static String findReceiver(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent = new Intent(str);
                intent.setPackage(str2);
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                    return queryBroadcastReceivers.get(0).activityInfo.name;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getCurrentLanguage() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e11) {
            DebugLogger.e(TAG, "getCurrentLanguage error " + e11.getMessage());
            return null;
        }
    }

    public static String getDocumentsPath(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return "/storage/emulated/0/Android/data/" + context.getPackageName() + "/files/Documents";
    }

    public static int getFlymeVersion() {
        int i11 = flymeVersion;
        if (i11 > 0) {
            return i11;
        }
        try {
            try {
                int parseInt = Integer.parseInt(i.a("ro.build.flyme.version"));
                flymeVersion = parseInt;
                return parseInt;
            } catch (Exception unused) {
                String a11 = i.a("ro.flyme.version.id");
                if (TextUtils.isEmpty(a11)) {
                    a11 = i.a("ro.build.display.id");
                }
                int intValue = Integer.valueOf(a11.replace("Flyme", "").replace(" ", "").substring(0, 1)).intValue();
                flymeVersion = intValue;
                return intValue;
            }
        } catch (Exception e11) {
            DebugLogger.e(TAG, "getFlymeVersion error " + e11.getMessage());
            return -1;
        }
    }

    public static String getMzPushServicePackageName(Context context) {
        String packageName = context.getPackageName();
        try {
            String str = isWatch() ? PushConstants.WEARABLE_PUSH_PACKAGE_NAME : PushConstants.PUSH_PACKAGE_NAME;
            String servicesByPackageName = getServicesByPackageName(context, str);
            if (!TextUtils.isEmpty(servicesByPackageName)) {
                if (servicesByPackageName.contains(PUSH_SERVICE_PROCESS_NAME)) {
                    return str;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        DebugLogger.i(TAG, "start service package name " + packageName);
        return packageName;
    }

    public static String getNetWorkType(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null) {
                return "";
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return type != 1 ? type != 7 ? type != 9 ? "OTHER" : "ETHERNET" : "BLUETOOTH" : "WIFI";
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 18) {
                return "MOBILE_4G";
            }
            if (subtype == 20) {
                return "MOBILE_5G";
            }
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "MOBILE_2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "MOBILE_3G";
                case 13:
                    return "MOBILE_4G";
                default:
                    return "MOBILE_XG";
            }
        } catch (Exception e11) {
            DebugLogger.e(TAG, "Security exception checking connection: " + e11.getMessage());
            return "";
        }
    }

    public static String getProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                DebugLogger.i(TAG, "processName " + runningAppProcessInfo.processName);
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception e11) {
            DebugLogger.e(TAG, "getProcessName error " + e11.getMessage());
            return null;
        }
    }

    private static String getServicesByPackageName(Context context, String str) {
        ServiceInfo[] serviceInfoArr;
        try {
            serviceInfoArr = context.getPackageManager().getPackageInfo(str, 4).services;
        } catch (Exception unused) {
            serviceInfoArr = null;
        }
        if (serviceInfoArr == null) {
            return null;
        }
        for (ServiceInfo serviceInfo : serviceInfoArr) {
            if (PushConstants.MZ_PUSH_SERVICE_NAME.equals(serviceInfo.name)) {
                return serviceInfo.processName;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isBrandMeizu(android.content.Context r2) {
        /*
            java.lang.String r0 = "ro.meizu.product.model"
            java.lang.String r0 = com.meizu.cloud.pushsdk.b.i.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "ro.vendor.meizu.product.model"
            java.lang.String r0 = com.meizu.cloud.pushsdk.b.i.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "meizu"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "魅蓝"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "22c4185e"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            goto L36
        L35:
            r0 = 1
        L36:
            if (r0 != 0) goto L3f
            android.content.Context r2 = r2.getApplicationContext()
            com.meizu.cloud.pushsdk.a.a.b(r2)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.util.MzSystemUtils.isBrandMeizu(android.content.Context):boolean");
    }

    public static boolean isExistReceiver(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0 && !TextUtils.isEmpty(queryBroadcastReceivers.get(0).activityInfo.name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHuaWei() {
        DebugLogger.e(TAG, "huawei eui " + i.a(com.alipay.sdk.m.c.a.f10484a));
        return !TextUtils.isEmpty(r0);
    }

    public static boolean isIndiaLocal() {
        return "india".equals(i.a("ro.meizu.locale.region"));
    }

    public static boolean isInteractive(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService(c6.d.f8118j);
        if (powerManager == null) {
            return true;
        }
        try {
            return powerManager.isInteractive();
        } catch (Exception e11) {
            DebugLogger.e(TAG, "isScreenOn error " + e11.getMessage());
            return true;
        }
    }

    public static boolean isInternational() {
        if (com.meizu.cloud.pushsdk.b.a.a().f39382a) {
            return com.meizu.cloud.pushsdk.b.a.a().f39383b.booleanValue();
        }
        return false;
    }

    public static boolean isMeizu(Context context) {
        return isBrandMeizu(context);
    }

    public static boolean isMeizuAndFlyme() {
        if (com.meizu.cloud.pushsdk.b.a.b().f39382a) {
            return !r0.f39383b.booleanValue();
        }
        return false;
    }

    public static boolean isOverseas() {
        return isInternational() || isIndiaLocal();
    }

    public static boolean isPackageInstalled(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isRunningProcess(Context context, String str) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            boolean z11 = false;
            if (activityManager == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
            while (it.hasNext() && !(z11 = it.next().processName.contains(str))) {
            }
            DebugLogger.i(TAG, str + " is running " + z11);
            return z11;
        } catch (Exception unused) {
            DebugLogger.e(TAG, "can not get running process info so set running true");
            return true;
        }
    }

    public static boolean isWatch() {
        if (TextUtils.isEmpty(sCharacteristics)) {
            sCharacteristics = i.a("ro.build.characteristics");
        }
        if (!TextUtils.isEmpty(sCharacteristics)) {
            return sCharacteristics.contains("watch");
        }
        sCharacteristics = "phone";
        return false;
    }

    public static boolean isXiaoMi() {
        return "Xiaomi".equals(Build.MODEL) || "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static void sendMessageFromBroadcast(Context context, Intent intent, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        String findReceiver = findReceiver(context, str, str2);
        if (!TextUtils.isEmpty(findReceiver)) {
            intent.setClassName(str2, findReceiver);
        }
        context.sendBroadcast(intent);
    }

    public static String getAppVersionName(Context context, String str) {
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            if (str2 != null) {
                if (str2.length() > 0) {
                    return str2;
                }
            }
            return "";
        } catch (Exception e11) {
            DebugLogger.e(TAG, "Exception message " + e11.getMessage());
            return "";
        }
    }
}
