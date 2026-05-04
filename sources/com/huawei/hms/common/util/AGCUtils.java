package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.xiaomi.mipush.sdk.Constants;
import mq.d;
import mq.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AGCUtils {
    /* JADX WARN: Removed duplicated region for block: B:6:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "Get "
            java.lang.String r1 = "AGCUtils"
            java.lang.String r2 = ""
            r3 = 0
            mq.f r4 = new mq.f     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            java.lang.String r6 = "agconnect-services.json"
            java.io.InputStream r3 = r5.open(r6)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            r4.n(r3)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            mq.e r7 = r4.a(r7)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            java.lang.String r7 = r7.getString(r8)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            goto L63
        L26:
            r7 = move-exception
            goto L87
        L28:
            r7 = move-exception
            goto L2c
        L2a:
            r7 = move-exception
            goto L48
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = " with AGConnectServicesConfig failed: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.support.log.HMSLog.e(r1, r7)     // Catch: java.lang.Throwable -> L26
        L46:
            r7 = r2
            goto L63
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = " failed: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.support.log.HMSLog.e(r1, r7)     // Catch: java.lang.Throwable -> L26
            goto L46
        L63:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L6d
            return r7
        L6d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = " is null."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r7)
            return r2
        L87:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            return valueOf.startsWith("cpid=") ? valueOf.substring(5) : valueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e11) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e11);
            return "";
        }
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) {
        String str;
        if (context == null) {
            HMSLog.w("AGCUtils", "getAppId context is null");
            return "";
        }
        if (c(context)) {
            str = a(context, "client/app_id");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            str = null;
        }
        try {
            d d11 = d.d();
            if (d11.b() != context) {
                d11 = d.a(new f().a(context));
            }
            str = d11.f().getString("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a11 = a(context);
        return !TextUtils.isEmpty(a11) ? a11 : a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        String str;
        if (context == null) {
            HMSLog.w("AGCUtils", "getCpId context is null");
            return "";
        }
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        try {
            d d11 = d.d();
            if (d11.b() != context) {
                d11 = d.a(new f().a(context));
            }
            str = d11.f().getString("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b11 = b(context);
        return !TextUtils.isEmpty(b11) ? b11 : a(context, "client/cp_id");
    }

    private static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get(Constants.HUAWEI_HMS_CLIENT_APPID)) != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
            }
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e11) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e11);
            return "";
        }
    }
}
