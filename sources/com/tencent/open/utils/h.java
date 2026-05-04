package com.tencent.open.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.vivo.push.PushClientConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h {
    public static String a(Context context, String str, String str2) {
        if (context != null && str2 != null && str != null) {
            if ("com.tencent.mobileqq".equals(str2)) {
                return b(context, str, "com.tencent.mobileqq");
            }
            if (Constants.PACKAGE_TIM.equals(str2)) {
                return b(context, str, Constants.PACKAGE_TIM);
            }
        }
        return null;
    }

    private static String b(Context context, String str, String str2) {
        try {
            Cursor c11 = c(context, str, str2);
            if (c11 == null) {
                SLog.e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion null");
                return null;
            }
            if (c11.getCount() <= 0) {
                SLog.e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion empty");
                return null;
            }
            c11.moveToFirst();
            String string = c11.getString(0);
            c11.close();
            SLog.i("openSDK_LOG.OpenApiProviderUtils", "AppVersion: " + string);
            return a(string) ? string : "UNKNOWN";
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion exception: ", e11);
            return null;
        }
    }

    private static Cursor c(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            return context.getContentResolver().query(Uri.parse("content://" + str2 + ".openapi.provider/query_app_version?appid" + ContainerUtils.KEY_VALUE_DELIMITER + str + "&" + PushClientConstants.TAG_PKG_NAME + ContainerUtils.KEY_VALUE_DELIMITER + context.getPackageName()), new String[0], null, null, null);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.OpenApiProviderUtils", "query exception: ", e11);
            return null;
        }
    }

    private static boolean a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String[] split = str.split("\\.");
        if (split.length < 3) {
            return false;
        }
        for (String str2 : split) {
            try {
                Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }
}
