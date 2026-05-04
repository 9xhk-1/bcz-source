package com.huawei.hms.support.api.pay.util;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class a {
    public static int a(@NonNull Intent intent, String str, int i11) {
        try {
            return intent.getIntExtra(str, i11);
        } catch (Throwable th2) {
            HMSLog.e("IntentUtils", "safeGetIntExtra failed, " + th2.getMessage());
            return i11;
        }
    }

    public static long a(@NonNull Intent intent, String str, long j11) {
        try {
            return intent.getLongExtra(str, j11);
        } catch (Throwable th2) {
            HMSLog.e("IntentUtils", "safeGetLongExtra failed, " + th2.getMessage());
            return j11;
        }
    }

    public static String a(@NonNull Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable th2) {
            HMSLog.e("IntentUtils", "safeGetStringExtra failed, " + th2.getMessage());
            return "";
        }
    }
}
