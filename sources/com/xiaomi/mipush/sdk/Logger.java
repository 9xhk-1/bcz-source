package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.dh;
import com.xiaomi.push.di;
import java.io.File;

/* loaded from: classes6.dex */
public class Logger {
    private static boolean sDisablePushLog = false;
    private static LoggerInterface sUserLogger;

    public static void disablePushFileLog(Context context) {
        sDisablePushLog = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        sDisablePushLog = false;
        setPushLog(context);
    }

    @Deprecated
    public static File getLogFile(String str) {
        return null;
    }

    public static LoggerInterface getUserLogger() {
        return sUserLogger;
    }

    private static boolean hasWritePermission(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        sUserLogger = loggerInterface;
        setPushLog(context);
    }

    public static void setPushLog(Context context) {
        boolean z11;
        boolean z12 = false;
        boolean z13 = sUserLogger != null;
        if (sDisablePushLog) {
            z11 = false;
        } else {
            z11 = hasWritePermission(context);
            z12 = z13;
        }
        com.xiaomi.channel.commonutils.logger.b.a(new dh(z12 ? sUserLogger : null, z11 ? di.a(context) : null));
    }

    @Deprecated
    public static void uploadLogFile(Context context, boolean z11) {
    }
}
